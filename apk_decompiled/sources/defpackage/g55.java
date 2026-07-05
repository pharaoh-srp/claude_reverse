package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final class g55 extends vp4 {
    public d55 E;
    public String F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ i55 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g55(i55 i55Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = i55Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        Object objA = i55.a(this.I, null, null, null, null, null, this);
        return objA == m45.E ? objA : SessionId.m1114boximpl((String) objA);
    }
}
