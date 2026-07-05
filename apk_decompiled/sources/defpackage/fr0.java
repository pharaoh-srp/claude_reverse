package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.chat.ChatFeedback;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.types.strings.MessageId;
import com.mikepenz.aboutlibraries.entity.Library;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class fr0 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ fr0(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj5 = this.F;
        int i2 = 4;
        Object obj6 = this.G;
        int i3 = 0;
        switch (i) {
            case 0:
                ax9 ax9Var = (ax9) obj;
                int iIntValue = ((Number) obj2).intValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                bz7 bz7Var = (bz7) obj6;
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((e18) ld4Var).f(ax9Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
                    e18Var.T();
                } else {
                    dr0 dr0Var = (dr0) ((ArrayList) obj5).get(iIntValue);
                    e18Var.a0(-1800867108);
                    boolean zF = e18Var.f(bz7Var) | e18Var.h(dr0Var);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new p4(bz7Var, 6, dr0Var);
                        e18Var.k0(objN);
                    }
                    dtk.a(dr0Var, (zy7) objN, null, e18Var, 0);
                    e18Var.p(false);
                }
                break;
            case 1:
                MessageId messageId = (MessageId) obj;
                String strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                int iIntValue3 = ((Number) obj2).intValue();
                ChatFeedbackType chatFeedbackType = (ChatFeedbackType) obj3;
                String str = (String) obj4;
                chatFeedbackType.getClass();
                kdg kdgVar = ((t53) obj5).X0;
                if (strM1057unboximpl != null) {
                    ListIterator listIterator = kdgVar.listIterator();
                    while (true) {
                        c8a c8aVar = (c8a) listIterator;
                        if (!c8aVar.hasNext()) {
                            iIntValue3 = -1;
                        } else if (MessageId.m1054equalsimpl0(((whd) c8aVar.next()).c(), strM1057unboximpl)) {
                            iIntValue3 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                if (iIntValue3 > 0) {
                    Object obj7 = kdgVar.get(iIntValue3);
                    uhd uhdVar = obj7 instanceof uhd ? (uhd) obj7 : null;
                    if (uhdVar != null) {
                        kdgVar.set(iIntValue3, uhd.g(uhdVar, null, null, new ChatFeedback(chatFeedbackType, str), null, null, 1919));
                    }
                }
                x0.d((rwe) obj6);
                break;
            case 2:
                px9 px9Var = (px9) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                int i5 = (iIntValue5 & 6) == 0 ? iIntValue5 | (((e18) ld4Var2).f(px9Var) ? 4 : 2) : iIntValue5;
                if ((iIntValue5 & 48) == 0) {
                    i5 |= ((e18) ld4Var2).d(iIntValue4) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i5 & 1, (i5 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    DirectoryServer.PromptImage promptImage = (DirectoryServer.PromptImage) ((List) obj5).get(iIntValue4);
                    e18Var2.a0(733793679);
                    wi4.k(promptImage, (String) obj6, e18Var2, 0);
                    e18Var2.p(false);
                }
                break;
            case 3:
                px9 px9Var2 = (px9) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                eli eliVar = (eli) obj6;
                int i6 = (iIntValue7 & 6) == 0 ? iIntValue7 | (((e18) ld4Var3).f(px9Var2) ? 4 : 2) : iIntValue7;
                if ((iIntValue7 & 48) == 0) {
                    i6 |= ((e18) ld4Var3).d(iIntValue6) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(i6 & 1, (i6 & 147) != 146)) {
                    e18Var3.T();
                } else {
                    Library library = (Library) ((mz8) obj5).get(iIntValue6);
                    e18Var3.a0(-172077689);
                    boolean zH = e18Var3.h(eliVar);
                    Object objN2 = e18Var3.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new u3a(i3, eliVar);
                        e18Var3.k0(objN2);
                    }
                    xvj.c(library, (bz7) objN2, b.c(fqbVar, 1.0f), null, e18Var3, 384);
                    e18Var3.p(false);
                }
                break;
            case 4:
                px9 px9Var3 = (px9) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                ld4 ld4Var4 = (ld4) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                int i7 = (iIntValue9 & 6) == 0 ? iIntValue9 | (((e18) ld4Var4).f(px9Var3) ? 4 : 2) : iIntValue9;
                if ((iIntValue9 & 48) == 0) {
                    i7 |= ((e18) ld4Var4).d(iIntValue8) ? 32 : 16;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(i7 & 1, (i7 & 147) != 146)) {
                    e18Var4.T();
                } else {
                    u0d u0dVar = (u0d) ((List) obj5).get(iIntValue8);
                    e18Var4.a0(-1343267533);
                    o1d.b(u0dVar, iIntValue8 < x44.M((List) obj6), null, e18Var4, 0);
                    e18Var4.p(false);
                }
                break;
            case 5:
                px9 px9Var4 = (px9) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                ld4 ld4Var5 = (ld4) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                int i8 = (iIntValue11 & 6) == 0 ? iIntValue11 | (((e18) ld4Var5).f(px9Var4) ? 4 : 2) : iIntValue11;
                if ((iIntValue11 & 48) == 0) {
                    i8 |= ((e18) ld4Var5).d(iIntValue10) ? 32 : 16;
                }
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(i8 & 1, (i8 & 147) != 146)) {
                    e18Var5.T();
                } else {
                    String str2 = (String) ((List) obj5).get(iIntValue10);
                    e18Var5.a0(1237131170);
                    tnk.b(str2, (om8) obj6, b.c(fqbVar, 1.0f), e18Var5, 448);
                    e18Var5.p(false);
                }
                break;
            case 6:
                px9 px9Var5 = (px9) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                ld4 ld4Var6 = (ld4) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                int i9 = (iIntValue13 & 6) == 0 ? iIntValue13 | (((e18) ld4Var6).f(px9Var5) ? 4 : 2) : iIntValue13;
                if ((iIntValue13 & 48) == 0) {
                    i9 |= ((e18) ld4Var6).d(iIntValue12) ? 32 : 16;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(i9 & 1, (i9 & 147) != 146)) {
                    e18Var6.T();
                } else {
                    Object obj8 = ((List) obj5).get(iIntValue12);
                    e18Var6.a0(-1890169304);
                    ((ta4) obj6).i(px9Var5, obj8, e18Var6, Integer.valueOf(i9 & 14));
                    e18Var6.p(false);
                }
                break;
            default:
                px9 px9Var6 = (px9) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                ld4 ld4Var7 = (ld4) obj3;
                int iIntValue15 = ((Number) obj4).intValue();
                nwb nwbVar = (nwb) obj6;
                int i10 = (iIntValue15 & 6) == 0 ? iIntValue15 | (((e18) ld4Var7).f(px9Var6) ? 4 : 2) : iIntValue15;
                if ((iIntValue15 & 48) == 0) {
                    i10 |= ((e18) ld4Var7).d(iIntValue14) ? 32 : 16;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(i10 & 1, (i10 & 147) != 146)) {
                    e18Var7.T();
                } else {
                    u7h u7hVar = (u7h) ((mva) obj5).get(iIntValue14);
                    e18Var7.a0(-880833004);
                    boolean zContains = ((Set) nwbVar.getValue()).contains(Long.valueOf(u7hVar.a));
                    boolean zF2 = e18Var7.f(nwbVar) | e18Var7.f(u7hVar);
                    Object objN3 = e18Var7.N();
                    if (zF2 || objN3 == lz1Var) {
                        objN3 = new ktf(u7hVar, i2, nwbVar);
                        e18Var7.k0(objN3);
                    }
                    p5h.a(u7hVar, zContains, (zy7) objN3, e18Var7, 0);
                    e18Var7.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
