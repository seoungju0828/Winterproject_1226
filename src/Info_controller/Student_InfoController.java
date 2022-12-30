package Info_controller;

//어딘가에 적어라
//학생 정보를 저장하는
//필드 : 값을 저장하기 위한 

import java.util.*;
import java.util.ArrayList;

import Class.StudentVO;

public class Student_InfoController {
	
	Scanner scan = new Scanner(System.in);
	
	public static final int CONTINUE = 1;
	public static final int EXIT = 0;
	
	ArrayList<StudentVO> svoList = new ArrayList<StudentVO>();
	
	public void insert(StudentVO svo) {
		svoList.add(svo);
	}
	
	public void view() {
		
		//개선(enhanced) 된 for문
		for (StudentVO svo : svoList) {
			System.out.print("이름 : " + svo.getName() + "\t");
			System.out.print("학번 : " + svo.getStuld() + "\t");
			System.out.print("학년 : " + svo.getGrade() + "\t");
			System.out.print("전공 : " + svo.getMajor() + "\t");
			System.out.print("주소 : " + svo.getAddress() + "\t");
			System.out.print("연락처 : " + svo.getMobile() + "\t");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arraylist선언
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> stulds = new ArrayList<Integer>();
		ArrayList<Integer> grades = new ArrayList<Integer>();
		ArrayList<String> majors = new ArrayList<String>();
		ArrayList<String> addresses = new ArrayList<String>();
		ArrayList<String> mobiles = new ArrayList<String>();
		
		//스캐너 선언
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		//반복과 종료를 확인하기위한 변수
		int flag = CONTINUE;
		
		System.out.println("======= 학생 정보 입력 =======");
		
		
		while (true) {
			if (flag == CONTINUE) {
				
				//학생 정보 입력
				System.out.print("이름 : ");
				names.add(s1.nextLine());
				System.out.println(" ");
				
				System.out.print("학번 : ");
				stulds.add(s2.nextInt());
				System.out.println(" ");
				
				System.out.print("학년 : ");
				grades.add(s2.nextInt());
				System.out.println(" ");
				
				System.out.print("전공 : ");
				majors.add(s1.nextLine());
				System.out.println(" ");
				
				System.out.print("주소 : ");
				addresses.add(s1.nextLine());
				System.out.println(" ");
				
				System.out.print("연락처 : ");
				mobiles.add(s1.nextLine());
				System.out.println(" ");
			}
			//만약 종료(2)를 선택했을 경우 프로그램을 빠져나간다
			else if (flag == EXIT) {
				break;
			}
			
			//한번 더 물어봐잉
			System.out.println("계속 입력 하시겠습니까?");
			System.out.println("계속 : 1 | 종료 : 2");
			System.out.print("입력 : ");
			flag = s2.nextInt();
			
			System.out.println("-----------------------------------");
			
		}
		
		Student_InfoController controller = new Student_InfoController();
		
		for (int i=0; i<names.size(); i++) {
			StudentVO svo = new StudentVO(names.get(i), stulds.get(i), grades.get(i), majors.get(i), addresses.get(i), mobiles.get(i));
			controller.insert(svo);
		}
		
		controller.view();
		s1.close();
		s2.close();
	}

}
