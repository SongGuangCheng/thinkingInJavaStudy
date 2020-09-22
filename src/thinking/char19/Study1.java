package thinking.char19;

import java.util.Random;


/**
@author sgc
@version 2020年8月20日 下午4:43:59
@Description 
 **/
public class Study1 {
	public static void main(String[] args) {
		Color red = Color.RED;
		Color green = Color.GREEN;
		System.out.println(red);
		Color[] colors = Color.values();
		for (Color color : colors) {
			System.out.println(color.ordinal()+" "+color);
		}
		System.out.println("red.compareTo(green):"+red.compareTo(green));
		System.out.println("red.getDeclaringClass():"+red.getDeclaringClass());
		System.out.println("red.name():"+red.name());
		 Color b = Color.valueOf("BLUE");
		 System.out.println("b.toString():"+b);
		 
		 Class<Color> color = Color.class;
		 Color[] colors1 = color.getEnumConstants();
		 System.out.println(colors1[new Random().nextInt(colors1.length)]);
	}
}

enum Color{
	
	RED("红色") {
		@Override
		String getInfo() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	YELLOW("黄色") {
		@Override
		String getInfo() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	GREEN("绿色") {
		@Override
		String getInfo() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	BLUE("蓝色") {
		@Override
		String getInfo() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	String des;
	private Color() {
		
	}
	private Color(String des) {
		this.des = des;
	}
	public String getDes() {	
		return des;
	}
	
	@Override
	public String toString() {
		String name = this.name();
		return name+getDes()	;
	}
	
	abstract String getInfo();
}