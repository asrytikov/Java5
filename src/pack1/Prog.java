package pack1;


public class Prog {

    public static void main(String[] args) {
        Person p = new Person();
        Person[] masP = new Person[2];
        masP[0] = new pack2.Prog();
        masP[1] = p;

        for(Person item : masP){
            System.out.println(item.getName());
        }

    }
}
