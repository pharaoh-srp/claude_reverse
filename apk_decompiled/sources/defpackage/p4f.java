package defpackage;

import anthropic.claude.usercontent.sandbox.wire_format.Request;
import anthropic.claude.usercontent.sandbox.wire_format.Response;
import com.squareup.wire.AnyMessage;
import google.protobuf.Empty;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class p4f extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ t4f G;
    public final /* synthetic */ Request H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4f(t4f t4fVar, Request request, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = t4fVar;
        this.H = request;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Request request = this.H;
        t4f t4fVar = this.G;
        switch (i) {
            case 0:
                return new p4f(t4fVar, request, tp4Var, 0);
            default:
                return new p4f(t4fVar, request, tp4Var, 1);
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
        return ((p4f) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        Request request = this.H;
        m45 m45Var = m45.E;
        int i2 = 1;
        t4f t4fVar = this.G;
        ByteString byteString = null;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    String request_id = request.getRequest_id();
                    this.F = 1;
                    if (t4fVar.i(new Response(null, request_id, 500, AnyMessage.INSTANCE.pack(new Empty(byteString, i2, objArr == true ? 1 : 0)), null, 17, null), this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return iei.a;
            default:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                String json = t4fVar.G.a(Request.class).toJson(request);
                json.getClass();
                this.F = 1;
                Object objF = t4f.f(t4fVar, json, this);
                return objF == m45Var ? m45Var : objF;
        }
    }
}
