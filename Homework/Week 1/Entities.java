import java.util.Scanner;

public class Entities {
private String Name;
private int Id;
private int Diem;
Scanner nhap = null;
public String getName() {
	return Name;
}
public void setName() {
	nhap = new Scanner(System.in);
	System.out.println("Nhap vao ten sinh vien");
	this.Name = nhap.nextLine();
}
public int getId() {
	return Id;
}
public void setId() {
	nhap = new Scanner(System.in);
	System.out.println("Nhap vao MSSV");
	this.Id = nhap.nextInt();
}
public int getDiem() {
	return Diem;
}
public void setDiem() {
	nhap = new Scanner(System.in);
	System.out.println("Nhap vao diem sinh vien");
	this.Diem = nhap.nextInt();
}
}
