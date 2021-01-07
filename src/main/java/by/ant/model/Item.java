package by.ant.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {
    public Item(@Value("Book")String name,@Value("false") boolean electric) {
        this.name = name;
        this.electric = electric;
    }

    private String name;
    private boolean electric;
    @Autowired
    @Qualifier("materialBean")
    private Material material;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isElectric() {

        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    public void getMaterialMe(){
        System.out.println("Here material");
        System.out.println("-----------------------------------------------");
    }
    public void putMaterialMe(){
        System.out.println("Here put material");
        System.out.println("-----------------------------------------------");

    }
    public String tryMe(String me,Item item){
        System.out.println("This method this "+me);
        System.out.println("-----------------------------------------------");
        return "Yes!)";
    }

}
