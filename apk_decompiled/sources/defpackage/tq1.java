package defpackage;

import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

/* JADX INFO: loaded from: classes3.dex */
public final class tq1 extends ForwardingSource {
    public final /* synthetic */ int F;
    public Exception G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq1(Source source, int i) {
        super(source);
        this.F = i;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long A0(Buffer buffer, long j) throws Exception {
        switch (this.F) {
            case 0:
                try {
                    return super.A0(buffer, j);
                } catch (Exception e) {
                    this.G = e;
                    throw e;
                }
            default:
                try {
                    return super.A0(buffer, j);
                } catch (Exception e2) {
                    this.G = e2;
                    throw e2;
                }
        }
    }
}
