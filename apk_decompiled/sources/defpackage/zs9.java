package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zs9 implements ws9 {
    public final zxk E;
    public final ire F;
    public final Executor G;
    public final AtomicReference H;
    public final poj I = new poj(14);
    public final tmk J;

    public zs9(ffk ffkVar, zxk zxkVar, Executor executor) {
        this.E = zxkVar;
        this.G = executor;
        this.H = new AtomicReference(ffkVar);
        ffkVar.getClass();
        this.J = tmk.TYPE_THIN;
        this.F = new ire(wkb.c().b(), 15);
    }

    public static final mmk i() {
        fnf fnfVar = new fnf(24, false);
        fnfVar.F = Float.valueOf(-1.0f);
        return new mmk(fnfVar);
    }

    @Override // defpackage.njc
    public final jf7[] c() {
        return this.J == tmk.TYPE_THICK ? ojc.a : new jf7[]{ojc.b};
    }

    @Override // defpackage.ws9, java.io.Closeable, java.lang.AutoCloseable
    @fec(y3a.ON_DESTROY)
    public void close() {
        ffk ffkVar = (ffk) this.H.getAndSet(null);
        if (ffkVar == null) {
            return;
        }
        this.I.H();
        dgj.y(ffkVar.b.get() > 0);
        ffkVar.a.l(new t08(ffkVar, 15, new j5h()), this.G);
        smk smkVar = new smk();
        smkVar.c = this.J;
        uvj uvjVar = new uvj(5);
        uvjVar.G = i();
        smkVar.d = new vrk(uvjVar);
        s20 s20Var = new s20(smkVar, 1);
        zxk zxkVar = this.E;
        r5l r5lVar = zxkVar.e;
        qjk.E.execute(new me2(zxkVar, s20Var, xmk.ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE, r5lVar.g() ? (String) r5lVar.e() : n3a.c.a(zxkVar.g), 4, false));
    }

    public final r5l e(String str) {
        dgj.w("Text can not be null", str);
        ffk ffkVar = (ffk) this.H.get();
        dgj.x("LanguageIdentification has been closed", ffkVar != null);
        g7k g7kVar = new g7k(this, ffkVar, str, !ffkVar.c.get());
        final fnf fnfVar = (fnf) this.I.E;
        dgj.y(ffkVar.b.get() > 0);
        if (((r5l) fnfVar.F).f()) {
            r5l r5lVar = new r5l();
            r5lVar.o();
            return r5lVar;
        }
        final poj pojVar = new poj(14);
        final j5h j5hVar = new j5h((fnf) pojVar.E);
        final Executor executor = this.G;
        ffkVar.a.l(new qsb(ffkVar, fnfVar, pojVar, g7kVar, j5hVar), new Executor() { // from class: xyk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (((r5l) fnfVar.F).f()) {
                        pojVar.H();
                    } else {
                        j5hVar.a(e);
                    }
                    throw e;
                }
            }
        });
        return j5hVar.a;
    }

    public final void f(long j, boolean z, hrk hrkVar, wmk wmkVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        zxk zxkVar = this.E;
        xmk xmkVar = xmk.ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT;
        zxkVar.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap map = zxkVar.i;
        if (map.get(xmkVar) == null || jElapsedRealtime2 - ((Long) map.get(xmkVar)).longValue() > 30000) {
            map.put(xmkVar, Long.valueOf(jElapsedRealtime2));
            uvj uvjVar = new uvj(5);
            uvjVar.G = i();
            uvj uvjVar2 = new uvj(4);
            uvjVar2.F = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime);
            uvjVar2.H = Boolean.valueOf(z);
            uvjVar2.G = wmkVar;
            uvjVar.F = new slk(uvjVar2);
            if (hrkVar != null) {
                uvjVar.H = hrkVar;
            }
            smk smkVar = new smk();
            smkVar.c = this.J;
            smkVar.d = new vrk(uvjVar);
            s20 s20Var = new s20(smkVar, 0);
            r5l r5lVar = zxkVar.e;
            qjk.E.execute(new me2(zxkVar, s20Var, xmkVar, r5lVar.g() ? (String) r5lVar.e() : n3a.c.a(zxkVar.g), 4, false));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ire ireVar = this.F;
        int i = this.J == tmk.TYPE_THICK ? 24603 : 24602;
        int i2 = wmkVar.E;
        long j2 = jCurrentTimeMillis - jElapsedRealtime;
        synchronized (ireVar) {
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) ireVar.G).get() != -1 && jElapsedRealtime3 - ((AtomicLong) ireVar.G).get() <= 1800000) {
                return;
            }
            ((snj) ireVar.F).e(new ibh(0, Arrays.asList(new vjb(i, i2, 0, j2, jCurrentTimeMillis, null, null, 0, -1)))).a(new xg8(ireVar, jElapsedRealtime3));
        }
    }
}
