
public class Department extends Store{
    //Department Attributes
    
    private String Productname;
    private double Markedprice;
    private double Sellingprice;
    private boolean isInSales;
                           
    //Constructor
    
    public Department(int storeId, String storeName, String location, String openingHour, double totalSales,
    double totalDiscount, String Productname, double Markedprice){
        // Call superclass Constructor with 4 parameters
        
        super(storeId, storeName, location, openingHour); 
        
        //Set totalsales using superclass setter
        
        super.settotalSales(totalSales);
        
        //Set totalDiscount using superclass setter
        
        super.settotalDiscount(totalDiscount);
        
        this.Productname = Productname;
        this.Markedprice = Markedprice;
        
        //Initialize Sellingprice to zero
        this.Sellingprice = 0.0;
        
        this.isInSales = true;
    
    }
    
    //Accessor/Getter Method
    
    public String getProductname(){
        return this.Productname;
    }
    
    public double getMarkedprice(){
        return this.Markedprice;
    }
    
    public double getSellingprice(){
        return this.Sellingprice;
    }
    
    public boolean getisInSales(){
        return this.isInSales;
    }
    
    //Mutator/Setter Method for Markedprice
    
    public void setMarkedprice(double Markedprice){
        this.Markedprice = Markedprice;
    }
    
    //Method to calculate discount and selling price
    
    public void  calculateDiscountPrice(boolean isInSales, double Markedprice){
        double discount;
        if(isInSales==true){
            if(Markedprice >= 5000){
                discount = 0.2; //20% discount
            } 
            else if(Markedprice >= 3000 && Markedprice <= 5000){
                discount = 0.1; //10% discount
            } 
            else if(Markedprice >=1000 && Markedprice <=3000){
                discount = 0.05; //5% discount
            } 
            else{
                discount = 0.0; //0% discount
            }
            //Calculating Sellingprice after price is discounted
            this.Sellingprice = Markedprice -(Markedprice * discount);
            
            //Updating totalDiscount by calling its mutator from superclass
            super.settotalDiscount(Markedprice * discount);
            
            this.isInSales = false;
            
        }
    }
    
    //Display Method
    //Using Method Override
    
    public void Display(){
        //Calling display method from superclass to display its all attributes
        
        super.Display();
        if(isInSales){
            System.out.println("Name of the product is:"+  getProductname());
            System.out.println("Marked price is:"+  getMarkedprice());
        }
        else{
            System.out.println("Name of the product is:"+ getProductname());
            System.out.println("Selling price is:"+ getSellingprice());
        }
    }
    }