package defpackage;

import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;

/* JADX INFO: loaded from: classes2.dex */
public final class kz2 extends vp4 {
    public ToolUseBlock E;
    public ParsedContentBlockId F;
    public boolean G;
    public /* synthetic */ Object H;
    public final /* synthetic */ nz2 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz2(nz2 nz2Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = nz2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.f(null, null, false, this);
    }
}
