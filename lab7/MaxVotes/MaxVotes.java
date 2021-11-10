import java.util.*;
class MaxVotes {

	static void findMajority(int arr[], int n)
	{
		int maxCount = 0;
		int index = -1; 
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}

		if (maxCount > n / 2)
			System.out.println(arr[index]);

		else
			System.out.println("No Majority Element");
	}

	public static void main(String[] args)
	{
	
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Array length:");
       	int n = input.nextInt(); 
       	int arr[] = new int[n]; 
       	System.out.println("Enter " + n + " elements");
       	for (int i = 0; i <n; i++)
      	{
        	arr[i] = input.nextInt();
      	}

		findMajority(arr, n);
	}
}
