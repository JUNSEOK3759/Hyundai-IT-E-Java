package com.kosa;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
                "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
                "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", 
                "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", 
                "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        System.out.println(oneLength);
        System.out.println(twoLength);
        System.out.println(threeLength);
        
//         0 <= Math.random() < 1
//        System.out.println(Math.random() * 10); // 0 ~ (10 - 1)
//        int rand1 = (int) (Math.random() * oneLength); // 0 ~ (12 - 1)
//        int rand2 = (int) (Math.random() * twoLength); // 0 ~ (18 - 1)
//        int rand3 = (int) (Math.random() * threeLength); // 0 ~ (12 - 1)
//        
//        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
//        System.out.println("What we need is a " + phrase);
    }
}