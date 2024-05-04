import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calcSwing extends JFrame implements ActionListener{
    JTextField t;
    JButton b1,b2,b3,bp,bm,be;
    JPanel p;
    int op1,op;
    public calcSwing(){
        super("Calculator");
        t=new JTextField(10);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        bp=new JButton("+");
        bm=new JButton("-");
        be=new JButton("=");
        p=new JPanel();
        Container c=this.getContentPane();
        c.setLayout(new GridLayout(2,1));
        c.add(t);
        p.setLayout(new GridLayout(2,3));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bp);
        p.add(bm);
        p.add(be);
        c.add(p);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bp.addActionListener(this);
        bm.addActionListener(this);
        be.addActionListener(this);
        setSize(700,700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String str="";
        str=t.getText();
        if(ae.getSource() == b1){
            t.setText(str+ "1");
        }
        else if(ae.getSource() == b2){
            t.setText(str+ "2");
        }
        else if(ae.getSource() == b3){
            t.setText(str+ "3");
        }
        else if(ae.getSource() == bp){
            op1=Integer.parseInt(str);
            t.setText("");
            op=1;
        }
        else if(ae.getSource() == bm){
            op1=Integer.parseInt(str);
            t.setText("");
            op=2;
        }
        else if(ae.getSource()==be){
            int op2=Integer.parseInt(str);
            int res=0;
            if(op == 1){
                res=op1+op2;
            }
            else if(op==2){
                res=op1-op2;
            }
            t.setText("" +res);
        }
    }
    public static void main(String[] args) {
        new calcSwing();
    }
}
