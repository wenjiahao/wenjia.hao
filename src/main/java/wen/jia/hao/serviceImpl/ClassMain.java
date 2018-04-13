package wen.jia.hao.serviceImpl;


import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import sun.nio.ch.FileLockImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2016/6/24 0024.
 */
public class ClassMain {

    public static void main(String[] args) throws Exception {
//        System.out.println(Integer.MAX_VALUE);
//
//        File file=new File("d:/soft/tem.txt");
//        System.out.println(file.isDirectory());
//        FileOutputStream fileInputStream = new FileOutputStream(file);
//        FileChannel channel = fileInputStream.getChannel();
//        FileLock lock = channel.lock();
//         lock.release();
//                System.out.println("获取锁成功");
//
//        Socket socket=new Socket();
//        socket.bind(new InetSocketAddress("192.168.146.1",9527));
//        socket.connect(new InetSocketAddress("192.168.146.111",1111));
        List<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        Collection<String> filter = Collections2.filter(list, new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return "1".equals(input);
            }
        });
        System.out.println(filter);


    }


}