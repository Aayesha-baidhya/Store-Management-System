
public class Retailer extends Store{
    // Retailer Attributes
    
    private int vatInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;
    
    //Constructor
    
    public Retailer(int storeId, String storeName, String location, String openingHour, double totalSales,
    double totalDiscount, int vatInclusivePrice, boolean isPaymentOnline, String purchasedYear){
        super(storeId, storeName, location, openingHour);
        super.settotalSales(totalSales);
        super.settotalDiscount(totalDiscount);
        
        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0;
    }
    
    //Accessor(Getter) Method
    
    public int getvatInclusivePrice(){
        return this.vatInclusivePrice;
    }
    
    public int getloyaltyPoint(){
        return this.loyaltyPoint;
    }
    
    public boolean getisPaymentOnline(){
        return this.isPaymentOnline;
    }
    
    public String getpurchasedYear(){
        return this.purchasedYear;
    }
    
    //Mutator(Setter) Method for isPaymentOnline
    
    public void setisPaymentOnline(boolean isPaymentOnline){
        this.isPaymentOnline = isPaymentOnline;
    }
    
    public void setloyaltypoint(boolean isPaymentOnline,int vatInclusivePrice) 
    {
        if(isPaymentOnline == true){
            this.loyaltyPoint = (int)(0.01 * vatInclusivePrice);
            
        }
        else{
            System.out.print("The payment was done offline.");
        }
        
    }
    public void removeProduct()
    {
        if(loyaltyPoint==0 &&  this.purchasedYear=="2020"|| this.purchasedYear=="2021"||this.purchasedYear=="2022")
        {
             this.vatInclusivePrice=0;
             this.isPaymentOnline= false;      
            
            
        }
        else
        {
            System.out.print("The Product was not removed.");
        }
    }
    
    //Display
    @Override
    public void Display(){
        if(this.loyaltyPoint !=0)
        {
            super.Display();
            System.out.println("The VAT inclusive Price of the product is"+getvatInclusivePrice());
            System.out.println("The loyalty point of the product is"+getloyaltyPoint());
            System.out.println("The purchased year of the product is"+getpurchasedYear());
            
            
            
        }
        else
        {
            super.Display();
            System.out.println("This product has been removed.");
            
        }

        
        
    
    
    }
}
