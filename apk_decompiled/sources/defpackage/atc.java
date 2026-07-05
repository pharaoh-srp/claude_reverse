package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class atc implements mtc {
    public final String a;
    public final jz0 b;
    public final String c;
    public final Set d;

    public atc(String str, jz0 jz0Var, String str2, Set set) {
        str.getClass();
        this.a = str;
        this.b = jz0Var;
        this.c = str2;
        this.d = set;
    }

    public final jz0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atc)) {
            return false;
        }
        atc atcVar = (atc) obj;
        return x44.r(this.a, atcVar.a) && x44.r(this.b, atcVar.b) && x44.r(this.c, atcVar.c) && this.d.equals(atcVar.d);
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jz0 jz0Var = this.b;
        int iHashCode2 = (iHashCode + (jz0Var == null ? 0 : jz0Var.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BellNote(body=" + this.a + ", markdownRoot=" + this.b + ", title=" + this.c + ", flags=" + this.d + ")";
    }
}
