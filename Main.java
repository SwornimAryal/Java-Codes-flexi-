class Main{
    public static void main(String[] args){
        //creating and initalizing custom char
        char a = 'G';

        //integer data type is used for numeric values
        int i = 89;

        //use byte or short if memory is a constraint
        byte b = 4;

        //this will give error as num is larger than byte range;
        //byte b1 = 7988889888888;

        short s = 45;

        //this will give error as num is larger than short range;
        //short s1 = 34495995955443;

//by default fraction value is double in java
        double d = 4.332223;

        //for float suffix f is used
        float f = 3.44544f;

        //big range value
        long l = 121111211;

        System.out.println("char is "+ a);
        System.out.println("integer is  "+ i);
        System.out.println("byte is "+ b);
        System.out.println("short is "+ s);
        System.out.println("float is "+ f);
        System.out.println("double is"+ d);
        System.out.println("long is "+ l);


    }
}