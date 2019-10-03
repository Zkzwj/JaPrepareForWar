package com.zk.interview.vivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zking
 * @Date: 2019/9/11 17:12
 * @Content:
 */
public class Main2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] input = inputStr.split(" ");
        int totalDisk = Integer.parseInt(input[0]);
        int totalMemory = Integer.parseInt(input[1]);
        List<Service> services = parseServices(input[2].split("#"));
        int output = solution(totalDisk, totalMemory, services);
        System.out.println(output);
    }

    private static int solution(int totalDisk, int totalMemory, List<Service> services) {
        int size = services.size();
        int[] disk = new int[size];
        int[] memory = new int[size];
        int[] users = new int[size];
        for (int i = 0; i < size; i++) {
            disk[i] = services.get(i).getDisk();
            memory[i] = services.get(i).getMemory();
            users[i] = services.get(i).getusers();
        }
        int[][] temp = new int[totalDisk + 1][totalMemory + 1];
        for (int i = 0; i < size; i++) {
            for (int j = totalDisk; j > 0; j--) {
                for (int k = totalMemory; k > 0; k--) {
                    if (j < disk[i] || k < memory[i]) {
                        temp[j][k] = temp[j][k];
                    } else {
                        int i1 = temp[j][k];
                        int i2 = temp[j - disk[i]][k - memory[i]];
                        temp[j][k] = Math.max(temp[j][k], temp[j - disk[i]][k - memory[i]]);
                    }
                }
            }
        }
        return temp[totalDisk][totalMemory];
    }

    private static List<Service> parseServices(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new ArrayList<Service>(0);
        }
        List<Service> services = new ArrayList<>(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String[] serviceArr = strArr[i].split(",");
            int disk = Integer.parseInt(serviceArr[0]);
            int memory = Integer.parseInt(serviceArr[1]);
            int users = Integer.parseInt(serviceArr[2]);
            services.add(new Service(disk, memory, users));
        }
        return services;
    }

    static class Service {
        private int disk;

        private int memory;

        private int users;

        public Service(int disk, int memory, int users) {
            this.disk = disk;
            this.memory = memory;
            this.users = users;
        }

        public int getDisk() {
            return disk;
        }

        public void setDisk(int disk) {
            this.disk = disk;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public int getusers() {
            return users;
        }

        public void setusers(int users) {
            this.users = users;
        }
    }

}
