package wen.jia.hao;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.ReaderConfig;
import org.jxls.reader.XLSReader;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by 郝文佳 on 2016/5/25.
 */
public class Test {
	/* public static void main(String[] args) throws Exception { */

	/*
	 * Jedis jedis = new Jedis("172.16.75.204", 6379); Pipeline pipelined = jedis.pipelined();
	 * pipelined.incr("sdfsdfsdafsd"); Response<String> sdfsdfsdafsd = pipelined.get("sdfsdfsdafsd"); pipelined.sync();
	 * System.out.println(sdfsdfsdafsd.get());
	 */
	// System.out.println(IntMath.checkedAdd(5,9));
	// System.out.println(DateTimeFormat.forPattern("hh:mm:ss").parseLocalDateTime("12:16:17"));

	/*
	 * ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("d:/a.zip")); ZipEntry zipEntry = null;
	 * 
	 * while ((zipEntry = zipInputStream.getNextEntry()) != null) { System.out.println(zipEntry.getName());
	 * if(zipEntry.isDirectory()){ File file=new File("d:/sb/"+zipEntry.getName()); file.mkdirs();
	 * 
	 * }else { byte[] extra = zipEntry.getExtra(); FileOutputStream fileOutputStream=new
	 * FileOutputStream("d:/sb/"+zipEntry.getName()); IOUtils.write(extra,fileOutputStream); fileOutputStream.close(); }
	 * 
	 * }
	 */

	/* } */
	private class A{
		public String a="aaa";

	}
	public A nima()
	{
		return new A();
	}

	public static void main(String[] args) throws Exception {

         Test test=new Test();
		String a = test.nima().a;
		System.out.println(a);

	}

}
