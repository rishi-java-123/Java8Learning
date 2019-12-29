package java8.funtional.interfaces.playfultest;

import java.util.List;

@FunctionalInterface
interface PetMatcher
{
    List<Pets> match(Pets pet);
    default Pets first(Pets pet)
    {
        int index = Pets.petList.indexOf(pet);
        return index > -1? Pets.petList.get(index) : null;
    }
}
