/*
 * ������� 12). ���� ����������� ����� ������� ���������������. ������� ��-
���������� ����� ���������������� (�������� �������, ����� �������, ��������
�������������� �� �������, ��� �������, ���� �����������, ���� ������, ���������
�������, ������� ���������, ����� �������) � �������� ������:

-  ��������-����������������� ������ ��� ��������� ���������� (���
		(��������/�����������), ��� ����������, ������, ������);
-  �������������� (�������� �������������, �������� ����������� ��-
		���);
-  ��������-����������������� ������ ��� ��������� ���������� (���
		(��-1, �� -2, ��-3), ��� ����������, ������, ������, ����� ���������).
����������� ����� ��� �������� ������ ����������� ����� � ������� �����-
����� ������� � ������� ������ ������ ��������.
 */

import java.util.ArrayList;

public class main {
	public static void main(String args[]) {
    ArrayList<TechService> listOfCommodities = new ArrayList<>();
    Complited Complited = new Complited(listOfCommodities);
	TechService TechService = new TechService();
	TechService.setAdress("������");
	TechService.setCar("BMW");
	TechService.setLastName("������");
	TechService.setdateRecei("21.04.2022");
	TechService.setrepair("�������");
	TechService.setNameService("���'�������'");
	TechService.setissuance("10.10.2023");
	TechService.setresult("���������� ������");
	
	
	Complited.addCommodity(TechService);
	
	FaultCar FaultCar = new FaultCar();
	FaultCar.setFault("������ ������");
	FaultCar.setResult("���������� ������");
	
	Complited.addCommodity(FaultCar);
	
	
	InspectionCar InspectionCar= new InspectionCar();
	InspectionCar.setPeriod("22.01.2001");
	InspectionCar.setMileag(100);
	InspectionCar.setYear(5);
	InspectionCar.setrepair("���������");
	
	
	Complited.addCommodity(InspectionCar);
	
	InspectionTruck InspectionTruck = new InspectionTruck();
	InspectionTruck.setVolume("3�");
	InspectionTruck.setrepair("������������� ��������");
	InspectionTruck.setYear(10);
	InspectionTruck.setMileag(20);
	InspectionTruck.setPeriod("2����");
	Complited.addCommodity(InspectionTruck);
	
	
	System.out.println(Complited.showCommodities());
}
}
