package singletonPattern;

import java.util.Scanner;

public class PagIbigOfficeDeskStation {

    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);

        CentralizedQueuingSystem q = CentralizedQueuingSystem.getInstance();

        System.out.println("PAG-IBIG OFFICE CENTRALIZED QUEUING SYSTEM\n");

        while(true) {
            System.out.println("[1] Generate New Queue List" +
                    "\n[2] Current Queue Number (Online Monitoring)" +
                    "\n[3] Reset Queue Number for a particular Desk Station" +
                    "\n[4] Exit\n");

            System.out.print("Enter Choice: ");
            int choice = scan.nextInt();

            if(choice == 1) {
                System.out.println("\nCurrent Updated Queue List (20 persons only):");
                for(int i = 0; i < 20; i++){
                    q.setCurrentQueueNumber();
                }
                System.out.println();
            }
            else if(choice == 2){
                System.out.println();
                q.getCurrentQueueNumber();
                System.out.println();
            }
            else if(choice == 3){
                System.out.println();
                System.out.println("Choose Desk Station and reset number");
                System.out.print("Desk Station [A = 1][B = 2][C = 3] : ");
                int deskStation = scan.nextInt();
                System.out.print("Reset Number: ");
                int resetNum = scan.nextInt();
                q.resetQueue(deskStation, resetNum);
                System.out.println();
                q.getCurrentQueueNumber();
                System.out.println();
            }
            else if (choice == 4) {
                System.exit(0);
                break;
            }

        }














    }
}
