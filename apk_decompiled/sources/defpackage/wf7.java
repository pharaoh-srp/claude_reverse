package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class wf7 {
    public final JsonElement a;
    public final String b;
    public final Integer c;

    public wf7(JsonElement jsonElement, String str, Integer num) {
        jsonElement.getClass();
        this.a = jsonElement;
        this.b = str;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf7)) {
            return false;
        }
        wf7 wf7Var = (wf7) obj;
        return x44.r(this.a, wf7Var.a) && x44.r(this.b, wf7Var.b) && x44.r(this.c, wf7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "FeatureExposureState(value=" + this.a + ", experimentKey=" + this.b + ", variationId=" + this.c + ")";
    }
}
