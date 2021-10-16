package com.example.recycleview_azhaara_06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val novelList = listOf<Novel>(
            Novel(
                R.drawable.novel_1,
                nameNovel = "Sebatas Mimpi",
                descNovel = "Nanti akan ada\n" +
                        "Seseorang yang hadir mengobati lukamu tanpa pernah kamu minta\n" +
                        "Seseorang yang membawa bahagia di tengah dukamu\n" +
                        "Seseorang yang memberimu tawa yang sempat hilang\n" +
                        "Seseorang yang memahamimu dan selalu ada untukmu\n" +
                        "\n" +
                        "Seseorang itu\n" +
                        "Mungkin saja bukan dia yang selama ini kamu mau\n" +
                        "Mungkin saja bukan seperti khayalanmu\n" +
                        "Atau, bisa jadi tak pernah kamu sangka-sangka sebelumnya\n" +
                        "Kamu ingat, Tuhan selalu memberikan yang kita butuh, bukan yang kita mau\n" +
                        "Kamu hanya harus percaya, bahwa saat itu akan ada\n" +
                        "Bukan hanya sebatas mimpi\n"
            ),

            Novel
            (
                R.drawable.novel_2,
                nameNovel = "Antares",
                descNovel = "Ini tentang Antares Sebastian Aldevaro si Iblis pencabut nyawa berwujud dewa dalam mitologi Yunani. Juga tentang Zeanne Queensha Bratadikara yang cantik tapi penuh teka-teki.\n" +
                        "\n" +
                        "Diawali cara pertemuan yang klise, membuat Zea secara terpaksa harus berurusan dengan Ares -ketua geng motor Calderioz. \n" +
                        "\n" +
                        "Sayangnya ini bukan cerita tentang ketua geng motor yang bertemu gadis lugu, polos, dan perhatian. Zea lebih dari sekadar itu. Dibalik wajah cantiknya, Zea menutup rapat sejuta rahasia yang tak terduga. Untukmu, dan untuk Antares."
            ),

            Novel(
                R.drawable.novel_3,
                nameNovel = "Misteri Cinta Guru Honorer",
                descNovel = "Misteri Cinta Guru Honorer lahir dari cerita dan pengalaman menjadi guru honorer. Novel ini sangat cocok menjadi bacaan ringan bagi siapa saja. Dan setelah membaca novel ini, jangan salah kalau pembaca bisa berimajinasi memiliki kisah cinta seperti Pak Ali dan Bu Mila. Ada misteri apakah di balik kisah cinta sang guru honorer tersebut? Selamat membaca."
            ),

            Novel(
                R.drawable.novel_4,
                nameNovel = "Gustira",
                descNovel = "Semua bermula dari gue yang sok-sok baik hati gantiin Sisy buat ketemu secret admirer-nya. Begitu ketemu di tempat parkir, lalu bilang ke cowok itu, “Maaf, Sisy nggak bisa ketemu,” eh malah berujung ke cowok itu nanya, “Nama kamu siapa?” Nama gue Ira. Dan sejak pertemuan itu, gue jadi dibayangi sosok paling nyebelin sesekolah: Gusti. Cowok ini aneh bin ajaib, nggak akan pernah deh elo nemu duanya. Kita nanya apa, dia jawab apa. Paling bete gue kalau muka Gusti udah nongol di depan muka. Mau jauhin juga susah, karena dia mendadak nempel terus berminggu-minggu. Anehnya, gue nggak usaha-usaha banget buat jauhin dia. Kalau gue sebel, harusnya gue kabur juga dong? Kok gue biarin dia terus datang ke hari-hari gue? Apa gue sebenernya suka sama dia?\n" +
                        "\n"
            ),

            Novel(
                R.drawable.novel_5,
                nameNovel = "INESTABLE",
                descNovel = "Inestable, sebuah novel fiksi yang menceritakan perjalanan cinta dua sejoli Nakula & Aluna yang menjalani LDR selama 3 bulan dan kemudian di pertemukan kembali di sebuah SMA favorit di Bandung. Hubungan mereka kembali indah dan harmonis. Namun karena sifat Nakula yang makin tidak menyenangkan membuat hubungan keduanya retak, ditambah dengan kehadiran sosok Aurel, cewek Amerika yang tiba-tiba masuk ke kehidupan Nakula membuat suasana hati Aluna berubah.\n"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_novel)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NovelAdapter(this, novelList){
            val intent = Intent(this, DetailNovelActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}