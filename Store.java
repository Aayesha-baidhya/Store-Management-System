
public class Store{
    //Store Attributes
    
    private int storeId;
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;
    
    //Constructor to initialize Store object
    
    public Store(int storeId, String storeName, String location, String openingHour){
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        
        //Initialize Sales and Discount to zero
        this.totalSales = 0.0;
        this.totalDiscount = 0.0;
    
    }
    
    //Accessor(Getter) Method
    
    public int getstoreId(){
        return this.storeId;
    }
    
    public String getstoreName(){
        return this.storeName;
    }
    
    public String getlocation(){
        return this.location;
    }
    
    public String getopeningHour(){
        return this.openingHour;
    }
    
    public double gettotalSales(){
        return this.totalSales;
    }
    
    public double gettotalDiscount(){
        return this.totalDiscount;
    }
    
    //Mutator(Setter) Method for totalSales
    
    public void settotalSales(double totalSales){
        //Add new Sales to the existing totalSales
        this.totalSales = this.totalSales + totalSales;
    }
    
    //Mutator(Setter) Method for totalDiscount
    
    public void settotalDiscount(double totalDiscount){
        //Add new Discount to the existing totalDiscount
        this.totalDiscount = this.totalDiscount + totalDiscount;
    }
    
    //Display Method
    
    public void Display(){
        System.out.println("storeId:"+storeId);
        System.out.println("storeName:"+storeName);
        System.out.println("location:"+location);
        System.out.println("openingHour:"+openingHour);
        
        if(totalSales == 0.0 && totalDiscount == 0.0){
            System.out.println("No Sales or Discounts recorded yet.");
    } 
    else{
        System.out.println("totalSales:"+gettotalSales());
        System.out.println("totalDiscount:"+gettotalDiscount());
    }
}
}