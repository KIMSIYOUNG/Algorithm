package aboutjava;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//MouseMotionAdapter를 상속받아 mouseDragged 메소드를 재정의하는 클래스이다.
//마우스를 드래그할 때의 좌표를 텍스트필드에 쓰기위해서 부모의 주소를
//생성자를 통해 받아올 수 있도록했다.
class MouseMotionClass extends MouseMotionAdapter
{
    MouseExam superClass; // 부모객체 담을 곳

    @Override
    public void mouseDragged(MouseEvent e)
    {

        superClass.jtextfiled.setText("(" + e.getX() + ", " + e.getY() + ")");
    }

    MouseMotionClass(MouseExam superClass)
    {
        // 인자로 받은 부모 객체를 전역변수에 저장
        this.superClass = superClass;
    }
}

// MouseAdapter를 상속받아 mouseEntered,mouseExited 메소드를 재정의하는 클래스이다.
// 마우스 이동 상황을 텍스트필드에 쓰기위해서 부모의 주소를 생성자를 통해 받아올 수
// 있도록했다.
class MouseClass extends MouseAdapter
{
    MouseExam superClass; // 부모객체 담을 곳

    @Override
    public void mouseEntered(MouseEvent e)
    {
        superClass.jtextfiled.setText("마우스 안쪽?");
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        superClass.jtextfiled.setText("마우스 바깥쪽?");
    }

    MouseClass(MouseExam superClass)
    {
        // 인자로 받은 부모 객체를 전역변수에 저장
        this.superClass = superClass;
    }
}

public class MouseExam extends JFrame
{
    JLabel label = new JLabel("마우스 드래그 해보자");
    JTextField jtextfiled = new JTextField();

    public MouseExam()
    {
        add(label, "North");
        add(jtextfiled, "South");

        setSize(300, 400);
        setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //이벤트 리스너를 등록하며 JFrame 객체의 주소를 함께 보낸다.
        this.addMouseMotionListener(new MouseMotionClass(this));
        this.addMouseListener(new MouseClass(this));
    }

    public static void main(String[] args)
    {
        new MouseExam();
    }
}