package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j95 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof j95) {
            return x44.r(this.a, ((j95) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
