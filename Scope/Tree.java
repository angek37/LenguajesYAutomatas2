public class Tree<T> {
    public List.Node<T> root;
    public boolean current = false;
    public String id = "";
    public List tmpL = new List();

    public Tree() {
      root = new List.Node<T>();
      root.children = new List();
    }

    public void initTree(String id, T rootData) {
        root.identificator = id;
        root.data = rootData;
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
        System.out.println("\n\n\n\n");
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
}
