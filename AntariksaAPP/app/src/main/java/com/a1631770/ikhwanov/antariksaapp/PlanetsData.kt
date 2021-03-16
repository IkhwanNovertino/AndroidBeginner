package com.a1631770.ikhwanov.antariksaapp

object PlanetsData {
  private val planetNames = arrayOf("Matahari", "Merkurius", "Venus", "Bumi", "Mars", "Jupiter",
      "Saturnus", "Uranus", "Neptunus", "Sabuk Asteroid", "Sabuk Kuiper")

  private val planetDetails = arrayOf("Matahari adalah bintang induk Tata Surya dan merupakan komponen utama sistem Tata surya kita. Bintang ini berukuran 332.830 massa bumi. Massa yang besar ini menyebabkan kepadatan inti yang cukup besar untuk bisa mendukung kesinambungan fusi nuklir dan menyemburkan sejumlah energi yang dahsyat." +
      "Kebanyakan energi ini dipancarkan ke luar angkasa dalam bentuk radiasi eletromagnetik, termasuk spektrum optik.",
      "merupakan planet terkecil di Tata surya dan terdekat dengan matahari. Jaraknya dengan matahari hanya 57,9 juta Km. Termasuk kategori terrestrial planet (planet kebumian) karena memiliki komposisi batuan dan logam. Disebut juga sebagai planet inferior, " +
          "karena letak jalur orbitnya berada diantara matahari dan bumi. Nama Merkurius sendiri diambil dari salah satu dewa mitologi Romawi",
      "merupakan planet kedua yang terdekat dengan matahari. Memiliki jarak 108 juta Km dengan matahari. Sama seperti Merkurius, planet ini juga merupakan planet inferior dan terrestrial planet. " +
          "Setelah Bulan, planet ini merupakan objek alami tercerah di langit malam, dengan magnitudo tampak sebesar −4,6 yang cukup cerah untuk menghasilkan bayangan. " +
          "Kecerahan maksimal planet ini dapat dilihat segera sebelum matahari terbit atau setelah matahari terbenam, sehingga disebut Bintang Fajar atau Bintang Senja. " +
          "Nama venus diambil dari dewi cinta dan kecantikan dalam mitologi yunani, yaitu dewi venus.",
      "Bumi, planet yang memiliki jarak 150 juta Km dari matahari adalah planet bagian dalam yang terbesar dan terpadat, satu-satunya yang diketahui memiliki aktivitas geologi dan " +
          "satu-satunya planet yang diketahui memiliki mahluk hidup. 70% bagian bumi ditutup oleh air sedangkan 30%bumi ditutupi oleh daratan. Hidrosfernya yang cair adalah khas di antara planet-planet kebumian " +
          "dan juga merupakan satu-satunya planet yang diamati memiliki lempeng tektonik. Atmosfer bumi sangat berbeda dibandingkan planet-planet lainnya, karena dipengaruhi oleh keberadaan mahluk hidup yang menghasilkan 21% oksigen. " +
          "Bumi memiliki satu satelit, bulan, satu-satunya satelit besar dari planet kebumian di dalam Tata Surya.",
      "Nama planet ini diambil dari dewa perang Romawi, dewa Mars. Planet ini memiliki atmosfer tipis yang kandungan utamanya adalah karbon dioksida. " +
          "Dijuluki planet merah karena pada permukaan tanahnya kaya akan zat besi. Di Mars berdiri Olympus Mons, gunung tertinggi di Tata Surya, " +
          "dan Valles Marineris, lembah terbesar di Tata Surya. Selain itu, di belahan utara terdapat cekungan Borealis yang meliputi 40% permukaan Mars. " +
          "Memiliki dua satelit alami kecil yaitu Deimos dan Fobos yang diduga merukan asteroid yang terjebak gaya gravitasi Mars.",
      "Merupakan planet terbesar di tata sutya kita. Berjarak sebesar 779 Juta Km dari matahari. Kandungan utamanya adalah hidrogen dan helium. " +
          "Sumber panas di dalam Jupiter menyebabkan timbulnya beberapa ciri semi-permanen pada atmosfernya, sebagai contoh pita pita awan dan Bintik Merah Raksasa. " +
          "Sejauh yang diketahui Jupiter memiliki 63 satelit. Empat yang terbesar, Ganimede, Kalisto, Io, dan Europa menampakan kemiripan dengan planet kebumian, seperti gunung berapi dan inti yang panas. " +
          "Ganimede, yang merupakan satelit terbesar di Tata Surya, berukuran lebih besar dari Merkurius.",
      "Saturnus (1.430 Juta Km dari matahari) dikenal dengan sistem cincinnya, memiliki beberapa kesamaan dengan Jupiter, " +
          "sebagai contoh komposisi atmosfernya. Meskipun Saturnus sebesar 60% volume Jupiter, planet ini hanya memiliki massa kurang dari sepertiga Jupiter " +
          "atau 95 kali massa bumi, membuat planet ini sebuah planet yang paling tidak padat di Tata Surya. Saturnus memiliki 60 satelit yang diketahui sejauh ini, " +
          "dua di antaranya Titan dan Enceladus, menunjukan aktivitas geologis, meski hampir terdiri hanya dari es saja.",
      "Uranus menjadi planet ketujuh di sistem tata surya kita dan menjadi satu - satunya planet yang namanya diambil dari dewa mitologi yunani yaitu dewa Ouranos. " +
          "Komposisi Uranus serupa dengan Neptunus, dan keduanya mempunyai komposisi kimiawi yang berbeda dari raksasa gas yang lebih besar, Jupiter dan Saturnus. " +
          "Karenanya, para astronom sering menempatkan Uranus dan Neptunus dalam kategori \"raksasa es\" untuk membedakan keduanya dari raksasa gas. " +
          "Atmosfer Uranus serupa dengan Jupiter dan Saturnus karena kandungan utamanya adalah hidrogen dan helium, tetapi mengandung lebih banyak unsur \"es\" seperti air, amonia dan metana, bersama dengan sisa hidrokarbon. " +
          "Uranus memiliki 27 satelit yang diketahui, yang terbesar adalah Titania, Oberon, Umbriel, Ariel dan Miranda.",
      "Planet yang namanya diambil dari dewa lautan Romawi ini merupakan planet terjauh dari matahari yang berjarak 49.530 Juta Km. Komposisi penyusun planet ini mirip dengan Uranus, " +
          "dan komposisi keduanya berbeda dari raksasa gas Jupiter dan Saturnus. Atmosfer Neptunus mengandung hidrogen, helium, hidrokarbon, " +
          "kemungkinan nitrogen, dan kandungan \"es\" yang besar seperti es air, amonia, dan metana. " +
          "Astronom kadang-kadang mengategorikan Uranus dan Neptunus sebagai \"raksasa es\" untuk menekankan perbedaannya. Neptunus memiliki 13 satelit yang diketahui. " +
          "Yang terbesar, Triton, geologinya aktif, dan memiliki geyser nitrogen cair. Triton adalah satu-satunya satelit besar yang orbitnya terbalik arah (retrograde).",
      "merupakan bagian dari tata surya yang terletak diantara Mars dan Jupiter. obyek yang terdiri atas batuan dan mineral logam beku ini, " +
          "diduga merupakan sisa dari bahan formasi Tata Surya yang gagal menggumpal karena pengaruh gravitasi dari Jupiter. " +
          "Akan tetapi, pada sabuk asteroid ini juga terdapat planet katai (planet kurcaci) yaitu Ceres. Tak cuma itu, ada juga Vesta dan Hygiea. " +
          "Meskipun keduanya belum terklasifikasi sebagai planet katai.",
      "Bisa dikatakan sebagai bagian terluar dari Tata Surya dan lebih jauh dari planet Neptunus. Sabuk kuiper mirip dengan sabuk asteroid, " +
          "hanya saja komposisi utamanya bukan batuan atau mineral logam tetapi es. Meski demikian, pada sabuk kuiper ini terdapat beberapa planet katai " +
          "diantara Pluto, Charos, haumea, dan Makemake. Beberapa objek Kuiper yang terbesar, seperti Quaoar, Varuna, dan Orcus, mungkin juga akan diklasifikasikan sebagai planet katai.")

  private val planetImages = intArrayOf(R.drawable.matahari, R.drawable.merkurius,
      R.drawable.venus, R.drawable.bumi, R.drawable.mars, R.drawable.jupiter, R.drawable.saturnus,
      R.drawable.uranus, R.drawable.neptunus, R.drawable.sabuk_asteroid, R.drawable.sabuk_kuiper)

  val listData: ArrayList<Planet>
    get() {
      val list = arrayListOf<Planet>()
      for (position in planetNames.indices) {
        val planet = Planet()
        planet.name = planetNames[position]
        planet.detail = planetDetails[position]
        planet.photo = planetImages[position]
        list.add(planet)
      }

      return list
    }
}