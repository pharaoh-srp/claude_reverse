package okhttp3.internal.http2;

import defpackage.mdj;
import defpackage.xr6;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class StreamResetException extends IOException {
    public final xr6 E;

    public StreamResetException(xr6 xr6Var) {
        super("stream was reset: " + xr6Var);
        this.E = xr6Var;
    }
}
