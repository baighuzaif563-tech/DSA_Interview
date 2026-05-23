

// Online C compiler to run C program online
import java.util.*;
class Main{




static void bfs(int start, ArrayList<ArrayList<Integer>>adj ,int n){
    
    ArrayList<Integer>visited=new ArrayList<>(Collections.nCopies(n,0));
    Queue<Integer>q=new LinkedList<>();
    q.add(start);
    visited.set(start,1);
    
    
    while(!q.isEmpty()){
        int node =q.poll();
        System.out.println(node);
        for(int neigh:adj.get(node)){
            if(visited.get(neigh)==0){
                q.add(neigh);
                visited.set(neigh,1);
            }
        }
    }
    
    
    
}

public static void main(String[] args){
  
int n=5;
ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

for(int i =0;i<5;i++){
    adj.add(new ArrayList<>());
}

 adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);
        
        System.out.println("The Bfs Traversal is ");
         bfs(0, adj, n);
    
}
}
