package npi.algo;

public class QuickUnion extends AbstractQuick{

	public QuickUnion(int n){
		super(n);
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public int root(int i) {
		while(i != id[i]){
			i = id[i];
		}
		return i;
	}
	
	public void union(int p, int q){
		int rootP = root(p);
		int rootQ = root(q);
		id[rootQ] = rootP;
	}
}
