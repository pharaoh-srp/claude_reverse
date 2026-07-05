package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class xbh {
    public static final String[] f = {"device", "os", "type", "status", "message", "error"};
    public final tbh a;
    public final vbh b;
    public final String c;
    public final ubh d;
    public final LinkedHashMap e;

    public xbh(tbh tbhVar, vbh vbhVar, String str, ubh ubhVar, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.a = tbhVar;
        this.b = vbhVar;
        this.c = str;
        this.d = ubhVar;
        this.e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbh)) {
            return false;
        }
        xbh xbhVar = (xbh) obj;
        return x44.r(this.a, xbhVar.a) && x44.r(this.b, xbhVar.b) && x44.r(this.c, xbhVar.c) && x44.r(this.d, xbhVar.d) && this.e.equals(xbhVar.e);
    }

    public final int hashCode() {
        tbh tbhVar = this.a;
        int iHashCode = (tbhVar == null ? 0 : tbhVar.hashCode()) * 31;
        vbh vbhVar = this.b;
        int iL = kgh.l((iHashCode + (vbhVar == null ? 0 : vbhVar.hashCode())) * 31, 31, this.c);
        ubh ubhVar = this.d;
        return this.e.hashCode() + ((iL + (ubhVar != null ? ubhVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Telemetry(device=" + this.a + ", os=" + this.b + ", message=" + this.c + ", error=" + this.d + ", additionalProperties=" + this.e + ")";
    }
}
