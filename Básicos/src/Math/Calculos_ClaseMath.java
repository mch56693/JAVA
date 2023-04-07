package Math;

public class Calculos_ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 95.98;
		double ajustar = Math.round(num1);
		
		System.out.println(ajustar);
		
		float num2 = 95.98F;
		int ajustar2 = Math.round(num2);
		
		System.out.println(ajustar2);
		
		//---------
		
		int num3 = 9;
		double raiz1 = Math.sqrt(num3);
		
		System.out.println(raiz1);
		
		double num4 = 9;
		int raiz2 = (int)Math.sqrt(num4);
		
		System.out.println(raiz1);
		
		//----------
		
		double num5 = 2;
		double num6 = 3;
		
		int elevar1 = (int)Math.pow(num5, num6);
		
		System.out.println(elevar1);
		
		double num7 = 4;
		double num8 = 5;
		
		double elevar2 = Math.pow(num7, num8);
		
		System.out.println(elevar2);
		 
	}

}
