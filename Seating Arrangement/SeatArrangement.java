import java.util.Scanner;

public class SeatArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            int seatNumber = Integer.parseInt(sc.nextLine());
            int remainder = seatNumber%12;
            if (remainder <= 6) {
                if (remainder == 0) {
                    System.out.println((seatNumber-11)+" WS");
                }
                switch (remainder) {
                    case 1:
                        System.out.println((seatNumber+11)+" WS");
                        break;
                    case 2:
                        System.out.println((seatNumber+9)+" MS");
                        break;
                    case 3:
                        System.out.println((seatNumber+7)+" AS");
                        break;
                    case 4:
                        System.out.println((seatNumber+5)+" AS");
                        break;
                    case 5:
                        System.out.println((seatNumber+3)+" MS");
                        break;
                    case 6:
                        System.out.println((seatNumber+1)+" WS");
                        break;
                    default:
                        break;
                }
            } else {
                switch (remainder) {
                    case 7:
                        System.out.println((seatNumber-1)+" WS");
                        break;
                    case 8:
                        System.out.println((seatNumber-3)+" MS");
                        break;
                    case 9:
                        System.out.println((seatNumber-5)+" AS");
                        break;
                    case 10:
                        System.out.println((seatNumber-7)+" AS");
                        break;
                    case 11:
                        System.out.println((seatNumber-9)+" MS");
                        break;
                    case 12:
                        System.out.println((seatNumber-11)+" WS");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
