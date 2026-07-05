package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class obh {
    public static final String[] e = {"device", "os", "type", "status", "message"};
    public final lbh a;
    public final mbh b;
    public final String c;
    public final LinkedHashMap d;

    public obh(lbh lbhVar, mbh mbhVar, String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.a = lbhVar;
        this.b = mbhVar;
        this.c = str;
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obh)) {
            return false;
        }
        obh obhVar = (obh) obj;
        return x44.r(this.a, obhVar.a) && x44.r(this.b, obhVar.b) && x44.r(this.c, obhVar.c) && this.d.equals(obhVar.d);
    }

    public final int hashCode() {
        lbh lbhVar = this.a;
        int iHashCode = (lbhVar == null ? 0 : lbhVar.hashCode()) * 31;
        mbh mbhVar = this.b;
        return this.d.hashCode() + kgh.l((iHashCode + (mbhVar != null ? mbhVar.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Telemetry(device=" + this.a + ", os=" + this.b + ", message=" + this.c + ", additionalProperties=" + this.d + ")";
    }
}
