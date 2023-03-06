package github.ancientmoon.compress;

import github.ancientmoon.extension.SPI;


@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}
