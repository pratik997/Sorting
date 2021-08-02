class MergeSort
{
	public void sort(int arr[])
	{
		mergeSort(arr,0,arr.length-1);
	}
	public void mergeSort(int arr[],int left,int right)
	{
		if(left>right)return;
		int mid = left+(right-left)/2;
		mergeSort(arr,left,mid);
		mergeSort(arr,mid+1,right);
		merge(arr,left,mid,right);
	}
	public void merge(int arr[],int left,int mid,int right)
	{
		int l1 = mid-left+1;
		int l2 = right-mid;
		int arr1[] = new int[l1];
		int arr2[] = new int[l2];
		for(int i=left;i<=mid;i++)arr1[i-left] = arr[i];
		for(int i=mid+1;i<=right;i++)arr2[i-mid-1] = arr[i];
		int i = 0,j = 0,k=left;
		while(i<l1 && j<l2)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k] = arr1[i];
				i++;
			}
			else
			{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<l1)
		{
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<l2)
		{
			arr[k] = arr2[j];
			j++;
			k++:
		}
	}
}