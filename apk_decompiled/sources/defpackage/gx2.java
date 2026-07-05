package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gx2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ gx2(int i, int i2, zy7 zy7Var) {
        this.E = i2;
        this.F = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        zy7 zy7Var = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    bpc bpcVarA = a.a(ud0.d, e18Var);
                    String strJ0 = d4c.j0(R.string.chat_input_add_to_chat, e18Var);
                    if (zy7Var == null) {
                        e18Var.a0(1396723004);
                        Object objN = e18Var.N();
                        if (objN == jd4.a) {
                            objN = new oob(19);
                            e18Var.k0(objN);
                        }
                        zy7Var = (zy7) objN;
                    } else {
                        e18Var.a0(1430528282);
                    }
                    e18Var.p(false);
                    d4c.d(bpcVarA, strJ0, null, false, 0L, 20.0f, zy7Var, e18Var, 196616, 28);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    String strJ02 = d4c.j0(R.string.start_new_task, e18Var2);
                    iqb iqbVarJ = gb9.J(fqb.E, 16.0f);
                    b9g b9gVar = b9g.a;
                    dtj.a(strJ02, b.c(b.v(iqbVarJ, MTTypesetterKt.kLineSkipLimitMultiplier, 580.0f, 1), 1.0f), false, null, e12.a, x02.a, 0L, this.F, e18Var2, 221184, 76);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                iv1.f(zy7Var, (ld4) obj, x44.p0(7));
                break;
            default:
                ((Integer) obj2).getClass();
                iv1.f(zy7Var, (ld4) obj, x44.p0(7));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gx2(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }
}
