package com.yrdomain.test;

import java.io.IOException;

//작성자 : 김동일
public class Paging {
	final static int MAX_SIZE = 100;
	final static int MAX_VIEW_COUNT = 10;
	final static int START_VIEW_NUM = 0; // Start_view_num (0 ~ (MAX_SIZE - 1))

	public static void main(String[] args) throws IOException {

		final String[] arrPage = new String[MAX_SIZE];

		int iCurrentPageIndex = START_VIEW_NUM;
		if (iCurrentPageIndex >= MAX_SIZE || iCurrentPageIndex < 0)
			iCurrentPageIndex = 0;
		int iPageViewStartIndex = iCurrentPageIndex / MAX_VIEW_COUNT * MAX_VIEW_COUNT;
		int iPageViewEndIndex = iPageViewStartIndex + MAX_VIEW_COUNT;

		int keyCode = -1;

		for (int i = 0; i < MAX_SIZE; ++i) {
			arrPage[i] = Integer.toString(i + 1);
		}

		while (true) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.print("<< < ");
				for (int i = iPageViewStartIndex; i < MAX_SIZE && i < iPageViewEndIndex; ++i) {
					// bold 명령어 안되서 괄호로 표현.
					if (i == iCurrentPageIndex) {
						System.out.print("(" + arrPage[i] + ")");
					} else {
						System.out.print(arrPage[i]);
					}
					if (i < iPageViewEndIndex - 1) {
						System.out.print(" | ");
					}
				}

				System.out.print(" > >>");
				System.out.println();

				System.out.println("( 1 왼쪽 | 2 오른쪽 | 3 왼쪽 < | 4 오른쪽 > )");
				System.out.print("input number : ");
			}
			// 입력 스트림에서 데이터의 다음 바이트를 읽음. (0~255) 다음 바이트가 없을 경우, -1을 리턴, 입력 데이터 사용할 수 있을 때까지
			// 스트림 끝이 감지.
			keyCode = System.in.read();

			switch (keyCode) {
			case 49: // 1 누르면 왼쪽
				iCurrentPageIndex = (iCurrentPageIndex > 0) ? (--iCurrentPageIndex) : (iCurrentPageIndex = 0);
				iPageViewStartIndex = iCurrentPageIndex / MAX_VIEW_COUNT * MAX_VIEW_COUNT;
				iPageViewEndIndex = (iPageViewStartIndex + MAX_VIEW_COUNT < MAX_SIZE)
						? (iPageViewEndIndex = iPageViewStartIndex + MAX_VIEW_COUNT)
						: (iPageViewEndIndex = MAX_SIZE);
				break;
			case 50: // 2 누르면 오른쪽
				iCurrentPageIndex = (iCurrentPageIndex < MAX_SIZE - 1) ? (++iCurrentPageIndex)
						: (iCurrentPageIndex = MAX_SIZE - 1);
				iPageViewStartIndex = iCurrentPageIndex / MAX_VIEW_COUNT * MAX_VIEW_COUNT;
				iPageViewEndIndex = (iPageViewStartIndex + MAX_VIEW_COUNT < MAX_SIZE)
						? (iPageViewEndIndex = iPageViewStartIndex + MAX_VIEW_COUNT)
						: (iPageViewEndIndex = MAX_SIZE);
				break;
			case 51: // 3 누르면 10 page 왼쪽
				iCurrentPageIndex = (iCurrentPageIndex > MAX_VIEW_COUNT)
						? (iCurrentPageIndex = (iCurrentPageIndex - MAX_VIEW_COUNT) / MAX_VIEW_COUNT * MAX_VIEW_COUNT)
						: (iCurrentPageIndex = 0);
				iPageViewStartIndex = iCurrentPageIndex / MAX_VIEW_COUNT * MAX_VIEW_COUNT;
				iPageViewEndIndex = (iPageViewStartIndex + MAX_VIEW_COUNT < MAX_SIZE)
						? (iPageViewEndIndex = iPageViewStartIndex + MAX_VIEW_COUNT)
						: (iPageViewEndIndex = MAX_SIZE);
				break;
			case 52: // 4누르면 10 page 오른쪽
				iCurrentPageIndex = (iCurrentPageIndex < MAX_SIZE - MAX_VIEW_COUNT)
						? (iCurrentPageIndex = (iCurrentPageIndex + MAX_VIEW_COUNT) / MAX_VIEW_COUNT * MAX_VIEW_COUNT)
						: (iCurrentPageIndex = MAX_SIZE - 1);
				iPageViewStartIndex = iCurrentPageIndex / MAX_VIEW_COUNT * MAX_VIEW_COUNT;
				iPageViewEndIndex = (iPageViewStartIndex + MAX_VIEW_COUNT < MAX_SIZE)
						? (iPageViewEndIndex = iPageViewStartIndex + MAX_VIEW_COUNT)
						: (iPageViewEndIndex = MAX_SIZE);
				break;
			default:
				break;
			}
		}

	}
}
