# Kotlin ile Nesne Yönelimli Programlama (OOP) Temelleri

Bu proje, Kotlin programlama dilini kullanarak Nesne Yönelimli Programlama (OOP) kavramlarının temel prensiplerini göstermek amacıyla oluşturulmuş basit örnekler içermektedir.

##  Kapsanan OOP Konseptleri

Bu projedeki kodlar aşağıdaki temel OOP kavramlarını pratik etmeyi hedefler:

* **Sınıflar (Classes) ve Nesneler (Objects):** `User`, `Students`, `MyMath`, `NewUser`, `NewStudents` gibi farklı amaçlara hizmet eden sınıfların tanımlanması ve bu sınıflardan `Main.kt` içerisinde nesneler türetilmesi.
* **Özellikler (Properties) ve Metotlar (Functions):** Sınıflara ait değişkenlerin (örneğin `user_name`, `sayi_1`, `student_number`) ve işlevlerin (örneğin `showInfo()`, `toplama()`, `son_not()`) tanımlanması.
* **Kapsülleme (Encapsulation):** `User` sınıfında `user_name` özelliğinin `private` yapılarak `get` ve `set` metotları aracılığıyla kontrollü erişim sağlanması.
* **Kalıtım (Inheritance):** `Students` sınıfının `User` sınıfından, `NewStudents` sınıfının ise `NewUser` sınıfından özellik ve metotları miras alması (`:` operatörü).
* **Metot Ezme (Overriding):** Alt sınıfların (`Students`, `NewStudents`), miras aldıkları `showInfo()` gibi metotları `@override` anahtar kelimesiyle kendilerine özgü şekilde yeniden tanımlaması.
* **Soyut Sınıflar (Abstract Classes) ve Metotlar:** `NewUser` sınıfının `abstract` olarak tanımlanması ve `abstract fun newShowInfo()` gibi soyut bir metot içermesi. Bu, `NewUser`'dan türeyen sınıfların bu metodu *zorunlu olarak* kendilerinin implemente etmesini sağlar.

## Dosya Yapısı

* **`Main.kt`**: Programın ana giriş noktasıdır. Diğer sınıflardan nesneler oluşturulur ve metotları çağrılır. Konsol çıktıları burada gözlemlenir.
* **`User.kt`**: Temel kullanıcı bilgilerini (isim, soyisim, yaş) ve kapsülleme örneğini içeren ana sınıf.
* **`Students.kt`**: `User` sınıfından kalıtım alan, öğrenciye özgü ek bilgiler (numara, notlar) ve metotlar içeren alt sınıf.
* **`MyMath.kt`**: İki sayı üzerinde temel matematiksel işlemleri (toplama, çıkarma, çarpma, bölme) yapan basit bir sınıf.
* **`NewUser.kt`**: Soyut sınıf (abstract class) ve soyut metot kavramlarını göstermek için tasarlanmış bir üst sınıf.
* **`NewStudents.kt`**: Soyut `NewUser` sınıfından kalıtım alan ve soyut metodu implemente eden alt sınıf.

## Nasıl Çalıştırılır?

Bu proje bir konsol uygulamasıdır. Herhangi bir Kotlin destekleyen IDE (IntelliJ IDEA, Android Studio vb.) üzerinde projeyi açıp `Main.kt` dosyasını çalıştırarak (genellikle sağ tıklayıp "Run 'MainKt'") konsoldaki çıktıları görebilirsiniz.

## Öğrenme Hedefleri

Bu kodlar, Kotlin ile OOP'nin temel yapı taşlarını anlamak ve pratik yapmak için basit ve anlaşılır bir başlangıç noktası sunmayı amaçlamaktadır.
