package defpackage;

import android.app.Activity;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d8f {
    public final pkc a;
    public final zy1 b = wd6.P(0, 6, null);
    public final boolean c;
    public Activity d;
    public final u0h e;

    public d8f(pkc pkcVar) {
        this.a = pkcVar;
        this.c = Build.VERSION.SDK_INT >= 34;
        this.e = new u0h(new p3f(5, this));
    }
}
