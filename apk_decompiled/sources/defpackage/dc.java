package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dc {
    public final String a;
    public final String b;
    public final cc c;
    public final Map d;

    public dc(String str, String str2, cc ccVar) {
        ccVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = ccVar;
        this.d = nm6.E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return x44.r(this.a, dcVar.a) && x44.r(this.b, dcVar.b) && this.c == dcVar.c && x44.r(this.d, dcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ActiveView(key=", this.a, ", name=", this.b, ", surface=");
        sbR.append(this.c);
        sbR.append(", attributes=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
