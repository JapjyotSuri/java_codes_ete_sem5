import java.util.*;
public class topview {
    
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
    static class info{
        Node node;
        int hd;
        public info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    static int idx=-1;
    static int max=0;
    static int min=0;
    
    public static void topview(Node root){
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();//key is always the first one here key is hd
        if(root==null){
            return;
        }
        Queue<info> q=new LinkedList<>();
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
        for(int i=min;i<=0;i++){
            a.add(map.get(i));
            
        }
        Collections.reverse(a);
        System.out.println(a);

    }
    public static Node buildtree(int nodes[]){
     idx++;
     if(nodes[idx]==0){//base case
         return null;
     }
     Node newNode=new Node(nodes[idx]);
     newNode.left=buildtree(nodes);
     newNode.right=buildtree(nodes);
    return newNode;
    }
    public static void zigzag(Node root,ArrayList<ArrayList<Integer>> a){
        int cnt=0;
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
          // if(cnt%2!=0){
          //    Collections.reverse(arr);
          // }
          // cnt++;
          a.add(arr);
        }
      }
    public static void main(String args[]){
    int nodes[]={10,20,30,40,0,0,50,0,0,0,60,0,70,0,0};
    Node root=buildtree(nodes);
    topview(root);
    System.out.println(root.data);
    ArrayList<ArrayList<Integer>> a=new ArrayList<>();
    zigzag(root,a); 
    System.out.println(a);
    }
}
