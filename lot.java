import java.util.*;

import javax.swing.tree.TreeNode;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class lot{
  
    public static Node buildTree(int [][]arr) {
        
        Queue<Node> q=new LinkedList<>();
        Node root=new Node(arr[0][0]);
        q.add(root);

        for(int i=1;i<arr.length;i=i+2){
            Node front=q.remove();
            if(arr[i][0]!=-1){
                front.left=new Node(arr[i][0]);
                q.add(front.left);
            }
            if(i+1<arr.length && arr[i+1][0]!=-1){
                front.right=new Node(arr[i+1][0]);
                q.add(front.right);
            }
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        // Parse input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // Build the binary tree using level order traversal
        Node root = buildTree(arr);
        //System.out.println(root.data);
        inorder(root);
        sc.close();
    }
}
