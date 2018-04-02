package logger;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class CustomLoggerComponent {
	
	private static Logger logger = Logger.getLogger(CustomLoggerComponent.class);
	public void printLogs(List<String> strValues){
		String stage = "";
		String source = "";
		String unique = "";
		String message = "";
		String payload = "";
		
		if(Utils.isListNotEmpty(strValues)){ 
			int sizeValue = strValues.size();
			
			for(int i=0 ; i <sizeValue;i++){
				if(i == 0)
					 stage=  (null==strValues.get(0) || "".equals(strValues.get(0)))?"":strValues.get(0);
				if(i == 1)
					 source= (null==strValues.get(1) || "".equals(strValues.get(1)))?"":strValues.get(1);
				if(i == 2)
					 unique =  (null==strValues.get(2) || "".equals(strValues.get(2)))?"":strValues.get(2);
				if(i == 3)
					 message= (null==strValues.get(3) || "".equals(strValues.get(3)))?"":strValues.get(3);
				if(i == 4)
					payload = (null==strValues.get(4) || "".equals(strValues.get(4)))?"":strValues.get(4);
			}
			            logger.info("stage "+ stage +" source :"+source +" unique :"+unique +" message :"+message+" payload :"+payload);
		}
	
	}
	
	public void printLogsMap(Map<String,Object> strValues){
		String stage = "";
		String source = "";
		String unique = "";
		String message = "";
		String payload = "";
		
		if(!Utils.isEmpty(strValues)){ 
			 stage=  (null==strValues.get("stage") || "".equals(String.valueOf(strValues.get("stage"))))? "" : String.valueOf(strValues.get("stage"));
			 source= (null==strValues.get("source") || "".equals(String.valueOf(strValues.get("source"))))? "" : String.valueOf(strValues.get("source"));
			 unique =  (null==strValues.get("source") || "".equals(String.valueOf(strValues.get("source"))))?"": String.valueOf(strValues.get("unique"));
			 message= (null==strValues.get("unique") || "".equals(String.valueOf(strValues.get("unique"))))?"": String.valueOf(strValues.get("message"));
			 payload = (null==strValues.get("payload") || "".equals(String.valueOf(strValues.get("payload"))))?"":String.valueOf(strValues.get("payload"));
			 logger.info("stage :"+ stage +" source :"+source +" unique :"+unique +" message :"+message+" payload :"+payload);
			}
		}
	
}
