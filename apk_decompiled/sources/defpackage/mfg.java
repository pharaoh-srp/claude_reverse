package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mfg {
    public static final String[] c = {"_top_level"};
    public final Long a;
    public final Map b;

    public mfg(Long l, Map map) {
        this.a = l;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfg)) {
            return false;
        }
        mfg mfgVar = (mfg) obj;
        return x44.r(this.a, mfgVar.a) && this.b.equals(mfgVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "Metrics(topLevel=" + this.a + ", additionalProperties=" + this.b + ")";
    }
}
