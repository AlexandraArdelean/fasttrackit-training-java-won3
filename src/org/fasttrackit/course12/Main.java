package org.fasttrackit.course12;

public class Main {
    public static class Tester {
        int var;

        Tester(double var) {
            this.var = (int) var;
        }

        Tester(int var) {
            this("hello");

        }

        Tester(String s) {
            this();
            System.out.println(s);
        }

        Tester() {
            System.out.println("good-bye");
        }

        public static void main(String[] args) {
          //  Tester t = new Tester(2);

        for(
                int i = 2;
                i< 4;i++)
                        for(
                int j = 2;
                j< 4;j++)
                        assert i !=j :i;
            }
        }


    }

