package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseShown;

/* JADX INFO: loaded from: classes2.dex */
public final class w55 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w55(qi3 qi3Var, String str, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = qi3Var;
        this.G = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new w55(this.F, this.G, tp4Var, 0);
            default:
                return new w55(this.F, this.G, tp4Var, 1);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((w55) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((w55) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                qi3Var.e(new MobileAppUseEvents$MobileAppUseShown(str), MobileAppUseEvents$MobileAppUseShown.Companion.serializer());
                break;
            default:
                sf5.h0(obj);
                qi3Var.e(new MobileAppUseEvents$MobileAppUseShown(str), MobileAppUseEvents$MobileAppUseShown.Companion.serializer());
                break;
        }
        return ieiVar;
    }
}
