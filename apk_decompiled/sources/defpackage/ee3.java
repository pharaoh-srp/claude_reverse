package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ee3 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ wlg F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ee3(kk4 kk4Var, List list, pl3 pl3Var, wlg wlgVar, bz7 bz7Var, hi4 hi4Var, Context context, nwb nwbVar) {
        this.G = kk4Var;
        this.H = list;
        this.I = pl3Var;
        this.F = wlgVar;
        this.J = bz7Var;
        this.K = hi4Var;
        this.L = context;
        this.M = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        iei ieiVar;
        int i = this.E;
        iei ieiVar2 = iei.a;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        Object obj7 = this.H;
        Object obj8 = this.G;
        switch (i) {
            case 0:
                ksg ksgVar = (ksg) obj4;
                wlg wlgVar = (wlg) obj7;
                wlg wlgVar2 = (wlg) obj6;
                wlg wlgVar3 = (wlg) obj5;
                ksg ksgVar2 = (ksg) obj3;
                zd3 zd3Var = (zd3) obj2;
                xd6 xd6Var = (xd6) obj;
                long j = ((d54) this.F.getValue()).a;
                long j2 = ((d54) ((wlg) obj8).getValue()).a;
                float fQ0 = xd6Var.q0(2.0f);
                float f = ksgVar.a;
                float f2 = f / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32));
                boolean zC = d54.c(j, j2);
                qk7 qk7Var = qk7.a;
                if (zC) {
                    xd6.y(xd6Var, j, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fQ0)) << 32) | (((long) Float.floatToRawIntBits(fQ0)) & 4294967295L), qk7Var, MTTypesetterKt.kLineSkipLimitMultiplier, 226);
                    ieiVar = ieiVar2;
                } else {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                    float f3 = fIntBitsToFloat - (f * 2.0f);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                    float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, fQ0 - f);
                    xd6Var = xd6Var;
                    xd6.y(xd6Var, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), qk7Var, MTTypesetterKt.kLineSkipLimitMultiplier, 224);
                    float f4 = fIntBitsToFloat - f;
                    ieiVar = ieiVar2;
                    float f5 = fQ0 - f2;
                    xd6.y(xd6Var, j2, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), ksgVar, MTTypesetterKt.kLineSkipLimitMultiplier, 224);
                }
                long j3 = ((d54) wlgVar.getValue()).a;
                float fFloatValue = ((Number) wlgVar2.getValue()).floatValue();
                float fFloatValue2 = ((Number) wlgVar3.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd6Var.g() >> 32));
                float fW = d4c.W(0.4f, 0.5f, fFloatValue2);
                float fW2 = d4c.W(0.7f, 0.5f, fFloatValue2);
                float fW3 = d4c.W(0.5f, 0.5f, fFloatValue2);
                float fW4 = d4c.W(0.3f, 0.5f, fFloatValue2);
                zd3Var.a.j();
                c40 c40Var = zd3Var.a;
                c40Var.g(0.2f * fIntBitsToFloat2, fW3 * fIntBitsToFloat2);
                c40Var.f(fW * fIntBitsToFloat2, fW2 * fIntBitsToFloat2);
                c40Var.f(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fW4);
                e40 e40Var = zd3Var.b;
                e40Var.c(c40Var);
                c40 c40Var2 = zd3Var.c;
                c40Var2.j();
                e40Var.b(MTTypesetterKt.kLineSkipLimitMultiplier, e40Var.a.getLength() * fFloatValue, c40Var2);
                xd6.c1(xd6Var, zd3Var.c, j3, MTTypesetterKt.kLineSkipLimitMultiplier, ksgVar2, 52);
                return ieiVar;
            default:
                kk4 kk4Var = (kk4) obj8;
                nwb nwbVar = (nwb) obj2;
                t0a t0aVar = (t0a) obj;
                t0aVar.getClass();
                t0a.a(t0aVar, ((Boolean) kk4Var.f.n.getValue()).booleanValue(), null, new mk4(0, kk4Var), 2);
                t0a.a(t0aVar, ((Boolean) kk4Var.c.u.getValue()).booleanValue(), null, new mq0(kk4Var, (List) obj7, (pl3) obj6, this.F, (bz7) obj5, (hi4) obj4, (Context) obj3, nwbVar, 1), 2);
                return ieiVar2;
        }
    }

    public /* synthetic */ ee3(wlg wlgVar, wlg wlgVar2, ksg ksgVar, wlg wlgVar3, v5i v5iVar, v5i v5iVar2, ksg ksgVar2, zd3 zd3Var) {
        this.F = wlgVar;
        this.G = wlgVar2;
        this.K = ksgVar;
        this.H = wlgVar3;
        this.I = v5iVar;
        this.J = v5iVar2;
        this.L = ksgVar2;
        this.M = zd3Var;
    }
}
