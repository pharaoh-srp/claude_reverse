package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import defpackage.gb9;
import defpackage.i92;
import defpackage.ide;
import defpackage.mdj;
import defpackage.mkf;
import defpackage.nai;
import defpackage.p8b;
import defpackage.pqe;
import defpackage.rqe;
import defpackage.sta;
import defpackage.tie;
import defpackage.tp4;
import defpackage.v82;
import defpackage.vp4;
import defpackage.wn5;
import io.sentry.w6;
import java.io.IOException;
import kotlin.Metadata;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aJ\u0010\u001d\u001a\u00020\u001c\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\b\b\u0000\u0010\u0012*\u00020\u0000*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u001c*\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%\u001a-\u0010)\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'*\u00020\u001f2\u0010\b\u0002\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0000¢\u0006\u0004\b)\u0010*\"\u001a\u0010,\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"", "S", "", "minMessageToCompress", "Lcom/squareup/wire/ProtoAdapter;", "requestAdapter", "onlyMessage", "Ltie;", "newRequestBody", "(JLcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)Ltie;", "Lcom/squareup/wire/internal/PipeDuplexRequestBody;", "newDuplexRequestBody", "()Lcom/squareup/wire/internal/PipeDuplexRequestBody;", "Lv82;", "callForCancel", "Lcom/squareup/wire/internal/GrpcMessageSink;", "messageSink", "(Lcom/squareup/wire/internal/PipeDuplexRequestBody;JLcom/squareup/wire/ProtoAdapter;Lv82;)Lcom/squareup/wire/internal/GrpcMessageSink;", "R", "Lmkf;", "Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "grpcCall", "responseAdapter", "Li92;", "readFromResponseBodyCallback", "(Lmkf;Lcom/squareup/wire/internal/RealGrpcStreamingCall;Lcom/squareup/wire/ProtoAdapter;)Li92;", "Ld6e;", "requestBody", "Liei;", "writeToRequestBody", "(Ld6e;Lcom/squareup/wire/internal/PipeDuplexRequestBody;JLcom/squareup/wire/ProtoAdapter;Lv82;Ltp4;)Ljava/lang/Object;", "Lpqe;", "protoAdapter", "Lcom/squareup/wire/internal/GrpcMessageSource;", "messageSource", "(Lpqe;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/internal/GrpcMessageSource;", "checkGrpcResponse", "(Lpqe;)V", "Ljava/io/IOException;", "Lokio/IOException;", "suppressed", "grpcResponseToException", "(Lpqe;Ljava/io/IOException;)Ljava/io/IOException;", "Lp8b;", "APPLICATION_GRPC_MEDIA_TYPE", "Lp8b;", "getAPPLICATION_GRPC_MEDIA_TYPE", "()Lp8b;", "wire-grpc-client"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class GrpcKt {
    private static final p8b APPLICATION_GRPC_MEDIA_TYPE;

    /* JADX INFO: renamed from: com.squareup.wire.internal.GrpcKt$writeToRequestBody$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = mdj.f)
    @wn5(c = "com.squareup.wire.internal.GrpcKt", f = "grpc.kt", l = {250}, m = "writeToRequestBody")
    public static final class C00221<S> extends vp4 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C00221(tp4<? super C00221> tp4Var) {
            super(tp4Var);
        }

        @Override // defpackage.vd1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcKt.writeToRequestBody(null, null, 0L, null, null, this);
        }
    }

    static {
        ide ideVar = p8b.e;
        APPLICATION_GRPC_MEDIA_TYPE = nai.D("application/grpc");
    }

    private static final void checkGrpcResponse(pqe pqeVar) throws IOException {
        rqe rqeVar = pqeVar.K;
        rqeVar.getClass();
        p8b p8bVarE = rqeVar.e();
        int i = pqeVar.H;
        if (i == 200 && p8bVarE != null) {
            String str = p8bVarE.c;
            if (p8bVarE.b.equals("application") && (str.equals("grpc") || str.equals("grpc+proto"))) {
                return;
            }
        }
        throw new IOException("expected gRPC but was HTTP status=" + i + ", content-type=" + p8bVarE);
    }

    public static final p8b getAPPLICATION_GRPC_MEDIA_TYPE() {
        return APPLICATION_GRPC_MEDIA_TYPE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.IOException grpcResponseToException(defpackage.pqe r12, java.io.IOException r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.internal.GrpcKt.grpcResponseToException(pqe, java.io.IOException):java.io.IOException");
    }

    public static /* synthetic */ IOException grpcResponseToException$default(pqe pqeVar, IOException iOException, int i, Object obj) {
        if ((i & 1) != 0) {
            iOException = null;
        }
        return grpcResponseToException(pqeVar, iOException);
    }

    public static final <S> GrpcMessageSink<S> messageSink(PipeDuplexRequestBody pipeDuplexRequestBody, long j, ProtoAdapter<S> protoAdapter, v82 v82Var) {
        pipeDuplexRequestBody.getClass();
        protoAdapter.getClass();
        v82Var.getClass();
        return new GrpcMessageSink<>(pipeDuplexRequestBody.createSink(), j, protoAdapter, PlatformKt.toWireCall(v82Var), "gzip");
    }

    public static final <R> GrpcMessageSource<R> messageSource(pqe pqeVar, ProtoAdapter<R> protoAdapter) throws IOException {
        pqeVar.getClass();
        protoAdapter.getClass();
        checkGrpcResponse(pqeVar);
        String strA = pqeVar.J.a("grpc-encoding");
        if (strA == null) {
            strA = null;
        }
        rqe rqeVar = pqeVar.K;
        rqeVar.getClass();
        return new GrpcMessageSource<>(rqeVar.G0(), protoAdapter, strA);
    }

    public static final PipeDuplexRequestBody newDuplexRequestBody() {
        return new PipeDuplexRequestBody(APPLICATION_GRPC_MEDIA_TYPE, w6.MAX_EVENT_SIZE_BYTES);
    }

    public static final <S> tie newRequestBody(final long j, final ProtoAdapter<S> protoAdapter, final S s) {
        protoAdapter.getClass();
        s.getClass();
        return new tie() { // from class: com.squareup.wire.internal.GrpcKt.newRequestBody.1
            @Override // defpackage.tie
            /* JADX INFO: renamed from: contentType */
            public p8b getContentType() {
                return GrpcKt.getAPPLICATION_GRPC_MEDIA_TYPE();
            }

            @Override // defpackage.tie
            public void writeTo(BufferedSink sink) throws IOException {
                sink.getClass();
                GrpcMessageSink grpcMessageSink = new GrpcMessageSink(sink, j, protoAdapter, null, "gzip");
                try {
                    grpcMessageSink.write(s);
                    grpcMessageSink.close();
                } finally {
                }
            }
        };
    }

    public static final <R> i92 readFromResponseBodyCallback(final mkf mkfVar, final RealGrpcStreamingCall<?, R> realGrpcStreamingCall, final ProtoAdapter<R> protoAdapter) {
        mkfVar.getClass();
        realGrpcStreamingCall.getClass();
        protoAdapter.getClass();
        return new i92() { // from class: com.squareup.wire.internal.GrpcKt.readFromResponseBodyCallback.1
            @Override // defpackage.i92
            public void onFailure(v82 call, IOException e) {
                call.getClass();
                e.getClass();
                mkfVar.m(e);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // defpackage.i92
            public void onResponse(v82 call, pqe response) {
                call.getClass();
                response.getClass();
                realGrpcStreamingCall.setResponseMetadata$wire_grpc_client(sta.p0(response.J));
                gb9.U(new GrpcKt$readFromResponseBodyCallback$1$onResponse$1(response, protoAdapter, mkfVar, null));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #5 {all -> 0x0097, blocks: (B:26:0x0082, B:28:0x008b, B:22:0x006b), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a4, blocks: (B:43:0x00af, B:44:0x00b2, B:32:0x0099, B:41:0x00ad), top: B:65:0x001e, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [v82] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.squareup.wire.internal.GrpcMessageSink] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.squareup.wire.internal.GrpcMessageSink] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.squareup.wire.internal.PipeDuplexRequestBody] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [d6e] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.squareup.wire.ProtoAdapter, com.squareup.wire.ProtoAdapter<S>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007f -> B:72:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> java.lang.Object writeToRequestBody(defpackage.d6e r5, com.squareup.wire.internal.PipeDuplexRequestBody r6, long r7, com.squareup.wire.ProtoAdapter<S> r9, defpackage.v82 r10, defpackage.tp4<? super defpackage.iei> r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.internal.GrpcKt.writeToRequestBody(d6e, com.squareup.wire.internal.PipeDuplexRequestBody, long, com.squareup.wire.ProtoAdapter, v82, tp4):java.lang.Object");
    }
}
