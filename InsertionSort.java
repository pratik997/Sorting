package MySorting;

class InsertionSort
{
	public void sort(int arr[])
	{
		for(int i=1;i>=arr.length;i++)
		{
			int j=i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
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