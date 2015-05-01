import java.util.ArrayList;

import javax.swing.JLabel;


public class PilaTorres {
          public ArrayList<JLabel> cu=new ArrayList();
          public void push(JLabel o){
        	  cu.add(o);
          }
          public JLabel pop(){
        	  if(!(cu.isEmpty())){
        		  JLabel o=cu.get(cu.size()-1);
        		  cu.remove(cu.size()-1);
        		  return o;
        	  }else{
        		  return null;
        	  }
          }
          public  JLabel peek(){
        	  if(!(cu.isEmpty())){
        		  return cu.get(cu.size()-1);
        	  }else{
        		  return null;
        	  }
          }
          public boolean empty(){
        	  return cu.isEmpty();
          }
}
