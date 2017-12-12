package com.example.songt.bagoffunnies;

import java.util.Random;

/**
 * Created by songt on 2017-12-06.
 */

public class DadJokeLibrary {

    private int randoDadJokeNumber;

    private String mDadJoke[] = {
            "Why don't crabs give to charity? Because they're shellfish",
            "I got hit in the head with a can of Diet Coke today. Don't worry, I'm not hurt. It was a soft drink",
            "I don't trust stairs. They're always up to something.",
            "Why was the chef embarrassed? Because he saw the salad dressing!",
            "Why did the boy throw a bucket out the window? He wanted to see the waterfall.",
            "Why did the boy throw butter out the window? He wanted to see the butterfly.",
            "Why did the boy throw his watch out the window? He wanted to see time fly.",
            "What do prisoners use to call each other? Cell Phones.",
            "What do you call a pony with a sore throat? A little horse.",
            "What did the buffalo say to his son when he left for college? Bison.",
            "Why couldn't the bicycle stand up by itself? It was two tired.",
            "The graveyard looks overcrowded, people must be dying to get in there.",
            "Why did the scarecrow win an award? Because he was outstanding in his field.",
            "Why don't skeletons ever go trick or treating? Because they have no body to go with.",
            "What did the officer molecule say to the suspect molecule? I've got my ion you.",
            "Where do you learn to make ice cream? Sunday school.",
            "Want to hear a joke about paper? Never mind, it's tearable",
            "I used to hate facial hair, but then it grew on me.",
            "Why did the coffee file a police report? It got mugged.",
            "How many apples grow on a tree? All of them.",
            "If prisoners could take their own mug shots, they'd be called cellfies.",
            "Last night I dreamt I was a muffler, I woke up exhausted",
            "I'd like to give a big shout out to all the sidewalks for keeping me off the streets.",
            "Don't trust atoms, they make everything up.",
            "Man, when you have a bladder infection, Urine trouble.",
            "How do you organize a space party? You planet.",
            "Two guys walk into a bar, the third guy ducks.",
            "What do you call a cow with no legs? Ground beef.",
            "You hear about the new broom? It's sweeping the nation.",
            "Why do you smear peanut butter on the road? To go with the traffic jam!",
            "What do you call a fly without wings? A walk.",
            "What did the mountain climber name his son? Cliff.",
            "Did you get a haircut? No I got them all cut.",
            "What do you call a Mexican who has lost his car? Carlos.",
            "I would avoid the sushi if I was you, it's a little fishy.",
            "You know, people say they pick their nose, but I feel like I was just born with mine.",
            "What’s brown and sticky? A stick.",
            "Did you hear about the restaurant on the moon? Great food, no atmosphere.",
            "This graveyard looks overcrowded. People must be dying to get in there.",
            "I don’t play soccer because I enjoy the sport. I’m just doing it for kicks.",
            "I keep trying to lose weight, but it keeps finding me.",
            "What did the ocean say to the shore? Nothing, it just waved.",
            "Without geometry life is pointless.",
            "Why did the octopus beat the shark in a fight? Because it was well armed.",
            "Why do scuba divers fall backwards into the water? Because if they fell forwards, they’d still be in the boat.",
            "I went to the zoo the other day, there was only one dog in it. It was a shitzu.",
            "I’m reading a book on the history of glue – can’t put it down.",
            "A Sandwich walks into a bar, the bartender says “Sorry, we don’t serve food here”",
            "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away."
    };


    public String getDadJoke(int a){
        String dadJoke = mDadJoke[a];
        return dadJoke;
    }

    public int getDadJokeLibraryLength(){
        int dadJokeLibraryLength = mDadJoke.length;
        return dadJokeLibraryLength;
    }
}
