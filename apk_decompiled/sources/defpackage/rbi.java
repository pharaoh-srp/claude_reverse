package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;

/* JADX INFO: loaded from: classes.dex */
public final class rbi {
    public final xt7 a;
    public final dv7 b;
    public final int c;
    public final int d;
    public final Object e;

    public rbi(xt7 xt7Var, dv7 dv7Var, int i, int i2, Object obj) {
        this.a = xt7Var;
        this.b = dv7Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbi)) {
            return false;
        }
        rbi rbiVar = (rbi) obj;
        return x44.r(this.a, rbiVar.a) && x44.r(this.b, rbiVar.b) && this.c == rbiVar.c && this.d == rbiVar.d && x44.r(this.e, rbiVar.e);
    }

    public final int hashCode() {
        xt7 xt7Var = this.a;
        int iC = vb7.c(this.d, vb7.c(this.c, (((xt7Var == null ? 0 : xt7Var.hashCode()) * 31) + this.b.E) * 31, 31), 31);
        Object obj = this.e;
        return iC + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = BaseEvent.ALL_INTEGRATIONS_KEY;
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
