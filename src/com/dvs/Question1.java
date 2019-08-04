package com.dvs;

public class Question1 {

    public static void main(String[] args) {
        String line1 = "i am sick today (:()";
        String line2 = "(:))";
        String line3 = ":((";
        String line4 = ")(";
        String line5 = "cup: hacker :):)";
        System.out.println("Result line1: " + parenChecker(line1));
        System.out.println("Result line2: " + parenChecker(line2));
        System.out.println("Result line2: " + parenChecker(line3));
        System.out.println("Result line2: " + parenChecker(line4));
        System.out.println("Result line2: " + parenChecker(line5));
    }

    public static String parenChecker(String line) {
        int leftParen = 0;
        int rightParen = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                leftParen += 1;
                if (i == 0 || line.charAt(i - 1) != ':') {
                    leftParen += 1;
                }
            } else if (line.charAt(i) == ')') {
                if (i == 0 || line.charAt(i - 1) != ':') {
                    rightParen -= 1;
                }
                if (rightParen < 0) {
                    break;
                }
            }
        }
        if (leftParen >= 0 && rightParen == 0) {
            return "YES";
        }
        return "NO";
    }
}
//        String result = "";
//
////    if (line.contains(":", " ")){
////        result = "YES";
////        };
//
//
//        int firstIndex = line.indexOf('(');
//        int lastIndex = line.lastIndexOf(')');
//        String message1 = line.substring(0, firstIndex);
//        String message2 = line.substring(firstIndex, lastIndex);
//        System.out.println(message1);
//        System.out.println(message2);
//
//        if (message1.matches ("^[a-z: ]") || (line.equals("(:))"))  || (line.equals("(:()")) ){
//            result = "YES";
//        }
//        else {
//            result = "NO";
//        }
//
//
//        System.out.println("Result is: " + result);
//        return result;
//
//    }
//}
