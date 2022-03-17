/*
 * Задание 1.
 * Найти максимальный эллемент в одномерном массиве x.
 * Затем каждый элемент в массиве разделить на максимальный элемент.
 */
public class Work2_1 {
	public static void main(String[] args)
	{
	float Array[]= {10,20,30,40,50};
	float max=0;
	for(int i=0;i<Array.length;i++)
	{
		if(Array[i]>max)
		{
			max=Array[i];
		}
	}
    System.out.println("Максимальный элемент массива:"+max);
    for(int i=0;i<Array.length;i++)
    {
	   System.out.println(Array[i]/max);
    }
}
}
