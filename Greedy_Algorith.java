package asus;

public class Greedy_Algorith {
	static class Transport{
		String name;
		int time;
		int cost;

Transport(String name,int time,int cost){
	this.name=name;
	this.time=time;
	this.cost=cost;
}
	}
	public static void main(String[] args) {
		Transport[] options= {
				new Transport("Flight",1,20000),
				new Transport("Train",15,3000),
				new Transport("Bus",30,1700),
		};
		Transport best=options[0];
		for(int i=1;i<options.length;i++) {
			if(options[i].time<best.cost) {
				best=options[i];
			}
			
		}
		System.out.println("Best option to reach at low cost to Ladakh");
		System.out.println(best.name+"- Time:"+best.time+"Hours.cost:"+best.cost);
		
	}

}
