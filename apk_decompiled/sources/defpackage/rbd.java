package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rbd {
    public final String a;
    public final Long b;

    public rbd(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbd)) {
            return false;
        }
        rbd rbdVar = (rbd) obj;
        return this.a.equals(rbdVar.a) && this.b.equals(rbdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
