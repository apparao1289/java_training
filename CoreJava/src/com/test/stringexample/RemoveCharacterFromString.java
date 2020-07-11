package com.test.stringexample;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		RemoveCharacterFromString rc = new RemoveCharacterFromString();
		System.out.println(rc.removeCharacter("welcome", 'o'));
	}

	public String removeCharacter(String s, char removeCharacter) {
		StringBuffer sb = new StringBuffer();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (c != removeCharacter) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
