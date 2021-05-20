package ru.job4j.chess.firuges.black;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        Cell expected = bishop.position();
        assertThat(expected, is(Cell.A1));
    }

    @Test
    public void copy() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        Figure expected = bishop.copy(Cell.A2);
        assertThat (expected.position(), is(Cell.A2));
    }
    @Test
    public void way() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] expected = bishop.way(Cell.G5);
        assertThat (expected, is(new Cell[] { Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}