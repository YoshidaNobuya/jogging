package test;

import java.util.ArrayList;
import java.util.List;

public class ThisMonth {
	private int day;
	private String name;
	private int distance;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public ThisMonth(int day, String name, int distance) {
		this.day = day;
		this.name = name;
		this.distance = distance;
	}

	public static MonthData[] makeMonthlyResult(ThisMonth[] tMData, MonthData[] lMData) {

		List<MonthData> list = new ArrayList<MonthData>();

		for (int i = 0; i < tMData.length; i++) {
			for (int j = 1 + i; j < tMData.length; j++) {

// 名前が同じなら後ろの名前を削除
				if (tMData[i].name.equals(tMData[j].name)) {
					tMData[j].name = "";
					tMData[i].distance += tMData[j].distance;
					tMData[j].distance = 0;
				}
			}
		}
// 今月複数回練習を行った者（空白セル）を取り除く
		for (int i = 0; i < tMData.length; i++) {
			if (!(tMData[i].name == "" || tMData[i].name == null)) {
				list.add(new MonthData(tMData[i].name, tMData[i].distance));
			}
		}

		// 今月記録無し者（null）を先月記録から取ってくる
		for (int i = 0, count = 0; i < list.size(); i++) {
			for (int j = 0; j < lMData.length; j++) {
				if (lMData[j].getName().equals(list.get(i).getName())) {
					count++;
				}
			}
			if (count == 0) {
				list.add(new MonthData(lMData[i].getName(), 0));
			}
			count=0;
		}

// Arraylistを配列に変換
		MonthData[] result = list.toArray(new MonthData[list.size()]);

		return result;
	}

	@Override
	public String toString() {
		return "[" + day + ", " + name + ", " + distance + "]";
	}

}