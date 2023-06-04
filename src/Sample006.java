//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の
//奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる

public class Sample006 {
	public static void main (String[] args) {
		int number[] = new int[20]; //20の要素を作成
		String str ="";
		number[0] = 0;
		for(int i = 1; i < number.length; i++) { 
			number[i] = number[i - 1] + 5; //0から5ずつnumber[i]に加算
		}
		
		System.out.print("\n奇数 : ");
		for (int i = 0; i < 11; i++) {
			if (number[i] % 2 != 0) {
				str += String.valueOf(number[i]) + ",";
			}
		}
		
		System.out.print(str.substring(0, str.length() - 1));
		System.out.print("\n偶数 : ");
		str = "";
		for (int i = 11; i < 20; i++) {
			if (number[i] % 2 == 0) {
				str += String.valueOf(number[i]) + ",";
			}
		}
		System.out.print(str.substring(0, str.length() - 1));
		System.out.print("\n");
		
	}
}
