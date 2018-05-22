public class Tree<T> {
    private List.Node<T> root;

    public Tree(String id, T rootData) {
        root = new List.Node<T>();
        root.identificator = id;
        root.data = rootData;
        root.children = new List();
    }

    public void Print() {
    		System.out.print("└── ");
    		System.out.print(root.identificator);
    		if(!root.children.isEmpty()) {
    			List.Node<Object> tmp = root.children.head;
    			while(tmp != null) {
    				System.out.print("\n    ├── " + tmp.identificator);
    				if(!tmp.children.isEmpty()) {
    					printList(tmp.children, 2);
    				}
    				tmp = tmp.next;
    			}
    		}
    }

    public void printList(List l, int level) {
    		List.Node<Object> tmp = l.head;
    		String tab = Tabs(level);
    		while(tmp != null) {
    			System.out.print("\n" + tab + "├── " + tmp.identificator);
    			if(!tmp.children.isEmpty()) {
    				printList(tmp.children, level + 1);
    			}
    			tmp = tmp.next;
    		}
    }

    public String Tabs(int q) {
    		String tabs = "";
    		for(int x = 0; x < q; x++) {
    			tabs = tabs + "    ";
    		}
    		return tabs;
    }


    public static void main(String[] mr) {
    		Tree<String> t = new Tree<String>("miClase", "");
    		t.root.children.add("a", 2.5);
    		t.root.children.add("b", 3.4);
    		t.root.children.add("c", 4.3);
    		t.root.children.add("d", 5.2);
    		t.root.children.getNode("a").children.add("a.b", "next level");
    		t.root.children.getNode("a").children.getNode("a.b").children.add("a.b.c", "next level");
    		t.Print();
    }
}
