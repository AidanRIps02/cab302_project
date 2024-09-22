package qut.group83.cab302_project;

import com.google.gson.Gson;

public class DummyTodo {
    private int id;
    private String todo;
    private boolean completed;
    private int userId;

    public int getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getUserId() {
        return userId;
    }

    /**
     * Converts a JSON string to a DummyTodo object using GSon.
     *
     * @param json the JSON string to convert
     * @return the DummyTodo object
     */
    public static DummyTodo fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, DummyTodo.class);
    }

    @Override
    public String toString() {
        return "DummyTodo{" +
                "id=" + id +
                ", todo='" + todo + '\'' +
                ", completed=" + completed +
                ", userId=" + userId +
                '}';
    }
}