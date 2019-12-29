package java8.funtional.interfaces.playfultest;

import java.util.ArrayList;
import java.util.List;

public class PlayFulTest {
	static void matchPet(String criteria, PetMatcher matcher, Pets pet) {
		System.out.println("\n" + criteria + ":");
		System.out.println("First: " + matcher.first(pet));
		System.out.println("All matches:");
		List<Pets> matches = matcher.match(pet);
		for (Pets p : matches)
			System.out.println(p);

	}

	public static void main(String[] args) {
		Pets.petList.add(new Pets("Scruffy", "dog", "poodle", "white", 895.00));
		Pets.petList.add(new Pets("Meow", "cat", "siamese", "white", 740.25));
		Pets.petList.add(new Pets("Max", "dog", "poodle", "black", 540.50));
		Pets.petList.add(new Pets("Cuddles", "dog", "pug", "black", 1282.75));
		Pets.petList.add(new Pets("Slider", "snake", "garden", "green", 320.00));

		PetMatcher breedMatcher = new PetMatcher() {

			@Override
			public List<Pets> match(Pets pet) {
				List<Pets> matches = new ArrayList<Pets>();

				for (Pets pets : pet.petList)
					if (pets.equals(pet))
						matches.add(pets);
				return matches;
			}
		};

		PetMatcher priceMatcher = new PetMatcher() {

			@Override
			public List<Pets> match(Pets pet) {
				List<Pets> matches = new ArrayList<>();
				for (Pets p : Pets.petList)
					if (p.price <= pet.price)
						matches.add(p);
				return matches;
			}

			@Override
			public Pets first(Pets pet) {
				int index = -1;
				for (Pets p : Pets.petList)
					if (p.price <= pet.price)
						return p;
				return null;
			}

		};

		matchPet("Poodles", breedMatcher, new Pets(null, "dog", "poodle", null, 0.0));
		matchPet("Pets for $800 or less", priceMatcher, new Pets(null, null, null, null, 800.0));
	}
}
