package com.squareup.wire;

import defpackage.mdj;
import defpackage.pqe;
import defpackage.rqe;
import defpackage.wg8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u000bJ\u0011\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/squareup/wire/GrpcResponse;", "", "Lpqe;", "response", "<init>", "(Lpqe;)V", "", "name", "header", "(Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lwg8;", "Lcom/squareup/wire/GrpcHeaders;", "trailers", "()Lwg8;", "Liei;", "close", "()V", "Lpqe;", "Lrqe;", "body", "()Lrqe;", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class GrpcResponse {
    private final pqe response;

    public GrpcResponse(pqe pqeVar) {
        pqeVar.getClass();
        this.response = pqeVar;
    }

    public static /* synthetic */ String header$default(GrpcResponse grpcResponse, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return grpcResponse.header(str, str2);
    }

    public final rqe body() {
        return this.response.K;
    }

    public final void close() {
        this.response.close();
    }

    public final String header(String name, String defaultValue) {
        name.getClass();
        String strA = this.response.J.a(name);
        return strA == null ? defaultValue : strA;
    }

    public final wg8 trailers() {
        return this.response.S.get();
    }

    public final String header(String name) {
        name.getClass();
        return header(name, null);
    }
}
