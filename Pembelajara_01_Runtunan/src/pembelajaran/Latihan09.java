package pembelajaran;

import java.util.Scanner;

public class Latihan09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Students myBio = new Students();

        System.out.print("Masukkan NPM: ");
        int npm = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Fullname: ");
        String fullname = input.nextLine();

        System.out.print("Masukkan Class Name: ");
        String className = input.nextLine();

        System.out.print("Masukkan Semester: ");
        int semester = input.nextInt();

        System.out.print("Masukkan GPA: ");
        float gpa = input.nextFloat();

        myBio.getNPM(npm);
        myBio.getFullname(fullname);
        myBio.getClassName(className);
        myBio.getSemester(semester);
        myBio.getGPA(gpa);

        System.out.println();
        System.out.println("===== DATA STUDENTS =====");
        System.out.println("NPM       : " + myBio.getNPM());
        System.out.println("Fullname  : " + myBio.getFullname());
        System.out.println("Class     : " + myBio.getClassName());
        System.out.println("Semester  : " + myBio.getSemester());
        System.out.println("GPA       : " + myBio.getGPA());

        input.close();
    }
}