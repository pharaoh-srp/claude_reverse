package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class cb3 extends vp4 {
    public ApiResult E;
    public z9e F;
    public Iterator G;
    public /* synthetic */ Object H;
    public final /* synthetic */ db3 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb3(db3 db3Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = db3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return db3.O(this.I, this);
    }
}
