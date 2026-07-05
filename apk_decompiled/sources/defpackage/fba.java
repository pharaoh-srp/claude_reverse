package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class fba {
    public final Executor a;
    public volatile Object b;
    public volatile dba c;

    public fba(Looper looper, Object obj, String str) {
        this.a = new bf8(looper);
        dgj.w("Listener must not be null", obj);
        this.b = obj;
        dgj.s(str);
        this.c = new dba(str, obj);
    }

    public final dba a() {
        return this.c;
    }

    public final void b(eba ebaVar) {
        this.a.execute(new t08(this, 7, ebaVar));
    }

    public fba(m4k m4kVar) {
        this.a = mbk.E;
        this.b = m4kVar;
        dgj.s("GetCurrentLocation");
        this.c = new dba("GetCurrentLocation", m4kVar);
    }
}
