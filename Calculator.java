import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
    JFrame f;
    JPanel p,p1;
    JButton b[]=new JButton[16];
    JTextField t1;
    double aa,bb,cc;
    String op;
    public Calculator()
    {
        f=new JFrame("HARSHIT");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,200);
        f.setLayout(null);
        p1=new JPanel();
        p1.setBounds(150,30,950,750);
        p1.setBackground(Color.darkGray);
        p1.setLayout(null);
        p=new JPanel();
        p.setBounds(35,350,900,350);
        p.setLayout(new GridLayout(4,4));
        t1=new JTextField(4);
        t1.setBounds(35,20,850,200);
        t1.setBackground(Color.green);
        t1.setFont(t1.getFont().deriveFont(20,50));
        p1.add(p);
        p1.add(t1);
        f.add(p1);
        for(int i=0;i<10;i++)
        {
            b[i]=new JButton(""+i);
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        b[10]=new JButton("+");
        b[10].addActionListener(this);
            p.add(b[10]);
        b[11]=new JButton("-");
        b[11].addActionListener(this);
            p.add(b[11]);
        b[12]=new JButton("*");
        b[12].addActionListener(this);
            p.add(b[12]);
        b[13]=new JButton("/");
        b[13].addActionListener(this);
            p.add(b[13]);
        b[14]=new JButton("CE");
        b[14].addActionListener(this);
            p.add(b[14]);
        b[15]=new JButton("=");
        b[15].addActionListener(this);
            p.add(b[15]);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ob)
    {
        String st=ob.getActionCommand();
       if(Character.isDigit(st.charAt(0)))
       {
        t1.setText(t1.getText()+st);
       }
    else if(st.equals("+")||st.equals("-")|| st.equals("*")|| st.equals("/"))
        {
            aa=Double.parseDouble(t1.getText());
            op=st;
            t1.setText("");

        }
      else  if(st.equals("CE"))
        {
            t1.setText("");
        }
      
       else if(st.equals("="))
        {
            bb=Double.parseDouble(t1.getText());
            if(op.equals("+"))
            cc=aa+bb;
            else if(op.equals("-"))
            cc=aa-bb;
            else if(op.equals("*"))
            cc=aa*bb;
            else 
            cc=aa/bb;
           t1.setText(cc+"");

        }
    }
    public static void main(String a[])
    {
        new Calculator();
    }
}
