public class TaisTrapets{
	double a, x, b, h, c;
	public TaisTrapets(double kylg, double alus, double hypotenuus, double korgus, double teinealus){
		if(kylg<=0){
			throw new RuntimeException("Sobimatu");}
		if(alus<=0){
			throw new RuntimeException("Sobimatu");}
		if(hypotenuus<=0){
			throw new RuntimeException("Sobimatu");}
		if(korgus<=0){
			throw new RuntimeException("Sobimatu");}
		if(teinealus<=0){
			throw new RuntimeException("Sobimatu");}	
			
		a=kylg;
		x=alus;
		b=hypotenuus;//ei ole vaja
		h=korgus;//ei ole vaja
		c=teinealus;
	}
	public double pindala(){
		return (a*a)+(x*h/2);
	}
	
	public double ymbermoot(){
		return (4*a+x+b);
	}
	
	public double pyt(){
		return (Math.sqrt(Math.pow(x+a, 2)+Math.pow(a, 2)));
	}
	//https://i.stack.imgur.com/X6SG6.jpg
	public double angle(){
		return (Math.toDegrees(Math.PI/2+Math.atan(c-x/a)));
	}
	
//Väljnund:	
//169.69515353123398
//172.81573260757312
//173.76291992354152
//160.34617594194668

	
	
}