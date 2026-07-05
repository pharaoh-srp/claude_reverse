package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pr4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ pr4(zy7 zy7Var, zy7 zy7Var2, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = zy7Var2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        zy7 zy7Var = this.G;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    dtj.a(d4c.j0(R.string.conway_system_capabilities_manage, e18Var), null, false, null, f12.a, y02.a, 0L, this.F, e18Var, 221184, 78);
                    ez1.e(this.G, null, false, null, null, bjk.a, e18Var, 1572864, 62);
                }
                break;
            case 1:
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    tjh.b(d4c.j0(R.string.chat_notice_attachment_limit, e18Var2), dxeVar.a(fqbVar, 1.0f, true), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var2, 0, 0, 131064);
                    lnk.d(this.F, null, false, null, null, null, ((jm3) gm3.c(e18Var2).e.E).l, skk.j, e18Var2, 805306368, 254);
                    h66.f(zy7Var, e18Var2, 0);
                }
                break;
            case 2:
                dxe dxeVar2 = (dxe) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                dxeVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(dxeVar2) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    tjh.b(d4c.j0(R.string.flexible_update_disclaimer_message, e18Var3), dxeVar2.a(fqbVar, 1.0f, true), gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).k, e18Var3, 0, 0, 131064);
                    lnk.d(this.F, null, false, null, null, null, ((jm3) gm3.c(e18Var3).e.E).l, skk.d, e18Var3, 805306368, 254);
                    h66.f(zy7Var, e18Var3, 0);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    zy7 zy7Var2 = this.F;
                    boolean zF = e18Var4.f(zy7Var2) | e18Var4.f(zy7Var);
                    Object objN = e18Var4.N();
                    if (zF || objN == jd4.a) {
                        objN = new kt0(zy7Var2, zy7Var, 22);
                        e18Var4.k0(objN);
                    }
                    rkj.b((zy7) objN, e18Var4, 0);
                }
                break;
        }
        return ieiVar;
    }
}
