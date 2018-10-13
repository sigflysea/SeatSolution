import java.util.ArrayList;

public class Seat {
	int totalS;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
	
	
	Seat(){
  
   }


	public void setSeat(ArrayList<ArrayList<Integer>> al) {
		this.al= al;
	}

	public ArrayList<ArrayList<Integer>> getSeat(){
		return al;
	}

	public void setSum(int sum) {
		this.totalS= sum;
		
	}
	public int getSum(){
		return totalS;
	}

 
}
