package logger;

import java.util.Collection;
import java.util.Map;

public class Utils {

	public static boolean isListNotEmpty(Object strValues){
		if(strValues==null) 
				return false;
		else
			return true;
		
	}
	
	/** Check whether string s is empty. */
	public static boolean isEmpty(String s) {
		return ((s == null) || (s.trim().length() == 0));
	}
	 /** Check whether string s is NOT empty. */
    public static boolean isNotEmpty(String s) {
        return ((s != null) && (s.trim().length() > 0));
    }
    
	 @SuppressWarnings("unchecked")
	public static boolean isEmpty(Object value) {
	       
	        if (value == null) return true;
	        if (value instanceof String) {
	            if (((String) value).length() == 0) {
	                return true;
	            }
	        } else if (value instanceof Collection) {
	            if (((Collection<String>) value).size() == 0) {
	                return true;
	            }
	        } else if (value instanceof Map) {
	            if (((Map<String,Object>) value).size() == 0) {
	                return true;
	            }
	        }
	        return false;
	    }
	 
}
