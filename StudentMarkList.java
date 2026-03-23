import java.awt.*;
import java.awt.event.*;

class StudentMarkList
{
    public static void main(String args[])
    {
        Frame f = new Frame("Student Mark List");

        Label l1 = new Label("Reg No:");
        Label l2 = new Label("Name:");
        Label l3 = new Label("Java Mark:");
        Label l4 = new Label("OS Mark:");
        Label l5 = new Label("CCWS Mark:");
        Label result = new Label("");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        TextField t5 = new TextField();

        Button b = new Button("Calculate");

        l1.setBounds(50,80,100,30);
        t1.setBounds(160,80,150,30);

        l2.setBounds(50,120,100,30);
        t2.setBounds(160,120,150,30);

        l3.setBounds(50,160,100,30);
        t3.setBounds(160,160,150,30);

        l4.setBounds(50,200,100,30);
        t4.setBounds(160,200,150,30);

        l5.setBounds(50,240,100,30);
        t5.setBounds(160,240,150,30);

        b.setBounds(120,280,100,30);
        result.setBounds(50,320,300,30);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(t4);
        f.add(l5); f.add(t5);
        f.add(b); f.add(result);

        // Button Action
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int javaMark = Integer.parseInt(t3.getText());
                int osMark = Integer.parseInt(t4.getText());
                int ccwsMark = Integer.parseInt(t5.getText());

                int total = javaMark + osMark + ccwsMark;
                double avg = total / 3.0;

                result.setText("Total: " + total + "   Average: " + avg);
            }
        });

        // Close window
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}