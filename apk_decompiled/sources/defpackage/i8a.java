package defpackage;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.i0;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class i8a {
    public static final void a(final zqc zqcVar, final rwe rweVar, final xk3 xk3Var, final of6 of6Var, final zy7 zy7Var, kqc kqcVar, swe sweVar, ld4 ld4Var, int i) {
        e18 e18Var;
        zy7Var.getClass();
        sweVar.getClass();
        ea4 ea4Var = sweVar.a;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(104938469);
        int i2 = (e18Var2.f(sweVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | i | (e18Var2.f(zqcVar) ? 4 : 2) | (e18Var2.f(rweVar) ? 32 : 16) | (e18Var2.h(xk3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.f(of6Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.f(kqcVar) ? 131072 : 65536);
        if (e18Var2.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            te3 te3Var = (te3) zqcVar.F.getValue();
            ClaudeAppDestination.List.AllChatsList allChatsList = ClaudeAppDestination.List.AllChatsList.INSTANCE;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                ue3 ue3Var = new ue3(new ej3(0));
                e18Var2.k0(ue3Var);
                objN = ue3Var;
            }
            ue3 ue3Var2 = (ue3) objN;
            boolean zF = e18Var2.f(ea4Var.d());
            int i3 = i2 & 14;
            boolean z = zF | (i3 == 4);
            Object objN2 = e18Var2.N();
            if (z || objN2 == lz1Var) {
                objN2 = new qbd(ea4Var.d(), new gj3(zqcVar, 6), h8a.L);
                e18Var2.k0(objN2);
            }
            qbd qbdVar = (qbd) objN2;
            boolean z2 = i3 == 4;
            Object objN3 = e18Var2.N();
            if (z2 || objN3 == lz1Var) {
                objN3 = new gj3(zqcVar, 7);
                e18Var2.k0(objN3);
            }
            final int i4 = 0;
            ta4 ta4VarQ0 = fd9.q0(-732540891, new sz7() { // from class: g8a
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i5 = i4;
                    iei ieiVar = iei.a;
                    switch (i5) {
                        case 0:
                            ClaudeAppDestination.List list = (ClaudeAppDestination.List) obj2;
                            ld4 ld4Var2 = (ld4) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            list.getClass();
                            if ((iIntValue & 48) == 0) {
                                iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var2).f(list) : ((e18) ld4Var2).h(list) ? 32 : 16;
                            }
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                                e18Var3.T();
                            } else {
                                i0.a(list, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var3, ((iIntValue >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                        case 1:
                            ClaudeAppDestination.Detail detail = (ClaudeAppDestination.Detail) obj2;
                            ld4 ld4Var3 = (ld4) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            detail.getClass();
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var3).f(detail) : ((e18) ld4Var3).h(detail) ? 32 : 16;
                            }
                            e18 e18Var4 = (e18) ld4Var3;
                            if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                e18Var4.T();
                            } else {
                                i0.a(detail, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var4, ((iIntValue2 >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                        default:
                            ClaudeAppDestination.Extra extra = (ClaudeAppDestination.Extra) obj2;
                            ld4 ld4Var4 = (ld4) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            extra.getClass();
                            if ((iIntValue3 & 48) == 0) {
                                iIntValue3 |= (iIntValue3 & 64) == 0 ? ((e18) ld4Var4).f(extra) : ((e18) ld4Var4).h(extra) ? 32 : 16;
                            }
                            e18 e18Var5 = (e18) ld4Var4;
                            if (!e18Var5.Q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                e18Var5.T();
                            } else {
                                i0.a(extra, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var5, ((iIntValue3 >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var2);
            final int i5 = 1;
            ta4 ta4VarQ02 = fd9.q0(-1439087597, new sz7() { // from class: g8a
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i52 = i5;
                    iei ieiVar = iei.a;
                    switch (i52) {
                        case 0:
                            ClaudeAppDestination.List list = (ClaudeAppDestination.List) obj2;
                            ld4 ld4Var2 = (ld4) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            list.getClass();
                            if ((iIntValue & 48) == 0) {
                                iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var2).f(list) : ((e18) ld4Var2).h(list) ? 32 : 16;
                            }
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                                e18Var3.T();
                            } else {
                                i0.a(list, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var3, ((iIntValue >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                        case 1:
                            ClaudeAppDestination.Detail detail = (ClaudeAppDestination.Detail) obj2;
                            ld4 ld4Var3 = (ld4) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            detail.getClass();
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var3).f(detail) : ((e18) ld4Var3).h(detail) ? 32 : 16;
                            }
                            e18 e18Var4 = (e18) ld4Var3;
                            if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                e18Var4.T();
                            } else {
                                i0.a(detail, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var4, ((iIntValue2 >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                        default:
                            ClaudeAppDestination.Extra extra = (ClaudeAppDestination.Extra) obj2;
                            ld4 ld4Var4 = (ld4) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            extra.getClass();
                            if ((iIntValue3 & 48) == 0) {
                                iIntValue3 |= (iIntValue3 & 64) == 0 ? ((e18) ld4Var4).f(extra) : ((e18) ld4Var4).h(extra) ? 32 : 16;
                            }
                            e18 e18Var5 = (e18) ld4Var4;
                            if (!e18Var5.Q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                e18Var5.T();
                            } else {
                                i0.a(extra, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var5, ((iIntValue3 >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var2);
            final int i6 = 2;
            e18Var = e18Var2;
            dch.i(te3Var, (zy7) objN3, ta4VarQ0, ta4VarQ02, fd9.q0(1270785289, new sz7() { // from class: g8a
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i52 = i6;
                    iei ieiVar = iei.a;
                    switch (i52) {
                        case 0:
                            ClaudeAppDestination.List list = (ClaudeAppDestination.List) obj2;
                            ld4 ld4Var2 = (ld4) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            list.getClass();
                            if ((iIntValue & 48) == 0) {
                                iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var2).f(list) : ((e18) ld4Var2).h(list) ? 32 : 16;
                            }
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                                e18Var3.T();
                            } else {
                                i0.a(list, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var3, ((iIntValue >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                        case 1:
                            ClaudeAppDestination.Detail detail = (ClaudeAppDestination.Detail) obj2;
                            ld4 ld4Var3 = (ld4) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            detail.getClass();
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var3).f(detail) : ((e18) ld4Var3).h(detail) ? 32 : 16;
                            }
                            e18 e18Var4 = (e18) ld4Var3;
                            if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                e18Var4.T();
                            } else {
                                i0.a(detail, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var4, ((iIntValue2 >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                        default:
                            ClaudeAppDestination.Extra extra = (ClaudeAppDestination.Extra) obj2;
                            ld4 ld4Var4 = (ld4) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            ((ia0) obj).getClass();
                            extra.getClass();
                            if ((iIntValue3 & 48) == 0) {
                                iIntValue3 |= (iIntValue3 & 64) == 0 ? ((e18) ld4Var4).f(extra) : ((e18) ld4Var4).h(extra) ? 32 : 16;
                            }
                            e18 e18Var5 = (e18) ld4Var4;
                            if (!e18Var5.Q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                e18Var5.T();
                            } else {
                                i0.a(extra, zqcVar, rweVar, xk3Var, zy7Var, of6Var, null, null, null, null, e18Var5, ((iIntValue3 >> 3) & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var2), ue3Var2, allChatsList, kqcVar, qbdVar, e18Var, ((i2 << 9) & 234881024) | 1087925632);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uk3(zqcVar, rweVar, xk3Var, of6Var, zy7Var, kqcVar, sweVar, i);
        }
    }
}
