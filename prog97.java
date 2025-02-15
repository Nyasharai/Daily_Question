import java.util.*;
public class prog97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();
        int monst[] = new int[n]; // power
        int bonus[] = new int[n];
        for(int i = 0; i < n; i++){
            monst[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            bonus[i] = sc.nextInt();
        }

        class Monster{
            int power;
            int bonus;
            public Monster(int power, int bonus){
                power = this.power;
                bonus = this.bonus;
            }
        }

        Monster monster[] = new Monster[n];

        for(int i = 0; i < n; i++){
            monster[i] = new Monster(monst[i], bonus[i]);
        }

        Arrays.sort(monster, Comparator.comparingInt(m -> m.power));

        int c = 0;

        for(Monster m : monster){
            if(exp < m.power){
                break;
            }
            else{
                exp += m.bonus;
                c++;
            }
        }
        System.out.print(c);
    }
}
