class BubbleSort
{
	public void sort(int arr[])
	{
		int n = arr.length;
		for(int i=n-1;i>0;i--)
		{
			int max = arr[i];
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]>arr[max])
				{
					max = j;
				}
			}
			arr[max] = arr[max]+arr[i];
			arr[i] = arr[max]-arr[i];
			arr[max] = arr[max]-arr[i];
		}
	}
	public void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}