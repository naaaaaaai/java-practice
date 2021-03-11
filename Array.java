package Test3;

import java.util.ArrayList;

public class Array {
	public static void main(String[]args) {

		ArrayList<String>array=new ArrayList<String>();
		array.add("Mikku");
		array.add("Mix");
		array.add("kokkoro");

		System.out.println(array);

		//要素の削除
		array.remove(1);

		System.out.println(array);


		//要素の検索
		System.out.println(array.indexOf("Mikku"));

	    //要素の置き換え
		array.set(1, "miiiiik");

		//要素数の取得
		System.out.println(array.size());
		System.out.println(array);










	}

}
