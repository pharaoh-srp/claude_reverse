package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fbh {
    public static final String[] f = {"device", "os", "type", "configuration"};
    public final bbh a;
    public final cbh b;
    public final abh c;
    public final Map d;
    public final String e;

    public fbh(bbh bbhVar, cbh cbhVar, abh abhVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = bbhVar;
        this.b = cbhVar;
        this.c = abhVar;
        this.d = linkedHashMap;
        this.e = "configuration";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbh)) {
            return false;
        }
        fbh fbhVar = (fbh) obj;
        return x44.r(this.a, fbhVar.a) && x44.r(this.b, fbhVar.b) && x44.r(this.c, fbhVar.c) && x44.r(this.d, fbhVar.d);
    }

    public final int hashCode() {
        bbh bbhVar = this.a;
        int iHashCode = (bbhVar == null ? 0 : bbhVar.hashCode()) * 31;
        cbh cbhVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (cbhVar != null ? cbhVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Telemetry(device=" + this.a + ", os=" + this.b + ", configuration=" + this.c + ", additionalProperties=" + this.d + ")";
    }
}
