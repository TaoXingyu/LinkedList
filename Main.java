import java.util.Scanner;

class Node{
    Node next;
    int data;
    public Node(){
    }/*Pointer to the class*/
    public Node(int data){
        this.data = data;
    }
}
class NodeList{
    Node first;
    private int count = 0;
    private int countHead = 0;
    NodeList(){
    }/*Single linked list class*/
    public void initNL(){
        Node node = new Node();
        node.next = null;
        this.first = node;
        count = 0;
        countHead = 1;
    }/*Initialization of single linked list*/
    public void insertH(int data){
        Node node = new Node(data);
        node.next = first;
        first = node;
        countHead++;
    }/*Insert head*/
    public void insertNL(int data, int number){
        Node node = new Node(data);
        Node current = first;
        Node perious = first;
        if (number > count + 1)
            System.exit(1);
        for (int i = 1; i < countHead + number - 1; i++){
            perious = current;
            current= current.next;
        }
        current.next = node;
        count++;
    }/*Insert node*/
    public int getElem(int number){
        Node current = first;
        Node perious = first;
        if (number > count)
            System.exit(1);
        for(int i = 1; i < countHead + number; i++){
            perious = current;
            current = current.next;
        }
        return current.data;
    }/*get value*/
}

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        NodeList nodeList = new NodeList();
        nodeList.initNL();
        int count = input.nextInt();
        for (int i = 1; i <= count; i++){
            int data = input.nextInt();
            nodeList.insertNL(data, i);
        }
        int number = 1;
        System.out.print(nodeList.getElem(number));
        number++;
        for (;number <= count; number++)
            System.out.print(" " + nodeList.getElem(number));/*cycle traverse*/
    }

	}

