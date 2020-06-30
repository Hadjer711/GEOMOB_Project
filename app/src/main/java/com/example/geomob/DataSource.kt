package com.example.geomob

import com.example.geomob.BD.Pays

class DataSource{
    companion object{
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
                    "test",
                    R.raw.hymne_algerie,
                    1,
                    1,
                    1,
                    "test"
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
                    "test",
                    R.raw.hymne_tunisie,
                    1,
                    1,
                    1,
                    "test"
                )

            )

            list.add(
                Pays(
                    4,
                    "Espagne",
                    "L'Espagne est un pays européen situé sur la péninsule ibérique et comprenant 17 régions autonomes à la géographie et aux cultures diverses. Madrid, la capitale, abrite le palais royal et le musée du Prado, où sont exposées les œuvres d'artistes européens.",
                    "https://www.eclacpos.org/wp-content/uploads/2019/03/drapeau_espagne_hd.png",
                    505990F,
                    46940000,
                    "test",
                    R.raw.hymne_espagne,
                    1,
                    1,
                    1,
                    "test"
                )

            )
            list.add(
                Pays(
                    5,
                    "Liban",
                    "Le Liban, en forme longue la République libanaise, est un pays du Proche-Orient. En grande partie montagneux, il partage ses frontières avec la Syrie au nord et à l'est sur 376 km, Israël au sud sur 79 km et, au large de ses 220 km de côtes dans le bassin levantin à l'ouest, avec Chypre. Beyrouth en est la capitale. ",
                    "https://www.romepratique.com/wp-content/uploads/2013/06/Drapeau-Liban-min.jpg",
                    10452F,
                    6849000,
                    "test",
                    R.raw.hymne_liban,
                    1,
                    1,
                    1,
                    "test"
                )

            )
            list.add(
                Pays(
                    6,
                    "Chine",
                    "La Chine est un pays très peuplé d’Asie de l’est. Son territoire immense présente des paysages variés : prairies, déserts, montagnes, lacs, rivières et plus de 14 000 km de littoral. Pékin, la capitale à l’architecture moderne, conserve également des sites historiques, comme le palais de la Cité interdite et la place Tian Anmen. ",
                    "https://image.freepik.com/vecteurs-libre/drapeau-chine-dans-vent-partie-serie-agitant-drapeau-chine_126712-243.jpg",
                    9597000F,
                    1393000000,
                    "test",
                    R.raw.hymne_chine,
                    1,
                    1,
                    1,
                    "test"
                )



            )
            return list
        }

    }
}