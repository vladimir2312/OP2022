/*
 * Задание 4.
 * 12)Дан двумерный массив А , размером(n*n)(или квадратная матрица).
 * Найти максимальный элемент среди отрицательных элементов параллели 
 * побочной диагонали,расположенной над диагональю.
 */
import java.util.Random;
public class Work2_4 {
public static void main(String args[])
{
	Random random = new Random();
	int n=4,max=0;
	int Array[][]=new int[n][n];
	System.out.println("Исходная матрица");
	for(int i=0;i<Array.length;i++)
	{
		for(int j=0;j<Array.length;j++)
		{
			int x=random.nextInt(-10,10);
			Array[i][j]=x;
			System.out.print(Array[i][j]+" ");
			x=0;
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 0; i < n; i++){
		for (int j = 0; j < n; j++){
			if(i + j < n - 1) 
			{
				if( Array[i][j] < 0 && ( max == 0 || Array[i][j] < max ) )
				{
					max=Array[i][j];
				}	
			}
		}
	}
	System.out.print("Максимальный отрицательный элемент:"+max);
}
}
