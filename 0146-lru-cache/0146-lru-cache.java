class LRUCache {

    class Node{
        Node next;
        Node prev;
        int val;
        int key;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    int capacity;
    int size;
    Node head, tail;
    HashMap<Integer, Node> map;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
        this.size = 0;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int val = map.get(key).val;
            detatch(map.get(key));
            moveToTail(map.get(key));
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.get(key).val = value;
            detatch(map.get(key));
            moveToTail(map.get(key));
        }else{
            if(size == 0){
                Node newNode = new Node(key, value);
                map.put(key, newNode);
                newNode.next = tail;
                newNode.prev = head;
                head.next = newNode;
                tail.prev = newNode;
                size++;
            }else if(size == capacity){
                Node lru = head.next;
                detatch(lru);
                map.remove(lru.key);
                size--;
                put(key, value);
            }else{
                Node newNode = new Node(key, value);
                map.put(key, newNode);
                moveToTail(newNode);
                size++;
            }
        }
    }

    public void detatch(Node node){
        //detatch
        Node prev = node.prev;
        prev.next = node.next;
        node.next.prev = prev;
    }

    public void moveToTail(Node node){
        //attach to tail
        tail.prev.next = node;
        node.prev = tail.prev;
        node.next =  tail;
        tail.prev = node;
    }
}
