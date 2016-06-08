package org.example

import org.apache.solr.client.solrj.SolrQuery
import org.apache.solr.client.solrj.impl.HttpSolrServer

/**
  * Created by dan on 6/7/16.
  */
object Main extends App {
  println("Hello, I'm going to run a query!")
  val server = new HttpSolrServer("http://localhost:8983/solr/techproducts")
  val query = new SolrQuery()
  query.setQuery("*.*")
  val response = server.query(query)
  val docs = response.getResults()
  println("The solr index has " + docs.getNumFound + " documents")
}
