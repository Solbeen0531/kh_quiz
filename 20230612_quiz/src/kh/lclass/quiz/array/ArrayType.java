package kh.lclass.quiz.array;

public class ArrayType {
	
	/* 배열
	
	> 크기 지정 - 선언	int [] arr = new int[3];
					Person[] personArr = new Person[3];
					Person[] personArr = new Person[] {"이름","이름2","이름3"};
					초기값 지정 시 숫자 미기입 
					
	> 활용 접근자 [index] : 0 ~ 정수
					arr [arr.length - 1] = 20;
					i < arr.length, i <= arr.length - 1;
	
	1. 기본 자료형		int [] arr = new int [3];
					기본 자료형의 크기는 고정이므로 heap에 공간이 생성되고 초기값 지정도 가능
						sysout ( arr[1]); // 0
						
	2. 참조 자료형 	Person [] perosnArr = new Person[3];
					선언 시, 크기 고정이 아니므로 heap에 공간이 생성되지 않음. 초기값은 null
						personArr[0] = new Person();
						personArr[1] = new Person();
						personArr[2] = new Person();
						각각 생성 후 사용(활용) 가능
	
		*/

}
