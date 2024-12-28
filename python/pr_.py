def find_result(diffs, times,level_cnt):
    length = len(diffs)
    # while True:
    cnt = 1
    result = times[0] 
    while True:
        pre_time = times[cnt-1] 
        diff = diffs[cnt]
        time = times[cnt]
        if level_cnt >= diff:
            result+= time
        else:
            result+= (pre_time+time) * (diff-level_cnt) + time
        # if result > limit:
        #     break
        # else:
        if cnt+1 != length:
            cnt+=1
            continue
        else:
            return result
        # level_cnt += 1
def find_limit(diffs, times, limit):
    min_num = 1
    max_num = max(diffs)
    mid_num = (min_num+max_num)//2
    maximum = find_result(diffs,times,min_num)
    minimum = find_result(diffs,times,max_num)
    while True:
        mid = (maximum+minimum)//2
        if mid > limit:
            maximum = mid
            mid_num = (mid_num+min_num)//2
        elif mid < limit:
            minimum = mid
            mid_num = (mid_num+max_num)//2
        elif mid == limit:
            return mid_num


def solution(diffs, times, limit):
    level_cnt = 1
    length = len(diffs)
    # indicator = 0
    # BI = False
    # FI = False
    while True:
        cnt = 1
        result = times[0] 
        while True:
            pre_time = times[cnt-1] 
            diff = diffs[cnt]
            time = times[cnt]
            if level_cnt >= diff:
                result+= time
            else:
                result+= (pre_time+time) * (diff-level_cnt) + time
            if result > limit:
                    level_cnt += 1
                    # FI = True
                    break
            else:
                if cnt+1 != length:
                    cnt+=1
                    continue
                else:
                    return level_cnt
                    # BI = True
                    break
        # if BI and FI:
        #     return level_cnt