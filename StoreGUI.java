import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StoreGUI{
    public static void main(String[] args){
        //Create an arraylist 
        ArrayList<Store> StoreList =new ArrayList<>();
    //Initialize the main JFrame and set it    
    JFrame mainframe = new JFrame();
    mainframe.setDefaultCloseOperation(mainframe.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    mainframe.setLayout(null);
    mainframe.setSize(1366,768);
    mainframe.setTitle("23056148"+" Aayesha Baidhya");
    
    //Set background image 
    ImageIcon imageIcon = new ImageIcon("mainframeimage.jpeg");
    mainframe.setContentPane(new JLabel(imageIcon)); 
    
    //Adding "Add a Department"button to main JFrame
    JButton addadepartmentbutton = new JButton("Add a Department");
    addadepartmentbutton.setBounds(420,300,220,50);
    addadepartmentbutton.setBackground(new Color(173, 216, 230)); 
    mainframe.add(addadepartmentbutton);
    addadepartmentbutton.setBorderPainted(false);
    addadepartmentbutton.setFont(new Font("Arial", Font.BOLD, 20));
    
    //Adding "Add a Retailer"button to main JFrame
    JButton addaretailerbutton = new JButton("Add a Retailer");
    addaretailerbutton.setBounds(750,300,220,50);
    mainframe.add(addaretailerbutton);
    addaretailerbutton.setBackground(new Color(173, 216, 230)); 
    addaretailerbutton.setBorderPainted(false); 
    addaretailerbutton.setFont(new Font("Arial", Font.BOLD, 20));
    
    //Adding action listener method for addadepartmentbutton
        addadepartmentbutton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae1){
                //Initialize new JFrame for add a department button
                JFrame departmentframe = new JFrame("Add a Department");
                departmentframe.setVisible(true);
                departmentframe.setLayout(null);
                departmentframe.setSize(1366, 768);
                //Setting background image
                ImageIcon imageIcon = new ImageIcon("retailerframe2.jpeg");
                departmentframe.setContentPane(new JLabel(imageIcon)); 
                departmentframe.setTitle("23056148"+" Aayesha Baidhya");
    
            //Adding JLabels 
                JLabel heading = new JLabel("ADD A NEW DEPARTMENT");
                heading.setBounds(500, 30, 400, 50); 
                heading.setFont(new Font("Arial", Font.BOLD, 24));  
                departmentframe.add(heading);
            
            //Adding labels and textfields dor different objects    
                JLabel Storeidlabel = new JLabel("Store ID:");
                Storeidlabel.setBounds(150, 100, 100, 30);
                departmentframe.add(Storeidlabel);
                
                JTextField storeidfield = new JTextField();
                storeidfield.setBounds(250, 100, 200, 30);  
                departmentframe.add(storeidfield);
                
                JLabel Storenamelabel = new JLabel("Store Name:");
                Storenamelabel.setBounds(100, 150, 100, 30);
                departmentframe.add(Storenamelabel);
                
                JTextField storenamefield = new JTextField();
                storenamefield.setBounds(250, 150, 200, 30);
                departmentframe.add(storenamefield);
                
                JLabel Locationlabel = new JLabel("Location:");
                Locationlabel.setBounds(100, 200, 100, 30);
                departmentframe.add(Locationlabel);
                
                JTextField locationfield = new JTextField();
                locationfield.setBounds(250, 200, 200, 30);
                departmentframe.add(locationfield);
                
                JLabel Openinghourlabel = new JLabel("Opening Hour:");
                Openinghourlabel.setBounds(100, 250, 120, 30);
                departmentframe.add(Openinghourlabel);
                
                JTextField openinghourfield = new JTextField();
                openinghourfield.setBounds(250, 250, 200, 30);
                departmentframe.add(openinghourfield);
                
                JLabel Totalsaleslabel = new JLabel("Total Sales:");
                Totalsaleslabel.setBounds(600, 100, 120, 30);
                departmentframe.add(Totalsaleslabel);
                
                JTextField totalsalesfield = new JTextField();
                totalsalesfield.setBounds(750, 100, 200, 30);
                departmentframe.add(totalsalesfield);
                
                JLabel Totaldiscountlabel = new JLabel("Total Discount:");
                Totaldiscountlabel.setBounds(600, 150, 120, 30);
                departmentframe.add(Totaldiscountlabel);
                
                JTextField totaldiscountfield = new JTextField();
                totaldiscountfield.setBounds(750, 150, 200, 30);
                departmentframe.add(totaldiscountfield);
                
                JLabel Productnamelabel = new JLabel("Product Name:");
                Productnamelabel.setBounds(600, 200, 120, 30);
                departmentframe.add(Productnamelabel);
                
                JTextField productnamefield = new JTextField();
                productnamefield.setBounds(750, 200, 200, 30);
                departmentframe.add(productnamefield);
                
                JLabel markedpricelabel = new JLabel("Marked Price:");
                markedpricelabel.setBounds(600, 250, 120, 30);
                departmentframe.add(markedpricelabel);
                
                JTextField markedpricefield = new JTextField();
                markedpricefield.setBounds(750, 250, 200, 30);
                departmentframe.add(markedpricefield);
                
            //Adding buttons to add department    
                JButton calculationbtn = new JButton("Add Department");
                calculationbtn.setBounds(400, 325, 150, 40);
                departmentframe.add(calculationbtn);
                
            //Adding buttons to clear fields    
                JButton clearbtn1 = new JButton("Clear Fields");
                clearbtn1.setBounds(600, 325, 150, 40);
                departmentframe.add(clearbtn1); 
                
            //Adding subheading for calculating discount price    
                JLabel subheading = new JLabel("CALCULATE DISCOUNT PRICE");
                subheading.setBounds(500,400, 400, 50); 
                subheading.setFont(new Font("Arial", Font.BOLD, 22));  
                departmentframe.add(subheading);
               
            //Add label and textfield for storeid in discount calculation part    
                JLabel discountstoreidlabel = new JLabel("Store ID:");
                discountstoreidlabel.setBounds(100, 450, 100, 30);
                departmentframe.add(discountstoreidlabel);
                
                JTextField discountstoreidfield = new JTextField();
                discountstoreidfield.setBounds(250, 450, 200, 30);
                departmentframe.add(discountstoreidfield);
                
            //Add checkbox for "Is in Sales"option    
                JLabel discountisinsaleslabel = new JLabel("Is in Sales:");
                discountisinsaleslabel.setBounds(100, 500, 100, 30);
                departmentframe.add(discountisinsaleslabel);
                
                JCheckBox Yesbtn = new JCheckBox("Yes");
                Yesbtn.setBounds(250, 500, 60, 30);
                departmentframe.add(Yesbtn);
                
                JCheckBox Nobtn = new JCheckBox("No");
                Nobtn.setBounds(320, 500, 60, 30);
                departmentframe.add(Nobtn);
                
            //Grouping the checkboxes together    
                ButtonGroup isinsalesgroup = new ButtonGroup();
                isinsalesgroup.add(Yesbtn);
                isinsalesgroup.add(Nobtn);
                
            //Adding label and textfields for markedprice in calculatediscount part     
                JLabel discountmarkedpricelabel = new JLabel("Marked Price:");
                discountmarkedpricelabel.setBounds(600, 450, 150, 30);
                departmentframe.add(discountmarkedpricelabel);
                
                JTextField dismarkedpricefield = new JTextField();
                dismarkedpricefield.setBounds(750, 450, 200, 30);
                departmentframe.add(dismarkedpricefield);
                
            //Adding button to the calculate discount price    
                JButton calcdiscountbtn = new JButton("Calculate Discount Price");
                calcdiscountbtn.setBounds(350, 550, 200, 40);
                departmentframe.add(calcdiscountbtn);
                
            //Adding clearbutton to clear fields of calculatediscount part    
                JButton clearbtn2 = new JButton("Clear Fields");
                clearbtn2.setBounds(650, 550, 150, 40);
                departmentframe.add(clearbtn2);
                
        
            
            //Adding actionlistener method for calculatediscountprice button
                    calculationbtn.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent ae2){
                            try{
                                //Checking if the textfields are empty
                                if(locationfield.getText().isEmpty() ||storenamefield.getText().isEmpty()||openinghourfield.getText().isEmpty()||productnamefield.getText().isEmpty()){
                                    JOptionPane.showMessageDialog(departmentframe,"Enter all the values ");
                                }
                            else{
                                boolean storeexists=false;
                                int storeId = Integer.parseInt(storeidfield.getText());
                                String storeName = storenamefield.getText();
                                String location = locationfield.getText();
                                String openingHour = openinghourfield.getText();
                                double totalSales = Double.parseDouble(totalsalesfield.getText());
                                double totalDiscount = Double.parseDouble(totaldiscountfield.getText());
                                String productName = productnamefield.getText();
                                double markedPrice = Double.parseDouble(markedpricefield.getText());
                                
                                for(Store eachobj : StoreList){
                                    if(eachobj instanceof Department && eachobj.getstoreId()==storeId){
                                         storeexists=true;
                                         break;
                                }}
                                
                            if(storeexists==true){
                                JOptionPane.showMessageDialog(departmentframe,"Store ALREADY EXISTS");
                            }   
                            else{
                                Department department = new Department(storeId,storeName,location,openingHour,totalSales,totalDiscount,productName,markedPrice);
                                StoreList.add(department);
                                JOptionPane.showMessageDialog(departmentframe,"thank you for adding");
                            }
                        }
                    }
                        catch(NumberFormatException nfe1){
                            JOptionPane.showMessageDialog(departmentframe,"Number format exception");
                        }
                        catch(NullPointerException npe1){
                            JOptionPane.showMessageDialog(departmentframe,"Enter all the values ");
                        }
                        }
                    });

                    clearbtn1.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent ae2){
                        int option=JOptionPane.showConfirmDialog(departmentframe,"Are you sure you want to clear","Confirm", JOptionPane.YES_NO_OPTION);
                        if (option==JOptionPane.YES_OPTION){
                            storeidfield.setText("");
                            storenamefield.setText("");
                            locationfield.setText("");
                            openinghourfield.setText("");
                            totalsalesfield.setText("");
                            totaldiscountfield.setText("");
                            productnamefield.setText("");
                            markedpricefield.setText("");
                        }
                        }
                    });
                    
                    
        
                    
                    calcdiscountbtn.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent ae2){
                    
                        try{
                            boolean storeexists=false;                    
                            if( 
                                isinsalesgroup.getSelection() ==null ){
                                    JOptionPane.showMessageDialog(departmentframe,"Enter if the product is in sales");
                                }
                            
                            else{
                        
                                int storeId = Integer.parseInt(discountstoreidfield.getText());
                                double markedPrice = Double.parseDouble(dismarkedpricefield.getText());
                                boolean isInSales = Yesbtn.isSelected() && !Nobtn.isSelected();
                                 
        
                                for(Store eachobj : StoreList){
                                        if(eachobj instanceof Department && eachobj.getstoreId()==storeId){
                                            Department department =(Department)eachobj;
                                            department.calculateDiscountPrice(isInSales,markedPrice);
                                             storeexists=true;
                                             break;
                                    }}
                                    if(storeexists==true){
                                JOptionPane.showMessageDialog(departmentframe,"The Discount has been calculated");
                            }   
                            else{
                               
                                JOptionPane.showMessageDialog(departmentframe,"Store ID not Found ");
                            }
                                }
                            }
                        catch(NumberFormatException nfe1){
                            JOptionPane.showMessageDialog(departmentframe,"Enter the fields Correctly");
                            }
                        catch(NullPointerException npe1){
                            JOptionPane.showMessageDialog(departmentframe,"Enter all the null fields ");
                                
                        }
                        
                        }});
                    clearbtn2.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent ae2){
                        int option=JOptionPane.showConfirmDialog(departmentframe,"Are you sure you want to clear","Confirm", JOptionPane.YES_NO_OPTION);
                        if (option==JOptionPane.YES_OPTION){
                            discountstoreidfield.setText("");
                            dismarkedpricefield.setText("");
                            isinsalesgroup.clearSelection();
                            
                        }
                        }
                    });
                    
            JLabel subheading2 = new JLabel("DISPLAY");
            subheading2.setBounds(350,600, 300, 50); 
            subheading2.setFont(new Font("Arial", Font.BOLD, 22));  
            departmentframe.add(subheading2);
            JButton departmentdisplaybtn = new JButton("Display button");
            departmentdisplaybtn.setBounds(300,650,150, 40);
            departmentframe.add(departmentdisplaybtn);
            
            departmentdisplaybtn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae2){
                        boolean storeexists=false;   
                    try {
                        int storeId = Integer.parseInt(JOptionPane.showInputDialog(departmentframe, "Enter Store ID:"));
                        for(Store eachobj : StoreList){
                                    if(eachobj instanceof Department && eachobj.getstoreId()==storeId){
                                        Department department =(Department)eachobj;
                                        JOptionPane.showMessageDialog(departmentframe,
                                        "The Store ID is: " + department.getstoreId() + "\n" +
                                        "The Store Name is: " + department.getstoreName() + "\n" +
                                        "The Store Location is: " + department.getlocation() + "\n" +
                                        "The Opening hour of store is: " + department.getopeningHour() + "\n" +
                                        "The total sales = " + department.gettotalSales() + "\n" +
                                        "The total discount = " + department.gettotalDiscount() + "\n" +
                                        "The Product Name = " + department.getProductname() + "\n" +
                                        "The Marked Price = " + department.getMarkedprice() + "\n" +
                                        "The Selling Price = " + department.getSellingprice()
                                    );
    
                                     storeexists=true;
                                     break;
                            }
    
                    }
                    if(storeexists==false){
                    JOptionPane.showMessageDialog(departmentframe, "This department doesnot exist");
                    
                        }
                }
                    catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(departmentframe, "Invalid input. Please enter a valid integer.");
                    }
                }
                });
                        
                        
            }
            });
    
    
        addaretailerbutton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae1){
            JFrame retailerframe =  new JFrame();
            retailerframe.setVisible(true);
            retailerframe.setLayout(null);
            retailerframe.setSize(1366,768);
            ImageIcon imageIcon = new ImageIcon("retailerframe2.jpeg");
            retailerframe.setContentPane(new JLabel(imageIcon)); 
            retailerframe.setTitle("23056148"+" Aayesha Baidhya");
                
            
            JLabel heading = new JLabel("ADD A RETAILER");
            heading.setBounds(583, 30, 300, 50);
            heading.setFont(new Font("Arial", Font.BOLD, 22));
            retailerframe.add(heading);
    
            JLabel Storeidlabel = new JLabel("Store id");
            Storeidlabel.setBounds(150, 100, 100, 30);
            retailerframe.add(Storeidlabel);
    
            JTextField storeidfield = new JTextField();
            storeidfield.setBounds(250, 100, 200, 30);
            retailerframe.add(storeidfield);
    
            JLabel Storenamelabel = new JLabel("Store name");
            Storenamelabel.setBounds(100, 150, 100, 30);
            retailerframe.add(Storenamelabel);
    
            JTextField storenamefield = new JTextField();
            storenamefield.setBounds(250, 150, 200, 30);
            retailerframe.add(storenamefield);
    
            JLabel Locationlabel = new JLabel("Location");
            Locationlabel.setBounds(100, 200, 100, 30);
            retailerframe.add(Locationlabel);
    
            JTextField locationfield = new JTextField();
            locationfield.setBounds(250, 200, 200, 30);
            retailerframe.add(locationfield);
    
            JLabel Openinghourlabel = new JLabel("Opening Hour");
            Openinghourlabel.setBounds(100, 250, 100, 30);
            retailerframe.add(Openinghourlabel);
    
            JTextField openinghourfield = new JTextField();
            openinghourfield.setBounds(250, 250, 200, 30);
            retailerframe.add(openinghourfield);
    
            JLabel Totalsaleslabel = new JLabel("Total Sales");
            Totalsaleslabel.setBounds(100, 300, 100, 30);
            retailerframe.add(Totalsaleslabel);
    
            JTextField totalsalesfield = new JTextField();
            totalsalesfield.setBounds(250, 300, 200, 30);
            retailerframe.add(totalsalesfield);
    
            JLabel Totaldiscountlabel = new JLabel("Total Discount");
            Totaldiscountlabel.setBounds(600, 100, 100, 30);
            retailerframe.add(Totaldiscountlabel);
    
            JTextField totaldiscountfield = new JTextField();
            totaldiscountfield.setBounds(750, 100, 200, 30);
            retailerframe.add(totaldiscountfield);
    
            JLabel vatinclusivepricelabel = new JLabel("VAT inclusive price");
            vatinclusivepricelabel.setBounds(600, 200, 120, 30);
            retailerframe.add(vatinclusivepricelabel);
    
            JTextField vatinclusivepricefield = new JTextField();
            vatinclusivepricefield.setBounds(750, 200, 200, 30);
            retailerframe.add(vatinclusivepricefield);
    
            JLabel ispaymentonlinelabel = new JLabel("Is Payment Online");
            ispaymentonlinelabel.setBounds(600, 150, 120, 30);
            retailerframe.add(ispaymentonlinelabel);
    
            JCheckBox Yesbtn = new JCheckBox("Yes");
            Yesbtn.setBounds(750, 150, 60, 20);
            retailerframe.add(Yesbtn);
    
            JCheckBox Nobtn = new JCheckBox("No");
            Nobtn.setBounds(810, 150, 60, 20);
            retailerframe.add(Nobtn);
    
            ButtonGroup ispaymentonlinegroup = new ButtonGroup();
            ispaymentonlinegroup.add(Yesbtn);
            ispaymentonlinegroup.add(Nobtn);
    
            String[] years = new String[10];
            years[0] = "";
            for (int i = 1; i < 10; i++) {
                years[i] = String.valueOf(2015 + i);
            }
    
            JLabel purchasedyearlabel = new JLabel("Purchased year");
            purchasedyearlabel.setBounds(600, 250, 100, 30);
            retailerframe.add(purchasedyearlabel);
    
            JComboBox<String> yearbox = new JComboBox<>(years);
            yearbox.setBounds(750, 250, 150, 20);
            retailerframe.add(yearbox);
    
            JButton calculationbtn = new JButton("Add a Retailer");
            calculationbtn.setBounds(350, 350, 200, 40);
            retailerframe.add(calculationbtn);
    
            JButton clearbtn = new JButton("Clear TextField");
            clearbtn.setBounds(650, 350, 150, 40);
            retailerframe.add(clearbtn);
            
            JLabel subheading = new JLabel("SET LOYALTY POINT");
            subheading.setBounds(450,400, 300, 50); 
            subheading.setFont(new Font("Arial", Font.BOLD, 20));  
            retailerframe.add(subheading);
        
    
            JLabel loyaltyStoreidlabel = new JLabel("Store id");
            loyaltyStoreidlabel.setBounds(100, 475, 65, 30);
            retailerframe.add(loyaltyStoreidlabel);
    
            JTextField loyaltystoreidfield = new JTextField();
            loyaltystoreidfield.setBounds(250, 475, 150, 30);
            retailerframe.add(loyaltystoreidfield);
    
            JLabel loyaltyvatinclusivepricelabel = new JLabel("VAT inclusive price");
            loyaltyvatinclusivepricelabel.setBounds(600, 475, 120, 30);
            retailerframe.add(loyaltyvatinclusivepricelabel);
    
            JTextField loyaltyvatinclusivepricefield = new JTextField();
            loyaltyvatinclusivepricefield.setBounds(750, 475, 200, 30);
            retailerframe.add(loyaltyvatinclusivepricefield);
    
            JLabel loayltyispaymentonlinelabel = new JLabel("Is Payment Online");
            loayltyispaymentonlinelabel.setBounds(100, 525, 120, 30);
            retailerframe.add(loayltyispaymentonlinelabel);
    
            JCheckBox Yesonlinebtn = new JCheckBox("Yes");
            Yesonlinebtn.setBounds(250, 525, 60, 20);
            retailerframe.add(Yesonlinebtn);
    
            JCheckBox Noonlinebtn = new JCheckBox("No");
            Noonlinebtn.setBounds(310, 525, 60, 20);
            retailerframe.add(Noonlinebtn);
    
            ButtonGroup spaymentonlinegroup = new ButtonGroup();
            spaymentonlinegroup.add(Yesonlinebtn);
            spaymentonlinegroup.add(Noonlinebtn);
    
            JButton calculateloyaltypointbtn = new JButton("Calculate Loyalty Point");
            calculateloyaltypointbtn.setBounds(350, 575, 200, 40);
            retailerframe.add(calculateloyaltypointbtn);
    
            JButton clearbtn2 = new JButton("Clear TextField");
            clearbtn2.setBounds(650, 575, 150, 40);
            retailerframe.add(clearbtn2);
            clearbtn2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae2){
                        int option=JOptionPane.showConfirmDialog(retailerframe,"Are you sure you want to clear","Confirm", JOptionPane.YES_NO_OPTION);
                        if (option==JOptionPane.YES_OPTION){
                        loyaltystoreidfield.setText("");
                        loyaltyvatinclusivepricefield.setText("");
                        spaymentonlinegroup.clearSelection();
                    }
                        
                    }
                });
    
                
                calculationbtn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae2){
                        try{
                            if(locationfield.getText().isEmpty() ||storenamefield.getText().isEmpty()||openinghourfield.getText().isEmpty() || 
                            ispaymentonlinegroup.getSelection() ==null ||yearbox.getSelectedItem()==null){
                                JOptionPane.showMessageDialog(retailerframe,"Enter all the values ");
                            }
                        else{
                            boolean storeexists=false;
                            int storeId = Integer.parseInt(storeidfield.getText());
                            String storeName = storenamefield.getText();
                            String location = locationfield.getText();
                            String openingHour = openinghourfield.getText();
                            double totalSales = Double.parseDouble(totalsalesfield.getText());
                            double totalDiscount = Double.parseDouble(totaldiscountfield.getText());
                            int vatInclusivePrice = Integer.parseInt(vatinclusivepricefield.getText());
                            boolean isPaymentOnline = Yesbtn.isSelected() && !Nobtn.isSelected();
                            String purchasedYear = (String)yearbox.getSelectedItem();
                            
                            for(Store eachobj : StoreList){
                                if(eachobj instanceof Retailer && eachobj.getstoreId()==storeId){
                                     storeexists=true;
                                     break;
                            }}
                            
                        if(storeexists==true){
                            JOptionPane.showMessageDialog(retailerframe,"RETAILER ALREADY EXISTS");
                        }   
                        else{
                            Retailer retailer = new Retailer(storeId,storeName,location,openingHour, totalSales,
                                totalDiscount,vatInclusivePrice,isPaymentOnline,purchasedYear);
                            StoreList.add(retailer);
                            JOptionPane.showMessageDialog(retailerframe,"thank you for adding");
                            
                            
                        }
                    }
                }
                    catch(NumberFormatException nfe1){
                        JOptionPane.showMessageDialog(retailerframe,"Number format exception");
                    }
                    catch(NullPointerException npe1){
                        JOptionPane.showMessageDialog(retailerframe,"Enter all the null fields ");
                        
                        
                        
                    }
                    }
                });
            JButton removeproductbtn = new JButton("Remove Product");
            removeproductbtn.setBounds(300, 650, 150, 40);
            retailerframe.add(removeproductbtn);
            removeproductbtn.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent ae3){
                            
                                try{
                                    String input =JOptionPane.showInputDialog(retailerframe, "Enter Store ID:");
                                     if(input==null){
                                         JOptionPane.showMessageDialog(retailerframe, "Canceled");
                                    }
                                    else if (input.equals("")){
                                        JOptionPane.showMessageDialog(retailerframe, "Store ID cannot be empty.");
                                        
                                    }
                                    else{
                                        int storeId= Integer.parseInt(input);
                                        boolean storeexists=false;               
                    
                                            for(Store eachobj : StoreList){
                                                    if(eachobj instanceof Retailer && eachobj.getstoreId()==storeId){
                                                        Retailer retailer =(Retailer)eachobj;
                                                        retailer.removeProduct();
                                                         storeexists=true;
                                                         break;
                                                }}
                                                if(storeexists==true){
                                            JOptionPane.showMessageDialog(retailerframe,"The product is removed");
                                        }   
                                        else{
                                            JOptionPane.showMessageDialog(retailerframe,"Retailer not Found ");
                                        }
                                    }
                                }
                                    catch(NumberFormatException nfe1){
                                    JOptionPane.showMessageDialog(retailerframe,"Enter the fields Correctly");
                                    }
                                catch(NullPointerException npe1){
                                    JOptionPane.showMessageDialog(retailerframe,"Enter all the null fields ");
                                        
                                }
                        }
                    });
                clearbtn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae2){
                         int option=JOptionPane.showConfirmDialog(retailerframe,"Are you sure you want to clear","Confirm", JOptionPane.YES_NO_OPTION);
                    if (option==JOptionPane.YES_OPTION){
                        storeidfield.setText("");
                        storenamefield.setText("");
                        locationfield.setText("");
                        openinghourfield.setText("");
                        totalsalesfield.setText("");
                        totaldiscountfield.setText("");
                        vatinclusivepricefield.setText("");
                        ispaymentonlinegroup.clearSelection();
                        yearbox.setSelectedIndex(0);
                        
                        
                    
                }
                        
                    }
                });                          
        calculateloyaltypointbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae3){       
                
                    try{
                        boolean storeexists=false;                    
                        if( 
                            spaymentonlinegroup.getSelection() ==null ){
                                JOptionPane.showMessageDialog(retailerframe,"Enter if the product is in sales");
                            }
                        
                        else{
                    
                            int storeId = Integer.parseInt(loyaltystoreidfield.getText());
                            boolean isPaymentOnline = Yesonlinebtn.isSelected() && !Noonlinebtn.isSelected();
                            int vatInclusivePrice = Integer.parseInt(loyaltyvatinclusivepricefield.getText());
    
                            for(Store eachobj : StoreList){
                                    if(eachobj instanceof Retailer && eachobj.getstoreId()==storeId){
                                        Retailer retailer =(Retailer)eachobj;
                                        retailer.setloyaltypoint(isPaymentOnline,vatInclusivePrice);
                                         storeexists=true;
                                         break;
                                }}
                                if(storeexists==true){
                            JOptionPane.showMessageDialog(retailerframe,"The loyalty point has been calculated");
                        }   
                        else{
                           
                            JOptionPane.showMessageDialog(retailerframe,"Retailer ID not Found ");
                        }
                            }
                        }
                    catch(NumberFormatException nfe1){
                        JOptionPane.showMessageDialog(retailerframe,"Enter the fields Correctly");
                        }
                    catch(NullPointerException npe1){
                        JOptionPane.showMessageDialog(retailerframe,"Enter all the null fields ");
                            
                    }

            }
        });
       
        JButton retailerdisplaybtn = new JButton("Display button");
        retailerdisplaybtn.setBounds(500,650,150,40);
        retailerframe.add(retailerdisplaybtn);
        
        retailerdisplaybtn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae2){
                        boolean storeexists=false;   
                    try {
                            String input =JOptionPane.showInputDialog(retailerframe, "Enter Store ID:");
                            if(input==null){
                                JOptionPane.showMessageDialog(retailerframe, "canceled");
                            }
                            else if (input.equals("")){
                                JOptionPane.showMessageDialog(retailerframe, "Store ID cannot be empty.");
                                        
                            }
                            else{
                            int storeId= Integer.parseInt(input);       
                                                    

                        for(Store eachobj : StoreList){
                                    if(eachobj instanceof Retailer && eachobj.getstoreId()==storeId){
                                        Retailer retailer =(Retailer)eachobj;
                                        
                                        
                                            JOptionPane.showMessageDialog(retailerdisplaybtn,
                                            "The store id of retailer is " + retailer.getstoreId() + "\n" +
                                            "The Store Name is: " + retailer.getstoreName() + "\n" +
                                            "The Store Location is: " + retailer.getlocation() + "\n" +
                                            "The Opening hour of retailer is: " + retailer.getopeningHour() + "\n" +
                                            "The total sales = " + retailer.gettotalSales() + "\n" +
                                            "The total discount = " + retailer.gettotalDiscount() + "\n" +
                                            "VAT Inclusive Price = " + retailer.getvatInclusivePrice() + "\n" +
                                            "Loyalty Point = " + retailer.getloyaltyPoint() + "\n" +
                                            "Purchased Year = " + retailer.getpurchasedYear()
                                        );
    
                                         storeexists=true;
                                        }
                                   
                                    }
                    
                    if(storeexists==false){
                    JOptionPane.showMessageDialog(retailerframe, "Retailer doesnot exist");
                    
                        }
                    }
                }
                    catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(retailerframe, "Invalid input. Please enter a valid integer.");
                    }
                }
                });
    
            }
                });
}
}
