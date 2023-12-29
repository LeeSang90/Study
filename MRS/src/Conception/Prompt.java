package Conception;

import java.util.Scanner;

public class Prompt {
	Scanner sc = new Scanner(System.in);

	String id;
	String pw;
	String phone;
	String name;
	String prompt;

	public void display_menu() {
		System.out.println("\n======= 영화 예매 =======\n");
		System.out.println("    1. 회원\n    2. 관리자\n    3. 예매\n    4. 종료\n");
		System.out.print("  번호를 입력해주세요. > ");
	}

	public void input_idpw() {
		System.out.print("\nID를 입력해주세요. > ");
		id = sc.nextLine();
		System.out.print("\nPW를 입력해주세요. > ");
		pw = sc.nextLine();
	}

	public void input_idphone() {
		System.out.print("\nID를 입력해주세요. > ");
		id = sc.nextLine();
		System.out.print("\n전화번호를 입력해주세요. > ");
		phone = sc.nextLine();
	}

	public void input_namephone() {
		System.out.print("\n이름을 입력해주세요. > ");
		name = sc.nextLine();
		System.out.print("\n전화번호를 입력해주세요. > ");
		phone = sc.nextLine();
	}

	// =================================관리자 부분=================================
	// //이상효
	public void login_admin() {
		prompt = """
				======= 메뉴선택 =======

				   1. 관리자 로그인
				   2. 관리자 ID 찾기
				   3. 관리자 PW 찾기
				   4. 관리자 탈퇴
				   5. 관리자 PW 변경
				   6. 나가기

				  번호를 입력해주세요. > """;
		System.out.print("\n" + prompt);
	}

	public void display_adm_menu() {
		prompt = """
				======= 메뉴선택 =======
					
				    0. 관리자 등록
				    1. 영화 추가
				    2. 영화 삭제
				    3. 상영 영화 등록
				    4. 나가기

				  번호를 입력해주세요. > """;
		System.out.print("\n" + prompt);
	}
	// ==========================================================================
}