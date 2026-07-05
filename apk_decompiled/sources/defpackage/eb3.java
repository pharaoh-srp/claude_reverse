package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eb3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ eb3(mqg mqgVar, z4i z4iVar, List list, int i) {
        this.E = 2;
        this.G = mqgVar;
        this.H = z4iVar;
        this.I = list;
        this.F = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = this.F;
        iei ieiVar = iei.a;
        Object obj2 = this.I;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                m7f m7fVar = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar = jce.a;
                break;
            case 1:
                isc iscVar = (isc) obj2;
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                long j = i2;
                long jL = mwa.L(Float.intBitsToFloat((int) (xd6Var.g() >> 32)));
                xd6.P(xd6Var, (r20) obj4, ((long) (iscVar.h() * i2)) & 4294967295L, (j & 4294967295L) | (j << 32), (jL << 32) | (jL & 4294967295L), MTTypesetterKt.kLineSkipLimitMultiplier, (hr1) obj3, 2, 360);
                break;
            case 2:
                mqg mqgVar = (mqg) obj4;
                z4i z4iVar = (z4i) obj3;
                List list = (List) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (mqgVar == null || iIntValue != 0) {
                    String str = (String) w44.O0((list.size() - (iIntValue - i2)) - 1, z4iVar.a);
                    if (str != null) {
                    }
                    break;
                } else {
                    String str2 = mqgVar.a;
                    if (str2 == null) {
                    }
                }
                break;
            case 3:
                b3d b3dVar = (b3d) obj;
                b3dVar.getClass();
                b3dVar.f((c3d) obj4, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                b3dVar.f((c3d) obj3, 0, i2, MTTypesetterKt.kLineSkipLimitMultiplier);
                b3dVar.f((c3d) obj2, 0, i2, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            default:
                kfh kfhVar = (kfh) obj4;
                c3d c3dVar = (c3d) obj3;
                b3d b3dVar2 = (b3d) obj;
                kfhVar.u1(b3dVar2, this.F, c3dVar.E, kfhVar.X.d().H, ((q5b) obj2).getLayoutDirection());
                b3d.k(b3dVar2, c3dVar, -kfhVar.b0.a.h(), 0);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ eb3(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
        this.H = obj2;
        this.I = obj3;
    }

    public /* synthetic */ eb3(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.F = i;
        this.I = obj3;
    }
}
