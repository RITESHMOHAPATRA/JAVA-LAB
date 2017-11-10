import java.io.*;
import java.util.Scanner;

class WriteToFile {


	public static void main(String[] args) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			System.out.println("enter string to be written");

			fw = new FileWriter("test.txt");
			bw = new BufferedWriter(fw);
			bw.write(new Scanner(System.in).nextLine());
			//fw.write("hello");

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}