package ru.netology;

public class PosterManager {

    private Film[] items = new Film[0];

    //Добавить фильм в ленту
    public void add(Film item) {
        Film[] tmp = new Film[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int newNumber = tmp.length - 1;
        tmp[newNumber] = item;
        this.items = tmp;
    }

    //удалить по id
    public void deleteFilm(int id) {
        Film[] tmp = new Film[items.length - 1];
        int index = 0;
        for (Film item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    // в обратном порядке
    public Film[] getAll() {
        Film[] result = new Film[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    // проверка след.
    public Film[] lastFilm(int limitFilms) {

        if (items.length  > limitFilms) {
            Film[] result = new Film[limitFilms];
            System.out.println("Больше " + limitFilms + "  нельзя");

            for (int i = 0; i < result.length; i++) {
                int index = result.length - i - 1;
                result[i] = this.items[index];
            }
            return result;

        } else {
            Film[] result = new Film[items.length];
            for (int i = 0; i < result.length; i++) {
                int index = result.length - i - 1;
                result[i] = this.items[index];
            }
            return result;
        }
    }
}

