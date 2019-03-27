package com.example.takehomeassignment08_meixuanl;

public class Pokemon {
    public int name;
    public int firstInGame;
    public int photoId;
    public int id;

    public Pokemon(int name, int firstInGame, int photoId, int id){
        this.name = name;
        this.firstInGame = firstInGame;
        this.photoId = photoId;
        this.id = id;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setFirstInGame(int firstInGame) {
        this.firstInGame = firstInGame;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public int getFirstInGame() {
        return firstInGame;
    }

    public int getPhotoId() {
        return photoId;
    }

    public int getId() {
        return id;
    }
}
