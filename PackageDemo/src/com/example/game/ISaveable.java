package com.example.game;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void saved(List<String> values);
}
