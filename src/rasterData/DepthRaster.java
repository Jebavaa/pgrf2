package rasterData;

import java.util.Optional;

public class DepthRaster<P> implements Raster<P>
{

    private final

    public int getWidth()
    {
        return 0;
    }
    public int getWidth()
    {
        return 0;
    }

    @Override
    public boolean setPixel(int x, int y, P pixel)
    {
        return false;
    }

    @Override
    public Optional<P> getPixel(int x, int y)
    {
        return Optional.empty();
    }
}
