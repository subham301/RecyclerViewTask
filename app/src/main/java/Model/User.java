package Model;

import android.media.Image;

public class User {

    private int img_drawable_id;
    private String name;
    private String contact;
    private String age;
    private String email;

    public User(int img_drawable_id, String name, String contact, String age, String email) {
        this.img_drawable_id = img_drawable_id;
        this.name = name;
        this.contact = contact;
        this.age = age;
        this.email = email;
    }

    public int getImageDrawableId() {
        return img_drawable_id;
    }

    public void setImageDrawableId(int id){
        this.img_drawable_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
