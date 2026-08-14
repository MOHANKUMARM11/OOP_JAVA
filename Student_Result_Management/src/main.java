import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Student s1=new Student(
                "Mohan",
                1,
                new int[]{100,90,89,97,80});


        Student s2=new Student(
                "Pranesh",
                2,
                new int[]{100,99,97,80,80});



        Student s3=new Student(
                "Nandha",
                3,
                new int[]{0,90,89,95,80});


        System.out.println(s1+"\n------------------------------------------------");
        System.out.println(s2+"\n------------------------------------------------");
        System.out.println(s3+"\n------------------------------------------------");
    }
}
