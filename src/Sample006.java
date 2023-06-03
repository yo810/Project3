public class Sample006 {
	public static void main (String[] args) {
		int number[] = new int[20]; //20の要素を作成
		for(int i = 1; i < number.length; i++) { 
			number[i] = number[i - 1] + 5; //0から5ずつnumber[i]に加算
		}
		for (int i = 0; i < number.length; i++) { 
			System.out.println(String.format("%2d %4d", i, number[i]));
		}
		
		for(int i = 0; i <= 10; i++) { //0～10までのループ
			if(i % 2 != 0) //奇数
				System.out.print("," +i); //奇数とカンマの表示
		}
		
		System.out.println(); //改行

		for(int i = 11; i <= 19; i++) { //11～19までのループ
			if(i % 2 == 0) //偶数
				System.out.print("," +i); //偶数とカンマの表示
		}
	}
}
