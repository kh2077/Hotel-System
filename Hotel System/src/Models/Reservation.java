package Models;
public class Reservation {
    private String reservationId = "R" + (int)(Math.random() * 50000);
    private Customer customer;
    private Room room;
    private Service service;
    private List<Service> serviceLIST;
    private double totalCost; 
    private LocalDate checkIn = LocalDate.now();
    private LocalDate checkOut = LocalDate.now();
    public Reservation(Customer customer, Room room,Service service) { 
        this.customer = new Customer("1" , "khaled" , "010"); 
        this.room = new Room("1" , "single" , 29.5 , false);
        this.service= new Service("1" , "khaled" , "good" , 12.4); 
    }
    public String getReservationId(){
        return reservationId;
    }
    public Customer getCustomer(){
        return customer;
    }
    public Room getRoom(){
        return room;
    }
    public Service getService(){
        return service;
    }
    public void setCustomer(Customer customer){
        this.customer = new Customer("1" , "khaled" , "010");
    }
    public void setRoom(Room room){
        this.room = new Room("1" , "single" , 29.5 , false);
    }
    public void setService(Service service){
        this.service = new Service("1" , "khaled" , "good" , 12.4);
    }
    
    public int calculateNights(){
        if(checkOut.getMonthValue() == checkIn.getMonthValue()){
            return checkOut.getDayOfMonth() -  checkIn.getDayOfMonth();
        }
        else if(checkOut.getYear() == checkIn.getYear()){
            return (checkOut.getMonthValue() -  checkIn.getMonthValue()) * 30 + (checkOut.getDayOfMonth() -  checkIn.getDayOfMonth());
        }
        else{
            return ((checkOut.getMonthValue() + (12 * (checkOut.getYear() - checkIn.getYear())) - checkIn.getMonthValue()) * 30) + (checkOut.getDayOfMonth() -  checkIn.getDayOfMonth());
        }
    }
    public double calculateTotalCost(){
        return (room.price * calculateNights())+ service.price;
    }
    public String generateInvoic(){
        return "INVOICE\n" + "Reservation: " + reservationId + "\n" + "Customer: " + customer.name + "\n" + "Room: " + room.number + "\n" + "ChechIn: " + checkIn.getDayOfMonth() +" / "+ checkIn.getMonthValue() + " / " + checkIn.getYear() + "\n" + "CheckOut: " + checkOut.getDayOfMonth() +" / "+ checkOut.getMonthValue() + " / " + checkOut.getYear()   + "\n" + "Nights: " + calculateNights() + "\n" + "Room price per night: " + room.price + "\n" + "Services: \n" + "-food: " + service.price + "\n" + "-----------" + "\n" + "TOTAL: " + calculateTotalCost();
    }
}

