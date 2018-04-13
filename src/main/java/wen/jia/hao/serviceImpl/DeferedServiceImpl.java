package wen.jia.hao.serviceImpl;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;
import wen.jia.hao.Dao.AcountDao;
import wen.jia.hao.service.DeferedService;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 1115012105001 on 2017/1/11.
 */
@Service
public class DeferedServiceImpl implements DeferedService {

    private ConcurrentLinkedQueue<DeferredResult<String>> asyncLindedQueue=new ConcurrentLinkedQueue<>();
    @Autowired
    private AcountDao acountDao;
    private Integer internal=1000;
    private ExecutorService executorService= Executors.newCachedThreadPool();

    private Thread thread;

    private volatile boolean flag=true;

     private void  whileStock(){
      acountDao.sleepSecond(2);
         /*if(Integer.valueOf(0).equals(stock)){
             //监控到库存没了
             Iterator<DeferredResult<String>> iterator = asyncLindedQueue.iterator();
             while (iterator.hasNext()){
                 DeferredResult<String> next = iterator.next();
                 next.setResult("stock is over");
                 iterator.remove();
             }
         }*/
     }


    @Override
    public void asyncWatch(DeferredResult<String> result) {
         asyncLindedQueue.add(result);
    }

    @Override
    public void stopThead() {
        flag=false;
        thread.interrupt();
    }

    @Override
    public void startThread() {
        Map<String,Object> map= Maps.newHashMap();
        map.put("currentDate",new Date());
        acountDao.findAll(map);


    }

    @Override
    public void sleepSecond() {
        acountDao.sleepSecond(1);
    }

}
