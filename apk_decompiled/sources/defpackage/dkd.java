package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dkd {
    public final int a;
    public final boolean b;

    public dkd(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dkd.class != obj.getClass()) {
            return false;
        }
        dkd dkdVar = (dkd) obj;
        return this.a == dkdVar.a && this.b == dkdVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
