import java.util.Scanner;
class  ArmNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter num:");
		n=sc.nextInt();
		int copy=n;
		int count=0;

		//to find the length or number of digit counts
		while(n!=0){
			n=n/10;
			count++;
		}
		//System.out.println(count);
		
		int y=count;
		n=copy;
		
		//System.out.println(n);
		int result=0;
		while(n!=0){
			int x=n%10;
			n=n/10;
			int pow=1;
			
			for(int i=1;i<=y;i++){
				pow=pow*x;
			}
			result=result+pow;
		}
		
		if(copy == result){
			System.out.println("Armstrome number");
		}
		else{
			System.out.println("Not a armstrome number");
		}
	
		
	}
}
