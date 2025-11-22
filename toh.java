public class toh {
    public static void main(String args[]){
       String x="src",y="aux",z="dest";

        int n=3;
        towerofhanoi(x,y,z,n);

    }
    public static void towerofhanoi(String src,String aux,String dest, int n ){
        if(n==1){
            System.out.println(" move disc "+ n +" from "+ src +" to "+dest);
            return;
        }
        towerofhanoi(src, dest, aux, n-1);
        System.out.println(" move disc "+ n +" from "+ src +" to "+dest);
        towerofhanoi(aux, src, dest, n-1);

    }
    

       
    
}
