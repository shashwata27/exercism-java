class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake || archerIsAwake || prisonerIsAwake){
            return true;
        }else{
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake){
            return false;
        } else if (prisonerIsAwake) {
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent && !archerIsAwake){
            return true;
        } else if (!petDogIsPresent) {
            if(!knightIsAwake && !archerIsAwake && prisonerIsAwake) {
                return true;
            }
        }
        return false;
    }
}
