package com.example.songt.bagoffunnies;

import java.util.Random;

/**
 * Created by songt on 2017-12-06.
 */

public class DadJokeLibrary {

    private int randoDadJokeNumber;

    private String mDadJoke[] = {
            "Why don't crabs give to charity?",
            "I got hit in the head with a can of Diet Coke today. Don't worry, I'm not hurt. It was a soft drink",
            "I don't trust stairs. They're always up to something.",
            "Why was the chef embarrassed?",
            "Why did the boy throw a bucket out the window?",
            "Why did the boy throw butter out the window?",
            "Why did the boy throw his watch out the window?",
            "What do prisoners use to call each other?",
            "What do you call a pony with a sore throat?",
            "What did the buffalo say to his son when he left for college?",
            "Why couldn't the bicycle stand up by itself?",
            "The graveyard looks overcrowded, people must be dying to get in there.",
            "Why did the scarecrow win an award?",
            "Why don't skeletons ever go trick or treating?",
            "What did the officer molecule say to the suspect molecule?",
            "Where do you learn to make ice cream?",
            "Want to hear a joke about paper?",
            "I used to hate facial hair, but then it grew on me.",
            "Why did the coffee file a police report?",
            "How many apples grow on a tree?",
            "If prisoners could take their own mug shots, they'd be called cellfies.",
            "Last night I dreamt I was a muffler, I woke up exhausted",
            "I'd liek to give a big shout out to all the sidewalks for keeping me off the streets.",
            "Don't trust atoms, they make everything up.",
            "Man, when you have a bladder infection, Urine trouble.",
            "How do you organize a space party?",
            "Two guys walk into a bar, the third guy ducks.",
            "What do you call a cow with no legs?",
            "You hear about the new broom?",
            "Why do you smear peanut butter on the road?",
            "What do you call a fly without wings?",
            "What did the mountain climber name his son?",
            "Did you get a haircut?",
            "What do you call a Mexican who has lost his car?",
            "I would avoid the sushi if I was you, it's a little fishy.",
            "You know, people say they pick their nose, but I feel like I was just born with mine.",
            "What’s brown and sticky?",
            "Did you hear about the restaurant on the moon?",
            "This graveyard looks overcrowded. People must be dying to get in there.",
            "I don’t play soccer because I enjoy the sport. I’m just doing it for kicks.",
            "I keep trying to lose weight, but it keeps finding me.",
            "What did the ocean say to the shore?",
            "Without geometry life is pointless.",
            "Why did the octopus beat the shark in a fight?",
            "Why do scuba divers fall backwards into the water?",
            "I went to the zoo the other day, there was only one dog in it. It was a shitzu.",
            "I’m reading a book on the history of glue – can’t put it down.",
            "A Sandwich walks into a bar, the bartender says “Sorry, we don’t serve food here”"
    };

    private String mDadJokeAnswers[] = {
            "Because they're shellfish","","","Because he saw the salad dressing!","He wanted to see the waterfall.","He wanted to see the butterfly.",
            "He wanted to see time fly.","Cell Phones","A little horse","Bison","It was two tired","","Because he was outstanding in his field","Becaause they have no body to go with",
            "I've got my ion you","Sunday school","Nevermind, it's tearable","","It got mugged","All of them","","","","","","You planet","","Ground beef","It's sweeping the nation",
            "To go with the traffic jam!","A walk","Cliff","No I got them all cut","Carlos","","","A stick","Great food, no atmosphere","","","","Nothing, it just waved.","",
            "Because it was well armed","Because if they fell forwards they’d still be in the boat.","","",""

    };
    public String getDadJoke(int a){
        String dadJoke = mDadJoke[a];
        return dadJoke;
    }
    public String getDadJokeAnswer(int a){
        String dadJokeAnswer = mDadJokeAnswers[a];
        return dadJokeAnswer;
    }
    public int getDadJokeLibraryLength(){
        int dadJokeLibraryLength = mDadJoke.length;
        return dadJokeLibraryLength;
    }
    public int getRandomDadJokeNumber(){
        Random r = new Random();
        randoDadJokeNumber = r.nextInt(getDadJokeLibraryLength()-1)+1;
        return randoDadJokeNumber;
    }
}
