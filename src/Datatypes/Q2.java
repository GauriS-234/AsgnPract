package Datatypes;


 class C2W_ShortDemo1 {
    public static void main(String[] args){
        short sh1 = 19;
        short sh2=11;
        int sh3 = sh1+sh2;
        System.out.println(sh3);
    }
}
//This code will not get any error because we are storing the short datatype into big container as
//int and so we know that short will store 2 bytes and int stores 4 bytes and 1 byte is 8 bits


class C2W_ShortDemo2 {
    public static void main(String [] args){
        short sh1 = 'A';
        short sh2 = 'l';
        System.out.println(sh1);
        System.out.println(sh2);
    }
}
//This code gives output as the ascii values of A and lower case l so they are giving 65 and we know
// lowercase letter starts at 97 after 11 letters we will get the answer as 97+11=108 for lowercase
//letter l and also the characters are converted into integers because of datatype short