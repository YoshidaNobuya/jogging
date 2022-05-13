package jogging;

public class ShowData {


	public static void personalResult(LastMonth[] lMData) {
		System.out.println("\n\t先月の成績");
		System.out.println(" -------------------");
		for (int i = 0; i < lMData.length; i++) {
			System.out.println(
					"|\t" + lMData[i].name + "\t|\t" + lMData[i].distance + "km\t|");
			System.out.println(" -------------------");
		}
	}

	public static void monthlyResult(ThisMonth[] tMData) {
		System.out.println("\n\t今月のジョギングの記録");

		System.out.println(" --------------------------------");
		for (int i = 0; i < tMData.length; i++) {
			System.out.println(
					"|\t" + tMData[i].day + "日目\t|\t" + tMData[i].name + "\t|\t" + tMData[i].distance + "km\t|");
			System.out.println(" --------------------------------");
		}
	}
}