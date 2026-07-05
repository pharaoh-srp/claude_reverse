package defpackage;

import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes2.dex */
public final class cca extends vp4 {
    public String E;
    public dae F;
    public /* synthetic */ Object G;
    public final /* synthetic */ fca H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cca(fca fcaVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = fcaVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        Object objO = fca.O(this.H, null, this);
        if (objO == m45.E) {
            return objO;
        }
        String str = (String) objO;
        if (str != null) {
            return OrganizationId.m1065boximpl(str);
        }
        return null;
    }
}
