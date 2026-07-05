package defpackage;

import com.anthropic.claude.mcpapps.b;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class xwa extends vp4 {
    public String E;
    public String F;
    public JsonObject G;
    public /* synthetic */ Object H;
    public final /* synthetic */ b I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwa(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return b.c(this.I, null, null, this);
    }
}
