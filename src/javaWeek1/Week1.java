package javaWeek1;

public class Week1 {

	public static void main(String[] args) {
		double jeepTopPrice = 2000.00;
		double accountBalance = 3000.00;
		int tireSize = 35;
		int jeepWeight = 3970;
		char directionIAmGettingLostIn = 'W';
		String lastKnownLocation = "Moab, UT";
		float engineSize = 2.0f;

		accountBalance -= jeepTopPrice;
		String price = String.format("%.2f", jeepTopPrice);
		String balance = String.format("%.2f", accountBalance);
		System.out.println("After buring a soft top for$" + price + " , my balance is $" + balance);

		double tireWeight = jeepWeight / 4.0;
		System.out.println("Tire weight" + tireWeight);

		System.out.println("I am heading " + directionIAmGettingLostIn + " from" + lastKnownLocation);
	}

}
