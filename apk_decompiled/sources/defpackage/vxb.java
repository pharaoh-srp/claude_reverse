package defpackage;

import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class vxb implements yxb, Callable {
    public final ok5 E;
    public final String F;

    public vxb(String str, ok5 ok5Var) {
        this.E = ok5Var;
        String strH = zxb.a.h(str, "_");
        Locale locale = Locale.US;
        this.F = ij0.n(locale, strH, locale);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.E.call();
    }

    @Override // defpackage.yxb
    public final String getName() {
        return this.F;
    }
}
