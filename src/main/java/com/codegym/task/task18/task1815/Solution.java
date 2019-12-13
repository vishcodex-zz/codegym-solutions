package com.codegym.task.task18.task1815;

import javafx.scene.control.Tab;

import java.util.List;

/*
Table

*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface field;

        public TableInterfaceWrapper(TableInterface t)
        {
            this.field = t;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            field.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return field.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            field.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}