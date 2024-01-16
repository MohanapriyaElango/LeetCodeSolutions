​#other solution-1 - USING TWO POINTERS METHOD

int i=0,j=1;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]==0 && nums[j]==0)
            {
                j++;
            }
            else if(nums[i]==0)
            {
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j=i+1;
            }
            else{
                i++;
                j=i+1;
            }
        }


#OTHER SOLUTION-2

int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            k++;
            }
        }
