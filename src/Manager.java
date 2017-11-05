import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Manager {

	private String fileName;
	public Wifi wifi;
	public Wifi[] wifiArr = new Wifi[11];
	
	public Manager(String FN){
		this.fileName = FN;
		readFile(FN);
	}
	
	public static void main(String [] args){

		Manager m = new Manager("Assign0//gmon_wlan_export_2017_10_26.txt");
		m.filterBySSID();
		m.writeFile("/Users/marki/Desktop/gmon_wlan_export_2017_10_26.csv");
//				File t = new File("/Users/gal/Desktop/TestMark/1.txt");
//				t.writeFile("/Users/gal/Desktop/TestMark/1.csv");
	}

	public void readFile(String fileName)
	{
		int counter = 0;
		try{
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			String str = br.readLine(); // first line is #Format
			while(br.readLine() != null || counter <= 11){
				str = br.readLine();
				String [] s1 = str.split(";");
				wifi = new Wifi(s1);
				if(counter == 11){
					break;
				}
				wifiArr[counter] = wifi;
				counter++;
			}	
		}
		catch(IOException ex){
			System.out.println("error reading file \n");
			System.exit(2);
		}
	}
	
	public void writeFile(String fileName )
	{
		
		try{
			FileWriter fw = new FileWriter(fileName);
			PrintWriter outs = new PrintWriter(fw);		
			for (int i = 0; i < 11; i++) {
				wifi = wifiArr[i].get();	
				String[] arr = wifi.getValues();
				for (int j = 0; j < 11; j++) {
					outs.print(arr[j] + " ,");
				}
				outs.println();
			}
			outs.println();
			outs.close();
			fw.close();
		}
		catch(IOException ex){
			System.out.println("error writing file\n" + ex);
		}
	}
	public void filterBySSID(){
		Wifi temp = new Wifi();
		int x;
		for (int i = 0; i < wifiArr.length; i++) {
			for (int j = 0; j < wifiArr.length; j++) {
				x = wifiArr[i].getSSID().compareToIgnoreCase(wifiArr[j].getSSID());
				if(x <= 0){
					temp = wifiArr[i];
					wifiArr[i] = wifiArr[j];
					wifiArr[j] = temp;
				}
			}
		}
	}
}

