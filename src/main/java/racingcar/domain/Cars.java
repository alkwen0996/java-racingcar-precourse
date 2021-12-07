package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    protected List<String> makeWinnerList(final List<Car> cars) {
        Car winnerCarPosition = cars.get(0);
        winnerCarPosition = findWinnerPosition(cars, winnerCarPosition);

        return addWinner(cars, winnerCarPosition);
    }

    protected List<String> addWinner(List<Car> cars, Car winnerCarPosition) {
        final List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.isWinner(winnerCarPosition)) {
                winners.add(car.getCarName());
            }
        }

        return winners;
    }

    protected Car findWinnerPosition(List<Car> cars, Car winnerCarPosition) {
        for (Car car : cars) {
            if (car.isFaster(winnerCarPosition)) {
                winnerCarPosition = car;
            }
        }

        return winnerCarPosition;
    }

}
