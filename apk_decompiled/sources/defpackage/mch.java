package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mch {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public mch(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mch)) {
            return false;
        }
        mch mchVar = (mch) obj;
        return this.a == mchVar.a && this.b == mchVar.b && this.c == mchVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddViewLoadingTime(noView=");
        sb.append(this.a);
        sb.append(", noActiveView=");
        sb.append(this.b);
        sb.append(", overwritten=");
        return sq6.v(")", sb, this.c);
    }
}
