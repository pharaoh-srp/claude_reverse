package com.squareup.wire.internal;

import com.squareup.wire.MessageSource;
import com.squareup.wire.ProtoAdapter;
import defpackage.f4e;
import defpackage.i92;
import defpackage.mdj;
import defpackage.pqe;
import defpackage.sta;
import defpackage.v82;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002 !B/\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R!\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/squareup/wire/internal/BlockingMessageSource;", "", "R", "Lcom/squareup/wire/MessageSource;", "Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "grpcCall", "Lcom/squareup/wire/ProtoAdapter;", "responseAdapter", "Lv82;", "call", "<init>", "(Lcom/squareup/wire/internal/RealGrpcStreamingCall;Lcom/squareup/wire/ProtoAdapter;Lv82;)V", "read", "()Ljava/lang/Object;", "Liei;", "close", "()V", "Li92;", "readFromResponseBodyCallback", "()Li92;", "Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "getGrpcCall", "()Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "Lcom/squareup/wire/ProtoAdapter;", "getResponseAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "Lv82;", "getCall", "()Lv82;", "Ljava/util/concurrent/LinkedBlockingDeque;", "queue", "Ljava/util/concurrent/LinkedBlockingDeque;", "Complete", "Failure", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class BlockingMessageSource<R> implements MessageSource<R> {
    private final v82 call;
    private final RealGrpcStreamingCall<?, R> grpcCall;
    private final LinkedBlockingDeque<Object> queue;
    private final ProtoAdapter<R> responseAdapter;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/wire/internal/BlockingMessageSource$Complete;", "", "<init>", "()V", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class Complete {
        public static final Complete INSTANCE = new Complete();

        private Complete() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/squareup/wire/internal/BlockingMessageSource$Failure;", "", "e", "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "(Ljava/io/IOException;)V", "getE", "()Ljava/io/IOException;", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class Failure {
        private final IOException e;

        public Failure(IOException iOException) {
            iOException.getClass();
            this.e = iOException;
        }

        public final IOException getE() {
            return this.e;
        }
    }

    public BlockingMessageSource(RealGrpcStreamingCall<?, R> realGrpcStreamingCall, ProtoAdapter<R> protoAdapter, v82 v82Var) {
        realGrpcStreamingCall.getClass();
        protoAdapter.getClass();
        v82Var.getClass();
        this.grpcCall = realGrpcStreamingCall;
        this.responseAdapter = protoAdapter;
        this.call = v82Var;
        this.queue = new LinkedBlockingDeque<>(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((f4e) this.call).cancel();
    }

    public final v82 getCall() {
        return this.call;
    }

    public final RealGrpcStreamingCall<?, R> getGrpcCall() {
        return this.grpcCall;
    }

    public final ProtoAdapter<R> getResponseAdapter() {
        return this.responseAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.MessageSource
    public R read() throws InterruptedException, IOException {
        R r = (R) this.queue.take();
        if (r instanceof Complete) {
            this.queue.put(r);
            return null;
        }
        if (r instanceof Failure) {
            this.queue.put(r);
            throw ((Failure) r).getE();
        }
        r.getClass();
        return r;
    }

    public final i92 readFromResponseBodyCallback() {
        return new i92(this) { // from class: com.squareup.wire.internal.BlockingMessageSource.readFromResponseBodyCallback.1
            final /* synthetic */ BlockingMessageSource<R> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.i92
            public void onFailure(v82 call, IOException e) throws InterruptedException {
                call.getClass();
                e.getClass();
                ((BlockingMessageSource) this.this$0).queue.put(new Failure(e));
            }

            @Override // defpackage.i92
            public void onResponse(v82 call, pqe response) throws InterruptedException {
                GrpcMessageSource grpcMessageSourceMessageSource;
                call.getClass();
                response.getClass();
                try {
                    this.this$0.getGrpcCall().setResponseMetadata$wire_grpc_client(sta.p0(response.J));
                    BlockingMessageSource<R> blockingMessageSource = this.this$0;
                    try {
                        grpcMessageSourceMessageSource = GrpcKt.messageSource(response, blockingMessageSource.getResponseAdapter());
                    } finally {
                    }
                    try {
                        while (true) {
                            try {
                                Object obj = grpcMessageSourceMessageSource.read();
                                if (obj == null) {
                                    break;
                                } else {
                                    ((BlockingMessageSource) blockingMessageSource).queue.put(obj);
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
                    }
                    IOException iOExceptionGrpcResponseToException$default = GrpcKt.grpcResponseToException$default(response, null, 1, null);
                    if (iOExceptionGrpcResponseToException$default != null) {
                        throw iOExceptionGrpcResponseToException$default;
                    }
                    grpcMessageSourceMessageSource.close();
                    response.close();
                    ((BlockingMessageSource) this.this$0).queue.put(Complete.INSTANCE);
                    return;
                } catch (IOException e) {
                    ((f4e) call).cancel();
                    ((BlockingMessageSource) this.this$0).queue.put(new Failure(e));
                }
            }
        };
    }
}
