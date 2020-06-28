package com.test.constructor;

public class SendEmail {
	
	String toEmail;
    String body;
    String subject;
    String ccEmail;
    String bbEmail;
  
  public SendEmail(String toEmail, String body) {
	 this(toEmail,body,null,null,null);
	System.out.println("Sending email 2 parameters");
  }

  public SendEmail(String toEmail, String body, String subject) {
	  this(toEmail,body,subject,null,null);
        System.out.println("Sending email 3 parameters");
  }

  public SendEmail(String toEmail, String body, String subject,String ccEmail) {
	  this(toEmail,body,subject,ccEmail,null);
        System.out.println("Sending email 4 parameters");
  }

  public SendEmail(String toEmail,String body,String subject,String ccEmail,String bbEmail) {
      // 1. getting mail server connection
	  // 2. set the parameter
	  // 3. invoke the mail api
	  System.out.println("Sending email all parameters");
	  this.toEmail = toEmail;
	  this.body = body;
	  this.subject = subject;
	  this.ccEmail = ccEmail;
	  this.bbEmail = bbEmail;
	  
	  System.out.println("tomail::"+this.toEmail);
	  
  }
  
  public static void main(String args[]) {
		
		SendEmail s1 = new SendEmail("test@gmail.com","test email sending");
		
	}

}
