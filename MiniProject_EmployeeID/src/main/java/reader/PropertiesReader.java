package reader;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesReader {

	Properties properties = null;

	public PropertiesReader() {
		String currentProjectLocation = System.getProperty("user.dir");
		String insideProjectFileLocation = "/src/main/resources/configuration.properties";

		String configgurationPageLocation = currentProjectLocation + insideProjectFileLocation;
		FileReader fr = null;
		properties = new Properties();
		try {
			fr = new FileReader(configgurationPageLocation);
			properties.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getBrowserName() {
		return (String) properties.get("browsername");
	}
	
	public String getURL() {
		return (String) properties.get("url");
	}
	
	public Integer getHardWait() {
		String hardWait = (String) properties.get("hardWait");
		return Integer.parseInt(hardWait);
	}
	

//	public static void main(String[] args) throws FileNotFoundException {
//
//		String currentProjectLocation = System.getProperty("user.dir");
//		String insideProjectFileLocation = "/src/main/resources/configuration.properties";
//
//		String configgurationPageLocation = currentProjectLocation + insideProjectFileLocation;
//		FileReader fr = new FileReader(configgurationPageLocation);
//		Properties properties = new Properties();
//		try {
//			properties.load(fr);
//			String bn = (String) properties.get("browsername");
//			System.out.println(bn);
//			String hardWait = (String) properties.get("hardWait");
//			int h = Integer.parseInt(hardWait);
//			System.out.println(h);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
}
