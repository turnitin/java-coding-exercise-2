# Turnitin Problem Solving Exercise

Welcome! We're excited you've decided to talk with us about a position on our
engineering team.

The purpose of this exercise is so we can have a conversation about your
technical background and abilities. We think that asking you to code on a
whiteboard during an interview isn't a great way to have a conversation. And
even if we sit down and pair during an interview it's a higher pressure
situation than it could be.

Instead we ask that you read these instructions and do _at most_ a few hours of
work, on your time, to complete the exercise. During the interview we'll talk
about decisions you've made, the resulting application, and how you might
change it given different circumstances.

Below are two sections:

- _Instructions_: the problems we'd like you to solve along with expectations we
  have about your solution.
- _Logistics_: constraints around the problem, and how we'd like you to
  communicate your solution to us
  
# Instructions

Please solve the following two problems as described below using Java 11 preferably 
(or older versions if necessary).  Feel free to create classes,
structures, interfaces, or any other construct needed to solve this.  

## Sample Data

    PHRASES = {  
      { "1", ["afterward", "whenever", "however", "until", "as soon as", "as long as", "while", "again", "also", "besides"]},  
      { "2", ["therefore", "thus", "consequently", "as a result", "for this reason", "so", "so that", "accordingly", "because"]},  
      { "3", ["in addition to", "so", "moreover"]},
      { "4", ["in general", "for the most part", "as a general rule", "on the whole", "usually", "typically", "in summary"]}  
    }

    INPUT_TEXT = "Afterwards, soon yellow bird landed on the tall tree in addition to a lazy tortoise.  However, he had a " +
                 "read beak. In addition to white the patches on the wings, he was completely yellow. In summary, it was yellow bird. " +
                 "In summary, it did not sing."


## Problem 1
Get the frequencies of each phrase from PHRASES above, ie how many times the phrase appears in the text as described in INPUT_TEXT. 
Of course, it should be able to work with any text.

For example, If you were given the following:

    PHRASES  = {{ "1", ["until, "so", "usually"]}}
    INPUT_TEXT = "So, I have not seen this. So, usually, I don't follow all trends."

It will create the following output:

    frequencies:  "until":0, "so": 2, "usually":1

## Problem 2
Based on the phrases in PHRASES, create a unique vocabulary of phrases, and generate a vector that
represents the frequency of each phrase for the given text.


For example, if we have the following:

    PHRASES = {{"1", ["until, "so", "usually", "so"]}}
    INPUT_TEXT = "So, I have not seen this. So, usually, I don't follow all trends."

It will have the following output:

    vocabulary = ["so", "until", "usually"]
    vector = [2, 0, 1]

# Logistics

##1. Timeframe

You should take a max of three hours to complete this exercise. We want to be
both respectful of your time and fair to other candidates who might not have
a whole weekend to work on it.

##2. Git

You will need to use git for this exercise. To get these instructions and a
repo with test scripts do the following:

1. [Create a Github account](https://github.com/join) if you don't already have
   one. For the examples below we assume a user `pusheen`.
2. Clone our repository:

```
# Using ssh
$ git clone git@github.com:turnitin/java-coding-exercise-2.git

# Using https
$ git clone https://pusheen@github.com/turnitin/java-coding-exercise-2.git
```

##3. Remote

Once you are done you can put your solution in your own repository by adding it
as a remote and pushing to it.

1. Create a new repo via the github UI, let's assume you call it
   `java-coding-exercise-2` to mirror ours.
2. If possible use a private repo. If you've run out of private repos on github
   them no worries, we'd just like to make sure that every candidate's work is
   his or her own.
3. Add your repo as a remote and push:

```
$ git remote add myrepo git@github.com:pusheen/java-coding-exercise-2.git
$ git push myrepo master
```

##4. Access

Provide following users read access to your repository

- skumar-tii
- <>

##5. Notify us

At least a day before your in-person interview, email `skumar@turnitin.com`
your repo address.
