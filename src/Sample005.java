//1〜10までの整数をカンマ区切りで横並びで表示させる
//(10にはカンマをつけない)

public class Sample005 {
	public static void main (String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + ",");
		}
	}
}

//10の後のカンマをつけないがわからない