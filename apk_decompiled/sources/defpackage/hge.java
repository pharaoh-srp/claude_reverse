package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hge {
    public static final hge c = new hge(0, false);
    public final int a;
    public final boolean b;

    public hge(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hge.class != obj.getClass()) {
            return false;
        }
        hge hgeVar = (hge) obj;
        return this.a == hgeVar.a && this.b == hgeVar.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
