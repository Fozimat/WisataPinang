package com.fozimat.wisatapinang

object WisataData {
    private val wisataNames = arrayOf("Bukit Pasir Busung",
        "Crystal Lagoon",
        "Danau Biru",
        "Pulau Dompak",
        "Laman Bunda",
        "Pulau Penyengat",
        "Pantai Sakera",
        "Pulau Senggarang",
        "Pantai Trikora",
        "Vihara 1000 Patung")

    private val wisataDetails = arrayOf("Bukit Pasir Busung adalah destinasi yang hits di Bintan, Kepualauan Riau. Bekas tambang ini jadi tempat foto yang ciamik.Bukit Pasir Busung bukan gurun pasir betulan. Dulu, ini bekas tambang bauksit bahkan diekspor keluar negeri. Tambang pasir itu kemudian dihentikan oleh daerah setempat sehingga tidak digunakan lagi dan dibiarkan begitu saja.Gundukan-gundukan pasir yang ada sebenarnya bukanlah pasir seperti di gurun, tetapi material seperti kerikil-kerikil kasar. Gundukan tersebut akan berkilau manakala cuaca cerah, sehingga menambah keeksotisan Bukit Pasir Busung.",
        "Objek wisata di Bintan selanjutnya ini bisa dibilang cukup membanggakan karena Crystal Lagoon menjadi kolam terbesar di Asia Tenggara yang dirancang bak laguna lengkap dengan tepian pantai yang bisa digunakan untuk bersantai sembari bermain air. Sedangkan pada bagian tengah dari kolam ini menjadi tempat untuk melakukan berbagai olahraga air yang seru seperti Boat Ride, Fly Board, atau Kayak.",
        "Meskipun bukan sebagai objek wisata, danau biru masih sering dikunjungi oleh wisatawan yang ingin menemukan tempat wisata yang sepi tanpa pengunjung. Pemandangannya indah dengan air kolam berwarna biru muda terang. Di sekelilingnya Anda akan mendapati gumuk pasir berwarna putih bersih. Danau Biru merupakan bekas tambang galian yang penambangannya masih dilakukan hingga sekarang, tidak jauh dari Danau Biru.",
        "Pulau ini merupakan wisata menarik yang memiliki kisah sejarah begitu beragam. Dinamakan pulau Dompak yang berarti perampok. Mereka bersembunyi disini dulunya pada saat sebelum Kemerdekaan RI. Versi lainnya mengatakan pulau Dompak dulunya telah dihuni oleh etnis Tionghoa lalu menjadi tempat peristirahatan para perompak sehingga dijuluki Pulau Dompak. Pulau Dompak lalu dijadikan kunjungan wisata baik lokal maupun luar kota. Pulau ini juga dijadikan pusat pemerintahan. Pembangunan kota di pulau ini amat pesat. Telah dilakukan pembangunan GOR sehingga warga kini bisa melakukan aktivitas berolahraga.",
        "Tempat wisata ini merupakan daerah pesisir Tanjung Pinang yang berada di pinggir laut. Jika Anda mengunjungi tempat ini, Anda bisa langsung berhadapan dengan ombak laut Samudera Hindia. Selain menikmati deburan ombak, Anda bisa menikmati matahari terbenam yang indah. Sambil melihat panorama, jangan lupa mencicipi kuliner di pinggiran pantainya. Terdapat berbagai spot foto menarik untuk Anda pecinta fotografi. Disini juga terdapat monument Gonggong Raksasa. Beberapa hal unik dari tempat wisata ini yakni memiliki corak warna kuning pada cangkangnya. Disini, Anda bisa menemukan taman untuk bersantai serta permainan lampu yang asik. Lokasi ini tepat digunakan sebagai tempat swafoto. Bangunan monumen ini terdiri dari 2 lantai. Pada lantai bawah, Anda dapat membeli oleh-oleh khas Tanjung Pinang. Jika berminat, Anda dapat mengujungi monumen ini.",
        "Masuk dalam jajaran calon situs warisan oleh UNESCO, Pulau Penyengat juga menjadi objek wisata andalah Tanjung Pinang. Terletak di tengah laut, Anda harus menyewa perahu ataupun mengikuti paket tur untuk bisa sampai ke Pulau Penyengat. Disana Anda akan menemukan banyak peninggalan yang berasal dari berbagai pemerintahan yang dulunya berkuasa di Pulau Penyengat, diantaranya Kesultanan Johor, Siak, Lingga, Pahang, hingga Kesultann Riau itu sendiri.",
        "Pantai favorit yang menjadi objek wisata di Bintan ini selalu ramai dan penuh di akhir pekan dan hari libur. Tidak hanya wisatawan lokal maupun luar daerah, Anda juga akan kerap mendapati turis asing hilir mudik di pantai ini.Di sepanjang pinggiran pantai, Anda akan menemukan berbagai penginapan dan pondok. Bila berkunjung di luar waktu liburan atau pada hari kerja, Anda bisa menikmati beberapa fasilitas disana secara percuma.",
        "Pulau ini merupakan pulau kecil di Bintan, Riau. Menariknya banyak bangunan rumah diatas air. Disini juga terdapat banyak situs-situs kelenteng yang konon didirikan 300 tahun lalu. Perjalanan menuju Pulau Senggarang hanya 30 menit dari kota Tanjung Pinang. Penduduk pulau ini mayoritas Tionghoa. Disini banyak patung dewa yang biasanya dijadikan sebagai lokasi berziarah para pengunjung. Dulunya, lokasi ini menjadi tempat singgah pertama kali imigran asal China. Maka dari itu, nuansa China begitu kental terasa. Wisata di Pulau Senggareng juga sudah terkenal hingga ke manca negara.",
        "Pantai yang terkenal karena keindahan alamnya yang eksotis ini juga merupakan objek wisata yang cukup populer di Tanjung Pinang. Seperti umumnya pantai di Belitung, Pantai Trikora memilik pasir putih yang cantik dan sebaran batu-batu granit di pesisirnya. Jangan khawatir tentang fasilitas, Anda bisa menemukan beragam hiburan menarik di pantai ini. Jika ingin menginap atau beristirahat, Anda bisa mampir ke resort maupun pondokkan kecil yang tersebar di sepanjang garis pantai.",
        "Bintan tidak hanya menyediakan berbagai wisata yang sangat menarik. Namun, di Bintan juga terdapat berbagai rumah-rumah ibadah dari beragam keyakinan di Indonesia. Di Bintan terdapat tempat ibadah yang paling unik yaitu Vihara Ksitigrabha Bodhisattva. Vihara ini lebih dikenal dengan sebutan Vihara Patung 1000 wajah. Disebut sebagai Vihara 1000 wajah, dikarenakan terdapat 500 patung murid Budha. Uniknya lagi setiap patung memiliki ekspresi yang berbeda dengan ukuran normal. Ketika menginjakkan kaki di Vihara ini, Anda akan merasa berada di negeri Tiongkok.Pada setiap patung yang terdapat di vihara ini, pada bagian bawah kakinya tertulis nama-nama mereka dari pahatan. Maka dari itu ketika anda ingin merencanakan datang ke wisata Bintan, pastikan tidak melewatkan vihara 1000 wajah ini. Tentunya Anda bisa mengabadikan setiap momen di Vihara ini, karena terdapat banyak spot foto.")

    private val wisataImages = intArrayOf(R.drawable.bukit,
        R.drawable.crystal,
        R.drawable.danau,
        R.drawable.dompak,
        R.drawable.laman,
        R.drawable.penyengat,
        R.drawable.sakera,
        R.drawable.senggarang,
        R.drawable.trikora,
        R.drawable.vihara)

    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.detail = wisataDetails[position]
                wisata.photo = wisataImages[position]
                list.add(wisata)
            }
            return list
        }
}