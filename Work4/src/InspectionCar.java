class InspectionCar extends TechService{  
	
	public int year;//год провидения
	public int mileag;//пробег
	public String period;

	

	public int getMileag() {
		return mileag;
	}
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
	public String toString() {
		return "\n\n" + "\nгод провидения:"  + year +"\nПробег:"+mileag  + "\nПериод:"+period;
	}
}