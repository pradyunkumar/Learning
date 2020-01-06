package pradyunjava;

public class MobilePhone extends ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered up");

    }

    @Override
    public void dial(int phonenumber) {
        if(isOn) {
            System.out.println("Now ringing " + phonenumber + " on mobilephone");
        } else {
            System.out.println("Phone is switched off");
            isRinging = false;
        }
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
        if(phonenumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody play");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or not right number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
