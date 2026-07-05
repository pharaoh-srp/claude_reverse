package defpackage;

import anthropic.claude.usercontent.sandbox.wire_format.Request;
import anthropic.claude.usercontent.sandbox.wire_format.Response;
import com.squareup.wire.AnyMessage;
import google.protobuf.Empty;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class oya extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ qya G;
    public final /* synthetic */ Request H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oya(qya qyaVar, Request request, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = qyaVar;
        this.H = request;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Request request = this.H;
        qya qyaVar = this.G;
        switch (i) {
            case 0:
                return new oya(qyaVar, request, tp4Var, 0);
            default:
                return new oya(qyaVar, request, tp4Var, 1);
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
        return ((oya) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Request request = this.H;
        qya qyaVar = this.G;
        m45 m45Var = m45.E;
        int i2 = 1;
        ByteString byteString = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    String request_id = request.getRequest_id();
                    this.F = 1;
                    int i4 = t4f.a0;
                    if (qyaVar.i(new Response(null, request_id, 500, AnyMessage.INSTANCE.pack(new Empty(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0)), null, 17, null), this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    String request_id2 = request.getRequest_id();
                    this.F = 1;
                    int i6 = t4f.a0;
                    if (qyaVar.i(new Response(null, request_id2, 200, AnyMessage.INSTANCE.pack(new Empty(byteString, i2, objArr3 == true ? 1 : 0)), null, 17, null), this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
