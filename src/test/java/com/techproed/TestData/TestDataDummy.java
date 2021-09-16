package com.techproed.TestData;

import jdk.nashorn.api.scripting.JSObject;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestDataDummy {

       /*

    http://dummy.restapiexample.com/api/v1/employees url ine bir istek gönderildiğinde
Status kodun 200 olduğunu,
5. Çalışan isminin "Airi Satou" olduğunu ,  çalışan sayısının 24 olduğunu,
Sondan 2. çalışanın maaşının 106450 olduğunu
40,21 ve 19 yaslarında çalışanlar olup olmadığını
11. Çalışan bilgilerinin
  {
 “id”:11
 "employee_name": "Jena Gaines",
"employee_salary": 90560,
"employee_age": 30,
"profile_image": "" }
} gibi olduğunu test edin.
     */

    public HashMap<String,Object> setUpTestData(){

        HashMap<String,Object> expectedDataMap=new HashMap<String, Object>();

        List<Integer>yaslar=new ArrayList<Integer>();
        yaslar.add(40);
        yaslar.add(21);
        yaslar.add(19);

        HashMap<String,Object> onbirinci=new HashMap<String, Object>();
        onbirinci.put("id",11);
        onbirinci.put("employee_name","Jena Gaines");
        onbirinci.put("employee_salary",90560);
        onbirinci.put("employee_age",30);
        onbirinci.put("profile_image","");

        expectedDataMap.put("yasListesi",yaslar);
        expectedDataMap.put("employe11",onbirinci);
        expectedDataMap.put("statusCode",200);
        expectedDataMap.put("besinciCalisan","Airi Satou");
        expectedDataMap.put("calisanSayisi",24);
        expectedDataMap.put("istenenMaas",106450);
        return expectedDataMap;
    }

    public HashMap<String,Integer> setUpTestData2(){
        HashMap<String,Integer>expectedDataMap=new HashMap<String, Integer>();

        expectedDataMap.put("statusCode",200);
        expectedDataMap.put("enYuksekMaas",725000);
        expectedDataMap.put("ikinciYuksekMaas",675000);
        expectedDataMap.put("enKucukYas",19);
        return expectedDataMap;

         }


         public HashMap<String,Object> SetUpTestData3(){

            HashMap<String,Object> requestBodyMap=new HashMap<String, Object>();
            requestBodyMap.put("name","Ahmet Aksoy");
            requestBodyMap.put("salary",1000);
            requestBodyMap.put("age",18);
            requestBodyMap.put("profile_image","");
            return requestBodyMap;


         }

         public HashMap<String,Object> SetUpTestData4(){

        HashMap<String,Object> expectedDataMap=new HashMap<String, Object>();
        expectedDataMap.put("statusCode",200);
        expectedDataMap.put("status","success");
        expectedDataMap.put("message","Successfully! Record has been added.");
        return expectedDataMap;


         }

         public JSONObject setUpDelete01(){
        /*
        {
 "status": "success",
 "data": "2",
 "message": "Successfully! Record has been deleted"
}
         */

             JSONObject expectedData=new JSONObject();
             expectedData.put("status","success");
             expectedData.put("data","2");
             expectedData.put("message","Successfully! Record has been deleted");
             expectedData.put("statusCode",200);
             return expectedData;

         }





}
