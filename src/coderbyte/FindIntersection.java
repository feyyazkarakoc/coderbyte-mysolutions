package coderbyte;

import java.util.*;

class Main {

    // solution 1:
    /*public static String FindIntersection(String[] strArr) {
        // code goes here
        StringBuilder sb = new StringBuilder();
        boolean eq = false;


        String[] strArr1 = strArr[0].replace(" ","").split(",");
        String[] strArr2 = strArr[1].replace(" ","").split(",");
        for(int i=0; i<strArr1.length;i++){
            for(String str2 :strArr2){
                if(strArr1[i].equals(str2)){
                    eq=true;
                    if(i==strArr1.length-1){
                        sb.append(strArr1[i]);
                    }else {
                        sb.append(strArr1[i]).append(",");
                    }

                }
            }
        }


        return !eq ? "false" :sb.toString();
    }*/




    // solution 2:
    /*public static String FindIntersection(String[] strArr) {
        Set<String> set1 = new HashSet<>(Arrays.asList(strArr[0].replace(" ", "").split(",")));
        Set<String> result = new LinkedHashSet<>();

        for (String num : strArr[1].replace(" ", "").split(",")) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        return result.isEmpty() ? "false" : String.join(",", result);
    }*/


   /* public static String FindIntersection(String[] strArr) {
        // code goes here


        Set<String> set = new HashSet<>(List.of(strArr[0].replace(",","").split("")));
        Set<String> result = new LinkedHashSet<>();
        for(String str: strArr[1].replace(",","").split("")){
            if(set.contains(str)){
                result.add(str);
            }
        }
        return result.isEmpty()?"false":String.join(",",result);

    }*/


    public static String FindIntersection(String[] strArr) {


        Set<String> set = new HashSet<>(List.of(strArr[0].split(", ")));
        Set<String> result = new LinkedHashSet<>();


        for (String s : strArr[1].split(", ")) {
            if (set.contains(s)) result.add(s);
        }

        return result.isEmpty() ? "false" : String.join(",", result);

    }


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FindIntersection(new String[]{"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"}));
    }

}