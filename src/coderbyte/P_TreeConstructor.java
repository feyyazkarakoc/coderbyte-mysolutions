package coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_TreeConstructor {

    public static void main(String[] args) {

        String[] strArr =  {"(1,2)", "(3,2)", "(2,12)", "(5,2)"};



        System.out.println(TreeConstructor(strArr));



    }


    public static String TreeConstructor(String[] strArr) {





        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();


        for (String w : strArr) {

            String trimmed = w.replace("(", "").replace(")", "");
            String[] parts = trimmed.split(",");



            String firstComponent = parts[0];
            list.add(Integer.valueOf(firstComponent));

            String secondComponent = parts[1];
            list1.add(Integer.valueOf(secondComponent));



        }


        int counterFirst = 1;
        int counterSecond = 1;
        boolean first = true;
        boolean second = true;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {



                if (list.get(i).equals(list.get(j))) {
                    counterFirst++;

                    if (!(list1.get(i).equals(list1.get(j)))) {
                        first = false;
                        break;
                    }


                    if (counterFirst > 2) {
                        first = false;
                        break;
                    }


                }

                if (list1.get(i).equals(list1.get(j))) {
                    counterSecond++;
                    if (counterSecond > 2) {
                        second = false;
                        break;
                    }

                }


            }
            counterFirst = 1;
            counterSecond = 1;

        }


        if (!first || !second) {

            return "false";
        }

        return "true";





    }


}
