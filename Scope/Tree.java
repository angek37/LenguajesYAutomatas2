
public class Tree<T> {
    private List.Node<T> root;

    public Tree(String id, T rootData) {
        root = new List.Node<T>();
        root.identificator = id;
        root.data = rootData;
        root.children = new List();
    }

    
    public static void main(String[] mr) {
    		Tree<String> t = new Tree<String>("miClase", "");
    		t.root.children.add("a", 2.3);
    		List.Node<Object> n = t.root.children.getNode("a");
    		n.children.add("b", "Tercer nivel");
    }
}