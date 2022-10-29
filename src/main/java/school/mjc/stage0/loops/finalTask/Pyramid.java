package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int tmp = cathetusLength;
            for (int j = 1; j <= cathetusLength * 2 - 1; j++) {
                if (tmp <= i) System.out.print(tmp);
                else if (j > cathetusLength) System.out.print("");
                else System.out.print(" ");
                if (j < cathetusLength) {
                    tmp--;
                } else {
                    tmp++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}