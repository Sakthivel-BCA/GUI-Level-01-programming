import java.awt.*;

class CourseDemo
{
    public static void main(String args[])
    {
        Frame f = new Frame("Check Box");

        Label l1 = new Label("Select your Course");

        Checkbox c1 = new Checkbox("BCA");
        Checkbox c2 = new Checkbox("BSC");
        Checkbox c3 = new Checkbox("BBA");

        l1.setBounds(120,80,200,30);

        c1.setBounds(150,120,80,30);
        c2.setBounds(150,160,80,30);
        c3.setBounds(150,200,80,30);

        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);

        f.setSize(400,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}