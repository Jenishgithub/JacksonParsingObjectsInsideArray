import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ModellerClass {
	public static void main(String[] args) throws IOException {
		// read json file data to String
		byte[] jsonData = Files.readAllBytes(Paths.get("userdetails.txt"));
		ObjectMapper mapper = new ObjectMapper();
		UserDetails userDetails = new UserDetails();
		try {
			userDetails = mapper.readValue(jsonData, UserDetails.class);

			System.out.println(userDetails.getFirst_name());
			System.out.println(userDetails.getLast_name());

			// List<User_user> users = new ArrayList<User_user>();
			// JsonNode rootNode = mapper.readTree(jsonData);
			// JsonNode usersNode = rootNode.path("user_user");
			// Iterator<JsonNode> ite = usersNode.elements();
			// while (ite.hasNext()) {
			// JsonNode temp = ite.next();
			// User_user userF = mapper.treeToValue(temp, User_user.class);
			//
			// JsonNode favNode = temp.path("fav_colors");
			// List<String> fav_colors = new ArrayList<String>();
			// Iterator<JsonNode> iter = favNode.elements();
			//
			// while (iter.hasNext()) {
			// fav_colors.add(iter.next().asText());
			// }
			// userF.setFav_colors(fav_colors);
			// users.add(userF);
			// }
			// userDetails.setUser_user(users);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < userDetails.getUser_user().size(); i++) {
			System.out.println(userDetails.getUser_user().get(i).getId());
		}
	}
}
