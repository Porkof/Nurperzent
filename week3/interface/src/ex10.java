interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

class AES implements Encryptable {
    public String encrypt(String data) {
        return "AES[" + data + "]"; // простая имитация шифрования
    }

    public String decrypt(String encryptedData) {
        return encryptedData.replace("AES[", "").replace("]", "");
    }
}

class RSA implements Encryptable {
    public String encrypt(String data) {
        return "RSA(" + data + ")"; // простая имитация шифрования
    }

    public String decrypt(String encryptedData) {
        return encryptedData.replace("RSA(", "").replace(")", "");
    }
}

public class ex10 {
    public static void main(String[] args) {
        Encryptable aes = new AES();
        Encryptable rsa = new RSA();

        String data = "HelloWorld";

        String aesEncrypted = aes.encrypt(data);
        String rsaEncrypted = rsa.encrypt(data);

        System.out.println("AES Encrypted: " + aesEncrypted);
        System.out.println("AES Decrypted: " + aes.decrypt(aesEncrypted));

        System.out.println("RSA Encrypted: " + rsaEncrypted);
        System.out.println("RSA Decrypted: " + rsa.decrypt(rsaEncrypted));
    }
}
