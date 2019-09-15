package com.example.sweettalkapp;

public class PickupList {

    public static final int CLASSICS = 0;
    public static final int TECH = 1;
    public static final int SCIENCE = 2;
    public static final int POP_CULTURE = 3;
    public static final int SPICY = 4;
    public static final int PURDUE = 5;

    private int category;
    private String[] lines;

    public PickupList(int category){
        this.category = category;
        addLines();
    }

    public String generateLine(){
        int index = (int) (Math.random() * (lines.length - 1));
        return lines[index];
    }

    public void addLines(){
        if (category == CLASSICS){
            lines = new String[] {"Good thing I’m not wearing gloves, because you are too hot to handle.",
                    "If you were words on a page, you’d be fine print.", " I'll cook you dinner, if you cook me breakfast.",
                    "If a star fell for every time I thought of you, the sky would be empty.",
                    "Kiss me if I'm wrong, but dinosaurs still exist right?",
                    "You're pretty and I'm cute. Together we'd be pretty cute.",
                    "You look familiar - did we have class together? I could've sworn we had chemistry.",
                    "Can you kiss me on the cheek so I can at least say someone cute kissed me tonight?",
                    "I think you've got something in your eye. Oh never mind, it's just a sparkle.",
                    "I'm no photographer but I can picture us together.",
                    "My friends bet me I couldn't talk to the prettiest girl in here. Do you want to use their money to buy drinks? ",
                    "Do you play soccer? Because you're a keeper!", "Are you a beaver? Because daaaaaaam.",
                    "Are you from Tennessee? Because you're the only 10 I see.",
                    "You're the stars on my spangled banner.",
                    "Put down that cupcake. You're sweet enough already.",
                    "No wonder the sky is grey today; all the blue is in your eyes.",
                    "Your eyes are bluer than the Atlantic Ocean and baby, I'm all lost at sea."};
        }
        else if (category == TECH){
            lines = new String[] {"Is your name Wi-fi? Because I'm really feeling a connection.",
                    "If you won't let me buy you a drink, at least let me fix your laptop.",
                    "Are you a double? The thought of you always floats inside my head.",
                    "Get with me and our lives will have an array of possibilities.",
                    "I think we should increase our bandwidth.",
                    "Is your name Google? Because you’ve got everything I’m searching for.",
                    "My main method is 'public love iLoveYou().'",
                    "Hey, my name’s Microsoft. Can I crash at your place tonight?"};
        }
        else if (category == SCIENCE){
            lines = new String[] {"I wish your name was Avogadro then I would already know your number.",
                    "Are you a carbon sample? Because I want to date you.",
                    "Do you have 11 protons? Because you're sodium fine.",
                    "Forget hydrogen, you're my number one element.",
                    "Do you like science? Because I’ve got my ion you.",
                    "You must be a fossil, because I would love to date you.",
                    "You must have a p-value of at least 0.05, because I fail to reject you."};
        }
        else if (category == POP_CULTURE){
            lines = new String[] {"I'd like to check you for ticks.",
                    "Baby, you can crash my party anytime.",
                    "My spidey sense isn't the only thing tingling.",
                    "I think my Spotify is broken. You’re not listed in the hottest singles.",
                    "Is this Jenny at 867-5309? No? Then what's your name and number?",
                    "Get with me, babe, I'm never gonna give you up, I'm never gonna get you down. Never gonna tell a lie, or hurt you.",
                    "Wanna dance? Let's go to Boogie Wonderland.",
                    "You spin me right round. Like a record, baby.",};
        }
        else if (category == SPICY){
            lines = new String[] {"Forget about world domination, I only want to dominate you.",
                    "Would you have sex with me for $100? I could really use the money.",
                    "Hey, I put the sensual in consensual.",
                    "The only STD I have is sexually transmitted desire for you.",
                    "Is that a mirror in your pocket? Because I can see me in your pants!",};
        }

        else if (category == PURDUE) {
            lines = new String[] {"Lemme boiler you up and hammer you down.",
                    "I don’t know if it’s just because we don’t A/C or you, but it’s pretty hot in here",
                    "What if we held hands under the bell tower",
                    "Hey, I’m an Engineering major at Purdue",
                    "I don’t know if it’s because I’m a CS major, but I CS together",
                    "I like Windsor, Wiley, and Ford, but my favorite dining hall is you",
                    "My dorm has air conditioning",};
        }

    }

}
