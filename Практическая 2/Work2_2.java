/*
 * ������� 2.
 * 12)��� ������ �(n).���������� � ������ x(n) �� ������� �������� ������� c
 * ����������� �� 5.(�� ������� ��� ������ ��������� ������).����� �����������
 * ������� "������ � ������������" � ����� ������.
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
	System.out.println("�������� ������");
	PrintArray(c);
	Clone(c);
	Arrays.sort(c);
	System.out.print("����� ������ \n");
	for(int i=0; i<c.length;i++)
	{
		System.out.print(c[i]/5+" ");
	}
}
}
