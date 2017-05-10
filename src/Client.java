
public class Client {
    public static void main(String[]args){
        Mediator med=new ConcreteMediator();
        User u1=new ConcreteUser(med,"Adway");
        User u2=new ConcreteUser(med,"Dada");
        User u3=new ConcreteUser(med,"Dad");
        User u4=new ConcreteUser(med,"Mom");

        med.addUser(u1);
        med.addUser(u2);
        med.addUser(u3);
        med.addUser(u4);
        u1.send("hello SDK Residence :) ");
    }
}
