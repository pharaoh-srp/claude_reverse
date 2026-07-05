package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sa {
    public final ArrayList a;

    public sa(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa) && this.a.equals(((sa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Frustration(type=" + this.a + ")";
    }
}
