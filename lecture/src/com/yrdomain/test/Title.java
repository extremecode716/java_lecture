package com.yrdomain.test;

//작성자 : ExtremeCode
public class Title {

	public static void main(String[] args) {
		String[][] arr2DText = null;	//멀티 array
		final int MAX_ROW_COUNT = 10; 	//글 라인 개수 : ROW
		final int MAX_INFO_COUNT = 4; 	//정보 개수 : COL //(제목, 작성자, 작성일, 조회)

		arr2DText = new String[MAX_ROW_COUNT][];
		for (int i = 0; i < MAX_ROW_COUNT; ++i) {
			arr2DText[i] = new String[MAX_INFO_COUNT];
		}

		// 크롤링한 정보 String 배열로 저장했다고 가정
		String[] arrTempText = { "제목", "작성자", "작성일", "조회", 
				"띵글 스톡 체험판 이렇게 사용하세요~", "라온 정달", "2020.09.02", "253",
				"[공지] 일요일 오후 9시 방송 시작합니다.", "프로그", "2020.12.27", "33", 
				"[필독]2020년 12월 신규 탐험대를 모집합니다.", "라온 정달", "2020.12.03", "54",
				"[공지] 프로그 지분 15구좌 양도합니다.", "프로그", "2020.10.27", "246",
				"[공지] 프로그 차트 특허 등록이 결정되었습니다.", "프로그", "2020.09.30", "262",
				"[필독] 신입 회원 필독사항입니다.", "라온 정달", "2020.03.03", "1,731",
				"[공지] 주식 양도 절차", "프로그", "2020.07.26", "197",
				"[공지] 이 카페를 찾아 오신 분들께", "프로그", "2020.03.25", "589",
				"[이벤트] 띵글 구매하면 선물이 팡팡!!", "라온 정달", "2019.10.31", "803"
				};

		try {
			// 크롤링한 데이터 클라 2d array에 입력
			for (int i = 0; i < arrTempText.length; ++i) {
				arr2DText[i / MAX_INFO_COUNT][i % MAX_INFO_COUNT] = arrTempText[i];
			}

			// 출력
			for (int row = 0; row < MAX_ROW_COUNT; ++row) {
				for (int col = 0; col < MAX_INFO_COUNT; ++col) {
					System.out.print(arr2DText[row][col] + "\t");
				}
				System.out.println();
			}
		}  catch (Exception e) {
			System.out.println("\n " + e + " 종료합니다.");
		}

	}

}
