/**
 * Created by mzdbxqh on 2017/3/10.
 */

public enum ShortUrl {
	INSTANCE;
	private long id = 0;
	private int maxLength = 6;
	private char[] urlCharSet = "1qaz2wsx3edc4rfv5tgb".toCharArray();
	private int urlCharSetLength = urlCharSet.length;
	private long maxID = (long)Math.pow(urlCharSetLength, maxLength);

	public String getShortUrl(){
		id++;
		if(id > maxID) id = 0;
		StringBuilder url = new StringBuilder();
		long remainder = id;
		for(int i = 1; i <= maxLength; i++){
			url.append(urlCharSet[(int)(remainder % urlCharSetLength)]);
			if(remainder > urlCharSetLength){
				remainder = remainder / urlCharSetLength;
			} else  {
				remainder = 0;
			}
		}
		return url.toString();
	}
}
