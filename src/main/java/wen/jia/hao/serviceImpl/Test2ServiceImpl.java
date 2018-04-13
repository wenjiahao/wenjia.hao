package wen.jia.hao.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import wen.jia.hao.Dao.Test2Dao;
import wen.jia.hao.Dao.Test3Dao;
import wen.jia.hao.entity.Test2Entity;

/**
 * @author wenjia.hao
 * @version 1.0
 * @Since 2016/8/7.
 */
@Service
public class Test2ServiceImpl {

    @Autowired
    private Test2Dao test2Dao;
    @Autowired
    private Test3Dao test3Dao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void test2() {
        Test2Entity test2Entity = new Test2Entity();
        test2Entity.setAge2("222");
        test2Entity.setName2("ceshi2");
        test2Dao.insert(test2Entity);
    }
}
