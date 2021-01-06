package com.yrdomain.test;
import java.util.Scanner;
//�ۼ��� : �赿��
//������ ��� (3���� �迭��)
public class MultiplicationTable {
	private static final int MAX_SIZE = 10;
	private static void set3DArrayFromMultiplicationTable(final int[][][] _arr3D) {
		for (int i = 0; i < MAX_SIZE; ++i) {
			for (int j = 0; j < MAX_SIZE; ++j) {
				_arr3D[i][j][0] = i;
				_arr3D[i][j][1] = j;
				_arr3D[i][j][2] = _arr3D[i][j][0] * _arr3D[i][j][1];
			}
		}
	}
	private static boolean print2EnteredNumberToTimesTable(final int[][][] _arr3D, int _iEnteredNum1, int _iEnteredNum2) {
		if (_iEnteredNum1 < 0 || _iEnteredNum1 > MAX_SIZE - 1 || _iEnteredNum2 < 0 || _iEnteredNum2 > MAX_SIZE - 1)
			return false;

		System.out.format("-----%d��-----\n", _iEnteredNum1);
		for (int j = 1; j < MAX_SIZE; ++j) {
			System.out.format("%-2dx%2d =%3d\n", _arr3D[_iEnteredNum1][j][0], _arr3D[_iEnteredNum1][j][1],
					_arr3D[_iEnteredNum1][j][2]);
		}

		System.out.format("-----%d��-----\n", _iEnteredNum2);
		for (int j = 1; j < MAX_SIZE; ++j) {
			System.out.format("%-2dx%2d =%3d\n", _arr3D[_iEnteredNum2][j][0], _arr3D[_iEnteredNum2][j][1],
					_arr3D[_iEnteredNum2][j][2]);
		}
		return true;
	}
	@SuppressWarnings("unused")
	private static void print3DArrayToMultiplicationTable(final int[][][] _arr3D) {
		for (int i = 2; i < MAX_SIZE; ++i) {
			System.out.format("-----%d��-----\n", i);
			for (int j = 1; j < MAX_SIZE; ++j) {
				System.out.format("%-2dx%2d =%3d\n", _arr3D[i][j][0], _arr3D[i][j][1], _arr3D[i][j][2]);
			}
		}
	}
	public static void main(String[] args) {
		// [��] x [��] = {�� ,�� ,��� };
		final int[][][] arr3D = new int[MAX_SIZE][MAX_SIZE][3];

		set3DArrayFromMultiplicationTable(arr3D);
		//print3DArrayToMultiplicationTable(arr3D);

		Scanner sc = new Scanner(System.in);

		try {
			String strInputData1 = null;
			String strInputData2 = null;
			do {
				System.out.println("--����� ���ϴ� �ܼ� 2���� �Է��Ͻÿ�--");
				System.out.print("�ܼ� : ");
				strInputData1 = sc.nextLine();
				System.out.print("�ܼ� : ");
				strInputData2 = sc.nextLine();
				if (!print2EnteredNumberToTimesTable(arr3D, Integer.parseInt(strInputData1),
						Integer.parseInt(strInputData2))) {
					System.out.println("ArrayIndexOutOfBounds and terminating.");
					break;
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
	}

}
