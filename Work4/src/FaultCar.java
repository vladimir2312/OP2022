class FaultCar extends TechService{
	public String fault;
	public String result;
	
	
	public String getFault() {
		return fault;
	}
	public String setFault(String fault) {
		return this.fault = fault;
	}
	public String getResult() {
		return result;
	}
	public String setResult(String result) {
		return this.result = result;
	}
	public String toString() {
		return "\n \nРезультат:"+result + "\nОписание неисправности:" + fault ;
	}
}