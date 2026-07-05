package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0d implements f0d {
    public final List a;

    public e0d(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0d) && x44.r(this.a, ((e0d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("Transcript(lines=", ")", this.a);
    }
}
