// We have 3 towers with us, and n pegs/disks are present in the First tower.
// We need to transfer the disks to the second tower.
// Constraints:
// a) We can only move one disk at a time.
// b) Only the topmost disk in a tower can be moved.
// c) A bigger disk cannot come over a smaller disk.

// O/P: Print the steps to achieve the objective
/*
// For 3 disks
1) Move Disk 1 from tower A to tower B
2) Move Disk 2 from tower A to tower C
3) Move Disk 1 from tower B to tower C
4) Move Disk 3 from tower A to tower B
5) Move Disk 1 from tower C to tower A
6) Move Disk 2 from tower C to tower B
7) Move Disk 1 from tower A to tower B
 */


public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks = 3;
        String towerA= "A";
        String towerB= "B";
        String towerC= "C";
        towerHanoi(numDisks,towerA,towerB,towerC);
    }

    private static void towerHanoi(int numDisks, String tower1,String tower2,String tower3){
        if(numDisks == 0)
            return;
        // pre call area
        towerHanoi(numDisks-1,tower1,tower3,tower2);
        // in call area
        System.out.println("Move Disk"+numDisks+" from "+tower1+" to "+tower2);
        towerHanoi(numDisks-1,tower3,tower2,tower1);
        // post call area
    }
}
