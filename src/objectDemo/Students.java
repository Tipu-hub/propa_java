package objectDemo;

public class Students {
/*
We will learn how to create object of the class and with the
help of object we use the member of the class

Class members are 1. Variables 2. Methods
 */

    String name;
    float height;
    int id;
    int batchNo =10;


    public void study(){ // custom method
        String topic;
        topic = "Java";
        System.out.println(topic);
        System.out.println("Hello");
    }


    public void homeWork(){ // custom method
        System.out.println("We complete our homework each week");

    }

    public static void main(String[] args) { // main method
        Students propa = new Students(); // we have created an object of the class
        propa.name = "Propa";
        propa.height = 5.6f;
        propa.batchNo = 10;
        propa.id = 102;
        System.out.println(propa.name);
       propa.study(); // calling the method
       propa.homeWork();


        Students shopnil = new Students();
            shopnil.name = "Shopnil";
            shopnil.height = 5.7f;
            shopnil.batchNo=10;
            shopnil.id = 103;

            shopnil.study();
            shopnil.homeWork();


       Students fahid = new Students();
        fahid.name = "Fahid";
        fahid.height = 5.7f;
        fahid.batchNo = 10;
        fahid.id = 104;

        fahid.study();
        fahid.homeWork();

    }


}
