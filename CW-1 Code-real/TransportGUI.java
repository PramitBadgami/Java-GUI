
/**
 * Write a description of class TransportGUI here.
 *
 * @author (22015724 Pramit Badgami)
 * @version (1.0.0)
 */
// Importing all the classes and methods from javax.swing package
import javax.swing.*;
// Importing all the classes and methods from java.awt package
import java.awt.*;
// Importing all the classes and methods from java.awt.event package
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// Importing all the classes and methods from java.util package
import java.util.ArrayList;

// Creating a class TransportGUI which implements ActionListener
public class TransportGUI implements ActionListener
{
    // Declaring and initializing an arraylist array_list of type Vehicle Class
    ArrayList<Vehicle> array_list = new ArrayList<Vehicle>();
    
    // Declaring instance variables
    private JFrame auto_frame;
    
    private JPanel panel1;
    
    private JPanel auto_panel1;
    
    private JLabel a_TransportGUI;
    private JLabel a_Auto;
    private JLabel a_vname;
    private JLabel a_vID;
    private JLabel a_vweight;
    private JLabel a_vcolor;
    private JLabel a_vspeed;
    private JLabel a_edisplacement;
    private JLabel a_torque;
    private JLabel a_fueltankcapacity;
    private JLabel a_ground;
    private JTextField a_Name;
    private JTextField a_ID;
    private JTextField a_Weight;
    private JTextField a_Color;
    private JTextField a_Speed;
    private JTextField a_ED;
    private JTextField a_Torque;
    private JTextField a_FTC;
    private JTextField a_GC;
    private JButton a_add;
    private JButton a_Change;
    
    private JPanel auto_panel2;
    private JLabel a_Book;
    private JLabel a_BID;
    private JLabel a_BookedDate;
    private JLabel a_ChargeAmt;
    private JLabel a_NoOfSeats;
    private JTextField a_bID;
    private JComboBox a_years;
    private JComboBox a_months;
    private JComboBox a_days;
    private JTextField a_CA;
    private JTextField a_NOS;
    private JButton a_book;
    private JButton a_display;
    private JButton a_clear;
    
    private JFrame electric_frame;
    private JPanel electric_panel1;
    private JLabel e_TransportGUI;
    private JLabel e_Electric;
    private JLabel e_vID;
    private JLabel e_vname;
    private JLabel e_vweight;
    private JLabel e_vcolor;
    private JLabel e_vspeed;
    private JLabel e_BattCap;
    
    private JTextField e_ID;
    private JTextField e_Name;
    private JTextField e_Weight;
    private JTextField e_Color;
    private JTextField e_Speed;
    private JTextField e_Batt;
    private JButton e_add;
    private JButton e_Change;
    
    private JPanel electric_panel2;
    private JLabel e_Purchase;
    private JLabel e_PID;
    private JLabel e_Brand;
    private JLabel e_Price;
    private JLabel e_ChargingTime;
    private JLabel e_Mileage;
    private JLabel e_Range;
    private JTextField e_pID;
    private JTextField e_brand;
    private JTextField e_price;
    private JTextField e_CT;
    private JTextField e_mileage;
    private JTextField e_range;
    private JButton e_purchase;
    
    private JPanel electric_panel3;
    private JLabel e_Sell;
    private JLabel e_vid;
    private JLabel e_sellPrice;
    private JTextField e_tfID;
    private JTextField e_tfPrice;
    private JButton e_sell;
    
    private JButton e_display;
    private JButton e_clear;

    // Creating a main method
    public static void main(String[] args)
    {
        // Initializing the local variable to the TransportGUI
        TransportGUI Auto = new TransportGUI();
        // Calling auto_Gui() method
        Auto.auto_Gui();
    }
    
    // Creating an instance method auto_Gui
    public void auto_Gui()
    {
        // Initializing the instance variable along with a title
        auto_frame = new JFrame("TransportGUI");
        // Sets the x-axis to 301px, y-axis to 153px, width to 945px and height to 610px
        auto_frame.setBounds(301,153,945,610);
        // Sets the layout of the frame to null
        auto_frame.setLayout(null);
        
        
        // Initializing the instance variable along with a title
        auto_panel1 = new JPanel();
        // Sets the visibility of the panel to true
        auto_panel1.setVisible(true);
        // Sets the x-axis to 50px, y-axis to 90px, width to 405px and height to 440px
        auto_panel1.setBounds(50,90,405,440);
        // Sets the Border to line border and gives black color to it
        auto_panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        // Sets the layout of the panel to null
        auto_panel1.setLayout(null);
        
        a_TransportGUI = new JLabel("Transport GUI");
        a_TransportGUI.setBounds(380,-10,200,100);
        // Sets the font to Serif and text as bold and font size to 25
        a_TransportGUI.setFont(new Font("Serif", Font.BOLD, 25));
        
        a_Auto = new JLabel("Add an AutoRickshaw");
        a_Auto.setBounds(106,20,200,25);
        // Sets the font to Serif and text as bold and font size to 20
        a_Auto.setFont(new Font("Serif", Font.BOLD, 20));
        
        a_vID = new JLabel("Vehicle ID:");
        a_vID.setBounds(30,80,100,25);
        
        a_vname = new JLabel("Vehicle Name:");
        a_vname.setBounds(30,110,100,25);
        
        a_vweight = new JLabel("Vehicle Weight:");
        a_vweight.setBounds(30,140,100,25);
        
        a_vcolor = new JLabel("Vehicle Color:");
        a_vcolor.setBounds(30,170,100,25);
        
        a_vspeed = new JLabel("Vehicle Speed:");
        a_vspeed.setBounds(30,200,100,25);
        
        a_edisplacement = new JLabel("Engine Displacement:");
        a_edisplacement.setBounds(30,230,150,25);
        
        a_torque = new JLabel("Torque:");
        a_torque.setBounds(30,260,100,25);
        
        a_fueltankcapacity = new JLabel("Fuel tank capacity:");
        a_fueltankcapacity.setBounds(30,290,150,25);
        
        a_ground = new JLabel("Ground clearance:");
        a_ground.setBounds(30,320,120,25);
        
        a_ID = new JTextField();
        a_ID.setBounds(180,80,188,25);
        
        a_Name = new JTextField();
        a_Name.setBounds(180,110,188,25);
        
        a_Weight = new JTextField();
        a_Weight.setBounds(180,170,188,25);
        
        a_Color = new JTextField();
        a_Color.setBounds(180,140,188,25);
        
        a_Speed = new JTextField();
        a_Speed.setBounds(180,200,188,25);
        
        a_ED = new JTextField();
        a_ED.setBounds(180,230,188,25);
        
        a_Torque = new JTextField();
        a_Torque.setBounds(180,260,188,25);
        
        a_FTC = new JTextField();
        a_FTC.setBounds(180,290,188,25);
        
        a_GC = new JTextField();
        a_GC.setBounds(180,320,188,25);
        
        a_add = new JButton("Add an AutoRickshaw");
        a_add.setBounds(30,370,337,33);
        //Adds ActionListener to a_add
        a_add.addActionListener(this);
        
        a_Change = new JButton("Change to Electric Scooter");
        a_Change.setBounds(480,90,406,35);
        //Adds ActionListener to a_Change
        a_Change.addActionListener(this);
        
        auto_panel2 = new JPanel();
        auto_panel2.setVisible(true);
        auto_panel2.setBounds(480,140,405,290);
        auto_panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        auto_panel2.setLayout(null);
        
        a_Book = new JLabel("Book an AutoRickshaw");
        a_Book.setBounds(106,20,200,25);
        a_Book.setFont(new Font("Serif", Font.BOLD, 20));
        
        a_BID = new JLabel("Vehicle ID:");
        a_BID.setBounds(30,80,100,25);
        
        a_BookedDate = new JLabel("Booked Date:");
        a_BookedDate.setBounds(30,110,100,25);
        
        a_ChargeAmt = new JLabel("Charge Amount:");
        a_ChargeAmt.setBounds(30,140,100,25);
        
        a_NoOfSeats = new JLabel("Number of Seats:");
        a_NoOfSeats.setBounds(30,170,100,25);
        
        a_bID = new JTextField();
        a_bID.setBounds(180,80,188,25);
        
        //Creates a String array years which stores values from 2014 to 2022
        String[] years = {"2014","2015","2016","2017","2018","2019","2020","2021","2022"};
        a_years = new JComboBox(years);
        a_years.setBounds(180,110,60,25);
        
        //Creates a String array years which stores values from January to February
        String[] months = {"January","February","March","April","May","June","July","August","September","Octobar","November","December"};
        a_months = new JComboBox(months);
        a_months.setBounds(243,110,72,25);
        
        //Creates a String array years which stores values from 1 to 31
        String[] days = {" 1"," 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9"," 10"," 11"," 12"," 13"," 14"," 15"," 16"," 17"," 18"," 19"," 20"," 21"," 22"," 23"," 24"," 25"," 26"," 27"," 28"," 29"," 30"," 31"};
        a_days = new JComboBox(days);
        a_days.setBounds(318, 110, 49, 25);
        
        a_CA = new JTextField();
        a_CA.setBounds(180,140,188,25);
        
        a_NOS = new JTextField();
        a_NOS.setBounds(180,170,188,25);
        
        a_book = new JButton("Book an AutoRickshaw");
        a_book.setBounds(30,220,337,33);
        //Adds ActionListener to a_book
        a_book.addActionListener(this);
        
        a_display = new JButton("DISPLAY");
        a_display.setBounds(620,451,137,33);
        //Sets the background color of a_display button to green
        a_display.setBackground(Color.GREEN);
        //Sets the foreground color of a_display button to white
        a_display.setForeground(Color.WHITE);
        a_display.setBorder(BorderFactory.createLineBorder(Color.black));
        //Adds ActionListener to a_display
        a_display.addActionListener(this);
        
        a_clear = new JButton("CLEAR");
        a_clear.setBounds(620,495,137,33);
        //Sets the background color of a_display button to red
        a_clear.setBackground(Color.RED);
        //Sets the foreground color of a_display button to white
        a_clear.setForeground(Color.WHITE);
        a_clear.setBorder(BorderFactory.createLineBorder(Color.black));
        //Adds ActionListener to a_clear
        a_clear.addActionListener(this);
        
        //Adds a_Auto label to auto_panel1 panel
        auto_panel1.add(a_Auto);
        //Adds a_vname label to auto_panel1 panel
        auto_panel1.add(a_vname);
        //Adds a_vID label to auto_panel1 panel
        auto_panel1.add(a_vID);
        //Adds a_vweight label to auto_panel1 panel
        auto_panel1.add(a_vweight);
        //Adds a_vcolor label to auto_panel1 panel
        auto_panel1.add(a_vcolor);
        //Adds a_vspeed label to auto_panel1 panel
        auto_panel1.add(a_vspeed);
        //Adds a_edisplacement label to auto_panel1 panel
        auto_panel1.add(a_edisplacement);
        //Adds a_torque label to auto_panel1 panel
        auto_panel1.add(a_torque);
        //Adds a_fueltankcapacity label to auto_panel1 panel
        auto_panel1.add(a_fueltankcapacity);
        //Adds a_ground label to auto_panel1 panel
        auto_panel1.add(a_ground);
        
        auto_panel1.add(a_Name);
        auto_panel1.add(a_ID);
        auto_panel1.add(a_Weight);
        auto_panel1.add(a_Color);
        auto_panel1.add(a_Speed);
        auto_panel1.add(a_ED);
        auto_panel1.add(a_Torque);
        auto_panel1.add(a_FTC);
        auto_panel1.add(a_GC);
        
        auto_panel1.add(a_add);
        
        auto_panel2.add(a_Book);
        auto_panel2.add(a_BID);
        auto_panel2.add(a_BookedDate);
        auto_panel2.add(a_ChargeAmt);
        auto_panel2.add(a_NoOfSeats);
        auto_panel2.add(a_bID);
        auto_panel2.add(a_CA);
        auto_panel2.add(a_NOS);
        auto_panel2.add(a_years);
        auto_panel2.add(a_months);
        auto_panel2.add(a_days);
        auto_panel2.add(a_book);
        
        auto_frame.add(a_Change);
        
        auto_frame.add(a_TransportGUI);
        auto_frame.add(auto_panel1);
        auto_frame.add(auto_panel2);
        auto_frame.add(a_display);
        auto_frame.add(a_clear);
        //Sets the visibility of auto_frame frame to true
        auto_frame.setVisible(true);
    }
    
    //Creating an instance variable electric_Gui()
    public void electric_Gui()
    {
        //Initializing the instance variable along with a title
        electric_frame = new JFrame("TransportGUI");
        //Sets the x-axis to 301px, y-axis to 70px, width to 945px and height to 750px
        electric_frame.setBounds(301,70,945,750);
        //Sets the layout of electric_frame to null
        electric_frame.setLayout(null);
        
        //Initializing the instance variable along with a title
        electric_panel1 = new JPanel();
        //Sets the visibility of electric_panel1 panel
        electric_panel1.setVisible(true);
        //Sets the x-axis to 50px, y-axis to 90px, width to 405px and height to 350px
        electric_panel1.setBounds(50,90,405,350);
        //Sets the border of the electric_panel1 to line border and color as black
        electric_panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        //Sets the layout to null
        electric_panel1.setLayout(null);
        
        e_TransportGUI = new JLabel("Transport GUI");
        e_TransportGUI.setBounds(380,-10,200,100);
        e_TransportGUI.setFont(new Font("Serif", Font.BOLD, 25));
        
        e_Electric = new JLabel("Add an Electric Scooter");
        e_Electric.setBounds(100,20,240,25);
        e_Electric.setFont(new Font("Serif", Font.BOLD, 20));
        
        e_vID = new JLabel("Vehicle ID:");
        e_vID.setBounds(30,80,100,25);
        
        e_vname = new JLabel("Vehicle Name:");
        e_vname.setBounds(30,110,100,25);
        
        e_vweight = new JLabel("Vehicle Weight:");
        e_vweight.setBounds(30,140,100,25);
        
        e_vcolor = new JLabel("Vehicle Color:");
        e_vcolor.setBounds(30,170,100,25);
        
        e_vspeed = new JLabel("Vehicle Speed:");
        e_vspeed.setBounds(30,200,100,25);
        
        e_BattCap = new JLabel("Battery Capacity:");
        e_BattCap.setBounds(30,230,150,25);
        
        e_ID = new JTextField();
        e_ID.setBounds(180,80,188,25);
        
        e_Name = new JTextField();
        e_Name.setBounds(180,110,188,25);
        
        e_Weight = new JTextField();
        e_Weight.setBounds(180,140,188,25);
        
        e_Speed = new JTextField();
        e_Speed.setBounds(180,170,188,25);
        
        e_Color = new JTextField();
        e_Color.setBounds(180,200,188,25);
        
        e_Batt = new JTextField();
        e_Batt.setBounds(180,230,188,25);
        
        e_add = new JButton("Add an Electric Scooter");
        e_add.setBounds(30,280,337,33);
        //Adds the ActionListener to e_add button
        e_add.addActionListener(this);
        
        e_Change = new JButton("Change to AutoRickshaw");
        e_Change.setBounds(480,90,406,35);
        //Adds the ActionListener to e_Change button
        e_Change.addActionListener(this);
        
        electric_panel2 = new JPanel();
        electric_panel2.setVisible(true);
        electric_panel2.setBounds(480,140,405,350);
        electric_panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        electric_panel2.setLayout(null);
        
        e_Purchase = new JLabel("Purchase an Electric Scooter");
        e_Purchase.setBounds(79,20,250,25);
        e_Purchase.setFont(new Font("Serif", Font.BOLD, 20));
        
        e_PID = new JLabel("Vehicle ID:");
        e_PID.setBounds(30,80,100,25);
        
        e_Brand = new JLabel("Brand:");
        e_Brand.setBounds(30,110,100,25);
        
        e_Price = new JLabel("Price:");
        e_Price.setBounds(30,140,100,25);
        
        e_ChargingTime = new JLabel("Charging Time:");
        e_ChargingTime.setBounds(30,170,100,25);
        
        e_Mileage = new JLabel("Mileage:");
        e_Mileage.setBounds(30,200,100,25);
        
        e_Range = new JLabel("Range:");
        e_Range.setBounds(30,230,100,25);
        
        e_pID = new JTextField();
        e_pID.setBounds(180,80,188,25);
        
        e_brand = new JTextField();
        e_brand.setBounds(180,110,188,25);
        
        e_price = new JTextField();
        e_price.setBounds(180,140,188,25);
        
        e_CT = new JTextField();
        e_CT.setBounds(180,170,188,25);
        
        e_mileage = new JTextField();
        e_mileage.setBounds(180,200,188,25);
        
        e_range = new JTextField();
        e_range.setBounds(180,230,188,25);
        
        e_purchase = new JButton("Purchase an Electric Scooter");
        e_purchase.setBounds(30,280,337,33);
        //Adds the ActionListener to e_purchase button
        e_purchase.addActionListener(this);
        
        electric_panel3 = new JPanel();
        electric_panel3.setVisible(true);
        electric_panel3.setBounds(50,452,405,227);
        electric_panel3.setBorder(BorderFactory.createLineBorder(Color.black));
        electric_panel3.setLayout(null);
        
        e_Sell = new JLabel("Sell an Electric Scooter");
        e_Sell.setBounds(100,20,250,25);
        e_Sell.setFont(new Font("Serif", Font.BOLD, 20));
        
        e_vid = new JLabel("Vehicle ID:");
        e_vid.setBounds(30,80,100,25);
        
        e_sellPrice = new JLabel("Price:");
        e_sellPrice.setBounds(30,110,100,25);
        
        e_tfID = new JTextField();
        e_tfID.setBounds(180,80,188,25);
        
        e_tfPrice = new JTextField();
        e_tfPrice.setBounds(180,110,188,25);
    
        e_sell = new JButton("Sell an Electric Scooter");
        e_sell.setBounds(30,160,337,33);
        //Adds the ActionListener to e_sell button
        e_sell.addActionListener(this);

        e_display = new JButton("DISPLAY");
        e_display.setBounds(620,518,137,33);
        e_display.setBackground(Color.GREEN);
        e_display.setForeground(Color.WHITE);
        e_display.setBorder(BorderFactory.createLineBorder(Color.black));
        //Adds the ActionListener to e_display button
        e_display.addActionListener(this);
        
        e_clear = new JButton("CLEAR");
        e_clear.setBounds(620,561,137,33);
        e_clear.setBackground(Color.RED);
        e_clear.setForeground(Color.WHITE);
        e_clear.setBorder(BorderFactory.createLineBorder(Color.black));
        //Adds the ActionListener to e_clear button
        e_clear.addActionListener(this);
    
        //Adds e_Electric label to elctric_panel1 panel
        electric_panel1.add(e_Electric);
        electric_panel1.add(e_vID);
        electric_panel1.add(e_vname);
        electric_panel1.add(e_vweight);
        electric_panel1.add(e_vcolor);
        electric_panel1.add(e_vspeed);
        electric_panel1.add(e_BattCap);
        
        electric_panel1.add(e_ID);
        electric_panel1.add(e_Name);
        electric_panel1.add(e_Weight);
        electric_panel1.add(e_Color);
        electric_panel1.add(e_Speed);
        electric_panel1.add(e_Batt);
        
        electric_panel1.add(e_add);
        
        electric_panel2.add(e_Purchase);
        electric_panel2.add(e_PID);
        electric_panel2.add(e_Brand);
        electric_panel2.add(e_Price);
        electric_panel2.add(e_ChargingTime);
        electric_panel2.add(e_Mileage);
        electric_panel2.add(e_Range);
        
        electric_panel2.add(e_pID);
        electric_panel2.add(e_brand);
        electric_panel2.add(e_price);
        electric_panel2.add(e_CT);
        electric_panel2.add(e_mileage);
        electric_panel2.add(e_range);
        
        electric_panel2.add(e_purchase);
        
        electric_panel3.add(e_Sell);
        electric_panel3.add(e_vid);
        electric_panel3.add(e_sellPrice);
        electric_panel3.add(e_tfID);
        electric_panel3.add(e_tfPrice);
        electric_panel3.add(e_sell);
        
        electric_frame.add(e_Change);
        
        electric_frame.add(e_TransportGUI);
        electric_frame.add(electric_panel1);
        electric_frame.add(electric_panel2);
        electric_frame.add(electric_panel3);
        electric_frame.add(e_display);
        electric_frame.add(e_clear);
        //Sets the visibilty of electric_frame to true
        electric_frame.setVisible(true);
    }
    
    //Creates a method actionPerformed which accepts ActionEvent e as a parameter
    public void actionPerformed(ActionEvent e)
    {
        //Whether the button is clicked or not
        if(e.getSource() == a_add){
            //try block keeps the code which has an exception
            try{
            //Initializing repeatId boolean to false
            boolean repeatId=false;
            //Initialing and converting integer to string 
            int id = Integer.parseInt(a_ID.getText());//Widening Typecasting
            String name = a_Name.getText();
            String weight = a_Weight.getText();
            String color = a_Color.getText();
            String speed = a_Speed.getText();
            int engine = Integer.parseInt(a_ED.getText());
            String torque = a_Torque.getText();
            int fuel = Integer.parseInt(a_FTC.getText());
            String ground = a_GC.getText();
            
            //Executes each object in array list one by one (also called advanced for loop)
            for (Vehicle ovj:array_list){
                //Checks weather the entered id is repeated or not
                if(ovj.getvehicleID() == id){
                    //Initialize the repeatId to true
                    repeatId=true;
                }
            }
            
            //Checks whether the entered id is repeated or not
            if(repeatId==true){
                //Displaying a dialog box when the id is entered twice and added
                JOptionPane.showMessageDialog(auto_panel1,"The Vehicle with ID: "+id+"is already added. Please try new ID.","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                //Assigns various parameters to AutoRickshaw constructor
                AutoRickshaw obj = new AutoRickshaw(id ,name ,weight ,color ,speed ,engine ,torque ,fuel ,ground);
                //Adds obj to array_list
                array_list.add(obj);
                //Displays a dialog box when auto rickrickshaw is added with an unique vehicle id
                JOptionPane.showMessageDialog(auto_panel1,"Your records for an AutoRickshaw has been successfully added");
            }
            
            }
            //Catches the type of Exception with a object
            catch(NumberFormatException a){
                //Displays a dialog box when some of the fields are empty
                JOptionPane.showMessageDialog(auto_panel1, "Some Fields are Empty", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //Whether the button is clicked or not
        if (e.getSource() == a_book){
            //try block keeps the code which has an exception
            try{
                boolean add_checker = false;
                
                //Initialing and converting integer to string
                int id = Integer.parseInt(a_bID.getText());
                int charge_amt = Integer.parseInt(a_CA.getText());
                int NoOf_seats = Integer.parseInt(a_NOS.getText());
                
                String days = a_days.getSelectedItem().toString();
                String months = a_months.getSelectedItem().toString();
                String years = a_years.getSelectedItem().toString();
                String Booked_Date = days + months + years;
                //Vehicle class has an object ovj with an arraylist
                for(Vehicle obj_ : array_list){
                    //Whether the AutoRickshaw constructor constructs an object
                    //Checks the type of object
                    if(obj_ instanceof AutoRickshaw){
                        //Downcasting
                        //Converts parent class object to child class class object
                        AutoRickshaw Auto_obj = (AutoRickshaw) obj_;
                    
                        //Compares the object of the getter method to id
                        if(obj_.getvehicleID()== id){
                            //Initialize the add_checker to true
                            add_checker = true;
                            JOptionPane.showMessageDialog(auto_panel2, "The id is: "+id + "\nThe charge amount is: "+charge_amt+ "\nThe number of seats are: "+ NoOf_seats);
                       
                        //Whether the object of the getter methd is false
                        if(Auto_obj.isBooked() == false){
                            Auto_obj.book(Booked_Date , charge_amt, NoOf_seats);
                            JOptionPane.showMessageDialog(auto_panel2, "The AutoRickshaw has been booked!");
                        
                            }
                        else if(Auto_obj.isBooked() == true){
                            JOptionPane.showMessageDialog(auto_panel2, "The AutoRickshaw has already been booked!");
                            }
                        }
                    }
                }
                
                //Checks the vehicle id entered to book to the vehicle id entered to add
                if(add_checker == false){
                    JOptionPane.showMessageDialog(auto_panel2, "The AutoRickshaw has not been added yet", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
                }
                
                }
                catch(NumberFormatException c){
                    JOptionPane.showMessageDialog(auto_panel2, "Some Fields are Empty", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
                }
        }
            
        //Whether the button is clicked or not
        if(e.getSource() == e_add){
            //try block keeps the code which has an exception
            try{
                boolean repeatID=false;
                
                //Initialing and converting integer to string
                int id = Integer.parseInt(e_ID.getText());
                String name = e_Name.getText();
                String weight = e_Weight.getText();
                String color = e_Color.getText();
                String speed = e_Speed.getText();
                int battery = Integer.parseInt(e_Batt.getText());
                
                for (Vehicle object:array_list){
                    //Checks weather the entered id is repeated or not
                    if(object.getvehicleID() == id){
                        //Initialize the repeatId to true
                        repeatID = true;
                    }
                }
                
                //Checks whether the entered id is repeated or not
                if(repeatID==true){
                    //Displaying a dialog box when the id is entered twice and added
                    JOptionPane.showMessageDialog(electric_panel1, "The Vehicle with ID: "+id+"is already added. Please try new ID.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    //Assigns various parameters to ElectricScooter constructor
                    ElectricScooter ovijay = new ElectricScooter(id ,name ,weight ,color ,speed , battery);
            
                    //Adds an object to the arraylist
                    array_list.add(ovijay);
            
                    //Displays a dialog box when auto rickrickshaw is added with an unique vehicle id
                    JOptionPane.showMessageDialog(electric_panel1,"Your records for an ElectricScooter has been successfully added");
                }   
            }
            //Catches the type of Exception with a object
            catch(NumberFormatException b){
                JOptionPane.showMessageDialog(electric_panel1, "Some Fields are Empty", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
            }    
        }
            
        //Whether the button is clicked or not
        if(e.getSource() == e_purchase){
            //try block keeps the code which has an exception
            try{
                boolean add_checkr = false;
                
                int id = Integer.parseInt(e_pID.getText());
                String brand = e_brand.getText();
                int price = Integer.parseInt(e_price.getText());
                String charging_Time = e_CT.getText();
                String mileage = e_mileage.getText();
                int range = Integer.parseInt(e_range.getText());
                
                for (Vehicle obj1 : array_list){
                    //Whether the AutoRickshaw constructor constructs an object
                    //Checks the type of object
                    if(obj1 instanceof ElectricScooter){
                        //Downcasting
                        //Converts parent class object to child class class object
                        ElectricScooter Electric_obj = (ElectricScooter) obj1;
                    
                        //Compares the object of the getter method to id
                        if(obj1.getvehicleID() == id){
                            //Initialize the add_checkr to true
                            add_checkr = true;
                            JOptionPane.showMessageDialog(electric_panel2, "The ID is: "+id + "\nThe Brand is: " +brand+ "\nThe Price is: " +price+ "\nThe Charging Time is: " +charging_Time+ "\nThe Mileage is: " +mileage+ "\nThe Range is: " +range);
                        
                        //Whether the object of the getter methd is false
                        if(Electric_obj.gethasPurchased() == false){
                            Electric_obj.purchase(brand , price, charging_Time, mileage, range);
                            JOptionPane.showMessageDialog(electric_panel2, "The ElectricScooter has been purchased!");
                        
                        }
                    
                        else if(Electric_obj.gethasPurchased() == true){
                            JOptionPane.showMessageDialog(electric_panel2, "The ElectricScooter has already been purchased!");
                        }
                    }
                    }
                }
                
                //Checks the vehicle id entered to purchase to the vehicle id entered to add
                if(add_checkr == false){
                    JOptionPane.showMessageDialog(electric_panel2, "The ElectrictricScooter has not been added yet", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
                }
                
                }
                //Catches the type of Exception with a object
                catch(NumberFormatException d){
                    JOptionPane.showMessageDialog(electric_panel2, "Some Fields are Empty", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        //Whether the button is clicked or not
        if(e.getSource() == e_sell){
            //try block keeps the code which has an exception
            try{
                boolean add_check = false;
                
                int id = Integer.parseInt(e_tfID.getText());
                int price = Integer.parseInt(e_tfPrice.getText());
                
                for(Vehicle obj2 : array_list){
                    //Whether the AutoRickshaw constructor constructs an object
                    //Checks the type of object
                    if(obj2 instanceof ElectricScooter){
                        //Downcasting
                        //Converts parent class object to child class class object
                        ElectricScooter Electric_obj2 = (ElectricScooter) obj2;                    
                    
                        //Compares the object of the getter method to id
                        if(obj2.getvehicleID() == id){
                            //Initialize the add_check to true
                            add_check = true;
                            JOptionPane.showMessageDialog(electric_panel3, "The ID is: " +id+ "\nThe Price is: " +price);
                        
                        //Whether the object of the getter methd is false
                        if(Electric_obj2.gethasSold() == false){
                            Electric_obj2.sell(price);
                            JOptionPane.showMessageDialog(electric_panel3, "The ElectricScooter has been sold!");
                        }
                        
                        else if(Electric_obj2.gethasSold() == true){
                            JOptionPane.showMessageDialog(electric_panel3, "The ElectricScooter has already been sold!");
                        }
                    }
                    }
                }
                //Checks the vehicle id entered to sell to the vehicle id entered to add
                if(add_check == false){
                    JOptionPane.showMessageDialog(electric_panel3, "The ElectrictricScooter has not been added yet", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
                }
                
                }
                //Catches the type of Exception with a object
                catch(NumberFormatException ae){
                    JOptionPane.showMessageDialog(electric_panel3, "Some Fields are Empty", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        //Whether the button is clicked or not
        if(e.getSource() == a_clear){
            //Clears the all the textfields when the clear button is clicked
            a_Name.setText("");
            a_ID.setText("");
            a_Weight.setText("");
            a_Color.setText("");
            a_Speed.setText("");
            a_ED.setText("");
            a_Torque.setText("");
            a_FTC.setText("");
            a_GC.setText("");
            
            a_bID.setText("");
            //Resets the index to 0(first) when the clear button is pressed
            a_years.setSelectedIndex(0);
            a_months.setSelectedIndex(0);
            a_days.setSelectedIndex(0);
            a_CA.setText("");
            a_NOS.setText("");
        }
             
        //Whether the button is clicked or not
        if(e.getSource() == e_clear){
            //Clears the all the textfields when the clear button is clicked
            e_ID.setText("");
            e_Name.setText("");
            e_Weight.setText("");
            e_Color.setText("");
            e_Speed.setText("");
            e_Batt.setText("");
            
            e_pID.setText("");
            e_brand.setText("");
            e_price.setText("");
            e_CT.setText("");
            e_mileage.setText("");
            e_range.setText("");
            
            e_tfID.setText("");
            e_tfPrice.setText("");
        }
        
        //Whether the button is clicked or not
        if(e.getSource() == a_Change){
            //Calls the instance method electric_Gui() and changes from one gui to another
            electric_Gui();
        }
        
        //Whether the button is clicked or not
        if(e.getSource() == e_Change){
            //Calls the instance method auto_Gui() and changes from one gui to another
            auto_Gui();
        }
        
        //Whether the button is clicked or not
        if(e.getSource() == a_display){
            for(Vehicle obj3 : array_list){
                //Whether the AutoRickshaw constructor constructs an object
                //Checks the type of object
                if(obj3 instanceof AutoRickshaw){
                    //Calls the instance method display()
                    obj3.display();
                }
            }
        }
        
        //Whether the button is clicked or not
        if(e.getSource() == e_display){
            for(Vehicle obj4 : array_list){
                //Whether the AutoRickshaw constructor constructs an object
                //Checks the type of object
                if(obj4 instanceof ElectricScooter){
                    //Calls the instance method display()
                    obj4.display();
                }
            }
        }
    }
}

