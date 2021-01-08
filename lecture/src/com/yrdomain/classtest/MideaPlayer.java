package com.yrdomain.classtest;

public class MideaPlayer {
	// 슬라이드 has-a 추가할 것.
	// button has-a 추가할 것.
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
	// 수신 정보들
	// midea data 정보들
	// private double m_dLoadStartTime; ~endTime
    // private boolean m_bSubtitle;
	// 수신 speed , 인코딩 data, 디코딩 data

	// 클래스화 해서 저장하고있을 필드들
	// 영상 화질 
	// 사용자 환경 size;
	// 영상 사이즈 width, height ;
	//
	///////////////////////////////////
	
	// 영상 재생
	public void play() {
		m_bPlay = true;
		m_bPause = (m_bPlay == true) ? (m_bPause = false) : (m_bPause = true);
		/* 
		 
		*/
	}

	// 영상 정지
	public void pause() {
		m_bPlay = false;
		m_bPause = (m_bPlay == true) ? (m_bPause = false) : (m_bPause = true);
		/*
		 * 
		 */
	}
	
	// 영상 다음
	public void next() {
		
	}
	
	public void setVolume(double _dVolume)
	{
		m_dVolume = _dVolume;
		// 실질적으로 볼륨 조절
	}
	// 이벤트 + 버튼
	
	// run
	public int run() {
		
		return 0;
	}
	
	// 화면 갱신
	public int rendering() {

		return 0;
	}

	// 전체 화면 스위치
	public boolean switchToFullscrean() {

		m_bFullScreen = (m_bFullScreen == false) ? (m_bFullScreen = true) : (m_bFullScreen = false);

		return m_bFullScreen;
	}
}
