package retailgit

import grails.rest.RestfulController

class QuoteController extends RestfulController{

	Override SwaggyList
    def index() {
		
		createQuote();
	}
	
	Override SwaggyQuote
	def createQuote()
	{
		
		render "hello world"
	}
}
