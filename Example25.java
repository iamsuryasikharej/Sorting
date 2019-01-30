import java.util.*;
class a
{
	Stack<Integer> stack;
	public void stackImplement()
	{
	stack=new Stack<Integer>();
	stack.add(12);
	stack.add(13);
	stack.add(19);
	stack.add(78);
	stack.add(76);
	}
	public void check()
	{
		int pos;
		Scanner sc=new Scanner(System.in);
		int user=sc.nextInt();
		int len=stack.size();
		//System.out.println(len);
		for (int i=len-1;i>=0;i--)
		{
			int z=stack.get(i);
			while(user<z)
			{
				pos=i;
				stack.add(user);

				System.out.println("span"+ (len-i));
				System.out.println("new stack"+stack);
				System.exit(1);
				
			}
				if(i==0){
					System.out.println("nothing ");
				}
			//else
			//{
			////break;
			}
			
		}

	}



class Example25
{
	public static void main(String[] args) {
    a obj=new a();
    obj.stackImplement();	
    obj.check();	
	}
}