package npi.algo;

public class WeightedQuickUnion extends QuickUnion {

	int[] sz;
	
	public WeightedQuickUnion(int n) {
		super(n);
		sz = new int[n];
		for (int i = 0; i < n; i++) {
			sz[i] = 1;
		}
	}
	
	@Override
	public void union(int p, int q){
		int rootP = root(p);
		int rootQ = root(q);
		int szP = sz[rootP];
		int szQ = sz[rootQ];
		
		if(rootP != rootQ){
			if(szP < szQ){
				id[rootP] = rootQ;
				sz[rootQ] += szP;
			}
			else{
				id[rootQ] = rootP;
				sz[rootP] += szQ;
			}
		}
	}

	@Override
	public String toString() {
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
		sb.append(" |");
		for (int cur : sz) {
			sb.append(" ");
			sb.append(cur);
		}
		return sb.toString();
	}
}
