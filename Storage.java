import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class Storage {
	
	public void storage() {
	 try (BufferedReader storagedrive = new BufferedReader(new FileReader(memory));){
		 int counter =0;
		 String input;
		 List <Employee> shiftSchedule = new ArrayList<>();
		
		 
		 while((input = storagedrive.readLine()) != null) {
			 if(input.isEmpty()) {
				 
			 }
		 }
		 
		 
	 }catch(IOException e) {
		 e.printStackTrace();
	 }
		  
	  
  }
}
