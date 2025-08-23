//understanding oops in java

//class(blueprint) class name starting letter must be capita;\l
class Pen{
    String color;
    String type;//ball point/pen
    //method 
    public void write(){
        System.out.println("writing someting");
    }
    //printing type of a particular object
    public void printcolor(){
        System.out.println(this.color);
    }

}
public class Oops {
    //main method
    public static void main(String[] args) {
        pen pen1=new pen();//fst object using classs(blueprint)
        pen1.color="blue";
        pen1.type="jel";
        pen1.write();
        pen1.printcolor();
        pen pen2= new pen();
        pen2.color="red";
        pen2.type="ball point";
        pen2.printcolor();

    }

    
}