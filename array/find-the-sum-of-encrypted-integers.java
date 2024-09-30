class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int count=0;
        int sum=0;
        int flag=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]<10)
        {
            flag++;
            count=count+nums[i];
        }
        else
        {
            String s=Integer.toString(nums[i]);
           List<Character>li=new ArrayList<>();
           for(int j=0;j<s.length();j++)
           {
            li.add(s.charAt(j));
           }
           Collections.sort(li);
           int b=li.size();
           char c=li.get(b-1);
           int x=c-'0';
           int rem=0;
           int sum1=0;
           for(int k=0;k<b;k++)
           {
            int v=x;
            rem=v%10;
            sum1=sum1*10+rem;
           }
           count=count+sum1;
           
        }
    }
     if(flag==nums.length)
    {
        for(int i=0;i<nums.length;i++)
    {
        sum+=nums[i];
    }
        return sum;
    }
    
   
     return count;
        
    }
}