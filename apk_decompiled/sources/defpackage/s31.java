package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import okio.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class s31 implements yd7 {
    public final /* synthetic */ int E;
    public boolean F;
    public Object G;
    public Object H;
    public final Object I;

    public s31(Class cls) {
        this.E = 3;
        cls.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.G = uuidRandomUUID;
        String string = ((UUID) this.G).toString();
        string.getClass();
        this.H = new tgj(string, (zfj) null, cls.getName(), (String) null, (pf5) null, (pf5) null, 0L, 0L, 0L, (ql4) null, 0, (jc1) null, 0L, 0L, 0L, 0L, false, (xkc) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(tta.d0(1));
        mp0.W0(strArr, linkedHashSet);
        this.I = linkedHashSet;
    }

    public void a(String str) {
        ((LinkedHashSet) this.I).add(str);
    }

    public tgc b() {
        if (this.F && ((tgj) this.H).j.d) {
            sz6.p("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        tgc tgcVar = new tgc((UUID) this.G, (tgj) this.H, (LinkedHashSet) this.I);
        ql4 ql4Var = ((tgj) this.H).j;
        boolean z = ql4Var.g() || ql4Var.e || ql4Var.c || ql4Var.d;
        tgj tgjVar = (tgj) this.H;
        if (tgjVar.q) {
            if (z) {
                sz6.p("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (tgjVar.g > 0) {
                sz6.p("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = tgjVar.x;
        if (str == null) {
            List listY0 = bsg.Y0(tgjVar.c, new String[]{"."}, 6);
            String strJ1 = listY0.size() == 1 ? (String) listY0.get(0) : (String) w44.U0(listY0);
            if (strJ1.length() > 127) {
                strJ1 = bsg.j1(127, strJ1);
            }
            tgjVar.x = strJ1;
        } else if (str.length() > 127) {
            ((tgj) this.H).x = bsg.j1(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.G = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        tgj tgjVar2 = (tgj) this.H;
        tgjVar2.getClass();
        this.H = new tgj(string, tgjVar2.b, tgjVar2.c, tgjVar2.d, new pf5(tgjVar2.e), new pf5(tgjVar2.f), tgjVar2.g, tgjVar2.h, tgjVar2.i, new ql4(tgjVar2.j), tgjVar2.k, tgjVar2.l, tgjVar2.m, tgjVar2.n, tgjVar2.o, tgjVar2.p, tgjVar2.q, tgjVar2.r, tgjVar2.s, tgjVar2.u, tgjVar2.v, tgjVar2.w, tgjVar2.x, tgjVar2.y, 524288);
        return tgcVar;
    }

    public void c() {
        dgj.y(Thread.currentThread().equals(((AtomicReference) this.I).get()));
    }

    public void d(boolean z) {
        switch (this.E) {
            case 1:
                u66 u66Var = (u66) this.I;
                synchronized (u66Var.L) {
                    try {
                        if (this.F) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (x44.r(((o66) this.G).g, this)) {
                            u66.c(u66Var, this, z);
                        }
                        this.F = true;
                    } finally {
                    }
                }
                return;
            default:
                v66 v66Var = (v66) this.I;
                synchronized (v66Var) {
                    try {
                        if (this.F) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (x44.r(((p66) this.G).g, this)) {
                            v66.c(v66Var, this, z);
                        }
                        this.F = true;
                    } finally {
                    }
                }
                return;
        }
    }

    public Path e(int i) {
        Path path;
        Path path2;
        switch (this.E) {
            case 1:
                u66 u66Var = (u66) this.I;
                synchronized (u66Var.L) {
                    if (this.F) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.H)[i] = true;
                    Object obj = ((o66) this.G).d.get(i);
                    s66 s66Var = u66Var.U;
                    Path path3 = (Path) obj;
                    if (!s66Var.n(path3)) {
                        try {
                            s66Var.S(path3, false).close();
                            break;
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused) {
                        }
                    }
                    path = (Path) obj;
                }
                return path;
            default:
                v66 v66Var = (v66) this.I;
                synchronized (v66Var) {
                    if (this.F) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.H)[i] = true;
                    Object obj2 = ((p66) this.G).d.get(i);
                    t66 t66Var = v66Var.T;
                    Path path4 = (Path) obj2;
                    if (!t66Var.n(path4)) {
                        l.a(t66Var.S(path4, false));
                    }
                    path2 = (Path) obj2;
                }
                return path2;
        }
    }

    public void f(jc1 jc1Var, long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.F = true;
        tgj tgjVar = (tgj) this.H;
        tgjVar.l = jc1Var;
        long millis = timeUnit.toMillis(j);
        String str = tgj.z;
        if (millis > 18000000) {
            nga.c().f(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            nga.c().f(str, "Backoff delay duration less than minimum value");
        }
        tgjVar.m = wd6.f0(millis, 10000L, 18000000L);
    }

    public void g(ql4 ql4Var) {
        ((tgj) this.H).j = ql4Var;
    }

    public void h(boolean z) {
        if (z == this.F) {
            return;
        }
        k1h k1hVar = (k1h) this.I;
        if (z) {
            final int i = 0;
            k1hVar.d(new Runnable(this) { // from class: q31
                public final /* synthetic */ s31 F;

                {
                    this.F = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    s31 s31Var = this.F;
                    switch (i2) {
                        case 0:
                            ((Context) s31Var.G).registerReceiver((r31) s31Var.H, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            ((Context) s31Var.G).unregisterReceiver((r31) s31Var.H);
                            break;
                    }
                }
            });
            this.F = true;
        } else {
            final int i2 = 1;
            k1hVar.d(new Runnable(this) { // from class: q31
                public final /* synthetic */ s31 F;

                {
                    this.F = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    s31 s31Var = this.F;
                    switch (i22) {
                        case 0:
                            ((Context) s31Var.G).registerReceiver((r31) s31Var.H, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            ((Context) s31Var.G).unregisterReceiver((r31) s31Var.H);
                            break;
                    }
                }
            });
            this.F = false;
        }
    }

    public void i(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ((tgj) this.H).g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((tgj) this.H).g) {
            return;
        }
        sz6.p("The given initial delay is too large and will cause an overflow!");
    }

    @Override // defpackage.yd7
    public void j() {
        SparseArray sparseArray = (SparseArray) this.I;
        ((yd7) this.G).j();
        if (this.F) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((exg) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public void k(pf5 pf5Var) {
        pf5Var.getClass();
        ((tgj) this.H).e = pf5Var;
    }

    public void l(Runnable runnable, Executor executor) {
        synchronized (this.G) {
            try {
                if (this.F) {
                    ((ArrayDeque) this.H).add(new h5l(runnable, executor));
                } else {
                    this.F = true;
                    o(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        synchronized (this.G) {
            try {
                if (((ArrayDeque) this.H).isEmpty()) {
                    this.F = false;
                    return;
                }
                h5l h5lVar = (h5l) ((ArrayDeque) this.H).remove();
                o(h5lVar.b, h5lVar.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yd7
    public y3i n(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.I;
        yd7 yd7Var = (yd7) this.G;
        if (i2 != 3 && i2 != 5) {
            this.F = true;
        }
        if (i2 != 3) {
            return yd7Var.n(i, i2);
        }
        exg exgVar = (exg) sparseArray.get(i);
        if (exgVar != null) {
            return exgVar;
        }
        exg exgVar2 = new exg(yd7Var.n(i, i2), (bxg) this.H);
        sparseArray.put(i, exgVar2);
        return exgVar2;
    }

    public void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(new t08(this, 19, runnable));
        } catch (RejectedExecutionException unused) {
            m();
        }
    }

    @Override // defpackage.yd7
    public void q(vef vefVar) {
        ((yd7) this.G).q(vefVar);
    }

    public s31(yd7 yd7Var, bxg bxgVar) {
        this.E = 5;
        this.G = yd7Var;
        this.H = bxgVar;
        this.I = new SparseArray();
    }

    public s31() {
        this.E = 6;
        this.G = new Object();
        this.H = new ArrayDeque();
        this.I = new AtomicReference();
    }

    public s31(Context context, Looper looper, Looper looper2, r77 r77Var, g1h g1hVar) {
        this.E = 0;
        this.G = context.getApplicationContext();
        this.I = g1hVar.a(looper, null);
        this.H = new r31(this, g1hVar.a(looper2, null), r77Var);
    }

    public s31(Context context, Runnable runnable, Boolean bool) {
        this.E = 4;
        AudioManager audioManagerJ = context == null ? null : x41.j(context);
        if (audioManagerJ != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = audioManagerJ.getSpatializer();
            this.G = spatializer;
            this.F = spatializer.getImmersiveAudioLevel() != 0;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            Handler handler = new Handler(looperMyLooper);
            this.H = handler;
            lgg lggVar = new lgg(runnable);
            this.I = lggVar;
            spatializer.addOnSpatializerStateChangedListener(new e61(0, handler), lggVar);
            return;
        }
        this.G = null;
        this.F = false;
        this.H = null;
        this.I = null;
    }

    public s31(u66 u66Var, o66 o66Var) {
        this.E = 1;
        this.I = u66Var;
        this.G = o66Var;
        this.H = new boolean[2];
    }

    public s31(v66 v66Var, p66 p66Var) {
        this.E = 2;
        this.I = v66Var;
        this.G = p66Var;
        this.H = new boolean[2];
    }
}
