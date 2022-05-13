package jogging;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("入力してください");
		Scanner sc = new Scanner(System.in);
		/*
		6 7 4 cathy 4 eijiro 2 alice 6 dad 3 betty 5 franca 1 2 eijiro 1 3 alice 6 4 alice 1 4 franca 3 5 cathy 7 9 dad 2 12 betty 4
		*/
		int memberN = sc.nextInt();
		int recordN = sc.nextInt();
		int topN = sc.nextInt();
		System.out.println();
		System.out.print(memberN + " " + recordN + " " + topN + "\n");

		// 先月データの取り込み
		LastMonth[] lMData = new LastMonth[memberN];
		for (int i = 0; i < memberN; i++) {
			lMData[i] = new LastMonth(sc.next(), sc.nextInt());
			//System.out.println(lMData[i].name + " " + lMData[i].distance);
		}

		// 今月データの取り込み
		ThisMonth[] tMData = new ThisMonth[recordN];
		for (int i = 0; i < recordN; i++) {
			tMData[i] = new ThisMonth(sc.nextInt(), sc.next(), sc.nextInt());
			//System.out.println(tMData[i].day + " " + tMData[i].name + " " + tMData[i].distance);
		}

		ShowData.personalResult(lMData);
		ShowData.monthlyResult(tMData);

	}
}