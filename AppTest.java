package com.mycompany.LibrarySystem;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public class Books {
        
      public String BookId;
      public String BookName;
      public String BookAuthor;
      public String YearofPub;
      public float Price;
      public String status;
      
          public Books (){
             BookId ="Id";
             BookName ="aName";
             BookAuthor = "anAuthor";
             YearofPub = "aYear";
             Price = 1;
             }
          
          public void setId (String Id){
              BookId = Id;
              }
          
           public void setName (String aName){
              BookName = aName;
              }
       
           public void setAuthor (String anAuthor){
              BookAuthor = anAuthor;
              }
     
         public void setYear (String aYear){
              YearofPub = aYear;
              }
         
          public void setPrice (float aPrice){
              Price= aPrice;
              }
    }
    
    class ReferenceBook extends Books {
        
    }
    
    public class publisher {
        public int PublisherId;
        public String PublisherName;
        public String PublisherAddress;
        public int PublisherNo;
        
        
        public publisher (){
         PublisherId = 23;
         PublisherName = "pName";
         PublisherAddress = "pAddress";
         PublisherNo = 22;
        }
        
         public void setPubId(int pId){
              PublisherId= pId;
              }
         
         public void setPubName(String pName){
              PublisherName= pName;
              }
         
          public void setPubAd(String pAddress){
              PublisherAddress= pAddress;
              }
          
           public void setPubNo(int pNo){
              PublisherNo= pNo;
              }
    }
    
    public class Librarian {
        public int Id;
        public String Name;
        
        public Librarian (){
            Id = 21;
            Name = "lname";
       }
       
         public void setId(int id){
              Id= id;
              }
         
         public void setName(String name){
              Name= name;
              }
    }
    
    public class User {
        public int UserId;
        public String UserName;
        public String UserAddress;
        public int PhoneNo;
        
        public User () {
            UserId = 20;
            UserName = "uName";
            UserAddress = "uAddress";
            PhoneNo = 19;
        }
        
         public void setUserId(int uId){
              UserId = uId;
              }
         
         public void setUserNamer(String uname){
              UserName = uname;
              }
         
         public void setUserAddress(String uadd){
              UserAddress = uadd;
              }
         
         public void setPhoneNo(int uphone){
              PhoneNo = uphone;
              }
    }
   
}
