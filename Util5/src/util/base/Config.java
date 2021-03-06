package util.base;

import java.io.File;
import java.io.Serializable;

/**
 * @author wlh
 * 该类充当IOC和Config--在工具类中调用.
 * 二维数组不能,插入,只能追加.
 * 单例用接口的静态公开匿名内部类.或枚举
 * 该类为多例..
 //给系统用.用户无法扩展--确定了key 和 value
 */
@SuppressWarnings("serial")
public interface Config extends Cloneable, Serializable {
	public static final Object[][] CONF = new Object[][]{
		{//[0] -- File
			 ".java"//
			,"src"//
			,"wlh"
		},{//[1] -- Signle
			"SIGNLE"
		}
	};
	int INT [][] = new int[][]{
		{//[0] -- File	
			File.separator.length()// "\"	
			,( (String)CONF[0][1]).length()//".java"
		}
	}; 
}
