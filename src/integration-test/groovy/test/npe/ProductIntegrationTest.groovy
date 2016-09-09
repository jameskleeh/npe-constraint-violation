package test.npe

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class ProductIntegrationTest extends Specification {

    void "test"() {
        given:
        Group group = new Group(name: "Group 1").save(failOnError: true, flush: true)
        Product product = new Product(name: "Product 1")
        product.addToPrices(amount: 1.0, group: group)
        product.addToPrices(amount: 2.0, group: group)

        when:
        product.save(flush: true)

        then:
        noExceptionThrown()
    }
}
