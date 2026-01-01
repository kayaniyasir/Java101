public class PrintDataType2 {

    public static void main(String[] args) {

        System.out.println("\t --- Homework no 1   \t Saud Alkoud   \t  ID    223111227  ---");
        System.out.println("DataType\t\tMin Value\t\t Max Value \t\t Size in Bits \t\t Size in Bytes");
        System.out.println("Short \t\t\t" + Short.MIN_VALUE + " \t\t\t" + Short.MAX_VALUE + "\t\t\t\t" + Short.SIZE + "" + " \t\t\t" + Short.BYTES);
        System.out.println("Integer\t\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE + "\t\t\t" + Integer.SIZE + "" + " \t\t\t" + Integer.BYTES);
        System.out.println("Long    \t\t" + Long.MIN_VALUE +"\t" + Long.MAX_VALUE + "\t\t" + Long.SIZE + "\t\t\t" + Long.BYTES);
        System.out.println("Float      \t \t " + Float.MIN_VALUE + " \t\t" + Float.MAX_VALUE + "\t\t\t" + Float.SIZE + "\t" + " \t\t" + Float.BYTES);
        System.out.println("Double   \t  \t " + Double.MIN_VALUE + "  \t  \t  " + Double.MAX_VALUE + "\t" + Double.SIZE + "" + " \t\t\t" + Double.BYTES);
        System.out.println("character  \t   \t " +(int)Character.MIN_VALUE +"  \t   \t   \t" +(int) Character.MAX_VALUE + "     \t\t\t" + Character.SIZE + "" + " \t\t\t" + Character.BYTES);
        System.out.println("Boolean   \t \t " + Boolean.TRUE + " \t \t  \t  " + Boolean.FALSE + " \t \t\t" + Boolean.TYPE + "\t" + "\t \t" + Boolean.toString(true));

    }

}