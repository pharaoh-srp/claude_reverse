package defpackage;

import android.os.Handler;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nv9 implements tc4 {
    public final av9 E;
    public ge4 F;
    public ivg G;
    public int H;
    public int I;
    public final ewb J;
    public final ewb K;
    public final iv9 L;
    public final fv9 M;
    public final ewb N;
    public final hvg O;
    public final ewb P;
    public final wwb Q;
    public int R;
    public int S;
    public final String T;

    public nv9(av9 av9Var, ivg ivgVar) {
        this.E = av9Var;
        this.G = ivgVar;
        long[] jArr = u6f.a;
        this.J = new ewb();
        this.K = new ewb();
        this.L = new iv9(this);
        this.M = new fv9(this);
        this.N = new ewb();
        this.O = new hvg();
        this.P = new ewb();
        this.Q = new wwb(0, new Object[16]);
        this.T = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void a(nv9 nv9Var, Object obj) {
        av9 av9Var = nv9Var.E;
        nv9Var.h();
        av9 av9Var2 = (av9) nv9Var.N.k(obj);
        if (av9Var2 != null) {
            if (nv9Var.S <= 0) {
                b39.c("No pre-composed items to dispose");
            }
            int iK = ((vwb) av9Var.r()).E.k(av9Var2);
            if (iK < ((vwb) av9Var.r()).E.G - nv9Var.S) {
                b39.c("Item is not in pre-composed item range");
            }
            nv9Var.R++;
            nv9Var.S--;
            gv9 gv9Var = (gv9) nv9Var.J.g(av9Var2);
            if (gv9Var != null) {
                e(gv9Var);
            }
            int i = (((vwb) av9Var.r()).E.G - nv9Var.S) - nv9Var.R;
            nv9Var.k(iK, i);
            nv9Var.g(i);
        }
        if (nv9Var.Q.i(obj)) {
            av9.v0(av9Var, true, 6);
        }
    }

    public static void e(gv9 gv9Var) {
        rvc rvcVar = gv9Var.f;
        if (rvcVar != null) {
            rvcVar.c();
            gv9Var.f = null;
            le4 le4Var = gv9Var.c;
            if (le4Var != null) {
                le4Var.a();
            }
            gv9Var.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // defpackage.tc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            av9 r2 = r0.E
            r2.V = r1
            ewb r1 = r0.J
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            gv9 r13 = (defpackage.gv9) r13
            le4 r13 = r13.c
            if (r13 == 0) goto L47
            r13.a()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.p0()
            r2.V = r6
            r1.a()
            ewb r1 = r0.K
            r1.a()
            r0.S = r6
            r0.R = r6
            ewb r1 = r0.N
            r1.a()
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv9.b():void");
    }

    @Override // defpackage.tc4
    public final void c() {
        j(true);
    }

    public final void d(gv9 gv9Var, boolean z) {
        rvc rvcVar = gv9Var.f;
        if (rvcVar != null) {
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            try {
                av9 av9Var = this.E;
                av9Var.V = true;
                if (z) {
                    while (!rvcVar.f()) {
                        try {
                            rvcVar.j(new rl7(17));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                rvcVar.a();
                gv9Var.f = null;
                av9Var.V = false;
            } finally {
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            }
        }
    }

    public final dvg f(Object obj) {
        return !this.E.X() ? new lv9() : new mv9(this, obj);
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.R = 0;
        List listR = this.E.r();
        vwb vwbVar = (vwb) listR;
        int i2 = (vwbVar.E.G - this.S) - 1;
        if (i <= i2) {
            this.O.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.J.g((av9) vwbVar.get(i3));
                    objG.getClass();
                    this.O.E.a(((gv9) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.G.d(this.O);
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            z = false;
            while (i2 >= i) {
                try {
                    av9 av9Var = (av9) ((vwb) listR).get(i2);
                    Object objG2 = this.J.g(av9Var);
                    objG2.getClass();
                    gv9 gv9Var = (gv9) objG2;
                    Object obj = gv9Var.a;
                    if (this.O.E.c(obj)) {
                        this.R++;
                        if (((Boolean) gv9Var.g.getValue()).booleanValue()) {
                            n5b n5bVarA = av9Var.A();
                            xu9 xu9Var = xu9.G;
                            n5bVarA.P = xu9Var;
                            lma lmaVarZ = av9Var.z();
                            if (lmaVarZ != null) {
                                lmaVarZ.N = xu9Var;
                            }
                            m(gv9Var, false);
                            if (gv9Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        av9 av9Var2 = this.E;
                        av9Var2.V = true;
                        this.J.k(av9Var);
                        le4 le4Var = gv9Var.c;
                        if (le4Var != null) {
                            le4Var.a();
                        }
                        this.E.q0(i2, 1);
                        av9Var2.V = false;
                    }
                    this.K.k(obj);
                    i2--;
                } catch (Throwable th) {
                    fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                    throw th;
                }
            }
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (ycg.c) {
                fwb fwbVar = ycg.j.h;
                if (fwbVar != null) {
                    if (fwbVar.i()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                ycg.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((vwb) this.E.r()).E.G;
        ewb ewbVar = this.J;
        if (ewbVar.e != i) {
            b39.a("Inconsistency between the count of nodes tracked by the state (" + ewbVar.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.R) - this.S < 0) {
            StringBuilder sbU = vb7.u("Incorrect state. Total children ", i, ". Reusable children ");
            sbU.append(this.R);
            sbU.append(". Precomposed children ");
            sbU.append(this.S);
            b39.a(sbU.toString());
        }
        ewb ewbVar2 = this.N;
        if (ewbVar2.e == this.S) {
            return;
        }
        b39.a("Incorrect state. Precomposed children " + this.S + ". Map size " + ewbVar2.e);
    }

    @Override // defpackage.tc4
    public final void i() {
        j(false);
    }

    public final void j(boolean z) {
        this.S = 0;
        this.N.a();
        List listR = this.E.r();
        int i = ((vwb) listR).E.G;
        if (this.R != i) {
            this.R = i;
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    av9 av9Var = (av9) ((vwb) listR).get(i2);
                    gv9 gv9Var = (gv9) this.J.g(av9Var);
                    if (gv9Var != null && ((Boolean) gv9Var.g.getValue()).booleanValue()) {
                        n5b n5bVarA = av9Var.A();
                        xu9 xu9Var = xu9.G;
                        n5bVarA.P = xu9Var;
                        lma lmaVarZ = av9Var.z();
                        if (lmaVarZ != null) {
                            lmaVarZ.N = xu9Var;
                        }
                        m(gv9Var, z);
                        gv9Var.a = bvg.a;
                    }
                } catch (Throwable th) {
                    fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                    throw th;
                }
            }
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            this.K.a();
        }
        h();
    }

    public final void k(int i, int i2) {
        av9 av9Var = this.E;
        av9Var.V = true;
        av9Var.i0(i, i2, 1);
        av9Var.V = false;
    }

    public final void l(Object obj, pz7 pz7Var, boolean z) {
        av9 av9Var = this.E;
        if (av9Var.X()) {
            h();
            if (this.K.c(obj)) {
                return;
            }
            this.P.k(obj);
            ewb ewbVar = this.N;
            Object objG = ewbVar.g(obj);
            if (objG == null) {
                objG = o(obj);
                if (objG != null) {
                    k(((vwb) av9Var.r()).E.k(objG), ((vwb) av9Var.r()).E.G);
                    this.S++;
                } else {
                    int i = ((vwb) av9Var.r()).E.G;
                    av9 av9Var2 = new av9(2);
                    av9Var.V = true;
                    av9Var.O(i, av9Var2);
                    av9Var.V = false;
                    this.S++;
                    objG = av9Var2;
                }
                ewbVar.m(obj, objG);
            }
            n((av9) objG, obj, z, pz7Var);
        }
    }

    public final void m(gv9 gv9Var, boolean z) {
        le4 le4Var;
        if (z || !gv9Var.h) {
            gv9Var.g = mpk.P(Boolean.FALSE);
        } else {
            gv9Var.g.setValue(Boolean.FALSE);
        }
        if (gv9Var.f != null) {
            e(gv9Var);
            return;
        }
        if (z) {
            le4 le4Var2 = gv9Var.c;
            if (le4Var2 != null) {
                le4Var2.m();
                return;
            }
            return;
        }
        wkc outOfFrameExecutor = dv9.a(this.E).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (gv9Var.h || (le4Var = gv9Var.c) == null) {
                return;
            }
            le4Var.m();
            return;
        }
        v01 v01Var = new v01(25, gv9Var);
        AndroidComposeView androidComposeView = (AndroidComposeView) outOfFrameExecutor;
        qo0 qo0Var = androidComposeView.M;
        boolean zIsEmpty = qo0Var.isEmpty();
        qo0Var.addLast(v01Var);
        if (zIsEmpty) {
            Handler handler = androidComposeView.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(androidComposeView.N);
            } else {
                sz6.p("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:58:0x00ab, B:60:0x00bb, B:63:0x00d0, B:65:0x00d4, B:71:0x0108, B:66:0x00e1, B:67:0x00ec, B:69:0x00f0, B:70:0x0105, B:61:0x00be, B:56:0x0092, B:57:0x009e, B:74:0x0112, B:75:0x011c), top: B:78:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:58:0x00ab, B:60:0x00bb, B:63:0x00d0, B:65:0x00d4, B:71:0x0108, B:66:0x00e1, B:67:0x00ec, B:69:0x00f0, B:70:0x0105, B:61:0x00be, B:56:0x0092, B:57:0x009e, B:74:0x0112, B:75:0x011c), top: B:78:0x0076 }] */
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
    public final void n(defpackage.av9 r10, java.lang.Object r11, boolean r12, defpackage.pz7 r13) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv9.n(av9, java.lang.Object, boolean, pz7):void");
    }

    public final av9 o(Object obj) {
        ewb ewbVar;
        int i;
        if (this.R == 0) {
            return null;
        }
        vwb vwbVar = (vwb) this.E.r();
        int i2 = vwbVar.E.G - this.S;
        int i3 = i2 - this.R;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            ewbVar = this.J;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = ewbVar.g((av9) vwbVar.get(i5));
            objG.getClass();
            if (x44.r(((gv9) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objG2 = ewbVar.g((av9) vwbVar.get(i4));
                objG2.getClass();
                gv9 gv9Var = (gv9) objG2;
                Object obj2 = gv9Var.a;
                if (obj2 == bvg.a || this.G.e(obj, obj2)) {
                    gv9Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            k(i5, i3);
        }
        this.R--;
        av9 av9Var = (av9) vwbVar.get(i3);
        Object objG3 = ewbVar.g(av9Var);
        objG3.getClass();
        gv9 gv9Var2 = (gv9) objG3;
        gv9Var2.g = mpk.P(Boolean.TRUE);
        gv9Var2.e = true;
        gv9Var2.d = true;
        return av9Var;
    }
}
