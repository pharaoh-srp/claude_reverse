package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bg4 {
    public final boolean a;
    public final Map b;
    public final int c;
    public final int d;
    public final ql8 e;
    public final rk5 f;
    public final int g;
    public final pb1 h;

    public bg4(boolean z, Map map, int i, int i2, ql8 ql8Var, rk5 rk5Var, int i3, pb1 pb1Var) {
        sq6.a(i);
        sq6.a(i2);
        rk5Var.getClass();
        sq6.a(i3);
        this.a = z;
        this.b = map;
        this.c = i;
        this.d = i2;
        this.e = ql8Var;
        this.f = rk5Var;
        this.g = i3;
        this.h = pb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg4)) {
            return false;
        }
        bg4 bg4Var = (bg4) obj;
        return this.a == bg4Var.a && this.b.equals(bg4Var.b) && this.c == bg4Var.c && this.d == bg4Var.d && this.e.equals(bg4Var.e) && this.f == bg4Var.f && this.g == bg4Var.g && this.h.equals(bg4Var.h);
    }

    public final int hashCode() {
        return (this.h.hashCode() + qy1.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + qy1.c(this.d, qy1.c(this.c, ebh.g(fsh.p(Boolean.hashCode(this.a) * 31, 31, false), 31, this.b), 31), 961)) * 961)) * 31, 961)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Core(needsClearTextHttp=");
        sb.append(this.a);
        sb.append(", enableDeveloperModeWhenDebuggable=false, firstPartyHostsWithHeaderTypes=");
        sb.append(this.b);
        sb.append(", batchSize=");
        String str = "MEDIUM";
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "LARGE" : "MEDIUM" : "SMALL");
        sb.append(", uploadFrequency=");
        sb.append(kgh.v(this.d));
        sb.append(", proxy=null, proxyAuth=");
        sb.append(this.e);
        sb.append(", encryption=null, site=");
        sb.append(this.f);
        sb.append(", batchProcessingLevel=");
        int i2 = this.g;
        if (i2 == 1) {
            str = "LOW";
        } else if (i2 != 2) {
            str = i2 != 3 ? "null" : "HIGH";
        }
        sb.append(str);
        sb.append(", persistenceStrategyFactory=null, backpressureStrategy=");
        sb.append(this.h);
        sb.append(", uploadSchedulerStrategy=null)");
        return sb.toString();
    }
}
