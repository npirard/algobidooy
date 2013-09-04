package npi.algo;

public class AbstractQuick {

	protected int[] id;

	public AbstractQuick() {
		super();
	}

	public AbstractQuick(int n) {
		id = new int[n];
		for(int i=0;i<n;i++){
			id[i] = i;
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
		return sb.toString();
	}

}