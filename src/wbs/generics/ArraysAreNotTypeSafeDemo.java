package wbs.generics;


public class ArraysAreNotTypeSafeDemo {

        
        public static void main(String[] args) {
                
                Object[] oa = { 1, "aha", 4.0, 66 };
                String[] sa = { "aha", "nana" };
                oa = sa;
                
//                oa[0] = 17;
//                oa[0] = "17";
//                oa[0] = new Object();  
                
        }
}

