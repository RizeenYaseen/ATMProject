import java.util.Scanner;


                    class MainClass {
                        public static void main(String[] args) {
                            char[] Load={'L','O','A','D','I','N','G','!'};
                            int atmnumber=12345;
                            int atmpin=123;
                            boolean flag=true;
                            Scanner in=new Scanner(System.in);
                            System.out.println("Welcome to ATM Machine !!!");
                            do {
                                System.out.print("Enter Atm Number : ");
                                int atmNumber = in.nextInt();
                                System.out.print("Enter Pin: ");
                                int pin = in.nextInt();
                                if ((atmnumber == atmNumber) && (atmpin == pin)) {
                                    for(char Show:Load) {
                                        System.out.print(Show+" ");
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                    System.out.println("\n");
                                    new ATMPROJECT();
                                    flag=false;
                                } else {
                                    System.out.println("Try Again");
                                }
                            }while(flag);
                        }
                    }