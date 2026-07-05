package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ayb implements yxb, Runnable {
    public final Runnable E;
    public final String F;

    public ayb(Runnable runnable, String str) {
        runnable.getClass();
        this.E = runnable;
        String strH = zxb.a.h(str, "_");
        Locale locale = Locale.US;
        this.F = ij0.n(locale, strH, locale);
    }

    @Override // defpackage.yxb
    public final String getName() {
        return this.F;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.run();
    }
}
