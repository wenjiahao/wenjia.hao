package wen.jia.hao.Dao;

import wen.jia.hao.entity.Sale;

import java.util.List;
import java.util.Map;

/**
 * @author wenjia.hao
 * @version 1.0
 * @Since 2016/7/28.
 */
public interface AcountDao {
    public List<Sale> findAll(Map<String,Object> param);
    public Integer insert(Sale sale);
    public Integer findStock();
    public void sleepSecond(int sec);
}
