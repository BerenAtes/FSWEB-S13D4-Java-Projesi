import com.workintech.model.Player;
import com.workintech.model.Weapon;

public class Main {
    public static void main(String[] args) {

        System.out.println("***********POINT************");
        com.workintech.model.Point first = new com.workintech.model.Point(6, 5);

        com.workintech.model.Point second = new com.workintech.model.Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        com.workintech.model.Point point = new com.workintech.model.Point(0,0);

        System.out.println("distance()= " + point.distance());
        System.out.println("******************************");


        System.out.println("***********PLAYER************");
        Player player1=new Player("John",110, Weapon.GUN);
        Player player2=new Player("Dany",-3, Weapon.HANDSAW);
        Player player3=new Player("Emily",12, Weapon.RIFLE);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println("***********************");

        player1.loseHealth(80);
        System.out.println(player1);

        player1.restoreHealth(150);
        System.out.println(player1);




    }
}