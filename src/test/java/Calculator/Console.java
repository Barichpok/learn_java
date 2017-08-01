package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Console {

    BufferedReader console() {
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
