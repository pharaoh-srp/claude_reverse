package defpackage;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;

/* JADX INFO: loaded from: classes.dex */
public final class cdc extends ForwardingSource {
    public final /* synthetic */ ddc F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdc(ddc ddcVar, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.F = ddcVar;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        try {
            return super.A0(buffer, j);
        } catch (IOException e) {
            this.F.H = e;
            throw e;
        }
    }
}
