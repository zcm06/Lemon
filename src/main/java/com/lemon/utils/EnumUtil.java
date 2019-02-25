package com.lemon.utils;

public class EnumUtil {

    public enum Gender {
        unknow("未知", 0), man("男", 1), woman("女", 2);

        private String name;
        private int index;

        private Gender(String name, int index) {
            this.name = name;
            this.index = index;
        }

        public static String getName(int index){
            for (Gender gender :Gender.values()){
                if (gender.index == index){
                    return gender.name;
                }
            }
            return null;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    public enum completeState{
        完成,未完成
    }
}
