package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z1e {
    public static final z1e c = new z1e(lm6.E, 0);
    public final List a;
    public final int b;

    public z1e(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1e)) {
            return false;
        }
        z1e z1eVar = (z1e) obj;
        return this.a.equals(z1eVar.a) && this.b == z1eVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RawInputEntries(entries=" + this.a + ", hiddenEntryCount=" + this.b + ")";
    }
}
