package kh.lclass.quiz.trycatchfinally;

public class TryCatchFinally {
	
	/* try ~ catch ~ finally
	
	구문
	try {
		fos = new FileOutputStream(filepath);
		fos.write(); > fos.flush();
	
		String str = null;
		while ((str = fis.readxxx()) != null){
			sysout(str);
		}
	
		// 내용
		정상적으로 수행했으면 하는 동작들
		실행중 예기치 못한 오류가 발생할 수 있음
		
		
		
		
		
		throws XxxException (Checked Exception)에 대한 처리
		return result;
	} catch ( XxxException e) {
		e.printStackTrace();
		특정 오류에 대한 메시지
	} catch ( XxxException e) {
		e.printStackTrace();
		특정 오류에 대한 메시지
	} finally {
		이 메소드가 끝나기 전 꼭 반드시 수행해야 하는 코드 작성
		try{
			if (fos != null) fos.close();
		} catch ( XxxException e ){
			e.printStackTrace();
			특정 오류에 대한 메시지
		}		
	}
	
	try 의 역할 : 에러가 발생할 수 있는 함수 구문 입력
	catch 의 역할 : Exception 발생할 수 있는 예외에 대한 예외 문구 출력
	finally 의 역할 : 값이 0이 아니도록 처리
	-
	Exception의 계보
	
	parent Throwable 
	 > Error
	 > Exception
	 > Checked Exception
	 >> try ~ catch ~ finally 블럭 지정 해결
	 
	 > Unchecked Exception
	 >> 코드로 수정하는 경우 대부분	ArithmeticException : 3 / 0
	 							IndexOutOfBoundsException : i < arr.length;
	 														i < list.size();
	 							NullPointerException : if (fs != null) {}
	
	
	*/
}
