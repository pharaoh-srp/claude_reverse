package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class spe {
    public final Set a;
    public final String b;
    public final long c;
    public final long d;

    public spe(Set set, String str, long j, long j2) {
        this.a = set;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spe)) {
            return false;
        }
        spe speVar = (spe) obj;
        return this.a.equals(speVar.a) && this.b.equals(speVar.b) && this.c == speVar.c && this.d == speVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + vb7.e(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ResourceItem(qualifiers=" + this.a + ", path=" + this.b + ", offset=" + this.c + ", size=" + this.d + ")";
    }
}
