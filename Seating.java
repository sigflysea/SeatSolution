import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Seating {

	public static void main(String[] args) {
        String line;
        StringBuilder layout = new StringBuilder();
        StringBuilder ticketRequests = new StringBuilder();
        boolean isLayoutFinished = false;
        
        System.out.println("Please enter Theater Layout and Ticket requests and then enter 'done'.\n");
	
          Scanner sc = new Scanner(System.in);
          
          while((line = sc.nextLine()) != null && !line.equals("done")){
              
              if(line.length() == 0){
                  
                  isLayoutFinished = true;
                  continue;
                  
              }
              
              if(!isLayoutFinished){
                  
                  layout.append(line + System.lineSeparator());
                  
              }else{
                  
                  ticketRequests.append(line + System.lineSeparator());
                  
              }
              
          }
          
          sc.close();
//          System.out.println("THE SEAT:\n"+layout);
//          System.out.println("THE Request:\n"+ticketRequests);

        TheaterSeatingService service = new TheaterSeatingService();

// Only two data types needed 1. Seat(2-d list, int sum), 2. map for request        
//Use HashMap to store request
        Map<String, Integer> customerR = new HashMap<>();
      
          try{
        
             
              Seat st = service.processLayout(layout.toString());

              customerR=service.processTRequest(ticketRequests.toString());
              
              service.assignSeat(st, customerR);
              
          }catch(NumberFormatException nfe){
              
              System.out.println(nfe.getMessage());
              
          }catch(Exception e){
              
              e.printStackTrace();
              
          }      
        

	}

}
