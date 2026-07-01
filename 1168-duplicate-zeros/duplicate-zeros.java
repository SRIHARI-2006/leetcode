class Solution {
    public void duplicateZeros(int[] arr) {
        int c=0;
        for(int x:arr){
            if(x==0)
                c++;
        }
        int[] arr1 = new int[arr.length+c];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                arr1[j]=0;
                arr1[j+1]=0;
                j+=2;
            }
            else{
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = arr1[i];
        }
    }
}