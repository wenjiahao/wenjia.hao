package wen.jia.hao.service;

import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by 1115012105001 on 2017/1/11.
 */
public interface DeferedService {
    public void asyncWatch(DeferredResult<String> result);
    public void stopThead();
    public void startThread();

    public void sleepSecond();

}
