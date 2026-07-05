package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class hr1 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public hr1(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            hz.k();
            porterDuffColorFilter = hz.d(d4c.n0(j), wd6.C0(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(d4c.n0(j), wd6.D0(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr1)) {
            return false;
        }
        hr1 hr1Var = (hr1) obj;
        return d54.c(this.b, hr1Var.b) && this.c == hr1Var.c;
    }

    public final int hashCode() {
        int i = d54.i;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        y6a.q(this.b, ", blendMode=", sb);
        sb.append((Object) yb5.P(this.c));
        sb.append(')');
        return sb.toString();
    }
}
