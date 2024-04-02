import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        this.data=d;
        this.left=null;
        this.right=null;
    }
}
public class binarytreeconstruct {
    public static Node buildtree(int nodes[][]){
           if(nodes==null || nodes.length==0){
            return null;
           }
           HashMap<Integer,Node> map=new HashMap<>();
           Node root=null;
           for(int i=0;i<nodes.length;i++){
            int val=nodes[i][0];
            int level=nodes[i][1];
            Node node=new Node(val);
            map.put(val,node);
            if(level==0){
                root=node;
                
            }
            else{
                Node parent=map.get((val-1)/2);
                if(parent.left==null){
                     parent.left=node;
                }
                else{
                    parent.right=node;
                }
            }
           }
           return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String args[]){
        int[][] nodes = {
            {50, 0},
            {30, 1},
            {70, 1},
            {20, 2},
            {40, 2},
            {60, 2},
            {80, 2}
        };
        Node root=buildtree(nodes);
        inorder(root);
    }
}
