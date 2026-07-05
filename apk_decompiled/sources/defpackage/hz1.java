package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class hz1 implements jz1 {
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public hz1() {
        int i = Build.VERSION.SDK_INT;
        this.b = i;
        this.c = true;
        this.d = true;
        this.e = i >= 28;
        this.f = i >= 29;
        this.g = i >= 30;
        this.h = i >= 31;
        this.i = i >= 33;
        this.j = i >= 35;
    }
}
