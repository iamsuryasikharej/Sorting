class DecreasingSort
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9,10};
		for(int i=1;i<a.length;i++)
		{
			int newElement=a[i];
			int j;
			for(j=i;j>0&&newElement>a[j-1];j--)
			{
					a[j]=a[j-1];
			}
				a[j]=newElement;
			

		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}