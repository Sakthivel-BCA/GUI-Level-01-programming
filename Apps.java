import java.awt.*;

class Apps
{
    public static void main(String args[])
    {
        Frame f = new Frame("My Apps");

        Label l1 = new Label("Takshashila University");
        Label l2 = new Label("Ongur, Tindivanam, TN");
        Label l3 = new Label("Application Form 2027");

        Label l4 = new Label("Appl. No:");
        Label l5 = new Label("Student Name:");
        Label l6 = new Label("Program:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();

        Button b1 = new Button("Save");

        l1.setBounds(120,70,200,30);
        l2.setBounds(150,100,200,30);
        l3.setBounds(140,130,200,30);

        l4.setBounds(80,180,100,30);
        t1.setBounds(200,180,150,30);

        l5.setBounds(80,220,100,30);
        t2.setBounds(200,220,150,30);

        l6.setBounds(80,260,100,30);
        t3.setBounds(200,260,150,30);

        b1.setBounds(180,310,80,30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(l5);
        f.add(t2);
        f.add(l6);
        f.add(t3);
        f.add(b1);

        f.setSize(450,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}