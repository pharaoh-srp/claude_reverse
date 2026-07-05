package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;

    public /* synthetic */ lf1(sih sihVar, int i) {
        this.E = i;
        this.F = sihVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        cu9 cu9VarV;
        l9e l9eVar;
        int i = this.E;
        sih sihVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(sihVar.o(false).a);
            case 1:
                return sihVar.u(true, false);
            case 2:
                return sihVar.u(false, false);
            case 3:
                lsc lscVar = sihVar.t;
                i5i i5iVar = sihVar.a;
                boolean zD = kkh.d(i5iVar.d().H);
                if (((zD && ((ykh) lscVar.getValue()) == ykh.F) || (!zD && ((ykh) lscVar.getValue()) == ykh.G)) && sihVar.q() == null && ((Boolean) sihVar.l.getValue()).booleanValue() && (cu9VarV = sihVar.v()) != null) {
                    l9e l9eVarR = u00.R(cu9VarV);
                    l9e l9eVarX = d4c.x(cu9VarV.K(l9eVarR.h()), l9eVarR.g());
                    cu9 cu9VarV2 = sihVar.v();
                    if (cu9VarV2 != null) {
                        long j = i5iVar.d().H;
                        if (kkh.d(j)) {
                            l9e l9eVarP = sihVar.p();
                            l9eVar = d4c.x(cu9VarV2.K(l9eVarP.h()), l9eVarP.g());
                        } else {
                            long jK = cu9VarV2.K(sihVar.t(true));
                            long jK2 = cu9VarV2.K(sihVar.t(false));
                            yjh yjhVarC = sihVar.b.c();
                            if (yjhVarC == null) {
                                l9eVar = l9e.e;
                            } else {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (cu9VarV2.K((((long) Float.floatToRawIntBits(yjhVarC.c((int) (j >> 32)).b)) & 4294967295L) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32)) & 4294967295L));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cu9VarV2.K((((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(yjhVarC.c((int) (j & 4294967295L)).b)) & 4294967295L)) & 4294967295L));
                                int i2 = (int) (jK >> 32);
                                int i3 = (int) (jK2 >> 32);
                                l9eVar = new l9e(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.max(Float.intBitsToFloat((int) (jK & 4294967295L)), Float.intBitsToFloat((int) (jK2 & 4294967295L))));
                            }
                        }
                        if (l9eVar.k(l9eVarX)) {
                            return l9eVar.i(l9eVarX);
                        }
                    } else {
                        e39.d("textLayoutCoordinates should not be null.");
                        sz6.r();
                    }
                }
                return null;
            case 4:
                return (l9e) sihVar.y.getValue();
            default:
                return sihVar.a.d();
        }
    }
}
