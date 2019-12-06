package id.kuliah.konekdatabase

class ApiEndPoint {

    companion object {

        private val SERVER = "http://192.168.1.22/phpkotlin/"
        val CREATE = SERVER+"create_fakultas.php"
        val READ = SERVER+"fakultas.php"
        val DELETE = SERVER+"delete_fakultas.php"
        val UPDATE = SERVER+"update_fakultas.php"
    }
}