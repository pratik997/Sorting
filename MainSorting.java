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
