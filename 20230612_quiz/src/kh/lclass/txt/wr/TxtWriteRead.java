package kh.lclass.txt.wr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtWriteRead {

	public void txtRead() {
		System.out.println("== txtFileRead 시작 ==");
		
		String filePath = "D:/data2/test/b.txt"; // 실존하지 않는 파일 이름인 경우 FileNotFound 에러 발생
		FileReader fr = null;

		try {
			fr = new FileReader(filePath);

			int cntPerRead = 30;
			char[] readCharArr = new char[200];
			for (int i = 0; i < readCharArr.length / cntPerRead; i++) {
				int readCnt = fr.read(readCharArr, i * cntPerRead, cntPerRead);
				
				if (readCnt < cntPerRead) {
					break;
				}
			}
			System.out.println(readCharArr); 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Cannot File. Check path.");
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			// 변수가 없으면 종료할 수 없다.
			try {
				if (fr != null) { // ' null 이 아니면 ' 항목을 미작성하면 NullPointer에러 발생
					fr.close();
				} // 통로를 닫기 _순서 숙지
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("== txtFileRead 끝 ==");
	}
	
	public void txtWrite() {
		System.out.println("== txtFileWrite 시작 ==");
		
		String path = "D:/data2/test";
		String filename = "a.txt";

		File f2 = new File(path, filename);

		FileWriter fw = null;

		try {
			f2.createNewFile(); // 파일 생성

			fw = new FileWriter(f2); // 문자 형태 전송이 가능한 OutputStream (File 과 java 프로그램의 통로)
			fw.write("Hello, World");
			fw.flush(); 
			return;

		} catch (IOException e) {
			System.out.println("cannot create file");
			e.printStackTrace();

		} finally { 
			try {
				if (fw != null) {
					fw.close();
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("== txtFileWrite 끝 ==");
	}
}

