
import java.util.Vector;
public class ConcreteMediator implements Mediator {
    User user;
    String message;
    private Vector userlist=new Vector();

    @Override
    public void addUser(User user) {
        userlist.addElement(user);
    }

    @Override
    public void middlemanDelivery(String message) {
        for(int i=0;i<userlist.size();i++){
            User user=(User)userlist.elementAt(i);
            user.receive(message);

        }
    }
}
