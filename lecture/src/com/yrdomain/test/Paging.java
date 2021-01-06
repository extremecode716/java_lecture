package com.yrdomain.test;

import java.io.IOException;

//�ۼ��� : �赿��
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
					// bold ��ɾ� �ȵǼ� ��ȣ�� ǥ��.
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

				System.out.println("( 1 ���� | 2 ������ | 3 ���� < | 4 ������ > )");
				System.out.print("input number : ");
			}
			// �Է� ��Ʈ������ �������� ���� ����Ʈ�� ����. (0~255) ���� ����Ʈ�� ���� ���, -1�� ����, �Է� ������ ����� �� ���� ������
			// ��Ʈ�� ���� ����.
			keyCode = System.in.read();

			switch (keyCode) {
			case 49: // 1 ������ ����
				iCurrentPageIndex = (iCurrentPageIndex > 0) ? (--iCurrentPageIndex) : (iCurrentPageIndex = 0);
				iPageViewStartIndex = iCurrentPageIndex / MAX_VIEW_COUNT * MAX_VIEW_COUNT;
				iPageViewEndIndex = (iPageViewStartIndex + MAX_VIEW_COUNT < MAX_SIZE)
						? (iPageViewEndIndex = iPageViewStartIndex + MAX_VIEW_COUNT)
						: (iPageViewEndIndex = MAX_SIZE);
				break;
			case 50: // 2 ������ ������
				iCurrentPageIndex = (iCurrentPageIndex < MAX_SIZE - 1) ? (++iCurrentPageIndex)
						: (iCurrentPageIndex = MAX_SIZE - 1);
				iPageViewStartIndex = iCurrentPageIndex / MAX_VIEW_COUNT * MAX_VIEW_COUNT;
				iPageViewEndIndex = (iPageViewStartIndex + MAX_VIEW_COUNT < MAX_SIZE)
						? (iPageViewEndIndex = iPageViewStartIndex + MAX_VIEW_COUNT)
						: (iPageViewEndIndex = MAX_SIZE);
				break;
			case 51: // 3 ������ 10 page ����
				iCurrentPageIndex = (iCurrentPageIndex > MAX_VIEW_COUNT)
						? (iCurrentPageIndex = (iCurrentPageIndex - MAX_VIEW_COUNT) / MAX_VIEW_COUNT * MAX_VIEW_COUNT)
						: (iCurrentPageIndex = 0);
				iPageViewStartIndex = iCurrentPageIndex / MAX_VIEW_COUNT * MAX_VIEW_COUNT;
				iPageViewEndIndex = (iPageViewStartIndex + MAX_VIEW_COUNT < MAX_SIZE)
						? (iPageViewEndIndex = iPageViewStartIndex + MAX_VIEW_COUNT)
						: (iPageViewEndIndex = MAX_SIZE);
				break;
			case 52: // 4������ 10 page ������
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
