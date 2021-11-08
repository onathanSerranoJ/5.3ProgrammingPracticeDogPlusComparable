public class DogDriver
{
    public static void main (String[]args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepard", 45);
        Dog dog3 = new Dog("Rat", 7, "Old English Sheepdog", 76.4);

        System.out.println(dog2.compareTo(dog1));
        System.out.println(dog1.compareTo(dog3));
    }
}
