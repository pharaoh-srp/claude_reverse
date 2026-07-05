package defpackage;

import com.anthropic.claude.chat.queue.d;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j0e extends vp4 {
    public bgj E;
    public fb6 F;
    public String G;
    public List H;
    public String I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ d L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0e(d dVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.d(null, null, 0, null, this);
    }
}
