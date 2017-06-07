package pos

import geb.Page

/**
 * Created by syu on 6/6/2017.
 */
class GoogleHomePage extends Page {
    // pages can define their location, either absolutely or relative to a base
    static url = "http://google.com"

    // “at checkers” allow verifying that the browser is at the expected page
    static at = { title == "Google" }



    static content = {
        // include the previously defined module
        // search { module GoogleSearchModule, buttonValue: "Google Search" }
        //search { name -> module GoogleSearchModule, buttonValue: name }
        print "SALLY: GoogleResultsPage before search"
        search { module(new GoogleSearchModule(buttonValue: "Google Search")) }
        print "SALLY: GoogleResultsPage after search"

//        searchField {
//            $("input", name: "q")
//        }
//
//        btnSearch(to: GoogleResultsPage) {
//            $("input", value: "Google Search")
//        }
    }
}
