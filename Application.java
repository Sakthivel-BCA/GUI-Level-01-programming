import java.awt.*;

class Application
{
    public static void main(String args[])
    {
        Frame f = new Frame("Application Form");

        Label l1 = new Label("Enrol No:");
        Label l2 = new Label("Student Name:");
        Label l3 = new Label("Program:");
        Label l4 = new Label("Batch:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        Button b1 = new Button("Save");
        Button b2 = new Button("Cancel");

        l1.setBounds(80,80,100,30);
        t1.setBounds(200,80,150,30);

        l2.setBounds(80,130,100,30);
        t2.setBounds(200,130,150,30);

        l3.setBounds(80,180,100,30);
        t3.setBounds(200,180,150,30);

        l4.setBounds(80,230,100,30);
        t4.setBounds(200,230,150,30);

        b1.setBounds(150,280,80,30);
        b2.setBounds(250,280,80,30);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(b1);
        f.add(b2);

        f.setSize(450,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}