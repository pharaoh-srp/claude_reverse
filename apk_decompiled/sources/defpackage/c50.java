package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class c50 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ e50 F;

    public /* synthetic */ c50(e50 e50Var, int i) {
        this.E = i;
        this.F = e50Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        e50 e50Var = this.F;
        lz1 lz1Var = jd4.a;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                iqb iqbVar = (iqb) obj;
                final eu9 eu9Var = (eu9) obj2;
                int iIntValue = ((Number) obj4).intValue();
                iqbVar.getClass();
                eu9Var.getClass();
                e18 e18Var = (e18) ((ld4) obj3);
                e18Var.a0(-1303529485);
                e18Var.a0(1524532429);
                if ((((iIntValue & 112) ^ 48) <= 32 || !e18Var.f(eu9Var)) && (iIntValue & 48) != 32) {
                    i2 = 0;
                }
                Object objN = e18Var.N();
                if (i2 != 0 || objN == lz1Var) {
                    objN = new pz7() { // from class: b50
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj5, Object obj6) {
                            int i4 = i3;
                            eu9 eu9Var2 = eu9Var;
                            float fFloatValue = ((Float) obj5).floatValue();
                            ya1 ya1Var = (ya1) obj6;
                            switch (i4) {
                                case 0:
                                    ya1Var.getClass();
                                    eu9Var2.getClass();
                                    du9 du9Var = eu9Var2.a;
                                    boolean z = du9Var.b;
                                    float f = du9Var.a;
                                    if (!z) {
                                        f *= fFloatValue;
                                    }
                                    du9 du9Var2 = eu9Var2.b;
                                    boolean z2 = du9Var2.b;
                                    float f2 = du9Var2.a;
                                    if (!z2) {
                                        f2 *= fFloatValue;
                                    }
                                    du9 du9Var3 = eu9Var2.c;
                                    boolean z3 = du9Var3.b;
                                    float f3 = du9Var3.a;
                                    if (!z3) {
                                        f3 *= fFloatValue;
                                    }
                                    du9 du9Var4 = eu9Var2.d;
                                    boolean z4 = du9Var4.b;
                                    float f4 = du9Var4.a;
                                    if (!z4) {
                                        f4 *= fFloatValue;
                                    }
                                    return xve.c(f, f2, f3, f4);
                                default:
                                    ya1Var.getClass();
                                    eu9Var2.getClass();
                                    du9 du9Var5 = eu9Var2.a;
                                    boolean z5 = du9Var5.b;
                                    float f5 = du9Var5.a;
                                    if (!z5) {
                                        f5 *= fFloatValue;
                                    }
                                    du9 du9Var6 = eu9Var2.b;
                                    boolean z6 = du9Var6.b;
                                    float f6 = du9Var6.a;
                                    if (!z6) {
                                        f6 *= fFloatValue;
                                    }
                                    du9 du9Var7 = eu9Var2.c;
                                    boolean z7 = du9Var7.b;
                                    float f7 = du9Var7.a;
                                    if (!z7) {
                                        f7 *= fFloatValue;
                                    }
                                    du9 du9Var8 = eu9Var2.d;
                                    boolean z8 = du9Var8.b;
                                    float f8 = du9Var8.a;
                                    if (!z8) {
                                        f8 *= fFloatValue;
                                    }
                                    return xve.c(f5, f6, f7, f8);
                            }
                        }
                    };
                    e18Var.k0(objN);
                }
                pz7 pz7Var = (pz7) objN;
                e18Var.p(false);
                e18Var.a0(738318140);
                wz5 wz5Var = e50Var.d;
                float fFloatValue = ((Number) wz5Var.getValue()).floatValue();
                wz5 wz5Var2 = e50Var.f;
                float fW = d4c.W(fFloatValue, 1.0f, ((Number) wz5Var2.getValue()).floatValue());
                e18Var.a0(-1308646823);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = mpk.P(new g79(0L));
                    e18Var.k0(objN2);
                }
                nwb nwbVar = (nwb) objN2;
                e18Var.p(false);
                float fW2 = d4c.W(d4c.W(0.95f, 0.9f, ((Number) wz5Var.getValue()).floatValue()), 1.0f, ((Number) wz5Var2.getValue()).floatValue());
                e18Var.a0(-1308639710);
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = new x40(i3, nwbVar);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                iqb iqbVarJ0 = xn5.j0(quj.i(iqbVar, (bz7) objN3), fW2, fW2, fW, d4c.W((-((int) (((g79) nwbVar.getValue()).a >> 32))) * 0.15f, MTTypesetterKt.kLineSkipLimitMultiplier, fW), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (e0g) pz7Var.invoke(Float.valueOf(d4c.W(((Number) wz5Var.getValue()).floatValue(), MTTypesetterKt.kLineSkipLimitMultiplier, ((Number) wz5Var2.getValue()).floatValue())), (ya1) e50Var.g.getValue()), true, 452592);
                e18Var.p(false);
                e18Var.p(false);
                return iqbVarJ0;
            default:
                iqb iqbVar2 = (iqb) obj;
                final eu9 eu9Var2 = (eu9) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                iqbVar2.getClass();
                eu9Var2.getClass();
                e18 e18Var2 = (e18) ((ld4) obj3);
                e18Var2.a0(196734637);
                e18Var2.a0(224505919);
                boolean z = (((iIntValue2 & 112) ^ 48) > 32 && e18Var2.f(eu9Var2)) || (iIntValue2 & 48) == 32;
                Object objN4 = e18Var2.N();
                if (z || objN4 == lz1Var) {
                    objN4 = new pz7() { // from class: b50
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj5, Object obj6) {
                            int i4 = i2;
                            eu9 eu9Var22 = eu9Var2;
                            float fFloatValue2 = ((Float) obj5).floatValue();
                            ya1 ya1Var = (ya1) obj6;
                            switch (i4) {
                                case 0:
                                    ya1Var.getClass();
                                    eu9Var22.getClass();
                                    du9 du9Var = eu9Var22.a;
                                    boolean z2 = du9Var.b;
                                    float f = du9Var.a;
                                    if (!z2) {
                                        f *= fFloatValue2;
                                    }
                                    du9 du9Var2 = eu9Var22.b;
                                    boolean z22 = du9Var2.b;
                                    float f2 = du9Var2.a;
                                    if (!z22) {
                                        f2 *= fFloatValue2;
                                    }
                                    du9 du9Var3 = eu9Var22.c;
                                    boolean z3 = du9Var3.b;
                                    float f3 = du9Var3.a;
                                    if (!z3) {
                                        f3 *= fFloatValue2;
                                    }
                                    du9 du9Var4 = eu9Var22.d;
                                    boolean z4 = du9Var4.b;
                                    float f4 = du9Var4.a;
                                    if (!z4) {
                                        f4 *= fFloatValue2;
                                    }
                                    return xve.c(f, f2, f3, f4);
                                default:
                                    ya1Var.getClass();
                                    eu9Var22.getClass();
                                    du9 du9Var5 = eu9Var22.a;
                                    boolean z5 = du9Var5.b;
                                    float f5 = du9Var5.a;
                                    if (!z5) {
                                        f5 *= fFloatValue2;
                                    }
                                    du9 du9Var6 = eu9Var22.b;
                                    boolean z6 = du9Var6.b;
                                    float f6 = du9Var6.a;
                                    if (!z6) {
                                        f6 *= fFloatValue2;
                                    }
                                    du9 du9Var7 = eu9Var22.c;
                                    boolean z7 = du9Var7.b;
                                    float f7 = du9Var7.a;
                                    if (!z7) {
                                        f7 *= fFloatValue2;
                                    }
                                    du9 du9Var8 = eu9Var22.d;
                                    boolean z8 = du9Var8.b;
                                    float f8 = du9Var8.a;
                                    if (!z8) {
                                        f8 *= fFloatValue2;
                                    }
                                    return xve.c(f5, f6, f7, f8);
                            }
                        }
                    };
                    e18Var2.k0(objN4);
                }
                pz7 pz7Var2 = (pz7) objN4;
                e18Var2.p(false);
                e18Var2.a0(1234344324);
                e18Var2.a0(-733879619);
                Object objN5 = e18Var2.N();
                if (objN5 == lz1Var) {
                    objN5 = mpk.P(new g79(0L));
                    e18Var2.k0(objN5);
                }
                nwb nwbVar2 = (nwb) objN5;
                e18Var2.p(false);
                float fB = 1.0f - (e50Var.b() * 0.1f);
                e18Var2.a0(-733875290);
                Object objN6 = e18Var2.N();
                if (objN6 == lz1Var) {
                    objN6 = new x40(i2, nwbVar2);
                    e18Var2.k0(objN6);
                }
                e18Var2.p(false);
                iqb iqbVarJ02 = xn5.j0(quj.i(iqbVar2, (bz7) objN6), fB, fB, 1.0f - e50Var.b(), e50Var.b() * ((int) (((g79) nwbVar2.getValue()).a >> 32)) * 0.5f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (e0g) pz7Var2.invoke(Float.valueOf(e50Var.b()), (ya1) e50Var.g.getValue()), true, 452592);
                e18Var2.p(false);
                e18Var2.p(false);
                return iqbVarJ02;
        }
    }
}
