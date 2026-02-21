import utils.*;

public class Main {

  public static void main(String[] args) {

    Blockchain blockchain = new Blockchain();

    blockchain.createGenesisBlock();
    blockchain.addBlock("Saumya", "Roshan", 1322);
    blockchain.addBlock("Susanti", "Roshan", 100);

    blockchain.printChain();
  }
}
