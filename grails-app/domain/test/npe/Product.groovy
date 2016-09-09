package test.npe

class Product {

    String name

    static hasMany = [prices: Price]

    static constraints = {
    }
}
