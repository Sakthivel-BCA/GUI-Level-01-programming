import java.awt.*;

class Radio.Demo
{
    public static void main(String args[])
    {
        Frame f = new Frame("Radio Button");

        Label l1 = new Label("Gender");

        CheckboxGroup g = new CheckboxGroup();

        Checkbox c1 = new Checkbox("Male", g, false);
        Checkbox c2 = new Checkbox("Female", g, false);
        Checkbox c3 = new Checkbox("Other", g, false);

        l1.setBounds(160,80,100,30);

        c1.setBounds(150,120,100,30);
        c2.setBounds(150,160,100,30);
        c3.setBounds(150,200,100,30);

        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);

        f.setSize(400,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}