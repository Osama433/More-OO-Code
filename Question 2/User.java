
public class User {

	private String countryId;
	private float weight;
	
	public User(String countryId, float Weight) {
		setCountryId(countryId);
		setWeight(Weight);
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	

}
