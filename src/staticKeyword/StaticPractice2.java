package staticKeyword;

public class StaticPractice2 {

    /* create a varaible in the class. variable name= Position, value-
    QA Engieer
    I want to define name , id , height, of the StaticPractice class
     and print those
     and print batchNo in this main method
    Also I want to print position in the main method
     */

    String position = "QA Engineer";

    public static void main(String[] args) {
    StaticPractice samin = new StaticPractice();
        samin.name = "Samin";
        System.out.println(samin.name);
        samin.height = 5.5f;
        System.out.println(samin.height);
        samin.id = 105;
        System.out.println(samin.id);
        System.out.println(StaticPractice.batchNo);
        StaticPractice.study();
        StaticPractice.homeWork();

    }



}
