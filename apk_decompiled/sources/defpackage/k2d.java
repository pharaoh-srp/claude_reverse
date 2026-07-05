package defpackage;

import com.anthropic.claude.wear.PhoneWearableListenerService;

/* JADX INFO: loaded from: classes3.dex */
public final class k2d extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ PhoneWearableListenerService F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2d(PhoneWearableListenerService phoneWearableListenerService, vp4 vp4Var) {
        super(vp4Var);
        this.F = phoneWearableListenerService;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return PhoneWearableListenerService.g(this.F, null, null, null, this);
    }
}
