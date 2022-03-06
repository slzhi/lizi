package com.smallchange.s3_4;

public class Maze {
        public static void main(String[] args) {
            // 创建一个二维数组模拟迷宫
            // 地图
            int[][] map = new int[8][7];
            // 使用1表示墙
            // 先把上下置为1
            for(int i = 0; i < 7; i++){
                map[0][i] = 1;
                map[7][i] = 1;
            }

            // 作为全部置为1
            for(int i = 0; i < 8; i++){
                map[i][0] = 1;
                map[i][6] = 1;
            }

            // 设置挡板
            map[3][1] = 1;
            map[3][2] = 1;

            // 输出地图
            System.out.println("输出地图");
            for(int[] data : map){
                for (int ele : data){
                    System.out.printf("%d\t",ele);
                }
                System.out.println();
            }

            // 使用递归回溯给小球找路
            setWay(map,1,1);

            // 输出新的地图，小球走过，并标识过的递归
            System.out.println("小球走过，并标识过的地图情况");
            for(int[] data : map){
                for (int ele : data){
                    System.out.printf("%d\t",ele);
                }
                System.out.println();
            }

        }

        public static boolean setWay(int[][] map, int i, int j){
            if(map[6][5] == 2){ // 说明通路已经找到
                return true;
            }else{
                if(map[i][j] == 0){ // 如果当前这个节点还没走过
                    // 按照策略走
                    map[i][j] = 2; // 假设这点时可以走通的
                    if(setWay(map,i+1, j)){ // 向下走
                        return true;
                    }else if(setWay(map,i, j+1)){ // 向右走
                        return true;
                    }else if(setWay(map,i-1, j)){ // 向上走
                        return true;
                    }else if(setWay(map,i, j-1)){ // 向左走
                        return true;
                    }else{
                        // 说明该点是走不通的
                        map[i][j] = 3;
                        return false;
                    }
                }else{ // 如果map[i][j] != 0，可能是1，2，3
                    return false;
                }
            }
        }

}
