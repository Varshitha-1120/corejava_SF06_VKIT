package com.tnsif.onlinefooddelivery;

public class User {
       private int userid;
       private String username;
       private long contactno;
       
       public User(int userid, String username, long contactno) {
       	this.userid = userid;
       	this.username = username;
       	this.contactno = contactno;
}

	   public int getUserid() {
		   return userid;
	   }
	   public String getUsername() {
		   return username;
	   }
       public long getContactno() {
		   return contactno;
	   }

	   @Override
	   public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", contactno=" + contactno + "]";
	   }
}    
        
	   