class TimeMap 
{
    private Map<String, TreeSet<TimeMapElement>> m;
    
    public TimeMap() 
    {
        this.m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
        m.putIfAbsent(key, new TreeSet<>());
        m.get(key).add(new TimeMapElement(value, timestamp));
    }
    
    public String get(String key, int timestamp) 
    {
        TreeSet<TimeMapElement> ts = m.get(key);
        if(ts == null)
            return "";
        
        TimeMapElement elem = ts.floor(new TimeMapElement(timestamp));
        if(elem == null)
            return "";
        
        return elem.getValue();
    }
    
    private class TimeMapElement implements Comparable<TimeMapElement>
    {
        private String value;
        private int timestamp;
        
        public TimeMapElement() {}
        
        public TimeMapElement(int t)
        {
            this.value = null;
            this.timestamp = t;
        }
        
        public TimeMapElement(String v, int t) 
        {
            this.value = v;
            this.timestamp = t;
        }
        
        public String getValue() {return this.value;}
        
        public int getTimestamp() {return this.timestamp;}
        
        @Override
        public int compareTo(TimeMapElement other) {return Integer.compare(this.timestamp, other.timestamp);}
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */