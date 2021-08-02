class SelectionSort
{
	public void sort(int arr[])
	{
		int n = arr.length,i = 0,j = i+1;
		for(int i=0;i<n-1;i++)	
		{
			int min = i;
			for(j=i+1;j<n;j++)
			{
				if(arr[min]>=arr[j])
				{
					min = j;
				}
			}
			arr[min] = arr[i]+arr[min];
			arr[i] = arr[min]-arr[i];
			arr[min] = arr[min]-arr[i];
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