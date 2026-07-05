package com.squareup.wire;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.internal.RealGrpcClientStreamingCallKt;
import com.squareup.wire.internal.RealGrpcServerStreamingCallKt;
import defpackage.bz7;
import defpackage.gb9;
import defpackage.gh2;
import defpackage.im6;
import defpackage.mdj;
import defpackage.nm6;
import defpackage.pz7;
import defpackage.rz7;
import defpackage.sta;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.xh6;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import okio.ByteString;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001ae\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u000024\u0010\u0004\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aY\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002(\u0010\u0004\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a_\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002.\u0010\u0004\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\b\b\u0000\u0010\u001b*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a)\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\b\b\u0000\u0010\u001b*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "S", "R", "Lkotlin/Function1;", "function", "Lcom/squareup/wire/GrpcCall;", "grpcCall", "(Lbz7;)Lcom/squareup/wire/GrpcCall;", "GrpcCall", "Lkotlin/Function3;", "Ld6e;", "Lmkf;", "Ltp4;", "Liei;", "Lcom/squareup/wire/GrpcStreamingCall;", "grpcStreamingCall", "(Lrz7;)Lcom/squareup/wire/GrpcStreamingCall;", "GrpcStreamingCall", "Lkotlin/Function2;", "Lcom/squareup/wire/GrpcClientStreamingCall;", "grpcClientStreamingCall", "(Lpz7;)Lcom/squareup/wire/GrpcClientStreamingCall;", "GrpcClientStreamingCall", "Lcom/squareup/wire/GrpcServerStreamingCall;", "grpcServerStreamingCall", "(Lrz7;)Lcom/squareup/wire/GrpcServerStreamingCall;", "GrpcServerStreamingCall", "E", "Lgh2;", "Lcom/squareup/wire/MessageSource;", "toMessageSource", "(Lgh2;)Lcom/squareup/wire/MessageSource;", "Lcom/squareup/wire/MessageSink;", "toMessageSink", "(Lgh2;)Lcom/squareup/wire/MessageSink;", "wire-grpc-client"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class GrpcCalls {
    public static final <S, R> GrpcCall<S, R> grpcCall(final bz7 bz7Var) {
        bz7Var.getClass();
        return new GrpcCall<S, R>() { // from class: com.squareup.wire.GrpcCalls$GrpcCall$1
            private final Map<String, String> responseMetadata;
            private AtomicBoolean canceled = new AtomicBoolean();
            private AtomicBoolean executed = new AtomicBoolean();
            private Map<String, String> requestMetadata = nm6.E;
            private final Timeout timeout = Timeout.e;

            public static /* synthetic */ void getMethod$annotations() {
            }

            @Override // com.squareup.wire.GrpcCall
            public void cancel() {
                this.canceled.set(true);
            }

            @Override // com.squareup.wire.GrpcCall
            public GrpcCall<S, R> clone() {
                GrpcCall<S, R> grpcCall = GrpcCalls.grpcCall(bz7Var);
                grpcCall.setRequestMetadata(sta.l0(grpcCall.getRequestMetadata(), getRequestMetadata()));
                return grpcCall;
            }

            @Override // com.squareup.wire.GrpcCall
            public void enqueue(S request, GrpcCall.Callback<S, R> callback) {
                request.getClass();
                callback.getClass();
                try {
                    callback.onSuccess(this, executeBlocking(request));
                } catch (IOException e) {
                    callback.onFailure(this, e);
                }
            }

            @Override // com.squareup.wire.GrpcCall
            public Object execute(S s, tp4<? super R> tp4Var) {
                return executeBlocking(s);
            }

            @Override // com.squareup.wire.GrpcCall
            public R executeBlocking(S request) throws IOException {
                request.getClass();
                if (!this.executed.compareAndSet(false, true)) {
                    sz6.j("already executed");
                    return null;
                }
                if (this.canceled.get()) {
                    xh6.c("canceled");
                    return null;
                }
                try {
                    return (R) bz7Var.invoke(request);
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException("call failed: " + e2, e2);
                }
            }

            @Override // com.squareup.wire.GrpcCall
            public GrpcMethod<S, R> getMethod() {
                ProtoAdapter<ByteString> protoAdapter = ProtoAdapter.BYTES;
                return new GrpcMethod<>("/wire/AnonymousEndpoint", protoAdapter, protoAdapter);
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
                return this.canceled.get();
            }

            @Override // com.squareup.wire.GrpcCall
            public boolean isExecuted() {
                return this.executed.get();
            }

            @Override // com.squareup.wire.GrpcCall
            public void setRequestMetadata(Map<String, String> map) {
                map.getClass();
                this.requestMetadata = map;
            }
        };
    }

    public static final <S, R> GrpcClientStreamingCall<S, R> grpcClientStreamingCall(pz7 pz7Var) {
        pz7Var.getClass();
        return RealGrpcClientStreamingCallKt.asGrpcClientStreamingCall(grpcStreamingCall(new GrpcCalls$GrpcClientStreamingCall$1(pz7Var, null)));
    }

    public static final <S, R> GrpcServerStreamingCall<S, R> grpcServerStreamingCall(rz7 rz7Var) {
        rz7Var.getClass();
        return RealGrpcServerStreamingCallKt.asGrpcServerStreamingCall(grpcStreamingCall(new GrpcCalls$GrpcServerStreamingCall$1(rz7Var, null)));
    }

    public static final <S, R> GrpcStreamingCall<S, R> grpcStreamingCall(rz7 rz7Var) {
        rz7Var.getClass();
        return new GrpcCalls$GrpcStreamingCall$1(rz7Var);
    }

    public static final <E> MessageSink<E> toMessageSink(final gh2 gh2Var) {
        gh2Var.getClass();
        return new MessageSink<E>() { // from class: com.squareup.wire.GrpcCalls.toMessageSink.1
            @Override // com.squareup.wire.MessageSink
            public void cancel() {
                gh2 gh2Var2 = gh2Var;
                gh2Var2.getClass();
                gh2Var2.d(null);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                gh2Var.m(null);
            }

            @Override // com.squareup.wire.MessageSink
            public void write(E message) {
                message.getClass();
                gb9.U(new GrpcCalls$toMessageSink$1$write$1(gh2Var, message, null));
            }
        };
    }

    public static final <E> MessageSource<E> toMessageSource(final gh2 gh2Var) {
        gh2Var.getClass();
        return new MessageSource<E>() { // from class: com.squareup.wire.GrpcCalls.toMessageSource.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                gh2Var.d(null);
            }

            @Override // com.squareup.wire.MessageSource
            public E read() {
                return (E) gb9.V(im6.E, new GrpcCalls$toMessageSource$1$read$1(gh2Var, null));
            }
        };
    }
}
