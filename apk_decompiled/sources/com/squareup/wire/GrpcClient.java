package com.squareup.wire;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.squareup.wire.internal.MathMethodsKt;
import defpackage.bsg;
import defpackage.bvd;
import defpackage.ebh;
import defpackage.ez1;
import defpackage.hdc;
import defpackage.ij0;
import defpackage.jie;
import defpackage.kie;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.mr9;
import defpackage.pl9;
import defpackage.sz6;
import defpackage.t82;
import defpackage.tie;
import defpackage.v82;
import defpackage.vb7;
import defpackage.vs8;
import defpackage.xh6;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0010*\u00020\u0001\"\b\b\u0001\u0010\u0011*\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\b\b\u0000\u0010\u0010*\u00020\u0001\"\b\b\u0001\u0010\u0011*\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\b\b\u0000\u0010\u0010*\u00020\u0001\"\b\b\u0001\u0010\u0011*\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u001b\u0010\u001cJC\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\b\b\u0000\u0010\u0010*\u00020\u0001\"\b\b\u0001\u0010\u0011*\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u00028\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b \u0010!J%\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b \u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%JG\u0010\u0015\u001a\u00020-2\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00122\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0&2\n\u0010*\u001a\u00060(j\u0002`)2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/squareup/wire/GrpcClient;", "", "<init>", "()V", "Lcom/squareup/wire/Service;", "T", "Lpl9;", "service", "Ljava/lang/Class;", "implementationClass", "(Lpl9;)Ljava/lang/Class;", "", "timeoutNanos", "", "serializeTimeout", "(J)Ljava/lang/String;", "S", "R", "Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "Lcom/squareup/wire/GrpcCall;", "newCall", "(Lcom/squareup/wire/GrpcMethod;)Lcom/squareup/wire/GrpcCall;", "Lcom/squareup/wire/GrpcStreamingCall;", "newStreamingCall", "(Lcom/squareup/wire/GrpcMethod;)Lcom/squareup/wire/GrpcStreamingCall;", "Lcom/squareup/wire/GrpcClientStreamingCall;", "newClientStreamingCall", "(Lcom/squareup/wire/GrpcMethod;)Lcom/squareup/wire/GrpcClientStreamingCall;", "Lcom/squareup/wire/GrpcServerStreamingCall;", "newServerStreamingCall", "(Lcom/squareup/wire/GrpcMethod;)Lcom/squareup/wire/GrpcServerStreamingCall;", "create", "()Lcom/squareup/wire/Service;", "(Lpl9;)Lcom/squareup/wire/Service;", "Lcom/squareup/wire/GrpcClient$Builder;", "newBuilder", "()Lcom/squareup/wire/GrpcClient$Builder;", "", "requestMetadata", "Ltie;", "Lcom/squareup/wire/GrpcRequestBody;", "requestBody", "Lokio/Timeout;", "timeout", "Lv82;", "newCall$wire_grpc_client", "(Lcom/squareup/wire/GrpcMethod;Ljava/util/Map;Ltie;Lokio/Timeout;)Lv82;", "Builder", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public abstract class GrpcClient {
    private final <T extends Service> Class<?> implementationClass(pl9 service) throws ClassNotFoundException {
        String strD = service.d();
        strD.getClass();
        int iL0 = bsg.L0(strD, 6, ".") + 1;
        Class<?> cls = Class.forName(ij0.C(strD.substring(0, iL0), "Grpc", strD.substring(iL0)), false, ez1.I(service).getClassLoader());
        cls.getClass();
        return cls;
    }

    private final String serializeTimeout(long timeoutNanos) {
        if (timeoutNanos < 0) {
            sz6.p("Timeout too small");
            return null;
        }
        if (timeoutNanos >= 100000000) {
            return timeoutNanos < 100000000000L ? ebh.p(new StringBuilder(), timeoutNanos / 1000, 'u') : timeoutNanos < 100000000000000L ? ebh.p(new StringBuilder(), timeoutNanos / 1000000, 'm') : timeoutNanos < 100000000000000000L ? ebh.p(new StringBuilder(), timeoutNanos / MathMethodsKt.NANOS_PER_SECOND, 'S') : timeoutNanos < 6000000000000000000L ? ebh.p(new StringBuilder(), timeoutNanos / 60000000000L, 'M') : ebh.p(new StringBuilder(), timeoutNanos / 3600000000000L, 'H');
        }
        StringBuilder sb = new StringBuilder();
        sb.append(timeoutNanos);
        sb.append('n');
        return sb.toString();
    }

    public final <T extends Service> T create(pl9 service) {
        service.getClass();
        try {
            Constructor<?>[] declaredConstructors = implementationClass(service).getDeclaredConstructors();
            declaredConstructors.getClass();
            Object objCast = ez1.I(service).cast(((Constructor) mp0.T0(declaredConstructors)).newInstance(this));
            objCast.getClass();
            return (T) objCast;
        } catch (Exception unused) {
            xh6.i(service, ": is it a Wire-generated gRPC interface?", "failed to create gRPC class for ");
            return null;
        }
    }

    public final Builder newBuilder() {
        if (this instanceof WireGrpcClient) {
            WireGrpcClient wireGrpcClient = (WireGrpcClient) this;
            return new Builder().callFactory(wireGrpcClient.getClient()).baseUrl(wireGrpcClient.getBaseUrl()).minMessageToCompress(wireGrpcClient.getMinMessageToCompress());
        }
        sz6.j("newBuilder is not available for custom implementation of GrpcClient");
        return null;
    }

    public abstract <S, R> GrpcCall<S, R> newCall(GrpcMethod<S, R> method);

    public final v82 newCall$wire_grpc_client(GrpcMethod<?, ?> method, Map<String, String> requestMetadata, tie requestBody, Timeout timeout) {
        method.getClass();
        requestMetadata.getClass();
        requestBody.getClass();
        timeout.getClass();
        if (!(this instanceof WireGrpcClient)) {
            sz6.j("newCall is not available for custom implementation of GrpcClient");
            return null;
        }
        WireGrpcClient wireGrpcClient = (WireGrpcClient) this;
        t82 client$wire_grpc_client = wireGrpcClient.getClient();
        jie jieVar = new jie();
        vs8 vs8VarI = wireGrpcClient.getBaseUrl().i(method.getPath());
        vs8VarI.getClass();
        jieVar.a = vs8VarI;
        jieVar.a("te", "trailers");
        jieVar.a("grpc-trace-bin", "");
        jieVar.a("grpc-accept-encoding", "gzip");
        if (wireGrpcClient.getMinMessageToCompress() < Long.MAX_VALUE) {
            jieVar.a("grpc-encoding", "gzip");
        }
        for (Map.Entry<String, String> entry : requestMetadata.entrySet()) {
            jieVar.a(entry.getKey(), entry.getValue());
        }
        if (timeout.getA()) {
            jieVar.a("grpc-timeout", serializeTimeout(timeout.e()));
        }
        if (timeout.getC() > 0) {
            jieVar.a("grpc-timeout", serializeTimeout(timeout.getC()));
        }
        jieVar.f(GrpcMethod.class, method);
        jieVar.e("POST", requestBody);
        return client$wire_grpc_client.a(new kie(jieVar));
    }

    public abstract <S, R> GrpcClientStreamingCall<S, R> newClientStreamingCall(GrpcMethod<S, R> method);

    public abstract <S, R> GrpcServerStreamingCall<S, R> newServerStreamingCall(GrpcMethod<S, R> method);

    public abstract <S, R> GrpcStreamingCall<S, R> newStreamingCall(GrpcMethod<S, R> method);

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001e\u0010\u000b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/squareup/wire/GrpcClient$Builder;", "", "<init>", "()V", "Lhdc;", "client", "(Lhdc;)Lcom/squareup/wire/GrpcClient$Builder;", "Lt82;", "callFactory", "(Lt82;)Lcom/squareup/wire/GrpcClient$Builder;", "", "baseUrl", "(Ljava/lang/String;)Lcom/squareup/wire/GrpcClient$Builder;", "Lvs8;", "Lcom/squareup/wire/GrpcHttpUrl;", "url", "(Lvs8;)Lcom/squareup/wire/GrpcClient$Builder;", "", "bytes", "minMessageToCompress", "(J)Lcom/squareup/wire/GrpcClient$Builder;", "Lcom/squareup/wire/GrpcClient;", "build", "()Lcom/squareup/wire/GrpcClient;", "Lt82;", "Lvs8;", "J", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class Builder {
        private vs8 baseUrl;
        private t82 client;
        private long minMessageToCompress;

        public final Builder baseUrl(String baseUrl) {
            baseUrl.getClass();
            this.baseUrl = GrpcHttpUrlKt.toHttpUrl(baseUrl);
            return this;
        }

        public final GrpcClient build() {
            t82 t82Var = this.client;
            if (t82Var == null) {
                sz6.p("client is not set");
                return null;
            }
            vs8 vs8Var = this.baseUrl;
            if (vs8Var != null) {
                return new WireGrpcClient(t82Var, vs8Var, this.minMessageToCompress);
            }
            sz6.p("baseUrl is not set");
            return null;
        }

        public final Builder callFactory(t82 client) {
            client.getClass();
            this.client = client;
            return this;
        }

        public final Builder client(hdc client) {
            client.getClass();
            List list = client.r;
            if (list.contains(bvd.HTTP_2) || list.contains(bvd.H2_PRIOR_KNOWLEDGE)) {
                return callFactory(client);
            }
            sz6.p("OkHttpClient is not configured with a HTTP/2 protocol which is required for gRPC connections.");
            return null;
        }

        public final Builder minMessageToCompress(long bytes) {
            if (bytes >= 0) {
                this.minMessageToCompress = bytes;
                return this;
            }
            mr9.q(vb7.m(bytes, "minMessageToCompress must not be negative: "));
            return null;
        }

        public final Builder baseUrl(vs8 url) {
            url.getClass();
            this.baseUrl = url;
            return this;
        }
    }

    public final <T extends Service> T create() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
