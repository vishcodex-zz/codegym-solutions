package com.codegym.task.task15.task1505;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static interface LivingPart {
        Object containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            String str = "Yes";
            return new String(str); //Boolean.valueOf(str);
        }
        public String toString() {
            String visszater = null;
            if(containsBones().equals("Yes")){
                visszater = name + " contains bones";
            } else{
                visszater = name + " does not contain bones";
            }
            return new String(visszater) ;
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones() {
            String joszar = null;
            if ((super.containsBones().equals("Yes")) && isArtificial == false) {
                joszar = "Yes";

            } else {
                joszar = "No";
            }
            return new String(joszar);
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        if(new BodyPart("Hand").containsBones().equals("Yes"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Hand"));
        bodyParts.add(new BodyPart("Leg"));
        bodyParts.add(new BodyPart("Head"));
        bodyParts.add(new BodyPart("Body"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Thumb", true));
        fingers.add(new Finger("Forefinger", true));
        fingers.add(new Finger("Middle finger", true));
        fingers.add(new Finger("Ring-finger", true));
        fingers.add(new Finger("Pinky", true));
        System.out.println(fingers.toString());
    }
}