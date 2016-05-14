package html5api.jp.glssample;

/**
 * Created by kgotoh on 2016/05/12.
 */
public class Items {
    private String name;
    private int imageResource;

    public Items(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
