/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC3_SCANNER;

/**
 *
 * @author Fishinyx
 */
import java.util.Scanner; 

public class StudentInfo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 1. Nhập Họ và tên 
        System.out.print("Nhap ho va ten: ");
        String hoVaTen = keyboard.nextLine();

        // 2. Nhập Mã sinh viên (int)
        System.out.print("Nhap Student ID: ");
        int studentID = keyboard.nextInt();

        keyboard.nextLine();

        // 3. Nhập Quê quán 
        System.out.print("Nhap Hometown: ");
        String hometown = keyboard.nextLine();

        // 4. Nhập Điểm trung bình 
        System.out.print("Nhap GPA: ");
        float gpa = keyboard.nextFloat();

        keyboard.nextLine();

        // 5. Nhập Chuyên ngành 
        System.out.print("Nhap Major: ");
        String major = keyboard.nextLine();

        // 6. Nhập Học bổng (boolean: true/false)
        System.out.print("Co hoc bong khong? (true/false): ");
        boolean scholarship = keyboard.nextBoolean();

        // --- HIỂN THỊ THÔNG TIN ---
        System.out.println("\n--- THONG TIN SINH VIEN ---");
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Student ID: " + studentID);
        System.out.println("Hometown: " + hometown);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Scholarship: " + scholarship);

        keyboard.close();
    }
