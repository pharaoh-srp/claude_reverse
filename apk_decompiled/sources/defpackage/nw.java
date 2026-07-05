package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nw implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ bz7 I;

    public /* synthetic */ nw(List list, Object obj, Object obj2, bz7 bz7Var, int i) {
        this.E = i;
        this.F = list;
        this.G = obj;
        this.H = obj2;
        this.I = bz7Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        Object obj5 = this.H;
        Object obj6 = this.G;
        List list = this.F;
        bz7 bz7Var = this.I;
        int i2 = 4;
        switch (i) {
            case 0:
                px9 px9Var = (px9) obj;
                int iIntValue = ((Number) obj2).intValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                l6 l6Var = (l6) bz7Var;
                mw mwVar = (mw) obj5;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((e18) ld4Var).f(px9Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
                    e18Var.T();
                } else {
                    iaj iajVar = (iaj) list.get(iIntValue);
                    e18Var.a0(29582416);
                    String str = iajVar.a;
                    String strB = uaj.b((Context) e18Var.j(w00.b), str);
                    int iA = uaj.a(str);
                    iqb iqbVarL = gb9.L(gb9.I(fqb.E, (mnc) obj6), MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 1);
                    boolean zF = e18Var.f(mwVar) | e18Var.f(iajVar);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new p4(mwVar, 3, iajVar);
                        e18Var.k0(objN);
                    }
                    zy7 zy7Var = (zy7) objN;
                    boolean zF2 = e18Var.f(l6Var) | e18Var.f(iajVar);
                    Object objN2 = e18Var.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new p4(l6Var, i2, iajVar);
                        e18Var.k0(objN2);
                    }
                    rlk.a(str, strB, iA, zy7Var, iqbVarL, (zy7) objN2, e18Var, 0, 0);
                    e18Var.p(false);
                }
                break;
            case 1:
                px9 px9Var2 = (px9) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                bz7 bz7Var2 = (bz7) obj5;
                b bVar = (b) obj6;
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((e18) ld4Var2).f(px9Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= ((e18) ld4Var2).d(iIntValue3) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    EnvironmentResource environmentResource = (EnvironmentResource) ((ArrayList) list).get(iIntValue3);
                    e18Var2.a0(966740794);
                    Integer num = (Integer) ((Map) bVar.n.getValue()).get(environmentResource.getEnvironment_id());
                    int iIntValue5 = num != null ? num.intValue() : 0;
                    boolean zH = bVar.h(environmentResource);
                    boolean z = gwj.h(environmentResource) > 0;
                    boolean zF3 = e18Var2.f(bz7Var2) | e18Var2.h(environmentResource);
                    Object objN3 = e18Var2.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new hz3(bz7Var2, environmentResource, 0);
                        e18Var2.k0(objN3);
                    }
                    zy7 zy7Var2 = (zy7) objN3;
                    boolean zF4 = e18Var2.f(bz7Var) | e18Var2.h(environmentResource);
                    Object objN4 = e18Var2.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new hz3(bz7Var, environmentResource, 1);
                        e18Var2.k0(objN4);
                    }
                    a.t(environmentResource, zH, iIntValue5, z, zy7Var2, (zy7) objN4, e18Var2, 0);
                    e18Var2.p(false);
                }
                break;
            case 2:
                px9 px9Var3 = (px9) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                bz7 bz7Var3 = (bz7) obj5;
                int i5 = (iIntValue7 & 6) == 0 ? iIntValue7 | (((e18) ld4Var3).f(px9Var3) ? 4 : 2) : iIntValue7;
                if ((iIntValue7 & 48) == 0) {
                    i5 |= ((e18) ld4Var3).d(iIntValue6) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(i5 & 1, (i5 & 147) != 146)) {
                    e18Var3.T();
                } else {
                    RepoWithStatus repoWithStatus = (RepoWithStatus) list.get(iIntValue6);
                    e18Var3.a0(1984049438);
                    boolean zContains = ((LinkedHashSet) obj6).contains(repoWithStatus.getRepo().getId());
                    boolean zG = e18Var3.g(zContains) | e18Var3.f(bz7Var3) | e18Var3.h(repoWithStatus) | e18Var3.f(bz7Var);
                    Object objN5 = e18Var3.N();
                    if (zG || objN5 == lz1Var) {
                        objN5 = new kz3(zContains, bz7Var3, repoWithStatus, bz7Var);
                        e18Var3.k0(objN5);
                    }
                    a.w(repoWithStatus, zContains, (zy7) objN5, e18Var3, 0);
                    e18Var3.p(false);
                }
                break;
            default:
                px9 px9Var4 = (px9) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                ld4 ld4Var4 = (ld4) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                int i6 = (iIntValue9 & 6) == 0 ? iIntValue9 | (((e18) ld4Var4).f(px9Var4) ? 4 : 2) : iIntValue9;
                if ((iIntValue9 & 48) == 0) {
                    i6 |= ((e18) ld4Var4).d(iIntValue8) ? 32 : 16;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(i6 & 1, (i6 & 147) != 146)) {
                    e18Var4.T();
                } else {
                    srf srfVar = (srf) ((ArrayList) list).get(iIntValue8);
                    e18Var4.a0(-811348413);
                    String strJ0 = d4c.j0(srfVar.E, e18Var4);
                    Integer num2 = (Integer) ((Map) obj6).get(srfVar);
                    int iIntValue10 = num2 != null ? num2.intValue() : 0;
                    boolean z2 = srfVar == ((srf) obj5);
                    boolean zF5 = e18Var4.f(bz7Var) | e18Var4.d(srfVar.ordinal());
                    Object objN6 = e18Var4.N();
                    if (zF5 || objN6 == lz1Var) {
                        objN6 = new p4(bz7Var, 12, srfVar);
                        e18Var4.k0(objN6);
                    }
                    e.g(iIntValue10, 0, e18Var4, (zy7) objN6, null, strJ0, z2);
                    e18Var4.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
