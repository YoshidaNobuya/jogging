package test;

class Ranking{

	public void ranking(MonthData[] data) {

		for(int i=0; i < data.length-1; i++) {

            for(int ii=0; ii < data.length-i-1; ii++) {

            	if(data[ii].getDistance() < data[ii+1].getDistance()) {

            		int distance = data[ii].getDistance();
            		String name = data[ii].getName();

            		data[ii].setDistance(data[ii+1].getDistance());
            		data[ii].setName(data[ii+1].getName());

            		data[ii+1].setDistance(distance);
            		data[ii+1].setName(name);;
				}
			}
		}
	}
}
