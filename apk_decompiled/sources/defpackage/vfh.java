package defpackage;

import android.view.KeyEvent;
import android.view.autofill.AutofillValue;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class vfh extends qw5 implements vd6, t5d, ujf, r78, d8d, wo9, oe4, mqb, lbc, yt9, ys7 {
    public i5i U;
    public akh V;
    public sih W;
    public boolean X;
    public mp9 Y;
    public boolean Z;
    public zub a0;
    public jwb b0;
    public final pt7 c0;
    public final e0h d0;
    public hb6 e0;
    public final mb6 f0;
    public sbj g0;
    public fkg h0;
    public final i60 i0;
    public final rfh j0;
    public fkg k0;
    public final pfh l0;
    public final lsc m0;

    public vfh(i5i i5iVar, akh akhVar, sih sihVar, k6e k6eVar, boolean z, mp9 mp9Var, boolean z2, zub zubVar, jwb jwbVar) {
        this.U = i5iVar;
        this.V = akhVar;
        this.W = sihVar;
        this.X = z;
        this.Y = mp9Var;
        this.Z = z2;
        this.a0 = zubVar;
        this.b0 = jwbVar;
        int i = 2;
        sihVar.m = new pfh(this, i);
        this.c0 = new pt7(zubVar, new rfh(this, 0), i);
        a20 a20Var = new a20(i, this);
        t7d t7dVar = a0h.a;
        e0h e0hVar = new e0h(null, null, null, a20Var);
        p1(e0hVar);
        this.d0 = e0hVar;
        int i2 = 4;
        pfh pfhVar = new pfh(this, i2);
        a21 a21Var = new a21(24, this);
        int i3 = 1;
        rfh rfhVar = new rfh(this, i3);
        rfh rfhVar2 = new rfh(this, i);
        int i4 = 3;
        rfh rfhVar3 = new rfh(this, i4);
        rfh rfhVar4 = new rfh(this, i2);
        int i5 = 5;
        mb6 mb6Var = new mb6(new j40(new hfh(i3, pfhVar), i5, new bgh(rfhVar, a21Var, rfhVar2, rfhVar3, rfhVar4, new rfh(this, i5))), 1);
        p1(mb6Var);
        this.f0 = mb6Var;
        this.i0 = new i60();
        this.j0 = new rfh(this, 6);
        this.l0 = new pfh(this, i4);
        this.m0 = mpk.P(Boolean.FALSE);
    }

    @Override // defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        this.d0.C(t7dVar, u7dVar, j);
    }

    @Override // defpackage.lbc
    public final void F0() {
        d4c.a0(this, new pfh(this, 1));
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        cv9Var.a();
        if (((Boolean) this.m0.getValue()).booleanValue()) {
            jy1 eegVar = (jy1) yb5.o(this, l91.a);
            long j = ((d54) yb5.o(this, l91.b)).a;
            if (!d54.c(j, d4c.m(1308617531))) {
                eegVar = new eeg(j);
            }
            xd6.S0(cv9Var, eegVar, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 126);
        }
    }

    @Override // defpackage.ys7
    public final void K(us7 us7Var) {
        l9e l9eVarC;
        sih sihVar = this.W;
        akh akhVar = sihVar.b;
        yjh yjhVarC = akhVar.c();
        l9e l9eVarE = l9e.e;
        if (yjhVarC != null) {
            if (sihVar.d) {
                efh efhVarD = sihVar.a.d();
                if (kkh.d(efhVarD.H)) {
                    l9eVarC = sihVar.c(yjhVarC, efhVarD);
                } else {
                    long j = efhVarD.H;
                    if (!kkh.d(j)) {
                        int i = (int) (j >> 32);
                        qtb qtbVar = yjhVarC.b;
                        int iD = qtbVar.d(i);
                        int i2 = (int) (4294967295L & j);
                        int iD2 = qtbVar.d(i2);
                        if (iD == iD2) {
                            float fE = yjhVarC.e(i, true);
                            float fE2 = yjhVarC.e(i2, true);
                            l9eVarE = new l9e(Math.min(fE, fE2), qtbVar.f(iD), Math.max(fE, fE2), qtbVar.b(iD2));
                        } else {
                            l9eVarE = yjhVarC.j(kkh.g(j), kkh.f(j)).e();
                        }
                    }
                    l9eVarC = l9eVarE;
                }
                l9eVarE = aqk.j(akhVar, l9eVarC);
            } else {
                l9eVarE = lja.X;
            }
        }
        us7Var.e(l9eVarE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024c  */
    @Override // defpackage.wo9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(android.view.KeyEvent r24) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vfh.L(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.d8d
    public final void R() {
        this.d0.R();
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        efh efhVarD = this.U.a.d();
        long j = efhVarD.H;
        zb0 zb0Var = new zb0(this.U.a.d().G.toString());
        wn9[] wn9VarArr = ckf.a;
        dkf dkfVar = akf.F;
        wn9[] wn9VarArr2 = ckf.a;
        wn9 wn9Var = wn9VarArr2[18];
        ekfVar.a(dkfVar, zb0Var);
        zb0 zb0Var2 = new zb0(efhVarD.G.toString());
        dkf dkfVar2 = akf.G;
        wn9 wn9Var2 = wn9VarArr2[19];
        ekfVar.a(dkfVar2, zb0Var2);
        dkf dkfVar3 = akf.H;
        wn9 wn9Var3 = wn9VarArr2[20];
        ekfVar.a(dkfVar3, new kkh(j));
        kkh kkhVar = this.U.a.d().I;
        dkf dkfVar4 = akf.I;
        wn9 wn9Var4 = wn9VarArr2[21];
        ekfVar.a(dkfVar4, kkhVar);
        x49 x49Var = new x49(((Boolean) this.U.a.e.getValue()).booleanValue());
        dkf dkfVar5 = akf.M;
        wn9 wn9Var5 = wn9VarArr2[27];
        ekfVar.a(dkfVar5, x49Var);
        if (!this.X) {
            ckf.b(ekfVar);
        }
        final boolean z = this.X;
        dkf dkfVar6 = akf.Q;
        wn9 wn9Var6 = wn9VarArr2[28];
        ekfVar.a(dkfVar6, Boolean.valueOf(z));
        ckf.k(ekfVar, lz1.H);
        ckf.o(ekfVar, new g20(AutofillValue.forText(efhVarD)));
        final int i = 0;
        ckf.h(ekfVar, new bz7() { // from class: ofh
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i2 = i;
                boolean z2 = true;
                vfh vfhVar = this;
                boolean z3 = z;
                switch (i2) {
                    case 0:
                        g20 g20Var = (g20) obj;
                        if (z3) {
                            AutofillValue autofillValue = g20Var.a;
                            tp4 tp4Var = null;
                            CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                            if (textValue != null) {
                                vfhVar.U.g(textValue);
                            }
                            vfhVar.m0.setValue(Boolean.TRUE);
                            gb9.D(vfhVar.d1(), null, null, new tfh(vfhVar, tp4Var, 3), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        zb0 zb0Var3 = (zb0) obj;
                        if (z3) {
                            vfhVar.U.g(zb0Var3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        zb0 zb0Var4 = (zb0) obj;
                        if (z3) {
                            i5i.h(vfhVar.U, zb0Var4, false, 12);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        });
        int i2 = this.Y.c;
        int i3 = 8;
        int i4 = 6;
        int i5 = 7;
        if (i2 == 6) {
            ro4.a.getClass();
            ckf.m(ekfVar, qo4.c);
        } else if (i2 == 7 || i2 == 8) {
            ro4.a.getClass();
            ckf.m(ekfVar, qo4.b);
        } else if (i2 == 4) {
            ro4.a.getClass();
            ckf.m(ekfVar, qo4.d);
        }
        ckf.d(ekfVar, new rfh(this, i5));
        if (z) {
            final int i6 = 1;
            ekfVar.a(ojf.k, new e5(null, new bz7() { // from class: ofh
                @Override // defpackage.bz7
                public final Object invoke(Object obj) {
                    int i22 = i6;
                    boolean z2 = true;
                    vfh vfhVar = this;
                    boolean z3 = z;
                    switch (i22) {
                        case 0:
                            g20 g20Var = (g20) obj;
                            if (z3) {
                                AutofillValue autofillValue = g20Var.a;
                                tp4 tp4Var = null;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                if (textValue != null) {
                                    vfhVar.U.g(textValue);
                                }
                                vfhVar.m0.setValue(Boolean.TRUE);
                                gb9.D(vfhVar.d1(), null, null, new tfh(vfhVar, tp4Var, 3), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            zb0 zb0Var3 = (zb0) obj;
                            if (z3) {
                                vfhVar.U.g(zb0Var3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            zb0 zb0Var4 = (zb0) obj;
                            if (z3) {
                                i5i.h(vfhVar.U, zb0Var4, false, 12);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
            final int i7 = 2;
            ekfVar.a(ojf.o, new e5(null, new bz7() { // from class: ofh
                @Override // defpackage.bz7
                public final Object invoke(Object obj) {
                    int i22 = i7;
                    boolean z2 = true;
                    vfh vfhVar = this;
                    boolean z3 = z;
                    switch (i22) {
                        case 0:
                            g20 g20Var = (g20) obj;
                            if (z3) {
                                AutofillValue autofillValue = g20Var.a;
                                tp4 tp4Var = null;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                if (textValue != null) {
                                    vfhVar.U.g(textValue);
                                }
                                vfhVar.m0.setValue(Boolean.TRUE);
                                gb9.D(vfhVar.d1(), null, null, new tfh(vfhVar, tp4Var, 3), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            zb0 zb0Var3 = (zb0) obj;
                            if (z3) {
                                vfhVar.U.g(zb0Var3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            zb0 zb0Var4 = (zb0) obj;
                            if (z3) {
                                i5i.h(vfhVar.U, zb0Var4, false, 12);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
        }
        int i8 = 5;
        ekfVar.a(ojf.j, new e5(null, new cb0(i8, this)));
        final int iB = this.Y.b();
        ckf.i(ekfVar, iB, new zy7() { // from class: sfh
            @Override // defpackage.zy7
            public final Object a() {
                this.E.s1(iB);
                return Boolean.TRUE;
            }
        });
        ckf.g(ekfVar, null, new pfh(this, i4));
        ckf.j(ekfVar, null, new pfh(this, i5));
        if (!kkh.d(j)) {
            ekfVar.a(ojf.q, new e5(null, new pfh(this, i3)));
            if (this.X) {
                ekfVar.a(ojf.r, new e5(null, new pfh(this, i)));
            }
        }
        if (z) {
            ekfVar.a(ojf.s, new e5(null, new pfh(this, i8)));
        }
        if (this.X) {
            this.c0.X0(ekfVar);
        }
    }

    @Override // defpackage.ujf
    public final boolean Z0() {
        return true;
    }

    @Override // defpackage.yt9, defpackage.s5b
    public final void c(long j) {
        this.f0.V = j;
    }

    @Override // defpackage.hqb
    public final void h1() {
        d4c.a0(this, new pfh(this, 1));
        this.W.n = this.l0;
        if (this.X) {
            p1(this.c0);
        }
    }

    @Override // defpackage.hqb
    public final void i1() {
        t1();
        this.W.n = null;
    }

    @Override // defpackage.wo9
    public final boolean l(KeyEvent keyEvent) {
        i5i i5iVar = this.U;
        sih sihVar = this.W;
        w1();
        this.i0.getClass();
        if (kkh.d(i5iVar.d().H) || !pqi.j(keyEvent)) {
            return false;
        }
        i5i i5iVar2 = sihVar.a;
        if (!kkh.d(i5iVar2.d().H)) {
            yih yihVar = i5iVar2.a;
            k6e k6eVar = i5iVar2.b;
            yihVar.b.a().D();
            dfh dfhVar = yihVar.b;
            int i = (int) (dfhVar.H & 4294967295L);
            bok.k(dfhVar, i, i);
            yih.a(yihVar, k6eVar, true, cgh.E);
            yihVar.f(true);
        }
        sihVar.D(false);
        sihVar.E(ykh.E);
        return true;
    }

    @Override // defpackage.yt9
    public final void n(cu9 cu9Var) {
        this.f0.getClass();
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        this.V.e.setValue(m5cVar);
        if (this.X) {
            this.c0.o0(m5cVar);
        }
    }

    public final boolean s1(int i) {
        if (i == 6) {
            ((ps7) yb5.o(this, ve4.i)).a(1);
            return true;
        }
        if (i == 5) {
            ((ps7) yb5.o(this, ve4.i)).a(2);
            return true;
        }
        if (i != 7) {
            return false;
        }
        ((fx5) w1()).a();
        return true;
    }

    public final void t1() {
        fkg fkgVar = this.k0;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.k0 = null;
        jwb jwbVar = this.b0;
        if (jwbVar != null) {
            jwbVar.e();
        }
    }

    public final void u1() {
        hb6 hb6Var = this.e0;
        if (hb6Var != null) {
            this.a0.c(new ib6(hb6Var));
            this.e0 = null;
        }
    }

    public final boolean v1() {
        sbj sbjVar;
        return this.c0.Z.u1().b() && (sbjVar = this.g0) != null && ((y1a) sbjVar).b();
    }

    public final beg w1() {
        beg begVar = (beg) yb5.o(this, ve4.r);
        if (begVar != null) {
            return begVar;
        }
        sz6.j("No software keyboard controller");
        return null;
    }

    public final void x1(boolean z) {
        if (!z) {
            Boolean bool = this.Y.e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        this.k0 = gb9.D(d1(), null, null, new rrb(this, e6e.a(this), null, 14), 3);
    }
}
