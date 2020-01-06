package pradyunjava;

public class DeskPhone extends ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone has no power button");

    }

    @Override
    public void dial(int phonenumber) {
        System.out.println("Now ringing " + phonenumber + " on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering deskphone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phonenumber) {
        if(phonenumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
