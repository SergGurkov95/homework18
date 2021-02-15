package page14;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FolderTree {
    private List<File> folderTree = new LinkedList<>();
    private List<Integer> folderDepth = new LinkedList<>();

    public FolderTree(File[] folderTree){
        this.folderTree.addAll(Arrays.asList(folderTree));
        for(int i = 0; i < folderTree.length; i ++) {
            this.folderDepth.add(0);
        }
    }

    public Integer getDepth(int i) {
        return folderDepth.get(i);
    }

    public File getTree(int i) {
        return folderTree.get(i);
    }

    public void set(int i, File[] folderTree, Integer folderDepth) {
        this.folderTree.addAll(i , Arrays.asList(folderTree));
        for(int j = 0; j < folderTree.length; j++) {
            this.folderDepth.add(i, folderDepth);
        }
    }

    public int size(){
        return folderTree.size();
    }
}
