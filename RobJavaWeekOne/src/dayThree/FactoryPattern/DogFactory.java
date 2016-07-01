package dayThree.FactoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class DogFactory {
    public static Dog makeDog(DogBreed breed){
        Dog dog = null;
        switch (breed){
            case HUSKY:
                dog = new Husky();
                break;
            case TERVUREN:
                dog = new Tervuren();
                break;
        }
        return dog;
    }
}
