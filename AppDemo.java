import java.awt.*;

class AppDemo
{
    public static void main(String args[])
    {
        Frame f = new Frame("Application");

        Label l1 = new Label("Date of Birth");

        Choice month = new Choice();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

        Choice day = new Choice();
        for(int i=1;i<=31;i++)
        {
            day.add(String.valueOf(i));
        }

        Choice year = new Choice();
        for(int i=1990;i<=2025;i++)
        {
            year.add(String.valueOf(i));
        }

        l1.setBounds(150,80,100,30);
        month.setBounds(80,130,100,30);
        day.setBounds(200,130,80,30);
        year.setBounds(300,130,100,30);

        f.add(l1);
        f.add(month);
        f.add(day);
        f.add(year);

        f.setSize(500,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}