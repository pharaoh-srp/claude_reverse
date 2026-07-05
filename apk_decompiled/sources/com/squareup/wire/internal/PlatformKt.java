package com.squareup.wire.internal;

import com.squareup.wire.GrpcResponse;
import defpackage.blc;
import defpackage.f4e;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.u0h;
import defpackage.v82;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import okio.GzipSink;
import okio.GzipSource;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\u0005\u001a\u00020\u0007*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u0005\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lv82;", "Lcom/squareup/wire/internal/Call;", "toWireCall", "(Lv82;)Lcom/squareup/wire/internal/Call;", "Lokio/Sink;", "asGzip", "(Lokio/Sink;)Lokio/Sink;", "Lokio/Source;", "(Lokio/Source;)Lokio/Source;", "", "other", "Liei;", "addSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Ljava/lang/reflect/Method;", "AddSuppressedMethod$delegate", "Lkw9;", "getAddSuppressedMethod", "()Ljava/lang/reflect/Method;", "AddSuppressedMethod", "wire-grpc-client"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class PlatformKt {
    private static final kw9 AddSuppressedMethod$delegate = new u0h(new blc(24));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method AddSuppressedMethod_delegate$lambda$0() {
        try {
            return Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void addSuppressed(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        Method addSuppressedMethod = getAddSuppressedMethod();
        if (addSuppressedMethod != null) {
            addSuppressedMethod.invoke(th, th2);
        }
    }

    public static final Sink asGzip(Sink sink) {
        sink.getClass();
        return new GzipSink(sink);
    }

    private static final Method getAddSuppressedMethod() {
        return (Method) AddSuppressedMethod$delegate.getValue();
    }

    public static final Call toWireCall(final v82 v82Var) {
        v82Var.getClass();
        return new Call() { // from class: com.squareup.wire.internal.PlatformKt.toWireCall.1
            @Override // com.squareup.wire.internal.Call
            public void cancel() {
                ((f4e) v82Var).cancel();
            }

            @Override // com.squareup.wire.internal.Call
            public GrpcResponse execute() {
                return new GrpcResponse(((f4e) v82Var).f());
            }
        };
    }

    public static final Source asGzip(Source source) {
        source.getClass();
        return new GzipSource(source);
    }
}
