package com.java.o2o;


import com.BaseTest;
import dao.AreaDao;
import model.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.AreaService;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by sky on 2018/11/8.
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;
    @Autowired
    private AreaService areaService;
    @Test
    public  void testQueryArea(){
        List<Area> list=areaService.queryArea();
        assertEquals(2,list.size());
    }

}
