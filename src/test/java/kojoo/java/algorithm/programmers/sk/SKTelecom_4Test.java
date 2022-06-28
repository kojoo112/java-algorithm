package kojoo.java.algorithm.programmers.sk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SKTelecom_4Test {

    @Test
    void solution() {
        String[] grid1 = {"..FF", "###F", "###."};
        String[] grid2 = {"..FF", "###F", "###."};
        String[] grid3 = {".F.FFFFF.F", ".########.", ".########F", "...######F", "##.######F", "...######F", ".########F", ".########.", ".#...####F", "...#......"};

        int k1 = 4;
        int k2 = 5;
        int k3 = 6;

        SKTelecom_4 skTelecom4 = new SKTelecom_4();

//        assertEquals(1, skTelecom4.solution(grid1, k1));
//        assertEquals(0, skTelecom4.solution(grid2, k2));
        assertEquals(3, skTelecom4.solution(grid3, k3));
    }
}