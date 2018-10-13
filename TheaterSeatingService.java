import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TheaterSeatingService {

	public Seat processLayout(String layout){
		Seat st = new Seat();
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		String [] all = layout.split(System.lineSeparator());
		String [] row;
		int sum = 0;
		
		for(int i=0; i<all.length; i++){
			row = all[i].split(" ");
			al.add(new ArrayList<Integer>());
//			System.out.println("FOR NOW\n"+Arrays.toString(row));
			for(int j=0; j<row.length; j++){
				al.get(i).add(Integer.parseInt(row[j]));
				
//count the total of available seats 
				sum +=Integer.parseInt(row[j]);

			}
		}
		st.setSeat(al);
		st.setSum(sum);
		return st;
		
//		System.out.println("FOR NOW\n"+al.get(1).get(0));
	}

	public HashMap processTRequest(String cr) {
		HashMap<String, Integer> customerR = new HashMap<>();
		String [] request = cr.split(System.lineSeparator());
		String [] perR;
		for(int i=0; i<request.length; i++){
			perR= request[i].split(" ");
			customerR.put(perR[0], Integer.parseInt(perR[1]));
		}
		for(Entry<String, Integer> entry: customerR.entrySet()){
//			System.out.println("FOR Customer:\n"+entry.getKey() +entry.getValue());
			 
			 
		}
		return customerR;
	}

	public void assignSeat(Seat st, Map<String, Integer> customerR) {
		ArrayList<ArrayList<Integer>> seats = new ArrayList<ArrayList<Integer>>();
		HashMap<String, Integer> requests = new HashMap<>();
		int totalS=0;
		
		totalS=st.getSum();
		seats = st.getSeat();
	    Iterator<Map.Entry<String, Integer>> iterator = requests.entrySet().iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
//		for(Map.Entry<String,Integer> entry: requests.entrySet()){
//			System.out.println(" Sorry");
//			if(entry.getValue()>totalS){
//				System.out.println(entry.getKey()+" Sorry, we can't handle the party. ");
//			}
//		}
		
		
	}
}
