package strategy_pattern_example;

public class AESEncryptor implements Encryptor {
  @Override
  public String encryptFile() {
    return "Applying AES encryption";
  }
}
