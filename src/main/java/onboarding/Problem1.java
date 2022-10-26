package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int pobi_score = max(pobi);
        int crong_score = max(crong);

        if (pobi_score == -1 || crong_score == -1) {
            return -1;
           }
    }
    static int max(List<Integer> pages) {
        int page1 = pages.get(0).intValue();
        int page2 = pages.get(1).intValue();
        if (page1 % 2 == 0 || page1 < 3 || page1 > 397 || page1 + 1 != page2) {
            return -1;
            }
        }
}