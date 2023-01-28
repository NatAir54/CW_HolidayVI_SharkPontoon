package cw;

/* Your friend invites you out to a cool floating pontoon around 1km off the beach.
* Among other things, the pontoon has a huge slide that drops you out right into the ocean,
* a small way from a set of stairs used to climb out.
* As you plunge out of the slide into the water, you see a shark hovering in the darkness under the pontoon...
* Crap!
* You need to work out if the shark will get to you before you can get to the pontoon.
* To make it easier... as you do the mental calculations in the water you either freeze when you realise you are dead,
* or swim when you realise you can make it!
* You are given 5 variables:
* 1) sharkDistance = distance from the shark to the pontoon. The shark will eat you if it reaches you before you escape to the pontoon.
* 2) sharkSpeed = how fast it can move in metres/second.
* 3) pontoonDistance = how far you need to swim to safety in metres.
* 4) youSpeed = how fast you can swim in metres/second.
* 5) dolphin = a boolean, if true, you can half the swimming speed of the shark as the dolphin will attack it.
* The pontoon, you, and the shark are all aligned in one dimension.
* If you make it, return "Alive!", if not, return "Shark Bait!".
 */

public class MainApp {
    public static void main(String[] args) {
        System.out.println(shark(12, 50, 4, 8, true));
        System.out.println(shark(7, 55, 4, 16, true));
        System.out.println(shark(24, 0, 4, 8, true));
    }

    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        if (dolphin) {
            sharkSpeed /= 2;
        }
        if (sharkSpeed == 0) {
            return "Alive!";
        }
        if (youSpeed == 0) {
            return "Shark Bait!";
        }
        else {
            int sharkTime = sharkDistance / sharkSpeed;
            int myTime = pontoonDistance / youSpeed;
            return (sharkTime - myTime) < 0 ? "Shark Bait!" : "Alive!";
        }
    }

}
