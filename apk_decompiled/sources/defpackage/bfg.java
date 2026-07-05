package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bfg extends eh7 {
    public final ky8 a;
    public final String b;
    public final rg5 c;

    public bfg(ky8 ky8Var, String str, rg5 rg5Var) {
        this.a = ky8Var;
        this.b = str;
        this.c = rg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfg)) {
            return false;
        }
        bfg bfgVar = (bfg) obj;
        return this.a.equals(bfgVar.a) && x44.r(this.b, bfgVar.b) && this.c == bfgVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
