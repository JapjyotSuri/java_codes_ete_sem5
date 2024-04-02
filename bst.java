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
public class bst {
    
    public static class info{
        Node node;
        int hd;
        public info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    static ArrayList<Integer> a=new ArrayList<>();
    public static void topview(Node root){
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<info> q=new LinkedList<>();
       
        int min=0;
        int max=0;
        q.add(new info(root,0));
        while(!q.isEmpty()){
            info curr=q.remove();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
       
        for(int i=min;i<=max;i++){
          a.add(map.get(i));
        }
    }
    public static Node insert(Node root,int data){
        
        if(root==null){
           return new Node(data);

        }
        if(root.data>data){
            root.left=insert(root.left,data);
        }
        else if(root.data<data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    public static void main(String args[]){
        //int nodes[]={15,12,18,14,25,10,16};
        int n=7;
        Scanner sc=new Scanner(System.in);
        Node root=null;
        for(int i=0;i<n;i++){
        root=insert(root,sc.nextInt());
        }
    
    topview(root);
    System.out.println(a);
}
}
