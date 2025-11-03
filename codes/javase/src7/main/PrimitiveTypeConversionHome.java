package main;

public class PrimitiveTypeConversionHome {
    public static void main(String[] args) {

        int num1 = 55;
        byte byteValue1 = (byte) num1;
        System.out.println("int (55) → byte: " + byteValue1);

        short num2 = 636;
        byte byteValue2 = (byte) num2;
        System.out.println("short (636) → byte: " + byteValue2);

        long num3 = 458L;
        short shortValue1 = (short) num3;
        System.out.println("long (458) → short: " + shortValue1);

        long num4 = 92523635483L;
        int intValue1 = (int) num4;
        System.out.println("long (92523635483) → int: " + intValue1);

        double num5 = 65787.3;
        int intValue2 = (int) num5;
        System.out.println("double (65787.3) → int: " + intValue2);

        char ch1 = 'q';
        int intValue3 = (int) ch1;
        System.out.println("char ('q') → int: " + intValue3);

        int num6 = 266;
        char ch2 = (char) num6;
        System.out.println("int (266) → char: " + ch2);
    }
}
