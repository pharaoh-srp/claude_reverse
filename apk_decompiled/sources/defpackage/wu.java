package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.types.strings.ChatId;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class wu implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ Set F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ Date I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ bz7 K;
    public final /* synthetic */ bz7 L;
    public final /* synthetic */ zy7 M;

    public wu(List list, Set set, boolean z, bz7 bz7Var, Date date, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, zy7 zy7Var) {
        this.E = list;
        this.F = set;
        this.G = z;
        this.H = bz7Var;
        this.I = date;
        this.J = bz7Var2;
        this.K = bz7Var3;
        this.L = bz7Var4;
        this.M = zy7Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zy7 zy7Var;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            sx2 sx2Var = (sx2) this.E.get(iIntValue);
            e18Var.a0(1144886797);
            ChatConversationWithProjectReference chatConversationWithProjectReferenceN = nkk.n(sx2Var.a, sx2Var.b);
            qdf qdfVar = sx2Var.c;
            String strJ0 = d4c.j0(R.string.chat_list_item_click_label, e18Var);
            boolean zContains = this.F.contains(ChatId.m978boximpl(sx2Var.a.m176getUuidRjYBDck()));
            boolean z = this.G;
            lz1 lz1Var = jd4.a;
            if (z) {
                e18Var.a0(1145609468);
                bz7 bz7Var = this.H;
                boolean zF = e18Var.f(bz7Var) | e18Var.f(sx2Var);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = new uu(bz7Var, sx2Var, 0);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                zy7Var = (zy7) objN;
            } else {
                e18Var.a0(1145714341);
                e18Var.p(false);
                zy7Var = null;
            }
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).e;
            tkh tkhVar2 = ((jm3) gm3.c(e18Var).e.E).g;
            iqb iqbVarA = px9.a(px9Var, b.c(fqb.E, 1.0f), null, null, 7);
            iqbVarA.getClass();
            bz7 bz7Var2 = this.J;
            boolean zF2 = e18Var.f(bz7Var2) | e18Var.f(sx2Var);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new uu(bz7Var2, sx2Var, 1);
                e18Var.k0(objN2);
            }
            zy7 zy7Var2 = (zy7) objN2;
            bz7 bz7Var3 = this.K;
            boolean zF3 = e18Var.f(bz7Var3) | e18Var.f(sx2Var);
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var) {
                objN3 = new uu(bz7Var3, sx2Var, 2);
                e18Var.k0(objN3);
            }
            zy7 zy7Var3 = (zy7) objN3;
            zy7 zy7Var4 = this.M;
            boolean zF4 = e18Var.f(zy7Var4);
            Object objN4 = e18Var.N();
            if (zF4 || objN4 == lz1Var) {
                objN4 = new vu(0, zy7Var4);
                e18Var.k0(objN4);
            }
            zy7 zy7Var5 = (zy7) objN4;
            boolean zF5 = e18Var.f(zy7Var4);
            Object objN5 = e18Var.N();
            if (zF5 || objN5 == lz1Var) {
                objN5 = new vu(1, zy7Var4);
                e18Var.k0(objN5);
            }
            zy7 zy7Var6 = (zy7) objN5;
            boolean zF6 = e18Var.f(zy7Var4);
            Object objN6 = e18Var.N();
            if (zF6 || objN6 == lz1Var) {
                objN6 = new vu(2, zy7Var4);
                e18Var.k0(objN6);
            }
            zik.a(chatConversationWithProjectReferenceN, this.I, zy7Var2, strJ0, zy7Var3, this.L, zy7Var5, zy7Var6, (zy7) objN6, iqbVarA, qdfVar, zContains, zy7Var, tkhVar, tkhVar2, null, null, e18Var, 0, 98304);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
