package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class CoolSmsTest {

	public static void main(String[] args) {
		String api_key = "NCSZM6KHDTYCNUAA";
	    String api_secret = "OLGUSZWSXYGXNPI9IQGEYLBOMXIDXOSG";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01080145686");
	    params.put("from", "01050255686");
	    params.put("type", "SMS");
	    params.put("text", "엄마 사랑해!!");
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	    	// JSONObject obj로 다운캐스팅
	    	// 메세지 전송
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      // 보내진 이후에 해야할 행위들 작성
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	  }
	
	}


