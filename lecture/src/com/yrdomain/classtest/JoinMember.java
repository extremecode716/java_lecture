package com.yrdomain.classtest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

//ÀÛ¼ºÀÚ: ExtremeCode //control
//ÆÄÀÏ:JoinMember.java
public class JoinMember {
	private static JoinMember gJoinMember = new JoinMember();

	// DB·Î °¡Á¤.
	static List<Member> listMemberDB = new ArrayList<Member>();

	private Member m_memberData = null;

	private JoinMember() {
		m_memberData = new Member();
	}

	public static JoinMember getInstance() {
		return gJoinMember;
	}

	public Member getMemberData() {
		return m_memberData;
	}

	// È¸¿ø°¡ÀÔ Á¦Ãâ
	public boolean submit() {
		if (m_memberData == null)
			return false;

		if (m_memberData.getLastName() == null || m_memberData.getFirstName() == null
				|| m_memberData.getEmailID() == null || m_memberData.getPw() == null
				|| m_memberData.isTermsOfService() == false)
			return false;

		listMemberDB.add(m_memberData.clone()); // Deep Copy
		m_memberData.reset();
		return true;
	}

	///////////////////////////////////////////////////
	// Last Name
	EnumJoinMember checkLastName(final String _strLastName) {
		// Á¤±Ô½Ä °Ë»ç
		if (!isRegularLastName(_strLastName))
			return EnumJoinMember.REGULAR_LASTNAME_FAILED;

		// DB Áßº¹ È®ÀÎ
//		if (isFindLastNameFromDB(_strLastName)) {
//			return EnumJoinMember.FIND_LASTNAME_SUCCED;
//		}

		return EnumJoinMember.CHECK_LASTNAME_SUCCED;
	}

	boolean isRegularLastName(final String _strLastName) {
		if (Pattern.matches("^[°¡-ÆR]{1,10}|[a-zA-Z]{1,15}$", _strLastName))
			return true;

		return false;
	}

	boolean isFindLastNameFromDB(final String _strLastName) {
		for (Member member : listMemberDB) {
			if (member.getLastName().equals(_strLastName))
				return true;
		}
		return false;
	}

	//////////////////////////////////////////////////
	// First Name
	EnumJoinMember checkFirstName(final String _strFirstName) {
		// Á¤±Ô½Ä °Ë»ç
		if (!isRegularFirstName(_strFirstName))
			return EnumJoinMember.REGULAR_FIRSTNAME_FAILED;

		// DB Áßº¹ È®ÀÎ
//		if (isFindFirstNameFromDB(_strFirstName)) {
//			return EnumJoinMember.FIND_FIRSTNAME_SUCCED;
//		}

		return EnumJoinMember.CHECK_FIRSTNAME_SUCCED;
	}

	boolean isRegularFirstName(final String _strFirstName) {
		if (Pattern.matches("^[°¡-ÆR]{1,10}|[a-zA-Z]{1,25}$", _strFirstName))
			return true;

		return false;
	}

	boolean isFindFirstNameFromDB(final String _strFirstName) {
		for (Member member : listMemberDB) {
			if (member.getFirstName().equals(_strFirstName))
				return true;
		}
		return false;
	}

	//////////////////////////////////////
	// Email ID
	EnumJoinMember checkEmailID(final String _strEmailID) {
		// Á¤±Ô½Ä °Ë»ç
		if (!isRegularEmailID(_strEmailID))
			return EnumJoinMember.REGULAR_EMAILID_FAILED;

		// DB Áßº¹ È®ÀÎ
		if (isFindEmailIDFromDB(_strEmailID)) {
			return EnumJoinMember.FIND_EMAILID_SUCCED;
		}

		return EnumJoinMember.CHECK_EMAILID_SUCCED;
	}

	boolean isRegularEmailID(final String _strEmailID) {
		if (Pattern.matches("^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$",
				_strEmailID))
			return true;

		return false;
	}

	boolean isFindEmailIDFromDB(final String _strEmailID) {
		for (Member member : listMemberDB) {
			if (member.getEmailID().equals(_strEmailID))
				return true;
		}
		return false;
	}

	//////////////////////////////////////
	// Pw
	EnumJoinMember checkPw(final String _strPw) {
		// Á¤±Ô½Ä °Ë»ç
		if (!isRegularPw(_strPw))
			return EnumJoinMember.REGULAR_PW_FAILED;

		return EnumJoinMember.CHECK_PW_SUCCED;
	}

	boolean isRegularPw(final String _strPw) {
		if (Pattern.matches("^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,20}$", _strPw))
			return true;

		return false;
	}

}
