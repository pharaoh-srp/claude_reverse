package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qod implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ lod F;
    public final /* synthetic */ znd G;

    public /* synthetic */ qod(lod lodVar, znd zndVar) {
        this.F = lodVar;
        this.G = zndVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        znd zndVar = this.G;
        lod lodVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b = 0;
                int i2 = 2;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean z = !((Boolean) lodVar.p.getValue()).booleanValue();
                    List list = (List) lodVar.k.getValue();
                    lm6 lm6Var = lm6.E;
                    List list2 = list == null ? lm6Var : list;
                    List list3 = (List) lodVar.l.getValue();
                    fik.c(z, list2, list3 == null ? lm6Var : list3, fd9.q0(308513361, new ood(zndVar, i2, b), e18Var), b.c(fqb.E, 1.0f), null, ((Boolean) lodVar.n.getValue()).booleanValue(), null, e18Var, 27648, 160);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qik.c(lodVar, zndVar, (ld4) obj, x44.p0(65));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qod(lod lodVar, znd zndVar, int i) {
        this.F = lodVar;
        this.G = zndVar;
    }
}
