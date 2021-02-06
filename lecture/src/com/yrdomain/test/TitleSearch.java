package com.yrdomain.test;

import java.util.Scanner;

//�ۼ��� : ExtremeCode
public class TitleSearch {

	final static int MAX_ROW_COUNT = 10; // �� ���� ���� : ROW
	final static int MAX_INFO_COUNT = 4; // ���� ���� : COL //(����, �ۼ���, �ۼ���, ��ȸ)

	private static void searchTitle(final String[][] _arr2DText, Scanner _sc) {

		String strInputText = _sc.nextLine();

		System.out.println("--------------------------------------");
		int iSearchCount = 0;
		for (int row = 1; row < MAX_ROW_COUNT; ++row) {
			if (_arr2DText[row][0].matches(".*" + strInputText + ".*")) {
				for (int col = 0; col < MAX_INFO_COUNT; ++col) {
					System.out.print(_arr2DText[row][col] + "\t");
				}
				System.out.println();
				++iSearchCount;
			}
		}
		System.out.println("======= " + iSearchCount + " ���� Title�� �˻��Ͽ����ϴ� =======");
		System.out.println("--------------------------------------");
	}

	public static void main(String[] args) {
		String[][] arr2DText = null; // ��Ƽ array

		arr2DText = new String[MAX_ROW_COUNT][];
		for (int i = 0; i < MAX_ROW_COUNT; ++i) {
			arr2DText[i] = new String[MAX_INFO_COUNT];
		}

		Scanner sc = new Scanner(System.in);

		// ũ�Ѹ��� ���� String �迭�� �����ߴٰ� ����
		String[] arrTempText = { "����", "�ۼ���", "�ۼ���", "��ȸ", "��� ���� ü���� �̷��� ����ϼ���~", "��� ����", "2020.09.02", "253",
				"[����] �Ͽ��� ���� 9�� ��� �����մϴ�.", "���α�", "2020.12.27", "33", "[�ʵ�]2020�� 12�� �ű� Ž��븦 �����մϴ�.", "��� ����",
				"2020.12.03", "54", "[����] ���α� ���� 15���� �絵�մϴ�.", "���α�", "2020.10.27", "246",
				"[����] ���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�", "2020.09.30", "262", "[�ʵ�] ���� ȸ�� �ʵ������Դϴ�.", "��� ����", "2020.03.03",
				"1,731", "[����] �ֽ� �絵 ����", "���α�", "2020.07.26", "197", "[����] �� ī�並 ã�� ���� �е鲲", "���α�", "2020.03.25",
				"589", "[�̺�Ʈ] ��� �����ϸ� ������ ����!!", "��� ����", "2019.10.31", "803" };

		try {
			// ũ�Ѹ��� ������ Ŭ�� 2d array�� �Է�
			for (int i = 0; i < arrTempText.length; ++i) {
				arr2DText[i / MAX_INFO_COUNT][i % MAX_INFO_COUNT] = arrTempText[i];
			}

			// ���
			for (int row = 0; row < MAX_ROW_COUNT; ++row) {
				for (int col = 0; col < MAX_INFO_COUNT; ++col) {
					System.out.print(arr2DText[row][col] + "\t");
				}
				System.out.println();
			}

			while (true) {
				System.out.print("String to search for in titles: ");
				searchTitle(arr2DText, sc);
			}
		} catch (Exception e) {
			System.out.println("\n " + e + " �����մϴ�.");
		} finally {
			sc.close();
		}
	}

}
