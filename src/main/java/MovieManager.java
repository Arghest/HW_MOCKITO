public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public void addMovie(String movie) {
    String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultLght;
        limit = 5;
        if (movies.length < limit) {
            resultLght = movies.length;
        } else {
            resultLght = limit;
        }
        String[] tmp = new String[resultLght];
        for (int i = 0; i < tmp.length ; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

    public String[] findLastLimit(int limit) {
        int resultLght;
        if (movies.length < limit) {
            resultLght = movies.length;
        } else {
            resultLght = limit;
        }
        String[] tmp = new String[resultLght];
        for (int i = 0; i < tmp.length ; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}
