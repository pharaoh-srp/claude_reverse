package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.result.ApiResult;

/* JADX INFO: loaded from: classes2.dex */
public final class jy2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ vd3 G;
    public final /* synthetic */ ChatConversationWithProjectReference H;
    public final /* synthetic */ zy7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy2(vd3 vd3Var, ChatConversationWithProjectReference chatConversationWithProjectReference, zy7 zy7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = vd3Var;
        this.H = chatConversationWithProjectReference;
        this.I = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new jy2(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new jy2(this.G, this.H, this.I, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((jy2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.I;
        ChatConversationWithProjectReference chatConversationWithProjectReference = this.H;
        vd3 vd3Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    String strM209getUuidRjYBDck = chatConversationWithProjectReference.m209getUuidRjYBDck();
                    this.F = 1;
                    obj = vd3Var.m(strM209getUuidRjYBDck, null, null, this);
                    if (obj == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof of0) {
                    zy7Var.a();
                    break;
                } else if (!(apiResult instanceof nf0)) {
                    wg6.i();
                    break;
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    String strM209getUuidRjYBDck2 = chatConversationWithProjectReference.m209getUuidRjYBDck();
                    this.F = 1;
                    obj = vd3Var.m(strM209getUuidRjYBDck2, null, null, this);
                    if (obj == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                ApiResult apiResult2 = (ApiResult) obj;
                if (apiResult2 instanceof of0) {
                    zy7Var.a();
                    break;
                } else if (!(apiResult2 instanceof nf0)) {
                    wg6.i();
                    break;
                }
                break;
        }
        return null;
    }
}
