package defpackage;

import com.anthropic.claude.bell.tts.f;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n2h extends vp4 {
    public String E;
    public bz7 F;
    public List G;
    public List H;
    public dae I;
    public Object J;
    public dae K;
    public dae L;
    public cae M;
    public dae N;
    public i2h O;
    public String P;
    public Serializable Q;
    public Object R;
    public int S;
    public /* synthetic */ Object T;
    public final /* synthetic */ f U;
    public int V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2h(f fVar, vp4 vp4Var) {
        super(vp4Var);
        this.U = fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.T = obj;
        this.V |= Integer.MIN_VALUE;
        return this.U.h(null, null, null, this);
    }
}
