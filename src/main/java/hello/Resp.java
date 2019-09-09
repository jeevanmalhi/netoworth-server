package hello;

public class Resp {
	
	Double totalNetWorth = .0;
	Double totalAsset = .0;
	Double totalLiability = .0;
	
	public Resp(Input input) {
		this.totalAsset = input.getTotalAssets();
		this.totalLiability = input.getTotalLiabilities();
		this.totalNetWorth = this.totalAsset - this.totalLiability;
	}

	public Double getTotalNetWorth() {
		return totalNetWorth;
	}

	public void setTotalNetWorth(Double totalNetWorth) {
		this.totalNetWorth = totalNetWorth;
	}

	public Double getTotalAsset() {
		return totalAsset;
	}

	public void setTotalAsset(Double totalAsset) {
		this.totalAsset = totalAsset;
	}

	public Double getTotalLiability() {
		return totalLiability;
	}

	public void setTotalLiability(Double totalLiability) {
		this.totalLiability = totalLiability;
	}
	

}
