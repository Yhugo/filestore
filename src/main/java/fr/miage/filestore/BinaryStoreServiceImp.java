package fr.miage.filestore;

import java.io.InputStream;

/**
 * Created by Yohann Hugo on 24/09/2016.
 */
public class BinaryStoreServiceImp implements  BinaryStoreService {

    @Override
    public boolean exists(String key) throws BinaryStoreServiceException {
        return false;
    }

    @Override
    public String put(InputStream is) throws BinaryStoreServiceException {
        return null;
    }

    @Override
    public InputStream get(String key) throws BinaryStoreServiceException, BinaryStreamNotFoundException {
        return null;
    }
}
