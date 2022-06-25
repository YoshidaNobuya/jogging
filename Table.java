package test;

public class Table {
	public void table(int topN, MonthData[] lastMData, MonthData[] thisMData) {
		MonthData[] thisMData2 = new MonthData[lastMData.length];
		for(int i = 0; i < thisMData.length; i++){
			thisMData2[i] = thisMData[i];
		}
		int countN = 0;
		for(int i = 0; i < lastMData.length; i++) {
			int count = 0;
			for(int j = 0; j < thisMData.length; j++) {
				if(lastMData[i].getName().equals(thisMData[j].getName())){
					count++;
				}
			}
			if(count == 0) {
				thisMData2[thisMData.length+countN] = new MonthData(lastMData[i].getName(),0);

				countN++;
			}
		}
		System.out.println("+-------------------------------+");
		System.out.println("|\t\t\t先月のTOP" + topN + "\t\t\t|");
		System.out.println("+-------+-------+-------+-------+");
		System.out.println("|順位\t|名前\t|距離\t|変動\t|");
		System.out.println("+-------+-------+-------+-------+");

		for(int i = 0; i < topN;i++) {
			System.out.println("|\t" + (i+1) + "\t|" + lastMData[i].getName() + "\t|\t" + lastMData[i].getDistance() + "\t|\t\t|");
			System.out.println("+-------+-------+-------+-------+");
		}

		System.out.println("+-------------------------------+");
		System.out.println("|\t\t\t今月のTOP" + topN + "\t\t\t|");
		System.out.println("+-------+-------+-------+-------+");
		System.out.println("|順位\t|名前\t|距離\t|変動\t|");
		System.out.println("+-------+-------+-------+-------+");

		for(int i = 0; i < topN; i++) {
			String upDwSaNew = "new";


			for(int j = 0; j < topN; j++) {
				if(thisMData2[i].getName().equals(lastMData[j].getName())) {
					if(i < j) {
						upDwSaNew = "up\t";
					}else if(i > j) {
						upDwSaNew = "down";
					}else if(i == j) {
						upDwSaNew = "same";
					}
				}
			}
		System.out.println("|\t" + (i+1) + "\t|" + thisMData2[i].getName() + "\t|\t" + thisMData2[i].getDistance() + "\t|" + upDwSaNew + "\t|");
		System.out.println("+-------+-------+-------+-------+");
		}
	}
}
