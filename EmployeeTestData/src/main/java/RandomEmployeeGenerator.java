import java.util.*;

public class RandomEmployeeGenerator {
	private static final Random rand = new Random();

	// data gens
	private static final List<String> firstnames_boy = Arrays.asList(
			"Wade","Dave","Seth","Ivan","Riley","Gilbert","Jorge","Dan","Brian","Roberto","Ramon","Miles","Liam","Nathaniel","Ethan","Lewis","Milton","Claude","Joshua","Glen","Harvey","Blake","Antonio","Connor","Julian","Aidan","Harold","Conner","Peter","Hunter","Eli","Alberto","Carlos","Shane","Aaron","Marlin","Paul","Ricardo","Hector","Alexis","Adrian","Kingston","Douglas","Gerald","Joey","Johnny","Charlie","Scott","Martin","Tristin","Troy","Tommy","Rick","Victor","Jessie","Neil","Ted","Nick","Wiley","Morris","Clark","Stuart","Orlando","Keith","Marion","Marshall","Noel","Everett","Romeo","Sebastian","Stefan","Robin","Clarence","Sandy","Ernest","Samuel","Benjamin","Luka","Fred","Albert","Greyson","Terry","Cedric","Joe","Paul","George","Bruce","Christopher","Mark","Ron","Craig","Philip","Jimmy","Arthur","Jaime","Perry","Harold","Jerry","Shawn","Walter"
	);
	private static final List<String> lastnames = Arrays.asList(
			"Williams","Harris","Thomas","Robinson","Walker","Scott","Nelson","Mitchell","Morgan","Cooper","Howard","Davis","Miller","Martin","Smith","Anderson","White","Perry","Clark","Richards","Wheeler","Warburton","Stanley","Holland","Terry","Shelton","Miles","Lucas","Fletcher","Parks","Norris","Guzman","Daniel","Newton","Potter","Francis","Erickson","Norman","Moody","Lindsey","Gross","Sherman","Simon","Jones","Brown","Garcia","Rodriguez","Lee","Young","Hall","Allen","Lopez","Green","Gonzalez","Baker","Adams","Perez","Campbell","Shaw","Gordon","Burns","Warren","Long","Mcdonald","Gibson","Ellis","Fisher","Reynolds","Jordan","Hamilton","Ford","Graham","Griffin","Russell","Foster","Butler","Simmons","Flores","Bennett","Sanders","Hughes","Bryant","Patterson","Matthews","Jenkins","Watkins","Ward","Murphy","Bailey","Bell","Cox","Martinez","Evans","Rivera","Peterson","Gomez","Murray","Tucker","Hicks","Crawford","Mason","Rice","Black","Knight","Arnold","Wagner","Mosby","Ramirez","Coleman","Powell","Singh","Patel","Wood","Wright","Stephens","Eriksen","Cook","Roberts","Holmes","Kennedy","Saunders","Fisher","Hunter","Reid","Stewart","Carter","Phillips","Spencer","Howell","Alvarez","Little","Jacobs","Foreman","Knowles","Meadows","Richmond","Valentine","Dudley","Woodward","Weasley","Livingston","Sheppard","Kimmel","Noble","Leach","Gentry","Lara","Pace","Trujillo","Grant"
	);

	private static final List<String> firstnames_girl = Arrays.asList(
			"Daisy","Deborah","Isabel","Stella","Debra","Beverly","Vera","Angela","Lucy","Lauren","Janet","Loretta","Tracey","Beatrice","Sabrina","Melody","Chrysta","Christina","Vicki","Molly","Alison","Miranda","Stephanie","Leona","Katrina","Mila","Teresa","Gabriela","Ashley","Nicole","Valentina","Rose","Juliana","Alice","Kathie","Gloria","Luna","Phoebe","Angelique","Graciela","Gemma","Katelynn","Danna","Luisa","Julie","Olive","Carolina","Harmony","Hanna","Anabelle","Francesca","Whitney","Skyla","Nathalie","Sophie","Hannah","Silvia","Sophia","Della","Myra","Blanca","Bethany","Robyn","Traci","Desiree","Laverne","Patricia","Alberta","Lynda","Cara","Brandi","Janessa","Claudia","Rosa","Sandra","Eunice","Kayla","Kathryn","Rosie","Monique","Maggie","Hope","Alexia","Lucille","Odessa","Amanda","Kimberly","Blanche","Tyra","Helena","Kayleigh","Lucia","Janine","Maribel","Camille","Alisa","Vivian","Lesley","Rachelle","Kianna"
	);

	private static final List<String> genders = Arrays.asList("male", "female");

	private static long doj_start_epoc_mili = 800117941000L;
	private static long doj_end_epoc_mili = 1620658741000L;

	private static long dob_start_epoc_mili = 87577639000L;
	private static long dob_end_epoc_mili = 340038439000L;

	public static Employee randomEmployee() {
		Employee e = new Employee();
		UUID uuid=UUID.randomUUID();
		e.set_id(uuid.toString());
		e.setGender(
				genders.get(rand.nextInt(genders.size()))
		);
		if(e.getGender().equals("male")) e.setFirstname(firstnames_boy.get(rand.nextInt(firstnames_boy.size())));
		else e.setFirstname(firstnames_girl.get(rand.nextInt(firstnames_girl.size())));
		e.setLastname(lastnames.get(rand.nextInt(lastnames.size())));
		e.setDoj(new Date(nextRandInt(doj_start_epoc_mili, doj_end_epoc_mili)));
		e.setDob(new Date(nextRandInt(dob_start_epoc_mili, dob_end_epoc_mili)));
		return e;
	}

	public static long nextRandInt(long startInclusive, long endExclusive)	{
		return  startInclusive + rand.nextLong(endExclusive - startInclusive);
	}
}
