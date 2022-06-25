package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("入力してください");
		Scanner sc = new Scanner(System.in);
/*
入力データ例
6 7 4 cathy 4 eijiro 2 alice 6 dad 3 betty 5 franca 1 2 eijiro 1 3 alice 6 4 alice 1 4 franca 3 5 cathy 7 9 dad 2 12 betty 4
3 4 3 itiro 16 jiro 26 saburo 326 1 itiro 16 1 jiro 6 2 jiro 26 3 itiro 16
 */
		int memberN = sc.nextInt();
		int recordN = sc.nextInt();
		int topN = sc.nextInt();
		System.out.println();
		System.out.print(memberN + " " + recordN + " " + topN + "\n");

	// 先月データの取り込み
		MonthData[] lMData = new MonthData[memberN];
		for (int i = 0; i < memberN; i++) {
			lMData[i] = new MonthData(sc.next(), sc.nextInt());
			System.out.println(lMData[i]);
		}
		System.out.println("-");

	// 今月データの取り込み
		ThisMonth[] tMData = new ThisMonth[recordN];
		for (int i = 0; i < recordN; i++) {
			tMData[i] = new ThisMonth(sc.nextInt(), sc.next(), sc.nextInt());
			System.out.println(tMData[i]);
		}
		System.out.println("-");

		MonthData[] result = ThisMonth.makeMonthlyResult(tMData, lMData);

	// 先月と今月のデータをdistannceの値で並べ替え昇順
		Ranking rank = new Ranking();
		rank.ranking(lMData);
		rank.ranking(result);

	// 表で表示
		Table hyou = new Table();
		hyou.table(topN, lMData, result);
	}
} 
