package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class wkb {
    public static final Object b = new Object();
    public static wkb c;
    public ra4 a;

    public static wkb c() {
        wkb wkbVar;
        synchronized (b) {
            dgj.x("MlKitContext has not been initialized", c != null);
            wkbVar = c;
            dgj.v(wkbVar);
        }
        return wkbVar;
    }

    public final Object a(Class cls) {
        dgj.x("MlKitContext has been deleted", c == this);
        dgj.v(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
