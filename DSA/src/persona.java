public class persona {
    private static int lastId;

    private int id;
    private String name;

    public persona(){

    }
    public persona(String name){
        this.id = lastId++;
        this.name= name;
    }

    @Override
    public String toString() {
        return "id=" + this.id + ", name=" + this.name + '\n' +'}';
    }

    public static void main(String[] args){
        persona p1= new persona(  "Axel");
        persona p2= new persona("toni");
        System.out.println(p1);
        System.out.println(p2);
        
    }
}
