public class Car {
    /*
    statement to create a new class car
        public means unrestricted access to this class
        private means no other class can use this class
        protected means only classes in this range can access
        these are access modifiers
    */

    private int doors;  //characteristics of car
    private int wheels; //state component of the object(state and behavior)
    private String model;
    private String engine;
    private String color;
    /*
    class is a blueprint for an object we are creating
        local variables are only accessible within the code block/ inside class
        classes allow to create variables that can be seen within entire class - fields, member variables

    for fields, we use access modifier private
        adhering to encapsulation, a key part of object-oriented programming
            used to hide the fields and methods from being accessed publicly
            the internal workings, methods will only be accessed to this class
     */

    public void setModel(String model){     //setter
        String validModel = model.toLowerCase();

        if(validModel.equals("carrera") || validModel.equals("commodore")){
        //to update the field above according to this method, we use the this keyword
            this.model = model; //update the variable with the contents of the parameter
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){   //getter
        return this.model;
    }

}
