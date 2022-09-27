package strategy_pattern_example;

public class RSAEncryptor implements Encryptor {
  @Override
  public String encryptFile() {
    return "Applying RSA encryption";
  }
}
