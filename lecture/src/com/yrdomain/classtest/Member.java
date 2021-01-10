package com.yrdomain.classtest;

// 작성자: 김동일 // model
// 파일: Member.java
public class Member {

	private String m_strLastName; // 성
	private String m_strFirstName; // 이름
	private String m_strEmailID; // ID: 이메일 주소
	private String m_strPw; // PW: 비밀번호
	private String m_strPhoneNumber; // 전화번호
	private boolean m_bTermsOfService; // 이용약관

	public Member() {
		m_strLastName = null;
		m_strFirstName = null;
		m_strEmailID = null;
		m_strPw = null;
		m_strPhoneNumber = null;
		m_bTermsOfService = false;
	}

	public Member(final Member _pOther) {
		m_strLastName = _pOther.m_strLastName;
		m_strFirstName = _pOther.m_strFirstName;
		m_strEmailID = _pOther.m_strEmailID;
		m_strPw = _pOther.m_strPw;
		m_strPhoneNumber = _pOther.m_strPhoneNumber;
		m_bTermsOfService = _pOther.m_bTermsOfService;
	}

	public void reset() {
		m_strLastName = null;
		m_strFirstName = null;
		m_strEmailID = null;
		m_strPw = null;
		m_strPhoneNumber = null;
		m_bTermsOfService = false;
	}

	public Member clone() {
		return new Member(this);
	}

	// setter
	public void setLastName(String _strLastName) {
		m_strLastName = _strLastName;
	}

	public void setFirstName(String _strFirstName) {
		m_strFirstName = _strFirstName;
	}

	public void setEmailID(String _strEmailID) {
		m_strEmailID = _strEmailID;
	}

	public void setPw(String _strPw) {
		m_strPw = _strPw;
	}

	public void setPhoneNumber(String _strPhoneNumber) {
		m_strPhoneNumber = _strPhoneNumber;
	}

	public void setTermsOfService(boolean _bTermsOfService) {
		m_bTermsOfService = _bTermsOfService;
	}

	// getter
	public String getLastName() {
		return m_strLastName;
	}

	public String getFirstName() {
		return m_strFirstName;
	}

	public String getEmailID() {
		return m_strEmailID;
	}

	public String getPw() {
		return m_strPw;
	}

	public String getPhoneNumber() {
		return m_strPhoneNumber;
	}

	public boolean isTermsOfService() {
		return m_bTermsOfService;
	}

}
