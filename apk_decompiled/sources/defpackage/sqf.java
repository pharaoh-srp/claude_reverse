package defpackage;

import com.anthropic.claude.sessions.api.ControlRequestContent;
import com.anthropic.claude.sessions.types.SdkControlRequestEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class sqf extends vp4 {
    public SdkControlRequestEvent E;
    public ControlRequestContent F;
    public String G;
    public /* synthetic */ Object H;
    public final /* synthetic */ jrf I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return jrf.a(this.I, null, this);
    }
}
