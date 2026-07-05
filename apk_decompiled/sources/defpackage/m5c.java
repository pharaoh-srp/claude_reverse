package defpackage;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class m5c extends fma implements h5b, cu9, nmc {
    public static final xre t0 = new xre();
    public static final tt9 u0 = new tt9();
    public static final float[] v0 = nwa.a();
    public static final h5c w0 = new h5c();
    public static final vz8 x0 = new vz8(24);
    public final av9 S;
    public boolean T;
    public boolean U;
    public m5c V;
    public m5c W;
    public boolean X;
    public boolean Y;
    public bz7 Z;
    public cz5 a0;
    public fu9 b0;
    public p5b d0;
    public mvb e0;
    public float g0;
    public dwb h0;
    public tt9 i0;
    public boolean k0;
    public boolean l0;
    public ja8 m0;
    public fb2 n0;
    public i35 o0;
    public boolean q0;
    public mmc r0;
    public ja8 s0;
    public float c0 = 0.8f;
    public long f0 = 0;
    public e0g j0 = zni.b;
    public final j5c p0 = new j5c(this, 1);

    public m5c(av9 av9Var) {
        this.S = av9Var;
        this.a0 = av9Var.d0;
        this.b0 = av9Var.e0;
    }

    public static m5c C1(cu9 cu9Var) {
        m5c m5cVar;
        ima imaVar = cu9Var instanceof ima ? (ima) cu9Var : null;
        if (imaVar != null && (m5cVar = imaVar.E.S) != null) {
            return m5cVar;
        }
        cu9Var.getClass();
        return (m5c) cu9Var;
    }

    @Override // defpackage.cu9
    public final cu9 A() {
        boolean z = h1().R;
        av9 av9Var = this.S;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (av9 av9VarG = av9Var; av9VarG != null; av9VarG = av9VarG.G()) {
                sb.append("\n|");
                sb.append(av9VarG);
                sb.append(" isAttached=");
                sb.append(av9VarG.X());
                sb.append(" modifier=");
                sb.append(av9VarG.o0);
                sb.append(" tail=");
                sb.append(h1());
            }
            b39.c(sb.toString());
        }
        q1();
        return ((m5c) av9Var.k0.I).W;
    }

    @Override // defpackage.fma
    public final fma A0() {
        return this.W;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [hqb] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [wwb] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [wwb] */
    public final void A1(p5b p5bVar) {
        m5c m5cVar;
        p5b p5bVar2 = this.d0;
        if (p5bVar != p5bVar2) {
            this.d0 = p5bVar;
            av9 av9Var = this.S;
            int i = 0;
            if (p5bVar2 == null || p5bVar.b() != p5bVar2.b() || p5bVar.a() != p5bVar2.a()) {
                int iB = p5bVar.b();
                int iA = p5bVar.a();
                mmc mmcVar = this.r0;
                if (mmcVar != null) {
                    ((ma8) mmcVar).e((((long) iB) << 32) | (((long) iA) & 4294967295L));
                } else if (av9Var.Y() && (m5cVar = this.W) != null) {
                    m5cVar.o1();
                }
                b0((((long) iA) & 4294967295L) | (((long) iB) << 32));
                if (this.Z != null) {
                    H1(false);
                }
                boolean zG = s5c.g(4);
                hqb hqbVarH1 = h1();
                if (zG || (hqbVarH1 = hqbVarH1.I) != null) {
                    for (hqb hqbVarJ1 = j1(zG); hqbVarJ1 != null && (hqbVarJ1.H & 4) != 0; hqbVarJ1 = hqbVarJ1.J) {
                        if ((hqbVarJ1.G & 4) != 0) {
                            ?? J = hqbVarJ1;
                            ?? wwbVar = 0;
                            while (J != 0) {
                                if (J instanceof vd6) {
                                    ((vd6) J).Y();
                                } else if ((J.G & 4) != 0 && (J instanceof qw5)) {
                                    hqb hqbVar = ((qw5) J).T;
                                    int i2 = 0;
                                    J = J;
                                    wwbVar = wwbVar;
                                    while (hqbVar != null) {
                                        if ((hqbVar.G & 4) != 0) {
                                            i2++;
                                            wwbVar = wwbVar;
                                            if (i2 == 1) {
                                                J = hqbVar;
                                            } else {
                                                if (wwbVar == 0) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (J != 0) {
                                                    wwbVar.b(J);
                                                    J = 0;
                                                }
                                                wwbVar.b(hqbVar);
                                            }
                                        }
                                        hqbVar = hqbVar.J;
                                        J = J;
                                        wwbVar = wwbVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = yfd.j(wwbVar);
                            }
                        }
                        if (hqbVarJ1 == hqbVarH1) {
                            break;
                        }
                    }
                }
                Owner owner = av9Var.S;
                if (owner != null) {
                    ((AndroidComposeView) owner).y(av9Var);
                }
                av9Var.k0(this);
            }
            mvb mvbVar = this.e0;
            if ((mvbVar == null || mvbVar.e == 0) && p5bVar.c().isEmpty()) {
                return;
            }
            mvb mvbVar2 = this.e0;
            Map mapC = p5bVar.c();
            if (mvbVar2 != null && mvbVar2.e == mapC.size()) {
                Object[] objArr = mvbVar2.b;
                int[] iArr = mvbVar2.c;
                long[] jArr = mvbVar2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapC.get((ut) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            av9Var.t().p.c0.f();
            mvb mvbVar3 = this.e0;
            if (mvbVar3 == null) {
                mvb mvbVar4 = vac.a;
                mvbVar3 = new mvb();
                this.e0 = mvbVar3;
            }
            mvbVar3.a();
            for (Map.Entry entry : p5bVar.c().entrySet()) {
                mvbVar3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void B1(hqb hqbVar, i5c i5cVar, long j, dn8 dn8Var, int i, boolean z, float f) {
        int i2;
        if (hqbVar == null) {
            n1(i5cVar, j, dn8Var, i, z);
            return;
        }
        if (!i5cVar.i(hqbVar)) {
            B1(auk.c(hqbVar, i5cVar.h()), i5cVar, j, dn8Var, i, z, f);
            return;
        }
        if (!i5cVar.g(hqbVar)) {
            v1(auk.c(hqbVar, i5cVar.h()), i5cVar, j, dn8Var, i, z, f, false);
            return;
        }
        l5c l5cVar = new l5c(this, hqbVar, i5cVar, j, dn8Var, i, z, f);
        dvb dvbVar = dn8Var.F;
        qvb qvbVar = dn8Var.E;
        int i3 = dn8Var.G;
        int i4 = qvbVar.b;
        if (i3 != i4 - 1) {
            long jA = dn8Var.a();
            int i5 = dn8Var.G;
            int i6 = qvbVar.b;
            int i7 = i6 - 1;
            dn8Var.G = i7;
            dn8Var.e(i6, qvbVar.b);
            dn8Var.G++;
            qvbVar.a(hqbVar);
            dvbVar.a(rsk.a(f, z, false));
            l5cVar.a();
            dn8Var.G = i7;
            long jA2 = dn8Var.a();
            if (dn8Var.G + 1 >= qvbVar.b - 1 || dtj.e(jA, jA2) <= 0) {
                dn8Var.e(dn8Var.G + 1, qvbVar.b);
            } else {
                int i8 = i5 + 1;
                boolean zI = dtj.i(jA2);
                int i9 = dn8Var.G;
                dn8Var.e(i8, zI ? i9 + 2 : i9 + 1);
            }
            dn8Var.G = i5;
            return;
        }
        int i10 = i3 + 1;
        dn8Var.e(i10, i4);
        dn8Var.G++;
        qvbVar.a(hqbVar);
        dvbVar.a(rsk.a(f, z, false));
        l5cVar.a();
        dn8Var.G = i3;
        if (i10 == qvbVar.b - 1 || dtj.i(dn8Var.a())) {
            int i11 = dn8Var.G;
            int i12 = i11 + 1;
            qvbVar.k(i12);
            if (i12 < 0 || i12 >= (i2 = dvbVar.b)) {
                gtk.h("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = dvbVar.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                mp0.t0(jArr, jArr, i12, i11 + 2, i2);
            }
            dvbVar.b--;
        }
    }

    @Override // defpackage.fma
    public final long D0() {
        return this.f0;
    }

    public final l9e D1() {
        if (h1().R) {
            cu9 cu9VarA = nai.A(this);
            dwb dwbVar = this.h0;
            if (dwbVar == null) {
                dwbVar = new dwb();
                this.h0 = dwbVar;
            }
            long jR0 = R0(g1());
            int i = (int) (jR0 >> 32);
            dwbVar.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jR0 & 4294967295L);
            dwbVar.b = -Float.intBitsToFloat(i2);
            dwbVar.c = Float.intBitsToFloat(i) + X();
            dwbVar.d = Float.intBitsToFloat(i2) + S();
            while (this != cu9VarA) {
                this.y1(dwbVar, false, true);
                if (!dwbVar.b()) {
                    this = this.W;
                    this.getClass();
                }
            }
            return new l9e(dwbVar.a, dwbVar.b, dwbVar.c, dwbVar.d);
        }
        return l9e.e;
    }

    public final void E1(m5c m5cVar, float[] fArr) {
        float[] fArrA;
        if (x44.r(m5cVar, this)) {
            return;
        }
        m5c m5cVar2 = this.W;
        m5cVar2.getClass();
        m5cVar2.E1(m5cVar, fArr);
        if (!y69.b(this.f0, 0L)) {
            float[] fArr2 = v0;
            nwa.d(fArr2);
            long j = this.f0;
            nwa.i(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            nwa.h(fArr, fArr2);
        }
        mmc mmcVar = this.r0;
        if (mmcVar == null || (fArrA = ((ma8) mmcVar).a()) == null) {
            return;
        }
        nwa.h(fArr, fArrA);
    }

    public final void F1(m5c m5cVar, float[] fArr) {
        while (!this.equals(m5cVar)) {
            mmc mmcVar = this.r0;
            if (mmcVar != null) {
                nwa.h(fArr, ((ma8) mmcVar).b());
            }
            if (!y69.b(this.f0, 0L)) {
                float[] fArr2 = v0;
                nwa.d(fArr2);
                nwa.i(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                nwa.h(fArr, fArr2);
            }
            this = this.W;
            this.getClass();
        }
    }

    @Override // defpackage.cu9
    public final long G(cu9 cu9Var, long j) {
        return L(cu9Var, j, true);
    }

    public final void G1(bz7 bz7Var, boolean z) {
        Owner owner;
        wwb wwbVar;
        Reference referencePoll;
        if (bz7Var != null && this.s0 != null) {
            b39.a("layerBlock can't be provided when explicitLayer is provided");
        }
        int i = 0;
        av9 av9Var = this.S;
        boolean z2 = (!z && this.Z == bz7Var && x44.r(this.a0, av9Var.d0) && this.b0 == av9Var.e0) ? false : true;
        this.a0 = av9Var.d0;
        this.b0 = av9Var.e0;
        boolean zX = av9Var.X();
        j5c j5cVar = this.p0;
        if (zX && bz7Var != null) {
            this.Z = bz7Var;
            if (this.r0 != null) {
                if (z2) {
                    H1(true);
                    return;
                }
                return;
            }
            Owner ownerA = dv9.a(av9Var);
            i35 i35Var = this.o0;
            if (i35Var == null) {
                i35 i35Var2 = new i35(this, 2, new j5c(this, i));
                this.o0 = i35Var2;
                i35Var = i35Var2;
            }
            mmc mmcVarI = ((AndroidComposeView) ownerA).i(i35Var, j5cVar, null);
            ma8 ma8Var = (ma8) mmcVarI;
            ma8Var.e(this.G);
            ma8Var.d(this.f0);
            this.r0 = mmcVarI;
            H1(true);
            av9Var.n0 = true;
            j5cVar.a();
            return;
        }
        this.Z = null;
        mmc mmcVar = this.r0;
        if (mmcVar != null) {
            ma8 ma8Var2 = (ma8) mmcVar;
            if (!yfd.H(ma8Var2.b())) {
                av9Var.k0(this);
            }
            ma8Var2.H = null;
            ma8Var2.I = null;
            ma8Var2.K = true;
            ma8Var2.f(false);
            ga8 ga8Var = ma8Var2.F;
            if (ga8Var != null) {
                ga8Var.a(ma8Var2.E);
                AndroidComposeView androidComposeView = ma8Var2.G;
                cbf cbfVar = androidComposeView.c1;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) cbfVar.G;
                    wwbVar = (wwb) cbfVar.F;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        wwbVar.l(referencePoll);
                    }
                } while (referencePoll != null);
                wwbVar.b(new WeakReference(ma8Var2, (ReferenceQueue) cbfVar.G));
                androidComposeView.l0.j(ma8Var2);
            }
            this.r0 = null;
            av9Var.n0 = true;
            j5cVar.a();
            if (h1().R && av9Var.Y() && (owner = av9Var.S) != null) {
                ((AndroidComposeView) owner).y(av9Var);
            }
        }
        this.q0 = false;
    }

    @Override // defpackage.cu9
    public final long H(long j) {
        if (!h1().R) {
            b39.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return L(nai.A(this), ((AndroidComposeView) dv9.a(this.S)).G(j), true);
    }

    public final void H1(boolean z) {
        char c;
        AndroidComposeView androidComposeView;
        boolean z2;
        AndroidComposeView androidComposeView2;
        Owner owner;
        zy7 zy7Var;
        int i;
        zy7 zy7Var2;
        if (this.s0 != null) {
            return;
        }
        mmc mmcVar = this.r0;
        bz7 bz7Var = this.Z;
        if (mmcVar == null) {
            if (bz7Var == null) {
                return;
            }
            b39.c("null layer with a non-null layerBlock");
            return;
        }
        if (bz7Var == null) {
            throw sq6.z("updateLayerParameters requires a non-null layerBlock");
        }
        xre xreVar = t0;
        xreVar.a();
        av9 av9Var = this.S;
        xreVar.W = av9Var.d0;
        xreVar.X = av9Var.e0;
        xreVar.V = csg.T(this.G);
        dv9.a(av9Var).getSnapshotObserver().a.d(this, j06.a0, new mx1(bz7Var, 13, this));
        tt9 tt9Var = this.i0;
        if (tt9Var == null) {
            tt9Var = new tt9();
            this.i0 = tt9Var;
        }
        tt9 tt9Var2 = u0;
        tt9Var2.getClass();
        tt9Var2.a = tt9Var.a;
        tt9Var2.b = tt9Var.b;
        tt9Var2.c = tt9Var.c;
        tt9Var2.d = tt9Var.d;
        tt9Var2.e = tt9Var.e;
        tt9Var2.f = tt9Var.f;
        tt9Var2.g = tt9Var.g;
        tt9Var2.h = tt9Var.h;
        tt9Var2.i = tt9Var.i;
        float f = xreVar.F;
        tt9Var.a = f;
        tt9Var.b = xreVar.G;
        tt9Var.c = xreVar.I;
        tt9Var.d = xreVar.J;
        tt9Var.e = xreVar.N;
        tt9Var.f = xreVar.O;
        tt9Var.g = xreVar.P;
        tt9Var.h = xreVar.Q;
        long j = xreVar.R;
        tt9Var.i = j;
        ma8 ma8Var = (ma8) mmcVar;
        AndroidComposeView androidComposeView3 = ma8Var.G;
        int i2 = xreVar.E | ma8Var.R;
        ma8Var.P = xreVar.X;
        ma8Var.O = xreVar.W;
        int i3 = i2 & FreeTypeConstants.FT_LOAD_MONOCHROME;
        if (i3 != 0) {
            ma8Var.S = j;
        }
        if ((i2 & 1) != 0) {
            la8 la8Var = ma8Var.E.a;
            if (la8Var.c() != f) {
                la8Var.B(f);
            }
        }
        if ((i2 & 2) != 0) {
            ja8 ja8Var = ma8Var.E;
            float f2 = xreVar.G;
            la8 la8Var2 = ja8Var.a;
            if (la8Var2.M() != f2) {
                la8Var2.o(f2);
            }
        }
        if ((i2 & 4) != 0) {
            ma8Var.E.g(xreVar.H);
        }
        if ((i2 & 8) != 0) {
            ja8 ja8Var2 = ma8Var.E;
            float f3 = xreVar.I;
            la8 la8Var3 = ja8Var2.a;
            if (la8Var3.D() != f3) {
                la8Var3.H(f3);
            }
        }
        if ((i2 & 16) != 0) {
            ja8 ja8Var3 = ma8Var.E;
            float f4 = xreVar.J;
            la8 la8Var4 = ja8Var3.a;
            if (la8Var4.x() != f4) {
                la8Var4.g(f4);
            }
        }
        if ((i2 & 32) != 0) {
            ja8 ja8Var4 = ma8Var.E;
            float f5 = xreVar.K;
            la8 la8Var5 = ja8Var4.a;
            if (la8Var5.L() != f5) {
                la8Var5.d(f5);
                ja8Var4.g = true;
                ja8Var4.a();
            }
            if (xreVar.K > MTTypesetterKt.kLineSkipLimitMultiplier && !ma8Var.X && (zy7Var2 = ma8Var.I) != null) {
                zy7Var2.a();
            }
        }
        if ((i2 & 64) != 0) {
            ja8 ja8Var5 = ma8Var.E;
            long j2 = xreVar.L;
            la8 la8Var6 = ja8Var5.a;
            if (!d54.c(j2, la8Var6.v())) {
                la8Var6.z(j2);
            }
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            ja8 ja8Var6 = ma8Var.E;
            long j3 = xreVar.M;
            la8 la8Var7 = ja8Var6.a;
            if (!d54.c(j3, la8Var7.y())) {
                la8Var7.I(j3);
            }
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            ja8 ja8Var7 = ma8Var.E;
            float f6 = xreVar.P;
            la8 la8Var8 = ja8Var7.a;
            if (la8Var8.t() != f6) {
                la8Var8.f(f6);
            }
        }
        if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            ja8 ja8Var8 = ma8Var.E;
            float f7 = xreVar.N;
            la8 la8Var9 = ja8Var8.a;
            if (la8Var9.F() != f7) {
                la8Var9.N(f7);
            }
        }
        if ((i2 & 512) != 0) {
            ja8 ja8Var9 = ma8Var.E;
            float f8 = xreVar.O;
            la8 la8Var10 = ja8Var9.a;
            if (la8Var10.r() != f8) {
                la8Var10.b(f8);
            }
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            ja8 ja8Var10 = ma8Var.E;
            float f9 = xreVar.Q;
            la8 la8Var11 = ja8Var10.a;
            if (la8Var11.C() != f9) {
                la8Var11.K(f9);
            }
        }
        if (i3 != 0) {
            c = ' ';
            boolean zA = d5i.a(ma8Var.S, d5i.b);
            ja8 ja8Var11 = ma8Var.E;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(d5i.b(ma8Var.S) * ((int) (ma8Var.J >> 32)))) << 32) | (((long) Float.floatToRawIntBits(d5i.c(ma8Var.S) * ((int) (ma8Var.J & 4294967295L)))) & 4294967295L);
                if (!fcc.c(ja8Var11.v, jFloatToRawIntBits)) {
                    ja8Var11.v = jFloatToRawIntBits;
                    ja8Var11.a.u(jFloatToRawIntBits);
                }
            } else if (!fcc.c(ja8Var11.v, 9205357640488583168L)) {
                ja8Var11.v = 9205357640488583168L;
                ja8Var11.a.u(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i2 & 16384) != 0) {
            ma8Var.E.h(xreVar.T);
        }
        if ((131072 & i2) != 0) {
            ma8Var.E.i(xreVar.Y);
        }
        if ((262144 & i2) != 0) {
            la8 la8Var12 = ma8Var.E.a;
            if (!x44.r(la8Var12.n(), null)) {
                la8Var12.A();
            }
        }
        if ((524288 & i2) != 0) {
            ja8 ja8Var12 = ma8Var.E;
            int i4 = xreVar.Z;
            la8 la8Var13 = ja8Var12.a;
            if (la8Var13.O() != i4) {
                la8Var13.j(i4);
            }
        }
        if ((32768 & i2) != 0) {
            ja8 ja8Var13 = ma8Var.E;
            int i5 = xreVar.U;
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i5 != 2) {
                    sz6.j("Not supported composition strategy");
                    return;
                }
            }
            la8 la8Var14 = ja8Var13.a;
            if (la8Var14.m() != i) {
                la8Var14.G(i);
            }
        }
        if ((i2 & 7963) != 0) {
            ma8Var.U = true;
            ma8Var.V = true;
        }
        if (x44.r(ma8Var.T, xreVar.a0)) {
            androidComposeView = androidComposeView3;
            z2 = false;
        } else {
            knk knkVar = xreVar.a0;
            ma8Var.T = knkVar;
            if (knkVar == null) {
                androidComposeView = androidComposeView3;
            } else {
                ja8 ja8Var14 = ma8Var.E;
                if (knkVar instanceof flc) {
                    l9e l9eVar = ((flc) knkVar).k;
                    float f10 = l9eVar.a;
                    float f11 = l9eVar.b;
                    androidComposeView = androidComposeView3;
                    ja8Var14.j(MTTypesetterKt.kLineSkipLimitMultiplier, (((long) Float.floatToRawIntBits(f10)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(l9eVar.c - f10)) << c) | (((long) Float.floatToRawIntBits(l9eVar.d - f11)) & 4294967295L));
                } else {
                    androidComposeView = androidComposeView3;
                    if (knkVar instanceof elc) {
                        c40 c40Var = ((elc) knkVar).k;
                        ja8Var14.k = null;
                        ja8Var14.i = 9205357640488583168L;
                        ja8Var14.h = 0L;
                        ja8Var14.j = MTTypesetterKt.kLineSkipLimitMultiplier;
                        ja8Var14.g = true;
                        ja8Var14.n = false;
                        ja8Var14.l = c40Var;
                        ja8Var14.a();
                    } else {
                        if (!(knkVar instanceof glc)) {
                            mr9.b();
                            return;
                        }
                        glc glcVar = (glc) knkVar;
                        c40 c40Var2 = glcVar.l;
                        if (c40Var2 != null) {
                            ja8Var14.k = null;
                            ja8Var14.i = 9205357640488583168L;
                            ja8Var14.h = 0L;
                            ja8Var14.j = MTTypesetterKt.kLineSkipLimitMultiplier;
                            ja8Var14.g = true;
                            ja8Var14.n = false;
                            ja8Var14.l = c40Var2;
                            ja8Var14.a();
                        } else {
                            sve sveVar = glcVar.k;
                            ja8Var14.j(Float.intBitsToFloat((int) (sveVar.h >> c)), (((long) Float.floatToRawIntBits(sveVar.a)) << c) | (((long) Float.floatToRawIntBits(sveVar.b)) & 4294967295L), (((long) Float.floatToRawIntBits(sveVar.b())) << c) | (((long) Float.floatToRawIntBits(sveVar.a())) & 4294967295L));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((knkVar instanceof elc) || ((knkVar instanceof glc) && !gb9.A(((glc) knkVar).k))) && (zy7Var = ma8Var.I) != null)) {
                    zy7Var.a();
                }
            }
            z2 = true;
        }
        ma8Var.R = xreVar.E;
        if (i2 != 0 || z2) {
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                androidComposeView2 = androidComposeView;
                parent.onDescendantInvalidated(androidComposeView2, androidComposeView2);
            } else {
                androidComposeView2 = androidComposeView;
            }
            if (AndroidComposeView.o()) {
                androidComposeView2.M(MTTypesetterKt.kLineSkipLimitMultiplier);
            }
        }
        boolean z3 = this.Y;
        this.Y = xreVar.T;
        this.c0 = xreVar.H;
        boolean z4 = tt9Var2.a == tt9Var.a && tt9Var2.b == tt9Var.b && tt9Var2.c == tt9Var.c && tt9Var2.d == tt9Var.d && tt9Var2.e == tt9Var.e && tt9Var2.f == tt9Var.f && tt9Var2.g == tt9Var.g && tt9Var2.h == tt9Var.h && d5i.a(tt9Var2.i, tt9Var.i);
        if (z && ((!z4 || z3 != this.Y) && (owner = av9Var.S) != null)) {
            ((AndroidComposeView) owner).y(av9Var);
        }
        if (z4) {
            return;
        }
        av9Var.k0(this);
        if (av9Var.t0 > 0) {
            AndroidComposeView androidComposeView4 = (AndroidComposeView) dv9.a(av9Var);
            q28 q28Var = androidComposeView4.D0.e;
            q28Var.getClass();
            if (av9Var.t0 > 0) {
                ((wwb) q28Var.F).b(av9Var);
                av9Var.s0 = true;
            }
            androidComposeView4.F(null);
        }
    }

    @Override // defpackage.fma
    public final void I0() {
        ja8 ja8Var = this.s0;
        long j = this.f0;
        if (ja8Var != null) {
            a0(j, this.g0, ja8Var);
        } else {
            Z(j, this.g0, this.Z);
        }
    }

    public final boolean I1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        mmc mmcVar = this.r0;
        if (mmcVar != null && this.Y) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            ja8 ja8Var = ((ma8) mmcVar).E;
            if (!(ja8Var.w ? dtj.k(ja8Var.e(), fIntBitsToFloat, fIntBitsToFloat2) : true)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cu9
    public final l9e J(cu9 cu9Var, boolean z) {
        if (!h1().R) {
            b39.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!cu9Var.n()) {
            b39.c("LayoutCoordinates " + cu9Var + " is not attached!");
        }
        m5c m5cVarC1 = C1(cu9Var);
        m5cVarC1.q1();
        m5c m5cVarD1 = d1(m5cVarC1);
        dwb dwbVar = this.h0;
        if (dwbVar == null) {
            dwbVar = new dwb();
            this.h0 = dwbVar;
        }
        dwbVar.a = MTTypesetterKt.kLineSkipLimitMultiplier;
        dwbVar.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        dwbVar.c = (int) (cu9Var.k() >> 32);
        dwbVar.d = (int) (cu9Var.k() & 4294967295L);
        while (m5cVarC1 != m5cVarD1) {
            m5cVarC1.y1(dwbVar, z, false);
            if (dwbVar.b()) {
                return l9e.e;
            }
            m5cVarC1 = m5cVarC1.W;
            m5cVarC1.getClass();
        }
        N0(m5cVarD1, dwbVar, z);
        return new l9e(dwbVar.a, dwbVar.b, dwbVar.c, dwbVar.d);
    }

    @Override // defpackage.cu9
    public final long K(long j) {
        if (!h1().R) {
            b39.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        q1();
        while (this != null) {
            av9 av9Var = this.S;
            if (this == ((m5c) av9Var.k0.I) && !av9Var.G) {
                long jB = dv9.a(av9Var).getRectManager().b(av9Var);
                if (!y69.b(jB, 9223372034707292159L)) {
                    return yfd.N(j, jB);
                }
            }
            mmc mmcVar = this.r0;
            if (mmcVar != null) {
                ma8 ma8Var = (ma8) mmcVar;
                float[] fArrB = ma8Var.b();
                if (!ma8Var.W) {
                    j = nwa.b(j, fArrB);
                }
            }
            j = yfd.N(j, this.f0);
            this = this.W;
        }
        return j;
    }

    @Override // defpackage.cu9
    public final long L(cu9 cu9Var, long j, boolean z) {
        if (cu9Var instanceof ima) {
            ima imaVar = (ima) cu9Var;
            imaVar.E.S.q1();
            return imaVar.L(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        m5c m5cVarC1 = C1(cu9Var);
        m5cVarC1.q1();
        m5c m5cVarD1 = d1(m5cVarC1);
        while (m5cVarC1 != m5cVarD1) {
            mmc mmcVar = m5cVarC1.r0;
            if (mmcVar != null) {
                ma8 ma8Var = (ma8) mmcVar;
                float[] fArrB = ma8Var.b();
                if (!ma8Var.W) {
                    j = nwa.b(j, fArrB);
                }
            }
            if (z || !m5cVarC1.M) {
                j = yfd.N(j, m5cVarC1.f0);
            }
            m5cVarC1 = m5cVarC1.W;
            m5cVarC1.getClass();
        }
        return O0(m5cVarD1, j, z);
    }

    public final void N0(m5c m5cVar, dwb dwbVar, boolean z) {
        if (m5cVar == this) {
            return;
        }
        m5c m5cVar2 = this.W;
        if (m5cVar2 != null) {
            m5cVar2.N0(m5cVar, dwbVar, z);
        }
        long j = this.f0;
        float f = (int) (j >> 32);
        dwbVar.a -= f;
        dwbVar.c -= f;
        float f2 = (int) (j & 4294967295L);
        dwbVar.b -= f2;
        dwbVar.d -= f2;
        mmc mmcVar = this.r0;
        if (mmcVar != null) {
            ma8 ma8Var = (ma8) mmcVar;
            float[] fArrA = ma8Var.a();
            if (!ma8Var.W) {
                if (fArrA == null) {
                    dwbVar.a = MTTypesetterKt.kLineSkipLimitMultiplier;
                    dwbVar.b = MTTypesetterKt.kLineSkipLimitMultiplier;
                    dwbVar.c = MTTypesetterKt.kLineSkipLimitMultiplier;
                    dwbVar.d = MTTypesetterKt.kLineSkipLimitMultiplier;
                } else {
                    nwa.c(fArrA, dwbVar);
                }
            }
            if (this.Y && z) {
                long j2 = this.G;
                dwbVar.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long O0(m5c m5cVar, long j, boolean z) {
        if (m5cVar == this) {
            return j;
        }
        m5c m5cVar2 = this.W;
        return (m5cVar2 == null || x44.r(m5cVar, m5cVar2)) ? e1(j, z) : e1(m5cVar2.O0(m5cVar, j, z), z);
    }

    public final long R0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - X();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - S();
        return (((long) Float.floatToRawIntBits(Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    public final float V0(long j, long j2) {
        if (X() >= Float.intBitsToFloat((int) (j2 >> 32)) && S() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR0 = R0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat3 < MTTypesetterKt.kLineSkipLimitMultiplier ? -fIntBitsToFloat3 : fIntBitsToFloat3 - X());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat4 < MTTypesetterKt.kLineSkipLimitMultiplier ? -fIntBitsToFloat4 : fIntBitsToFloat4 - S()))) & 4294967295L);
        if ((fIntBitsToFloat > MTTypesetterKt.kLineSkipLimitMultiplier || fIntBitsToFloat2 > MTTypesetterKt.kLineSkipLimitMultiplier) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return fcc.e(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void X0(fb2 fb2Var, ja8 ja8Var) {
        mmc mmcVar = this.r0;
        if (mmcVar == null) {
            long j = this.f0;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            fb2Var.n(f, f2);
            Z0(fb2Var, ja8Var);
            fb2Var.n(-f, -f2);
            return;
        }
        ma8 ma8Var = (ma8) mmcVar;
        ib2 ib2Var = ma8Var.Q;
        ma8Var.g();
        ma8Var.X = ma8Var.E.a.L() > MTTypesetterKt.kLineSkipLimitMultiplier;
        fj0 fj0Var = ib2Var.F;
        fj0Var.K(fb2Var);
        fj0Var.F = ja8Var;
        csg.t(ib2Var, ma8Var.E);
    }

    public final void Z0(fb2 fb2Var, ja8 ja8Var) {
        m5c m5cVar;
        fb2 fb2Var2;
        ja8 ja8Var2;
        hqb hqbVarI1 = i1(4);
        if (hqbVarI1 == null) {
            w1(fb2Var, ja8Var);
            return;
        }
        av9 av9Var = this.S;
        av9Var.getClass();
        cv9 sharedDrawScope = dv9.a(av9Var).getSharedDrawScope();
        long jT = csg.T(this.G);
        sharedDrawScope.getClass();
        wwb wwbVar = null;
        while (hqbVarI1 != null) {
            if (hqbVarI1 instanceof vd6) {
                m5cVar = this;
                fb2Var2 = fb2Var;
                ja8Var2 = ja8Var;
                sharedDrawScope.b(fb2Var2, jT, m5cVar, (vd6) hqbVarI1, ja8Var2);
            } else {
                m5cVar = this;
                fb2Var2 = fb2Var;
                ja8Var2 = ja8Var;
                if ((hqbVarI1.G & 4) != 0 && (hqbVarI1 instanceof qw5)) {
                    int i = 0;
                    for (hqb hqbVar = ((qw5) hqbVarI1).T; hqbVar != null; hqbVar = hqbVar.J) {
                        if ((hqbVar.G & 4) != 0) {
                            i++;
                            if (i == 1) {
                                hqbVarI1 = hqbVar;
                            } else {
                                if (wwbVar == null) {
                                    wwbVar = new wwb(0, new hqb[16]);
                                }
                                if (hqbVarI1 != null) {
                                    wwbVar.b(hqbVarI1);
                                    hqbVarI1 = null;
                                }
                                wwbVar.b(hqbVar);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                fb2Var = fb2Var2;
                this = m5cVar;
                ja8Var = ja8Var2;
            }
            hqbVarI1 = yfd.j(wwbVar);
            fb2Var = fb2Var2;
            this = m5cVar;
            ja8Var = ja8Var2;
        }
    }

    @Override // defpackage.c3d
    public abstract void a0(long j, float f, ja8 ja8Var);

    public abstract void a1();

    @Override // defpackage.cu9
    public final long b(long j) {
        long jK = K(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) dv9.a(this.S);
        androidComposeView.C();
        return nwa.b(jK, androidComposeView.H0);
    }

    public final m5c d1(m5c m5cVar) {
        av9 av9VarG = m5cVar.S;
        av9 av9Var = this.S;
        if (av9VarG == av9Var) {
            hqb hqbVarH1 = m5cVar.h1();
            hqb hqbVarH12 = h1();
            if (!hqbVarH12.E.R) {
                b39.c("visitLocalAncestors called on an unattached node");
            }
            for (hqb hqbVar = hqbVarH12.E.I; hqbVar != null; hqbVar = hqbVar.I) {
                if ((hqbVar.G & 2) != 0 && hqbVar == hqbVarH1) {
                    return m5cVar;
                }
            }
            return this;
        }
        while (av9VarG.U > av9Var.U) {
            av9VarG = av9VarG.G();
            av9VarG.getClass();
        }
        av9 av9VarG2 = av9Var;
        while (av9VarG2.U > av9VarG.U) {
            av9VarG2 = av9VarG2.G();
            av9VarG2.getClass();
        }
        while (av9VarG != av9VarG2) {
            av9VarG = av9VarG.G();
            av9VarG2 = av9VarG2.G();
            if (av9VarG == null || av9VarG2 == null) {
                sz6.p("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (av9VarG2 != av9Var) {
            if (av9VarG != m5cVar.S) {
                return (z39) av9VarG.k0.H;
            }
            return m5cVar;
        }
        return this;
    }

    public final long e1(long j, boolean z) {
        if (z || !this.M) {
            long j2 = this.f0;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        mmc mmcVar = this.r0;
        if (mmcVar != null) {
            ma8 ma8Var = (ma8) mmcVar;
            float[] fArrA = ma8Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!ma8Var.W) {
                return nwa.b(j, fArrA);
            }
        }
        return j;
    }

    public abstract hma f1();

    public final long g1() {
        return this.a0.U0(this.S.f0.d());
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.S.d0.getDensity();
    }

    @Override // defpackage.xa9
    public final fu9 getLayoutDirection() {
        return this.S.e0;
    }

    @Override // defpackage.cu9
    public final void h(float[] fArr) {
        Owner ownerA = dv9.a(this.S);
        m5c m5cVarC1 = C1(nai.A(this));
        F1(m5cVarC1, fArr);
        if (ownerA instanceof AndroidComposeView) {
            ((AndroidComposeView) ownerA).s(fArr);
            return;
        }
        long jQ = m5cVarC1.q(0L);
        if ((9223372034707292159L & jQ) != 9205357640488583168L) {
            nwa.i(fArr, Float.intBitsToFloat((int) (jQ >> 32)), Float.intBitsToFloat((int) (jQ & 4294967295L)));
        }
    }

    public abstract hqb h1();

    public final hqb i1(int i) {
        boolean zG = s5c.g(i);
        hqb hqbVarH1 = h1();
        if (!zG && (hqbVarH1 = hqbVarH1.I) == null) {
            return null;
        }
        for (hqb hqbVarJ1 = j1(zG); hqbVarJ1 != null && (hqbVarJ1.H & i) != 0; hqbVarJ1 = hqbVarJ1.J) {
            if ((hqbVarJ1.G & i) != 0) {
                return hqbVarJ1;
            }
            if (hqbVarJ1 == hqbVarH1) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.cu9
    public final void j(cu9 cu9Var, float[] fArr) {
        m5c m5cVarC1 = C1(cu9Var);
        m5cVarC1.q1();
        m5c m5cVarD1 = d1(m5cVarC1);
        nwa.d(fArr);
        m5cVarC1.F1(m5cVarD1, fArr);
        E1(m5cVarD1, fArr);
    }

    public final hqb j1(boolean z) {
        hqb hqbVarH1;
        g5c g5cVar = this.S.k0;
        if (((m5c) g5cVar.I) == this) {
            return (hqb) g5cVar.K;
        }
        m5c m5cVar = this.W;
        if (!z) {
            if (m5cVar != null) {
                return m5cVar.h1();
            }
            return null;
        }
        if (m5cVar == null || (hqbVarH1 = m5cVar.h1()) == null) {
            return null;
        }
        return hqbVarH1.J;
    }

    @Override // defpackage.cu9
    public final long k() {
        return this.G;
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.S.d0.k0();
    }

    public final void k1(hqb hqbVar, i5c i5cVar, long j, dn8 dn8Var, int i, boolean z) {
        if (hqbVar == null) {
            n1(i5cVar, j, dn8Var, i, z);
            return;
        }
        if (!i5cVar.i(hqbVar)) {
            k1(auk.c(hqbVar, i5cVar.h()), i5cVar, j, dn8Var, i, z);
            return;
        }
        int i2 = dn8Var.G;
        qvb qvbVar = dn8Var.E;
        dn8Var.e(i2 + 1, qvbVar.b);
        dn8Var.G++;
        qvbVar.a(hqbVar);
        dn8Var.F.a(rsk.a(-1.0f, z, false));
        k1(auk.c(hqbVar, i5cVar.h()), i5cVar, j, dn8Var, i, z);
        dn8Var.G = i2;
    }

    public final void l1(hqb hqbVar, i5c i5cVar, long j, dn8 dn8Var, int i, boolean z, float f) {
        if (hqbVar == null) {
            n1(i5cVar, j, dn8Var, i, z);
            return;
        }
        if (!i5cVar.i(hqbVar)) {
            l1(auk.c(hqbVar, i5cVar.h()), i5cVar, j, dn8Var, i, z, f);
            return;
        }
        int i2 = dn8Var.G;
        qvb qvbVar = dn8Var.E;
        dn8Var.e(i2 + 1, qvbVar.b);
        dn8Var.G++;
        qvbVar.a(hqbVar);
        dn8Var.F.a(rsk.a(f, z, false));
        v1(auk.c(hqbVar, i5cVar.h()), i5cVar, j, dn8Var, i, z, f, true);
        dn8Var.G = i2;
    }

    public final void m1(i5c i5cVar, long j, dn8 dn8Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        hqb hqbVarI1 = i1(i5cVar.h());
        if (!I1(j)) {
            if (j8d.b(i, 1)) {
                float fV0 = V0(j, g1());
                if ((Float.floatToRawIntBits(fV0) & Integer.MAX_VALUE) < 2139095040) {
                    if (dn8Var.G != dn8Var.E.b - 1) {
                        if (dtj.e(dn8Var.a(), rsk.a(fV0, false, false)) <= 0) {
                            return;
                        }
                    }
                    l1(hqbVarI1, i5cVar, j, dn8Var, i, false, fV0);
                    return;
                }
                return;
            }
            return;
        }
        if (hqbVarI1 == null) {
            n1(i5cVar, j, dn8Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= MTTypesetterKt.kLineSkipLimitMultiplier && fIntBitsToFloat2 >= MTTypesetterKt.kLineSkipLimitMultiplier && fIntBitsToFloat < X() && fIntBitsToFloat2 < S()) {
            k1(hqbVarI1, i5cVar, j, dn8Var, i, z);
            return;
        }
        float fV02 = !j8d.b(i, 1) ? Float.POSITIVE_INFINITY : V0(j, g1());
        if ((Float.floatToRawIntBits(fV02) & Integer.MAX_VALUE) < 2139095040) {
            if (dn8Var.G != dn8Var.E.b - 1) {
                z2 = z;
                if (dtj.e(dn8Var.a(), rsk.a(fV02, z2, false)) > 0) {
                }
                v1(hqbVarI1, i5cVar, j, dn8Var, i, z2, fV02, z3);
            }
            z2 = z;
            z3 = true;
            v1(hqbVarI1, i5cVar, j, dn8Var, i, z2, fV02, z3);
        }
        z2 = z;
        z3 = false;
        v1(hqbVarI1, i5cVar, j, dn8Var, i, z2, fV02, z3);
    }

    @Override // defpackage.cu9
    public final boolean n() {
        return h1().R;
    }

    public void n1(i5c i5cVar, long j, dn8 dn8Var, int i, boolean z) {
        m5c m5cVar = this.V;
        if (m5cVar != null) {
            m5cVar.m1(i5cVar, m5cVar.e1(j, true), dn8Var, i, z);
        }
    }

    @Override // defpackage.fma
    public final fma o0() {
        return this.V;
    }

    public final void o1() {
        mmc mmcVar = this.r0;
        if (mmcVar != null) {
            ((ma8) mmcVar).c();
            return;
        }
        m5c m5cVar = this.W;
        if (m5cVar != null) {
            m5cVar.o1();
        }
    }

    public final boolean p1() {
        if (this.r0 != null && this.c0 <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return true;
        }
        m5c m5cVar = this.W;
        if (m5cVar != null) {
            return m5cVar.p1();
        }
        return false;
    }

    @Override // defpackage.cu9
    public final long q(long j) {
        if (!h1().R) {
            b39.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) dv9.a(this.S)).t(K(j));
    }

    public final void q1() {
        this.S.t().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [hqb] */
    /* JADX WARN: Type inference failed for: r7v7, types: [hqb] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void r1() {
        hqb hqbVarH1;
        boolean zG = s5c.g(FreeTypeConstants.FT_LOAD_PEDANTIC);
        hqb hqbVarJ1 = j1(zG);
        if (hqbVarJ1 == null || (hqbVarJ1.E.H & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            return;
        }
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            if (!zG) {
                hqbVarH1 = h1().I;
                if (hqbVarH1 == null) {
                }
            }
            hqbVarH1 = h1();
            for (hqb hqbVarJ12 = j1(zG); hqbVarJ12 != null; hqbVarJ12 = hqbVarJ12.J) {
                if ((hqbVarJ12.H & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
                    break;
                }
                if ((hqbVarJ12.G & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                    ?? J = hqbVarJ12;
                    ?? wwbVar = 0;
                    while (J != 0) {
                        if (J instanceof s5b) {
                            ((s5b) J).c(this.G);
                        } else if ((J.G & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 && (J instanceof qw5)) {
                            hqb hqbVar = ((qw5) J).T;
                            int i = 0;
                            J = J;
                            wwbVar = wwbVar;
                            while (hqbVar != null) {
                                if ((hqbVar.G & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                                    i++;
                                    wwbVar = wwbVar;
                                    if (i == 1) {
                                        J = hqbVar;
                                    } else {
                                        if (wwbVar == 0) {
                                            wwbVar = new wwb(0, new hqb[16]);
                                        }
                                        if (J != 0) {
                                            wwbVar.b(J);
                                            J = 0;
                                        }
                                        wwbVar.b(hqbVar);
                                    }
                                }
                                hqbVar = hqbVar.J;
                                J = J;
                                wwbVar = wwbVar;
                            }
                            if (i == 1) {
                            }
                        }
                        J = yfd.j(wwbVar);
                    }
                }
                if (hqbVarJ12 == hqbVarH1) {
                    break;
                }
            }
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    @Override // defpackage.fma
    public final cu9 s0() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [hqb] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void s1() {
        boolean zG = s5c.g(4194304);
        hqb hqbVarH1 = h1();
        if (!zG && (hqbVarH1 = hqbVarH1.I) == null) {
            return;
        }
        for (hqb hqbVarJ1 = j1(zG); hqbVarJ1 != null && (hqbVarJ1.H & 4194304) != 0; hqbVarJ1 = hqbVarJ1.J) {
            if ((hqbVarJ1.G & 4194304) != 0) {
                ?? J = hqbVarJ1;
                ?? wwbVar = 0;
                while (J != 0) {
                    if (J instanceof yt9) {
                        ((yt9) J).n(this);
                    } else if ((J.G & 4194304) != 0 && (J instanceof qw5)) {
                        hqb hqbVar = ((qw5) J).T;
                        int i = 0;
                        J = J;
                        wwbVar = wwbVar;
                        while (hqbVar != null) {
                            if ((hqbVar.G & 4194304) != 0) {
                                i++;
                                wwbVar = wwbVar;
                                if (i == 1) {
                                    J = hqbVar;
                                } else {
                                    if (wwbVar == 0) {
                                        wwbVar = new wwb(0, new hqb[16]);
                                    }
                                    if (J != 0) {
                                        wwbVar.b(J);
                                        J = 0;
                                    }
                                    wwbVar.b(hqbVar);
                                }
                            }
                            hqbVar = hqbVar.J;
                            J = J;
                            wwbVar = wwbVar;
                        }
                        if (i == 1) {
                        }
                    }
                    J = yfd.j(wwbVar);
                }
            }
            if (hqbVarJ1 == hqbVarH1) {
                return;
            }
        }
    }

    public final void t1() {
        this.X = true;
        this.p0.a();
        z1();
        if (y69.b(this.f0, 0L)) {
            return;
        }
        this.S.k0(this);
    }

    @Override // defpackage.fma
    public final boolean u0() {
        return this.d0 != null;
    }

    public final void u1() {
        boolean zG = s5c.g(FreeTypeConstants.FT_LOAD_COLOR);
        hqb hqbVarJ1 = j1(zG);
        if (hqbVarJ1 == null || (hqbVarJ1.E.H & FreeTypeConstants.FT_LOAD_COLOR) == 0) {
            return;
        }
        hqb hqbVarH1 = h1();
        if (!zG && (hqbVarH1 = hqbVarH1.I) == null) {
            return;
        }
        for (hqb hqbVarJ12 = j1(zG); hqbVarJ12 != null && (hqbVarJ12.H & FreeTypeConstants.FT_LOAD_COLOR) != 0; hqbVarJ12 = hqbVarJ12.J) {
            if ((hqbVarJ12.G & FreeTypeConstants.FT_LOAD_COLOR) != 0) {
                hqb hqbVarJ = hqbVarJ12;
                wwb wwbVar = null;
                while (hqbVarJ != null) {
                    if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_COLOR) != 0 && (hqbVarJ instanceof qw5)) {
                        int i = 0;
                        for (hqb hqbVar = ((qw5) hqbVarJ).T; hqbVar != null; hqbVar = hqbVar.J) {
                            if ((hqbVar.G & FreeTypeConstants.FT_LOAD_COLOR) != 0) {
                                i++;
                                if (i == 1) {
                                    hqbVarJ = hqbVar;
                                } else {
                                    if (wwbVar == null) {
                                        wwbVar = new wwb(0, new hqb[16]);
                                    }
                                    if (hqbVarJ != null) {
                                        wwbVar.b(hqbVarJ);
                                        hqbVarJ = null;
                                    }
                                    wwbVar.b(hqbVar);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    hqbVarJ = yfd.j(wwbVar);
                }
            }
            if (hqbVarJ12 == hqbVarH1) {
                return;
            }
        }
    }

    @Override // defpackage.nmc
    public final boolean v() {
        return (this.r0 == null || this.X || !this.S.X()) ? false : true;
    }

    @Override // defpackage.fma
    public final av9 v0() {
        return this.S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188 A[PHI: r3
      0x0188: PHI (r3v19 ??) = (r3v1 ??), (r3v1 ??), (r3v21 ??) binds: [B:42:0x0153, B:44:0x0157, B:58:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r2v12, types: [hqb] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [wwb] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [wwb] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1(defpackage.hqb r13, defpackage.i5c r14, long r15, defpackage.dn8 r17, int r18, boolean r19, float r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5c.v1(hqb, i5c, long, dn8, int, boolean, float, boolean):void");
    }

    @Override // defpackage.cu9
    public final long w(long j) {
        if (!h1().R) {
            b39.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cu9 cu9VarA = nai.A(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) dv9.a(this.S);
        androidComposeView.C();
        return L(cu9VarA, fcc.h(nwa.b(j, androidComposeView.I0), cu9VarA.K(0L)), true);
    }

    public abstract void w1(fb2 fb2Var, ja8 ja8Var);

    @Override // defpackage.fma
    public final p5b x0() {
        p5b p5bVar = this.d0;
        if (p5bVar != null) {
            return p5bVar;
        }
        sz6.j("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final void x1(long j, float f, bz7 bz7Var, ja8 ja8Var) {
        int i = 0;
        av9 av9Var = this.S;
        if (ja8Var != null) {
            if (bz7Var != null) {
                b39.a("both ways to create layers shouldn't be used together");
            }
            if (this.s0 != ja8Var) {
                this.s0 = null;
                G1(null, false);
                this.s0 = ja8Var;
            }
            if (this.r0 == null) {
                Owner ownerA = dv9.a(av9Var);
                i35 i35Var = this.o0;
                if (i35Var == null) {
                    i35 i35Var2 = new i35(this, 2, new j5c(this, i));
                    this.o0 = i35Var2;
                    i35Var = i35Var2;
                }
                j5c j5cVar = this.p0;
                mmc mmcVarI = ((AndroidComposeView) ownerA).i(i35Var, j5cVar, ja8Var);
                ma8 ma8Var = (ma8) mmcVarI;
                ma8Var.e(this.G);
                ma8Var.d(j);
                this.r0 = mmcVarI;
                av9Var.n0 = true;
                j5cVar.a();
            }
        } else {
            if (this.s0 != null) {
                this.s0 = null;
                G1(null, false);
            }
            G1(bz7Var, false);
        }
        if (!y69.b(this.f0, j)) {
            ((AndroidComposeView) dv9.a(av9Var)).M(-4.0f);
            this.f0 = j;
            mmc mmcVar = this.r0;
            if (mmcVar != null) {
                ((ma8) mmcVar).d(j);
            } else {
                m5c m5cVar = this.W;
                if (m5cVar != null) {
                    m5cVar.o1();
                }
            }
            av9Var.k0(this);
            fma.G0(this);
            Owner owner = av9Var.S;
            if (owner != null) {
                ((AndroidComposeView) owner).y(av9Var);
            }
        }
        this.g0 = f;
        if (this == ((m5c) av9Var.k0.I)) {
            dv9.a(av9Var).getRectManager().f(av9Var);
        }
        if (this.O) {
            return;
        }
        l0(x0());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(defpackage.dwb r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5c.y1(dwb, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [hqb] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [hqb] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.c3d, defpackage.h5b
    public final Object z() {
        av9 av9Var = this.S;
        if (!av9Var.k0.i(64)) {
            return null;
        }
        h1();
        Object objD = null;
        for (hqb hqbVar = (j4h) av9Var.k0.J; hqbVar != null; hqbVar = hqbVar.I) {
            if ((hqbVar.G & 64) != 0) {
                ?? J = hqbVar;
                ?? wwbVar = 0;
                while (J != 0) {
                    if (J instanceof nsc) {
                        objD = ((nsc) J).d(av9Var.d0, objD);
                    } else if ((J.G & 64) != 0 && (J instanceof qw5)) {
                        hqb hqbVar2 = ((qw5) J).T;
                        int i = 0;
                        J = J;
                        wwbVar = wwbVar;
                        while (hqbVar2 != null) {
                            if ((hqbVar2.G & 64) != 0) {
                                i++;
                                wwbVar = wwbVar;
                                if (i == 1) {
                                    J = hqbVar2;
                                } else {
                                    if (wwbVar == 0) {
                                        wwbVar = new wwb(0, new hqb[16]);
                                    }
                                    if (J != 0) {
                                        wwbVar.b(J);
                                        J = 0;
                                    }
                                    wwbVar.b(hqbVar2);
                                }
                            }
                            hqbVar2 = hqbVar2.J;
                            J = J;
                            wwbVar = wwbVar;
                        }
                        if (i == 1) {
                        }
                    }
                    J = yfd.j(wwbVar);
                }
            }
        }
        return objD;
    }

    public final void z1() {
        if (this.r0 != null) {
            if (this.s0 != null) {
                this.s0 = null;
            }
            G1(null, false);
            this.S.u0(false);
        }
    }
}
