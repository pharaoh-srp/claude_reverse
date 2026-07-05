package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hz2 extends vp4 {
    public String E;
    public List F;
    public poj G;
    public Set H;
    public m11 I;
    public bz7 J;
    public nre K;
    public List L;
    public bae M;
    public bae N;
    public Iterator O;
    public ContentBlock P;
    public Object Q;
    public String R;
    public Object S;
    public List T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ nz2 a0;
    public int b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz2(nz2 nz2Var, vp4 vp4Var) {
        super(vp4Var);
        this.a0 = nz2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.b0 |= Integer.MIN_VALUE;
        return this.a0.b(null, null, false, null, false, false, null, null, null, this);
    }
}
