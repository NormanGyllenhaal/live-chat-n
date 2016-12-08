package com.rcplatform.livechat.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yang peng on 2016/9/21.
 */
public class GaeaUtil {



    public void runbat(String batName) {
        try {
            Process ps = Runtime.getRuntime().exec(batName);
            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream(),"UTF-8"));
            String line;
            while ((line = br.readLine()) != null) {
                //log.info(line);
            }
            br.close();
            ps.waitFor();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("child thread done");
    }


    public static void main(String[] args) {
        GaeaUtil gaeaUtil = new GaeaUtil();
        String property = System.getProperty("gaea.server");
        gaeaUtil.runbat(property);
        System.out.println("main thread");
    }
}
