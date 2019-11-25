package jp.aoyama.15817100
import java.net.URL;
import javax.swing.*;
import java.awt.event.*;

public class ImageCalculator extends Calculator{
  private static final long seriaLVersionUID=1L; //
  URL url_num, urlOver_num, urlPush_num, urlPushed_num;
  URL url_ope, urlOver_ope, urlPush_ope, urlPushed_ope;
  URL url_c, urlOver_c, urlPush_c, urlPushed_c;

  public ImageCalculator(){
    super();

    url_num=this.getClass().getResource("/num1.png");
    urlOver_num=this.getClass().getResource("/num2.png");
    urlPush_num=this.getClass().getResource("/num3.png");
    urlPushed_num=this.getClass().getResource("/num4.png");

    url_ope=this.getClass().getResource("/ope1.png");
    urlOver_ope=this.getClass().getResource("/ope2.png");
    urlPush_ope=this.getClass().getResource("/ope3.png");
    urlPushed_ope=this.getClass().getResource("/ope4.png");

    url_c=this.getClass().getResource("/c1.png");
    urlOver_c=this.getClass().getResource("/c2.png");
    urlPush_c=this.getClass().getResource("/c3.png");
    urlPushed_c=this.getClass().getResource("/c4.png");

    for(int i=0;i<10;i++){
      button[i].setBorder(null);

      button[i].setHorizontalTextPosition(JButton.CENTER);
      button[i].setIcon(new ImageIcon(url_num));
      button[i].setPressedIcon(new ImageIcon(urlPush_num));
      button[i].setRolloverIcon(new ImageIcon(urlOver_num));
      button[i].setSelectedIcon(new ImageIcon(urlPushed_num));
      button[i].addActionListener(new addActionListener(){
        public void actionPerformed(ActionEvent evt){
          for(int i=0;i<17;i++){
            if(button[i].isSelected()){
              button[i].setSelected(!button[i].isSelected());
            }
          }
          int i=Integer.parseInt(evt.getActionCommand());
          button[i].setSelected(!button[i].isSelected());
        }
      });
    }
    for(int i=0;i<17;i++){
      if(button[i].isSelected()){
        button[i].setSelected(!button[i].isSelected());
      }
    }
    button[10].setBorder(null);

    button[10].setHorizontalTextPosition(JButton.CENTER);
    button[10].setIcon(new ImageIcon(url_num));
    button[10].setPressedIcon(new ImageIcon(urlPush_num));
    button[10].setRolloverIcon(new ImageIcon(urlOber_num));
    button[10].setSelectedIcon(new ImageIcon(urlPushed_num));
    button[10].addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent evt){
        for(int i=0;i<17;i++){
          if(button[i].isSelected()){
            button[i].setSelected(!button[i].isSelected());
          }
        }
        button[10].setSelected(!button[10].isSelected());
      }
    });

    for(int i=0;i<17;i++){
      if(button[i].isSelected()){
        button[i].setSelected(!button[i].isSelected());
      }
    }
    buttton[11].setBorder(null);

    button[11].setHorizontalTextPosition(JButton.CENTER);
    button[11].setIcon(new ImageIcon(url_ope));
    button[11].setPressedIcon(new ImageIcon(urlPush_ope));
    button[11].setRolloverIcon(new ImageIcon(urlOber_ope));
    button[11].setSelectedIcon(new ImageIcon(urlPushed_ope));
    button[11].addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent evt){
        for(int i=0;i<17;i++){
          if(button[i].isSelected()){
            button[i].setSelected(!button[i].isSelected());
          }
        }
        button[11].setSelected(!button[11].isSelected());
      }
    });

    for(int i=0;i<17;i++){
      if(button[i].isSelected()){
        button[i].setSelected(!button[i].isSelected());
      }
    }
    buttton[12].setBorder(null);

    button[12].setHorizontalTextPosition(JButton.CENTER);
    button[12].setIcon(new ImageIcon(url_c));
    button[12].setPressedIcon(new ImageIcon(urlPush_c));
    button[12].setRolloverIcon(new ImageIcon(urlOber_c));
    button[12].setSelectedIcon(new ImageIcon(urlPushed_c));
    button[12].addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent evt){
        for(int i=0;i<17;i++){
          if(button[i].isSelected()){
            button[i].setSelected(!button[i].isSelected());
          }
        }
        button[12].setSelected(!button[12].isSelected());
      }
    });

    for(int i=13;i<17;i++){
      buttton[i].setBorder(null);

      button[i].setHorizontalTextPosition(JButton.CENTER);
      button[i].setIcon(new ImageIcon(url_ope));
      button[i].setPressedIcon(new ImageIcon(urlPush_ope));
      button[i].setRolloverIcon(new ImageIcon(urlOber_ope));
      button[i].setSelectedIcon(new ImageIcon(urlPushed_ope));

      button[i].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){
          for(int i=0;i<17;i++){
            if(button[i].isSelected()){
              button[i].setSelected(!button[i].isSelected());
            }
          }
          for(int i=13;i<17;i++){
            if(evt.getResource().equals(button[i])){
              button[i].setSelected(!button[i].isSelected());
            }
          }
        }

      });
    }

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args){
    new ImageCalculator();
  }

}
