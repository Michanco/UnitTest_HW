package homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import homework3.MainHW;

public class MainHWTest {

    private MainHW.BoolBool boolBool;
    @BeforeEach
    void setup(){
        boolBool = new MainHW.BoolBool();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    public void evenOddNumberTrueTest(int n){
        assertTrue(boolBool.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 7, 9})
    public void evenOddNumberFalseTest(int n){
        assertFalse(boolBool.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 55, 77, 99})
    public void numberInIntervalTrueTest(int n){
        assertTrue(boolBool.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 10, 110, 3647})
    public void numberInIntervalFalseTest(int n){
        assertFalse(boolBool.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    public void numberInIntervalEndsFalseTest(int n){
        assertFalse(boolBool.numberInInterval(n));
    }




}