package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import defpackage.iei;
import defpackage.l45;
import defpackage.m45;
import defpackage.mkf;
import defpackage.pqe;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.wd6;
import defpackage.wn5;
import defpackage.xzg;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll45;", "Liei;", "<anonymous>", "(Ll45;)V"}, k = 3, mv = {2, 0, 0})
@wn5(c = "com.squareup.wire.internal.GrpcKt$readFromResponseBodyCallback$1$onResponse$1", f = "grpc.kt", l = {117}, m = "invokeSuspend")
public final class GrpcKt$readFromResponseBodyCallback$1$onResponse$1 extends xzg implements pz7 {
    final /* synthetic */ pqe $response;
    final /* synthetic */ ProtoAdapter<R> $responseAdapter;
    final /* synthetic */ mkf $this_readFromResponseBodyCallback;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrpcKt$readFromResponseBodyCallback$1$onResponse$1(pqe pqeVar, ProtoAdapter<R> protoAdapter, mkf mkfVar, tp4<? super GrpcKt$readFromResponseBodyCallback$1$onResponse$1> tp4Var) {
        super(2, tp4Var);
        this.$response = pqeVar;
        this.$responseAdapter = protoAdapter;
        this.$this_readFromResponseBodyCallback = mkfVar;
    }

    @Override // defpackage.vd1
    public final tp4<iei> create(Object obj, tp4<?> tp4Var) {
        return new GrpcKt$readFromResponseBodyCallback$1$onResponse$1(this.$response, this.$responseAdapter, this.$this_readFromResponseBodyCallback, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(l45 l45Var, tp4<? super iei> tp4Var) {
        return ((GrpcKt$readFromResponseBodyCallback$1$onResponse$1) create(l45Var, tp4Var)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [mkf] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [mkf] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, mkf] */
    /* JADX WARN: Type inference failed for: r4v7, types: [mkf] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [pqe] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, pqe] */
    /* JADX WARN: Type inference failed for: r5v4, types: [pqe] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [pqe] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        ?? r6;
        Closeable closeable;
        ?? r4;
        ?? r9;
        GrpcMessageSource grpcMessageSourceMessageSource;
        ?? r5;
        Object objB;
        m45 m45Var;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        sf5.h0(obj);
                        r9 = this.$response;
                        ProtoAdapter protoAdapter = this.$responseAdapter;
                        mkf mkfVar = this.$this_readFromResponseBodyCallback;
                        try {
                            grpcMessageSourceMessageSource = GrpcKt.messageSource(r9, protoAdapter);
                            ?? r52 = r9;
                            r6 = r52;
                            r4 = mkfVar;
                            closeable = grpcMessageSourceMessageSource;
                            r5 = r52;
                        } catch (IOException e) {
                            try {
                                mkfVar.m(e);
                            } catch (CancellationException unused) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        grpcMessageSourceMessageSource = (GrpcMessageSource) this.L$4;
                        closeable = (Closeable) this.L$3;
                        r4 = (mkf) this.L$2;
                        r5 = (pqe) this.L$1;
                        r6 = (Closeable) this.L$0;
                        try {
                            sf5.h0(obj);
                            r4 = r4;
                            r5 = r5;
                            r6 = r6;
                        } catch (IOException e2) {
                            e = GrpcKt.grpcResponseToException(r5, e2);
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    do {
                        obj = grpcMessageSourceMessageSource.read();
                        if (obj == 0) {
                            e = GrpcKt.grpcResponseToException$default(r5, null, 1, null);
                            try {
                                r4.m(e);
                            } catch (CancellationException unused2) {
                            }
                            r9 = r6;
                            wd6.Z(closeable, null);
                            wd6.Z(r9, null);
                            return iei.a;
                        }
                        this.L$0 = r6;
                        this.L$1 = r5;
                        this.L$2 = r4;
                        this.L$3 = closeable;
                        this.L$4 = grpcMessageSourceMessageSource;
                        this.label = 1;
                        objB = r4.b(this, obj);
                        m45Var = m45.E;
                    } while (objB != m45Var);
                    return m45Var;
                } catch (Throwable th) {
                    try {
                        r4.m(null);
                    } catch (CancellationException unused3) {
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                wd6.Z(obj, th2);
                throw th3;
            }
        }
    }
}
