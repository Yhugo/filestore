package fr.miage.filestore;
import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by Yohann Hugo on 24/09/2016.
 */
public class BinaryStoreServiceImp implements  BinaryStoreService {

    private HashMap<String, InputStream> data;
    private int key = 0;

    public BinaryStoreServiceImp(){
        data = new HashMap<String, InputStream>();
    }

    @Override
    public boolean exists(String key) throws BinaryStoreServiceException {
        if(data.keySet().contains(key)) return true;
        return false;
    }

    @Override
    public String put(InputStream is) throws BinaryStoreServiceException {
        String Reelkey = ""+key;
        key++;
        data.put(Reelkey,is);
        return Reelkey;
    }

    @Override
    public InputStream get(String key) throws BinaryStoreServiceException, BinaryStreamNotFoundException {
        if(this.exists(key)){
            return data.get(key);
        }else{
            throw new BinaryStreamNotFoundException();
        }
    }
}
