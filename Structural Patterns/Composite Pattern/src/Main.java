
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Folder documents = new Folder("documents",new ArrayList<>());

        File cv = new File("cv");
        File rapport= new File("rapport");
        Folder projects= new Folder("projects", new ArrayList<>());

        documents.add(cv);
        documents.add(rapport);
        documents.add(projects);


        File main = new File("main");
        File app = new File("app");
        Folder backend= new Folder("backend", new ArrayList<>());

        projects.add(main);
        projects.add(app);
        projects.add(backend);

        Folder user = new Folder("user", new ArrayList<>());
        Folder order = new Folder("order",new ArrayList<>());

        backend.add(user);
        backend.add(order);


        documents.show();

    }
}