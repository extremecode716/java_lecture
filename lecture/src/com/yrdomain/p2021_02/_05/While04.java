package com.yrdomain.p2021_02._05;

public class While04 {
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
	
	private static void print3DArrayToMultiplicationTable(final int[][][] _arr3D) {
		for (int i = 2; i < MAX_SIZE; ++i) {
			System.out.format("-----%d단-----\n", i);
			for (int j = 1; j < MAX_SIZE; ++j) {
				System.out.format("%-2dx%2d =%3d\n", _arr3D[i][j][0], _arr3D[i][j][1], _arr3D[i][j][2]);
			}
		}
	}
	
	public static void main(String[] args) {
		// [단] x [수] = {단 ,수 ,결과 };
		final int[][][] arr3D = new int[MAX_SIZE][MAX_SIZE][3];

		set3DArrayFromMultiplicationTable(arr3D);
		print3DArrayToMultiplicationTable(arr3D);
	}


}
