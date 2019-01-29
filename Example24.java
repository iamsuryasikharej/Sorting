class a{
	public void fizzbizz()
	{
	for(int i=1;i<=100;i++)
	{
	if (i%3==0)
	{
	System.out.println("fizz"+i);
	}
	else if(i%5==0)
	{
	System.out.println("bizz"+i);
	}
	else
	continue;
	}
	}
}
class Example24{
	public static void main(String [] args){
	a obj=new a();
	System.out.println("wait a minute");
	obj.fizzbizz();
	}
}