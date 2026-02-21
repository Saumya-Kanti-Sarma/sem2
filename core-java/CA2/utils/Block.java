package utils;

import java.time.LocalDateTime;

public class Block {

  public String sender;
  public String receiver;
  public LocalDateTime timeStamp;
  public Integer amount;
  public String prevHash;
  public String agreement;
  public String currentHash;

  public Block(String sender,
      String receiver,
      LocalDateTime timeStamp,
      Integer amount,
      String prevHash,
      String agreement) {

    this.sender = sender;
    this.receiver = receiver;
    this.timeStamp = timeStamp;
    this.amount = amount;
    this.prevHash = prevHash;
    this.agreement = agreement;
    this.currentHash = calculateHash();
  }

  private String calculateHash() {
    String data = sender + "-" + receiver + "-" + agreement + "-" + amount + "-" + timeStamp + "-" + prevHash;
    return HashUtil.generateHash(data);
  }
}
