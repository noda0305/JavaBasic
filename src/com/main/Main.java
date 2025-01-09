package com.main;

import java.io.BufferedReader;
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
			File test = new File("src/resource/test.txt");
			String testTextAbsolutePpath = test.getAbsolutePath();
			fr = new FileReader(testTextAbsolutePpath);
			char c1 = (char) fr.read();
			char c2 = (char) fr.read();
			System.out.println(c1);
			System.out.println(c2);
		} catch (FileNotFoundException fnfe) {
			// ファイルが見つからなかったときの例外処理
			System.err.println("Error: " + fnfe.getMessage());
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			// それ以外の例外処理
			System.err.println("Error: " + ioe.getMessage());
			ioe.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException ioe) {
				// closeに失敗したときの例外処理
				ioe.printStackTrace();
				System.err.println("Error: " + ioe.getMessage());
				throw ioe;
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
			e.printStackTrace();

		}
	}

	public static void main(String[] args) throws Exception {
		getText();
		netConnect();
	}

}
