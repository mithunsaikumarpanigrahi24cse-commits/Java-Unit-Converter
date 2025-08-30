import java.io.*;
public class UnitConverter {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice;
        do{
            System.out.println("***************************************");
            System.out.println("      Java Unit Converter!!!");
            System.out.println("      Created By: Mithun Sai Kumar");
            System.out.println("***************************************");
            System.out.println("1.Temperature Conversion(celsius<->Fahrenheit)");
            System.out.println("2.Volume Conversion(litres<->millilitres)");
            System.out.println("3.Length Conversion(Kilometers<->Meters)");
            System.out.println("4.Mass Conversion(Kilograms<->grams)");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice=Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:convertTemperature(br);
                break;
                case 2:convertVolume(br);
                break;
                case 3:convertLength(br);
                break;
                case 4:convertMass(br);
                break;
                case 5:
                System.out.println("Exiting...Thank you for using my Unit Converter");
                break;
                default:
                    System.out.println("Invalid Choice...try again");
            }
        }while(choice!=5);
    }
    public static void convertTemperature(BufferedReader br)throws IOException{
        System.out.println("Enter 1 for Celsius<->Fahrenheit and 2 for Fahrenheit<->Celsius");
        int option=Integer.parseInt(br.readLine());
        System.out.println("Enter the value::");
        double value=Integer.parseInt(br.readLine());
        if(option==1){
            double result=(value*9/5)+32;
            System.out.println(value+" "+"Celsius="+result+" "+"Fahrenheit");
        }else{
            double result=(value-32)*5/9;
            System.out.println(value+" "+"Fahrenheit="+result+" "+"Celsius");
        }
    }
 public static void convertVolume(BufferedReader br)throws IOException{
        System.out.println("Enter 1 for Litres<->Millilitres and 2 for Millilitres<->Litres");
        int option=Integer.parseInt(br.readLine());
        System.out.println("Enter the value::");
        double value=Integer.parseInt(br.readLine());
        if(option==1){
            double result=value*1000;
            System.out.println(value+" "+"Litres="+result+" "+"Millilitres");
        }else{
            double result=value/1000;
            System.out.println(value+" "+"Millilitres="+result+" "+"Litres");
        }
    }

 public static void convertLength(BufferedReader br)throws IOException{
        System.out.println("Enter 1 for Kilometers<->Metres and 2 for Meters<->Kilometres");
        int option=Integer.parseInt(br.readLine());
        System.out.println("Enter the value::");
        double value=Integer.parseInt(br.readLine());
        if(option==1){
            double result=value*1000;
            System.out.println(value+" "+"Kilometers="+result+" "+"Metres");
        }else{
            double result=value/1000;
            System.out.println(value+" "+"Meters="+result+" "+"Kilometers");
        }
    }
     public static void convertMass(BufferedReader br)throws IOException{
        System.out.println("Enter 1 for Kilograms<->Grams and 2 for Grams<->Kilograms");
        int option=Integer.parseInt(br.readLine());
        System.out.println("Enter the value::");
        double value=Integer.parseInt(br.readLine());
        if(option==1){
            double result=value*1000;
            System.out.println(value+" "+"Kilograms="+result+" "+"Grams");
        }else{
            double result=value/1000;
            System.out.println(value+" "+"Grams="+result+" "+"Kilograms");
        }
    }
}
 
    
    
    