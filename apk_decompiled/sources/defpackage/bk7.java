package defpackage;

import com.anthropic.claude.api.wiggle.PrepareUploadResult;

/* JADX INFO: loaded from: classes2.dex */
public final class bk7 extends vp4 {
    public PrepareUploadResult E;
    public dk7 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ck7 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk7(ck7 ck7Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = ck7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return ck7.a(this.H, null, null, null, this);
    }
}
