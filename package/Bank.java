//package created thhat can be used by other file by import this package with //import bank;

package bank;
class Account{
    public String name;//access modifier 1 (public) can be completly accessed anywhere
    int age;//2 default acces modifier -can be accesed in side the same package only.
    protected String email;//3 protrected -can be acccesed by only the subclasses in other file and can be acesed in the same package.
    private  String password;//4 protected-only that slef class can acess no other class in same package can aces and other package also .
    //getters to give private password 
    public String getpassword(){
        return this.password;
    }
    //setter to set password
    public void setpassword(String pass){
        this.password=pass;

    }

}
    public class Bank{
        public static void main(String[] args) {
            Account account1 = new Account();
            account1.name= "sunny";
            account1.age=17;//accessed in the same package
            account1.email="bsrinadhsunny@gmail.com";//can be accessed by subclass and with in same package
           // account1.password="asdfghjkl";(//can't be accessed sinces password is private.)
        System.out.println(account1.name+" "+account1.age+" "+account1.email);
        //setting password
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    }
    
        
}