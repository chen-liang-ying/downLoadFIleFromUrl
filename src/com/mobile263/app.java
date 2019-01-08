package com.mobile263;

import com.mobile263.download.DownUtil;

public class app {

	public static void main(String[] args) {

        try{
        	DownUtil.downLoadFromUrl("http://121.31.255.235:12301/record/CSAC_0001_635c33139d01f514_13713988671_04127181338_20190107165428.mp3",
        			"CSAC_0001_635c33139d01f514_13713988671_04127181338_20190107165428.mp3",
        			"E:\\net_share");
        }catch (Exception e) {
            // TODO: handle exception
        	System.out.println("down failed");
        }
	}

}
