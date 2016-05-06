package experiment;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class VerifyDevice {
	private static final String MACADDRESS = "0000 0000 0000 0000";
	private static final String EAGLE = "Eagle";
	private static final String Cloud = "00042f";
	private String Path = "C:/Users/windows.ft.w/workspace/Eclipse/Eagle/EagleInfo.txt";

	public String[] OpenFile() throws IOException{
		FileReader fr = new FileReader(Path);
		BufferedReader textReader = new BufferedReader(fr);
		int numberOfLines = 1;
		String[ ] textData = new String[numberOfLines];
		int i;

		for (i=0; i < numberOfLines; i++) {
		textData[ i ] = textReader.readLine();

		}
		textReader.close( );
		return textData;
	}
	
	public boolean MAC(String MAC){

		if(MAC == MACADDRESS){
			return true;
		}
		return false;
	}
	
	public boolean Eagle(String Device){
		if(Device == EAGLE){
			return true;
		}
		return false;
	}
	
	public boolean CloudID(String CloudID) throws IOException{
		VerifyDevice myFile = new VerifyDevice();
		String[] id = myFile.OpenFile();
		//Cloud = id[0];
		System.out.println(Cloud);
		System.out.println(CloudID);

		if(id[0].equals(Cloud)){
			return true;
		}
		return false;
	}
}
