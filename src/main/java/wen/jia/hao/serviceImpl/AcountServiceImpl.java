package wen.jia.hao.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import wen.jia.hao.Dao.AcountDao;
import wen.jia.hao.entity.Sale;
import wen.jia.hao.service.AcountService;

import java.util.List;

/**
 * Created by 郝文佳 on 2016/4/6.
 */
@Service
public class AcountServiceImpl implements AcountService {

    @Autowired
    private AcountDao acountDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void AcountTransfer() {
        System.out.println("rrrrr");

    }
}
