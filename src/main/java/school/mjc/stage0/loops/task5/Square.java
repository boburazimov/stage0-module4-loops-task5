package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int row = 0; row < sideLength; row++) {
            for (int col = 1; col <= sideLength; col++) {
                if (row == 0 || row == sideLength - 1 || col == 1 || col == sideLength) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
