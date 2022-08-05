class RandomizedSet {
    Map<Integer,Integer> m = new HashMap();
    List<Integer> l = new ArrayList();
    
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(m.containsKey(val))
            return false;
        l.add(val);
        m.put(val,l.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!m.containsKey(val))
            return false;
        int index = m.get(val);
        Collections.swap(l,index,l.size()-1);
        int swapped = l.get(index);
        m.put(swapped,index);
        l.remove(l.size()-1);
        m.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random r =new Random();
        int n= r.nextInt(l.size());
        return l.get(n);
    }
}

/*
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */