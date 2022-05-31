
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class Storage {
	String[] list = null;


	public static void main(String[] args) {
		Storage ew = new Storage();
		String filename = "C:\\Users\\gleb-\\Desktop\\shiftschedule\\test.txt";
		
		ew.loader(filename);
		
	}

	public void loader(String filename) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filename));) {
			String input = " ";
			

			while ((input = reader.readLine()) != null) {
				if (!input.isEmpty()) {
					list = input.split(";");

					try {
						String a = list[0];
						int b = Integer.parseInt(list[1]);
						Employee e = new Employee(a, b);
						System.out.println(e);
					} catch (NumberFormatException ex) {
						System.err.println("Invalid Name or ID");
					}

				}
			}
		}catch(IOException ioe) {
			System.out.println("NO File Found!");
		}
	}
	public void saver(String filename, String[] list) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename));){
			String conv = ""; 
			for(String y : list) {
				conv += y;
				char[] a = conv.toCharArray();
				writer.write(a);
			}
		}catch(IOException ioe) {
			System.out.println("Output failure");
		}
	}
}