import java.util.List;

public class User_user {
	private String domain;
	private String id;
	public List<String> fav_colors;

	public List<String> getFav_colors() {
		return fav_colors;
	}

	public void setFav_colors(List<String> fav_colors2) {
		this.fav_colors = fav_colors2;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
}