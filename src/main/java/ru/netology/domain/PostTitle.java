package ru.netology.domain;

public class PostTitle {
    private int id;// идентификатор записи
    private int ownerId; // идентификатор владельца страницы
    private int fromId;// Идентификатор автора записи
    private int createdBy;//Идентификатор администратора, который опубликовал запись
    private int date; //дата и время публикации
    private String text; // текст записи
    private int replyOwnerId; //Идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;// Идентификатор записи, в ответ на которую была оставлена текущая
    private boolean friendsOnly;//если запись была создана с опцией «Только для друзей».
    private LikesInfo likesInfo; // класс с лайками
    private CommentsInfo commentsInfo; //класс с комментариями
    private RepostsInfo repostsInfo; // класс с репостами
    private CountsViews countsViews;// класс с просмотрами
    private CopyRight copyRight;//Источник материала, объект с полями
    private String postType;//Тип записи
    private PostSource postSource;//Информация о способе размещения записи.
    private Geo geo;//Информация о местоположении
    private int signedId;//Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private boolean canPin;//Информация о том, может ли текущий пользователь закрепить запись
    private boolean canDelete;//Информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit;//Информация о том, может ли текущий пользователь редактировать запись
    private boolean isPinned;//	Информация о том, что запись закреплена.
    private boolean markedAsAds;//Информация о том, содержит ли запись отметку "реклама"
    private boolean isFavorite;//true, если объект добавлен в закладки у текущего пользователя.
    private Donut donut;//Информация о записи VK Donut
    private int postponedID;//Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.


}

