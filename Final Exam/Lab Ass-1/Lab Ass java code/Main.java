package online_sopping;


public class Online_Sopping {

  
    public static void main(String[] args) {
        
        
        Admin admin = new Admin();
        
        admin.name = "Md_Tofazzal_Hosen";
        
        System.out.println(admin);

        
        Address address = new Address("Dhaka","Dhaka","Farmgate","Dhaka_Sadar");
        
        Customer customer = new Customer("MD_Tofazzal_Hosen",address);
        
        System.out.println(customer);
        
        
    }
    
}