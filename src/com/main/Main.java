package com.main;

<<<<<<< HEAD
import java.io.BufferedReader;
=======
>>>>>>> b3db4ae4c89e805ddce77ab9b78b87c903471d63
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
	public static void getText() throws IOException {
		FileReader fr = null;
		try {
<<<<<<< HEAD
			File test = new File("src/resource/test.txt");
=======
			File test = new File("test.txt");
>>>>>>> b3db4ae4c89e805ddce77ab9b78b87c903471d63
			String testTextAbsolutePpath = test.getAbsolutePath();
			fr = new FileReader(testTextAbsolutePpath);
			char c1 = (char) fr.read();
			char c2 = (char) fr.read();
			System.out.println(c1);
			System.out.println(c2);
		} catch (FileNotFoundException fnfe) {
			System.err.println("Error: " + fnfe.getMessage());
		} catch (IOException ioe) {
			System.err.println("Error: " + ioe.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException ioe) {
				System.err.println("Error: " + ioe.getMessage());
			}
		}
		System.out.println("ファイル処理完了");
	}

	public static void netConnect() {
		try {
			URL url = new URL("http://www.impressjapan.jp/");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (MalformedURLException e) {
			System.err.println("Invalid URL format: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		getText();
		netConnect();
	}
}