public class HelloWorld {   //program helps understand basic terminology

    public static void main(String[] args){

        System.out.println("Hello World.");

        int myFirstnum = 5;     //data type, variable; 5 is a LITERAL
        byte myByte = 10;
        byte newByte = (byte)(myByte/2);    //casting mechanism
        System.out.println(myFirstnum);     //prints out referred variable

        /*VARIABLE: a place in memory that you can store something
                    allowed many variables, making programs useful
                    stores machine information

            Data Types: int, double, String, etc.
                int = -2_147_483_648 to 2_147_483_647 (width of 32)
            Primitive Data Type = byte, short
                byte = -128 to 127  (doesn't take as much memory, 8)
                short = -32768 to 32767 (width of 16)
                long = 2^63(width of 64)
         */
    }

}
