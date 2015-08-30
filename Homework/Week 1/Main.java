import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	ArrayList<Entities> Arr = new ArrayList<Entities>();
	Entities E = null;
	Scanner nhap = null;
	System.out.println("Nhap vao so luong sinh vien: ");
	nhap = new Scanner(System.in);
	int numberOfStudent = nhap.nextInt();
	for ( int i = 0; i < numberOfStudent; i++){
		E = new Entities();
		E.setId();
		E.setName();
		E.setDiem();
		Arr.add(E);
	}
	for ( int i = 0; i < numberOfStudent; i++){
		System.out.println((i+1)+".  ==SINH VIEN SO "+(i+1)+"==\n"+"MSSV: "+Arr.get(i).getId()+"\nHo Ten: "
				+Arr.get(i).getName()+"\nDiem so: "+Arr.get(i).getDiem());
	}
	System.out.println("Nhap vao ten sinh vien can tim kiem(Ten day du): ");
	nhap = new Scanner(System.in);
	String str = nhap.nextLine();
	boolean flag = true;
	for ( int i = 0; i < numberOfStudent; i++){
		if (str.equalsIgnoreCase(Arr.get(i).getName())){ 
			System.out.println("Diem cua "+str+" la: "+Arr.get(i).getDiem());
			flag = false;
		}
	}
	if (flag == true) System.out.println("Khong co sinh vien nao trong danh sach co ten: "+str);
	int mostScore = 0;
	int  numberOfStudentGetMostScore = 0; 
	for ( int i = 0; i < numberOfStudent; i++){
		int cout1 = 0;
		int compare = Arr.get(i).getDiem();
		for ( int j = 0; j < numberOfStudent; j++){
			if (compare == Arr.get(j).getDiem()) cout1 ++;
		}
		if(numberOfStudentGetMostScore <= cout1) {
			numberOfStudentGetMostScore = cout1;
			mostScore = Arr.get(i).getDiem();
		}
	}
	System.out.println("Co "+numberOfStudentGetMostScore+" sinh vien duoc: "+mostScore);
	}
}
