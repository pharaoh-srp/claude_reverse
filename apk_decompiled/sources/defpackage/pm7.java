package defpackage;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

/* JADX INFO: loaded from: classes3.dex */
public final class pm7 extends ForwardingSource {
    public final long F;
    public final boolean G;
    public long H;

    public pm7(Source source, long j, boolean z) {
        super(source);
        this.F = j;
        this.G = z;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        long j2 = this.H;
        long j3 = this.F;
        if (j2 > j3) {
            j = 0;
        } else if (this.G) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jA0 = this.E.A0(buffer, j);
        if (jA0 != -1) {
            this.H += jA0;
        }
        long j5 = this.H;
        if ((j5 >= j3 || jA0 != -1) && j5 <= j3) {
            return jA0;
        }
        if (jA0 > 0 && j5 > j3) {
            long j6 = buffer.F - (j5 - j3);
            Buffer buffer2 = new Buffer();
            buffer2.f0(buffer);
            buffer.c0(buffer2, j6);
            buffer2.c();
        }
        StringBuilder sbW = grc.w(j3, "expected ", " bytes but got ");
        sbW.append(this.H);
        throw new IOException(sbW.toString());
    }
}
