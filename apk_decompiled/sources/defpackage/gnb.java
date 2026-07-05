package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gnb {
    public final sef a;
    public final boolean b;
    public final boolean c;

    public gnb(boolean z, int i) {
        z = (i & 1) != 0 ? true : z;
        this.a = sef.E;
        this.b = z;
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnb)) {
            return false;
        }
        gnb gnbVar = (gnb) obj;
        return this.a == gnbVar.a && this.c == gnbVar.c && this.b == gnbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fsh.p(this.a.hashCode() * 31, 29791, this.b);
    }
}
