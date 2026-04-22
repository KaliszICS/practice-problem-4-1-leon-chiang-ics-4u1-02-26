class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColour;
    private String hairColour;

    public Person (String name, int age, int height, int weight, String eyeColour, String hairColour) {
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.eyeColour=eyeColour;
        this.hairColour=hairColour;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getHairColour(){
        return this.hairColour;
    }

    public String getEyeColour(){
        return this.eyeColour;
    }

}
