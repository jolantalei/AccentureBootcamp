package Tasks4;

import java.io.File;
import java.io.FilenameFilter;

public class InputOutputTasks {

    public static void main(String a[]) {
        File file = new File("C:\\Users\\jolan\\IdeaProjects");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }

        File file2 = new File("/home/students/");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.printf("txt files:%s%n ",f);
        }
    }
}
