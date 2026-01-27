package JsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJsonCode {
///  getNumber, getString , getBoolean , getJSONObject , getJSONArray
	
	public static void main(String[] args) throws IOException {
		
		Path x=Paths.get("C:\\Users\\Vimal Bind\\Desktop\\test.json");
		byte[] byteArr=Files.readAllBytes(x);	
		String  strJson= new String(byteArr);
		//System.out.println(strJson);
		
		
		JSONObject rootJson=new JSONObject(strJson);
		Number num=rootJson.getNumber("id");
		String type=rootJson.getString("type");
		
		JSONObject viewedObj=rootJson.getJSONObject("viewed");
		Number viewed_time=viewedObj.getNumber("viewed_time");
		
		JSONArray jsonTagsArray=  rootJson.getJSONArray("tags");
		for(int i=0;i<jsonTagsArray.length(); i++) {
			String value=jsonTagsArray.getString(i);
			System.out.println(value);
		}
		
		
		
		JSONArray jsonPropertiesArray=rootJson.getJSONArray("properties");
		
		for(int i=0; i<jsonPropertiesArray.length();i++) {
			JSONObject propObj=jsonPropertiesArray.getJSONObject(i);
			
			
			String data=propObj.getString("type");
			System.out.println(data);
		}
		
		
		
		
	}
	
	
}
