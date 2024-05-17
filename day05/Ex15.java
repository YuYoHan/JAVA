import java.lang.Math;
import java.util.Arrays;
class Ex15 
{
	public static void main(String[] args) {
		int[] data = {13, 10, 5, 25, 30, 12};
		int max = data[0];
		int min = data[0];
		int maxPosition = data[0];

		for (int i = 0; i < data.length;i++ )
		{
			/*
			if(data[i] > max) {
				max = data[i];
				maxPosition = i;
			}
			*/
			max = Math.max(max, data[i]);
			maxPosition = Arrays.asList(data).indexOf(max);
			min = Math.min(min, data[i]);
		}
		System.out.println("최대값 : " + max);
		System.out.println("최대값 인덱스 : " + maxPosition);
		System.out.println("최소값 : " + min);
	}
}
