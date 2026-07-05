package com.squareup.wire.internal;

import com.squareup.wire.MessageSource;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.GrpcDecoder;
import defpackage.grc;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.mwa;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/squareup/wire/internal/GrpcMessageSource;", "", "T", "Lcom/squareup/wire/MessageSource;", "Lokio/BufferedSource;", "source", "Lcom/squareup/wire/ProtoAdapter;", "messageAdapter", "", "grpcEncoding", "<init>", "(Lokio/BufferedSource;Lcom/squareup/wire/ProtoAdapter;Ljava/lang/String;)V", "read", "()Ljava/lang/Object;", "readExactlyOneAndClose", "Liei;", "close", "()V", "Lokio/BufferedSource;", "Lcom/squareup/wire/ProtoAdapter;", "Ljava/lang/String;", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class GrpcMessageSource<T> implements MessageSource<T> {
    private final String grpcEncoding;
    private final ProtoAdapter<T> messageAdapter;
    private final BufferedSource source;

    public GrpcMessageSource(BufferedSource bufferedSource, ProtoAdapter<T> protoAdapter, String str) {
        bufferedSource.getClass();
        protoAdapter.getClass();
        this.source = bufferedSource;
        this.messageAdapter = protoAdapter;
        this.grpcEncoding = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    @Override // com.squareup.wire.MessageSource
    public T read() throws IOException {
        GrpcDecoder grpcDecoding;
        if (this.source.F()) {
            return null;
        }
        byte b = this.source.readByte();
        if (b == 0) {
            grpcDecoding = GrpcDecoder.IdentityGrpcDecoder.INSTANCE;
        } else {
            if (b != 1) {
                throw new ProtocolException(grc.p(b, "unexpected compressed-flag: "));
            }
            String str = this.grpcEncoding;
            if (str == null || (grpcDecoding = GrpcDecoderKt.toGrpcDecoding(str)) == null) {
                mr9.s("message is encoded but message-encoding header was omitted");
                return null;
            }
        }
        long j = ((long) this.source.readInt()) & 4294967295L;
        Buffer buffer = new Buffer();
        buffer.x0(this.source, j);
        RealBufferedSource realBufferedSourceC = Okio.c(grpcDecoding.decode(buffer));
        try {
            T tDecode = this.messageAdapter.decode(realBufferedSourceC);
            realBufferedSourceC.close();
            return tDecode;
        } catch (Throwable th) {
            try {
                realBufferedSourceC.close();
            } catch (Throwable th2) {
                mwa.p(th, th2);
            }
            throw th;
        }
    }

    public final T readExactlyOneAndClose() throws IOException {
        try {
            T t = read();
            if (t == null) {
                throw new ProtocolException("expected 1 message but got none");
            }
            if (read() != null) {
                throw new ProtocolException("expected 1 message but got multiple");
            }
            close();
            return t;
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                mwa.p(th, th2);
            }
            throw th;
        }
    }

    public /* synthetic */ GrpcMessageSource(BufferedSource bufferedSource, ProtoAdapter protoAdapter, String str, int i, mq5 mq5Var) {
        this(bufferedSource, protoAdapter, (i & 4) != 0 ? null : str);
    }
}
