package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class k7c {
    public final Bundle a;
    public IconCompat b;
    public final bfe[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final CharSequence i;
    public final PendingIntent j;
    public final boolean k;

    public k7c(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, bfe[] bfeVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.a;
            if ((i2 == -1 ? ltk.o(iconCompat.b) : i2) == 2) {
                this.h = iconCompat.d();
            }
        }
        this.i = o7c.d(charSequence);
        this.j = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = bfeVarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
        this.g = z3;
        this.k = z4;
    }
}
