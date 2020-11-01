package com.bookcatalogue.main.java.model;

import java.util.Objects;

public abstract class DBObject {
    private long uid;
    //auto incrementing
    //in memory primary key
    private static long NEW_UID = 0;

    public DBObject() {
        this.uid = ++NEW_UID;
    }

    public long getUid() {
        return uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DBObject)) return false;
        DBObject dbObject = (DBObject) o;
        return uid == dbObject.uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}
