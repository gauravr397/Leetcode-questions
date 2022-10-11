class Solution {
    public long Task_Scheduler_II(int[] tasks, int space) {
        long currDay=0L,gap=space;
        int len=tasks.length;
        Map<Integer,Long> map=new HashMap<>();
        for(int i=0;i<len;i++) {
            int task=tasks[i];
            if(!map.containsKey(task))
                map.put(tasks[i],currDay);
            else {
                long lastDay=map.get(task);
                long taskGap=currDay-lastDay;
                if(taskGap<=gap)
                    currDay+=gap-taskGap+1;
                map.put(task,currDay);
            }
            ++currDay;
        }
        return currDay;
        
    }
}