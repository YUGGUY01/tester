public class test {
    public static void main(String[] args){
        Billpayment Bill1 = new Billpayment();
        System.out.println(Bill1.getBill_currentUnit());
        System.out.println(Bill1.setBill_currentUnit());
        System.out.println(Bill1.calculateUnit());
    }
}

class Billpayment{
    private String bill_type;
    private int bill_lastUnit;
    private int currentUnit;
    private double bill_result;
    

public Billpayment(String ty , int lU){
    bill_type = ty;
    bill_lastUnit = lU;
}

public int getBill_currentUnit(){
    return getBill_currentUnit();
}
public int setBill_currentUnit(){
    return setBill_currentUnit();
}
public int calculateUnit(){
    return calculateUnit();
}
public double calculateBill(){
    return calculateBill();
}
public String displayBill(){
    return displayBill();
}
}