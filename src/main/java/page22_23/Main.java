package page22_23;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String[] colors = {"Red"};
        Car car = new Car("Toyota", "Camry", colors ,
                "km/h" , 220, 2.5,
                6600, "11.8:1", 5);

        createJsonFile(createJsonObj(car));

    }

    private static void createJsonFile(JSONObject obj){
        try(FileWriter file = new FileWriter("src/main/java/page22_23/test.json")) {
            file.write(obj.toJSONString());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static JSONObject createJsonObj(Car car){
        JSONObject obj = new JSONObject();
        JSONObject objInObj = new JSONObject();
        JSONArray list = new JSONArray();
        obj.put("brand", car.getBrand());
        obj.put("model", car.getModel());
        list.addAll(Arrays.asList(car.getColors()));
        obj.put("colors", list);
        objInObj.put("unit", car.getSpeedUnit());
        obj.put("maxSpeed", objInObj);
        objInObj.put("value", car.getSpeedValue());
        obj.put("maxSpeed", objInObj);
        objInObj = new JSONObject();
        objInObj.put("volume", car.getVolume());
        obj.put("engine", objInObj);
        objInObj.put("rpm", car.getRpm());
        obj.put("engine", objInObj);
        objInObj.put("compressionRation", car.getCompressionRation());
        obj.put("engine", objInObj);
        obj.put("seatingCapacity", car.getSeatingCapacity());

        return obj;

    }
}
