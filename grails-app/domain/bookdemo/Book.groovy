package bookdemo

class Book {

    String title
    String author
    String name='Pravin'
    static constraints = {
        title nullable:false
    }
}
