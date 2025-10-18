package Datatypes;

class Core2web {
    public static void main(String [] args){
        int ch = 65;
        int ch1 = ch;
        System.out.println(ch);
        System.out.println(ch1);
    }
}
//This code gives output as incompatible type: possible lossy conversion from int to char
//As we know that the character datatype cannot be converted into int primitive datatype

class C2W_CharDemo6 {
    public static void main(String [] args){
        char ch1 = 65;
        System.out.println(ch1);
        char ch2 = 97;
        System.out.println(ch2);
    }
}

//this code gives output as 65 and 97 ascii values as A and a nothing more than that
