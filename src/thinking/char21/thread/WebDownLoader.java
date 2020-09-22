package thinking.char21.thread;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
@author sgc
@version 2020年8月26日 下午2:31:14
@Description 下载图片
 **/
public class WebDownLoader {
	public void download(String url,String name) {
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
