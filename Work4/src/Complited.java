
import java.util.ArrayList;
class Complited  {
	
	   private ArrayList<TechService> listOfCommodities;

	    public Complited (ArrayList<TechService> listOfCommodities) {
	        this.listOfCommodities = listOfCommodities;
	    }

	    public void addCommodity(TechService commodity) {
	        listOfCommodities.add(commodity);
	    }

	    public ArrayList<TechService> showCommodities() {
	        return listOfCommodities;
	    }

}
