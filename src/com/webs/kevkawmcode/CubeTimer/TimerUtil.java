package com.webs.kevkawmcode.CubeTimer;

public class TimerUtil {

	public static String formatTime(Long time){
		int hour = (int) Math.floor(time / 3600000);
		time -= hour * 3600000L;
		int minute = (int) Math.floor(time / 60000);
		time -= minute * 60000L;
		int second = (int) Math.floor(time / 1000);
		time -= second * 1000L;
		int mili = Math.round(time);
		String hourS = getTimeString(hour);
		String minuteS = getTimeString(minute);
		String secondS = getTimeString(second);
		String miliS = (mili < 100 ? mili < 10 ? "00" : "0" : "") + mili;
		return hourS + ":" + minuteS + ":" + secondS + "." + miliS;
	}
	
	private static String getTimeString(int i){
		return i < 10 ? "0" + i : i + "";
	}
	
}
