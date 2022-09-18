package telephone;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    
    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskphone");
        }
        
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            System.out.println("Ring ring");
        }else{
            isRinging = false;
        }
        return isRinging;
        
    }
    @Override
    public void dail(int phoneNumber) {
        System.out.println("Now Ringing"+phoneNumber+" on deskphone");
        
    }
    @Override
    public boolean isRinging() {
        return isRinging;
        
    }
    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
        
    }

    
}
