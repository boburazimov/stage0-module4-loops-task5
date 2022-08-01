package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int zeroPoint = sideLength / 2 + 1;
        for (int row = 1; row <= sideLength; row++) {
            for (int col = 1; col <= sideLength; col++) {
                if (row == zeroPoint || col == zeroPoint) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
