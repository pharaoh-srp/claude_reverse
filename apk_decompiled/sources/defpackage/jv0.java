package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jv0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ jv0(int i, Object obj, int i2) {
        this.E = i2;
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                ((mdg) obj2).put(Integer.valueOf(i2), list);
                break;
            case 1:
                vz9 vz9Var = (vz9) obj;
                xr5 xr5Var = ((lx9) obj2).a;
                rcg rcgVarZ = fd9.Z();
                fd9.s0(rcgVarZ, fd9.k0(rcgVarZ), rcgVarZ != null ? rcgVarZ.e() : null);
                xr5Var.getClass();
                int i3 = vz9Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    vz9Var.b(i2 + i4);
                }
                break;
            case 2:
                ((swe) obj).getClass();
                break;
            case 3:
                break;
            case 4:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                o44 o44Var = new o44(((List) obj2).size(), i2);
                wn9[] wn9VarArr = ckf.a;
                dkf dkfVar = akf.f;
                wn9 wn9Var = ckf.a[24];
                ekfVar.a(dkfVar, o44Var);
                break;
            default:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                float fW = d4c.W(1.0f, 0.75f, wd6.d0(Math.abs(((hsc) ((koc) obj2).d.H).h() + (((isc) r5.d.G).h() - i2)), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
                xreVar.l(fW);
                xreVar.m(fW);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jv0(Object obj, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
    }
}
