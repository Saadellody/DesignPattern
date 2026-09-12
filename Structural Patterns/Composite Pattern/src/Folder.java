import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{

    String name;
    private List<FileSystem> fileSystems=new ArrayList<>();

    public  Folder(String name, List<FileSystem> files){
        this.name=name;
        this.fileSystems=files;
    }

    public  void add(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }

    public void remove(FileSystem fileSystem){
        fileSystems.remove(fileSystem);
    }

    @Override
    public void show(){
        System.out.println("the name of folder is "+ name);
        for (FileSystem filesystem : fileSystems){
            filesystem.show();
        }
    }
}
