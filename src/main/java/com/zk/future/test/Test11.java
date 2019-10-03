package com.zk.future.test;

/**
 * @Author: zking
 * @Date: 2019/9/11 19:35
 * @Content:
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str == null) {
                break;
            }
            if (str != null) {
                boolean flag = true;
                String ctr[] = str.split(" ");

                if (ctr[0].length() == 1 && ctr[ctr.length - 1].length() == 1) {
                    for (int i = 1; i < ctr.length - 1; i++) {
                        if (ctr[i].length() == 2) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                } else if (ctr[0].length() == 2 && ctr[ctr.length - 1].length() == 2) {
                    for (int i = 1; i < ctr.length - 1; i++) {
                        if (ctr[i].length() == 1) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                } else if (ctr[0].length() == 2) {
                    for (int i = 0; i < ctr.length - 1; i++) {
                        if (ctr[i].length() == 2 && ctr[i + 1].length() == 1) {
                            flag = true;
                            i++;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                } else if (ctr[0].length() == 1) {
                    for (int i = 0; i < ctr.length - 1; i++) {
                        if (ctr[i].length() == 1 && ctr[i + 1].length() == 2) {
                            flag = true;
                            i++;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    list.add("true");
                } else {
                    list.add("false");
                }
            }
        }
        for (int j = 0; j < list.size(); j++) {
            if (j == list.size() - 1) {
                System.out.print(list.get(list.size() - 1));
            } else {
                System.out.print(list.get(j) + " ");
            }
        }
    }
}
