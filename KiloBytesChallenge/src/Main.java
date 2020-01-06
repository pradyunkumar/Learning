public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes = (kiloBytes - (kiloBytes % 1024)) / 1024;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and "
            + (kiloBytes % 1024) + " KB");
        }
    }
}
