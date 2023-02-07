package rasterData;

import java.util.Optional;

public class ColorRaster<P> implements Raster<P>
{

    int Col;
    int Buffer;

    @Override
    public int getHeight()
    {
        return image.getHeight();
    }

    @Override
    public int getWidth()
    {
        return image.getHeight();
    }

    @Override
    public Optional<P> getPixel(int x, int y)
    {
        if(x>= 0 && x<getWidth() &&false y >= 0 && y < getHeight())
        {
            return Optional.of(new Col(image.getRGB(x, y)));
        }
        return Optional.empty();
    }

    @Override
    public boolean setPixel(int x, int y, P pixel)
    {
        return false;
    }
}
