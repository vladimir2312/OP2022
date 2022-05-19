/*
 * Вариант 12). Учет выполненных работ станции техобслуживания. Создать ро-
дительский класс «ТехОбслуживание» (название станции, адрес станции, название
автотранспорта на ремонте, вид ремонта, дата поступления, дата выдачи, результат
ремонта, фамилия персонала, сумма ремонта) и дочерние классы:

-  «планово-предупредительный осмотр для легкового транспорта» (вид
		(плановый/капитальный), год проведения, пробег, период);
-  «неисправности» (название неисправности, описание выполненных ра-
		бот);
-  «планово-предупредительный осмотр для грузового транспорта» (вид
		(ТО-1, ТО -2, ТО-3), год проведения, пробег, период, объем двигателя).
Реализовать класс для хранения списка выполненных работ с методом добав-
ления ремонта и методом печати списка ремонтов.
 */

import java.util.ArrayList;

public class main {
	public static void main(String args[]) {
    ArrayList<TechService> listOfCommodities = new ArrayList<>();
    Complited Complited = new Complited(listOfCommodities);
	TechService TechService = new TechService();
	TechService.setAdress("Москва");
	TechService.setCar("BMW");
	TechService.setLastName("Иванов");
	TechService.setdateRecei("21.04.2022");
	TechService.setrepair("Окраска");
	TechService.setNameService("ООО'Станция'");
	TechService.setissuance("10.10.2023");
	TechService.setresult("Окрашенная машина");
	
	
	Complited.addCommodity(TechService);
	
	FaultCar FaultCar = new FaultCar();
	FaultCar.setFault("Сдутые колеса");
	FaultCar.setResult("Накаченные колеса");
	
	Complited.addCommodity(FaultCar);
	
	
	InspectionCar InspectionCar= new InspectionCar();
	InspectionCar.setPeriod("22.01.2001");
	InspectionCar.setMileag(100);
	InspectionCar.setYear(5);
	InspectionCar.setrepair("Грунтовка");
	
	
	Complited.addCommodity(InspectionCar);
	
	InspectionTruck InspectionTruck = new InspectionTruck();
	InspectionTruck.setVolume("3л");
	InspectionTruck.setrepair("регулирование клапонов");
	InspectionTruck.setYear(10);
	InspectionTruck.setMileag(20);
	InspectionTruck.setPeriod("2года");
	Complited.addCommodity(InspectionTruck);
	
	
	System.out.println(Complited.showCommodities());
}
}
