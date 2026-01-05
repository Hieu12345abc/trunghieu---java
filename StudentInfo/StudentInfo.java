import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ho va ten: ");
        String hoVaTen = scanner.nextLine();
        
        System.out.print("Nhap MSSV: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nhap que quan: ");
        String hometown = scanner.nextLine();
        
        System.out.print("Nhap GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.print("Nhap chuyen nganh: ");
        String major = scanner.nextLine();
        
        System.out.print("Co hoc bong khong (true/false): ");
        boolean scholarship = scanner.nextBoolean();
        
        // In ra thông tin
        System.out.println("\n--- Thong tin sinh vien ---");
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("MSSV: " + studentID);
        System.out.println("Que quan: " + hometown);
        System.out.println("GPA: " + gpa);
        System.out.println("Chuyen nganh: " + major);
        System.out.println("Hoc bong: " + scholarship);
        
        scanner.close();
    }
}
