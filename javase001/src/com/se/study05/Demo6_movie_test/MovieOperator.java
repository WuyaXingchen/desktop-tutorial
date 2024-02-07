package com.se.study05.Demo6_movie_test;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    // 1、展示系统全部电影信息 movies = [m1, m2, m3, ...]
    public void printAllMovies() {
        System.out.println("-----系统全部电影信息如下-----");
        for (int i = 0; i < movies.length; i++) {
            System.out.println("电影编号：" + movies[i].getId());
            System.out.println("电影名称：" + movies[i].getName());
            System.out.println("电影价格：" + movies[i].getPrice());
            System.out.println("---------------------");
        }

    }

    // 2、根据电影的编号查询出该电影的详细信息并展示
    public void searchMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println("-----电影详细信息如下-----");
                System.out.println("电影编号：" + movies[i].getId());
                System.out.println("电影名称：" + movies[i].getName());
                System.out.println("电影价格：" + movies[i].getPrice());
                System.out.println("电影分数：" + movies[i].getScore());
                System.out.println("电影导演：" + movies[i].getDirector());
                System.out.println("电影主演：" + movies[i].getActor());
                System.out.println("电影简介：" + movies[i].getInfo());
                System.out.println("---------------------");
                return;
            }
        }
        System.out.println("没有该电影信息");
    }
}
