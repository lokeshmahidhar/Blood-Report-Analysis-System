/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinit
 */
import com.mongodb.DB;
import com.mongodb.DBCollection;

import com.mongodb.MongoClient;

public class Connect
{
    public DBCollection connect(String dbc) 
    {
        try{
            MongoClient mc= new MongoClient("localhost",27017); // (ip address,port no)locathost coz client and server on same machine
            DB d=mc.getDB("db");
            DBCollection dc=d.getCollection(dbc);
            return dc;
           } 
         catch(Exception e)
             {
              return null;
             }
    }
    
    public int convertInt(String s){
        int res = Integer.parseInt(s);
        return res;
    }

   /* DBCollection connect(String login_details) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
