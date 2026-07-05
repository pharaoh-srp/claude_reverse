package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class kfh extends qw5 implements pu9, vd6, oe4, r78, ujf {
    public boolean U;
    public boolean V;
    public akh W;
    public i5i X;
    public sih Y;
    public jy1 Z;
    public boolean a0;
    public j9f b0;
    public ukc c0;
    public o1i d0;
    public p5d e0;
    public pd5 f0;
    public fkg g0;
    public kkh h0;
    public l9e i0 = new l9e(-1.0f, -1.0f, -1.0f, -1.0f);
    public int j0;
    public int k0;
    public final fhh l0;
    public final peh m0;

    public kfh(boolean z, boolean z2, akh akhVar, i5i i5iVar, sih sihVar, jy1 jy1Var, boolean z3, j9f j9fVar, ukc ukcVar, o1i o1iVar, p5d p5dVar) {
        this.U = z;
        this.V = z2;
        this.W = akhVar;
        this.X = i5iVar;
        this.Y = sihVar;
        this.Z = jy1Var;
        this.a0 = z3;
        this.b0 = j9fVar;
        this.c0 = ukcVar;
        this.d0 = o1iVar;
        this.e0 = p5dVar;
        int i = 0;
        fhh hhhVar = ipa.a() ? new hhh(i5iVar, sihVar, akhVar, z || z2) : new j60();
        p1(hhhVar);
        this.l0 = hhhVar;
        peh pehVar = new peh(this.d0, new w73(this, null, 3), new ya0(this, null, 1), new hfh(i, this));
        p1(pehVar);
        this.m0 = pehVar;
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) throws Throwable {
        int iG;
        int iF;
        cv9 cv9Var2 = cv9Var;
        ib2 ib2Var = cv9Var2.E;
        cv9Var2.a();
        efh efhVarD = this.X.d();
        yjh yjhVarC = this.W.c();
        if (yjhVarC == null) {
            return;
        }
        cpc cpcVar = efhVarD.J;
        cpc cpcVar2 = efhVarD.J;
        long j = efhVarD.H;
        if (cpcVar != null) {
            int iB = ((gjh) cpcVar.E).b();
            long j2 = ((kkh) cpcVar.F).a;
            if (!kkh.d(j2)) {
                c40 c40VarJ = yjhVarC.j(kkh.g(j2), kkh.f(j2));
                tkh tkhVar = yjhVarC.a.b;
                if (gjh.a(iB)) {
                    jy1 jy1VarC = tkhVar.c();
                    if (jy1VarC != null) {
                        xd6.Y0(cv9Var2, c40VarJ, jy1VarC, 0.2f, null, null, 0, 56);
                        cv9Var2 = cv9Var;
                    } else {
                        long jD = tkhVar.d();
                        if (jD == 16) {
                            jD = d54.b;
                        }
                        cv9Var2 = cv9Var;
                        xd6.c1(cv9Var2, c40VarJ, d54.b(d54.d(jD) * 0.2f, jD), MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
                    }
                } else {
                    cv9Var2 = cv9Var;
                    xd6.c1(cv9Var2, c40VarJ, ((nkh) yb5.o(this, okh.a)).b, MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
                }
            }
        }
        if (kkh.d(j)) {
            x44.c0(ib2Var.F.p(), yjhVarC);
            if (cpcVar2 == null) {
                jy1 jy1Var = this.Z;
                boolean zS1 = s1();
                pd5 pd5Var = this.f0;
                sih sihVar = this.Y;
                float fH = pd5Var != null ? pd5Var.c.h() : 0.0f;
                if (fH != MTTypesetterKt.kLineSkipLimitMultiplier && zS1) {
                    l9e l9eVarP = sihVar.p();
                    float f = l9eVarP.c;
                    float f2 = l9eVarP.a;
                    float f3 = f - f2;
                    cv9Var2.E.c(jy1Var, (((long) Float.floatToRawIntBits((f3 / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(l9eVarP.b)) & 4294967295L), l9eVarP.c(), f3, fH);
                }
            }
        } else {
            if (cpcVar2 == null && (iG = kkh.g(j)) != (iF = kkh.f(j))) {
                xd6.c1(cv9Var2, yjhVarC.j(iG, iF), ((nkh) yb5.o(this, okh.a)).b, MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
            }
            x44.c0(ib2Var.F.p(), yjhVarC);
        }
        this.l0.I0(cv9Var2);
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        this.l0.X0(ekfVar);
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        ukc ukcVar = this.c0;
        ukc ukcVar2 = ukc.E;
        nm6 nm6Var = nm6.E;
        if (ukcVar == ukcVar2) {
            c3d c3dVarU = h5bVar.u(rl4.a(0, 0, 0, Integer.MAX_VALUE, 7, j));
            int iMin = Math.min(c3dVarU.F, rl4.g(j));
            return q5bVar.U(c3dVarU.E, iMin, nm6Var, new uz5(this, iMin, c3dVarU, q5bVar));
        }
        c3d c3dVarU2 = h5bVar.u(rl4.a(0, Integer.MAX_VALUE, 0, 0, 13, j));
        int iMin2 = Math.min(c3dVarU2.E, rl4.h(j));
        return q5bVar.U(iMin2, c3dVarU2.F, nm6Var, new eb3(this, iMin2, c3dVarU2, q5bVar, 4));
    }

    @Override // defpackage.hqb
    public final void h1() {
        if (this.U && s1()) {
            t1();
        }
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        this.W.d.setValue(m5cVar);
        this.l0.o0(m5cVar);
    }

    public final boolean s1() {
        if (!this.a0) {
            return false;
        }
        if (!this.U && !this.V) {
            return false;
        }
        jy1 jy1Var = this.Z;
        return ((jy1Var instanceof eeg) && ((eeg) jy1Var).a == 16) ? false : true;
    }

    public final void t1() {
        if (this.f0 == null) {
            this.f0 = new pd5(((Boolean) yb5.o(this, ve4.y)).booleanValue());
            wd6.t0(this);
        }
        this.g0 = gb9.D(d1(), null, null, new fj(this, null, 23), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(defpackage.b3d r17, int r18, int r19, long r20, defpackage.fu9 r22) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfh.u1(b3d, int, int, long, fu9):void");
    }
}
