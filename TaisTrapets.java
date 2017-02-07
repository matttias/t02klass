public class TaisTrapets{
	double a, x, b, h;
	public TaisTrapets(double kylg, double alus, double hypotenuus, double korgus){
		if(kylg<=0){
			throw new RuntimeException("Sobimatu");}
		if(alus<=0){
			throw new RuntimeException("Sobimatu");}
		if(korgus<=0){
			throw new RuntimeException("Sobimatu");}
		a=kylg;
		x=alus;
		b=hypotenuus;
		h=korgus;
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
}