package defpackage;

import androidx.compose.ui.node.Owner;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class fma extends c3d implements yrb, q5b {
    public cma J;
    public bz7 K;
    public e3d L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final gma P = new gma(0, this);
    public vr8 Q;
    public ewb R;

    public static void G0(m5c m5cVar) {
        bv9 bv9Var;
        m5c m5cVar2 = m5cVar.V;
        av9 av9Var = m5cVar.S;
        if (!x44.r(m5cVar2 != null ? m5cVar2.S : null, av9Var)) {
            av9Var.t().p.c0.f();
            return;
        }
        au auVarF = av9Var.t().p.f();
        if (auVarF == null || (bv9Var = ((n5b) auVarF).c0) == null) {
            return;
        }
        bv9Var.f();
    }

    public abstract fma A0();

    @Override // defpackage.yrb
    public final void B(boolean z) {
        fma fmaVarA0 = A0();
        av9 av9VarV0 = fmaVarA0 != null ? fmaVarA0.v0() : null;
        if (x44.r(av9VarV0, v0())) {
            this.M = z;
            return;
        }
        if ((av9VarV0 != null ? av9VarV0.w() : null) != vu9.G) {
            if ((av9VarV0 != null ? av9VarV0.w() : null) != vu9.H) {
                return;
            }
        }
        this.M = z;
    }

    public abstract long D0();

    public final cma F0() {
        cma cmaVar = this.J;
        if (cmaVar != null) {
            return cmaVar;
        }
        cma cmaVar2 = new cma(this);
        this.J = cmaVar2;
        return cmaVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0(fwb fwbVar) {
        av9 av9Var;
        Object[] objArr = fwbVar.b;
        long[] jArr = fwbVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (av9Var = (av9) ((o6j) objArr[(i << 3) + i3]).get()) != null) {
                        if (n0()) {
                            av9Var.s0(false);
                        } else {
                            av9Var.u0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void I0();

    @Override // defpackage.q5b
    public final p5b J0(int i, int i2, Map map, bz7 bz7Var, bz7 bz7Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            b39.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new ema(i, i2, map, bz7Var, bz7Var2, this);
    }

    @Override // defpackage.c3d
    public final int R(ut utVar) {
        int iI0;
        if (!u0() || (iI0 = i0(utVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = utVar instanceof uti;
        long j = this.I;
        return iI0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(defpackage.av9 r32, defpackage.uo8 r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.f0(av9, uo8):void");
    }

    public abstract int i0(ut utVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(e3d e3dVar, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        av9 av9Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        omc snapshotObserver;
        ewb ewbVar = this.R;
        vr8 vr8Var = this.Q;
        if (vr8Var == null) {
            vr8Var = new vr8();
            this.Q = vr8Var;
        }
        vr8 vr8Var2 = vr8Var;
        Owner owner = v0().S;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.a.d(e3dVar, j06.Y, new dma(this, j, j2, e3dVar));
        }
        boolean zN0 = n0();
        fwb fwbVar = (fwb) vr8Var2.e;
        fwb fwbVar2 = (fwb) vr8Var2.f;
        int i2 = vr8Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) vr8Var2.d)[i3];
            if (b == 3) {
                uo8 uo8Var = ((uo8[]) vr8Var2.b)[i3];
                uo8Var.getClass();
                fwbVar2.l(uo8Var);
            } else if (b != 0 && ewbVar != null) {
                uo8 uo8Var2 = ((uo8[]) vr8Var2.b)[i3];
                uo8Var2.getClass();
                fwb fwbVar3 = (fwb) ewbVar.k(uo8Var2);
                if (fwbVar3 != null) {
                    fwbVar.k(fwbVar3);
                }
            }
        }
        int i4 = vr8Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) vr8Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                uo8[] uo8VarArr = (uo8[]) vr8Var2.b;
                uo8VarArr[i6 - i5] = uo8VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = vr8Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((uo8[]) vr8Var2.b)[i8] = null;
        }
        vr8Var2.a -= i5;
        fma fmaVarA0 = A0();
        Object[] objArr = fwbVar2.b;
        long[] jArr = fwbVar2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            uo8 uo8Var3 = (uo8) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            fma fmaVar = fmaVarA0 == null ? this : fmaVarA0;
                            i = i9;
                            fma fmaVar2 = fmaVar;
                            while (true) {
                                vr8 vr8Var3 = fmaVar2.Q;
                                if (vr8Var3 != null) {
                                    z2 = zN0;
                                    if (!mp0.o0(uo8Var3, (uo8[]) vr8Var3.b)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z2 = zN0;
                                fma fmaVarA02 = fmaVar2.A0();
                                if (fmaVarA02 == null) {
                                    break;
                                }
                                fmaVar2 = fmaVarA02;
                                zN0 = z2;
                            }
                            ewb ewbVar2 = fmaVar2.R;
                            fwb fwbVar4 = ewbVar2 != null ? (fwb) ewbVar2.k(uo8Var3) : null;
                            if (fwbVar4 != null) {
                                fmaVar.H0(fwbVar4);
                            }
                        } else {
                            z2 = zN0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zN0 = z2;
                    }
                    z = zN0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zN0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zN0 = z;
                i9 = 8;
            }
        } else {
            z = zN0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        fwbVar2.b();
        Object[] objArr2 = fwbVar.b;
        long[] jArr2 = fwbVar.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (av9Var = (av9) ((o6j) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                av9Var.s0(false);
                            } else {
                                av9Var.u0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        fwbVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(defpackage.p5b r15) {
        /*
            r14 = this;
            ewb r0 = r14.R
            boolean r1 = r14.O
            if (r1 == 0) goto L8
            goto Lbd
        L8:
            bz7 r1 = r15.e()
            r2 = 0
            if (r1 != 0) goto L59
            if (r0 == 0) goto Lbd
            java.lang.Object[] r15 = r0.c
            long[] r1 = r0.a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L55
            r4 = r2
        L1b:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L50
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L35:
            if (r9 >= r7) goto L4e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            fwb r10 = (defpackage.fwb) r10
            r14.H0(r10)
        L4a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4e:
            if (r7 != r8) goto L55
        L50:
            if (r4 == r3) goto L55
            int r4 = r4 + 1
            goto L1b
        L55:
            r0.a()
            return
        L59:
            bz7 r0 = r14.K
            r3 = 1
            if (r0 == r1) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r2
        L61:
            r4 = 0
            if (r0 != 0) goto L9a
            cma r1 = r14.F0()
            boolean r1 = r1.E
            if (r1 == 0) goto L9a
            cu9 r0 = r14.s0()
            long r4 = r0.q(r4)
            long r4 = defpackage.yfd.a0(r4)
            long r0 = r0.k()
            cma r6 = r14.F0()
            long r6 = r6.F
            boolean r6 = defpackage.y69.b(r4, r6)
            if (r6 == 0) goto L95
            cma r6 = r14.F0()
            long r6 = r6.G
            boolean r6 = defpackage.g79.b(r0, r6)
            if (r6 != 0) goto L96
        L95:
            r2 = r3
        L96:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La1
        L9a:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La1:
            if (r0 == 0) goto Lbd
            e3d r0 = r14.L
            if (r0 == 0) goto Lac
            r0.E = r15
        La9:
            r1 = r14
            r2 = r0
            goto Lb4
        Lac:
            e3d r0 = new e3d
            r0.<init>(r15, r14)
            r14.L = r0
            goto La9
        Lb4:
            r1.j0(r2, r3, r5)
            bz7 r14 = r15.e()
            r1.K = r14
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.l0(p5b):void");
    }

    @Override // defpackage.xa9
    public boolean n0() {
        return false;
    }

    public abstract fma o0();

    public abstract cu9 s0();

    public abstract boolean u0();

    public abstract av9 v0();

    public abstract p5b x0();
}
