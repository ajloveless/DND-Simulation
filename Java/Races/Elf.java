package Races;

public class Elf extends Race
{

	String[] nm1 = {"Abarat", "Adamar", "Adorellan", "Adresin", "Aelrindel", "Aerendyl", "Aeson", "Afamrail", "Agandaur", "Agis", "Aias", "Aiduin", "Aien", "Ailas", "Ailduin", "Ailen", "Ailluin", "Ailmar", "Ailmer", "Ailmon", "Ailre", "Ailred", "Ailuin", "Ailwin", "Aimar", "Aimer", "Aimon", "Airdan", "Aire", "Aired", "Aithlin", "Aiwin", "Akkar", "Alabyran", "Alaion", "Alas", "Alen", "Alinar", "Alluin", "Almar", "Almer", "Almon", "Alok", "Alosrin", "Alre", "Alred", "Althidon", "Alwin", "Amrynn", "Andrathath", "Anfalen", "Anlyth", "Aolis", "Aquilan", "Arathorn", "Arbane", "Arbelladon", "Ardreth", "Ardryll", "Arel", "Arlen", "Arun", "Ascal", "Athtar", "Aubron", "Aumanas", "Aumrauth", "Avourel", "Ayas", "Ayduin", "Ayen", "Ayluin", "Aymar", "Aymer", "Aymon", "Ayre", "Ayred", "Aywin", "Belanor", "Beldroth", "Bellas", "Beluar", "Biafyndar", "Bialaer", "Braern", "Cailu", "Camus", "Castien", "Chathanglas", "Cohnal", "Conall", "Connak", "Cornaith", "Corym", "Cyran", "Dain", "Dakath", "Dalyor", "Darcassan", "Darfin", "Darthoridan", "Darunia", "Deldrach", "Delmuth", "Delsaran", "Devdan", "Drannor", "Druindar", "Durlan", "Durothil", "Dyffros", "Edwyrd", "Edyrm", "Ehlark", "Ehrendil", "Eilauver", "Elaith", "Elandorr", "Elas", "Elashor", "Elauthin", "Eldaerenth", "Eldar", "Eldrin", "Elduin", "Elen", "Elephon", "Elidyr", "Elion", "Elkhazel", "Ellisar", "Elluin", "Elmar", "Elmer", "Elmon", "Elnaril", "Elorshin", "Elpharae", "Elre", "Elred", "Eltaor", "Elwin", "Elyon", "Emmyth", "Entrydal", "Erendriel", "Eriladar", "Erlan", "Erlareo", "Erlathan", "Eroan", "Erolith", "Estelar", "Ethlando", "Ettrian", "Evindal", "Faelar", "Faelyn", "Faeranduil", "Falael", "Felaern", "Fenian", "Feno", "Feyrith", "Fhaornik", "Filarion", "Filvendor", "Filverel", "Flardryn", "Flinar", "Folas", "Folduin", "Folen", "Folluin", "Folmar", "Folmer", "Folmon", "Folre", "Folred", "Folwin", "Fylson", "Gaeleath", "Gaelin", "Galaeron", "Galan", "Galather", "Ganamede", "Gantar", "Garrik", "Garynnon", "Giullis", "Glanduil", "Glarald", "Glorandal", "Goras", "Gorduin", "Goren", "Gorluin", "Gormar", "Gormer", "Gormon", "Gorre", "Gorred", "Gorwin", "Grathgor", "Haemir", "Hagas", "Hagduin", "Hagen", "Hagluin", "Hagmar", "Hagmer", "Hagre", "Hagred", "Hagwin", "HaladaString[]", "Halafarin", "Halamar", "Haldir", "Halflar", "Halueth", "Halueve", "Hamon", "Haryk", "Hastios", "Hatharal", "Horith", "Hubys", "Iefyr", "Ievis", "Ilbryen", "Ilimitar", "Iliphar", "Illianaro", "Illithor", "Illitran", "Ilphas", "Ilrune", "Ilthuryn", "Ilvisar", "Inchel", "Inialos", "InteString[]", "Iolas", "Iolrath", "Itham", "IString[]an", "Ivasaar", "Iymbryl", "Iyrandrar", "Jandar", "Jannalor", "Jaonos", "Jassin", "Jhaan", "Jhaartael", "Jhaeros", "Jonik", "Jorildyn", "Kailu", "Katar", "Katyr", "Kellam", "Kelvhan", "Kendel", "Kerym", "Keryth", "Kesefeon", "Kharis", "Khatar", "Khidell", "Khiiral", "Khilseith", "Khuumal", "Khyrmin", "Kieran", "Kiirion", "Kindroth", "Kivessin", "Klaern", "KolString[]", "Kuskyn", "Kymil", "Kyrenic", "Kyrtaar", "Laeroth", "Lafarallin", "Laiex", "Lamruil", "Larongar", "Larrel", "Lathai", "Lathlaeril", "Lhoris", "Lianthorn", "Llarm", "Llewel", "Lorsan", "Luirlan", "Luthais", "Luvon", "Lyari", "Lyklor", "Lysanthir", "Maeral", "Maiele", "Malgath", "Malon", "Maradeim", "Marikoth", "Marlevaur", "Melandrach", "Merellien", "Merith", "Methild", "Mhaenal", "Mitalar", "Mihangyl", "Miirphys", "Mirthal", "Mlartlar", "Mnementh", "Morthil", "Myrdin", "Myriil", "Myrin", "Mythanar", "Naertho", "Naeryndam", "Naesala", "Narbeth", "Nardual", "Nasir", "NaString[]re", "Nelaeryn", "Neldor", "Neremyn", "Nesterin", "NeString[]th", "Nhamashal", "Nieven", "Nindrol", "Ninleyn", "Ninthalor", "Niossae", "Nuvian", "Nylian", "Nym", "Nyvorlas", "Olaurae", "Onas", "Oncith", "Onvyr", "Orist", "Ornthalas", "Orrian", "Orym", "Otaehryn", "Othorion", "Paeral", "Paeris", "Pelleas", "Phaendar", "Pharom", "Phraan", "Pirphal", "Purtham", "Pyrravyn", "Pywaln", "Qildor", "Raeran", "Raibyn", "Ralnor", "Ranaeril", "Rathal", "Reluraun", "Reluvethel", "Rennyn", "Reptar", "Respen", "Revalor", "Rhalyf", "Rhangyl", "Rhistel", "Rhothomir", "Rhys", "Rilitar", "Riluaneth", "Rolim", "Rothilion", "Ruehnar", "Ruith", "Ruvaen", "Ruven", "Ruvyn", "Rychell", "Rydel", "Ryfon", "Ryo", "Ryul", "Saelethil", "Saevel", "Saleh", "Samblar", "Sanev", "Scalanis", "Selanar", "Sharian", "Shaundyl", "Shyrrik", "Sihnion", "Silvyr", "Simimar", "Sinaht", "Siveril", "Sontar", "Sudryal", "Sundamar", "SylString[]", "Sythaeryn", "Taegen", "Taenaran", "Taeral", "Taerentym", "Taleasin", "Tamnaeth", "Tanithil", "Tannatar", "Tannivh", "Tannyll", "Tanyl", "Tanyth", "Taranath", "Tarathiel", "Taredd", "Tarron", "Tasar", "Tassarion", "Tathaln", "Thalanil", "Thallan", "Theodas", "Theodemar", "Theoden", "Theodluin", "Theodmer", "Theodmon", "Theodre", "Theodred", "Thuridan", "Tiarsus", "Tolith", "Tordynnar", "Toross", "Traeliorn", "TraString[]an", "Triandal", "Ualiar", "UeString[]eth", "Uldreyin", "Urdusin", "Usunaar", "Uthorim", "Vaalyun", "Vaeril", "Vamir", "String[]itan", "Velethuil", "Venali", "Vesryn", "Vesstan", "Virion", "Volodar", "Voron", "Vuduin", "Vulas", "Vulen", "Vulluin", "Vulmar", "Vulmer", "Vulmon", "Vulre", "Vulred", "Vulwin", "Wirenth", "Wistari", "Wyn", "Wyninn", "Wyrran", "Yalathanil", "Yesanith", "Yhendorn", "Ylyndar", "Zaos", "Zelphar", "Zeno", "Zhoron"};
	String[] nm2 = {"Aelrie", "Aelua", "Aelynthi", "Aenwyn", "Aerilaya", "Aerith", "Ahrendue", "Ahshala", "Aila", "Alagossa", "Alais", "Alanis", "Alasse", "AlaString[]a", "Alea", "Aleesia", "Alenia", "Aleratha", "Allannia", "Allisa", "Alloralla", "Allynna", "Almedha", "Almithara", "Alvaerelle", "Alyndra", "Amara", "Amaranthae", "Amarille", "Amedee", "Ameria", "Amisra", "Amnestria", "Amra", "Anarzee", "Aneirin", "Anhaern", "Annallee", "Ara", "Arasne", "Aravae", "Arcaena", "Ariawyn", "Arilemna", "Arlayna", "Arnarra", "Arryn", "Arthion", "Artin", "Ashera", "Ashryn", "Aurae", "Ava", "Axilya", "Ayda", "Ayla", "Azariah", "Baerinda", "Bellaluna", "Bemere", "Bonaluria", "Burolia", "Caeda", "Caerthynna", "Calarel", "Celaena", "Cellica", "Chaenath", "Chalia", "Chalsarda", "Chamylla", "Chandrelle", "Chasianna", "Ciliren", "Ciradyl", "Cithrel", "Clanire", "Cremia", "Daethie", "Daratrine", "Darshee", "Darunia", "Dasyra", "Delimira", "Delsanra", "Dessielle", "Deulara", "Dilya", "Dirue", "Ealirel", "Ecaeris", "Edea", "Edraele", "Eirina", "Elanalue", "Elanil", "Elasha", "Elenaril", "Eletha", "Elincia", "Elisen", "Eliyen", "Ellarian", "Elmyra", "Eloimaya", "Elora", "Elyon", "Ena", "Enania", "Eshenesra", "Esiyae", "Essaerae", "Esta", "Falenas", "Faraine", "Farryn", "Faunalyn", "Fayeth", "Faylen", "Fhaertala", "Filaurel", "Filauria", "Fildarae", "Finnea", "Gaelira", "Gaerradh", "Gaylia", "Geminara", "Ghilanna", "Glynnii", "Gweyir", "Gwynnestri", "Gylledhia", "Haciathra", "Haera", "Halaema", "Halanaestra", "Hamalitia", "Haramara", "Helartha", "Holone", "Huethea", "Hycis", "Ialantha", "Ikeshia", "Ildilyntra", "Ilmadia", "Ilsevel", "Ilyana", "Ilyrana", "Ilythyrra", "Imizael", "Immianthe", "Imra", "Imryll", "Ioelena", "Irhaal", "Isarrel", "Isilynor", "Ithronel", "Itireae", "Itylara", "Jastira", "Jeardra", "Jhaerithe", "Jhanandra", "Jhilsara", "Kali", "Kasula", "Kavrala", "Kaylessa", "Kaylin", "Keenor", "Keerla", "Keishara", "Kenia", "Kethryllia", "Keya", "Kilyn", "Kylantha", "Kythaela", "Laamtora", "Laerdya", "Lazziar", "Leena", "Leilatha", "Lenna", "Lensa", "Lethhonel", "Lierin", "Liluth", "Lithoniel", "Lixiss", "Llamiryl", "Llorva", "Loreleia", "Lura", "Lusha", "Lusserina", "Lyeecia", "Lyeneru", "Lymseia", "Lyndis", "Lyra", "Lyrei", "Lythienne", "Madris", "Maelyrra", "Maeralya", "Maescia", "Makaela", "Malonne", "Malruthiia", "Mariona", "Mathienne", "Maylin", "Meira", "Melarue", "Meorise", "Merethyl", "Merialeth", "Meriel", "Merlara", "Mhoryga", "Micaiah", "Minuvae", "Muelara", "Myantha", "Mylaela", "Mylaerla", "Myriani", "Myrrh", "Nabeora", "Naesala", "Naevys", "Naexi", "Nakiasha", "Nalaea", "Nambra", "Namys", "Nanthaliene", "Neia", "Nephinae", "Nimeroni", "Nimue", "Nithenoel", "Nithroel", "Nuala", "Nueleth", "Nuovis", "Nushala", "Nyana", "Nylathria", "Ochilysse", "Omylia", "Osonia", "Penelo", "Phaerille", "Phelorna", "Phinara", "Phyrra", "Pyria", "Qamara", "Radelia", "Raenisa", "Rallientha", "Rania", "Ratha", "Rathiain", "Renestrae", "Renna", "Rina", "Riniya", "Rophalin", "Rosanhi", "Rosaniya", "Roshia", "Rubarae", "Ryllae", "Saelihn", "Saida", "Sakaala", "Salihn", "Sana", "Saphielle", "Saria", "Sariandi", "Sarya", "Seldanna", "Selphie", "Selussa", "Shael", "Shaerra", "ShalaeString[]", "Shalana", "Shalendra", "Shalheira", "Shalia", "Shanaera", "Shandalar", "Shanyrria", "Shelara", "Shenarah", "Sillavana", "Sionia", "Siora", "Siphanien", "Siraye", "Solana", "Soliana", "Sorisana", "Sumina", "Syllia", "Sylmare", "Symania", "Syndra", "Syvis", "Taenya", "Talanashta", "Talindra", "Tanelia", "Tanila", "Tanulia", "Tarasynora", "Tehlarissa", "Tephysea", "Teriani", "Thaciona", "Thalia", "Thaola", "Thasinia", "Thessalia", "Tialha", "Tinesi", "Tiriana", "Tisha", "Tsarra", "Tyrael", "Ulesse", "Umilythe", "Uneathen", "Urricea", "Usamea", "Vaeri", "Valindra", "Vanya", "Vasati", "Velatha", "Verrona", "Vestele", "Vianola", "Viessa", "Wynather", "Yaereene", "Yalanue", "Yathanae", "Ygannea", "Ynaselle", "Yralissa", "Yrathea", "Yrneha", "Ysildea", "Yumanea", "Yunaesa", "Zaleria", "Zentha", "Zestari", "Zilyana"};
	String[] nm3 = {"Ad", "Ae", "Ara", "Bal", "Bei", "Bi", "Bry", "Cai", "Car", "Chae", "Cra", "Da", "Dae", "Dor", "Eil", "El", "Ela", "En", "Er", "Fa", "Fae", "Far", "Fen", "Gen", "Gil", "Glyn", "Gre", "Hei", "Hele", "Her", "Hola", "Ian", "Iar", "Ili", "Ina", "Jo", "Kea", "Kel", "Key", "Kris", "Leo", "Lia", "Lora", "Lu", "Mag", "Mia", "Mira", "Mor", "Nae", "Neri", "Nor", "Ola", "Olo", "Oma", "Ori", "Pa", "Per", "Pet", "Phi", "Pres", "Qi", "Qin", "Qui", "Ralo", "Rava", "Rey", "Ro", "Sar", "Sha", "Syl", "The", "Tor", "Tra", "Tris", "Ula", "Ume", "Uri", "Va", "Val", "Ven", "Vir", "Waes", "Wran", "Wyn", "Wysa", "Xil", "Xyr", "Yel", "Yes", "Yin", "Ylla", "Zin", "Zum", "Zyl"};
	String[] nm4 = {"balar", "banise", "bella", "beros", "can", "caryn", "ceran", "cyne", "dan", "di", "dithas", "dove", "faren", "fiel", "fina", "fir", "geiros", "gella", "golor", "gwyn", "hana", "harice", "hice", "horn", "jeon", "jor", "jyre", "kalyn", "kas", "kian", "krana", "lamin", "lana", "lar", "lee", "len", "leth", "lynn", "maer", "maris", "menor", "moira", "myar", "mys", "na", "nala", "nan", "neiros", "nelis", "norin", "peiros", "petor", "phine", "phyra", "qen", "qirelle", "quinal", "ra", "ralei", "ran", "rel", "ren", "ric", "rie", "rieth", "ris", "ro", "rona", "rora", "roris", "salor", "sandoral", "satra", "stina", "sys", "thana", "thyra", "toris", "tris", "tumal", "valur", "String[]is", "ven", "vyre", "warin", "wenys", "wraek", "wynn", "xalim", "xidor", "xina", "xisys", "yarus", "ydark", "ynore", "yra", "zana", "zeiros", "zorwyn", "zumin"};
	String[] nm5 = {"Adorellan", "Adresin", "Aelrindel", "Aenwyn", "Aerendyl", "Aerith", "Aien", "Ailen", "Ailre", "Aimer", "Aire", "Aithlin", "Alaion", "Alais", "Alanis", "Alasse", "Alosrin", "Amra", "Amrynn", "Aneirin", "Anfalen", "Anhaern", "Anlyth", "Arbane", "Ardreth", "Arel", "Ariawyn", "Arryn", "Arthion", "Artin", "Ashryn", "Aubron", "Avourel", "Axilya", "Ayen", "Aymer", "Ayre", "Aywin", "Azariah", "Bellas", "Bemere", "Bialaer", "Caeda", "Calarel", "Chaenath", "Ciliren", "Ciradyl", "Cithrel", "Cohnal", "Conall", "Cornaith", "Cyran", "Dain", "Darunia", "Ehlark", "Ehrendil", "Elaith", "Elandorr", "Elanil", "Elas", "Elauthin", "Eldaerenth", "Eldrin", "Elen", "Elidyr", "Elion", "Elisen", "Ellisar", "Elluin", "Elnaril", "Elpharae", "Elred", "Elyon", "Emmyth", "Erendriel", "Eroan", "Estelar", "Faelyn", "Falael", "Falenas", "Farryn", "Felaern", "Feno", "Filaurel", "Filverel", "Folen", "Folre", "Fylson", "Gaeleath", "Gaelin", "Gaerradh", "Galan", "Goras", "Goren", "Gweyir", "Haemir", "Halaema", "Halamar", "Haldir", "Halueth", "Halueve", "Hamon", "Horith", "Hycis", "Iefyr", "Ilbryen", "Iliphar", "Ilphas", "Imizael", "Inchel", "Irhaal", "Isarrel", "Isilynor", "Ithronel", "Ivasaar", "Jandar", "Jassin", "Jhaan", "Jorildyn", "Kailu", "Katar", "Keenor", "Kelvhan", "Kendel", "Keryth", "Kharis", "Khidell", "Khiiral", "Khyrmin", "Kilyn", "Kindreth", "Kymil", "Laeroth", "Larrel", "Lathlaeril", "Lazziar", "Lethonel", "Lhoris", "Lierin", "Llewel", "Lorsan", "Lyari", "Lysanthir", "Maeral", "Maiele", "Malon", "Malonne", "Merellien", "Meriel", "Merith", "Methild", "Micaiah", "Mirthal", "Mnementh", "Myrdin", "Myriil", "Myrin", "Myrrh", "Naesala", "Naevys", "Namys", "Narbeth", "Nasir", "NaString[]re", "Nelaeryn", "Neremyn", "Nesterin", "Nhamashal", "Nieven", "Nithenoel", "Nueleth", "Nuovis", "Nym", "Orym", "Paeral", "Paeris", "Pelleas", "Phraan", "Rathiain", "Rennyn", "Rhalyf", "Riluaneth", "Rolim", "Ruehnar", "Ruvaen", "Ruven", "Ruvyn", "Ryllae", "Ryo", "Saelethil", "Saelihn", "Saevel", "Saida", "Saleh", "Sanev", "Selanar", "ShalaeString[]", "Shandalar", "Sharian", "Sinaht", "Sylmare", "SylString[]", "Syvis", "Taenaran", "Taeral", "Tamnaeth", "Tanathil", "Tannatar", "Tannyll", "Tanyl", "Tanyth", "Taranth", "Tarathiel", "Thalanil", "Thallan", "Tyrael", "Uneathen", "Vaeril", "Vamir", "Venali", "Virion", "Vulen", "Vulmar", "Vulmer", "Vulwin", "Wirenth", "Wynather", "Yesanith", "Zeno"};


	public String nameGen(boolean isMale, String order)
	{
		String name;
        int rnd2 = (int) (Math.random() * nm3.length);
        int rnd3 = (int) (Math.random() * nm4.length);
        String nameLast = nm3[rnd2] + nm4[rnd3];
	    if (isMale) 
        {
            int rnd = (int) (Math.random() * nm2.length);
            name = nm2[rnd] + " " + nameLast;
        }
		else 
		{
            int rnd = (int) (Math.random() * nm1.length);
            name = nm1[rnd] + " " + nameLast;
        }
	    String[] fl = name.split(" ");
	    if (order.toLowerCase() == "first") return fl[0];
	    else if (order.toLowerCase() == "last") return fl[1];
	    else return "";
	}


}