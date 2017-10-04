package practice;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] numbers = {23, 6, 47, 35, 2, 14};
		double Average;
		
		
		Average = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] / 6;
		
		System.out.println("The average is "+ Average);
		
		if( numbers[0] > numbers[1] & numbers[0] > numbers[2] & numbers[0] > numbers[3] & numbers[0] > numbers[4] & numbers[0] > numbers[5])	
		{
			System.out.println("The greatest number is "+ numbers[0]);
		}
		if( numbers[1] > numbers[0] & numbers[1] > numbers[2] & numbers[1] > numbers[3] & numbers[1] > numbers[4] & numbers[1] > numbers[5])	
		{
			System.out.println("The greatest number is "+ numbers[1]);
		}
		if( numbers[2] > numbers[1] & numbers[2] > numbers[0] & numbers[2] > numbers[3] & numbers[2] > numbers[4] & numbers[2] > numbers[5])	
		{
			System.out.println("The greatest number is "+ numbers[2]);
		}
		if( numbers[3] > numbers[1] & numbers[3] > numbers[2] & numbers[3] > numbers[0] & numbers[3] > numbers[4] & numbers[3] > numbers[5])	
		{
			System.out.println("The greatest number is "+ numbers[3]);
		}
		if( numbers[4] > numbers[1] & numbers[4] > numbers[2] & numbers[4] > numbers[3] & numbers[4] > numbers[0] & numbers[4] > numbers[5])	
		{
			System.out.println("The greatest number is "+ numbers[4]);
		}
		if( numbers[5] > numbers[1] & numbers[5] > numbers[2] & numbers[5] > numbers[3] & numbers[5] > numbers[4] & numbers[5] > numbers[0])	
		{
			System.out.println("The greatest number is "+ numbers[5]);
		}
		
		
		
		
		if ( numbers[0] % 2 != 0 )
		{
			System.out.println(numbers[0] +" is odd");
		}
		
		if( numbers[1] % 2 != 0 )
		{
			System.out.println(numbers[1] +" is odd ");
		}
		if( numbers[2] % 2 != 0 )
		{
			System.out.println(numbers[2] +" is odd");
		}
		if( numbers[3] % 2 != 0 )
		{
			System.out.println(numbers[3] +" is odd ");
		}
		if( numbers[4] % 2 != 0 )
		{
			System.out.println(numbers[4] +" is odd ");
		}
		if( numbers[5] % 2 != 0 )
		{
			System.out.println(numbers[5] +" is odd ");
		}
	}

}
