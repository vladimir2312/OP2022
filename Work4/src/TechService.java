import java.util.ArrayList;

public class TechService  {
	public String NameService;//�������� �������
	public String Adress;
	public String Car;
	public String repair;//��� �������
	public String dateRecei;//���� �����������
	public String issuance;//���� ������
	public String result;//��������� �������
	public String LastName;//������� ���������
	public int sum;//����� �������
	
	
	public String getLastName() {
		return LastName;
	}
	public String setLastName(String LastName) {
		return this.LastName = LastName;
	}
	public String getresult() {
		return result;
	}
	public String setresult(String result) {
		return this.result = result;
	}
	public String getissuance() {
		return issuance;
	}
	public String setissuance(String issuance) {
		return this.issuance = issuance;
	}
	public String getNameService() {
		return NameService;
	}
	public String setNameService(String NameService) {
		return this.NameService = NameService;
	}
	public String getAdress() {
		return Adress;
	}
	public String setAdress(String Adress) {
		return this.Adress= Adress;
	}
	public int getsum() {
		return sum;
	}
	public int setsum(int sum) {
		return this.sum = sum;
	}
	
	public String getCar() {
		return Car;
	}
	public String setCar(String Car) {
		return this.Car = Car;
	}
	public String getrepair() {
		return repair;
	}
	public String setrepair(String repair) {
		return this.repair = repair;
	}
	public String getdateRecei() {
		return dateRecei;
	}
	public String setdateRecei(String dateRecei) {
		return this.dateRecei = dateRecei;
	}
	public String toString() {
		return "\n\n�������� �������:" + NameService + "\n����� �������:" + Adress + "\n�������� ����:" + Car + "\n��� �������:" + repair + "\n���� �����������:" + dateRecei + "\n���� ������:" + issuance + "\n��������� �������:" + result + "\n������� ���������:" + LastName + "\n����� �������:" + sum;
	}

		
	
	
}

