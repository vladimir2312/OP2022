/*
 * ������� 1.
 * ����� ������������ �������� � ���������� ������� x.
 * ����� ������ ������� � ������� ��������� �� ������������ �������.
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
    System.out.println("������������ ������� �������:"+max);
    for(int i=0;i<Array.length;i++)
    {
	   System.out.println(Array[i]/max);
    }
}
}
