package Arrays;

public class maximumpositivity {


        public int[] solve(int[] A) {
            int size = 0,startIndex=-1,endIndex=-1,maxSize=0;
            for(int i=0;i<A.length;i++) {
                if(A[i]>=0) {
                    size++;
                    if(i==A.length-1) {
                        if(size>maxSize) {
                            i++;
                            endIndex=i-1;
                            startIndex = i-size;
                            maxSize=size;
                        }
                    }
                    continue;
                }else if(A[i]<0 && maxSize!=size ){

                    if(size>maxSize) {
                        endIndex=i-1;
                        startIndex = i-size;
                        maxSize=size;
                    }
                }
                size=0;
            }
            int[] B = new int[maxSize];
            int k=0;
            for (int i = startIndex; i <= endIndex; i++) {
                B[k]= A[i];
                k++;
            }
            return B;
        }




}
