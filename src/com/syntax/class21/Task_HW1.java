package com.syntax.class21;

public class Task_HW1 {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through
    constructor call. Print users name, mobile number and address in userDetails method. Test your code.
 */
}
    class UserClass{
            String name;

            String mobileNumber;

            public UserClass (String name, String mobileNumber, String breed) {
                this.name = name;
                this.mobileNumber = mobileNumber;

    }
        public UserClass (String name, String mobileNumber) {
            this.name = name;
            this.mobileNumber = mobileNumber;

        }
}
class UserInfo extends UserClass{
    String userAddress;

     UserInfo(String name, String mobileNumber) {
        //this.userAddress=userAddress; //we cant write any line before the super()Line
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }
    void printInfo(){
        System.out.println("Name"+name+" Mobile Number "+mobileNumber+" User Address "+userAddress);
    }
}
