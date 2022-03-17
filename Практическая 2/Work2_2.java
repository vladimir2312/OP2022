/*
 * Задание 2.
 * 12)Дан массив с(n).Переписать в массив x(n) не нулевые элементы массива c
 * разделенные на 5.(со сжатием без пустых элементов внутри).Затем упорядочить
 * методом "Выбора и перестановки" в новый массив.
 */
import java.util.Random;
import java.util.*;
public class Work2_2 {
public static void Clone(float Array[])
{
	int n=0;
	for(int i=0;i<Array.length;i++)
	{
	n++;
	}
	float CloneArr[]=new float[n];
	for (int i=0;i<Array.length;i++)
	{
		if(Array[i]!=0)
		{
			n-=1;
			CloneArr[i]=Array[i];
		}
	}
}
public static void PrintArray(float Array[])
{	
	Random random = new Random();	
	int a;
	for(int i=0; i<Array.length;i++)
	{
		a=random.nextInt(0,50);
		Array[i]=a;
		System.out.print(Array[i]+" ");
		a=0;
	}
	System.out.println();
}
public static void main(String args[])
{
	int n=4;
	float c[]= new float[n];
	System.out.println("Исходный массив");
	PrintArray(c);
	Clone(c);
	Arrays.sort(c);
	System.out.print("Новый массив \n");
	for(int i=0; i<c.length;i++)
	{
		System.out.print(c[i]/5+" ");
	}
}
}
