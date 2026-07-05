package defpackage;

import okio.AsyncTimeout;

/* JADX INFO: loaded from: classes.dex */
public final class e4e extends AsyncTimeout {
    public final /* synthetic */ f4e o;

    public e4e(f4e f4eVar) {
        this.o = f4eVar;
    }

    @Override // okio.AsyncTimeout
    public final void n() {
        this.o.cancel();
    }
}
