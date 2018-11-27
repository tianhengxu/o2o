package dao;

import model.Area;

import java.util.List;

/**
 * Created by sky on 2018/11/8.
 */
public interface AreaDao {
    /**
     * @return List
     */
    /*
    列出区域列表
     */
    List<Area> queryArea();
}
