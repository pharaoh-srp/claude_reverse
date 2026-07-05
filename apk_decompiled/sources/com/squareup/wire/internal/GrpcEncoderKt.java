package com.squareup.wire.internal;

import com.squareup.wire.internal.GrpcEncoder;
import defpackage.mdj;
import defpackage.mr9;
import java.net.ProtocolException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toGrpcEncoder", "Lcom/squareup/wire/internal/GrpcEncoder;", "", "wire-grpc-client"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class GrpcEncoderKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final GrpcEncoder toGrpcEncoder(String str) throws ProtocolException {
        str.getClass();
        switch (str.hashCode()) {
            case -898026669:
                if (str.equals("snappy")) {
                    mr9.s("snappy not yet supported");
                    return null;
                }
                break;
            case -135761730:
                if (str.equals("identity")) {
                    return GrpcEncoder.IdentityGrpcEncoder.INSTANCE;
                }
                break;
            case 3189082:
                if (str.equals("gzip")) {
                    return GrpcEncoder.GzipGrpcEncoder.INSTANCE;
                }
                break;
            case 1545112619:
                if (str.equals("deflate")) {
                    mr9.s("deflate not yet supported");
                    return null;
                }
                break;
        }
        throw new ProtocolException("unsupported grpc-encoding: ".concat(str));
    }
}
