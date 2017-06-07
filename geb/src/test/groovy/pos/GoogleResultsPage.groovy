package pos

import geb.Page

/**
 * Created by syu on 6/6/2017.
 */
class GoogleResultsPage extends Page {
    static at = { title.endsWith "Google Search" }
    static content = {
        // reuse our previously defined module
        //search { module GoogleSearchModule, buttonValue: "Search" }
        print "SALLY: GoogleResultsPage before search"
        search { module(new GoogleSearchModule(buttonValue: "Search")) }
        print "SALLY: GoogleResultsPage after search"

        // content definitions can compose and build from other definitions
//        results { $("h3.r", 0) }
//        result { i -> results[i] }
//        resultLink { i -> result(i).find("a") }
//        firstResultLink { resultLink(0) }
//        firstResultLink {
//            $("a").text() == "Wikipedia, the free encyclopedia"
//        }

        firstResultLink { $("h3.r", 0).find("a", 0) }
    }
}
