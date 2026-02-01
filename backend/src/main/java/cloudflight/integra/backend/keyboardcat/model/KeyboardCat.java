package cloudflight.integra.backend.keyboardcat.model;

public class KeyboardCat {
    private Long id;
    private String name;
    private String favoriteSong;
    private int age;

    public KeyboardCat(Long id, String name, String favoriteSong, int age) {
        this.id = id;
        this.name = name;
        this.favoriteSong = favoriteSong;
        this.age = age;
    }

    public KeyboardCat() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getFavoriteSong() { return favoriteSong; }
    public void setFavoriteSong(String favoriteSong) { this.favoriteSong = favoriteSong; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
