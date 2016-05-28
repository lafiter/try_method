package ImageEdit;

public class ForDigui {
	  
   public static void main(String args[]){
	   int n=10000;
	   
	    compare(n); 
   }
public static void compare(int n) {
	long start = System.currentTimeMillis();
	for(int i=0;i<n/2;i++){
	System.out.println(i);
	}
	long m= System.currentTimeMillis()-start;
	System.out.println("Ê±¼äÊÇ£º"+m+"ºÁÃë");
	for(int i=n/2;i<n;i++){
		System.out.println(i);
		}
	//System.out.println(compare(n-1));
	//if(n>0){
	// System.out.println(n);
	//}else{
	//	return;
//	}
	//compare(n-1) ;
} 
}
