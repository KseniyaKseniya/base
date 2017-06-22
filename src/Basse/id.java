package Basse;
import java.util.ArrayList;

public class id extends Interface {
    ArrayList<Integer>id=new ArrayList<Integer>();

    @Override
    void add() {
       id.add(1);
        id.add(2);
        id.add(3);
        id.add(4);

       System.out.println("ID"+id);
    }

    @Override
    void delete() {
        id.remove(5);
    }

    @Override
    void Set() {

    }

    @Override
    void Delete_All() {
        id.clear();
    }
}
