package defpackage;

import androidx.compose.foundation.b;
import com.anthropic.claude.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ui4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ ui4(int i, zy7 zy7Var, String str) {
        this.E = 1;
        this.F = i;
        this.G = str;
        this.H = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        int i2 = this.F;
        iei ieiVar = iei.a;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                List list = (List) obj5;
                nwb nwbVar = (nwb) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((nr7) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    e18Var.a0(662875674);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zmk.f((String) it.next(), null, null, 0L, 0L, new qnc(12.0f, 8.0f, 12.0f, 8.0f), null, xve.a, null, e18Var, 196608, 350);
                    }
                    e18Var.p(false);
                    if (!((Boolean) nwbVar.getValue()).booleanValue() && i2 > 0) {
                        e18Var.a0(-925376492);
                        String strF0 = d4c.f0(R.plurals.connector_directory_show_more, i2, new Object[]{Integer.valueOf(i2)}, e18Var);
                        tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).i;
                        long j = gm3.a(e18Var).O;
                        mo8 mo8Var = z79.a;
                        iqb iqbVarV = xn5.V(pkb.E, xve.a);
                        vue vueVar = new vue(0);
                        boolean zF = e18Var.f(nwbVar);
                        Object objN = e18Var.N();
                        if (zF || objN == jd4.a) {
                            objN = new dy2(28, nwbVar);
                            e18Var.k0(objN);
                        }
                        tjh.b(strF0, gb9.K(b.c(iqbVarV, false, null, vueVar, null, (zy7) objN, 11), 12.0f, 8.0f), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131064);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-924744681);
                        e18Var.p(false);
                    }
                }
                break;
            case 1:
                String strF02 = (String) obj5;
                zy7 zy7Var = (zy7) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    ud0 ud0Var = ud0.x;
                    if (i2 <= 1) {
                        e18Var2.a0(-1899165614);
                        e18Var2.p(false);
                        if (strF02 == null) {
                            strF02 = "";
                        }
                    } else {
                        e18Var2.a0(-1899099553);
                        strF02 = d4c.f0(R.plurals.ccr_sheet_n_branches, i2, new Object[]{Integer.valueOf(i2)}, e18Var2);
                        e18Var2.p(false);
                    }
                    t3c.g(ud0Var, strF02, zy7Var, null, false, e18Var2, 0, 24);
                }
                break;
            case 2:
                String str = (String) obj5;
                tkh tkhVar2 = (tkh) obj4;
                iqb iqbVar = (iqb) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                iqbVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(iqbVar) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    tjh.b(str, iqbVar, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, this.F, 0, null, tkhVar2, e18Var3, (iIntValue3 << 3) & 112, 384, 110588);
                }
                break;
            default:
                zb0 zb0Var = (zb0) obj5;
                tkh tkhVar3 = (tkh) obj4;
                iqb iqbVar2 = (iqb) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                iqbVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(iqbVar2) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e18Var4.T();
                } else {
                    tjh.c(zb0Var, iqbVar2, 0L, 0L, 0L, null, 0L, 2, false, this.F, 0, null, null, tkhVar3, e18Var4, (iIntValue4 << 3) & 112, 384, 241660);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ui4(Object obj, int i, Object obj2, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
        this.H = obj2;
    }
}
