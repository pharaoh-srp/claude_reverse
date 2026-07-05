package okio;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/PeekSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class PeekSource implements Source {
    public final BufferedSource E;
    public final Buffer F;
    public Segment G;
    public int H;
    public boolean I;
    public long J;

    public PeekSource(BufferedSource bufferedSource) {
        this.E = bufferedSource;
        Buffer f = bufferedSource.getF();
        this.F = f;
        Segment segment = f.E;
        this.G = segment;
        this.H = segment != null ? segment.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.I
            if (r3 != 0) goto L5f
            okio.Segment r3 = r8.G
            okio.Buffer r4 = r8.F
            if (r3 == 0) goto L27
            okio.Segment r5 = r4.E
            if (r3 != r5) goto L21
            int r3 = r8.H
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.sz6.j(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.J
            r2 = 1
            long r0 = r0 + r2
            okio.BufferedSource r2 = r8.E
            boolean r0 = r2.j0(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            okio.Segment r0 = r8.G
            if (r0 != 0) goto L48
            okio.Segment r0 = r4.E
            if (r0 == 0) goto L48
            r8.G = r0
            int r0 = r0.b
            r8.H = r0
        L48:
            long r0 = r4.F
            long r2 = r8.J
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.F
            long r4 = r8.J
            r3 = r9
            r2.f(r3, r4, r6)
            long r9 = r8.J
            long r9 = r9 + r6
            r8.J = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.sz6.j(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.vb7.m(r10, r8)
            defpackage.mr9.q(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.A0(okio.Buffer, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.I = true;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return this.E.getF();
    }
}
