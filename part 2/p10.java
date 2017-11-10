interface parent<K,V>{
	public K getKey();
	public V getValue();
}

class X<K,V> implements parent<K,V>{
	K key;
	V value;
	public X(K key,V value){
		this.key = key;
		this.value = value;
	}
	public K getKey(){
		return key;
	}
	public V getValue(){
		return value;
	}
}

class set2_q10{
	public static void main(String args[]){
		X<Integer,String> obj = new X<Integer,String>(1,"xyz");
		Integer key = obj.getKey();
		String value = obj.getValue();
		System.out.println("Key:" + key);
		System.out.println("Value:" + value);
	}
}
