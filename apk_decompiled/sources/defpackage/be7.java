package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class be7 {
    public static final be7 b = new be7(mwa.V(new LinkedHashMap()));
    public final Map a;

    public be7(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be7) && x44.r(this.a, ((be7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.a + ")";
    }
}
