package bookStudy;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true){
            System.out.println("현재 데이터의 수는, "+s.size() + " / " + s.capacity());
            System.out.println("1)푸시 2)팝 3)피크 4)덤프 5)종료");

            int menu = sc.nextInt();
            if(menu==0)
                break;

            int x;
            switch (menu){
                case 1:
                    System.out.print("데이터가");
                    x = sc.nextInt();
                    try{
                        s.push(x);
                    }catch (IntStack.OverFlowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try{
                        x = s.pop();
                        System.out.println("꺼내온 데이터는, "+x+"입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스텍이 비어있습니다.");
                    }
                    break;

                case 3:
                    try{
                        x = s.peek();
                        System.out.println("피크한 데이터는 "+ x+ "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스텍이 비어있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
            }


        }

    }
}
