package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gta {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public gta(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 4) != 0 ? true : z2;
        boolean z3 = (i & 8) != 0;
        boolean z4 = (i & 16) != 0;
        boolean z5 = (i & 32) != 0;
        boolean z6 = (i & 64) != 0;
        boolean z7 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0;
        boolean z8 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0;
        boolean z9 = (i & 512) != 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gta)) {
            return false;
        }
        gta gtaVar = (gta) obj;
        return this.a == gtaVar.a && this.b == gtaVar.b && this.c == gtaVar.c && this.d == gtaVar.d && this.e == gtaVar.e && this.f == gtaVar.f && this.g == gtaVar.g && this.h == gtaVar.h && this.i == gtaVar.i;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.TRUE, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapUiSettings(compassEnabled=");
        sb.append(this.a);
        sb.append(", indoorLevelPickerEnabled=true, mapToolbarEnabled=");
        sb.append(this.b);
        sb.append(", myLocationButtonEnabled=");
        sb.append(this.c);
        sb.append(", rotationGesturesEnabled=");
        sb.append(this.d);
        sb.append(", scrollGesturesEnabled=");
        sb.append(this.e);
        sb.append(", scrollGesturesEnabledDuringRotateOrZoom=");
        sb.append(this.f);
        sb.append(", tiltGesturesEnabled=");
        sb.append(this.g);
        sb.append(", zoomControlsEnabled=");
        sb.append(this.h);
        sb.append(", zoomGesturesEnabled=");
        return y6a.p(sb, this.i, ')');
    }
}
