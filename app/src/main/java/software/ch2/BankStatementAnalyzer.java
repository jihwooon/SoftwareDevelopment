package software.ch2;

import java.util.List;

public class BankStatementAnalyzer implements BankStatementParser{


    @Override
    public BankTransaction parseFrom(String line) {
        throw new UnsupportedOperationException("BankStatementAnalyzer#parseFrom not implemented yet !!");
    }

    @Override
    public List<BankTransaction> parseLinesFrom(List<String> lines) {
        throw new UnsupportedOperationException("BankStatementAnalyzer#parseLinesFrom not implemented yet !!");
    }
}
