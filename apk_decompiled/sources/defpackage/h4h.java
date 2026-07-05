package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h4h {
    public static final h4h b = new h4h(nm6.E);
    public final Map a;

    public h4h(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4h) {
            return x44.r(this.a, ((h4h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.a + ')';
    }
}
