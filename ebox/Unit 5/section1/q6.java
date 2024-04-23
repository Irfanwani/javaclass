import java.util.Scanner;


public class SeatNotAvailableException extends Exception{
	public SeatNotAvailableException(String message) {
        super(message);
    }
}



public class Main {
	public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of rows and columns of the show:");
				int n = sc.nextInt();
				int seats[][]= new int[n][n];

				System.out.println("Enter the number of seats to be booked:");
				int numseats = sc.nextInt();

				for(int i = 0; i < numseats; i++) {
				try {
					System.out.println("Enter the seat number " + (i+1));
					int seatnum = sc.nextInt();

					if(seatnum < 0 || seatnum >= n * n) {
						throw new ArrayIndexOutOfBoundsException(Integer.toString(seatnum));
					}

					int r = seatnum / n;
					int c = seatnum % n;

					if(seats[r][c] != 0 ) {
						throw new SeatNotAvailableException("Already Booked");
					}

					seats[r][c] = 1;

				}


				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
					break;
				}

				catch(SeatNotAvailableException e) {
					System.out.println(e);
					continue;
				}
				}

				System.out.println("The seats booked are:");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(seats[i][j] + " ");
					}
					System.out.println();
				}

				sc.close();

	}
}
