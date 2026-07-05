package defpackage;

import android.os.Trace;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e18 implements ld4 {
    public int A;
    public int B;
    public boolean C;
    public final d18 D;
    public final ArrayList E;
    public boolean F;
    public rag G;
    public sag H;
    public vag I;
    public boolean J;
    public hyc K;
    public ch2 L;
    public final md4 M;
    public y08 N;
    public tm7 O;
    public k5g P;
    public final je4 Q;
    public final c45 R;
    public boolean S;
    public long T;
    public f18 U;
    public final a0 a;
    public final ge4 b;
    public final sag c;
    public final iwb d;
    public final ch2 e;
    public final ch2 f;
    public final n78 g;
    public final le4 h;
    public h18 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public vub p;
    public boolean q;
    public boolean r;
    public xub v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final h79 n = new h79(1, false);
    public final ArrayList s = new ArrayList();
    public final h79 t = new h79(1, false);
    public hyc u = hyc.H;
    public final h79 x = new h79(1, false);
    public int z = -1;

    public e18(a0 a0Var, ge4 ge4Var, sag sagVar, iwb iwbVar, ch2 ch2Var, ch2 ch2Var2, n78 n78Var, le4 le4Var) {
        this.a = a0Var;
        this.b = ge4Var;
        this.c = sagVar;
        this.d = iwbVar;
        this.e = ch2Var;
        this.f = ch2Var2;
        this.g = n78Var;
        this.h = le4Var;
        this.C = ge4Var.f() || ge4Var.d();
        this.D = new d18(0, this);
        this.E = new ArrayList();
        rag ragVarG = sagVar.g();
        ragVarG.c();
        this.G = ragVarG;
        sag sagVar2 = new sag();
        if (ge4Var.f()) {
            sagVar2.e();
        }
        if (ge4Var.d()) {
            sagVar2.O = new xub();
        }
        this.H = sagVar2;
        vag vagVarH = sagVar2.h();
        vagVarH.e(true);
        this.I = vagVarH;
        this.M = new md4(this, ch2Var);
        rag ragVarG2 = this.H.g();
        try {
            y08 y08VarA = ragVarG2.a(0);
            ragVarG2.c();
            this.N = y08VarA;
            this.O = new tm7();
            this.Q = new je4(this);
            c45 c45VarJ = ge4Var.j();
            c45 c45VarB = B();
            this.R = c45VarJ.r0(c45VarB == null ? im6.E : c45VarB);
        } catch (Throwable th) {
            ragVarG2.c();
            throw th;
        }
    }

    public static final int P(e18 e18Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        rag ragVar;
        rag ragVar2 = e18Var.G;
        int i7 = 0;
        if (ragVar2.j(i)) {
            int i8 = ragVar2.i(i);
            Object objP = ragVar2.p(i, ragVar2.b);
            if (i8 == 206 && x44.r(objP, pd4.f)) {
                Object objH = ragVar2.h(i, 0);
                i18 i18Var = objH instanceof i18 ? (i18) objH : null;
                mee meeVar = i18Var != null ? i18Var.a : null;
                b18 b18Var = meeVar instanceof b18 ? (b18) meeVar : null;
                if (b18Var != null) {
                    fwb fwbVar = b18Var.E.e;
                    Object[] objArr = fwbVar.b;
                    long[] jArr3 = fwbVar.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr3[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        e18 e18Var2 = (e18) objArr[(i9 << 3) + i12];
                                        sag sagVar = e18Var2.c;
                                        if (sagVar.F <= 0 || (sagVar.E[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i10;
                                        } else {
                                            le4 le4Var = e18Var2.h;
                                            synchronized (le4Var.H) {
                                                le4Var.p();
                                                i6 = i10;
                                                ewb ewbVar = le4Var.R;
                                                le4Var.R = x44.C();
                                                try {
                                                    le4Var.Z.h0(ewbVar);
                                                } finally {
                                                }
                                            }
                                            ch2 ch2Var = new ch2();
                                            e18Var2.L = ch2Var;
                                            rag ragVarG = e18Var2.c.g();
                                            try {
                                                e18Var2.G = ragVarG;
                                                md4 md4Var = e18Var2.M;
                                                ch2 ch2Var2 = md4Var.b;
                                                try {
                                                    md4Var.b = ch2Var;
                                                    e18Var2.O(0);
                                                    md4 md4Var2 = e18Var2.M;
                                                    md4Var2.b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (md4Var2.c) {
                                                            ragVar = ragVarG;
                                                            try {
                                                                md4Var2.b.f.a0(wic.d);
                                                                if (md4Var2.c) {
                                                                    md4Var2.d(false);
                                                                    md4Var2.d(false);
                                                                    md4Var2.b.f.a0(gic.d);
                                                                    i5 = 0;
                                                                    md4Var2.c = false;
                                                                }
                                                                md4Var.b = ch2Var2;
                                                                ragVar.c();
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                md4Var.b = ch2Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            ragVar = ragVarG;
                                                        }
                                                        md4Var.b = ch2Var2;
                                                        ragVar.c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        ragVar.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    ragVar = ragVarG;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                ragVar = ragVarG;
                                            }
                                        }
                                        e18Var.b.r(e18Var2.h);
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i7;
                                        i6 = i10;
                                    }
                                    j >>= i6;
                                    i12++;
                                    i10 = i6;
                                    i7 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i4 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i4 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return ragVar2.o(i);
            }
            i3 = 1;
            if (!ragVar2.l(i)) {
                return ragVar2.o(i);
            }
        } else {
            i3 = 1;
            if (ragVar2.d(i)) {
                int i13 = ragVar2.b[(i * 5) + 3] + i;
                int iP = 0;
                for (int i14 = i + 1; i14 < i13; i14 += ragVar2.b[(i14 * 5) + 3]) {
                    boolean zL = ragVar2.l(i14);
                    if (zL) {
                        e18Var.M.c();
                        md4 md4Var3 = e18Var.M;
                        Object objN = ragVar2.n(i14);
                        md4Var3.c();
                        md4Var3.h.add(objN);
                    }
                    iP += P(e18Var, i14, zL || z, zL ? 0 : i2 + iP);
                    if (zL) {
                        e18Var.M.c();
                        e18Var.M.a();
                    }
                }
                if (!ragVar2.l(i)) {
                    return iP;
                }
            } else if (!ragVar2.l(i)) {
                return ragVar2.o(i);
            }
        }
        return i3;
    }

    public final boolean A() {
        if (!C() || this.w) {
            return true;
        }
        r7e r7eVarZ = z();
        return (r7eVarZ == null || (r7eVarZ.b & 4) == 0) ? false : true;
    }

    public final je4 B() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean C() {
        r7e r7eVarZ;
        return (this.S || this.y || this.w || (r7eVarZ = z()) == null || (r7eVarZ.b & 8) != 0) ? false : true;
    }

    public final void D(ArrayList arrayList) {
        e18 e18Var = this;
        ch2 ch2Var = e18Var.f;
        md4 md4Var = e18Var.M;
        ch2 ch2Var2 = md4Var.b;
        try {
            md4Var.b = ch2Var;
            ch2Var.f.a0(uic.d);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                cpc cpcVar = (cpc) arrayList.get(i);
                ksb ksbVar = (ksb) cpcVar.E;
                y08 y08VarM = yfd.m(ksbVar.a());
                sag sagVarD = uag.d(ksbVar.d());
                int iA = sagVarD.a(y08VarM);
                d79 d79Var = new d79();
                md4Var.b();
                hjc hjcVar = md4Var.b.f;
                hjcVar.a0(dic.d);
                zni.Y(hjcVar, 0, d79Var, 1, y08VarM);
                if (sagVarD == e18Var.H) {
                    if (!e18Var.I.w) {
                        pd4.a("Check failed");
                    }
                    e18Var.x();
                }
                rag ragVarG = sagVarD.g();
                try {
                    ragVarG.r(iA);
                    md4Var.f = iA;
                    ch2 ch2Var3 = new ch2();
                    e18Var.I(null, null, null, lm6.E, new yg4(e18Var, ch2Var3, ragVarG, ksbVar));
                    ch2 ch2Var4 = md4Var.b;
                    ch2Var4.getClass();
                    if (!ch2Var3.f.Z()) {
                        hjc hjcVar2 = ch2Var4.f;
                        hjcVar2.a0(zhc.d);
                        zni.Y(hjcVar2, 0, ch2Var3, 1, d79Var);
                    }
                    ragVarG.c();
                    md4Var.b.f.a0(wic.d);
                    i++;
                    e18Var = this;
                } catch (Throwable th) {
                    ragVarG.c();
                    throw th;
                }
            }
            md4Var.b();
            md4Var.b.f.a0(hic.d);
            md4Var.f = 0;
            md4Var.b = ch2Var2;
        } catch (Throwable th2) {
            md4Var.b = ch2Var2;
            throw th2;
        }
    }

    public final void E(hyc hycVar, Object obj) {
        X(126665345, null);
        F();
        l0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                vag.z(this.I);
            }
            boolean z = (this.S || x44.r(this.G.f(), hycVar)) ? false : true;
            if (z) {
                L(hycVar);
            }
            U(202, pd4.d, hycVar, 0);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            yfd.G(this, new ta4(-59194059, true, new mk4(20, obj)));
            this.w = z2;
        } finally {
        }
    }

    public final Object F() {
        boolean z = this.S;
        lz1 lz1Var = jd4.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof wre)) {
                return objM;
            }
        } else if (this.r) {
            pd4.a("A call to createNode(), emitNode() or useNode() expected");
            return lz1Var;
        }
        return lz1Var;
    }

    public final List G() {
        ge4 ge4Var = this.b;
        fe4 fe4VarH = ge4Var.h();
        le4 le4Var = fe4VarH != null ? (le4) fe4VarH : null;
        if (le4Var != null) {
            sag sagVar = le4Var.J;
            Integer numH = jpk.h(uag.d(sagVar), ge4Var);
            if (numH != null) {
                rag ragVarG = uag.d(sagVar).g();
                try {
                    ArrayList arrayListL = jpk.l(ragVarG, numH.intValue(), 0);
                    ragVarG.c();
                    return w44.a1(arrayListL, le4Var.Z.G());
                } catch (Throwable th) {
                    ragVarG.c();
                    throw th;
                }
            }
        }
        return lm6.E;
    }

    public final int H(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:3:0x0005, B:6:0x0015, B:8:0x0023, B:12:0x002c, B:11:0x0029, B:15:0x0033, B:18:0x003b, B:21:0x0043, B:23:0x004b, B:25:0x0051, B:26:0x0055, B:27:0x0056, B:29:0x005c, B:22:0x0047), top: B:36:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(defpackage.le4 r9, defpackage.le4 r10, java.lang.Integer r11, java.util.List r12, defpackage.zy7 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L27
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L27
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            r4 = r2
        L12:
            r5 = 0
            if (r4 >= r3) goto L2f
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L27
            cpc r6 = (defpackage.cpc) r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r6.E     // Catch: java.lang.Throwable -> L27
            r7e r7 = (defpackage.r7e) r7     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.F     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L29
            r8.g0(r7, r6)     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r9 = move-exception
            goto L65
        L29:
            r8.g0(r7, r5)     // Catch: java.lang.Throwable -> L27
        L2c:
            int r4 = r4 + 1
            goto L12
        L2f:
            if (r9 == 0) goto L5c
            if (r11 == 0) goto L38
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L27
            goto L39
        L38:
            r11 = -1
        L39:
            if (r10 == 0) goto L56
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L56
            if (r11 < 0) goto L56
            r9.V = r10     // Catch: java.lang.Throwable -> L27
            r9.W = r11     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L50
            r9.V = r5     // Catch: java.lang.Throwable -> L27
            r9.W = r2     // Catch: java.lang.Throwable -> L27
            goto L5a
        L50:
            r10 = move-exception
            r9.V = r5     // Catch: java.lang.Throwable -> L27
            r9.W = r2     // Catch: java.lang.Throwable -> L27
            throw r10     // Catch: java.lang.Throwable -> L27
        L56:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L27
        L5a:
            if (r10 != 0) goto L60
        L5c:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L27
        L60:
            r8.F = r0
            r8.k = r1
            return r10
        L65:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.I(le4, le4, java.lang.Integer, java.util.List, zy7):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
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
    public final void J() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.J():void");
    }

    public final void K() throws Throwable {
        int i;
        O(this.G.g);
        md4 md4Var = this.M;
        md4Var.d(false);
        h79 h79Var = md4Var.d;
        e18 e18Var = md4Var.a;
        rag ragVar = e18Var.G;
        if (ragVar.c > 0 && h79Var.c(-2) != (i = ragVar.i)) {
            if (!md4Var.c && md4Var.e) {
                md4Var.d(false);
                md4Var.b.f.a0(kic.d);
                md4Var.c = true;
            }
            if (i > 0) {
                y08 y08VarA = ragVar.a(i);
                h79Var.e(i);
                md4Var.d(false);
                hjc hjcVar = md4Var.b.f;
                hjcVar.a0(jic.d);
                zni.X(hjcVar, 0, y08VarA);
                md4Var.c = true;
            }
        }
        md4Var.b.f.a0(sic.d);
        int i2 = md4Var.f;
        rag ragVar2 = e18Var.G;
        md4Var.f = ragVar2.b[(ragVar2.g * 5) + 3] + i2;
    }

    public final void L(hyc hycVar) {
        xub xubVar = this.v;
        if (xubVar == null) {
            xubVar = new xub();
            this.v = xubVar;
        }
        xubVar.i(this.G.g, hycVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(int r7, int r8, int r9) {
        /*
            r6 = this;
            rag r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            md4 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.M(int, int, int):void");
    }

    public final Object N() {
        boolean z = this.S;
        lz1 lz1Var = jd4.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof wre)) {
                return objM instanceof i18 ? ((i18) objM).a : objM;
            }
        } else if (this.r) {
            pd4.a("A call to createNode(), emitNode() or useNode() expected");
            return lz1Var;
        }
        return lz1Var;
    }

    public final void O(int i) throws Throwable {
        boolean zL = this.G.l(i);
        md4 md4Var = this.M;
        if (zL) {
            md4Var.c();
            Object objN = this.G.n(i);
            md4Var.c();
            md4Var.h.add(objN);
        }
        P(this, i, zL, 0);
        md4Var.c();
        if (zL) {
            md4Var.a();
        }
    }

    public final boolean Q(int i, boolean z) {
        r7e r7eVarZ;
        if ((i & 1) == 0 && (this.S || this.y)) {
            k5g k5gVar = this.P;
            if (k5gVar != null && (r7eVarZ = z()) != null && k5gVar.b()) {
                int i2 = r7eVarZ.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                r7eVarZ.b = i3;
                r7eVarZ.b = (this.y ? i2 | 129 : i3 & (-129)) | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                hjc hjcVar = this.M.b.f;
                hjcVar.a0(ric.d);
                zni.X(hjcVar, 0, r7eVarZ);
                this.b.q(r7eVarZ);
                return false;
            }
        } else if (!z && C()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.R():void");
    }

    public final void S() {
        rag ragVar = this.G;
        int i = ragVar.i;
        this.l = i >= 0 ? ragVar.b[(i * 5) + 1] & 67108863 : 0;
        ragVar.t();
    }

    public final void T() {
        if (this.l != 0) {
            pd4.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        r7e r7eVarZ = z();
        if (r7eVarZ != null) {
            int i = r7eVarZ.b;
            if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
                r7eVarZ.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            S();
        } else {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(int r29, java.lang.Object r30, java.lang.Object r31, int r32) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.U(int, java.lang.Object, java.lang.Object, int):void");
    }

    public final void V() {
        U(-127, null, null, 0);
    }

    public final void W(int i, ugc ugcVar) {
        U(i, ugcVar, null, 0);
    }

    public final void X(int i, Object obj) {
        U(i, obj, null, 0);
    }

    public final void Y() {
        U(125, null, null, 1);
        this.r = true;
    }

    public final void Z(Object obj, boolean z) {
        if (z) {
            rag ragVar = this.G;
            if (ragVar.k <= 0) {
                if ((ragVar.b[(ragVar.g * 5) + 1] & 1073741824) == 0) {
                    zad.a("Expected a node group");
                }
                ragVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            md4 md4Var = this.M;
            md4Var.getClass();
            md4Var.d(false);
            hjc hjcVar = md4Var.b.f;
            hjcVar.a0(bjc.d);
            zni.X(hjcVar, 0, obj);
        }
        this.G.u();
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        tm7 tm7Var = this.O;
        tm7Var.p.X();
        tm7Var.o.X();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        rag ragVar = this.G;
        if (!ragVar.f) {
            ragVar.c();
        }
        if (this.I.w) {
            return;
        }
        x();
    }

    public final void a0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            U(i, null, null, 0);
            return;
        }
        if (this.r) {
            pd4.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        rag ragVar = this.G;
        boolean z = this.S;
        lz1 lz1Var = jd4.a;
        if (z) {
            ragVar.k++;
            this.I.Q(lz1Var, lz1Var, false, i);
            w(false, null);
            return;
        }
        if (ragVar.g() == i && ((i3 = ragVar.g) >= ragVar.h || (ragVar.b[(i3 * 5) + 1] & 536870912) == 0)) {
            ragVar.u();
            w(false, null);
            return;
        }
        if (ragVar.k <= 0 && (i2 = ragVar.g) != ragVar.h) {
            int i4 = this.k;
            K();
            this.M.e(i4, ragVar.s());
            sf5.f(i2, ragVar.g, this.s);
        }
        ragVar.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            vag vagVarH = this.H.h();
            this.I = vagVarH;
            vagVarH.M();
            this.J = false;
            this.K = null;
        }
        vag vagVar = this.I;
        vagVar.d();
        int i5 = vagVar.t;
        vagVar.Q(lz1Var, lz1Var, false, i);
        this.N = vagVar.b(i5);
        w(false, null);
    }

    public final void b(pz7 pz7Var, Object obj) {
        if (this.S) {
            hjc hjcVar = this.O.o;
            hjcVar.a0(cjc.d);
            zni.X(hjcVar, 0, obj);
            pz7Var.getClass();
            nai.n(2, pz7Var);
            zni.X(hjcVar, 1, pz7Var);
            return;
        }
        md4 md4Var = this.M;
        md4Var.b();
        hjc hjcVar2 = md4Var.b.f;
        hjcVar2.a0(cjc.d);
        pz7Var.getClass();
        nai.n(2, pz7Var);
        zni.Y(hjcVar2, 0, obj, 1, pz7Var);
    }

    public final void b0(int i) {
        U(i, null, null, 0);
    }

    public final boolean c(float f) {
        Object objF = F();
        if ((objF instanceof Float) && f == ((Number) objF).floatValue()) {
            return false;
        }
        l0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e18 c0(int r7) {
        /*
            r6 = this;
            r6.a0(r7)
            boolean r7 = r6.S
            n78 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            le4 r2 = r6.h
            if (r7 == 0) goto L26
            r7e r7 = new r7e
            r7.<init>(r2)
            r1.add(r7)
            r6.l0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.E()
            return r6
        L26:
            rag r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.sf5.E(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            tb9 r7 = (defpackage.tb9) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            rag r3 = r6.G
            java.lang.Object r3 = r3.m()
            lz1 r4 = defpackage.jd4.a
            boolean r4 = defpackage.x44.r(r3, r4)
            if (r4 == 0) goto L51
            r7e r3 = new r7e
            r3.<init>(r2)
            r6.l0(r3)
            goto L56
        L51:
            r3.getClass()
            r7e r3 = (defpackage.r7e) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.E()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            md4 r7 = r6.M
            ch2 r7 = r7.b
            hjc r7 = r7.f
            xic r0 = defpackage.xic.d
            r7.a0(r0)
            defpackage.zni.X(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lba
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.y = r4
            rag r0 = r6.G
            int r0 = r0.i
            r6.z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.c0(int):e18");
    }

    public final boolean d(int i) {
        Object objF = F();
        if ((objF instanceof Integer) && i == ((Number) objF).intValue()) {
            return false;
        }
        l0(Integer.valueOf(i));
        return true;
    }

    public final void d0(Object obj) {
        if (!this.S && this.G.g() == 207 && !x44.r(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        U(207, null, obj, 0);
    }

    public final boolean e(long j) {
        Object objF = F();
        if ((objF instanceof Long) && j == ((Number) objF).longValue()) {
            return false;
        }
        l0(Long.valueOf(j));
        return true;
    }

    public final void e0() {
        U(125, null, null, 2);
        this.r = true;
    }

    public final boolean f(Object obj) {
        if (x44.r(F(), obj)) {
            return false;
        }
        l0(obj);
        return true;
    }

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
    public final void f0() {
        this.m = 0;
        this.G = this.c.g();
        U(100, null, null, 0);
        ge4 ge4Var = this.b;
        ge4Var.t();
        hyc hycVarI = ge4Var.i();
        this.x.e(this.w ? 1 : 0);
        this.w = f(hycVarI);
        this.K = null;
        if (!this.q) {
            this.q = ge4Var.e();
        }
        if (!this.C) {
            this.C = ge4Var.f();
        }
        if (this.C) {
            umg umgVarA = ke4.a();
            umgVarA.getClass();
            hycVarI = hycVarI.i(umgVarA, new xmg(B()));
        }
        this.u = hycVarI;
        Set set = (Set) u00.I(hycVarI, r59.a);
        if (set != null) {
            set.add(y());
            ge4Var.o(set);
        }
        U(Long.hashCode(ge4Var.g()), null, null, 0);
    }

    public final boolean g(boolean z) {
        Object objF = F();
        if ((objF instanceof Boolean) && z == ((Boolean) objF).booleanValue()) {
            return false;
        }
        l0(Boolean.valueOf(z));
        return true;
    }

    public final boolean g0(r7e r7eVar, Object obj) {
        y08 y08Var = r7eVar.c;
        if (y08Var == null) {
            return false;
        }
        int iA = this.G.a.a(yfd.m(y08Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iE = sf5.E(iA, arrayList);
        if (iE < 0) {
            int i = -(iE + 1);
            if (!(obj instanceof wz5)) {
                obj = null;
            }
            arrayList.add(i, new tb9(r7eVar, iA, obj));
            return true;
        }
        tb9 tb9Var = (tb9) arrayList.get(iE);
        if (!(obj instanceof wz5)) {
            tb9Var.c = null;
            return true;
        }
        Object obj2 = tb9Var.c;
        if (obj2 == null) {
            tb9Var.c = obj;
            return true;
        }
        if (obj2 instanceof fwb) {
            ((fwb) obj2).a(obj);
            return true;
        }
        fwb fwbVar = v6f.a;
        fwb fwbVar2 = new fwb(2);
        fwbVar2.l(obj2);
        fwbVar2.l(obj);
        tb9Var.c = fwbVar2;
        return true;
    }

    public final boolean h(Object obj) {
        if (F() == obj) {
            return false;
        }
        l0(obj);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(defpackage.ewb r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r0 = r0.s
            int r2 = defpackage.x44.M(r0)
        La:
            r4 = -1
            if (r4 >= r2) goto L36
            java.lang.Object r4 = r0.get(r2)
            tb9 r4 = (defpackage.tb9) r4
            r7e r5 = r4.a
            y08 r5 = r5.c
            if (r5 == 0) goto L1e
            y08 r3 = defpackage.yfd.m(r5)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L30
            boolean r5 = r3.a()
            if (r5 == 0) goto L30
            int r5 = r4.b
            int r3 = r3.a
            if (r5 == r3) goto L33
            r4.b = r3
            goto L33
        L30:
            r0.remove(r2)
        L33:
            int r2 = r2 + (-1)
            goto La
        L36:
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r4 = r1.c
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L96
            r6 = 0
            r7 = r6
        L43:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L91
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L5d:
            if (r12 >= r10) goto L8f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r4[r13]
            r14.getClass()
            r7e r14 = (defpackage.r7e) r14
            y08 r15 = r14.c
            if (r15 == 0) goto L8b
            y08 r15 = defpackage.yfd.m(r15)
            int r15 = r15.a
            vz8 r3 = defpackage.vz8.K
            if (r13 != r3) goto L83
            r13 = 0
        L83:
            tb9 r3 = new tb9
            r3.<init>(r14, r15, r13)
            r0.add(r3)
        L8b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L5d
        L8f:
            if (r10 != r11) goto L96
        L91:
            if (r7 == r5) goto L96
            int r7 = r7 + 1
            goto L43
        L96:
            f50 r1 = defpackage.sf5.e
            defpackage.a54.s0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.h0(ewb):void");
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        md4 md4Var = this.M;
        md4Var.c = false;
        md4Var.d.b = 0;
        md4Var.f = 0;
        md4Var.e = true;
        md4Var.g = 0;
        md4Var.h.clear();
        md4Var.i = -1;
        md4Var.j = -1;
        md4Var.k = -1;
        md4Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(int i, int i2) {
        if (m0(i) != i2) {
            if (i < 0) {
                vub vubVar = this.p;
                if (vubVar == null) {
                    vubVar = new vub();
                    this.p = vubVar;
                }
                vubVar.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final Object j(fvd fvdVar) {
        return u00.I(l(), fvdVar);
    }

    public final void j0(int i, int i2) {
        int iM0 = m0(i);
        if (iM0 != i2) {
            int i3 = i2 - iM0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM02 = m0(i) + i3;
                i0(i, iM02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        h18 h18Var = (h18) arrayList.get(i4);
                        if (h18Var != null && h18Var.a(i, iM02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                rag ragVar = this.G;
                if (i < 0) {
                    i = ragVar.i;
                } else if (ragVar.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void k(zy7 zy7Var) {
        if (!this.r) {
            pd4.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            pd4.a("createNode() can only be called when inserting");
        }
        h79 h79Var = this.n;
        int i = h79Var.a[h79Var.b - 1];
        vag vagVar = this.I;
        y08 y08VarB = vagVar.b(vagVar.v);
        this.l++;
        tm7 tm7Var = this.O;
        hjc hjcVar = tm7Var.o;
        hjcVar.a0(lic.e);
        zni.X(hjcVar, 0, zy7Var);
        hjcVar.q[hjcVar.r - hjcVar.o[hjcVar.p - 1].b] = i;
        zni.X(hjcVar, 1, y08VarB);
        hjc hjcVar2 = tm7Var.p;
        hjcVar2.a0(lic.f);
        hjcVar2.q[hjcVar2.r - hjcVar2.o[hjcVar2.p - 1].b] = i;
        zni.X(hjcVar2, 0, y08VarB);
    }

    public final void k0(Object obj) {
        if (obj instanceof mee) {
            i18 i18Var = new i18((mee) obj, this.m - 1);
            if (this.S) {
                hjc hjcVar = this.M.b.f;
                hjcVar.a0(qic.d);
                zni.X(hjcVar, 0, i18Var);
            }
            this.d.add(obj);
            obj = i18Var;
        }
        l0(obj);
    }

    public final hyc l() {
        hyc hycVar;
        hyc hycVar2 = this.K;
        if (hycVar2 != null) {
            return hycVar2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        ugc ugcVar = pd4.d;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && x44.r(this.I.t(iE), ugcVar)) {
                    Object objQ = this.I.q(iE);
                    objQ.getClass();
                    hyc hycVar3 = (hyc) objQ;
                    this.K = hycVar3;
                    return hycVar3;
                }
                vag vagVar = this.I;
                iE = vagVar.E(iE, vagVar.b);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    rag ragVar = this.G;
                    if (x44.r(ragVar.p(iQ, ragVar.b), ugcVar)) {
                        xub xubVar = this.v;
                        if (xubVar == null || (hycVar = (hyc) xubVar.b(iQ)) == null) {
                            rag ragVar2 = this.G;
                            Object objB = ragVar2.b(iQ, ragVar2.b);
                            objB.getClass();
                            hycVar = (hyc) objB;
                        }
                        this.K = hycVar;
                        return hycVar;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        hyc hycVar4 = this.u;
        this.K = hycVar4;
        return hycVar4;
    }

    public final void l0(Object obj) {
        if (this.S) {
            vag vagVar = this.I;
            if (vagVar.n <= 0 || vagVar.i == vagVar.k) {
                vagVar.F(obj);
                return;
            }
            xub xubVar = vagVar.s;
            if (xubVar == null) {
                xubVar = new xub();
            }
            vagVar.s = xubVar;
            int i = vagVar.v;
            Object objB = xubVar.b(i);
            if (objB == null) {
                objB = new qvb();
                xubVar.i(i, objB);
            }
            ((qvb) objB).a(obj);
            return;
        }
        rag ragVar = this.G;
        boolean z = ragVar.n;
        md4 md4Var = this.M;
        if (!z) {
            y08 y08VarA = ragVar.a(ragVar.i);
            hjc hjcVar = md4Var.b.f;
            hjcVar.a0(yhc.d);
            zni.Y(hjcVar, 0, y08VarA, 1, obj);
            return;
        }
        int iB = (ragVar.l - uag.b(ragVar.i, ragVar.b)) - 1;
        if (md4Var.a.G.i - md4Var.f >= 0) {
            md4Var.d(true);
            hjc hjcVar2 = md4Var.b.f;
            hjcVar2.a0(lic.h);
            zni.X(hjcVar2, 0, obj);
            hjcVar2.q[hjcVar2.r - hjcVar2.o[hjcVar2.p - 1].b] = iB;
            return;
        }
        rag ragVar2 = this.G;
        y08 y08VarA2 = ragVar2.a(ragVar2.i);
        hjc hjcVar3 = md4Var.b.f;
        hjcVar3.a0(lic.g);
        zni.Y(hjcVar3, 0, obj, 1, y08VarA2);
        hjcVar3.q[hjcVar3.r - hjcVar3.o[hjcVar3.p - 1].b] = iB;
    }

    public final ad4 m() {
        if (!this.b.k()) {
            return null;
        }
        d8a d8aVarE = x44.E();
        d8aVarE.addAll(jpk.f(this.I));
        d8aVarE.addAll(jpk.d(this.G));
        d8aVarE.addAll(G());
        return new ad4(x44.v(d8aVarE), this.C);
    }

    public final int m0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        vub vubVar = this.p;
        if (vubVar == null || vubVar.c(i) < 0) {
            return 0;
        }
        int iC = vubVar.c(i);
        if (iC >= 0) {
            return vubVar.c[iC];
        }
        gtk.i("Cannot find value for key " + i);
        throw null;
    }

    public final void n(ewb ewbVar, pz7 pz7Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            pd4.a("Reentrant composition is not supported");
        }
        this.g.E();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(ycg.j().g());
            this.v = null;
            h0(ewbVar);
            this.k = 0;
            this.F = true;
            try {
                f0();
                Object objF = F();
                if (objF != pz7Var && pz7Var != null) {
                    l0(pz7Var);
                }
                d18 d18Var = this.D;
                wwb wwbVarV = mpk.v();
                try {
                    wwbVarV.b(d18Var);
                    ugc ugcVar = pd4.b;
                    if (pz7Var != null) {
                        W(200, ugcVar);
                        yfd.G(this, pz7Var);
                        p(false);
                    } else if (!this.w || objF == null || objF.equals(jd4.a)) {
                        R();
                    } else {
                        W(200, ugcVar);
                        nai.n(2, objF);
                        yfd.G(this, (pz7) objF);
                        p(false);
                    }
                    wwbVarV.m(wwbVarV.G - 1);
                    u();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        pd4.a("Check failed");
                    }
                    x();
                } catch (Throwable th) {
                    wwbVarV.m(wwbVarV.G - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void n0() {
        if (!this.r) {
            pd4.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            pd4.a("useNode() called while inserting");
        }
        rag ragVar = this.G;
        Object objN = ragVar.n(ragVar.i);
        md4 md4Var = this.M;
        md4Var.c();
        md4Var.h.add(objN);
        if (this.y && (objN instanceof tc4)) {
            md4Var.b();
            md4Var.b.f.a0(ejc.d);
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            md4 md4Var = this.M;
            md4Var.c();
            md4Var.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x050c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.p(boolean):void");
    }

    public final void q() {
        p(false);
        r7e r7eVarZ = z();
        if (r7eVarZ != null) {
            int i = r7eVarZ.b;
            if ((i & 1) != 0) {
                r7eVarZ.b = i | 2;
            }
        }
    }

    public final void r() {
        p(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[EDGE_INSN: B:61:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f], EDGE_INSN: B:62:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.r7e s() {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.s():r7e");
    }

    public final void t() {
        if (this.F || this.z != 0) {
            zad.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void u() {
        p(false);
        this.b.c();
        p(false);
        md4 md4Var = this.M;
        if (md4Var.c) {
            md4Var.d(false);
            md4Var.d(false);
            md4Var.b.f.a0(gic.d);
            md4Var.c = false;
        }
        md4Var.b();
        if (md4Var.d.b != 0) {
            pd4.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            pd4.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.d() != 0;
    }

    public final void v(int i) {
        if (i < 0) {
            int i2 = -i;
            vag vagVar = this.I;
            while (true) {
                int i3 = vagVar.v;
                if (i3 <= i2) {
                    return;
                } else {
                    p(vagVar.y(i3));
                }
            }
        } else {
            if (this.S) {
                vag vagVar2 = this.I;
                while (this.S) {
                    p(vagVar2.y(vagVar2.v));
                }
            }
            rag ragVar = this.G;
            while (true) {
                int i4 = ragVar.i;
                if (i4 <= i) {
                    return;
                } else {
                    p(ragVar.l(i4));
                }
            }
        }
    }

    public final void w(boolean z, h18 h18Var) {
        this.i.add(this.j);
        this.j = h18Var;
        int i = this.l;
        h79 h79Var = this.n;
        h79Var.e(i);
        h79Var.e(this.m);
        h79Var.e(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void x() {
        sag sagVar = new sag();
        if (this.C) {
            sagVar.e();
        }
        if (this.b.d()) {
            sagVar.O = new xub();
        }
        this.H = sagVar;
        vag vagVarH = sagVar.h();
        vagVarH.e(true);
        this.I = vagVarH;
    }

    public final ie4 y() {
        f18 f18Var = this.U;
        if (f18Var != null) {
            return f18Var;
        }
        f18 f18Var2 = new f18(this.h);
        this.U = f18Var2;
        return f18Var2;
    }

    public final r7e z() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (r7e) arrayList.get(arrayList.size() - 1);
    }
}
