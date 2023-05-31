public class Sample004 {
	public static void main(String[] args) {
		int sum = 0;
//		下記追加　カウントの変数
		int cnt = 0;
		for(int i = 1; i<= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
//				下記追加　カウントを+1
				cnt ++;
			}
		}
		System.out.println("1～10までの偶数の合計は" + sum);
//		下記追加　1～10までの表示
		System.out.println("1～10までの偶数の個数は" + cnt);
	}
}

//1～10までの偶数の合計は表示できたが、偶数の個数の表示の仕方がわからない