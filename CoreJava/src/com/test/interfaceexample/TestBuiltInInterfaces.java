package com.test.interfaceexample;

import java.io.Serializable;
import java.util.Comparator;

import com.test.interfaceexample.TestBuiltInInterfaces.Emp;

public class TestBuiltInInterfaces implements Serializable,Cloneable,Runnable,Comparable<Emp>,Comparator<Emp> {

	@Override
	public void run() {
		
	}

	@Override
	public int compareTo(Emp o) {
		return 0;
	}

	@Override
	public int compare(Emp o1, Emp o2) {
		return 0;
	}
	
	class Emp {
		String id;
		String name;
	}
}
