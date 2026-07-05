package com.squareup.wire.internal;

import defpackage.mdj;
import defpackage.mq5;
import kotlin.Metadata;
import okio.BufferedSink;
import okio.GzipSink;
import okio.RealBufferedSink;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/squareup/wire/internal/GrpcEncoder;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "encode", "Lokio/BufferedSink;", "sink", "IdentityGrpcEncoder", "GzipGrpcEncoder", "Lcom/squareup/wire/internal/GrpcEncoder$GzipGrpcEncoder;", "Lcom/squareup/wire/internal/GrpcEncoder$IdentityGrpcEncoder;", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public abstract class GrpcEncoder {
    private final String name;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/squareup/wire/internal/GrpcEncoder$GzipGrpcEncoder;", "Lcom/squareup/wire/internal/GrpcEncoder;", "<init>", "()V", "encode", "Lokio/BufferedSink;", "sink", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class GzipGrpcEncoder extends GrpcEncoder {
        public static final GzipGrpcEncoder INSTANCE = new GzipGrpcEncoder();

        private GzipGrpcEncoder() {
            super("gzip", null);
        }

        @Override // com.squareup.wire.internal.GrpcEncoder
        public BufferedSink encode(BufferedSink sink) {
            sink.getClass();
            return new RealBufferedSink(new GzipSink(sink));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/squareup/wire/internal/GrpcEncoder$IdentityGrpcEncoder;", "Lcom/squareup/wire/internal/GrpcEncoder;", "<init>", "()V", "encode", "Lokio/BufferedSink;", "sink", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class IdentityGrpcEncoder extends GrpcEncoder {
        public static final IdentityGrpcEncoder INSTANCE = new IdentityGrpcEncoder();

        private IdentityGrpcEncoder() {
            super("identity", null);
        }

        @Override // com.squareup.wire.internal.GrpcEncoder
        public BufferedSink encode(BufferedSink sink) {
            sink.getClass();
            return sink;
        }
    }

    private GrpcEncoder(String str) {
        this.name = str;
    }

    public abstract BufferedSink encode(BufferedSink sink);

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ GrpcEncoder(String str, mq5 mq5Var) {
        this(str);
    }
}
