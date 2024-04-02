
public class buildingtree {
    public static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static Node buildtree(Node root,int arr[],int idx){
        if(root==null){
            return new Node(arr[idx]);
        }
        if(arr[idx]==-1){
            return null;
        }
        root.left=buildtree(root.left,arr,idx+1);
        root.right=buildtree(root.right,arr,idx+1);
        return root;
    }
    public static void main(String args[]){
        int arr[]={1,2,-1,-1,-1};
        Node root=null;
        
            root=buildtree(root,arr,0);
        
        System.out.println(root.data);
    }
}
