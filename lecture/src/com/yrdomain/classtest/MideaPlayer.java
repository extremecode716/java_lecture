package com.yrdomain.classtest;

public class MideaPlayer {
	// �����̵� has-a �߰��� ��.
	// button has-a �߰��� ��.
	private boolean m_bPlay;
	private boolean m_bPause;
	private boolean m_bLoop;
	private boolean m_bFullScreen;
	private boolean m_bAutoPlay;
	
	private double m_dCureentTime;
	private double m_dStartTime;
	private double m_dEndTime;
	private double m_dSpeed;
	private double m_dVolume;

	// width , height

	/////////////////////////////////////
	// ���� ������
	// midea data ������
	// private double m_dLoadStartTime; ~endTime
    // private boolean m_bSubtitle;
	// ���� speed , ���ڵ� data, ���ڵ� data

	// Ŭ����ȭ �ؼ� �����ϰ����� �ʵ��
	// ���� ȭ�� 
	// ����� ȯ�� size;
	// ���� ������ width, height ;
	//
	///////////////////////////////////
	
	// ���� ���
	public void play() {
		m_bPlay = true;
		m_bPause = (m_bPlay == true) ? (m_bPause = false) : (m_bPause = true);
		/* 
		 
		*/
	}

	// ���� ����
	public void pause() {
		m_bPlay = false;
		m_bPause = (m_bPlay == true) ? (m_bPause = false) : (m_bPause = true);
		/*
		 * 
		 */
	}
	
	// ���� ����
	public void next() {
		
	}
	
	public void setVolume(double _dVolume)
	{
		m_dVolume = _dVolume;
		// ���������� ���� ����
	}
	// �̺�Ʈ + ��ư
	
	// run
	public int run() {
		
		return 0;
	}
	
	// ȭ�� ����
	public int rendering() {

		return 0;
	}

	// ��ü ȭ�� ����ġ
	public boolean switchToFullscrean() {

		m_bFullScreen = (m_bFullScreen == false) ? (m_bFullScreen = true) : (m_bFullScreen = false);

		return m_bFullScreen;
	}
}
