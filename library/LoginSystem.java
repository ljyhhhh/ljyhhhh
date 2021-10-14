package library;

import java.util.ArrayList;
import java.util.List;

//需要初始化
public class LoginSystem {
    List<User> userlist=new ArrayList<>();
    int x=0;
    public User registerNewUser(String username){
        User a=new User(username);
        userlist.add(a);
        return a;
    }
    public void userLogin(User user){};
    public void quit(User user){};
    public void administratorLogin(Administrator ad){};
}
