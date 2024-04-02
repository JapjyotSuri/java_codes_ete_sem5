import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        this.data=d;
        this.left=left;
        this.right=right;

    }
}
public class lca {
    public static Node lca(Node root,int d1,int d2){
        if(root==null){
            return null;
        }
        if(root.data==d1 || root.data==d2){
            return root;
        }
        Node l=lca(root.left,d1,d2);
        Node r=lca(root.right,d1,d2);
        if(r!=null && l!=null){
            return root;
        }
        else if(r!=null && l==null){
            return r;
        }
        else if(r==null && l!=null){
            return l;
        }
        return null;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static Node buildtree(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data==-1){
            return null;
        }
            root.left=buildtree(root.left,data);
            root.right=buildtree(root.right,data);
            
        return root;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=3;
      Node root=null;
      for(int i=0;i<n;i++){
        root=buildtree(root,sc.nextInt());
      }
      //inorder(root);
      Node com=lca(root,10,30);
      System.out.println(com.data);
     // System.out.println(root.data);
    }
}
