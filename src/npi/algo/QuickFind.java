package npi.algo;

public class QuickFind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuickFind instance = new QuickFind(10);
		
		System.out.println(instance);
	}
	
	private int[] id;
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (int cur : id) {
			if(first){
				first = false;
			}
			else{
				sb.append(" ");
			}
			sb.append(cur);
		}
		return sb.toString();
	}
	
	public QuickFind(int n){
		id = new int[n];
		for(int i=0;i<n;i++){
			id[i] = i;
		}
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
			if()
		}
	}
}
