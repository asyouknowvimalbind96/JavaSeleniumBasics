package Gov.Adhar ;

import java.util.Random;

public class Adhar {


	/* creat adhar card
	 * get adhar phone number
	 * change mobile number
	 * change address
	 * change date of birth
	 */
	public static void main(String[] arge) {


		 Adhar.creatAdharCard("Vimal Bind", 22);
	}
	public static int creatAdharCard(String name,int age) {

		int adharNumber=new Random().nextInt(1111111111,999999999);
		System.out.println("Creat adhar number- "+name+","+age+","+adharNumber);

		 return adharNumber;
	}
	}
//	public static void getAdharPhoneNumber(int mobilenumber) {
//
//
//
//
//
//
//
//		System.out.println();
//	}
//	public static void changeMobileNumber() {
//
//
//
//
//
//
//	}
//	public static void changeAddress() {
//
//
//
//
//	}
//
//	public static void changeDOB() {
//
//
//
//	}
//
//}
//
//
