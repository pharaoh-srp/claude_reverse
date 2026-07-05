package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class atb implements fjb {
    public final float a;
    public final float b;

    public atb(float f, float f2) {
        fd9.C("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && atb.class == obj.getClass()) {
            atb atbVar = (atb) obj;
            if (this.a == atbVar.a && this.b == atbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
