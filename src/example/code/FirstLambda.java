//package example.code;
//
//import java.io.File;
//import java.io.FileFilter;
//
//public class FirstLambda {
//
//    public static void main(String[] args){
//
//        /*
//              FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };
//         */
//
//        FileFilter filter = (File pathname) -> pathname.getName().endsWith(".java");
//
//        File dir = new File("/Users/atena/Desktop/Project/Spring/spring-and-hibernate-for-beginners/01-spring-core-5/solution-code-rough-prototype/com/luv2code/springdemo");
//        File[] file = dir.listFiles(filter);
//
//
//        for (File f : file)
//            System.out.println("names: "+ f);
//    }
//
//}
