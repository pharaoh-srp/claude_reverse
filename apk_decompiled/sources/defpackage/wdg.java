package defpackage;

import com.lyft.kronos.internal.ntp.a;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class wdg {
    public final AtomicReference a = new AtomicReference(udg.E);
    public final AtomicLong b = new AtomicLong(0);
    public final ExecutorService c = Executors.newSingleThreadExecutor(vdg.a);
    public final a d;
    public final cbf e;
    public final rga f;
    public final List g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;

    public wdg(a aVar, unb unbVar, cbf cbfVar, rga rgaVar, List list, long j, long j2, long j3, long j4) {
        this.d = aVar;
        this.e = cbfVar;
        this.f = rgaVar;
        this.g = list;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = j4;
    }

    public final void a() {
        if (((udg) this.a.get()) != udg.G) {
            return;
        }
        sz6.j("Service already shutdown");
    }

    public final void b() {
        a();
        if (((udg) this.a.get()) != udg.F) {
            this.c.submit(new m(5, this));
        }
    }
}
