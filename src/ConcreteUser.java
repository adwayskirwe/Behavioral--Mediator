
public class ConcreteUser implements User {
    String name;
    Mediator mediator;

    public ConcreteUser(Mediator mediator,String name){
        this.mediator=mediator;
        this.name=name;
    }
    @Override
    public void send(String msg) {
        System.out.println("Sending message to mediator");
        System.out.println("Sender: "+this.getName()+" -->Message"+msg);
        mediator.middlemanDelivery(msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Receiver :"+ this.getName()+"Received message :"+msg);

    }

    @Override
    public String getName() {
        return name;
    }
}
