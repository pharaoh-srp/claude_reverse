package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf7 implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;

    public /* synthetic */ bf7(long j, va6 va6Var, boolean z) {
        this.G = j;
        this.F = z;
        this.H = va6Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iqb iqbVarT;
        int i = this.E;
        Object obj4 = this.H;
        final long j = this.G;
        final boolean z = this.F;
        switch (i) {
            case 0:
                final va6 va6Var = (va6) obj4;
                iqb iqbVar = (iqb) obj;
                ((Integer) obj3).getClass();
                iqbVar.getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(-732851263);
                if (((Boolean) e18Var.j(olh.b)).booleanValue()) {
                    iqbVarT = yfd.p(iqbVar, j, zni.b);
                } else {
                    boolean zG = e18Var.g(z) | e18Var.e(j) | e18Var.f(va6Var);
                    Object objN = e18Var.N();
                    if (zG || objN == jd4.a) {
                        objN = new bz7() { // from class: cf7
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj5) {
                                List listI1;
                                b52 b52Var = (b52) obj5;
                                b52Var.getClass();
                                float fIntBitsToFloat = MTTypesetterKt.kLineSkipLimitMultiplier;
                                Float fValueOf = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
                                Float fValueOf2 = Float.valueOf(1.0f);
                                List listX = x44.X(new cpc(fValueOf, fValueOf2), new cpc(Float.valueOf(0.55f), Float.valueOf(0.83f)), new cpc(Float.valueOf(0.8f), Float.valueOf(0.49f)), new cpc(fValueOf2, fValueOf));
                                boolean z2 = z;
                                long j2 = j;
                                if (z2) {
                                    List<cpc> list = listX;
                                    ArrayList arrayList = new ArrayList(x44.y(list, 10));
                                    for (cpc cpcVar : list) {
                                        arrayList.add(new cpc(Float.valueOf(1.0f - ((Number) cpcVar.E).floatValue()), new d54(d54.b(((Number) cpcVar.F).floatValue(), j2))));
                                    }
                                    listI1 = w44.i1(arrayList, new g67(2));
                                } else {
                                    List<cpc> list2 = listX;
                                    ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
                                    for (cpc cpcVar2 : list2) {
                                        arrayList2.add(new cpc(Float.valueOf(((Number) cpcVar2.E).floatValue()), new d54(d54.b(((Number) cpcVar2.F).floatValue(), j2))));
                                    }
                                    listI1 = arrayList2;
                                }
                                va6 va6Var2 = va6Var;
                                float density = va6Var2 != null ? b52Var.getDensity() * va6Var2.E : 0.2876f * Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L));
                                cpc[] cpcVarArr = (cpc[]) listI1.toArray(new cpc[0]);
                                cpc[] cpcVarArr2 = (cpc[]) Arrays.copyOf(cpcVarArr, cpcVarArr.length);
                                if (!z2) {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L)) - density;
                                }
                                if (!z2) {
                                    density = Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L));
                                }
                                return b52Var.a(new df7(lz1.J(cpcVarArr2, fIntBitsToFloat, density, 8), 0));
                            }
                        };
                        e18Var.k0(objN);
                    }
                    iqbVarT = zni.t(iqbVar, (bz7) objN);
                }
                e18Var.p(false);
                return iqbVarT;
            default:
                final mxd mxdVar = (mxd) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                e18 e18Var2 = (e18) ld4Var;
                if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    knk.e(Boolean.valueOf(z), null, u00.P(asb.G, e18Var2), null, fd9.q0(-2064098104, new rz7() { // from class: wwd
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            ld4 ld4Var2 = (ld4) obj6;
                            int iIntValue2 = ((Integer) obj7).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= ((e18) ld4Var2).g(zBooleanValue) ? 4 : 2;
                            }
                            e18 e18Var3 = (e18) ld4Var2;
                            if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                long j2 = j;
                                if (zBooleanValue) {
                                    e18Var3.a0(-499763759);
                                    int i2 = fxd.a;
                                    tjd.a(b.o(fqb.E, 16.0f), j2, 2.5f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 390, 56);
                                    e18Var3.p(false);
                                } else {
                                    e18Var3.a0(-499540745);
                                    mxd mxdVar2 = mxdVar;
                                    boolean zF = e18Var3.f(mxdVar2);
                                    Object objN2 = e18Var3.N();
                                    if (zF || objN2 == jd4.a) {
                                        objN2 = new vyb(1, mxdVar2);
                                        e18Var3.k0(objN2);
                                    }
                                    fxd.a((to7) objN2, j2, e18Var3, 0);
                                    e18Var3.p(false);
                                }
                            } else {
                                e18Var3.T();
                            }
                            return iei.a;
                        }
                    }, e18Var2), e18Var2, 24576, 10);
                } else {
                    e18Var2.T();
                }
                return iei.a;
        }
    }

    public /* synthetic */ bf7(boolean z, long j, mxd mxdVar) {
        this.F = z;
        this.G = j;
        this.H = mxdVar;
    }
}
