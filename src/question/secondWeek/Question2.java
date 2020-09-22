package question.secondWeek;
/**
@author sgc
@version 2020年8月16日 下午1:47:27
@Description 异常丢失场景
 **/
public class Question2 {
	    public static void f1(){
	    	//第一种情况
	    	try {
	    		Exception aException = null;
				try {
					aException = new AException("抛出A异常");
					throw aException;
				} finally {
					Exception bException = new BException("抛出B异常");
					bException.initCause(aException);
					throw bException;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	
	    
	    public static void f2(){
	    	//第二种情况
	    	try {
	    		throw new AException("抛出A异常");
			} finally{
				return;
			}
	    }
		public static void main(String[] args) {
			f1();
		}
}

class AException extends Exception{
	public AException(String msg){
		super(msg);
	}
}

class BException extends Exception{
	public BException(String msg){
		super(msg);
	}
}