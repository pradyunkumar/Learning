package pradyunjava;

public interface ITelephone {
    //define methods
    //only create signatures

    public abstract void powerOn();
    public abstract void dial(int phonenumber);
    public abstract void answer();
    public abstract boolean callPhone(int phonenumber);
    public abstract boolean isRinging();
}
