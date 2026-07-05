package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$UpsellButtonTapped;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bs1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ bs1(qi3 qi3Var, String str, zy7 zy7Var, int i) {
        this.E = i;
        this.F = qi3Var;
        this.G = str;
        this.H = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.H;
        String str = this.G;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                qi3Var.e(new ProUpsellEvents$UpsellButtonTapped(str), ProUpsellEvents$UpsellButtonTapped.Companion.serializer());
                zy7Var.a();
                break;
            default:
                qi3Var.e(new ProUpsellEvents$UpsellButtonTapped(str), ProUpsellEvents$UpsellButtonTapped.Companion.serializer());
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
