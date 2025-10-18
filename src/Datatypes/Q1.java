package Datatypes;

class C2W_CharDemo1 {
    public static void main(String [] args){
        char ch ;
        ch = 65;
        System.out.println("ch="+ch);
        System.out.println("ch="+ ch+1);
    }
}
//The ouput we can see here is that the Ascii value 65 in converted into the character as A and
//After that also if we do the concatenation with the Chracter A it will give output as A1

 class C2W_CharDemo2 {
    public static void main(String [] args){
        char ch ;
        ch = 50;
        System.out.println("char="+ch);
        System.out.println("char="+ch+1);
    }
}
//The output will get printed as the ascii values of the 50 belongs to 2 as we know that for 0
// the ascii value is 48 so going along we get that 2 for first one and for second the concatenation
//of 2 with 1 will show output as 21


class C2W_CharDemo3 {
    public static void main(String[] args){
        char ch;
        ch =97;
        System.out.println("char="+ch);
        System.out.println("char="+ch+1);
    }
}
//It is showing error incompatible type : String cannot be converted into character