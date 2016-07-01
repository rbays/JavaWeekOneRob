package dayThree.FactoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class Programme {
    public static void main(String[] args){
        Dog myDog = DogFactory.makeDog(DogBreed.TERVUREN);
        Dog dog2 = DogFactory.makeDog(DogBreed.HUSKY);

        myDog.bark();
        dog2.bark();
        Husky dog22 = (Husky)dog2;
        dog22.speak();

    }
}
