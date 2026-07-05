package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zqb {
    public final zf a;
    public final int b;
    public final String c;
    public final String d;

    public zqb(zf zfVar, int i, String str, String str2) {
        this.a = zfVar;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zqb)) {
            return false;
        }
        zqb zqbVar = (zqb) obj;
        return this.a == zqbVar.a && this.b == zqbVar.b && this.c.equals(zqbVar.c) && this.d.equals(zqbVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.a);
        sb.append(", keyId=");
        sb.append(this.b);
        sb.append(", keyType='");
        return vb7.t(sb, this.c, "', keyPrefix='", this.d, "')");
    }
}
