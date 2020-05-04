package com.aslaanmedya.softwaredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {

    private val dictArray = HashMap<String, String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dictArray.run {
            casePut("C#", "Programming Language")
            casePut("PHP", "Programming Language")
            casePut("API", "\"Application Programming Interface\"in kısaltılmışı olan API, başkalarının yazdığı programların, kodların ve hizmetlerin belirli işlevlerine ulaşmanızı sağlayan fonksiyonlardır. ")
            casePut("Activity", "Türkçe’de aktivite olarak karşılık bulan Activity’nin Android tanımı biraz daha farklı. Uygulamada ekran veya menü olarak belirtilen Activity, S Planlayıcısı, Telefon, İletişim gibi uygulamaları adlandırırken kullanılıyor.")
            casePut("APK", "Kullanıcıların en çok karşılaştığı kısaltmalardan biri olan APK Android application package anlamına geliyor. Android uygulama paketi. Android kurulum dosyası da bir değer tanımı. Windows’ta .exe uzantılarının çalışma mantığıyla benzerlik taşıyor.")
            casePut("APP", "Uygulama yani “Application”ın kısaltması. Yazılım programıdır. Bir takım görevler sergilemesi için kullanılır ve mobil platformlar için geliştilir.")
            casePut("Emulator", "Yerel olmayan uygulama ve oyunların farklı bir işletim sisteminde çalışmasını sağlayan yazılımdır. Bluestacks ve Genymotions emülatörlere örnektir.")
            casePut("Kitkat", "Android 4.4 ve 4.4.4 versiyonlarıdır. Telefonlarda ilk defa 31 Ekim 2013Wte kullanıldı.")
            casePut("Lock Screen", "Cihazınızı yanlışlıkla telefonun açılması veya başkalarının erişmesini önleme aracılığıyla koruyan ekrandır. Genellikle telefon güvenliğini sağlamak için desen, pin ya da şifre konulur.")
            casePut("ROM", "Mevcut işletim sisteminin versiyonunun düşürülmesi veya özelleştirilmiş ROM ile sistemin modifiye edilmesidir.")
            casePut("Python", "Programming Language")
            casePut("Access", "Erişim / Erişmek anlamına gelmektedir.")
            casePut("Zip Code", "Posta kodu")
            casePut("PhotoShop", "Software that is use for photos")
            casePut("Baseband", "Telefonunuzun kablosuz bağlantıları yöneten bileşenine baseband (ana bant) deniyor.")
            casePut("Material Design", "Google, Android Lollipop'la birlikte Android'e yeni bir görünüm kazandırdı. Material Design adındaki bu görünüm, grafiksel öğeleri ve akıcılığı öne çıkarıyor.")
            casePut("Nexus", "Google, modifiye edilmemiş Android sürümüyle satılan, kendi kontrolü altında geliştirilen telefonları için Nexus markasını kullanıyor. Nexus'lar, Android güncellemelerini direkt olarak Google'dan, diğer üreticilere göre haftalar ve bazen aylar önce alıyorlar.")
            casePut("App", "Uygulama")
            casePut("Layout", "Projenizin ön yüzünü tasarlamanız için kullanılır.")
            casePut("Java", "Java, Sun Microsystems mühendislerinden James Gosling tarafından geliştirilmeye başlanmış açık kodlu, nesneye yönelik, zeminden bağımsız, yüksek verimli, çok işlevli, yüksek seviye, adım adım işletilen bir dildir.")
            casePut("Kotlin", "Kotlin, Java sanal makinesi üzerinde çalışan ve ayrıca JavaScript kaynak koduna derlenebilir, statik tipli bir programlama dilidir. İlk geliştirme Saint Petersburg, Rusya merkezli JetBrains programcıları tarafından yapılmıştır. İsmi Kotlin Adası'ndan gelmektedir. ")
            casePut("Swift", "Swift, Apple tarafından iOS ve macOS platformlarına iOS ve Mac uygulamaları geliştirmek için oluşturulan, derlenerek çalışan güçlü ve kullanımı kolay, nesne yönelimli bir programlama dili. İlk olarak WWDC 2014 konferansında duyrulmuştur.")
            casePut("Code Editors", "Kod Editörleri Ör:SublimeText vb.")
        }

        temizle.setOnClickListener{findInDictionary.setText("")}
    }
    fun showResult(view: View){
        if(!findInDictionary.text.isNullOrEmpty()) {
            val result = findInDictionary.text.toString().toLowerCase(Locale.ROOT)
            if (dictArray.containsKey(result)) {
                resultText.text = String.format("Aradığınız sonuç: \n\n %s", dictArray[result])
            } else {
                resultText.text = "Sonuç Bulunamadı !"
            }
        }
    }
    fun HashMap<String, String>.casePut(content : String, value : String): String? {
        return this.put(content.toLowerCase(Locale.ROOT), value)
    }
}
