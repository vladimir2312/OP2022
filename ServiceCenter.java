/*
* Вариант 12). Станция техобслуживания
* - Service Center:							 Конструктор
* - Свойства:							
* - название станции;					   	 название станции;
* - адрес станции;						   	 адрес станции;
* - название автотранспорта на ремонте;	     название автотранспорта на ремонте;
* - вид ремонта;							 вид ремонта;
* - дата поступления;						дата поступления;
* - дата выдачи;
* - результат ремонта;
* - фамилия персонала;
* - сумма ремонта;
*/
public class ServiceCenter {
	private String namestat;//Название станции
	private String address;//Адрес станции
	private String namecar;//Название авто в ремонте
	private String typeofref;//Вид ремонта
	private String date;//Дата поступления
	private String dateextred;//Дата выдачи
	private String result;//Результат ремонта
	private String lastname;//Фамилия персонала
	private int    sum;//Сумма ремонта
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
		return "Название станции:" + namestat + "\nАдрес станции:" + address + "\nНазвание авто:" + namecar + "\nВид ремонта:" + typeofref + "\nДата послупления:" + date + "\nДата выдачи:" + dateextred + "\nРезультат ремонта:" + result + "\nФамилия персонала:" + lastname + "\nСумма ремонта:" + sum;
	}
	public static void main(String args[]) {
		ServiceCenter service = new ServiceCenter("OOO'Авто'","Москва","BMW e39","Покраска","05.04.2022");
		service.setDateextred("20.04.2022");
		service.setResult("Окрашена");
		service.setLastname("Иванов");
		service.setSum(100000);
		System.out.print(service.toString());
	}
}
