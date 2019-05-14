package CRUD;

import config.Config;
import exceptions.expIdNotExist;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Car {
    
    private String path = Config.getPath()+this.getClass().getSimpleName();
    
    private int nextId;
    ArrayList<strCar> list = new ArrayList<strCar>();
    
    public int getNextId() {
        nextId++;
        return nextId;
    }
    
    public void loadFromFile() throws IOException {
        if (!(new File(path).exists())) return;
        System.out.println("cargaron");
        FileReader file = new FileReader(path);
        BufferedReader b = new BufferedReader(file);
        String line;
        strCar obj;
        String[] ARR;
        list.clear();
        this.nextId = 0;
        int lastId = 0;
        while ((line = b.readLine()) != null) {            
            ARR = line.split("\\|");
            obj = new strCar(
                    Integer.parseInt(ARR[0].toString()),
                    ARR[1].toString(),
                    ARR[2].toString(),
                    Double.parseDouble(ARR[3].toString()),
                    Integer.parseInt(ARR[4].toString())
            );
            lastId = Integer.parseInt(ARR[0].toString());
            nextId = (lastId> nextId) ? lastId : nextId;
            list.add(obj);
        }
        b.close();
    }
    
    public void saveToFile() throws IOException {
        FileWriter fw = new FileWriter(path);
        for (strCar x : list) {
            fw.write(
                    x.getId() +"|"+
                    x.getNameClient() +"|"+
                    x.getColorCar() +"|"+
                    x.getPayment() +"|"+
                    x.getStatus()
            );
            fw.write("\n");
        }
        fw.close();
    }
    
    // =============== CRUD ==================
    
    public ArrayList<strCar> getList() {
        return list;
    }
    
    public int indexId(int id) {
        int i = 0;
        for (strCar x : list) {
            if (x.getId() == id) return i;
            i++;
        }
        return -1;
    }
    
    public boolean exitsId(int id){
        return (indexId(id) != -1);
    }
    
    // Create
    public void create(strCar data) {
        if (data == null) throw new RuntimeException("Null Object");
         
        else list.add(data);
    }
    // Read
    public strCar searchId(int id){
        for (strCar x : list){
            if (x.getId() == id) return x;
        }
        return null; 
    }
    // Update
    public void update(strCar data) throws expIdNotExist {
        if (!exitsId(nextId)) throw new expIdNotExist();
        
        int index = indexId(data.getId());
        list.set(index, data);
    }
    // Delete
    public void delete(int id) throws expIdNotExist {
        if (!exitsId(nextId)) throw new expIdNotExist();
        int index = indexId(id);
        list.remove(index);
    }
    
}
