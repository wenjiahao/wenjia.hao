package wen.jia.hao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.context.request.async.WebAsyncTask;
import org.springframework.web.multipart.MultipartFile;
import wen.jia.hao.entity.Sale;
import wen.jia.hao.service.AcountService;
import wen.jia.hao.service.DeferedService;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2016/6/22 0022.
 */
@Controller
public class MyController {

    @Autowired
    DeferedService deferedService;
    ExecutorService executorService= Executors.newCachedThreadPool();

    @RequestMapping(value = "sb.action", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public DeferredResult<String> sb(String www) throws IOException {
        System.out.println("进入方法");
      final  DeferredResult<String> deferredResult=new DeferredResult<>(30000L,null);
        deferedService.asyncWatch(deferredResult);
        System.out.println("结束方法");
        return deferredResult;
    }

    @RequestMapping(value = "stopThread.action")
    @ResponseBody
    public String stopThread() {
        deferedService.stopThead();
        return "OK";
    }
    @RequestMapping(value = "startThread.action")
    @ResponseBody
    public String startThread() {
        deferedService.startThread();
        return "OK";
    }
    @RequestMapping(value = "syncAction.action")
    @ResponseBody
    public WebAsyncTask syncAction(){
        System.err.println("进入方法");
        WebAsyncTask<String>   webAsyncTask=new WebAsyncTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                deferedService.sleepSecond();
                return "库存";
            }
        });
           System.out.println("结束方法");
           return webAsyncTask;
    }
}
