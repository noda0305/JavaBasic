package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		FileReader fr = null;
		try {
			File test = new File("test.txt");
			String testTextAbsolutePpath = test.getAbsolutePath();
			fr = new FileReader(testTextAbsolutePpath);
			char c1 = (char) fr.read();
			char c2 = (char) fr.read();
			System.out.println(c1);
			System.out.println(c2);
		} catch (FileNotFoundException fnfe) {
			// ファイルが見つからなかったときの例外処理
			System.out.println(fnfe);
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			// それ以外の例外処理
			System.out.println(ioe);
			ioe.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException ioe) {
				// closeに失敗したときの例外処理
				System.out.println(ioe);
				ioe.printStackTrace();
				throw ioe;
			}
		}
		System.out.println("ファイル処理完了");
	}
}