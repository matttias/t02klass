public class Proov1{
	public static void main(String[] args){
		TaisTrapets laud1=new TaisTrapets(2,1,3,8,6);
		TaisTrapets laud2=new TaisTrapets(1.5,1,5.5,7.8,8.6);
		TaisTrapets laud3=new TaisTrapets(2, 1.3, 5, 6, 9.8);
		TaisTrapets laud4=new TaisTrapets(5, 6, 8, 8, 4);
		
		System.out.println(laud1.pindala());
		System.out.println(laud2.pindala());
		System.out.println(laud3.pindala());
		
		System.out.println("---------");
		
		System.out.println(laud1.ymbermoot());
		System.out.println(laud2.ymbermoot());
		System.out.println(laud3.ymbermoot());
		
		System.out.println("---------");
		
		System.out.println(laud1.pyt());
		System.out.println(laud2.pyt());
		System.out.println(laud3.pyt());
		
			System.out.println("---------");
		
		System.out.println(laud1.angle());
		System.out.println(laud2.angle());
		System.out.println(laud3.angle());
		System.out.println(laud4.angle());
		
	}
}