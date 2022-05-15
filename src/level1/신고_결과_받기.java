package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class 신고_결과_받기 {

    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        System.out.println(Arrays.toString(solution(id_list , report , k)));

    }


    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashMap<String, int[]>> singo = new LinkedHashMap<>(); // 누구 신고했는지 담는 곳

        Map<String, int[]> person =  new HashMap<>(); //신고당한 횟수 담는 곳


        //값 초기화 for문
        for(int i =0 ; i < id_list.length ; i++) {
            singo.put(id_list[i], new HashMap<>());
            int[] a = new int[1];
            a[0] = 0;
            person.put(id_list[i], a);
            answer[i] = 0;

        }

        for(String rp : report) {
            String[] p = rp.split(" ");

            String 신고인 = p[0];
            String 피신고인 = p[1];

            if (singo.get(신고인).get(피신고인) == null) {
                singo.get(신고인).put(피신고인, person.get(피신고인));
                person.get(피신고인)[0]++; //신고횟수 추가

            }


        }


        for(int i= 0 ; i < id_list.length ; i++) {

            for(Entry<String, int[]> e: singo.get(id_list[i]).entrySet()) {

                if(e.getValue()[0] >= k) {
                    answer[i]++;
                }
            }

        }


        return answer;
    }

}
