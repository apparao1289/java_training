package com.test.interfaceexample;

public class CompanyImpl implements Company  {

	@Override
	public void getDetails(String id) {
		System.out.println("Person details for given id::"+id);
	}

	@Override
	public void getDepartmentDetails(String deptId) {
		System.out.println("Dept details for given id::"+deptId);
	}
	
	public static  void main(String args[]) {
		Company company = new CompanyImpl();
		company.getDetails("123");
		company.getDepartmentDetails("10");
	}
}
