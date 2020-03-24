package com.company;

/*

1706 Synchronized President
And again Singleton pattern - synchronization in a static block
Inside the OurPresident class in a static block, create a synchronized block.
Inside the synchronized block, initialize the president.

Requirements:
1. OurPresident class must contain the private static field OurPresident president.
2. The OurPresident class must contain the public static OurPresident getOurPresident () method.
3. OurPresident class must contain a private constructor.
4. OurPresident class must contain a static block.
5. There should be a synchronized block inside the static block of OurPresident class.
6. Inside the synchronized block, the president field must be initialized.


 */


public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident );
    }
}

class OurPresident {
    private static OurPresident president;

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }
    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}







