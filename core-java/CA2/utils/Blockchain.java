package utils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Blockchain {

  public final List<Block> chain = new ArrayList<>();

  public void createGenesisBlock() {
    LocalDateTime date = LocalDateTime.now();
    String agreement = "This block was created on: " + date;

    Block genesisBlock = new Block(
        "System",
        null,
        date,
        null,
        null,
        agreement);

    chain.add(genesisBlock);
  }

  public void addBlock(String sender, String receiver, int amount) {
    LocalDateTime date = LocalDateTime.now();
    String prevHash = chain.get(chain.size() - 1).currentHash;

    String agreement = sender + " sends ₹" + amount +
        "/- to " + receiver + " on " + date;

    Block newBlock = new Block(
        sender,
        receiver,
        date,
        amount,
        prevHash,
        agreement);

    chain.add(newBlock);
  }

  public void printChain() {
    for (Block block : chain) {
      System.out.println("Time stamp: " + block.timeStamp);
      System.out.println("Agreement: " + block.agreement);
      System.out.println("Sender: " + block.sender);
      System.out.println("Receiver: " + block.receiver);
      System.out.println("Previous hash: " + block.prevHash);
      System.out.println("Current hash: " + block.currentHash);
      System.out.println("----------------------------------------");
    }
  }
}
