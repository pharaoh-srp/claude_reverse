package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ckg {
    public final cx4 a;
    public final twj b;
    public final String c;

    public ckg(cx4 cx4Var, twj twjVar, String str) {
        cx4Var.getClass();
        this.a = cx4Var;
        this.b = twjVar;
        this.c = str;
    }

    public static ckg a(ckg ckgVar, twj twjVar) {
        cx4 cx4Var = ckgVar.a;
        String str = ckgVar.c;
        cx4Var.getClass();
        return new ckg(cx4Var, twjVar, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckg)) {
            return false;
        }
        ckg ckgVar = (ckg) obj;
        return x44.r(this.a, ckgVar.a) && this.b.equals(ckgVar.b) && this.c.equals(ckgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StagedUpload(file=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", id=");
        return ij0.m(sb, this.c, ")");
    }
}
