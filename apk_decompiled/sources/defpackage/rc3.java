package defpackage;

import com.anthropic.claude.types.strings.ResearchTaskId;

/* JADX INFO: loaded from: classes2.dex */
public final class rc3 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ sc3 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc3(sc3 sc3Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = sc3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object objA = this.F.a(null, this);
        if (objA == m45.E) {
            return objA;
        }
        String str = (String) objA;
        if (str != null) {
            return ResearchTaskId.m1100boximpl(str);
        }
        return null;
    }
}
