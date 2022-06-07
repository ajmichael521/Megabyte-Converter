
public class Megabyte {

	public static void printMegaBytesAndKilobyte (int kiloByte) {
		//Parameter if kilobyte is less than zero
		if(kiloByte < 0) {
			System.out.println("invalid value");
		} else {
		//Expression to get any amount megabyte
			int megaByte = (kiloByte/1024);
			//Expression to get the remainder of megabyte to kilobyte
			int kiloRemainder = (kiloByte%1024);
			System.out.println(kiloByte + "KB = " + megaByte + "MB and " + kiloRemainder + "KB");
		}
	}
	
}
