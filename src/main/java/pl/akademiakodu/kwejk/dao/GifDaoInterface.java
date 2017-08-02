package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.List;

public interface GifDaoInterface {
    List<Gif> findFavoritesGif();
    List<Gif> findAllGifs();
    Gif findByName(String name);
}
