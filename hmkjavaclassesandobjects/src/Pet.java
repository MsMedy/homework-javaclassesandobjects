
import java.util.Scanner;
    public class Pet {
        // note: int is a primitive type, Integer is an Object with static methods
        // if run into issues with int, try using Integer

        private String name;
        private int age;
        private String location;
        private String type;

        //GETTERS
        public String getName() { //private information so using getters. location is not sensitive information so not included
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getType() {
            return type;
        }

        //SETTERS
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setType(String type) {
            this.type = type;
        }

        public void setLocation(String location) {
            this.location = location;
        }


        //CONSTRUCTORS (NOTE: constructors cannot have a return type, no void either)

        public Pet(String location) {
            this.location = location;

            Scanner input = new Scanner(System.in);
            System.out.println("We see that you are located in " + location + ". Please help us learn more about your" +
                    " pet by answering the following questions: ");

            System.out.println("What is your pet's name?");
            name = input.nextLine();
            setName(name);

            System.out.println("What is your pet's breed?");
            type = input.nextLine();

            System.out.println("What is your pet's age?");
            age = input.nextInt();

            System.out.println("Your location is:" + location);
            System.out.println("Your pet's name is:" + getName());
            System.out.println("Your pet's breed is:" + getType());
            System.out.println("Your pet's age is:" + getAge());

            Scanner input2 = new Scanner(System.in);
            System.out.println("Is this correct? (y/n)");

            String inputCorr = input2.nextLine(); // handle yes y no n NO YES answers
            String inputCorrLower = inputCorr.toLowerCase(); // fix this

            if (inputCorr.equals("y")) {
                System.out.println("Great. Your information has been saved.");
            } else if (inputCorr.equals("n")) {
                Scanner input3 = new Scanner(System.in);
                System.out.println("Was the breed, name, location, or age captured incorrectly? " +
                        "Please type breed, name, location, or age to answer.");

                String answer = input3.nextLine();

                if (answer.equals("breed")) {
                    Scanner input4 = new Scanner((System.in));
                    System.out.println("Please enter the correct breed:");

                    type = input4.nextLine();

                }
                if (answer.equals("breed")) {
                    Scanner input4 = new Scanner((System.in));
                    System.out.println("Please enter the correct breed:");

                    type = input4.nextLine();

                }
                if (answer.equals("location")) {
                    Scanner input7 = new Scanner((System.in));
                    System.out.println("Please enter the correct location:");

                    location = input7.nextLine();

                }
                if (answer.equals("age")) {
                    Scanner input6 = new Scanner((System.in));
                    System.out.println("Please enter the correct age of your pet:");

                    age = input6.nextInt();
                }

            }

            System.out.println("Your responses have been recorded. Please be sure to manually check for accuracy. Thank you.");
        }


        public Pet() {
            //System.in is the InputStream used to read input from terminal
            Scanner input = new Scanner(System.in);
            System.out.println("We have no information recorded about this pet. Please help us learn more about your" +
                    " pet by answering the following questions: ");

            System.out.println("Where are you located?");
            location = input.nextLine();
            setLocation(location);

            System.out.println("What is your pet's name?");
            name = input.nextLine();
            setName(name);

            System.out.println("What is your pet's breed?");
            type = input.nextLine();

            System.out.println("What is your pet's age?");
            age = input.nextInt();

            System.out.println("Your location is:" + location);
            System.out.println("Your pet's name is:" + getName());
            System.out.println("Your pet's breed is:" + getType());
            System.out.println("Your pet's age is:" + getAge());

            Scanner input2 = new Scanner(System.in);
            System.out.println("Is this correct? (y/n)");

            String inputCorr = input2.nextLine(); // handle yes y no n NO YES answers
            String inputCorrLower = inputCorr.toLowerCase(); // fix this

            if (inputCorr.equals("y")) {
                System.out.println("Great. Your information has been saved.");
            } else if (inputCorr.equals("n")) {
                Scanner input3 = new Scanner(System.in);
                System.out.println("Was the breed, name, or age captured incorrectly? " +
                        "Please type breed, name, or age to answer.");

                String answer = input3.nextLine();

                if (answer.equals("breed")) {
                    Scanner input4 = new Scanner((System.in));
                    System.out.println("Please enter the correct breed:");

                    type = input4.nextLine();

                }
                if (answer.equals("name")) {
                    Scanner input5 = new Scanner((System.in));
                    System.out.println("Please enter the correct name of your pet:");

                    name = input5.nextLine();

                }
                if (answer.equals("age")) {
                    Scanner input6 = new Scanner((System.in));
                    System.out.println("Please enter the correct age of your pet:");

                    age = input6.nextInt();
                }

            }

            System.out.println("Your responses have been recorded. Please be sure to manually check for accuracy. Thank you.");

        }


    }


