package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y56 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ qz7 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ y56(nwb nwbVar, List list, rz7 rz7Var, int i, Object obj, bz7 bz7Var) {
        this.H = nwbVar;
        this.I = list;
        this.J = rz7Var;
        this.F = i;
        this.K = obj;
        this.G = bz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strF0;
        bpc bpcVarA;
        int i = this.E;
        Object obj4 = this.K;
        int i2 = this.F;
        fqb fqbVar = fqb.E;
        Object obj5 = this.J;
        iei ieiVar = iei.a;
        qz7 qz7Var = this.G;
        Object obj6 = this.I;
        Object obj7 = this.H;
        switch (i) {
            case 0:
                p1e p1eVar = (p1e) obj7;
                String str = p1eVar.c;
                r1e r1eVar = (r1e) obj6;
                iwg iwgVar = (iwg) obj5;
                qi3 qi3Var = (qi3) obj4;
                zy7 zy7Var = (zy7) qz7Var;
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int i3 = zb0.I;
                    boolean z = p1eVar.a;
                    tyg tygVar = tyg.MESSAGE_LIMITS;
                    if (z) {
                        e18Var.a0(-761192533);
                        strF0 = d4c.f0(R.plurals.rate_limit_notice_remaining_messages_until_day, i2, new Object[]{Integer.valueOf(i2), p1eVar.b, str, tygVar.a()}, e18Var);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-760825710);
                        strF0 = d4c.f0(R.plurals.rate_limit_notice_remaining_messages_until, i2, new Object[]{Integer.valueOf(i2), str, tygVar.a()}, e18Var);
                        e18Var.p(false);
                    }
                    tjh.c(mwa.z(strF0, new ekh(new egg(((d54) e18Var.j(on4.a)).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61438), null, null, null), 4), dxeVar.a(fqbVar, 1.0f, true), gm3.a(e18Var).N, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 0, 262136);
                    h66.s(r1eVar, iwgVar, "chat_input_toast_approaching", qi3Var, zy7Var, e18Var, 384);
                } else {
                    e18Var.T();
                }
                break;
            case 1:
                List list = (List) obj7;
                rz7 rz7Var = (rz7) obj6;
                zy7 zy7Var2 = (zy7) qz7Var;
                bz7 bz7Var = (bz7) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (Object obj8 : list) {
                        String str2 = (String) rz7Var.invoke(obj8, e18Var2, Integer.valueOf((i2 >> 3) & 8));
                        Object obj9 = this.J;
                        if (x44.r(obj8, obj9)) {
                            e18Var2.a0(-106127802);
                            bpcVarA = a.a(ud0.L, e18Var2);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(1005018238);
                            e18Var2.p(false);
                            bpcVarA = null;
                        }
                        boolean zF = e18Var2.f(zy7Var2) | e18Var2.h(obj8) | e18Var2.h(obj9) | e18Var2.f(bz7Var);
                        Object objN = e18Var2.N();
                        if (zF || objN == jd4.a) {
                            objN = new n5h(zy7Var2, obj8, obj9, bz7Var, 2);
                            e18Var2.k0(objN);
                        }
                        uuj.a(str2, bpcVarA, (zy7) objN, null, null, false, null, null, null, null, 0, 0, e18Var2, 64, 4088);
                    }
                } else {
                    e18Var2.T();
                }
                break;
            default:
                nwb nwbVar = (nwb) obj7;
                List list2 = (List) obj6;
                rz7 rz7Var2 = (rz7) obj5;
                bz7 bz7Var2 = (bz7) qz7Var;
                zy7 zy7Var3 = (zy7) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                zy7Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).h(zy7Var3) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    j8.b(((Boolean) nwbVar.getValue()).booleanValue(), zy7Var3, b.g(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, m5j.c, 1), 0L, null, null, null, gm3.a(e18Var3).o, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-699674148, new y56(list2, rz7Var2, this.F, this.K, zy7Var3, bz7Var2), e18Var3), e18Var3, ((iIntValue3 << 3) & 112) | 384, 1912);
                } else {
                    e18Var3.T();
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ y56(p1e p1eVar, int i, r1e r1eVar, iwg iwgVar, qi3 qi3Var, zy7 zy7Var) {
        this.H = p1eVar;
        this.F = i;
        this.I = r1eVar;
        this.J = iwgVar;
        this.K = qi3Var;
        this.G = zy7Var;
    }

    public /* synthetic */ y56(List list, rz7 rz7Var, int i, Object obj, zy7 zy7Var, bz7 bz7Var) {
        this.H = list;
        this.I = rz7Var;
        this.F = i;
        this.J = obj;
        this.G = zy7Var;
        this.K = bz7Var;
    }
}
