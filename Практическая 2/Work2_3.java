/*
 * ������� 3.
 * ���������� �������(��������� ������ � �� ��������� ���������� ����������.
 * ���������� ������ B,������� ����������-
 * 12)������������ ������������� ��������� � ������ ������� �������.
 */
import java.util.Random;
public class Work2_3 {
	public static void main(String args[]){
	Random  random=new Random(); 
	int Array[][]=new int[4][4];
	int a=1,proiz=1; 
	int B[]=new int[4];
	System.out.println("������������ �������");
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++) {
			int x = random.nextInt(10,32);
			Array[i][j]=x;
			System.out.print(Array[i][j]+" ");
			x=0;
		}
		System.out.println();
	} 
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
		if(Array[j][i]>0) {
			proiz=Array[j][i]*proiz;
			B[i]=proiz;
			}
		}
	 proiz=1;
	} 
	for(int i=0;i<4;i++){
		 System.out.println("������������ ��������� "+a+"-��� �������:"+B[i]);
		 a++;
	}
}
}
