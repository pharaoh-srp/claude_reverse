package defpackage;

import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ogf extends m08 implements zy7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogf(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = 1;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((r4g) this.receiver).a();
                break;
            case 1:
                qnd qndVar = (qnd) this.receiver;
                String strO = qndVar.O();
                mp4 mp4Var = qndVar.a;
                tp4 tp4Var2 = null;
                if (!bsg.I0(strO)) {
                    String strO2 = qndVar.O();
                    if (x44.r(strO2, qndVar.e)) {
                        gb9.D(mp4Var, null, null, new o41(qndVar, strO2, qndVar.f, tp4Var2, 6), 3);
                    }
                } else {
                    gb9.D(mp4Var, null, null, new pnd(qndVar, tp4Var2, i2), 3);
                }
                break;
            case 2:
                mif mifVar = (mif) this.receiver;
                mifVar.b();
                mifVar.n();
                break;
            case 3:
                ((mif) this.receiver).p();
                break;
            case 4:
                w1g w1gVar = (w1g) this.receiver;
                gb9.D(w1gVar.a, null, null, new o6e(w1gVar, tp4Var, 18), 3);
                break;
            case 5:
                s2g s2gVar = (s2g) this.receiver;
                ChatSnapshotSummaryWithChatId chatSnapshotSummaryWithChatIdP = s2gVar.P();
                if (chatSnapshotSummaryWithChatIdP != null) {
                    s2gVar.l.remove(chatSnapshotSummaryWithChatIdP);
                }
                s2gVar.m.setValue(null);
                break;
            case 6:
                ((s2g) this.receiver).m.setValue(null);
                break;
            case 7:
                aah aahVar = (aah) this.receiver;
                if (!aahVar.h) {
                    gb9.D(aahVar.a, null, null, new z9h(aahVar, tp4Var, i2), 3);
                }
                break;
            case 8:
                aah aahVar2 = (aah) this.receiver;
                if (!aahVar2.h && ((Boolean) aahVar2.g.getValue()).booleanValue()) {
                    gb9.D(aahVar2.a, null, null, new z9h(aahVar2, tp4Var, 0), 3);
                }
                break;
            case 9:
                zli zliVar = (zli) this.receiver;
                zliVar.g.setValue(Boolean.TRUE);
                gb9.D(zliVar.a, null, null, new yli(zliVar, tp4Var, i2), 3);
                break;
            default:
                fti ftiVar = (fti) this.receiver;
                gb9.D(ftiVar.a, null, null, new v2h(ftiVar, tp4Var, 9), 3);
                break;
        }
        return ieiVar;
    }
}
