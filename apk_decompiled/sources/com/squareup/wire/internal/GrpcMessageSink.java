package com.squareup.wire.internal;

import com.squareup.wire.MessageSink;
import com.squareup.wire.ProtoAdapter;
import defpackage.mdj;
import defpackage.mwa;
import defpackage.sz6;
import defpackage.x44;
import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/squareup/wire/internal/GrpcMessageSink;", "", "T", "Lcom/squareup/wire/MessageSink;", "Lokio/BufferedSink;", "sink", "", "minMessageToCompress", "Lcom/squareup/wire/ProtoAdapter;", "messageAdapter", "Lcom/squareup/wire/internal/Call;", "callForCancel", "", "grpcEncoding", "<init>", "(Lokio/BufferedSink;JLcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/internal/Call;Ljava/lang/String;)V", "message", "Liei;", "write", "(Ljava/lang/Object;)V", "cancel", "()V", "close", "Lokio/BufferedSink;", "J", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/internal/Call;", "Ljava/lang/String;", "", "closed", "Z", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class GrpcMessageSink<T> implements MessageSink<T> {
    private final Call callForCancel;
    private boolean closed;
    private final String grpcEncoding;
    private final ProtoAdapter<T> messageAdapter;
    private final long minMessageToCompress;
    private final BufferedSink sink;

    public GrpcMessageSink(BufferedSink bufferedSink, long j, ProtoAdapter<T> protoAdapter, Call call, String str) {
        bufferedSink.getClass();
        protoAdapter.getClass();
        str.getClass();
        this.sink = bufferedSink;
        this.minMessageToCompress = j;
        this.messageAdapter = protoAdapter;
        this.callForCancel = call;
        this.grpcEncoding = str;
    }

    @Override // com.squareup.wire.MessageSink
    public void cancel() {
        if (this.closed) {
            sz6.j("closed");
            return;
        }
        Call call = this.callForCancel;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.sink.close();
    }

    @Override // com.squareup.wire.MessageSink
    public void write(T message) {
        message.getClass();
        if (this.closed) {
            sz6.j("closed");
            return;
        }
        Buffer buffer = new Buffer();
        this.messageAdapter.encode(buffer, message);
        if (x44.r(this.grpcEncoding, "identity") || buffer.F < this.minMessageToCompress) {
            this.sink.writeByte(0);
            this.sink.writeInt((int) buffer.F);
            this.sink.f0(buffer);
        } else {
            Buffer buffer2 = new Buffer();
            BufferedSink bufferedSinkEncode = GrpcEncoderKt.toGrpcEncoder(this.grpcEncoding).encode(buffer2);
            try {
                bufferedSinkEncode.f0(buffer);
                bufferedSinkEncode.close();
                this.sink.writeByte(1);
                this.sink.writeInt((int) buffer2.F);
                this.sink.f0(buffer2);
            } catch (Throwable th) {
                try {
                    bufferedSinkEncode.close();
                } catch (Throwable th2) {
                    mwa.p(th, th2);
                }
                throw th;
            }
        }
        this.sink.flush();
    }
}
