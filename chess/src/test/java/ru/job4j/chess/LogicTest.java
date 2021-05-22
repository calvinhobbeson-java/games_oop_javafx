package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFoundThenException() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.move(Cell.C8, Cell.G4);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCellException() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new BishopBlack(Cell.F5));
        logic.move(Cell.C8, Cell.G4);
    }


    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMoveException() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C8, Cell.G5);
    }
}