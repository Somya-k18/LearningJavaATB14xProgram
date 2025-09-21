package ex_02_JavaBasics;

public class Lab022_Byte {
    public static void main(String[] args) {
        byte age = 10;
        /* 10 is decimal number and byte stores in binary number
        So, it gets converted into 4 digits binary number and then
        8 Bits (binary format).
        i.e, 10 -> 1010  -> 0 0 0 0 1 0 1 0,
        120 -> 1111000 -> 0 1 1 1 1 0 0 0
         8 Bits = 1 Byte */

        //byte age1 = 128; (overflowed) 128 -> 100000000 = more than 8 bits

    }
}
