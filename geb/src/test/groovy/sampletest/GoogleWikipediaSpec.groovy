package sampletest

import geb.spock.GebSpec
import pos.GoogleHomePage
import pos.GoogleResultsPage
import pos.WikipediaPage

class GoogleWikipediaSpec extends GebSpec {

    def "first result for wikipedia search should be wikipedia"() {
        given:
        to GoogleHomePage

        expect:
        at GoogleHomePage

        when:
        search.field.value("wikipedia")

        then:
        waitFor { at GoogleResultsPage }

        and:
        firstResultLink.text() == "Wikipedia, the free encyclopedia"

        when:
        firstResultLink.click()

        then:
        waitFor { at WikipediaPage }
    }
}
