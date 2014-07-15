
public class Country {
	
	private int users;
	private float AvgWeightLoss;
	
	public Country(int Users, float AvgWeightLoss) {
		setUsers(Users);
		setAvgWeightLoss(AvgWeightLoss);
	}
	public int getUsers() {
		return users;
	}
	public void setUsers(int users) {
		this.users = users;
	}
	public float getAvgWeightLoss() {
		return AvgWeightLoss;
	}
	public void setAvgWeightLoss(float avgWeightLoss) {
		AvgWeightLoss = avgWeightLoss;
	}
	
}
