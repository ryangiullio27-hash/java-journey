import java.util.HashMap;

public class TrainingHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        System.out.println("Idade de Alice: " + map.get("Alice"));
        System.out.println("Idade de Bob: " + map.get("Bob"));
        System.out.println("Idade de Charlie: " + map.get("Charlie"));
        System.out.println("Tamanho do HashMap: " + map.size());
        map.remove("Bob");
        System.out.println("Tamanho do HashMap após remover Bob: " + map.size());
        System.out.println("Idade de Bob após remoção: " + map.get("Bob"));
    }
    
}
