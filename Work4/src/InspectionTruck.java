
class InspectionTruck extends TechService{

	public String volume;//����� ���������
	public int year;
	public String period;
	public int mileag;
	
	public int setMileag(int mileag) {
		return this.mileag = mileag;
	}
	public int getYear() {
		return year;
	}
	public int setYear(int year) {
		return this.year = year;
	}
	
	public String getPeriod() {
		return period;
	}
	public String setPeriod(String period) {
		return this.period = period;
	}
	public String getVolume() {
		return volume;
	}
	public String setVolume(String volume) {
		return this.volume = volume;
	}
	public String toString() {
		return  "\n\n��� �������:" +repair+"\n����� ���������:"+volume+"\n��� ����������:"  + year+"\n������:"+period+"\n������:"+mileag;
	}
}