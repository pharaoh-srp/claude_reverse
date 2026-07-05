package defpackage;

import com.anthropic.claude.api.account.GrowthBookFeature;

/* JADX INFO: loaded from: classes.dex */
public final class pg7 {
    public final String a;
    public final GrowthBookFeature b;
    public final Object c;
    public final boolean d;

    public pg7(String str, GrowthBookFeature growthBookFeature, Object obj, boolean z) {
        str.getClass();
        this.a = str;
        this.b = growthBookFeature;
        this.c = obj;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg7)) {
            return false;
        }
        pg7 pg7Var = (pg7) obj;
        return x44.r(this.a, pg7Var.a) && this.b.equals(pg7Var.b) && x44.r(this.c, pg7Var.c) && this.d == pg7Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Object obj = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        return "FeatureResult(featureId=" + this.a + ", feature=" + this.b + ", parsedValue=" + this.c + ", isLocalOverride=" + this.d + ")";
    }
}
