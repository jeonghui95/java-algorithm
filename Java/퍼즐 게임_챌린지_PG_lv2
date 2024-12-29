/*

문제 이름 : 퍼즐 게임 챌린지
알고리즘 : 이분탐색 알고리즘
난이도 : level 2
문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/340212?language=java#

-코드 해석-
# 1. 변수 지정
# 2. limit 근접값 도출
# 3.level이 top일때, bottom일때 비교하여, 조건에 맞는 답 도출

*/

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {


//      1. 변수 지정
//      - top, bottom :최대,최솟값을 통해서 중간값(level이 될 값)을 지정
//      - total_time: level에 따른 총 소요시간
//      - indicator: total_times가 limit에 근접했을때, while을 종료

        Boolean indicator = true;
        int top = 100000;
        int bottom = 1;
        int middle = (top+bottom)/2;
        long total_time = 0;


//      2. limit 근접값 도출
//        - total_time이 limit 보다 클 경우:  bottom 증가
//        - total_time이 limit 보다 작을 경우: top 감소
//        - top과 bottom이 좁혀졌을 경우 종료

        while (indicator){

            total_time = times[0];

            total_time = makeTotalTime(diffs, times , middle, total_time);

            if(total_time - limit > 0){
                bottom = middle;
                middle = (top + bottom) / 2;
            }
            else{
                top = middle;
                middle = (top + bottom) / 2;
            }

            if (middle == top || middle == bottom){
                indicator = false;
            }
        }

//        3.level이 top일때, bottom일때 비교하여, 조건에 맞는 답 도출

        long top_time = makeTotalTime(diffs, times , top, times[0]);
        long bottom_time = makeTotalTime(diffs, times , bottom, times[0]);

        if(limit-bottom_time>=0){
            return bottom;
        }
        else{
            return top;
        }

    }

//    2.1 총합값 도출
//    - 퍼즐 난도에 따라 계산된 풀이시간을 total_times에 합

    private long makeTotalTime(int[] diffs,int[] times ,int middle, long total_time){
        for(int i = 1; i<diffs.length; i++){
            if (middle>= diffs[i]){ total_time = total_time + times[i];}
            else{total_time = total_time + (times[i]+times[i-1])*(diffs[i]-middle)+ times[i];}}

        return total_time;
    }
}