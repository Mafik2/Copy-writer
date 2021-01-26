package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("output"));
			int a = 3;
			int b = 0;
			while (a < b) {
				for (int i = 0; i < 3; i++) {
					bw.write("Hello World");
					bw.newLine();
				}

				bw.close();
			}

		}catch (IOException e) {
			System.out.println("Can't write to file.");


		}


	}
}
