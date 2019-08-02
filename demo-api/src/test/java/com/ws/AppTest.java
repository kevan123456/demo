package com.ws;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    class Item {
        private Integer id;
        private Integer itemStock;
        private String name;
        private Integer mark;

        public Integer getMark() {
            return mark;
        }

        public void setMark(Integer mark) {
            this.mark = mark;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getItemStock() {
            return itemStock;
        }

        public void setItemStock(Integer itemStock) {
            this.itemStock = itemStock;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Test
    public void testSort() {
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setId(1);
        item1.setItemStock(20);
        item1.setName("商品1");
        item1.setMark(0);
        itemList.add(item1);

        Item item2 = new Item();
        item2.setId(2);
        item2.setItemStock(0);
        item2.setName("商品2");
        item2.setMark(1);
        itemList.add(item2);

        Item item3 = new Item();
        item3.setId(3);
        item3.setItemStock(null);
        item3.setName("商品3");
        item3.setMark(0);
        itemList.add(item3);

        Item item4 = new Item();
        item4.setId(4);
        item4.setItemStock(8);
        item4.setName("商品4");
        item4.setMark(1);
        itemList.add(item4);

        Item item5 = new Item();
        item5.setId(5);
        item5.setItemStock(50);
        item5.setName("商品5");
        item5.setMark(0);
        itemList.add(item5);

        Collections.sort(itemList, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.getMark() != null && o1.getMark() == 1) {
                    return 1;
                }
                if (o2.getMark() != null && o2.getMark() == 1) {
                    return -1;
                }
                return 0;
            }
        });

        for (Item item : itemList) {
            System.out.println(item.getId() + "\t" + item.getItemStock() + "\t" + item.getName() + "\t" + item.getMark());
        }

    }
}
