package test.npe

class Price {

    Float amount
    Group group

    static belongsTo = [product: Product]
    static constraints = {
        product(unique: 'group')
    }
}
