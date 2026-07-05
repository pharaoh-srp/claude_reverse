package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes3.dex */
public final class yb4 implements sz7 {
    public static final yb4 F = new yb4(0);
    public static final yb4 G = new yb4(1);
    public static final yb4 H = new yb4(2);
    public final /* synthetic */ int E;

    public /* synthetic */ yb4(int i) {
        this.E = i;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        byte b = 0;
        switch (i) {
            case 0:
                long j = ((d54) obj).a;
                pz7 pz7Var = (pz7) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Number) obj4).intValue();
                pz7Var.getClass();
                int i2 = (iIntValue & 6) == 0 ? (((e18) ld4Var).e(j) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= ((e18) ld4Var).h(pz7Var) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
                    e18Var.T();
                } else {
                    j8.c(sq6.m(j, on4.a), fd9.q0(-2003013541, new dt(pz7Var, 3, b), e18Var), e18Var, 56);
                }
                break;
            case 1:
                long j2 = ((d54) obj).a;
                pz7 pz7Var2 = (pz7) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                pz7Var2.getClass();
                int i3 = (iIntValue2 & 6) == 0 ? (((e18) ld4Var2).e(j2) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= ((e18) ld4Var2).h(pz7Var2) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    j8.c(sq6.m(j2, bte.b), fd9.q0(-824975258, new dt(pz7Var2, 5, b), e18Var2), e18Var2, 56);
                }
                break;
            default:
                String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
                ((Number) obj3).intValue();
                ((ChatMessageActionEvents$ActionSource) obj).getClass();
                strM1057unboximpl.getClass();
                break;
        }
        return ieiVar;
    }
}
