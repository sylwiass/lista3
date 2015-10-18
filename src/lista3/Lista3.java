package lista3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Lista3 {

    public static void main(String[] args) {
        
        Lista3 obj = new Lista3();
        obj.run();
        
    }
    
    public void run(){
       String file = "/Users/Sylwia/Desktop/lista.csv";
       BufferedReader br = null;
       String line = "";
       String cvsSplitBy = ",";
       
       try {

		Map<String, String> maps = new HashMap<String, String>();

		br = new BufferedReader(new FileReader(file));
		while ((line = br.readLine()) != null) {

			String[] name = line.split(cvsSplitBy);

			maps.put(name[0], name[1]);

                }
		for (Map.Entry<String, String> entry : maps.entrySet()) {

			System.out.println("Imię " + entry.getKey() + "Nazwisko "
				+ entry.getValue());

		}

                } catch (FileNotFoundException e) {
		e.printStackTrace();
            } catch (IOException e) {
		e.printStackTrace();
            } finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
  }

}

       