package thinking.char18.commons;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

/**
@author sgc
@version 2020年8月24日 下午3:23:04
@Description 
 **/
public class CIOTest02 {
	public static void main(String[] args) {
		Collection<File> files = FileUtils.listFiles(
				new File("E:/kaifatools/eclipse/eclipse-jdk-tomcat/eclipse-jee-luna/workspace/IOStudy"),
				new SuffixFileFilter("java"),DirectoryFileFilter.INSTANCE);//参数2：过滤条件 参数3：是否考虑子包
		for(File file:files){
			System.out.println(file.getAbsolutePath());
		}
	}
}
