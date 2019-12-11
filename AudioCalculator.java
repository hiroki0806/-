 package jp.aoyama.a5817076;
 import java.net.URL;
 import java.awt.event.*;
 import jp.aoyama.a5817076.ImageCalculator;
 import jp.aoyama.a5817076.AlarmSound;
 
 public class AudioCalculator extends ImageCalculator{
  private static final long serialVersionUID=1L;
  URL url_fig,urlOver_fig,urlPush_fig,urlPushed_fig,urlSelPushed_fig;
  URL url_ope,urlOver_ope,urlPush_ope,urlPushed_ope,urlSelPushed_ope;
  URL url_clr,urlOver_clr,urlPush_clr,urlPushed_clr,urlSelPushed_clr;
  AlarmSound sounds[] = new AlarmSound[17];
  
  public AudioCalculator(){
    super();
    for(int i=0;i<17;i++){
    	button[i].addMouseListener(new MyMouseAdapter(i));
    	
    	switch(i){
		  case 0:sounds[i] = new AlarmSound("0.wav");break;
		  case 1:sounds[i] = new AlarmSound("1.wav");break;
		  case 2:sounds[i] = new AlarmSound("2.wav");break;
		  case 3:sounds[i] = new AlarmSound("3.wav");break;
		  case 4:sounds[i] = new AlarmSound("4.wav");break;
		  case 5:sounds[i] = new AlarmSound("5.wav");break;
		  case 6:sounds[i] = new AlarmSound("6.wav");break;
		  case 7:sounds[i] = new AlarmSound("7.wav");break;
		  case 8:sounds[i] = new AlarmSound("8.wav");break;
		  case 9:sounds[i] = new AlarmSound("9.wav");break;
		  case 10:sounds[i] = new AlarmSound("00.wav");break;
		  case 11:sounds[i] = new AlarmSound("wa.wav");break;
		  case 12:sounds[i] = new AlarmSound("c.wav");break;
		  case 13:sounds[i] = new AlarmSound("waru.wav");break;
		  case 14:sounds[i] = new AlarmSound("kakeru.wav");break;
		  case 15:sounds[i] = new AlarmSound("hiku.wav");break;
		  case 16:sounds[i] = new AlarmSound("tasu.wav");break;
		  default:
		  }
    }
    
  }
  public static void main(String[] args){
    new AudioCalculator();
  }
  
  class MyMouseAdapter extends MouseAdapter{
	  int button_num;
	  public MyMouseAdapter(int i){
		  button_num =i;
	  }
	  public void mousePressed(MouseEvent ev){
		  sounds[button_num].play();
		  }
		  
	  }
  }
