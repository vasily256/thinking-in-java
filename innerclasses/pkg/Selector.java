package biz.markov.thinking.innerclasses.pkg;

public interface Selector {
  boolean end();
  Object current();
  void next();
}
