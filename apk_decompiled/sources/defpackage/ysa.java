package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ysa {
    public final boolean a;
    public final eta b;
    public final float c;
    public final float d;

    public ysa(boolean z, int i) {
        this.a = (i & 4) != 0 ? false : z;
        this.b = eta.NORMAL;
        this.c = 21.0f;
        this.d = 3.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ysa)) {
            return false;
        }
        ysa ysaVar = (ysa) obj;
        return this.a == ysaVar.a && this.b == ysaVar.b && this.c == ysaVar.c && this.d == ysaVar.d;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(bool, bool, Boolean.valueOf(this.a), bool, null, null, this.b, Float.valueOf(this.c), Float.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapProperties(isBuildingEnabled=false, isIndoorEnabled=false, isMyLocationEnabled=");
        sb.append(this.a);
        sb.append(", isTrafficEnabled=false, latLngBoundsForCameraTarget=null, mapStyleOptions=null, mapType=");
        sb.append(this.b);
        sb.append(", maxZoomPreference=");
        sb.append(this.c);
        sb.append(", minZoomPreference=");
        return ebh.o(sb, this.d, ')');
    }
}
