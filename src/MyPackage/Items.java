package MyPackage;

import java.util.HashMap;
import java.util.Map;

public class Items {
	static String [] items= {"1.Pongal","2.Dosa","3.Idli","4.Parota","5.Poori"};
	
	public static void item() {
		System.out.println("Item List:");
		for(String item:items) {
			System.out.println(item);
		}
	}
	
	public static void price() {
		Map<String, Integer> price = new HashMap<String, Integer>();
		System.out.print("\n");
		System.out.println("Price List:");
		System.out.println("----- ----");
		price.put("Idli",new Integer(55));
		price.put("Dosa",new Integer(90));
		price.put("Poori",new Integer(85));
		price.put("Pongal",new Integer(95));
		price.put("Parota",new Integer(75));
		System.out.println(price.entrySet());
//		for(Map.Entry<String, Integer> me :
//            price.entrySet()) {
//			System.out.print(me.getKey() + ":");
//            System.out.println(me.getValue());
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Items itemList=new Items();
		itemList.item();
		itemList.price();
	}

}
