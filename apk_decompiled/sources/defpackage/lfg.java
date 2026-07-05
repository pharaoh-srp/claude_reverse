package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lfg {
    public static final String[] j = {"version", "_dd", "span", "tracer", "usr", "account", "network", "device", "os"};
    public final String a;
    public final jfg b;
    public final zl4 c;
    public final rfg d;
    public final sfg e;
    public final nfg f;
    public final kfg g;
    public final ofg h;
    public final Map i;

    public lfg(String str, jfg jfgVar, zl4 zl4Var, rfg rfgVar, sfg sfgVar, jwj jwjVar, nfg nfgVar, kfg kfgVar, ofg ofgVar, Map map) {
        str.getClass();
        this.a = str;
        this.b = jfgVar;
        this.c = zl4Var;
        this.d = rfgVar;
        this.e = sfgVar;
        this.f = nfgVar;
        this.g = kfgVar;
        this.h = ofgVar;
        this.i = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lfg) {
            lfg lfgVar = (lfg) obj;
            if (x44.r(this.a, lfgVar.a) && this.b.equals(lfgVar.b) && this.c == lfgVar.c && this.d.equals(lfgVar.d) && this.e.equals(lfgVar.e) && x44.r(null, null) && x44.r(this.f, lfgVar.f) && this.g.equals(lfgVar.g) && this.h.equals(lfgVar.h) && this.i.equals(lfgVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.e.hashCode() + kgh.l((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a)) * 31) + 0) * 31;
        nfg nfgVar = this.f;
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((iHashCode + (nfgVar != null ? nfgVar.a.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Meta(version=" + this.a + ", dd=" + this.b + ", span=" + this.c + ", tracer=" + this.d + ", usr=" + this.e + ", account=" + ((Object) null) + ", network=" + this.f + ", device=" + this.g + ", os=" + this.h + ", additionalProperties=" + this.i + ")";
    }
}
