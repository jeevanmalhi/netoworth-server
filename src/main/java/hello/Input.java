package hello;

public class Input {

	private Asset[] assets;
	private Liability[] liabilities;
	private Double totalAssets = .0;
	private Double totalLiabilities = .0;
	
	public Input(Asset[] assets, Liability[] liabilities) {
	    this.assets = assets;
	    this.liabilities = liabilities;
	}

	public Asset[] getAssets() {
		return assets;
	}

	public void setAssets(Asset[] assets) {
		this.assets = assets;
	}

	public Liability[] getLiabilities() {
		return liabilities;
	}

	public void setLiabilities(Liability[] liabilities) {
		this.liabilities = liabilities;
	}

	public Double getTotalAssets() {
		Double assets = 0.0;
		for(Asset a : this.assets) {
			if(!a.getAmmount().trim().isEmpty()) {
				assets += Double.parseDouble(a.getAmmount());
			}
		}
		this.totalAssets = assets;
		return totalAssets;
	}

	public void setTotalAssets(Double totalAssets) {
		this.totalAssets = totalAssets;
	}

	public Double getTotalLiabilities() {
		Double liabilities = 0.0;
		for(Liability l : this.liabilities) {
			if(!l.getAmmount().trim().isEmpty()) {
				liabilities += Double.parseDouble(l.getAmmount());
			}
		}
		this.totalLiabilities = liabilities;
		return totalLiabilities;
	}

	public void setTotalLiabilities(Double totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}
	
	
}
