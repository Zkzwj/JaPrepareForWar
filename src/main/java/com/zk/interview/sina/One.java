package com.zk.interview.sina;

import java.util.ArrayList;

/**
 * @Author: zking
 * @Date: 2019/8/31 16:16
 * @Content:
 */
public class One {

    public static void main(String[] args) {
        String[] list = {"3", "4.3.5.4", "2.10.3", "2.4"};
        String minVersion = getMinVersion(list);
        System.out.println(minVersion);
    }

    public static String getMinVersion(String[] list) {
        if (list == null || list.length == 0) {
            return "";
        }
        if (list.length == 1) {
            return list[0];
        }
        String version1 = list[0];
        for (int i = 1; i < list.length; i++) {
            version1 = t(version1, list[i]);
        }
        return version1;
    }


    public static String t(String v1, String v2) {

        String[] version1 = v1.split("\\.");
        String[] version2 = v2.split("\\.");
        ArrayList<Integer> arrayList = new ArrayList<>();
        int len = Math.max(version1.length, version2.length);
        for (int i = 0; i < len; i++) {
            if (version1.length == i) {
                while (i < len) {
                    if (Integer.parseInt(version2[i]) > 0) {
                        return v1;
                    }
                    i++;
                }
            } else if (version2.length == i) {
                while (i < len) {
                    if (Integer.parseInt(version1[i]) > 0) {
                        return v2;
                    }
                    i++;
                }
            } else {
                if (Integer.parseInt(version1[i]) > Integer.parseInt(version2[i])) {
                    return v2;
                } else if (Integer.parseInt(version1[i]) < Integer.parseInt(version2[i])) {
                    return v1;
                }
            }
        }
        return v1;
    }
}
