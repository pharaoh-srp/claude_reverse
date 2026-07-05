package defpackage;

import com.anthropic.claude.types.strings.SessionId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e55 extends vp4 {
    public String E;
    public String F;
    public String G;
    public List H;
    public /* synthetic */ Object I;
    public final /* synthetic */ i55 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e55(i55 i55Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = i55Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        Object objC = this.J.c(this, null, null, null, null);
        if (objC == m45.E) {
            return objC;
        }
        String str = (String) objC;
        if (str != null) {
            return SessionId.m1114boximpl(str);
        }
        return null;
    }
}
