package com.example.projectbackpack;

import java.util.ArrayList;
import java.util.List;

public class MainWorker {
    List<Item> items = new ArrayList<>();
    List<Double> itemsWeight = new ArrayList<>();
    List<Double> itemsVolume = new ArrayList<>();
    private Double minWeight;

    public void setItemsWeight(Double itemsWeight) {
        this.itemsWeight.add(itemsWeight);
    }

    public void setItemsVolume(Double itemsVolume) {
        this.itemsVolume.add(itemsVolume);
    }

    public void setBackPack(Integer backPack) {
        this.backPack = backPack;
    }

    private Integer backPack;

    public Double getMinWeight() {
        return minWeight;
    }

    public void setWeight(double weight){
        minWeight = weight;
    }

    public void setItems(Item item){
        items.add(item);
    }

    public void generateAnswer(){
        int count = items.size();
        int[][] main = new int[count + 1][];
        for(int i = 0; i < count + 1; i++){
            main[i] = new int[(int) (backPack + 1)];
        }

        for(int k = 0; k <= count; k++){
            for(int s = 0; s <= backPack; s++){
                if(k == 0 || s == 0) {
                    main[k][s] = 0;
                } else {
                    if(s >= itemsWeight.get(k - 1)){
                        main[k][s] = (int) Math.max(main[k - 1][s], main[k - 1][(int) (s - itemsWeight.get(k - 1))] + itemsVolume.get(k + 1));
                    } else {
                        main[k][s] = main[k - 1][s];
                    }
                }
            }
        }
        System.out.println(main[count - 1][backPack - 1]);
    }
}
