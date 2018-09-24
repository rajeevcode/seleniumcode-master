package DatabaseTesting;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatabaseTestingMongoDB {

  MongoClient mongoClient = null;
  MongoDatabase db = null;

  @BeforeClass
  public void beforeClass() {
    try {
      // STEP 1: Connect to the database
      // Default port is 27017 on which MongoDB client runs
      mongoClient = new MongoClient ( "localhost", 27017 );
      // Query to get Database name -> db.getName()
      db = mongoClient.getDatabase ( "test" );
      System.out.println ( "Connect to the database successfully" );
    } catch (Exception e) {
      System.out.println ( e.getClass ( ).getName ( ) + ":" + e.getMessage ( ) );
    }
  }

  @Test
  public void test() throws Exception {
    try {
      //STEP 2: Get collection
      // To get all collection names -> db.getCollectionNames()
      // show collections -> inventory
      MongoCollection <Document> table = db.getCollection ( "inventory" );

      //STEP 3: Extract Data
      BasicDBObject searchQuery = new BasicDBObject (  );
      // Query the collection -> db.inventory.find( {} )
      // column name, value
      searchQuery.put ( "item", "mat" );
      FindIterable<Document> cursor = table.find (searchQuery);

      //STEP 4: Iterate over Data
      for (Document obj : cursor){
        // Key value is Column name
        String itemName = obj.getString ( "item" );
        System.out.println (itemName);
        System.out.println ("*************" );
        System.out.println (obj.toString () );

        //Expected Result from UI, Actual Result from DataBase
        Assert.assertEquals ( "item","item" );
      }
    } catch (Exception e) {
      //Handle errors for Class.forName
      e.printStackTrace ( );
    }
  }

  @AfterClass
  public void afterClass(){

  }
}


