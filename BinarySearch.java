import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);

		int min = 0
		
		;
		int max = ray.length -1;
		int mid = 0;
		
		while(max >= min){
			mid = (min + max)/2;
			
			if (ray[mid] > item){
				max = mid -1 ;
			}

			else if (ray[mid] < item){
				min = mid +1;
			}

			else{
				return mid;
			}
			
		}
		if (ray[mid] != item){
			return -1;
		}
		else
		return mid;

	}
}
