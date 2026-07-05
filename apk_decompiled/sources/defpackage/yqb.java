package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yqb {
    public static final yqb b = new yqb(Collections.unmodifiableMap(new HashMap()));
    public final Map a;

    public yqb(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yqb) {
            return this.a.equals(((yqb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
