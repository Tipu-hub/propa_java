package staticKeyword;



public class StaticPractice {
    /*
    Static keyword can be used before the variables and methods.
    It belongs to class.
    When any variables or methods are common to all objects
    then we can make the variables and methods Static. When it is static
    we don't have to create any object in the main method
    to use those variables and methods.
     */
    String name;
    float height;
    int id;
    static int batchNo =10;


    public static void study(){ // custom method
        String topic;
        topic = "Java";
        System.out.println(topic);
        System.out.println("Hello");
    }


    public static void homeWork(){ // custom method
        System.out.println("We complete our homework each week");

    }

    public static void main(String[] args) { // main method
        StaticPractice propa = new StaticPractice(); // we have created an object of the class
        propa.name = "Propa";
        propa.height = 5.6f;

        System.out.println(batchNo);
        propa.id = 102;
        System.out.println(propa.name);
        study(); // calling the method
        homeWork();


        StaticPractice shopnil = new StaticPractice();
        shopnil.name = "Shopnil";
        shopnil.height = 5.7f;
        System.out.println(batchNo);
        shopnil.id = 103;

        study();
        homeWork();


        StaticPractice fahid = new StaticPractice();
        fahid.name = "Fahid";
        fahid.height = 5.7f;

        fahid.id = 104;
        study();
        homeWork();

    }

}
