package jp.techacademy.toshiakinishiyama.taskapp;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Toshiaki.Nishiyama on 2016/09/06.
 */
public class Task extends RealmObject implements Serializable
{
    private String title;       // タイトル
    private String contents;    // 内容
    private Date date;          // 日時
    private String category;   // カテゴリ

    // id をプライマリーキーとして設定
    @PrimaryKey
    private int id;

    // タイトル
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // 内容
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }

    // 日時
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    // ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // カテゴリ
    public String getCategory() {return category;}
    public  void setCategory(String category){this.category = category;}
}
