package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class w83 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ w83(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj4 = this.G;
        Object obj5 = this.F;
        int i2 = 1;
        Object obj6 = this.H;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Number) obj3).intValue();
                nwb nwbVar = (nwb) obj6;
                nwb nwbVar2 = (nwb) obj4;
                m83 m83Var = (m83) obj5;
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    boolean zF = e18Var.f(m83Var);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new n4(m83Var, nwbVar2, nwbVar, 2);
                        e18Var.k0(objN);
                    }
                    zy7 zy7Var = (zy7) objN;
                    zy7 zy7Var2 = m83Var.p;
                    Object objN2 = e18Var.N();
                    if (objN2 == lz1Var) {
                        objN2 = new p4(nwbVar2, 7, nwbVar);
                        e18Var.k0(objN2);
                    }
                    iqb iqbVar = e93.a;
                    dpk.b(zy7Var, zy7Var2, (zy7) objN2, gb9.K(fqb.E, 20.0f, 12.0f), e18Var, 3456);
                }
                break;
            case 1:
                ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource) obj;
                String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
                String str = (String) obj3;
                chatMessageActionEvents$ActionSource.getClass();
                strM1057unboximpl.getClass();
                str.getClass();
                gb9.D((l45) obj5, null, null, new mt4((op3) obj4, (w1g) obj6, chatMessageActionEvents$ActionSource, strM1057unboximpl, str, (tp4) null, 25), 3);
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                s2g s2gVar = (s2g) obj6;
                ChatSnapshotSummaryWithChatId chatSnapshotSummaryWithChatId = (ChatSnapshotSummaryWithChatId) obj5;
                ((dxe) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    bz7 bz7Var = (bz7) obj4;
                    boolean zF2 = e18Var2.f(s2gVar) | e18Var2.f(chatSnapshotSummaryWithChatId);
                    Object objN3 = e18Var2.N();
                    if (zF2 || objN3 == lz1Var) {
                        objN3 = new ktf(s2gVar, i2, chatSnapshotSummaryWithChatId);
                        e18Var2.k0(objN3);
                    }
                    etj.i(chatSnapshotSummaryWithChatId, bz7Var, (zy7) objN3, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }
}
