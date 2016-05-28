package com.henu.zyx;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ≤‚ ‘HashMap {
 
    //private ConcurrentHashMap map = new ConcurrentHashMap();
    private HashMap map = new HashMap();
    int total=0;
    public ≤‚ ‘HashMap() {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                    map.put(new Integer(i), i);
                }
                System.out.println("t1 over");
//                total=total+1;
//                System.out.println(total);
            }
        };
 
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
 
                System.out.println("t2 over");
            }
        };
 
        Thread t3 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
 
                System.out.println("t3 over");
            }
        };
 
        Thread t4 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
 
                System.out.println("t4 over");
            }
        };
 
        Thread t5 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
 
                System.out.println("t5 over");
            }
        };
 
        Thread t6 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
 
                System.out.println("t6 over");
            }
        };
 
        Thread t7 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
                System.out.println("t7 over");
            }
        };
//          HashSet
        Thread t8 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
 
                System.out.println("t8 over");
            }
        };

        Thread t9 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
                System.out.println("t9 over");
                 
            }
        };

        Thread t10 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                	total=total+1;
                    System.out.println(total);
                }
 
                System.out.println("t10 over");
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
   
    public static void main(String[] args) {
    	for(int i=0;i<5000;i++){
        new ≤‚ ‘HashMap();
    	}
    }
}
