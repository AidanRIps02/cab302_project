package qut.group83.cab302_project;

import com.google.gson.Gson;

public class DummyTodos {
    private DummyTodo[] todos;

    public DummyTodo[] getDummyTodos() {
        return todos;
    }

    /**
     * Converts a JSON string to a DummyTodos object using GSon.
     *
     * @param json the JSON string to convert
     * @return the DummyTodos object
     */
    public static DummyTodos fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, DummyTodos.class);
    }
}