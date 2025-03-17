class Solution {
    public int[] dailyTemperatures(int[] a) {
        Stack<Integer> s = new Stack <>();
        int ans[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            if(s.size()==0||a[s.peek()]>=a[i]){
                s.push(i);
            }
            else{
                while(s.size()> 0&&a[s.peek()]< a[i]){
                    int last=s.pop();
                    ans[last]=i-last;

                }
                s.push(i);
            }
        }
        return ans;
    }
}