package main.java;

public interface Encryptor {

    String encryptFile();

    Encryptor aesEncryptor = () -> "Applying AES Encryption";

    Encryptor rsaEncryptor = () -> "Applying RSA Encryption";

}
