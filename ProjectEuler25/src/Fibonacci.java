import java.math.BigInteger;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BigInteger initial= new BigInteger("1");
		 BigInteger num2= new BigInteger("1"); 
		 BigInteger newnum= new BigInteger("0");
		 BigInteger count= new BigInteger("2");
		 while(initial.toString().length()<1000) {
			 newnum= initial.add(num2);
			 initial= num2;
			 num2= newnum;
			 if(initial.toString().length()==1000) {
				 break;
			 }
			 System.out.println(newnum);
			 count= count.add(BigInteger.ONE);
			 
		 }
		System.out.println(count);

	}

}
