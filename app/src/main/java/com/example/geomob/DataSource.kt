package com.example.geomob

import com.example.geomob.BD.Historique
import com.example.geomob.BD.Pays
import com.example.geomob.BD.Personnalite
import com.example.geomob.BD.Ressource

class DataSource{
    companion object{
        fun createDataSetHistorique(): ArrayList<Historique>{
            val list = ArrayList<Historique>()
            list.add(
                Historique(
                    id = 1,
                    date = "1839",
                    description = "Abd el-Kader déclare la guerre à la France, considérant l’expédition aux « Portes de fer » (dans la chaîne des Bibans en Kabylie) par l’armée française comme une violation de traité",
                    pays = 1
                )

            )
            list.add(
                Historique(
                    id = 2,
                    date = "1er novembre 1954",
                    description = "après la réunion à Alger des six chefs du Front de libération nationale (Algérie) et anciens membres de l'Organisation spéciale, bras armé du Mouvement pour le triomphe des libertés démocratiques et aussi responsables du Comité révolutionnaire d'unité et d'action, et après la déclaration du 1er novembre 1954.",
                    pays = 1
                )

            )
            list.add(
                Historique(
                    id = 3,
                    date = "3 juillet 1962",
                    description = " Le 1er juillet 1962, les Algériens votent massivement pour l'indépendance (99,72 % en faveur du « oui »)139. L'indépendance de l'Algérie est proclamée le 3 juillet 1962.",
                    pays = 1
                )

            )
            list.add(
                Historique(
                    id = 4,
                    date = "Feverier 2019",
                    description = "debut du Hirak contre le 5eme Mandat",
                    pays = 1
                )

            )
            list.add(
                Historique(
                    id = 5,
                    date = "20 mars 1956",
                    description = "À l'indépendance, le 20 mars 1956, elle devient d'abord une monarchie constitutionnelle ayant pour souverain Lamine Bey",
                    pays = 2
                )

            )
            list.add(
                Historique(
                    id = 6,
                    date = "8 juin 1883",
                    description = "Le régime du protectorat est renforcé par les conventions de La Marsa du 8 juin 1883 qui accordent à la France le droit d'intervenir dans les affaires internes de la Tunisie. La France représente dès lors la Tunisie sur la scène internationale, et ne tarde pas à abuser de ses droits et prérogatives de protecteur pour exploiter le pays comme une colonie",
                    pays = 2
                )

            )
            list.add(
                Historique(
                    id = 7,
                    date = "1975",
                    description = "À la mort de Franco, en 1975, la monarchie est restaurée et Juan Carlos Ier, le nouveau roi, rétablit rapidement la démocratie représentative. L'adhésion aux Communautés européennes, qui était gelée sous la période de dictature, reprend et le pays intègre la Communauté économique européenne avec son voisin, le Portugal, le 1er janvier 1986",
                    pays = 3
                )

            )
            list.add(
                Historique(
                    id = 8,
                    date = "le 22 novembre 1943",
                    description = "Le pays déclare son indépendance le 22 novembre 1943, en gardant les frontières du Grand Liban de 1926, après des manifestations pendant plusieurs mois, dont émergent notamment les figures de Béchara el-Khoury et Riad El Solh et l'idée d'un Pacte national qui vise à consacrer un fonctionnement communautaire du système politique, où notamment la Présidence de la République serait laissée aux chrétiens, et le poste de Premier Ministre aux musulmans",
                    pays = 4
                )

            )
            list.add(
                Historique(
                    id = 9,
                    date = "Le 8 Mai 2008",
                    description = "Le conflit libanais de 2008 est une série d'affrontements armés de grande ampleur entre factions politiques pro-gouvernement et des factions politiques opposées. La crise éclate dans un contexte politique tendu, après qu'une paralyse politique de 18 mois dégénère hors de contrôle.",
                    pays = 4
                )

            )
            list.add(
                Historique(
                    id = 10,
                    date = " 1er octobre 1949",
                    description = " À la suite de la victoire militaire du Parti communiste chinois sur le Kuomintang qui s'est exilé à Taïwan avec le gouvernement de la république de Chine, la république populaire de Chine est proclamée le 1er octobre 1949. Elle se présente comme une « république socialiste »",
                    pays = 5
                )

            )
            list.add(
                Historique(
                    id = 11,
                    date = "décembre 1978",
                    description = "En décembre 1978, lors du XIe Comité central du Parti communiste chinois, les dirigeants chinois annoncent qu'ils encourageront les coopérations économiques avec les autres pays et chercheront à obtenir les techniques et équipements les plus avancés du monde",
                    pays = 5
                )

            )

            return list

        }
        fun createDataSetPersonnalite(): ArrayList<Personnalite>{
            val list = ArrayList<Personnalite>()
            list.add(
                Personnalite(
                    id=1,
                    nom = "l'Émir Abdelkader",
                    image = "https://i.ytimg.com/vi/MepA1vedaNs/hqdefault.jpg",
                    description = "Abdelkader ibn Muhieddine (en arabe : عبد القادر بن محي الدين (ʿAbd al-Qādir ibn Muḥyiddīn), aussi connu comme l'Émir Abdelkader, ou Abdelkader El Djezairi, né le 6 septembre 1808 à El Guettana, dans la Régence d'Alger, et mort le 26 mai 1883 à Damas, dans l'Empire ottoman, et plus précisément dans l'actuelle Syrie, est un émir, chef religieux et militaire algérien, qui mène une lutte contre la conquête de l'Algérie par la France au milieu du xixe siècle.\n" +
                            "\n",
                    lienWiki = "https://fr.wikipedia.org/wiki/Abdelkader_ibn_Muhieddine",
                    pays = 1
                )
            )
            list.add(
                Personnalite(
                    id=2,
                    nom = "Mohamed Larbi Ben M'hidi",
                    image = "https://www.elmoudjahid.com/temp/fr/actualite2[21107].jpg",
                    description = "Mohamed Larbi Ben M'hidi (en arabe : محمد العربي بن مهيدي, en berbère: Lɛrbi U M'hidi), né en 1923 à Aïn M'lila dans l'actuelle wilaya d'Oum El Bouaghi et mort assassiné en 1957 à Alger, est un militant nationaliste algérien, membre du PPA, puis du MTLD1, un des fondateurs du FLN en 1954, puis combattant pendant la guerre d'Algérie (1954-1962). Arrêté en février 1957, il est torturé, puis exécuté sans jugement par l'armée française durant la bataille d’Alger2,3.",
                    lienWiki = "https://fr.wikipedia.org/wiki/Larbi_Ben_M%27hidi",
                    pays = 1
                )
            )
            list.add(
                Personnalite(
                    id=3,
                    nom = "Kaïs Saïed",
                    image = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/President_Kais_Sa%C3%AFed.jpg/330px-President_Kais_Sa%C3%AFed.jpg",
                    description = "Kaïs Saïed (arabe : قيس سعيد), né le 22 février 1958 à Tunis, est un universitaire, juriste et homme d'État tunisien, spécialisé en droit constitutionnel, président de la République tunisienne depuis le 23 octobre 2019.\n" +
                            "\n" +
                            "Il est président de l'Association tunisienne de droit constitutionnel de 1995 à 2019. Candidat indépendant à l'élection présidentielle de 2019, il est élu face à Nabil Karoui au second tour.",
                    lienWiki = "https://fr.wikipedia.org/wiki/Ka%C3%AFs_Sa%C3%AFed",
                    pays = 2
                )
            )
            list.add(
                Personnalite(
                    id=4,
                    nom = "Pedro Sánchez",
                    image = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Pedro_S%C3%A1nchez_2020_%28portrait%29.jpg/330px-Pedro_S%C3%A1nchez_2020_%28portrait%29.jpg",
                    description = "Pedro Sánchez Pérez-Castejón [ˈpeðɾo ˈsant͡ʃeθ ˈpeɾeθ kasteˈxon]a est un homme d'État espagnol, né le 29 février 1972 à Madrid. Membre du Parti socialiste ouvrier espagnol (PSOE), il est président du gouvernement depuis le 2 juin 2018.",
                    lienWiki = "https://fr.wikipedia.org/wiki/Pedro_S%C3%A1nchez",
                    pays = 3
                )
            )
            list.add(
                Personnalite(
                    id=5,
                    nom = "Michel Aoun",
                    image = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/General_Michel_Aoun.jpg/330px-General_Michel_Aoun.jpg",
                    description = "Michel Naim Aoun (ميشال نعيم عون prononciation libanaise: [miˈʃaːl ʕawn, miˈʃɛl-, -ʕoːn]), né le 18 février 1935 à Haret Hreik, est un militaire et homme d'État libanais, président de la République depuis le 31 octobre 2016.",
                    lienWiki = "https://fr.wikipedia.org/wiki/Michel_Aoun",
                    pays = 4
                )
            )
            list.add(
                Personnalite(
                    id=6,
                    nom = "Xi Jinping",
                    image = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Xi_Jinping_in_2019_%28cropped%29.jpg/330px-Xi_Jinping_in_2019_%28cropped%29.jpg",
                    description = "Xi Jinping (chinois : 习近平 ; pinyin : xí jìnpíng [ɕǐ tɕînpʰǐŋ]a) est un homme d'État chinois né le 15 juin 1953 à Pékin. Il est l'actuel président de la république populaire de Chine.",
                    lienWiki = "https://fr.wikipedia.org/wiki/Xi_Jinping",
                    pays = 5
                )
            )

            list.add(
                Personnalite(
                    id=6,
                    nom = "Sun Yat-sen",
                    image = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/%E5%AD%99%E4%B8%AD%E5%B1%B1%E8%82%96%E5%83%8F.jpg/330px-%E5%AD%99%E4%B8%AD%E5%B1%B1%E8%82%96%E5%83%8F.jpg",
                    description = "Sun Yat-sen (chinois simplifié : 孙逸仙 ; chinois traditionnel : 孫逸仙 ; pinyin : sūn yìxiān ; cantonais Jyutping : syun¹ jat⁶sin¹ ; zhuyin : ㄙㄨㄣ 〡ˋ ㄒ〡ㄢ, Sun Yat-sen étant la prononciation en cantonais qui s'est exportée en Occident ; le nom se prononce Sūn Yìxiān en mandarin), plus connu en Chine sous son surnom Sun Zhongshan (en mandarin, chinois : 孙中山 / 孫中山, sūn zhōngshān, cantonais Jyutping : syun¹ zung¹saan¹, zhuyin : ㄙㄨㄣ ㄓㄨㄥ ㄕㄢ), également appelé Sun Wen (孫文), (12 novembre 1866 – 12 mars 1925) est un révolutionnaire et homme d'État chinois.",
                    lienWiki = "https://fr.wikipedia.org/wiki/Sun_Yat-sen",
                    pays = 5
                )
            )

            return list

        }
        fun createDataSetRessource(): ArrayList<Ressource>{
            val list = ArrayList<Ressource>()

            list.add(
                Ressource(
                    id=1,
                    nom="Petrole",
                    quantite = "45 milliards de tonnes",
                    pays = 1

                )
            )
            list.add(
                Ressource(
                    id=2,
                    nom="GAZ",
                    quantite = "4 504 000 000 000",
                    pays = 1

                )
            )
            list.add(
                Ressource(
                    id=3,
                    nom="phosphate",
                    quantite = "2,8 millions tonnes en 2018",
                    pays = 2

                )
            )
            list.add(
                Ressource(
                    id=4,
                    nom="",
                    quantite = "premier producteur mondial d'huile d'olive ;\n" +
                            "second producteur européen de coton ;\n" +
                            "troisième producteur européen de tabac.",
                    pays = 3

                )
            )
            list.add(
                Ressource(
                    id=5,
                    nom="forêts",
                    quantite = "8%",
                    pays = 4

                )
            )
            list.add(
                Ressource(
                    id=6,
                    nom="Énergie maritime",
                    quantite = "la capacité des marées est de 110 millions de kW, dont 21 millions sont exploitables et peuvent produire 58 milliards de kWh par an",
                    pays = 5

                )
            )
            list.add(
                Ressource(
                    id=7,
                    nom="Terre Arable",
                    quantite = "121,7759 millions d’hectares de terre labourée et 35,35 millions d’ha de terre en friche",
                    pays = 5

                )
            )

            return list

        }
        fun createDataSet(): ArrayList<Pays>{
            val list = ArrayList<Pays>()
            list.add(
                Pays(
                    1,
                    "Algerie",
                    "L'Algérie est un pays nord-africain doté d'un littoral sur la mer Méditerranée et d'un intérieur désertique, le Sahara. De nombreux empires y ont laissé leur marque, comme les anciennes ruines romaines de Tipasa, en bord de mer.",
                    "https://s.france24.com/media/display/4094bd32-1d8c-11ea-8f09-005056a98db9/w:1280/p:16x9/ECO%20ALG%20%20PHOTO%20PLEIN%20ECRAN%20ALGERIE.webp",
                    2382000F,
                    42230000,
                    1,
                    R.raw.hymne_algerie,

                    "https://fr.wikipedia.org/wiki/Alg%C3%A9rie",
                    "8d1ufOTT8oo,ZGsfmR-ZnkI,Pd1iee6M_d0"
                )

            )
            list.add(
                Pays(
                    2,
                    "Tunisie",
                    "La Tunisie est un pays d'Afrique du Nord situé sur la côte méditerranéenne et en bordure du désert du Sahara. Le musée national du Bardo à Tunis, la capitale, expose des pièces archéologiques allant des mosaïques romaines à l'art islamique ",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Tunisia.svg/1280px-Flag_of_Tunisia.svg.png",
                    163610F,
                    11570000,
                    2,
                    R.raw.hymne_tunisie,

                    "https://fr.wikipedia.org/wiki/Tunisie",
                    "GU-9Eo7JrL4,TPbPrsXfuU4,OxA9OmXYtEo"
                )

            )

            list.add(
                Pays(
                    3,
                    "Espagne",
                    "L'Espagne est un pays européen situé sur la péninsule ibérique et comprenant 17 régions autonomes à la géographie et aux cultures diverses. Madrid, la capitale, abrite le palais royal et le musée du Prado, où sont exposées les œuvres d'artistes européens.",
                    "https://www.eclacpos.org/wp-content/uploads/2019/03/drapeau_espagne_hd.png",
                    505990F,
                    46940000,
                    3,
                    R.raw.hymne_espagne,

                    "https://fr.wikipedia.org/wiki/Espagne",
                    "na0bVHjPW5A,JGz4Xacmkvw,aL4PLre3MpA"
                )

            )
            list.add(
                Pays(
                    4,
                    "Liban",
                    "Le Liban, en forme longue la République libanaise, est un pays du Proche-Orient. En grande partie montagneux, il partage ses frontières avec la Syrie au nord et à l'est sur 376 km, Israël au sud sur 79 km et, au large de ses 220 km de côtes dans le bassin levantin à l'ouest, avec Chypre. Beyrouth en est la capitale. ",
                    "https://www.romepratique.com/wp-content/uploads/2013/06/Drapeau-Liban-min.jpg",
                    10452F,
                    6849000,
                    4,
                    R.raw.hymne_liban,

                    "https://fr.wikipedia.org/wiki/Liban",
                    "ghjU_3L8ou0,FrOlmSPtnRw,ZMboBUeXkq0"
                )

            )
            list.add(
                Pays(
                    5,
                    "Chine",
                    "La Chine est un pays très peuplé d’Asie de l’est. Son territoire immense présente des paysages variés : prairies, déserts, montagnes, lacs, rivières et plus de 14 000 km de littoral. Pékin, la capitale à l’architecture moderne, conserve également des sites historiques, comme le palais de la Cité interdite et la place Tian Anmen. ",
                    "https://image.freepik.com/vecteurs-libre/drapeau-chine-dans-vent-partie-serie-agitant-drapeau-chine_126712-243.jpg",
                    9597000F,
                    1393000000,
                    5,
                    R.raw.hymne_chine,

                    "https://fr.wikipedia.org/wiki/Chine",
                    "5uCXTjd-qDM,8lIUuFtkO3A,RSYSJ2BTH7w"
                )



            )
            return list
        }

    }
}