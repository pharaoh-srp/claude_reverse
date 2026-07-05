package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lch {
    public static final String[] e = {"device", "os", "type", "usage"};
    public final ich a;
    public final jch b;
    public final mch c;
    public final LinkedHashMap d;

    public lch(ich ichVar, jch jchVar, mch mchVar, LinkedHashMap linkedHashMap) {
        this.a = ichVar;
        this.b = jchVar;
        this.c = mchVar;
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lch)) {
            return false;
        }
        lch lchVar = (lch) obj;
        return this.a.equals(lchVar.a) && this.b.equals(lchVar.b) && this.c.equals(lchVar.c) && this.d.equals(lchVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Telemetry(device=" + this.a + ", os=" + this.b + ", usage=" + this.c + ", additionalProperties=" + this.d + ")";
    }
}
