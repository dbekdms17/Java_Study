import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu= 0, num = 0;
        Scanner sc = new Scanner(System.in);

        outer:
            while (true) {
                System.out.println("1. 샤브샤브");
                System.out.println("2. 족발");
                System.out.println("3. 치킨");

                System.out.println("원하는 메뉴를 고르세요");
                menu = sc.nextInt();

                if(menu == 0) {
                    System.out.println("프로그램 종료");
                    break;
                } else if(!(1 <= menu && menu <= 3)) {
                    System.out.println("메뉴를 잘못 선택했습니다.");
                    continue;
                } else if (menu == 1) {
                    System.out.println("샤브샤브");
                    break;
                } else if (menu == 2) {
                    System.out.println("족발");
                    break ;
                } else if (menu == 3) {
                    System.out.println("치킨");
                    break ;
                }
                for(;;) {
                    
                }

            }
    }
}