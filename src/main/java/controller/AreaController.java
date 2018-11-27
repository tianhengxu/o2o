package controller;

import model.Area;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AreaService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sky on 2018/11/13.
 */
@Controller
@RequestMapping("/test")
public class AreaController  {
    @Autowired
    private AreaService areaService;
    @RequestMapping(value = "/listArea",method={ RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    private Map<String ,Object> listArea(){
        Logger logger= LoggerFactory.getLogger(this.getClass());
        Map<String,Object> modelMap= new HashMap<String,Object>();
        List<Area> list=new ArrayList<Area>();
        logger.info("=====start=====");
        Long startTime=System.currentTimeMillis();
        try {
            list=areaService.queryArea();
            modelMap.put("rows",list);
            modelMap.put("total",list.size());
        }catch (Exception e){
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());
        }
        Long endTime=System.currentTimeMillis();
        logger.error("test Error");
        logger.debug("constTime:[{}ms]",endTime-startTime);
        logger.info("====end====");
        return  modelMap;

    }
}
