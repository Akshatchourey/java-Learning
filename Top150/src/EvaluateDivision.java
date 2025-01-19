import java.util.*;
class Pare{
    String v;
    double w;
    Pare(String a, double b){
        v = a; w = b;
    }
}
public class EvaluateDivision{
    static double ans;
    static void dfs(String src, String dst, ArrayList<String> visited, Map<String, List<Pare>> graph, double product){
        if(visited.contains(src)) return;
        visited.add(src); // mark visited
        if(src.equals(dst)){
            ans = product;
            return;
        }
        for(Pare k:graph.get(src)){
            dfs(k.v, dst, visited, graph, product*k.w);
        }
    }
    static double[] calcEquation(List<List<String>> eq, double[] val, List<List<String>> q){
        Map<String, List<Pare>> graph = new HashMap<>();
        for(int i=0;i<val.length;i++){
            String u = eq.get(i).get(0); // a
            String v = eq.get(i).get(1); // b

            List<Pare> temp = graph.getOrDefault(u, new ArrayList<>());
            temp.add(new Pare(v, val[i])); // a -> (b, val)
            graph.put(u, temp);

            List<Pare> temp2 = graph.getOrDefault(v, new ArrayList<>());
            temp2.add(new Pare(u, 1.0/val[i])); // b -> (a, 1/val)
            graph.put(v, temp2);
        }
        double[] result = new double[q.size()];
        for(int i=0;i<q.size();i++){
            ans = -1.0;
            if(graph.containsKey(q.get(i).get(0))){
                ArrayList<String> visited = new ArrayList<>();
                dfs(q.get(i).get(0), q.get(i).get(1), visited, graph, 1.0);
            }
            result[i] = ans;
        }
        return result;
    }
    public static void main(String[] args){
    }
}
