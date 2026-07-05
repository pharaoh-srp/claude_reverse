package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nre {
    public static final nre c = new nre(0, lm6.E);
    public final int a;
    public final List b;

    public nre(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final int a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nre)) {
            return false;
        }
        nre nreVar = (nre) obj;
        return this.a == nreVar.a && this.b.equals(nreVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ResumePoint(inputIndex=" + this.a + ", output=" + this.b + ")";
    }
}
