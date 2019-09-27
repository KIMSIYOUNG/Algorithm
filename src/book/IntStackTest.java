package book;

import java.util.Arrays;
import java.util.Scanner;

public class IntStackTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true){
            System.out.println("현재 데이터의 수 : "+s.size() + " / " + s.capacity());
            System.out.println("1)푸시, 2)팝 3)피크 4)덤프 5)종료");
            int menu = scanner.nextInt();
            if(menu==5)
                break;

            int x;

            switch (menu){
                case 1:
                    System.out.print("데이터는?");
                    x = scanner.nextInt();
                    try{
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try{
                        x = s.pop();
                        System.out.print("팝! : 가장 늦게 들어간 데이터가 순서대로 나옵니다.");
                        System.out.println("팝한 데이터는 "+x+"입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 3:
                    try{
                        x=s.peek();
                        System.out.println("피크한 데이터는 "+x+"입니다.");
                    }catch (IntStack.EmptyIntStackException e ){
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 4:
                    s.dump();
                    break;


            }


        }

    }
}
