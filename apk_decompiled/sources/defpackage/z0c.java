package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z0c {
    public static final z0c b = new z0c(sta.q0(new LinkedHashMap()));
    public final Map a;

    public z0c(Map map) {
        this.a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List list = (List) this.a.get(lowerCase);
        if (list != null) {
            return (String) w44.V0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0c) && this.a.equals(((z0c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ")";
    }
}
