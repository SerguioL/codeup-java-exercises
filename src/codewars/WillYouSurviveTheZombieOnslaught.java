package codewars;

public class WillYouSurviveTheZombieOnslaught {

//    public static String zombieShootout(int zombies, int range, int ammo) {
//
//        int zombiesShot = 0;
//
//        for(int i=0; i<zombies; i++){
//            range -= 0.5;
//            zombiesShot += 1;
//            zombies -= 1;
//            ammo -= 1;
//
//             if (range == 0){
//                return "You shot " + zombiesShot + " zombies before being eaten: overwhelmed.";
//            } else if (zombies >= 1 && ammo == 0){
//                return "You shot " + zombiesShot + " zombies before being eaten: ran out of ammo.";
//            }
//
//        }
//
//            return "You shot all " + zombiesShot + " zombies.";
//
//    }

    public static String zombieShootout(int zombies, int range, int ammo) {

        boolean overwhelmedDeath = false;
        int zombiesShot = 0;
        int ammoLeft = ammo;
        double distanceLeft = range;

        if(range == 0  || ammo == 0){
            overwhelmedDeath = true;
        }else{

            for(int j=0;j<zombies;j++){
                zombiesShot++;
                ammoLeft--;
                distanceLeft -= 0.5;
                if((distanceLeft==0) && zombiesShot != zombies){
                    overwhelmedDeath=true;
                    break;
                }else if(ammoLeft==0){
                    break;
                }
            }
        }

        if(overwhelmedDeath == true){
            return "You shot "+ zombiesShot +" zombies before being eaten: overwhelmed.";
        } else if(zombies>ammo){
            return "You shot "+ zombiesShot +" zombies before being eaten: ran out of ammo.";
        } else{
            return "You shot all "+ zombiesShot +" zombies.";
        }

    }


    public static void main(String[] args) {

        System.out.println(zombieShootout(3, 10, 10));//"You shot all 3 zombies."
        System.out.println(zombieShootout(100, 8, 200));//"You shot 16 zombies before being eaten: overwhelmed."
        System.out.println(zombieShootout(50, 10, 8));//"You shot 8 zombies before being eaten: ran out of ammo."

    }

}
