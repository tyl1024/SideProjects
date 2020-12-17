import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class LoginScreen implements ActionListener
{
   private final static int password = 1024;
   static int array[] = new int[0];
   static int button0count = 0;
   static int button1count = 0;
   static int button2count = 0;
   static int button3count = 0;
   static int button4count = 0;
   static int button5count = 0;
   static int button6count = 0;
   static int button7count = 0;
   static int button8count = 0;
   static int button9count = 0;
   
   
   public static void main(String[] args)
   {
	   buttonlayout();
   }
   
   public static void buttonlayout() 
   {
	   	JFrame f = new JFrame("Login");
	    JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
	    JLabel loginPrompt = new JLabel("Please enter your password");  //login prompt above buttons
	    JLabel accessGranted = new JLabel("Access Granted");
	    JLabel accessDenied = new JLabel("Access Denied");


	    JPanel p = new JPanel();
	    button1 = new JButton("1");
	    button2 = new JButton("2");
	    button3 = new JButton("3");
	    button4 = new JButton("4");
	    button5 = new JButton("5");
	    button6 = new JButton("6");
	    button7 = new JButton("7");
	    button8 = new JButton("8");
	    button9 = new JButton("9");
	    button0 = new JButton("0");
	    
	    p.setLayout(null);
	    button1.setBounds(40, 100, 100, 60);
	    button2.setBounds(150, 100, 100, 60);
	    button3.setBounds(260, 100, 100, 60);
	    
	    button4.setBounds(40, 170, 100, 60);
	    button5.setBounds(150, 170, 100, 60);
	    button6.setBounds(260, 170, 100, 60);
	    
	    button7.setBounds(40, 240, 100, 60);
	    button8.setBounds(150, 240, 100, 60);
	    button9.setBounds(260, 240, 100, 60);
	    
	    button0.setBounds(150, 310, 100, 60);
	    
	    loginPrompt.setBounds(120, 50, 300, 60);
	    accessGranted.setBounds(155, 370, 300, 60);
	    accessDenied.setBounds(155, 370, 300, 60);
	    accessGranted.setVisible(false);
	    accessDenied.setVisible(false);
	    accessGranted.setForeground(Color.green.darker());
	    accessDenied.setForeground(Color.red.darker());

	    
	    p.add(button0);
	    p.add(button1);
	    p.add(button2);
	    p.add(button3);
	    p.add(button4);
	    p.add(button5);
	    p.add(button6);
	    p.add(button7);
	    p.add(button8);
	    p.add(button9);
	    p.add(loginPrompt);
	    p.add(accessGranted);
	    p.add(accessDenied);
	    
	    

	    
	    button0.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
	        try 
	        {
	          int myInt=Integer.parseInt(button0.getText());
	          button0count++;
	  	      //System.out.println(Arrays.toString(array));
	  	      array = Arrays.copyOf(array, array.length + 1);
	  	      array[array.length - 1] = myInt;
	  	      //String line = (Arrays.toString(array));
	  	      //System.out.println(line);
	  	   
		
		        int length = array.length;
		        int intArray[] = new int[length];
		        for(int i=0; i<length; i++){
		           intArray[i] = (int) array[i];
		        }
		        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
		        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
		        int passNumEntered = Integer.parseInt(sequence); 

		        if (passNumEntered == password)
		          {
		        	  System.out.println("Access Granted.");
		        	  accessGranted.setVisible(true);
		        	  
		          }
		          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
		          {
		        	  System.out.println("Number entered is: "+myInt);
		          }
		          
		        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
		        	  {
		        		  System.out.println("Wrong password. Try Again");
		        		  accessDenied.setVisible(true);
		        	  }
		          }
	        catch (NumberFormatException ex) 
	        {
	        	
	       }
	      }
	    });
	    
	    button1.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
	        try 
	        {
	          int myInt=Integer.parseInt(button1.getText());
	          button1count++;
	  	      //System.out.println(Arrays.toString(array));
	  	      array = Arrays.copyOf(array, array.length + 1);
	  	      array[array.length - 1] = myInt;
	  	      //String line = (Arrays.toString(array));
	  	      //System.out.println(line);
	  	   
		
		        int length = array.length;
		        int intArray[] = new int[length];
		        for(int i=0; i<length; i++){
		           intArray[i] = (int) array[i];
		        }
		        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
		        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
		        int passNumEntered = Integer.parseInt(sequence); 

		        if (passNumEntered == password)
		          {
		        	  System.out.println("Access Granted.");
		        	  accessGranted.setVisible(true);
		        	  
		          }
		          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
		          {
		        	  System.out.println("Number entered is: "+myInt);
		          }
		          
		        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
		        	  {
		        		  System.out.println("Wrong password. Try Again");
		        		  accessDenied.setVisible(true);
		        	  }
		          }
	        catch (NumberFormatException ex) 
	        {
	        	
	       }
	      }
	    });
	    
	    button2.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
	        try 
	        {
	          int myInt=Integer.parseInt(button2.getText());
	          button2count++;
	  	      //System.out.println(Arrays.toString(array));
	  	      array = Arrays.copyOf(array, array.length + 1);
	  	      array[array.length - 1] = myInt;
	  	      //String line = (Arrays.toString(array));
	  	      //System.out.println(line);
	  	   
		
		        int length = array.length;
		        int intArray[] = new int[length];
		        for(int i=0; i<length; i++){
		           intArray[i] = (int) array[i];
		        }
		        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
		        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
		        int passNumEntered = Integer.parseInt(sequence); 


		        if (passNumEntered == password)
		          {
		        	  System.out.println("Access Granted.");
		        	  accessGranted.setVisible(true);
		        	  
		          }
		          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
		          {
		        	  System.out.println("Number entered is: "+myInt);
		          }
		          
		        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
		        	  {
		        		  System.out.println("Wrong password. Try Again");
		        		  accessDenied.setVisible(true);
		        	  }
		          }
	        catch (NumberFormatException ex) 
	        {
	        	
	       }
	      }
	    });
	    
	    button3.addActionListener(new ActionListener() 
	    {
	      @Override
	    public void actionPerformed(ActionEvent arg0) 
	      {
	        try 
	        {
	          int myInt=Integer.parseInt(button3.getText());
	          button3count++;
	  	      //System.out.println(Arrays.toString(array));
	  	      array = Arrays.copyOf(array, array.length + 1);
	  	      array[array.length - 1] = myInt;
	  	      //String line = (Arrays.toString(array));
	  	      //System.out.println(line);
	  	   
		
		        int length = array.length;
		        int intArray[] = new int[length];
		        for(int i=0; i<length; i++){
		           intArray[i] = (int) array[i];
		        }
		        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
		        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
		        int passNumEntered = Integer.parseInt(sequence); 

		        if (passNumEntered == password)
		          {
		        	  System.out.println("Access Granted.");
		        	  accessGranted.setVisible(true);
		        	  
		          }
		          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
		          {
		        	  System.out.println("Number entered is: "+myInt);
		          }
		          
		        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
		        	  {
		        		  System.out.println("Wrong password. Try Again");
		        		  accessDenied.setVisible(true);
		        	  }
		          }
	        catch (NumberFormatException ex) 
	        {
	        	
	       }
	      }
	    });
	    
	    button4.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
		        try 
		        {
		          int myInt=Integer.parseInt(button4.getText());
		          button4count++;
		  	      //System.out.println(Arrays.toString(array));
		  	      array = Arrays.copyOf(array, array.length + 1);
		  	      array[array.length - 1] = myInt;
		  	      //String line = (Arrays.toString(array));
		  	      //System.out.println(line);
		  	   
			
			        int length = array.length;
			        int intArray[] = new int[length];
			        for(int i=0; i<length; i++){
			           intArray[i] = (int) array[i];
			        }
			        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
			        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
			        int passNumEntered = Integer.parseInt(sequence); 

			        if (passNumEntered == password)
			          {
			        	  System.out.println("Access Granted.");
			        	  accessGranted.setVisible(true);
			        	  
			          }
			          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
			          {
			        	  System.out.println("Number entered is: "+myInt);
			          }
			          
			        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
			        	  {
			        		  System.out.println("Wrong password. Try Again");
			        		  accessDenied.setVisible(true);
			        	  }
			          }
		        catch (NumberFormatException ex) 
		        {
		        	
		       }
		      }
		    });
	    
	    button5.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
		        try 
		        {
		          int myInt=Integer.parseInt(button5.getText());
		          button5count++;
		  	      //System.out.println(Arrays.toString(array));
		  	      array = Arrays.copyOf(array, array.length + 1);
		  	      array[array.length - 1] = myInt;
		  	      //String line = (Arrays.toString(array));
		  	      //System.out.println(line);
		  	   
			
			        int length = array.length;
			        int intArray[] = new int[length];
			        for(int i=0; i<length; i++){
			           intArray[i] = (int) array[i];
			        }
			        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
			        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
			        int passNumEntered = Integer.parseInt(sequence); 

			        if (passNumEntered == password)
			          {
			        	  System.out.println("Access Granted.");
			        	  accessGranted.setVisible(true);
			        	  
			          }
			          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
			          {
			        	  System.out.println("Number entered is: "+myInt);
			          }
			          
			        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
			        	  {
			        		  System.out.println("Wrong password. Try Again");
			        		  accessDenied.setVisible(true);
			        	  }
			          }
		        catch (NumberFormatException ex) 
		        {
		        	
		       }
		      }
		    });
	    
	    button6.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
		        try 
		        {
		          int myInt=Integer.parseInt(button6.getText());
		          button6count++;
		  	      //System.out.println(Arrays.toString(array));
		  	      array = Arrays.copyOf(array, array.length + 1);
		  	      array[array.length - 1] = myInt;
		  	      //String line = (Arrays.toString(array));
		  	      //System.out.println(line);
		  	   
			
			        int length = array.length;
			        int intArray[] = new int[length];
			        for(int i=0; i<length; i++){
			           intArray[i] = (int) array[i];
			        }
			        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
			        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
			        int passNumEntered = Integer.parseInt(sequence); 

			        if (passNumEntered == password)
			          {
			        	  System.out.println("Access Granted.");
			        	  accessGranted.setVisible(true);
			        	  
			          }
			          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
			          {
			        	  System.out.println("Number entered is: "+myInt);
			          }
			          
			        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
			        	  {
			        		  System.out.println("Wrong password. Try Again");
			        		  accessDenied.setVisible(true);
			        	  }
			          }
		        catch (NumberFormatException ex) 
		        {
		        	
		       }
		      }
		    });
	    
	    button7.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
		        try 
		        {
		          int myInt=Integer.parseInt(button7.getText());
		          button7count++;
		  	      //System.out.println(Arrays.toString(array));
		  	      array = Arrays.copyOf(array, array.length + 1);
		  	      array[array.length - 1] = myInt;
		  	      //String line = (Arrays.toString(array));
		  	      //System.out.println(line);
		  	   
			
			        int length = array.length;
			        int intArray[] = new int[length];
			        for(int i=0; i<length; i++){
			           intArray[i] = (int) array[i];
			        }
			        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
			        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
			        int passNumEntered = Integer.parseInt(sequence); 

			        if (passNumEntered == password)
			          {
			        	  System.out.println("Access Granted.");
			        	  accessGranted.setVisible(true);
			        	  
			          }
			          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
			          {
			        	  System.out.println("Number entered is: "+myInt);
			          }
			          
			        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
			        	  {
			        		  System.out.println("Wrong password. Try Again");
			        		  accessDenied.setVisible(true);
			        	  }
			          }
		        catch (NumberFormatException ex) 
		        {
		        	
		       }
		      }
		    });
	    
	    button8.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
		        try 
		        {
		          int myInt=Integer.parseInt(button8.getText());
		          button8count++;
		  	      //System.out.println(Arrays.toString(array));
		  	      array = Arrays.copyOf(array, array.length + 1);
		  	      array[array.length - 1] = myInt;
		  	      //String line = (Arrays.toString(array));
		  	      //System.out.println(line);
		  	   
			
			        int length = array.length;
			        int intArray[] = new int[length];
			        for(int i=0; i<length; i++){
			           intArray[i] = (int) array[i];
			        }
			        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
			        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
			        int passNumEntered = Integer.parseInt(sequence); 

			        if (passNumEntered == password)
			          {
			        	  System.out.println("Access Granted.");
			        	  accessGranted.setVisible(true);
			        	  
			          }
			          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
			          {
			        	  System.out.println("Number entered is: "+myInt);
			          }
			          
			        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
			        	  {
			        		  System.out.println("Wrong password. Try Again");
			        		  accessDenied.setVisible(true);
			        	  }
			          }
		        catch (NumberFormatException ex) 
		        {
		        	
		       }
		      }
		    });
	    
	    button9.addActionListener(new ActionListener() 
	    {
	      @Override
	      public void actionPerformed(ActionEvent arg0) 
	      {
		        try 
		        {
		          int myInt=Integer.parseInt(button9.getText());
		          button9count++;
		  	      //System.out.println(Arrays.toString(array));
		  	      array = Arrays.copyOf(array, array.length + 1);
		  	      array[array.length - 1] = myInt;
		  	      //String line = (Arrays.toString(array));
		  	      //System.out.println(line);
		  	   
			
			        int length = array.length;
			        int intArray[] = new int[length];
			        for(int i=0; i<length; i++){
			           intArray[i] = (int) array[i];
			        }
			        System.out.println(Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim());
			        String sequence = Arrays.toString(array).replace(",","").replace("[","").replace("]","").replace(" ","").trim();
			        int passNumEntered = Integer.parseInt(sequence); 

			        if (passNumEntered == password)
			          {
			        	  System.out.println("Access Granted.");
			        	  accessGranted.setVisible(true);
			        	  
			          }
			          else if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count < 4 || passNumEntered != password)
			          {
			        	  System.out.println("Number entered is: "+myInt);
			          }
			          
			        	  if (button0count + button1count + button2count + button3count + button4count + button5count+ button6count + button7count + button8count+button9count == 4 && passNumEntered != password)
			        	  {
			        		  System.out.println("Wrong password. Try Again");
			        		  accessDenied.setVisible(true);
			        	  }
			          }
		        catch (NumberFormatException ex) 
		        {
		        	
		       }
		      }
		    });
	    
	    
    
	    
	    f.add(p);
	    f.setDefaultCloseOperation(3);
	    f.setSize(500, 700);
	    f.setLocation(3000, 100);
	    f.setVisible(true);
	    
   }
   

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
		
}
