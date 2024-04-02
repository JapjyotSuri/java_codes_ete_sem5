import java.util.*;
public class zigzag {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int pos=-1; 
    public static Node buildtree(int nodes[]){

     pos++;
     if(nodes[pos]==0){
        return null;
     }
     Node newNode=new Node(nodes[pos]);
     newNode.left=buildtree(nodes);
     newNode.right=buildtree(nodes);
     return newNode;
    } 
    public static void zigzag(Node root,ArrayList<ArrayList<Integer>> a){
    int cnt=0;
    if(root==null){
        return;
    }
    Queue<Node> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
        int n=q.size();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            Node curr=q.remove();
            arr.add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        if(cnt%2!=0){
            Collections.reverse(arr);
        }
        cnt++;
        a.add(arr);
        
      }
    }
    public static void main(String args[]){
        int nodes[]={10,20,30,40,0,0,50,0,0,0,60,0,70,0,0};
       
        Node root=buildtree(nodes);
        System.out.println(root.data);
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        zigzag(root,a); 
        System.out.println(a);
    }
}
