package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;

/* JADX INFO: loaded from: classes.dex */
public final class be1 extends vp4 {
    public BaseEvent E;
    public /* synthetic */ Object F;
    public final /* synthetic */ BaseEvent G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(BaseEvent baseEvent, tp4 tp4Var) {
        super(tp4Var);
        this.G = baseEvent;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.applyBaseEventData$core(null, this);
    }
}
