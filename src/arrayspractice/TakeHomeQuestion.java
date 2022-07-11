package arrayspractice;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class TakeHomeQuestion {
	
	public String doesFileExist(String path) {
		return "externalFileData\\info.porperties";
	}

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("externalFileData\\info.porperties");
		Properties prop = new Properties();
		prop.load(fi);
	System.out.println(prop.get("word1"));
	System.out.println(prop.get("word2"));
			
		}
		
	}


