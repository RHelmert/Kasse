package de.ostmarkbeuthen.kasse.database;

import java.util.List;

public interface DatabaseResult <T> {
    List<T> get();
}