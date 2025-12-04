public class Assignment3 {

   public static void main(String[] args) {
        
        String simulatedName = "Pyre";  
        int simulatedElement = 1;       
        int simulatedPotential = 2;    
        int simulatedDestiny = 5;       
        int simulatedTrainingDays = 10;  
        int simulatedTrainingFocus = 1; 
   
        int choiceForForest = 1; 
        int choiceForCave = 2;   
        int choiceForRuins = 1;

        boolean inputsAreValid = true;

        String name;
        int elemental = 0;
        int potential = 0;
        int destiny = 0;
        String elementString = "";
        String potentialString = "";

        System.out.print("--- Welcome to the Digital Monster Creation Arena ---");
        System.out.print("\nLet's create your first monster. Give it a cool name:");
        
        name = simulatedName; 
        System.out.println(name); 

        System.out.print("\nNow, choose your monster's element. This choice will determine its core strength."
                + "\n[1] Fire (Attack-oriented)"
                + "\n[2] Water (Health-oriented)"
                + "\n[3] Earth (Defense-oriented)"
                + "\nYour choice (1-3): ");
        
        elemental = simulatedElement;
        System.out.println(elemental);

        if (elemental == 1) {
            elementString = "Fire";
        } else if (elemental == 2) {
            elementString = "Water";
        } else if (elemental == 3) {
            elementString = "Earth";
        } else {
            System.out.print("ERROR: Invalid element choice. Exiting program.");
            inputsAreValid = false;
        }

        if (inputsAreValid) {
            System.out.print("\nEvery monster has a potential. Choose its potential: "
                    + "\n[1] Normal (Standard stats)"
                    + "\n[2] Rare (Bonus to all stats)"
                    + "\nYour choice (1-2): ");
            
            potential = simulatedPotential;
            System.out.println(potential);

            if (potential == 1) {
                potentialString = "Normal";
            } else if (potential == 2) {
                potentialString = "Rare";
            } else {
                System.out.print("ERROR: Invalid potential choice. Exiting program.");
                inputsAreValid = false;
            }
        }

        if (inputsAreValid) {
            System.out.print("\nFinally, enter a number between 1 and 10 to influence its destiny: ");
            
            destiny = simulatedDestiny;
            System.out.println(destiny);

            if (destiny < 1 || destiny > 10) {
                System.out.print("ERROR: Destiny Number must be between 1 and 10. Exiting program.");
                inputsAreValid = false;
            }
        }

        int hp = 50;
        int ap = 10;
        int dp = 5;

        if (inputsAreValid) {
            if (elemental == 1) {
                ap = ap + 5;
            } else if (elemental == 2) {
                hp = hp + 20;
            } else if (elemental == 3) {
                dp = dp + 10;
            }
            if (potential == 2) {
                hp = hp + 10;
                ap = ap + 10;
                dp = dp + 10;
            }
            if (elemental == 1) {
                ap = ap + destiny;
            } else if (elemental == 2) {
                hp = hp + destiny;
            } else if (elemental == 3) {
                dp = dp + destiny;
            }

            System.out.print("\nExcellent choices! Your monster " + name + " is being created...\n");
            System.out.print("\n--- MONSTER PROFILE CARD ---");
            System.out.print("\nName: " + name);
            System.out.print("\nElement: " + elementString);
            System.out.print("\nPotential: " + potentialString);
            System.out.print("\n\nHealth Points (HP): " + hp);
            System.out.print("\nAttack Power (AP): " + ap);
            System.out.print("\nDefense Power (DP): " + dp);
            System.out.print("\n---------------------------\n");

            int initialTrainingHP = hp;
            int initialTrainingAP = ap;
            int initialTrainingDP = dp;
            int initialTrainingLevel = 1;

            int level = 1;
            int currentXP = 0;
            int xpToNextLevel = level * 100;
            int trainingFocus = 0;
            int numDaysToTrain = 0;

            System.out.println("\n--- Now, let's train your new monster! ---");
            System.out.print("\nHow many days would you like to train your monster? ");
            
            numDaysToTrain = simulatedTrainingDays;
            System.out.println(numDaysToTrain);

            System.out.print("\n");
            for (int day = 1; day <= numDaysToTrain; day++) {

                if ((day - 1) % 7 == 0) {
                    System.out.print("-- Training Week " + ((day - 1) / 7 + 1) + " --");
                    System.out.print("\nSelect your training focus for this week:"
                            + "\n [1] Focus on Health (Bonus HP on level-up)"
                            + "\n [2] Focus on Attack (Bonus AP on level-up)"
                            + "\n [3] Focus on Defense (Bonus DP on level-up)"
                            + "\nYour choice: ");
                    
                    trainingFocus = simulatedTrainingFocus;
                    System.out.println(trainingFocus);

                    if (trainingFocus < 1 || trainingFocus > 3) {
                        System.out.print("Error\n");
                        return;
                    }
                }

                currentXP += 30;

                System.out.print("\nDay " + day + "... (XP +30) Total XP: " + currentXP + "/" + xpToNextLevel);

                while (currentXP >= xpToNextLevel) {
                    level++;

                    System.out.print("\n*** LEVEL UP! Your monster is now Level " + level + "! ***");

                    hp += 10;
                    ap += 5;
                    dp += 5;

                    if (trainingFocus == 1) {
                        hp += 5;
                    } else if (trainingFocus == 2) {
                        ap += 5;
                    } else if (trainingFocus == 3) {
                        dp += 5;
                    }

                    currentXP -= xpToNextLevel;

                    xpToNextLevel = level * 100;
                }
            }

            System.out.print("\n\n--- Training Results ---");
            System.out.printf("%n+------------------+------------------+");
            System.out.printf("%n|   Initial Stats  |    Final Stats   |");
            System.out.printf("%n+------------------+------------------+");
            System.out.printf("%n| HP: %-4d         | HP: %-4d         |", initialTrainingHP, hp);
            System.out.printf("%n| AP: %-4d         | AP: %-4d         |", initialTrainingAP, ap);
            System.out.printf("%n| DP: %-4d         | DP: %-4d         |", initialTrainingDP, dp);
            System.out.printf("%n| Level: %-4d      | Level: %-4d      |", initialTrainingLevel, level);
            System.out.printf("%n+------------------+------------------+");
            System.out.print("\n\n--- The Guardian's Trial Begins!---");

            int guardianHP = 150;
            int guardianAP = 35;
            int guardianDP = 15;

            int monsterBattleStartHP = hp;

            while (hp > 0 && guardianHP > 0) {

                int damageDealt = ap - guardianDP;

                if (damageDealt < 5) {
                    damageDealt = 5;
                }

                guardianHP -= damageDealt;
                if (guardianHP < 0) {
                    guardianHP = 0;
                }

                System.out.print("\n> Your monster attacks and deals " + damageDealt + " damage! \n(Guardian HP: " + guardianHP + "/150)");

                if (guardianHP <= 0) {
                    break;
                }

                int damageTaken = guardianAP - dp;

                if (damageTaken < 5) {
                    damageTaken = 5;
                }

                hp -= damageTaken;
                if (hp < 0) {
                    hp = 0;
                }

                System.out.print("\n> The Stone Guardian attacks and deals " + damageTaken + " damage! \n(Your HP: " + hp + "/" + monsterBattleStartHP + ")");
            }

            System.out.println();
            if (hp > 0) {
                System.out.println("\nVICTORY! The Guardian deems your monster worthy. The path to new adventures is now open!");
                
                System.out.println("\nTwo skilled adventurers, Swiftclaw and Ironhide, are impressed");
                System.out.println("by " + name + "'s strength and decide to join the team!");
                System.out.println("--- TEAM ROSTER INITIALIZED ---");

                String[] teamMemberNames = new String[3];
                int[] teamMemberCurrentHP = new int[3];
                int[] teamMemberMaxHP = new int[3];
                int[] teamMemberAP = new int[3];
                int[] teamMemberDP = new int[3];
                boolean[] teamMemberAlive = new boolean[3];

                initializeTeam(name, hp, ap, dp, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);

                int[] totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);

                displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);

                boolean[] regionsExploredStatus = {false, false, false}; 
                
                int[] scenarioIndices = {0, 1, 0}; 
                int[] choices = {choiceForForest, choiceForCave, choiceForRuins};

                for (int regionIndex = 0; regionIndex < 3; regionIndex++) {
                    
                    int scenarioIndex = scenarioIndices[regionIndex];
                    int choice = choices[regionIndex];

                    System.out.println("\n--- Exploring Region Index: " + regionIndex + ", Scenario Index: " + scenarioIndex+" ---");
                    
                    triggerEvent(regionIndex, scenarioIndex, choice, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                    
                    regionsExploredStatus[regionIndex] = true;
                    
                    totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                    displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);

                    if (!checkTeamStatus(teamMemberAlive)) {
                        System.out.println("\nDEFEAT! All team members are unconscious.");
                        return; 
                    }
                }

                if (checkTeamStatus(teamMemberAlive) && allRegionsExplored(regionsExploredStatus)) {
                    System.out.println("\nVICTORY! All regions explored successfully!");
                } else {
                    System.out.println("\nDEFEAT! Mission failed.");
                }

            } else {
                System.out.print("\nDEFEAT! Your monster has fallen. Return to training to prepare for the trial once more.");
            }
            System.out.println();
        }
    }

    public static void initializeTeam(String monsterName, int monsterHP, int monsterAP, int monsterDP,
                                      String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP,
                                      int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {
        
        teamMemberNames[0] = monsterName;
        teamMemberCurrentHP[0] = monsterHP;
        teamMemberMaxHP[0] = monsterHP;
        teamMemberAP[0] = monsterAP;
        teamMemberDP[0] = monsterDP;
        teamMemberAlive[0] = true;

        teamMemberNames[1] = "Swiftclaw";
        teamMemberCurrentHP[1] = 80;
        teamMemberMaxHP[1] = 80;
        teamMemberAP[1] = 40;
        teamMemberDP[1] = 10;
        teamMemberAlive[1] = true;

        teamMemberNames[2] = "Ironhide";
        teamMemberCurrentHP[2] = 120;
        teamMemberMaxHP[2] = 120;
        teamMemberAP[2] = 20;
        teamMemberDP[2] = 30;
        teamMemberAlive[2] = true;
    }

    public static int[] calculateTotalTeamStats(int[] teamMemberCurrentHP, int[] teamMemberAP,
                                                int[] teamMemberDP, boolean[] teamMemberAlive) {
        int totalHP = 0;
        int totalAP = 0;
        int totalDP = 0;

        for (int i = 0; i < teamMemberAlive.length; i++) {
            if (teamMemberAlive[i]) {
                totalHP += teamMemberCurrentHP[i];
                totalAP += teamMemberAP[i];
                totalDP += teamMemberDP[i];
            }
        }
        return new int[]{totalHP, totalAP, totalDP};
    }

    public static void displayTeamStats(String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP,
                                        int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive, int[] totalTeamStats) {
        
        System.out.println("+----------------+-----------+------+------+-------------+");
        System.out.printf("| %-14s | %-9s | %-4s | %-4s | %-11s |%n", "Member", "HP", "AP", "DP", "Status");
        System.out.println("+----------------+-----------+------+------+-------------+");

        for (int i = 0; i < teamMemberNames.length; i++) {
            String status = teamMemberAlive[i] ? "Alive" : "Unconscious";
            String hpStr = teamMemberCurrentHP[i] + "/" + teamMemberMaxHP[i];
            System.out.printf("| %-14s | %-9s | %-4d | %-4d | %-11s |%n", 
                teamMemberNames[i], hpStr, teamMemberAP[i], teamMemberDP[i], status);
        }

        System.out.println("+----------------+-----------+------+------+-------------+");
        System.out.printf("|TOTAL STATS     | HP: %-5d | AP: %-7d | DP: %-8d|", totalTeamStats[0], totalTeamStats[1], totalTeamStats[2]);
        System.out.println("\n+----------------+-----------+------+------+-------------+");
    }

    public static boolean allRegionsExplored(boolean[] regionsExploredStatus) {
        for (boolean status : regionsExploredStatus) {
            if (!status) return false;
        }
        return true;
    }

    public static void applyDamageToTeam(int damage, int[] teamMemberCurrentHP, int[] teamMemberDP, boolean[] teamMemberAlive) {
        int aliveCount = 0;
        for (boolean alive : teamMemberAlive) {
            if (alive) aliveCount++;
        }

        if (aliveCount == 0) return;

        int damagePerMember = damage / aliveCount; 

        for (int i = 0; i < teamMemberCurrentHP.length; i++) {
            if (teamMemberAlive[i]) {
                teamMemberCurrentHP[i] -= damagePerMember;
                if (teamMemberCurrentHP[i] <= 0) {
                    teamMemberCurrentHP[i] = 0;
                    teamMemberAlive[i] = false;
                }
            }
        }
    }

    public static void healTeam(int healAmount, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, boolean[] teamMemberAlive) {
        int eligibleCount = 0;
        
        for (int i = 0; i < teamMemberCurrentHP.length; i++) {
            if (!teamMemberAlive[i] || (teamMemberAlive[i] && teamMemberCurrentHP[i] < teamMemberMaxHP[i])) {
                eligibleCount++;
            }
        }

        if (eligibleCount == 0) return;

        int healPerMember = healAmount / eligibleCount;

        for (int i = 0; i < teamMemberCurrentHP.length; i++) {
            boolean wasEligible = !teamMemberAlive[i] || (teamMemberAlive[i] && teamMemberCurrentHP[i] < teamMemberMaxHP[i]);
            
            if (wasEligible) {
                teamMemberCurrentHP[i] += healPerMember;
                
                if (teamMemberCurrentHP[i] > teamMemberMaxHP[i]) {
                    teamMemberCurrentHP[i] = teamMemberMaxHP[i];
                }

                if (teamMemberCurrentHP[i] > 0) {
                    teamMemberAlive[i] = true;
                }
            }
        }
    }
    
    public static boolean checkTeamStatus(boolean[] teamMemberAlive) {
        for (boolean alive : teamMemberAlive) {
            if (alive) return true;
        }
        return false;
    }

    public static void triggerEvent(int regionIndex, int scenarioIndex, int simulatedChoice,
                                    String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP,
                                    int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {

        if (scenarioIndex != 0 && scenarioIndex != 1) scenarioIndex = 0;
        if (simulatedChoice != 1 && simulatedChoice != 2) simulatedChoice = 1;

        if (regionIndex == 0) { 
            if (scenarioIndex == 0) { 
                System.out.println("Event: Your team is ambushed by wild monsters.");
                if (simulatedChoice == 1) { 
                    System.out.print("Outcome: The team fights back bravely! ");
                    
                    int[] stats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                    int totalDP = stats[2];
                    int damage = 40 - totalDP;
                    if (damage < 5) damage = 5;
                    
                    System.out.print("They take " + damage + " damage in the skirmish. ");
                    applyDamageToTeam(damage, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);

                    int minAP = Integer.MAX_VALUE;
                    int minIndex = -1;
                    for (int i = 0; i < teamMemberAP.length; i++) {
                        if (teamMemberAlive[i] && teamMemberAP[i] < minAP) {
                            minAP = teamMemberAP[i];
                            minIndex = i;
                        }
                    }
                    if (minIndex != -1) {
                        teamMemberAP[minIndex] += 5;
                        System.out.println(teamMemberNames[minIndex] + "'s resolve is hardened, increasing its AP by 5.");
                    }

                } else { 
                    System.out.println("Outcome: The attempt to flee fails. The team takes 15 damage.");
                    applyDamageToTeam(15, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                }
            } 
        } 
        else if (regionIndex == 1) { 
             if (scenarioIndex == 1) { 
                System.out.println("Event: You discover a glowing crystal vein in the cave wall.");
                if (simulatedChoice == 1) { 
                     System.out.print("Outcome: The team harvests for power. AP increases. ");
                     for(int i=0; i<3; i++) if(teamMemberAlive[i]) teamMemberAP[i] += 5;
                } else { 
                     System.out.println("Outcome: The team harvests the crystals, feeling a surge of vitality. Their maximum and current HP increase!");
                     for(int i=0; i<3; i++) {
                         if(teamMemberAlive[i]) {
                             teamMemberMaxHP[i] += 10;
                             teamMemberCurrentHP[i] += 10;
                         }
                     }
                }
             }
        }
        else if (regionIndex == 2) { 
            if (scenarioIndex == 0) { 
                System.out.println("Event: You find an ancient mechanism on a pressure plate.");
                if (simulatedChoice == 1) { 
                    System.out.println("Outcome: It's a trap! The mechanism releases a burst of negative energy, damaging the team.");
                    applyDamageToTeam(20, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                } else { 
                    System.out.println("Outcome: You walk around safely.");
                }
            }
        }
    }
}