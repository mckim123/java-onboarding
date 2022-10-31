package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        HashMap<String, Set<Integer>> map = new HashMap<>();
        for (int i=0;i<forms.size();i++) {
            List<String> user_info = forms.get(i);
            String nickname = user_info.get(1);
            if (nickname.length() >= 2){
                Set<String> key_set = new HashSet<>();
                char curr = nickname.charAt(0);
                int j = 1;
                while (j < nickname.length()){
                    char next = nickname.charAt(j);
                    String key = "" + curr + next;
                    if (!key_set.contains(key)){
                        key_set.add(key);
                        if(map.containsKey(key)){
                            Set<Integer> id_set = map.get(key);
                            id_set.add(i);
                            map.put(key, id_set);
                        } else {
                            map.put(key, new HashSet<>(List.of(i)));
                        }
                    }
                    curr = next;
                    j += 1;
                }
            }
        }
        List<String> answer = List.of("answer");
        return answer;
    }
}
