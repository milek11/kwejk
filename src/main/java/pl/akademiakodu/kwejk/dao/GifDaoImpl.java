package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl implements GifDaoInterface {

    static List<Gif> gifs = new ArrayList<>();
    static {
        gifs.add(new Gif("android-explosion",  true));
        gifs.add(new Gif("ben-and-mike",  false));
        gifs.add(new Gif("book-dominos",  false));
        gifs.add(new Gif("compiler-bot",  false));
        gifs.add(new Gif("cowboy-coder", true));
        gifs.add(new Gif("infinite-andrew",  false));
    }

    @Override
    public List<Gif> findFavoritesGif() {
        List<Gif> gifsFavorite = new ArrayList<>();
        for(int i = 0; i < gifs.size();i++) {
            if (gifs.get(i).getFavorite())
                gifsFavorite.add(gifs.get(i));
        }
        return gifsFavorite;
    }
    @Override
    public List<Gif> findAllGifs() {
        return gifs;
    }

    @Override
    public List<Gif> findByName(String name) {
        List<Gif> gifs = new ArrayList<>();

        for (Gif gifList :gifs){
            if ( gifList.getName().equals(name)){
                gifs.add(gifList);
            }
        }
        return gifs;
    }
}
