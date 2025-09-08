public class Main {
    public static void main(String[] args) {

        System.out.println("Exemplo 1: Inserindo elementos");
        DoublyLinkedBase<Integer> dll = new DoublyLinkedBase<>();

        DoublyLinkedBase.Node<Integer> node1 = dll.addLast(10);
        DoublyLinkedBase.Node<Integer> node2 = dll.addLast(20);
        DoublyLinkedBase.Node<Integer> node3 = dll.addLast(30);
        DoublyLinkedBase.Node<Integer> node4 = dll.addLast(40);

        System.out.println("O número de elementos: " + dll.size());
        System.out.println("Elementos na lista: " + dll.toString());
        System.out.println();


        System.out.println("Exemplo 2: Excluindo o nó com o elemento 20");
        dll.remove(node2);

        System.out.println("Tamanho da lista após exclusão: " + dll.size());
        System.out.println("Elementos restantes na lista: " + dll.toString());
        System.out.println();


        System.out.println("Exemplo 3: Verificando se a lista está vazia ");
        System.out.println("A lista está vazia? " + dll.isEmpty());

        dll.remove(node1);
        dll.remove(node3);
        dll.remove(node4);

        System.out.println("A lista está vazia após excluir todos os nós? " + dll.isEmpty());
        System.out.println();
        
        
        System.out.println("Exemplo 4: Inserindo no início e no fim");
        dll.addFirst(40); 
        dll.addLast(50);  
        
        System.out.println("Tamanho da lista: " + dll.size());
        System.out.println("Elementos na lista: " + dll.toString());
    }
}
