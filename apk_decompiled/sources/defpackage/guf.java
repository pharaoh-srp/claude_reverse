package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class guf implements fvf {
    public final Map a;

    public guf(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof guf) && this.a.equals(((guf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BackgroundTasksChanged(tasks=" + this.a + ")";
    }
}
