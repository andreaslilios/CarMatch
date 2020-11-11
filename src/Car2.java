
public class Car2 {
    private String company;
    private String color;
    private String model;
    private int horsepower;
    private int cubic;
    private int price;
    private int code;
    
    
    
    
    public Car2(String company,String color,String model,int horsepower,int cubic,int price)
    {
      this.company=company;
      this.color=color;
      this.model=model;
      this.horsepower=horsepower;
      this.cubic=cubic;
      this.price=price;
      
    }
  
    
    
    public void setCode(int code)
       {
        this.code=code;
       }
    public int    getCode(){
        return code;
       }



    public void setCompany(String company)
    {
        this.company=company;
    }

    public void setColor(String color)
    {
        this.color=color;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public void setCubic(int cubic)
    {
        this.cubic=cubic;
    }  
    public void setPrice(int price)
    {
        this.price=price;
    }
    public void setHorsepower(int horsepower)
    {
        this.horsepower=horsepower;
    }

    public String getCompany(){
       return company;
    }
    public String getColor(){
        return color;
    }
    public String    getModel(){
        return model;
    }
    public int    getHorsepower(){
        return horsepower;
    }
    public int    getCubic(){
        return cubic;
    }
    public int    getPrice(){
        return price;
    }

    public void printer()
    {
        System.out.println("To modelo einai:"+model+" o kwdikos einai:"+code);

    }
    

    
}
