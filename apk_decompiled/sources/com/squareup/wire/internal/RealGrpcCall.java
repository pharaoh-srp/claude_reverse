package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.WireGrpcClient;
import defpackage.bz7;
import defpackage.e4e;
import defpackage.f4e;
import defpackage.hre;
import defpackage.i92;
import defpackage.iei;
import defpackage.mdj;
import defpackage.nm6;
import defpackage.pqe;
import defpackage.sta;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.ua2;
import defpackage.v82;
import defpackage.wd6;
import defpackage.zni;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okio.ForwardingTimeout;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00028\u0001*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00028\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u0017J\u001b\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R.\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R@\u00109\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0018\u0001002\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0018\u0001008\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u00105¨\u0006;"}, d2 = {"Lcom/squareup/wire/internal/RealGrpcCall;", "", "S", "R", "Lcom/squareup/wire/GrpcCall;", "Lcom/squareup/wire/WireGrpcClient;", "grpcClient", "Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "<init>", "(Lcom/squareup/wire/WireGrpcClient;Lcom/squareup/wire/GrpcMethod;)V", "Lpqe;", "readExactlyOneAndClose", "(Lpqe;)Ljava/lang/Object;", "request", "Lv82;", "initCall", "(Ljava/lang/Object;)Lv82;", "Liei;", "cancel", "()V", "", "isCanceled", "()Z", "execute", "(Ljava/lang/Object;Ltp4;)Ljava/lang/Object;", "executeBlocking", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/squareup/wire/GrpcCall$Callback;", "callback", "enqueue", "(Ljava/lang/Object;Lcom/squareup/wire/GrpcCall$Callback;)V", "isExecuted", "clone", "()Lcom/squareup/wire/GrpcCall;", "Lcom/squareup/wire/WireGrpcClient;", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "call", "Lv82;", "canceled", "Z", "Lokio/Timeout;", "timeout", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "", "", "requestMetadata", "Ljava/util/Map;", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", ExperienceToggle.DEFAULT_PARAM_KEY, "responseMetadata", "getResponseMetadata", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class RealGrpcCall<S, R> implements GrpcCall<S, R> {
    private v82 call;
    private boolean canceled;
    private final WireGrpcClient grpcClient;
    private final GrpcMethod<S, R> method;
    private Map<String, String> requestMetadata;
    private Map<String, String> responseMetadata;
    private final Timeout timeout;

    public RealGrpcCall(WireGrpcClient wireGrpcClient, GrpcMethod<S, R> grpcMethod) {
        wireGrpcClient.getClass();
        grpcMethod.getClass();
        this.grpcClient = wireGrpcClient;
        this.method = grpcMethod;
        Timeout timeout = new Timeout();
        ForwardingTimeout forwardingTimeout = new ForwardingTimeout();
        forwardingTimeout.f = timeout;
        this.timeout = forwardingTimeout;
        this.requestMetadata = nm6.E;
    }

    private final v82 initCall(S request) {
        if (this.call != null) {
            sz6.j("already executed");
            return null;
        }
        v82 v82VarNewCall$wire_grpc_client = this.grpcClient.newCall$wire_grpc_client(getMethod(), getRequestMetadata(), GrpcKt.newRequestBody(this.grpcClient.getMinMessageToCompress(), getMethod().getRequestAdapter(), request), getTimeout());
        this.call = v82VarNewCall$wire_grpc_client;
        if (this.canceled) {
            ((f4e) v82VarNewCall$wire_grpc_client).cancel();
        }
        if (!getTimeout().getA() && getTimeout().getC() == 0) {
            Timeout timeout = getTimeout();
            timeout.getClass();
            e4e e4eVar = ((f4e) v82VarNewCall$wire_grpc_client).J;
            e4eVar.getClass();
            ((ForwardingTimeout) timeout).f = e4eVar;
        }
        return v82VarNewCall$wire_grpc_client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final R readExactlyOneAndClose(pqe pqeVar) {
        try {
            GrpcMessageSource grpcMessageSourceMessageSource = GrpcKt.messageSource(pqeVar, getMethod().getResponseAdapter());
            try {
                try {
                    R r = (R) grpcMessageSourceMessageSource.readExactlyOneAndClose();
                    IOException iOExceptionGrpcResponseToException$default = GrpcKt.grpcResponseToException$default(pqeVar, null, 1, null);
                    if (iOExceptionGrpcResponseToException$default != null) {
                        throw iOExceptionGrpcResponseToException$default;
                    }
                    wd6.Z(grpcMessageSourceMessageSource, null);
                    wd6.Z(pqeVar, null);
                    return r;
                } finally {
                }
            } catch (IOException e) {
                IOException iOExceptionGrpcResponseToException = GrpcKt.grpcResponseToException(pqeVar, e);
                iOExceptionGrpcResponseToException.getClass();
                throw iOExceptionGrpcResponseToException;
            }
        } finally {
        }
    }

    @Override // com.squareup.wire.GrpcCall
    public void cancel() {
        this.canceled = true;
        v82 v82Var = this.call;
        if (v82Var != null) {
            ((f4e) v82Var).cancel();
        }
    }

    @Override // com.squareup.wire.GrpcCall
    public GrpcCall<S, R> clone() {
        RealGrpcCall realGrpcCall = new RealGrpcCall(this.grpcClient, getMethod());
        Timeout timeout = getTimeout();
        Timeout timeout2 = realGrpcCall.getTimeout();
        timeout2.i(timeout.getC(), TimeUnit.NANOSECONDS);
        if (timeout.getA()) {
            timeout2.f(timeout.e());
        }
        realGrpcCall.setRequestMetadata(sta.l0(realGrpcCall.getRequestMetadata(), getRequestMetadata()));
        return realGrpcCall;
    }

    @Override // com.squareup.wire.GrpcCall
    public void enqueue(S request, final GrpcCall.Callback<S, R> callback) {
        request.getClass();
        callback.getClass();
        ((f4e) initCall(request)).d(new i92() { // from class: com.squareup.wire.internal.RealGrpcCall.enqueue.1
            @Override // defpackage.i92
            public void onFailure(v82 call, IOException e) {
                call.getClass();
                e.getClass();
                callback.onFailure(this, e);
            }

            @Override // defpackage.i92
            public void onResponse(v82 call, pqe response) {
                call.getClass();
                response.getClass();
                try {
                    ((RealGrpcCall) this).responseMetadata = sta.p0(response.J);
                    callback.onSuccess(this, (R) this.readExactlyOneAndClose(response));
                } catch (IOException e) {
                    callback.onFailure(this, e);
                }
            }
        });
    }

    @Override // com.squareup.wire.GrpcCall
    public Object execute(S s, tp4<? super R> tp4Var) {
        v82 v82VarInitCall = initCall(s);
        final ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        ua2Var.w(new bz7(this) { // from class: com.squareup.wire.internal.RealGrpcCall$execute$2$1
            final /* synthetic */ RealGrpcCall<S, R> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.bz7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return iei.a;
            }

            public final void invoke(Throwable th) {
                this.this$0.cancel();
            }
        });
        ((f4e) v82VarInitCall).d(new i92() { // from class: com.squareup.wire.internal.RealGrpcCall$execute$2$2
            @Override // defpackage.i92
            public void onFailure(v82 call, IOException e) {
                call.getClass();
                e.getClass();
                ua2Var.resumeWith(new hre(e));
            }

            @Override // defpackage.i92
            public void onResponse(v82 call, pqe response) {
                call.getClass();
                response.getClass();
                try {
                    ((RealGrpcCall) this).responseMetadata = sta.p0(response.J);
                    ua2Var.resumeWith(this.readExactlyOneAndClose(response));
                } catch (IOException e) {
                    ua2Var.resumeWith(new hre(e));
                }
            }
        });
        return ua2Var.r();
    }

    @Override // com.squareup.wire.GrpcCall
    public R executeBlocking(S request) {
        request.getClass();
        pqe pqeVarF = ((f4e) initCall(request)).f();
        this.responseMetadata = sta.p0(pqeVarF.J);
        return readExactlyOneAndClose(pqeVarF);
    }

    @Override // com.squareup.wire.GrpcCall
    public GrpcMethod<S, R> getMethod() {
        return this.method;
    }

    @Override // com.squareup.wire.GrpcCall
    public Map<String, String> getRequestMetadata() {
        return this.requestMetadata;
    }

    @Override // com.squareup.wire.GrpcCall
    public Map<String, String> getResponseMetadata() {
        return this.responseMetadata;
    }

    @Override // com.squareup.wire.GrpcCall
    public Timeout getTimeout() {
        return this.timeout;
    }

    @Override // com.squareup.wire.GrpcCall
    public boolean isCanceled() {
        v82 v82Var;
        return this.canceled || ((v82Var = this.call) != null && ((f4e) v82Var).V);
    }

    @Override // com.squareup.wire.GrpcCall
    public boolean isExecuted() {
        v82 v82Var = this.call;
        if (v82Var != null) {
            return ((f4e) v82Var).K.get();
        }
        return false;
    }

    @Override // com.squareup.wire.GrpcCall
    public void setRequestMetadata(Map<String, String> map) {
        map.getClass();
        this.requestMetadata = map;
    }
}
