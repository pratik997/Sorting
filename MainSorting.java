//package MySorting;
import java.io.*;
//import MySorting.*;
class MainSorting
{
	public static void main(String pp[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of element: ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the ekement: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Choose which sorting algorithm you want to use: \n"+
			"1. Insertion Sort\n"+
			"2. Selection Sort\n"+
			"3. Bubble sort\n"+
			"4. Quick Sort\n"+
			"5. Merge Sort\n"+
			"6. Heap Sort\n"+
			"7. Radix Sort\n"+
			"8. Bucket Sort\n"+
			"9. Counting Sort:"
			);
		int ch = Integer.parseInt(br.readLine());
		long start = 0, end = 0;
		switch(ch)
		{
			case 1: 
				InsertionSort is = new InsertionSort();
				is.print(arr);
				start = System.nanoTime();
				is.sort(arr);
				end = System.nanoTime();
				is.print(arr);
				System.out.println((end-start)+"ns ellapsed.");
				break;
			case 2: 
				SelectionSort ss = new SelectionSort();
				ss.print(arr);
				start = System.nanoTime();
				ss.sort(arr);
				end = System.nanoTime();
				ss.print(arr);
				System.out.println((end-start)+"ns ellapsed.");
				break;
			case 3: 
				BubbleSort bs = new BubbleSort();
				bs.print(arr);
				start = System.nanoTime();
				bs.sort(arr);
				end = System.nanoTime();
				bs.print(arr);
				System.out.println((end-start)+"ns ellapsed.");
				break;
			// case 4: 
			// 	QuickSort qs = new QuickSort();
			// 	qs.print(arr);
			// 	start = System.nanoTime();
			// 	qs.sort(arr);
			// 	end = System.nanoTime();
			// 	qs.print(arr);
			// 	System.out.println((end-start)+"ns ellapsed.");
			// 	break;
			case 5: 
				MergeSort ms = new MergeSort();
				ms.print(arr);
				start = System.nanoTime();
				ms.sort(arr);
				end = System.nanoTime();
				ms.print(arr);
				System.out.println((end-start)+"ns ellapsed.");
				break;
			// case 6: 
			// 	HeapSort hs = new HeapSort();
			// 	hs.print(arr);
			// 	start = System.nanoTime();
			// 	hs.sort(arr);
			// 	end = System.nanoTime();
			// 	hs.print(arr);
			// 	System.out.println((end-start)+"ns ellapsed.");
			// 	break;
			// case 7:	
			// 	RadixSort rs = new RadixSort();
			// 	rs.print(arr);
			// 	start = System.nanoTime();
			// 	rs.sort(arr);
			// 	end = System.nanoTime();
			// 	rs.print(arr);
			// 	System.out.println((end-start)+"ns ellapsed.");
			// 	break;
			// case 8:
			// 	BucketSort bs = new BucketSort();
			// 	bs.print(arr);
			// 	start = System.nanoTime();
			// 	bs.sort(arr);
			// 	end = System.nanoTime();
			// 	bs.print(arr);
			// 	System.out.println((end-start)+"ns ellapsed.");
			// 	break;
			// case 9:
			// 	CountingSort cs = new CountingSort();
			// 	cs.print(arr);
			// 	start = System.nanoTime();
			// 	cs.sort(arr);
			// 	end = System.nanoTime();
			// 	cs.print(arr);
			// 	System.out.println((end-start)+"ns ellapsed.");
			// 	break;
			default:
				System.out.println("Invalid Choice!!!\nTry again(n)");
				break;
		}
	}
}
class InsertionSort
{
	public void sort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
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
class QuickSort
{
	public void sort(int arr[])
	{
		
	}
}
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