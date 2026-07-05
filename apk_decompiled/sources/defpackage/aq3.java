package defpackage;

import android.util.CloseGuard;

/* JADX INFO: loaded from: classes3.dex */
public final class aq3 implements bq3 {
    public final CloseGuard E = new CloseGuard();

    @Override // defpackage.bq3
    public final void c() {
        this.E.warnIfOpen();
    }

    @Override // defpackage.bq3
    public final void close() {
        this.E.close();
    }

    @Override // defpackage.bq3
    public final void f() {
        this.E.open("close");
    }
}
