import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Registration n1 = new Registration();
        n1.fname = "Al raiyan";
        n1.lname = "Alzakwani";
        n1.phonenum = 96310568;
        n1.email = "alzakwani0@gmail.com";
        n1.id = 144876;
        n1.printfname(); n1.printid(); n1.printnum(); n1.printemail(); System.out.println();

        Registration n2 = new Registration();
        System.out.println("Enter your first name : ");
        n2.fname = read.next();
        System.out.println("Enter your last name : ");
        n2.lname = read.next();
        System.out.println("Enter your phone number : ");
        n2.phonenum = read.nextInt();
        System.out.println("Enter your email : ");
        n2.email = read.next();
        System.out.println("Enter your ID : ");
        n2.id = read.nextInt();
        n2.printfname(); n2.printid(); n2.printnum(); n2.printemail(); System.out.println();

        Registration n3 = new Registration("Alraiyan", "Alzakwani", 96310568, "alzakwani@gmail.com", 14489765);
        n3.printinfo();
    }
}

class Registration {
    Registration(){
        System.out.println("Welcome!");
    }
    Registration(String n, String ln, int phone, String mail, int cid){
        fname = n;
        lname = ln;
        phonenum = phone;
        email = mail;
        id = cid;
    }
    String fname;
    String lname;
    int phonenum;
    String email;
    int id;
    void printfname(){
        System.out.println("Full name : " + fname +" "+ lname);
    }
    void printnum(){
        System.out.println("Phone number : "+phonenum);
    }

    void printemail(){
        System.out.println("Email : "+email);
    }
    void printid(){
        System.out.println("Your ID : "+id);
    }
    void printinfo(){
        System.out.println("Full name :" + fname +" "+ lname+"\n"+"Phone number : "+phonenum+"\n"+"Email : "+email+"\n"+"Your ID : "+id);
    }
}