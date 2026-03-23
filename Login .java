 import java.awt.*;

class Login 
{
    public static void main(String args[])
    {
        Frame f = new Frame("Login Page");
        Label l1 = new Label("User Name:");
        Label l2 = new Label("Password:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        t2.setEchoChar('*');

        Button b = new Button("Login");

        l1.setBounds(80,100,80,30);
        t1.setBounds(170,100,150,30);

        l2.setBounds(80,150,80,30);
        t2.setBounds(170,150,150,30);

        b.setBounds(170,200,80,30);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        f.setSize(400,350);
        f.setLayout(null);
       f.setVisible(true);

    }
}