package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.health.platform.client.proto.g;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class d87 implements Handler.Callback, r7b, jui {
    public static final long K0 = tpi.M(10000);
    public long A0;
    public long B0;
    public int C0;
    public boolean D0;
    public final cp3[] E;
    public ExoPlaybackException E0;
    public final pe1[] F;
    public long F0;
    public final boolean[] G;
    public i77 G0;
    public final gv5 H;
    public long H0;
    public final f4i I;
    public boolean I0;
    public final es5 J;
    public float J0;
    public final yp5 K;
    public final k1h L;
    public final o5l M;
    public final Looper N;
    public final kqh O;
    public final jqh P;
    public final long Q;
    public final ks5 R;
    public final ArrayList S;
    public final g1h T;
    public final l77 U;
    public final v7b V;
    public final o8b W;
    public final cs5 X;
    public final long Y;
    public final z6d Z;
    public final hp5 a0;
    public final k1h b0;
    public final boolean c0;
    public final v41 d0;
    public final boolean e0;
    public wef f0;
    public taf g0;
    public boolean h0;
    public boolean i0;
    public c87 j0;
    public int k0;
    public j6d l0;
    public a87 m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public long r0;
    public boolean s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public c87 z0;

    public d87(Context context, pe1[] pe1VarArr, pe1[] pe1VarArr2, gv5 gv5Var, f4i f4iVar, es5 es5Var, yp5 yp5Var, hp5 hp5Var, wef wefVar, cs5 cs5Var, long j, Looper looper, g1h g1hVar, l77 l77Var, z6d z6dVar, final jui juiVar, boolean z) {
        Looper looper2;
        i77 i77Var = i77.a;
        this.H0 = -9223372036854775807L;
        this.U = l77Var;
        this.H = gv5Var;
        this.I = f4iVar;
        this.J = es5Var;
        this.K = yp5Var;
        boolean z2 = false;
        this.t0 = 0;
        this.u0 = false;
        this.f0 = wefVar;
        this.X = cs5Var;
        this.Y = j;
        this.o0 = false;
        this.T = g1hVar;
        this.Z = z6dVar;
        this.G0 = i77Var;
        this.a0 = hp5Var;
        this.J0 = 1.0f;
        this.g0 = taf.b;
        this.e0 = z;
        this.F0 = -9223372036854775807L;
        this.r0 = -9223372036854775807L;
        this.Q = es5Var.n;
        iqh iqhVar = mqh.a;
        j6d j6dVarJ = j6d.j(f4iVar);
        this.l0 = j6dVarJ;
        this.m0 = new a87(j6dVarJ);
        this.F = new pe1[pe1VarArr.length];
        this.G = new boolean[pe1VarArr.length];
        gv5Var.getClass();
        this.E = new cp3[pe1VarArr.length];
        boolean z3 = false;
        for (int i = 0; i < pe1VarArr.length; i++) {
            pe1 pe1Var = pe1VarArr[i];
            pe1Var.I = i;
            pe1Var.J = z6dVar;
            pe1Var.K = g1hVar;
            this.F[i] = pe1Var;
            pe1 pe1Var2 = this.F[i];
            synchronized (pe1Var2.E) {
                pe1Var2.V = gv5Var;
            }
            pe1 pe1Var3 = pe1VarArr2[i];
            if (pe1Var3 != null) {
                pe1Var3.I = i;
                pe1Var3.J = z6dVar;
                pe1Var3.K = g1hVar;
                z3 = true;
            }
            cp3[] cp3VarArr = this.E;
            pe1 pe1Var4 = pe1VarArr[i];
            cp3 cp3Var = new cp3();
            cp3Var.e = pe1Var4;
            cp3Var.a = i;
            cp3Var.f = pe1Var3;
            cp3Var.b = 0;
            cp3Var.c = false;
            cp3Var.d = false;
            cp3VarArr[i] = cp3Var;
        }
        this.c0 = z3;
        this.R = new ks5(this, g1hVar);
        this.S = new ArrayList();
        this.O = new kqh();
        this.P = new jqh();
        fd9.M(gv5Var.a == null);
        gv5Var.a = this;
        gv5Var.b = yp5Var;
        this.D0 = true;
        k1h k1hVarA = g1hVar.a(looper, null);
        this.b0 = k1hVarA;
        this.V = new v7b(hp5Var, k1hVarA, new do0(23, this));
        this.W = new o8b(this, hp5Var, k1hVarA, z6dVar);
        o5l o5lVar = new o5l();
        this.M = o5lVar;
        synchronized (o5lVar.G) {
            try {
                if (((Looper) o5lVar.H) == null) {
                    if (o5lVar.F == 0 && ((HandlerThread) o5lVar.I) == null) {
                        z2 = true;
                    }
                    fd9.M(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    o5lVar.I = handlerThread;
                    handlerThread.start();
                    o5lVar.H = ((HandlerThread) o5lVar.I).getLooper();
                }
                o5lVar.F++;
                looper2 = (Looper) o5lVar.H;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.N = looper2;
        k1h k1hVarA2 = g1hVar.a(looper2, this);
        this.L = k1hVarA2;
        this.d0 = new v41(context, looper2, this);
        k1hVarA2.b(35, new jui() { // from class: w77
            @Override // defpackage.jui
            public final void b(long j2, long j3, jw7 jw7Var, MediaFormat mediaFormat) {
                juiVar.b(j2, j3, jw7Var, mediaFormat);
                this.E.b(j2, j3, jw7Var, mediaFormat);
            }
        }).b();
        k1hVarA2.b(39, new x77(this)).b();
    }

    public static Pair S(mqh mqhVar, c87 c87Var, boolean z, int i, boolean z2, kqh kqhVar, jqh jqhVar) {
        int iT;
        mqh mqhVar2 = c87Var.a;
        if (mqhVar.p()) {
            return null;
        }
        mqh mqhVar3 = mqhVar2.p() ? mqhVar : mqhVar2;
        try {
            Pair pairI = mqhVar3.i(kqhVar, jqhVar, c87Var.b, c87Var.c);
            if (!mqhVar.equals(mqhVar3)) {
                if (mqhVar.b(pairI.first) == -1) {
                    if (!z || (iT = T(kqhVar, jqhVar, i, z2, pairI.first, mqhVar3, mqhVar)) == -1) {
                        return null;
                    }
                    return mqhVar.i(kqhVar, jqhVar, iT, -9223372036854775807L);
                }
                if (mqhVar3.g(pairI.first, jqhVar).f && mqhVar3.m(jqhVar.c, kqhVar, 0L).l == mqhVar3.b(pairI.first)) {
                    return mqhVar.i(kqhVar, jqhVar, mqhVar.g(pairI.first, jqhVar).c, c87Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(kqh kqhVar, jqh jqhVar, int i, boolean z, Object obj, mqh mqhVar, mqh mqhVar2) {
        kqh kqhVar2 = kqhVar;
        mqh mqhVar3 = mqhVar;
        Object obj2 = mqhVar3.m(mqhVar3.g(obj, jqhVar).c, kqhVar, 0L).a;
        for (int i2 = 0; i2 < mqhVar2.o(); i2++) {
            if (mqhVar2.m(i2, kqhVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = mqhVar3.b(obj);
        int iH = mqhVar3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            mqh mqhVar4 = mqhVar3;
            int iD = mqhVar4.d(iB, jqhVar, kqhVar2, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = mqhVar2.b(mqhVar4.l(iD));
            i3++;
            mqhVar3 = mqhVar4;
            iB = iD;
            kqhVar2 = kqhVar;
        }
        if (iB2 == -1) {
            return -1;
        }
        return mqhVar2.f(iB2, jqhVar, false).c;
    }

    public static boolean z(t7b t7bVar) {
        if (t7bVar != null) {
            try {
                s7b s7bVar = t7bVar.a;
                if (t7bVar.e) {
                    for (b4f b4fVar : t7bVar.c) {
                        if (b4fVar != null) {
                            b4fVar.g();
                        }
                    }
                } else {
                    s7bVar.f();
                }
                if ((!t7bVar.e ? 0L : s7bVar.d()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, z7b z7bVar) {
        v7b v7bVar = this.V;
        t7b t7bVar = v7bVar.k;
        if (t7bVar != null && t7bVar.g.a.equals(z7bVar)) {
            cp3 cp3Var = this.E[i];
            t7b t7bVar2 = v7bVar.k;
            int i2 = cp3Var.b;
            boolean z = (i2 == 2 || i2 == 4) && cp3Var.d(t7bVar2) == ((pe1) cp3Var.e);
            boolean z2 = cp3Var.b == 3 && cp3Var.d(t7bVar2) == ((pe1) cp3Var.f);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void A0(boolean z, int i, int i2, int i3) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.h0;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        j6d j6dVar = this.l0;
        if (j6dVar.l == z2 && j6dVar.n == i2 && j6dVar.m == i3) {
            return;
        }
        this.l0 = j6dVar.e(i3, i2, z2);
        D0(false, false);
        v7b v7bVar = this.V;
        for (t7b t7bVar = v7bVar.i; t7bVar != null; t7bVar = t7bVar.m) {
            for (f87 f87Var : (f87[]) t7bVar.o.G) {
                if (f87Var != null) {
                    f87Var.b(z2);
                }
            }
        }
        if (!r0()) {
            v0();
            B0();
            j6d j6dVar2 = this.l0;
            if (j6dVar2.p) {
                this.l0 = j6dVar2.h(false);
            }
            v7bVar.m(this.A0);
            return;
        }
        int i4 = this.l0.e;
        k1h k1hVar = this.L;
        if (i4 != 3) {
            if (i4 == 2) {
                k1hVar.f(2);
            }
        } else {
            ks5 ks5Var = this.R;
            ks5Var.J = true;
            ks5Var.E.f();
            t0();
            k1hVar.f(2);
        }
    }

    public final boolean B() {
        t7b t7bVar = this.V.i;
        long j = t7bVar.g.f;
        if (t7bVar.e) {
            return j == -9223372036854775807L || this.l0.s < j || !r0();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0() {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.B0():void");
    }

    public final void C() {
        boolean zB;
        if (z(this.V.l)) {
            t7b t7bVar = this.V.l;
            long jP = p(!t7bVar.e ? 0L : t7bVar.a.d());
            t7b t7bVar2 = this.V.i;
            long j = s0(this.l0.a, t7bVar.g.a) ? this.X.h : -9223372036854775807L;
            z6d z6dVar = this.Z;
            mqh mqhVar = this.l0.a;
            z7b z7bVar = t7bVar.g.a;
            float f = this.R.e().a;
            boolean z = this.l0.l;
            tba tbaVar = new tba(z6dVar, mqhVar, z7bVar, jP, f, this.q0, j);
            zB = this.J.b(tbaVar);
            t7b t7bVar3 = this.V.i;
            if (!zB && t7bVar3.e && jP < 500000 && this.Q > 0) {
                t7bVar3.a.h(this.l0.s);
                zB = this.J.b(tbaVar);
            }
        } else {
            zB = false;
        }
        this.s0 = zB;
        if (zB) {
            t7b t7bVar4 = this.V.l;
            t7bVar4.getClass();
            nca ncaVar = new nca();
            ncaVar.a = this.A0 - t7bVar4.p;
            float f2 = this.R.e().a;
            fd9.E(f2 > MTTypesetterKt.kLineSkipLimitMultiplier || f2 == -3.4028235E38f);
            ncaVar.b = f2;
            long j2 = this.r0;
            fd9.E(j2 >= 0 || j2 == -9223372036854775807L);
            ncaVar.c = j2;
            oca ocaVar = new oca(ncaVar);
            fd9.M(t7bVar4.m == null);
            t7bVar4.a.o(ocaVar);
        }
        w0();
    }

    public final void C0(mqh mqhVar, z7b z7bVar, mqh mqhVar2, z7b z7bVar2, long j, boolean z) {
        boolean zS0 = s0(mqhVar, z7bVar);
        Object obj = z7bVar.a;
        if (!zS0) {
            l6d l6dVar = z7bVar.b() ? l6d.d : this.l0.o;
            ks5 ks5Var = this.R;
            if (ks5Var.e().equals(l6dVar)) {
                return;
            }
            this.L.e(16);
            ks5Var.a(l6dVar);
            x(this.l0.o, l6dVar.a, false, false);
            return;
        }
        jqh jqhVar = this.P;
        int i = mqhVar.g(obj, jqhVar).c;
        kqh kqhVar = this.O;
        mqhVar.n(i, kqhVar);
        f7b f7bVar = kqhVar.h;
        cs5 cs5Var = this.X;
        cs5Var.getClass();
        cs5Var.c = tpi.C(f7bVar.a);
        cs5Var.f = tpi.C(f7bVar.b);
        cs5Var.g = tpi.C(f7bVar.c);
        float f = f7bVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        cs5Var.j = f;
        float f2 = f7bVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        cs5Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            cs5Var.c = -9223372036854775807L;
        }
        cs5Var.a();
        if (j != -9223372036854775807L) {
            cs5Var.d = m(mqhVar, obj, j);
            cs5Var.a();
            return;
        }
        if (!Objects.equals(!mqhVar2.p() ? mqhVar2.m(mqhVar2.g(z7bVar2.a, jqhVar).c, kqhVar, 0L).a : null, kqhVar.a) || z) {
            cs5Var.d = -9223372036854775807L;
            cs5Var.a();
        }
    }

    public final void D() {
        v7b v7bVar = this.V;
        v7bVar.k();
        t7b t7bVar = v7bVar.m;
        if (t7bVar != null) {
            s7b s7bVar = t7bVar.a;
            if ((!t7bVar.d || t7bVar.e) && !s7bVar.b()) {
                mqh mqhVar = this.l0.a;
                if (t7bVar.e) {
                    s7bVar.p();
                }
                Iterator it = this.J.p.values().iterator();
                while (it.hasNext()) {
                    if (((ds5) it.next()).b) {
                        return;
                    }
                }
                if (!t7bVar.d) {
                    long j = t7bVar.g.b;
                    t7bVar.d = true;
                    s7bVar.l(this, j);
                    return;
                }
                nca ncaVar = new nca();
                ncaVar.a = this.A0 - t7bVar.p;
                float f = this.R.e().a;
                fd9.E(f > MTTypesetterKt.kLineSkipLimitMultiplier || f == -3.4028235E38f);
                ncaVar.b = f;
                long j2 = this.r0;
                fd9.E(j2 >= 0 || j2 == -9223372036854775807L);
                ncaVar.c = j2;
                oca ocaVar = new oca(ncaVar);
                fd9.M(t7bVar.m == null);
                s7bVar.o(ocaVar);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.q0 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.T.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.r0 = jElapsedRealtime;
    }

    public final void E() {
        a87 a87Var = this.m0;
        j6d j6dVar = this.l0;
        int i = 1;
        boolean z = a87Var.b | (((j6d) a87Var.e) != j6dVar);
        a87Var.b = z;
        a87Var.e = j6dVar;
        if (z) {
            v77 v77Var = this.U.E;
            v77Var.j.d(new yw5(v77Var, i, a87Var));
            this.m0 = new a87(this.l0);
        }
    }

    public final void F(int i) {
        cp3 cp3Var = this.E[i];
        try {
            t7b t7bVar = this.V.i;
            t7bVar.getClass();
            pe1 pe1VarD = cp3Var.d(t7bVar);
            pe1VarD.getClass();
            b4f b4fVar = pe1VarD.M;
            b4fVar.getClass();
            b4fVar.g();
        } catch (IOException | RuntimeException e) {
            int i2 = ((pe1) cp3Var.e).F;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            f4i f4iVar = this.V.i.o;
            ysj.k("ExoPlayerImplInternal", "Disabling track due to error: ".concat(jw7.c(((f87[]) f4iVar.G)[i].h())), e);
            f4i f4iVar2 = new f4i((hge[]) ((hge[]) f4iVar.F).clone(), (f87[]) ((f87[]) f4iVar.G).clone(), (r4i) f4iVar.H, f4iVar.I);
            ((hge[]) f4iVar2.F)[i] = null;
            ((f87[]) f4iVar2.G)[i] = null;
            h(i);
            t7b t7bVar2 = this.V.i;
            t7bVar2.a(f4iVar2, this.l0.s, false, new boolean[t7bVar2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.G;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.b0.d(new p51(this, i, z));
        }
    }

    public final void H() throws Throwable {
        v(this.W.c(), true);
    }

    public final void I() {
        this.m0.c(1);
        throw null;
    }

    public final void J() {
        this.m0.c(1);
        O(false, false, false, true);
        es5 es5Var = this.J;
        ConcurrentHashMap concurrentHashMap = es5Var.p;
        long id = Thread.currentThread().getId();
        long j = es5Var.q;
        fd9.L("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        es5Var.q = id;
        z6d z6dVar = this.Z;
        ds5 ds5Var = (ds5) concurrentHashMap.get(z6dVar);
        if (ds5Var == null) {
            ds5 ds5Var2 = new ds5();
            ds5Var2.a = 1;
            concurrentHashMap.put(z6dVar, ds5Var2);
        } else {
            ds5Var.a++;
        }
        ds5 ds5Var3 = (ds5) concurrentHashMap.get(z6dVar);
        ds5Var3.getClass();
        Integer num = (Integer) es5Var.o.get(z6dVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? es5Var.l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        ds5Var3.c = iIntValue;
        ds5Var3.b = false;
        n0(this.l0.a.p() ? 4 : 2);
        j6d j6dVar = this.l0;
        boolean z = j6dVar.l;
        A0(z, this.d0.c(j6dVar.e, z), j6dVar.n, j6dVar.m);
        yp5 yp5Var = this.K;
        yp5Var.getClass();
        o8b o8bVar = this.W;
        ArrayList arrayList = (ArrayList) o8bVar.c;
        fd9.M(!o8bVar.a);
        o8bVar.l = yp5Var;
        for (int i = 0; i < arrayList.size(); i++) {
            n8b n8bVar = (n8b) arrayList.get(i);
            o8bVar.g(n8bVar);
            ((HashSet) o8bVar.h).add(n8bVar);
        }
        o8bVar.a = true;
        this.L.f(2);
    }

    public final void K(hf4 hf4Var) {
        o5l o5lVar = this.M;
        k1h k1hVar = this.L;
        try {
            O(true, false, true, false);
            L();
            es5 es5Var = this.J;
            z6d z6dVar = this.Z;
            ConcurrentHashMap concurrentHashMap = es5Var.p;
            ds5 ds5Var = (ds5) concurrentHashMap.get(z6dVar);
            if (ds5Var != null) {
                int i = ds5Var.a - 1;
                ds5Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(z6dVar);
                    es5Var.c();
                }
            }
            if (es5Var.p.isEmpty()) {
                es5Var.q = -1L;
            }
            v41 v41Var = this.d0;
            v41Var.c = null;
            v41Var.a();
            v41Var.b(0);
            this.H.i();
            n0(1);
        } finally {
            k1hVar.a.removeCallbacksAndMessages(null);
            o5lVar.g();
            hf4Var.c();
        }
    }

    public final void L() {
        for (int i = 0; i < this.E.length; i++) {
            pe1 pe1Var = this.F[i];
            synchronized (pe1Var.E) {
                pe1Var.V = null;
            }
            cp3 cp3Var = this.E[i];
            pe1 pe1Var2 = (pe1) cp3Var.e;
            fd9.M(pe1Var2.L == 0);
            pe1Var2.s();
            cp3Var.c = false;
            pe1 pe1Var3 = (pe1) cp3Var.f;
            if (pe1Var3 != null) {
                fd9.M(pe1Var3.L == 0);
                pe1Var3.s();
                cp3Var.d = false;
            }
        }
    }

    public final void M(int i, int i2, m5g m5gVar) throws Throwable {
        this.m0.c(1);
        o8b o8bVar = this.W;
        o8bVar.getClass();
        fd9.E(i >= 0 && i <= i2 && i2 <= ((ArrayList) o8bVar.c).size());
        o8bVar.k = m5gVar;
        o8bVar.i(i, i2);
        v(o8bVar.c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        t7b t7bVar = this.V.i;
        this.p0 = t7bVar != null && t7bVar.g.j && this.o0;
    }

    public final void Q(long j, boolean z) {
        t7b t7bVar = this.V.i;
        long j2 = j + (t7bVar == null ? 1000000000000L : t7bVar.p);
        this.A0 = j2;
        this.R.E.d(j2);
        for (cp3 cp3Var : this.E) {
            long j3 = this.A0;
            pe1 pe1VarD = cp3Var.d(t7bVar);
            if (pe1VarD != null) {
                pe1VarD.B(j3, false, z);
            }
        }
        for (t7b t7bVar2 = r0.i; t7bVar2 != null; t7bVar2 = t7bVar2.m) {
            for (f87 f87Var : (f87[]) t7bVar2.o.G) {
                if (f87Var != null) {
                    f87Var.j();
                }
            }
        }
    }

    public final void R(mqh mqhVar, mqh mqhVar2) {
        if (mqhVar.p() && mqhVar2.p()) {
            return;
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ij0.x(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        boolean z;
        if (this.h0) {
            this.g0.getClass();
            z = true;
        } else {
            z = false;
        }
        j6d j6dVar = this.l0;
        long j2 = K0;
        if (z) {
            jMin = j6dVar.e != 3 ? j2 : 1000L;
            for (cp3 cp3Var : this.E) {
                long j3 = this.A0;
                long j4 = this.B0;
                pe1 pe1Var = (pe1) cp3Var.f;
                pe1 pe1Var2 = (pe1) cp3Var.e;
                long jI = cp3.h(pe1Var2) ? pe1Var2.i(j3, j4) : Long.MAX_VALUE;
                if (pe1Var != null && pe1Var.L != 0) {
                    jI = Math.min(jI, pe1Var.i(j3, j4));
                }
                jMin = Math.min(jMin, tpi.M(jI));
            }
            if (this.l0.l()) {
                t7b t7bVar = this.V.i;
                if ((t7bVar != null ? t7bVar.m : null) != null) {
                    if ((tpi.C(jMin) * this.l0.o.a) + this.A0 >= r1.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (j6dVar.e != 3 || r0()) {
            jMin = j2;
        }
        this.L.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void V(boolean z) {
        z7b z7bVar = this.V.i.g.a;
        long jX = X(z7bVar, this.l0.s, true, false);
        if (jX != this.l0.s) {
            j6d j6dVar = this.l0;
            this.l0 = y(z7bVar, jX, j6dVar.c, j6dVar.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:40|(21:(8:42|(1:54)(3:48|(1:52)|53)|55|(1:62)|63|64|65|66)(1:67)|118|72|(1:74)(1:76)|75|77|78|(1:80)(1:81)|82|116|83|84|113|85|86|109|87|88|89|65|66)|107|68|(1:70)(1:71)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0190, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(defpackage.c87 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.W(c87):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long X(defpackage.z7b r10, long r11, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.X(z7b, long, boolean, boolean):long");
    }

    public final void Y(c7d c7dVar) {
        c7dVar.getClass();
        k1h k1hVar = this.L;
        if (c7dVar.e != this.N) {
            k1hVar.b(15, c7dVar).b();
            return;
        }
        synchronized (c7dVar) {
        }
        try {
            c7dVar.a.d(c7dVar.c, c7dVar.d);
            c7dVar.a(true);
            int i = this.l0.e;
            if (i == 3 || i == 2) {
                k1hVar.f(2);
            }
        } catch (Throwable th) {
            c7dVar.a(true);
            throw th;
        }
    }

    public final void Z(c7d c7dVar) {
        Looper looper = c7dVar.e;
        if (looper.getThread().isAlive()) {
            this.T.a(looper, null).d(new fc(this, c7dVar));
        } else {
            ysj.u("TAG", "Trying to send message on a dead thread.");
            c7dVar.a(false);
        }
    }

    @Override // defpackage.r7b
    public final void a(s7b s7bVar) {
        this.L.b(8, s7bVar).b();
    }

    public final void a0(p31 p31Var, boolean z) {
        gv5 gv5Var = this.H;
        if (!gv5Var.i.equals(p31Var)) {
            gv5Var.i = p31Var;
            gv5Var.g();
        }
        if (!z) {
            p31Var = null;
        }
        v41 v41Var = this.d0;
        if (!Objects.equals(v41Var.d, p31Var)) {
            v41Var.d = p31Var;
            int i = p31Var == null ? 0 : 1;
            v41Var.f = i;
            fd9.C("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        j6d j6dVar = this.l0;
        boolean z2 = j6dVar.l;
        A0(z2, v41Var.c(j6dVar.e, z2), j6dVar.n, j6dVar.m);
    }

    @Override // defpackage.jui
    public final void b(long j, long j2, jw7 jw7Var, MediaFormat mediaFormat) {
        if (this.i0) {
            this.L.a(37).b();
        }
    }

    public final void b0(boolean z, hf4 hf4Var) {
        if (this.v0 != z) {
            this.v0 = z;
            if (!z) {
                for (cp3 cp3Var : this.E) {
                    cp3Var.k();
                }
            }
        }
        if (hf4Var != null) {
            hf4Var.c();
        }
    }

    public final void c(z77 z77Var, int i) throws Throwable {
        this.m0.c(1);
        o8b o8bVar = this.W;
        if (i == -1) {
            i = ((ArrayList) o8bVar.c).size();
        }
        v(o8bVar.a(i, z77Var.a, z77Var.b), false);
    }

    public final void c0(x77 x77Var) {
        for (cp3 cp3Var : this.E) {
            pe1 pe1Var = (pe1) cp3Var.e;
            if (pe1Var.F == 4) {
                pe1Var.d(23, x77Var);
                pe1 pe1Var2 = (pe1) cp3Var.f;
                if (pe1Var2 != null) {
                    pe1Var2.d(23, x77Var);
                }
            }
        }
    }

    public final void d() {
        for (cp3 cp3Var : this.E) {
            taf tafVar = this.h0 ? this.g0 : null;
            ((pe1) cp3Var.e).d(18, tafVar);
            pe1 pe1Var = (pe1) cp3Var.f;
            if (pe1Var != null) {
                pe1Var.d(18, tafVar);
            }
        }
    }

    public final void d0(z77 z77Var) throws Throwable {
        this.m0.c(1);
        int i = z77Var.c;
        m5g m5gVar = z77Var.b;
        ArrayList arrayList = z77Var.a;
        if (i != -1) {
            this.z0 = new c87(new l7d(arrayList, m5gVar), z77Var.c, z77Var.d);
        }
        o8b o8bVar = this.W;
        ArrayList arrayList2 = (ArrayList) o8bVar.c;
        o8bVar.i(0, arrayList2.size());
        v(o8bVar.a(arrayList2.size(), arrayList, m5gVar), false);
    }

    public final boolean e() {
        if (!this.c0) {
            return false;
        }
        for (cp3 cp3Var : this.E) {
            if (cp3Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(boolean z) {
        this.o0 = z;
        P();
        if (this.p0) {
            v7b v7bVar = this.V;
            if (v7bVar.j != v7bVar.i) {
                V(true);
                u(false);
            }
        }
    }

    public final void f() {
        N();
        V(true);
    }

    public final void f0(l6d l6dVar) {
        this.L.e(16);
        ks5 ks5Var = this.R;
        ks5Var.a(l6dVar);
        l6d l6dVarE = ks5Var.e();
        x(l6dVarE, l6dVarE.a, true, true);
    }

    public final void g() {
        pe1 pe1Var;
        if (this.c0 && e()) {
            for (cp3 cp3Var : this.E) {
                int iC = cp3Var.c();
                ks5 ks5Var = this.R;
                if (cp3Var.f()) {
                    int i = cp3Var.b;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            pe1Var = (pe1) cp3Var.e;
                        } catch (RuntimeException e) {
                            ysj.k("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        pe1Var = (pe1) cp3Var.f;
                        pe1Var.getClass();
                    }
                    cp3Var.a(pe1Var, ks5Var);
                    try {
                        cp3Var.i(z);
                    } catch (RuntimeException e2) {
                        ysj.k("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    cp3Var.b = i2;
                }
                this.y0 -= iC - cp3Var.c();
            }
            this.H0 = -9223372036854775807L;
        }
    }

    public final void g0(i77 i77Var) {
        this.G0 = i77Var;
        mqh mqhVar = this.l0.a;
        v7b v7bVar = this.V;
        v7bVar.getClass();
        i77Var.getClass();
        if (v7bVar.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < v7bVar.q.size(); i++) {
            ((t7b) v7bVar.q.get(i)).i();
        }
        v7bVar.q = arrayList;
        v7bVar.m = null;
        v7bVar.k();
    }

    public final void h(int i) {
        cp3[] cp3VarArr = this.E;
        int iC = cp3VarArr[i].c();
        cp3 cp3Var = cp3VarArr[i];
        pe1 pe1Var = (pe1) cp3Var.e;
        ks5 ks5Var = this.R;
        cp3Var.a(pe1Var, ks5Var);
        pe1 pe1Var2 = (pe1) cp3Var.f;
        if (pe1Var2 != null) {
            boolean z = (pe1Var2.L == 0 || cp3Var.b == 3) ? false : true;
            cp3Var.a(pe1Var2, ks5Var);
            cp3Var.i(false);
            if (z) {
                pe1 pe1Var3 = (pe1) cp3Var.e;
                pe1Var2.getClass();
                pe1Var2.d(17, pe1Var3);
            }
        }
        cp3Var.b = 0;
        G(i, false);
        this.y0 -= iC;
    }

    public final void h0(int i) {
        this.t0 = i;
        mqh mqhVar = this.l0.a;
        v7b v7bVar = this.V;
        v7bVar.g = i;
        int iR = v7bVar.r(mqhVar);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            g();
        }
        u(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        t7b t7bVar;
        z7b z7bVar;
        t7b t7bVar2;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.m0.c(1);
                    A0(z, this.d0.c(this.l0.e, z), i3 >> 4, i3 & 15);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    W((c87) message.obj);
                    break;
                case 4:
                    f0((l6d) message.obj);
                    break;
                case 5:
                    k0((wef) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    K((hf4) message.obj);
                    return true;
                case 8:
                    w((s7b) message.obj);
                    break;
                case 9:
                    s((s7b) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    h0(message.arg1);
                    break;
                case 12:
                    l0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (hf4) message.obj);
                    break;
                case 14:
                    Y((c7d) message.obj);
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    Z((c7d) message.obj);
                    break;
                case 16:
                    l6d l6dVar = (l6d) message.obj;
                    x(l6dVar, l6dVar.a, true, false);
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    d0((z77) message.obj);
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    c((z77) message.obj, message.arg1);
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    ij0.x(message.obj);
                    I();
                    throw null;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    M(message.arg1, message.arg2, (m5g) message.obj);
                    break;
                case 21:
                    m0((m5g) message.obj);
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    H();
                    break;
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    e0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case BuildConfig.VERSION_CODE /* 25 */:
                    f();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    y0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    g0((i77) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (hf4) pair.second);
                    break;
                case 31:
                    a0((p31) message.obj, message.arg1 != 0);
                    break;
                case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                    q0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    o0((jui) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.i0 = false;
                    c87 c87Var = this.j0;
                    if (c87Var != null) {
                        W(c87Var);
                        this.j0 = null;
                    }
                    break;
                case 38:
                    j0((taf) message.obj);
                    break;
                case 39:
                    c0((x77) message.obj);
                    break;
            }
        } catch (ParserException e) {
            boolean z2 = e.E;
            int i4 = e.F;
            if (i4 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                t(e, i);
            }
            i = i2;
            t(e, i);
        } catch (DataSourceException e2) {
            t(e2, e2.E);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i5 = e.G;
            v7b v7bVar = this.V;
            if (i5 == 1 && (t7bVar2 = v7bVar.j) != null && e.L == null) {
                e = e.a(t7bVar2.g.a);
            }
            int i6 = e.G;
            k1h k1hVar = this.L;
            if (i6 == 1 && (z7bVar = e.L) != null && A(e.I, z7bVar)) {
                this.I0 = true;
                g();
                t7b t7bVarG = v7bVar.g();
                t7b t7bVar3 = v7bVar.i;
                if (t7bVar3 != t7bVarG) {
                    while (t7bVar3 != null) {
                        t7b t7bVar4 = t7bVar3.m;
                        if (t7bVar4 == t7bVarG) {
                            break;
                        }
                        t7bVar3 = t7bVar4;
                    }
                }
                v7bVar.n(t7bVar3);
                if (this.l0.e != 4) {
                    C();
                    k1hVar.f(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.E0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.E0;
                }
                if (e.G == 1 && v7bVar.i != v7bVar.j) {
                    while (true) {
                        t7bVar = v7bVar.i;
                        if (t7bVar == v7bVar.j) {
                            break;
                        }
                        v7bVar.a();
                    }
                    fd9.H(t7bVar);
                    E();
                    u7b u7bVar = t7bVar.g;
                    z7b z7bVar2 = u7bVar.a;
                    long j = u7bVar.b;
                    this.l0 = y(z7bVar2, j, u7bVar.d, j, true, 0);
                }
                if (e.M && (this.E0 == null || (i = e.E) == 5004 || i == 5003)) {
                    ysj.v("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.E0 == null) {
                        this.E0 = e;
                    }
                    j1h j1hVarB = k1hVar.b(25, e);
                    Handler handler = k1hVar.a;
                    Message message2 = j1hVarB.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    j1hVarB.a();
                } else {
                    ysj.k("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.l0 = this.l0.f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e4) {
            t(e4, e4.E);
        } catch (BehindLiveWindowException e5) {
            t(e5, 1002);
        } catch (IOException e6) {
            t(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            ysj.k("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            u0(true, false);
            this.l0 = this.l0.f(exoPlaybackException2);
        }
        E();
        return true;
    }

    @Override // defpackage.r7b
    public final void i(anf anfVar) {
        this.L.b(9, (s7b) anfVar).b();
    }

    public final void i0(boolean z) throws Throwable {
        if (!z) {
            c87 c87Var = this.j0;
            k1h k1hVar = this.L;
            if (c87Var != null && this.i0 && !k1hVar.a.hasMessages(37)) {
                this.k0++;
            }
            int i = this.k0;
            if (i > 0) {
                this.b0.d(new fc(this, i));
            }
            this.k0 = 0;
            this.i0 = false;
            k1hVar.e(37);
            c87 c87Var2 = this.j0;
            if (c87Var2 != null) {
                W(c87Var2);
                this.j0 = null;
                this.i0 = false;
            }
        }
        this.h0 = z;
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.j():void");
    }

    public final void j0(taf tafVar) {
        this.g0 = tafVar;
        d();
    }

    public final void k(t7b t7bVar, int i, boolean z, long j) {
        cp3 cp3Var = this.E[i];
        boolean zG = cp3Var.g();
        pe1 pe1Var = (pe1) cp3Var.e;
        if (zG) {
            return;
        }
        boolean z2 = t7bVar == this.V.i;
        f4i f4iVar = t7bVar.o;
        hge hgeVar = ((hge[]) f4iVar.F)[i];
        f87 f87Var = ((f87[]) f4iVar.G)[i];
        boolean z3 = r0() && this.l0.e == 3;
        boolean z4 = !z && z3;
        this.y0++;
        b4f b4fVar = t7bVar.c[i];
        long j2 = t7bVar.p;
        z7b z7bVar = t7bVar.g.a;
        pe1 pe1Var2 = (pe1) cp3Var.f;
        int length = f87Var != null ? f87Var.length() : 0;
        jw7[] jw7VarArr = new jw7[length];
        for (int i2 = 0; i2 < length; i2++) {
            f87Var.getClass();
            jw7VarArr[i2] = f87Var.c(i2);
        }
        int i3 = cp3Var.b;
        ks5 ks5Var = this.R;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            cp3Var.c = true;
            fd9.M(pe1Var.L == 0);
            pe1Var.H = hgeVar;
            pe1Var.U = z7bVar;
            pe1Var.L = 1;
            pe1Var.q(z4, z2);
            pe1Var.A(jw7VarArr, b4fVar, j, j2, z7bVar);
            pe1Var.B(j, z4, true);
            ks5Var.d(pe1Var);
        } else {
            cp3Var.d = true;
            pe1Var2.getClass();
            fd9.M(pe1Var2.L == 0);
            pe1Var2.H = hgeVar;
            pe1Var2.U = z7bVar;
            pe1Var2.L = 1;
            pe1Var2.q(z4, z2);
            pe1Var2.A(jw7VarArr, b4fVar, j, j2, z7bVar);
            pe1Var2.B(j, z4, true);
            ks5Var.d(pe1Var2);
        }
        y77 y77Var = new y77(this);
        pe1 pe1VarD = cp3Var.d(t7bVar);
        pe1VarD.getClass();
        pe1VarD.d(11, y77Var);
        if (z3 && z2) {
            cp3Var.m();
        }
    }

    public final void k0(wef wefVar) {
        this.f0 = wefVar;
    }

    public final void l(boolean[] zArr, long j) {
        cp3[] cp3VarArr;
        d87 d87Var;
        long j2;
        t7b t7bVar = this.V.j;
        f4i f4iVar = t7bVar.o;
        int i = 0;
        while (true) {
            cp3VarArr = this.E;
            if (i >= cp3VarArr.length) {
                break;
            }
            if (!f4iVar.e(i)) {
                cp3VarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < cp3VarArr.length) {
            if (f4iVar.e(i2) && cp3VarArr[i2].d(t7bVar) == null) {
                d87Var = this;
                j2 = j;
                d87Var.k(t7bVar, i2, zArr[i2], j2);
            } else {
                d87Var = this;
                j2 = j;
            }
            i2++;
            this = d87Var;
            j = j2;
        }
    }

    public final void l0(boolean z) {
        this.u0 = z;
        mqh mqhVar = this.l0.a;
        v7b v7bVar = this.V;
        v7bVar.h = z;
        int iR = v7bVar.r(mqhVar);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            g();
        }
        u(false);
    }

    public final long m(mqh mqhVar, Object obj, long j) {
        jqh jqhVar = this.P;
        int i = mqhVar.g(obj, jqhVar).c;
        kqh kqhVar = this.O;
        mqhVar.n(i, kqhVar);
        if (kqhVar.d == -9223372036854775807L || !kqhVar.a() || !kqhVar.g) {
            return -9223372036854775807L;
        }
        long j2 = kqhVar.e;
        return tpi.C((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - kqhVar.d) - (j + jqhVar.e);
    }

    public final void m0(m5g m5gVar) throws Throwable {
        this.m0.c(1);
        o8b o8bVar = this.W;
        int size = ((ArrayList) o8bVar.c).size();
        if (m5gVar.b.length != size) {
            m5gVar = new m5g(new Random(m5gVar.a.nextLong())).a(size);
        }
        o8bVar.k = m5gVar;
        v(o8bVar.c(), false);
    }

    public final long n(t7b t7bVar) {
        if (t7bVar == null) {
            return 0L;
        }
        long jMax = t7bVar.p;
        if (!t7bVar.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            cp3[] cp3VarArr = this.E;
            if (i >= cp3VarArr.length) {
                return jMax;
            }
            if (cp3VarArr[i].d(t7bVar) != null) {
                pe1 pe1VarD = cp3VarArr[i].d(t7bVar);
                Objects.requireNonNull(pe1VarD);
                long j = pe1VarD.Q;
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j, jMax);
            }
            i++;
        }
    }

    public final void n0(int i) {
        j6d j6dVar = this.l0;
        if (j6dVar.e != i) {
            if (i != 2) {
                this.F0 = -9223372036854775807L;
            }
            if (i != 3 && j6dVar.p) {
                this.l0 = j6dVar.h(false);
            }
            this.l0 = this.l0.g(i);
        }
    }

    public final Pair o(mqh mqhVar) {
        long j = 0;
        if (mqhVar.p()) {
            return Pair.create(j6d.u, 0L);
        }
        int iA = mqhVar.a(this.u0);
        Pair pairI = mqhVar.i(this.O, this.P, iA, -9223372036854775807L);
        z7b z7bVarP = this.V.p(mqhVar, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (z7bVarP.b()) {
            Object obj = z7bVarP.a;
            jqh jqhVar = this.P;
            mqhVar.g(obj, jqhVar);
            if (z7bVarP.c == jqhVar.e(z7bVarP.b)) {
                jqhVar.g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(z7bVarP, Long.valueOf(j));
    }

    public final void o0(jui juiVar) {
        for (cp3 cp3Var : this.E) {
            pe1 pe1Var = (pe1) cp3Var.e;
            if (pe1Var.F == 2) {
                pe1Var.d(7, juiVar);
                pe1 pe1Var2 = (pe1) cp3Var.f;
                if (pe1Var2 != null) {
                    pe1Var2.d(7, juiVar);
                }
            }
        }
    }

    public final long p(long j) {
        t7b t7bVar = this.V.l;
        if (t7bVar == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.A0 - t7bVar.p));
    }

    public final void p0(Object obj, hf4 hf4Var) {
        for (cp3 cp3Var : this.E) {
            pe1 pe1Var = (pe1) cp3Var.e;
            if (pe1Var.F == 2) {
                int i = cp3Var.b;
                if (i == 4 || i == 1) {
                    pe1 pe1Var2 = (pe1) cp3Var.f;
                    pe1Var2.getClass();
                    pe1Var2.d(1, obj);
                } else {
                    pe1Var.d(1, obj);
                }
            }
        }
        int i2 = this.l0.e;
        if (i2 == 3 || i2 == 2) {
            this.L.f(2);
        }
        if (hf4Var != null) {
            hf4Var.c();
        }
    }

    public final void q(int i) {
        j6d j6dVar = this.l0;
        A0(j6dVar.l, i, j6dVar.n, j6dVar.m);
    }

    public final void q0(float f) {
        this.J0 = f;
        float f2 = f * this.d0.g;
        for (cp3 cp3Var : this.E) {
            pe1 pe1Var = (pe1) cp3Var.e;
            if (pe1Var.F == 1) {
                pe1Var.d(2, Float.valueOf(f2));
                pe1 pe1Var2 = (pe1) cp3Var.f;
                if (pe1Var2 != null) {
                    pe1Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void r() {
        q0(this.J0);
    }

    public final boolean r0() {
        j6d j6dVar = this.l0;
        return j6dVar.l && j6dVar.n == 0;
    }

    public final void s(s7b s7bVar) {
        v7b v7bVar = this.V;
        t7b t7bVar = v7bVar.l;
        if (t7bVar != null && t7bVar.a == s7bVar) {
            v7bVar.m(this.A0);
            C();
            return;
        }
        t7b t7bVar2 = v7bVar.m;
        if (t7bVar2 == null || t7bVar2.a != s7bVar) {
            return;
        }
        D();
    }

    public final boolean s0(mqh mqhVar, z7b z7bVar) {
        if (z7bVar.b() || mqhVar.p()) {
            return false;
        }
        int i = mqhVar.g(z7bVar.a, this.P).c;
        kqh kqhVar = this.O;
        mqhVar.n(i, kqhVar);
        return kqhVar.a() && kqhVar.g && kqhVar.d != -9223372036854775807L;
    }

    public final void t(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        t7b t7bVar = this.V.i;
        if (t7bVar != null) {
            exoPlaybackException = exoPlaybackException.a(t7bVar.g.a);
        }
        ysj.k("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        u0(false, false);
        this.l0 = this.l0.f(exoPlaybackException);
    }

    public final void t0() {
        t7b t7bVar = this.V.i;
        if (t7bVar == null) {
            return;
        }
        f4i f4iVar = t7bVar.o;
        int i = 0;
        while (true) {
            cp3[] cp3VarArr = this.E;
            if (i >= cp3VarArr.length) {
                return;
            }
            if (f4iVar.e(i)) {
                cp3VarArr[i].m();
            }
            i++;
        }
    }

    public final void u(boolean z) {
        t7b t7bVar = this.V.l;
        z7b z7bVar = t7bVar == null ? this.l0.b : t7bVar.g.a;
        boolean zEquals = this.l0.k.equals(z7bVar);
        if (!zEquals) {
            this.l0 = this.l0.c(z7bVar);
        }
        j6d j6dVar = this.l0;
        j6dVar.q = t7bVar == null ? j6dVar.s : t7bVar.d();
        j6d j6dVar2 = this.l0;
        j6dVar2.r = p(j6dVar2.q);
        if ((!zEquals || z) && t7bVar != null && t7bVar.e) {
            x0(t7bVar.g.a, t7bVar.o);
        }
    }

    public final void u0(boolean z, boolean z2) {
        O(z || !this.v0, false, true, false);
        this.m0.c(z2 ? 1 : 0);
        es5 es5Var = this.J;
        ConcurrentHashMap concurrentHashMap = es5Var.p;
        z6d z6dVar = this.Z;
        ds5 ds5Var = (ds5) concurrentHashMap.get(z6dVar);
        if (ds5Var != null) {
            int i = ds5Var.a - 1;
            ds5Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(z6dVar);
                es5Var.c();
            }
        }
        this.d0.c(1, this.l0.l);
        n0(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04b5  */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [mqh] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r2v10, types: [mqh] */
    /* JADX WARN: Type inference failed for: r2v15, types: [j6d] */
    /* JADX WARN: Type inference failed for: r2v31, types: [v7b] */
    /* JADX WARN: Type inference failed for: r45v0, types: [d87] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [mqh] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(defpackage.mqh r46, boolean r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.v(mqh, boolean):void");
    }

    public final void v0() {
        ks5 ks5Var = this.R;
        ks5Var.J = false;
        gkg gkgVar = ks5Var.E;
        if (gkgVar.G) {
            gkgVar.d(gkgVar.b());
            gkgVar.G = false;
        }
        for (cp3 cp3Var : this.E) {
            pe1 pe1Var = (pe1) cp3Var.f;
            pe1 pe1Var2 = (pe1) cp3Var.e;
            if (cp3.h(pe1Var2)) {
                cp3.b(pe1Var2);
            }
            if (pe1Var != null && pe1Var.L != 0) {
                cp3.b(pe1Var);
            }
        }
    }

    public final void w(s7b s7bVar) {
        t7b t7bVar;
        d87 d87Var;
        v7b v7bVar = this.V;
        t7b t7bVar2 = v7bVar.l;
        ks5 ks5Var = this.R;
        if (t7bVar2 != null && t7bVar2.a == s7bVar) {
            t7bVar2.getClass();
            if (!t7bVar2.e) {
                float f = ks5Var.e().a;
                j6d j6dVar = this.l0;
                t7bVar2.f(f, j6dVar.a, j6dVar.l);
            }
            x0(t7bVar2.g.a, t7bVar2.o);
            if (t7bVar2 == v7bVar.i) {
                Q(t7bVar2.g.b, true);
                l(new boolean[this.E.length], v7bVar.j.e());
                t7bVar2.h = true;
                j6d j6dVar2 = this.l0;
                z7b z7bVar = j6dVar2.b;
                long j = t7bVar2.g.b;
                d87Var = this;
                d87Var.l0 = y(z7bVar, j, j6dVar2.c, j, false, 5);
            } else {
                d87Var = this;
            }
            d87Var.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= v7bVar.q.size()) {
                t7bVar = null;
                break;
            }
            t7bVar = (t7b) v7bVar.q.get(i);
            if (t7bVar.a == s7bVar) {
                break;
            } else {
                i++;
            }
        }
        if (t7bVar != null) {
            fd9.M(!t7bVar.e);
            float f2 = ks5Var.e().a;
            j6d j6dVar3 = this.l0;
            t7bVar.f(f2, j6dVar3.a, j6dVar3.l);
            t7b t7bVar3 = v7bVar.m;
            if (t7bVar3 == null || t7bVar3.a != s7bVar) {
                return;
            }
            D();
        }
    }

    public final void w0() {
        t7b t7bVar = this.V.l;
        boolean z = this.s0 || (t7bVar != null && t7bVar.a.b());
        j6d j6dVar = this.l0;
        if (z != j6dVar.g) {
            this.l0 = j6dVar.b(z);
        }
    }

    public final void x(l6d l6dVar, float f, boolean z, boolean z2) {
        l6d l6dVar2;
        int i;
        if (z) {
            if (z2) {
                this.m0.c(1);
            }
            j6d j6dVar = this.l0;
            j6d j6dVar2 = new j6d(j6dVar.a, j6dVar.b, j6dVar.c, j6dVar.d, j6dVar.e, j6dVar.f, j6dVar.g, j6dVar.h, j6dVar.i, j6dVar.j, j6dVar.k, j6dVar.l, j6dVar.m, j6dVar.n, l6dVar, j6dVar.q, j6dVar.r, j6dVar.s, j6dVar.t, j6dVar.p);
            l6dVar2 = l6dVar;
            this.l0 = j6dVar2;
        } else {
            l6dVar2 = l6dVar;
        }
        float f2 = l6dVar2.a;
        t7b t7bVar = this.V.i;
        while (true) {
            i = 0;
            if (t7bVar == null) {
                break;
            }
            f87[] f87VarArr = (f87[]) t7bVar.o.G;
            int length = f87VarArr.length;
            while (i < length) {
                f87 f87Var = f87VarArr[i];
                if (f87Var != null) {
                    f87Var.i(f2);
                }
                i++;
            }
            t7bVar = t7bVar.m;
        }
        cp3[] cp3VarArr = this.E;
        int length2 = cp3VarArr.length;
        while (i < length2) {
            cp3 cp3Var = cp3VarArr[i];
            float f3 = l6dVar2.a;
            ((pe1) cp3Var.e).C(f, f3);
            pe1 pe1Var = (pe1) cp3Var.f;
            if (pe1Var != null) {
                pe1Var.C(f, f3);
            }
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(defpackage.z7b r9, defpackage.f4i r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.x0(z7b, f4i):void");
    }

    public final j6d y(z7b z7bVar, long j, long j2, long j3, boolean z, int i) {
        vde vdeVarG;
        boolean z2;
        this.D0 = (!this.D0 && j == this.l0.s && z7bVar.equals(this.l0.b)) ? false : true;
        P();
        j6d j6dVar = this.l0;
        w3i w3iVar = j6dVar.h;
        f4i f4iVar = j6dVar.i;
        List list = j6dVar.j;
        if (this.W.a) {
            t7b t7bVar = this.V.i;
            w3iVar = t7bVar == null ? w3i.d : t7bVar.n;
            f4iVar = t7bVar == null ? this.I : t7bVar.o;
            f87[] f87VarArr = (f87[]) f4iVar.G;
            hz8 hz8Var = new hz8(4);
            boolean z3 = false;
            for (f87 f87Var : f87VarArr) {
                if (f87Var != null) {
                    gjb gjbVar = f87Var.c(0).l;
                    if (gjbVar == null) {
                        hz8Var.b(new gjb(new fjb[0]));
                    } else {
                        hz8Var.b(gjbVar);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                vdeVarG = hz8Var.g();
            } else {
                iz8 iz8Var = nz8.F;
                vdeVarG = vde.I;
            }
            list = vdeVarG;
            if (t7bVar != null) {
                u7b u7bVar = t7bVar.g;
                if (u7bVar.d != j2) {
                    t7bVar.g = u7bVar.a(j2);
                }
            }
            cp3[] cp3VarArr = this.E;
            v7b v7bVar = this.V;
            t7b t7bVar2 = v7bVar.i;
            if (t7bVar2 == v7bVar.j && t7bVar2 != null) {
                f4i f4iVar2 = t7bVar2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= cp3VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (f4iVar2.e(i2)) {
                        if (((pe1) cp3VarArr[i2].e).F != 1) {
                            z2 = false;
                            break;
                        }
                        if (((hge[]) f4iVar2.F)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.x0) {
                    this.x0 = z5;
                    if (!z5 && this.l0.p) {
                        this.L.f(2);
                    }
                }
            }
        } else if (!z7bVar.equals(j6dVar.b)) {
            w3iVar = w3i.d;
            f4iVar = this.I;
            list = vde.I;
        }
        f4i f4iVar3 = f4iVar;
        List list2 = list;
        w3i w3iVar2 = w3iVar;
        if (z) {
            a87 a87Var = this.m0;
            if (!a87Var.c || a87Var.d == 5) {
                a87Var.b = true;
                a87Var.c = true;
                a87Var.d = i;
            } else {
                fd9.E(i == 5);
            }
        }
        j6d j6dVar2 = this.l0;
        return j6dVar2.d(z7bVar, j, j2, j3, p(j6dVar2.q), w3iVar2, f4iVar3, list2);
    }

    public final void y0(int i, int i2, List list) throws Throwable {
        this.m0.c(1);
        o8b o8bVar = this.W;
        o8bVar.getClass();
        ArrayList arrayList = (ArrayList) o8bVar.c;
        fd9.E(i >= 0 && i <= i2 && i2 <= arrayList.size());
        fd9.E(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((n8b) arrayList.get(i3)).a.r((j7b) list.get(i3 - i));
        }
        v(o8bVar.c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0540  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0() {
        /*
            Method dump skipped, instruction units count: 1525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.z0():void");
    }
}
