import java.util.ArrayList;

public class CricketFever {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        int k = 3;
        System.out.println(find(list, k));
    }

    private static int find(ArrayList<Integer> supList, int k) {

        int winTeam1 = 0;
        int winTeam2 = 0;
        int losTeam1 = 0;
        int losTeam2 = 0;

        ArrayList<Integer> remList = new ArrayList<>();

        while (k != 0) {
            for (int i = 0; i < supList.size(); i = i + 4) {

                if (supList.get(i) >= supList.get(i + 1)) {
                    winTeam1 = i;
                    losTeam1 = i + 1;
                }
                else {
                    winTeam1 = i + 1;
                    losTeam1 = i;
                }

                if (supList.size() > 2) {
                    if (supList.get(i + 2) >= supList.get(i + 3)) {
                        winTeam2 = i + 2;
                        losTeam2 = i + 3;
                    } else {
                        winTeam2 = i + 3;
                        losTeam2 = i + 2;
                    }

                    supList.set(winTeam1, supList.get(winTeam1) + supList.get(losTeam2));
                    supList.set(winTeam2, supList.get(winTeam2) + supList.get(losTeam1));

                    remList.add(losTeam1);
                    remList.add(losTeam2);
                } else {
                    return supList.get(winTeam1);
                }
            }
            for (int i = remList.size()-1; i >=0; i--) {
                supList.remove((int)remList.get(i));
            }
            remList.clear();
            k--;
        }
        return 0;
    }
}
