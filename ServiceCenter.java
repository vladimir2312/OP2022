/*
* ������� 12). ������� ���������������
* - Service Center:							 �����������
* - ��������:							
* - �������� �������;					   	 �������� �������;
* - ����� �������;						   	 ����� �������;
* - �������� �������������� �� �������;	     �������� �������������� �� �������;
* - ��� �������;							 ��� �������;
* - ���� �����������;						���� �����������;
* - ���� ������;
* - ��������� �������;
* - ������� ���������;
* - ����� �������;
*/
public class ServiceCenter {
	private String namestat;//�������� �������
	private String address;//����� �������
	private String namecar;//�������� ���� � �������
	private String typeofref;//��� �������
	private String date;//���� �����������
	private String dateextred;//���� ������
	private String result;//��������� �������
	private String lastname;//������� ���������
	private int    sum;//����� �������
	public ServiceCenter(String namestat,String address,String namecar,String typeofref,String date) {
		this.namestat = namestat;
		this.address = address;
		this.namecar = namecar;
		this.typeofref = typeofref;
		this.date = date;
	}
	public String getNamestat() {
		return namestat;
	}
	public String setNamestat(String namestat) {
		return this.namestat = namestat;
	}
	public String getAddress() {
		return address;
	}
	public String setAddress(String address) {
		return this.address = address;
	}	
	public String getNamecar() {
		return namecar;
	}
	public String setNamecar(String namecar) {
		return this.namecar = namecar;
	}
	public String getTypeofref() {
		return typeofref;
	}
	public String setTypeofref(String typeofref) {
		return this.typeofref = typeofref;
	}
	public String getDate() {
		return date;
	}
	public String setDate(String date) {
		return this.date = date;
	}
	public String getDateextred() {
		return dateextred;
	}
	public String setDateextred(String dateextred) {
		return this.dateextred = dateextred;
	}
	public String getResult() {
		return result;
	}
	public String setResult(String result ) {
		return this.result = result;
	}
	public String getLastname() {
		return lastname;
	}
	public String setLastname(String lastname ) {
		return this.lastname = lastname;
	}
	public int getSum() {
		return sum;
	}
	public int setSum(int sum) {
		return this.sum = sum;
	}
	public String toString() {
		return "�������� �������:" + namestat + "\n����� �������:" + address + "\n�������� ����:" + namecar + "\n��� �������:" + typeofref + "\n���� �����������:" + date + "\n���� ������:" + dateextred + "\n��������� �������:" + result + "\n������� ���������:" + lastname + "\n����� �������:" + sum;
	}
	public static void main(String args[]) {
		ServiceCenter service = new ServiceCenter("OOO'����'","������","BMW e39","��������","05.04.2022");
		service.setDateextred("20.04.2022");
		service.setResult("��������");
		service.setLastname("������");
		service.setSum(100000);
		System.out.print(service.toString());
	}
}
