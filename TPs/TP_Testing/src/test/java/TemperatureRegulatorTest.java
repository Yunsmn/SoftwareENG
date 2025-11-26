import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureRegulatorTest {

    @Test
    void compute_currentMuchLowerThanTarget_shouldReturnHeat() {

        TemperatureRegulator regulator = new TemperatureRegulator();
        double current = 20.0;
        double target = 22.0;


        TemperatureRegulator.Action result = regulator.compute(current, target);


        assertEquals(TemperatureRegulator.Action.HEAT, result);
    }

    @Test
    void compute_currentMuchHigherThanTarget_shouldReturnCool() {

        TemperatureRegulator regulator = new TemperatureRegulator();
        double current = 22.0;
        double target = 20.0;


        TemperatureRegulator.Action result = regulator.compute(current, target);


        assertEquals(TemperatureRegulator.Action.COOL, result);
    }

    @Test
    void compute_currentWithinTolerance_shouldReturnStandby() {

        TemperatureRegulator regulator = new TemperatureRegulator();
        double current = 21.0;
        double target = 21.0;

        TemperatureRegulator.Action result = regulator.compute(current, target);


        assertEquals(TemperatureRegulator.Action.STANDBY, result);
    }

    @Test
    void compute_currentSlightlyLowerThanTarget_shouldReturnStandby() {

        TemperatureRegulator regulator = new TemperatureRegulator();
        double current = 20.3;
        double target = 20.0;


        TemperatureRegulator.Action result = regulator.compute(current, target);


        assertEquals(TemperatureRegulator.Action.STANDBY, result);
    }

    @Test
    void compute_currentSlightlyHigherThanTarget_shouldReturnStandby() {

        TemperatureRegulator regulator = new TemperatureRegulator();
        double current = 20.7;
        double target = 21.0;

        TemperatureRegulator.Action result = regulator.compute(current, target);

        assertEquals(TemperatureRegulator.Action.STANDBY, result);
    }
}