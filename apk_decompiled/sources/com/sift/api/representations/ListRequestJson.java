package com.sift.api.representations;

import defpackage.aof;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ListRequestJson {

    @aof("data")
    public List<Object> data = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListRequestJson)) {
            return false;
        }
        List<Object> list = this.data;
        List<Object> list2 = ((ListRequestJson) obj).data;
        return list == list2 || (list != null && list.equals(list2));
    }

    public int hashCode() {
        List<Object> list = this.data;
        return 31 + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListRequestJson.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[data=");
        Object obj = this.data;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public ListRequestJson withData(List<Object> list) {
        this.data = list;
        return this;
    }
}
