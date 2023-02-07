package rasterData;

import java.util.Optional;

public interface Raster<P>
{

    int Get_width();
    int Get_height();
    boolean setPixel(int x, int y, P pixel);
    Optional<P> getPixel(int x, int y);
}
