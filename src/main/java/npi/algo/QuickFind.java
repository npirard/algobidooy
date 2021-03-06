package npi.algo;

public class QuickFind extends AbstractQuick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuickFind instance = new QuickFind(10);
		
		System.out.println(instance);
		//8-5 8-6 3-9 8-4 4-0 1-2
		instance.union(8, 5);
		instance.union(8, 6);
		instance.union(3, 9);
		instance.union(8, 4);
		instance.union(4, 0);
		instance.union(1, 2);
		System.out.println(instance);
	}
	
	public QuickFind(int n){
		super(n);
	}

	public boolean connected(int p, int q){
		return id[p] == id[q];
	}
	
	public void union(int p, int q){
		if(connected(p, q)){
			return;
		}
		
		int idp = id[p];
		int idq = id[q];
		int n = id.length;
		for(int i = 0; i<n; i++){
			if(id[i] == idp){
				id[i] = idq;
			}
		}
	}
}
