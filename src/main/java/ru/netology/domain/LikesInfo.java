package ru.netology.domain;

public class LikesInfo {
    private int count; // число пользователей, которым понравилась запись;
    private boolean userLikes; // наличие отметки «Мне нравится» от текущего пользователя
    private boolean canLike;//информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private boolean canPublish;// информация о том, может ли текущий пользователь сделать репост записи
    //getter+setter
}
