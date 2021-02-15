package page14;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введи путь к каталогу: ");
        Scanner scanner = new Scanner(System.in);
        File path = new File(scanner.nextLine());

        FolderTree tree = new FolderTree(path.listFiles());


        for (int i = 0; i < tree.size(); i++) {
            if (tree.getTree(i).isDirectory()) {
                tree.set(i + 1, tree.getTree(i).listFiles(), tree.getDepth(i) + 1);
                System.out.println(actualSpace(tree.getDepth(i)) + tree.getTree(i).getName() + "\\");
            }else{
                System.out.println(actualSpace(tree.getDepth(i)) + tree.getTree(i).getName());
            }
        }
    }

    static String actualSpace(int spaceLength) {
        String space = "\t";
        String actualSpace = "";
        for (int j = 0; j < spaceLength; j++) {
            actualSpace += space;
        }
        return actualSpace;
    }
}
