package defpackage;

import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;

/* JADX INFO: loaded from: classes2.dex */
public final class ujd extends ForwardingSink {
    public final /* synthetic */ cae F;
    public final /* synthetic */ long G;
    public final /* synthetic */ bae H;
    public final /* synthetic */ vjd I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujd(BufferedSink bufferedSink, cae caeVar, long j, bae baeVar, vjd vjdVar) {
        super(bufferedSink);
        this.F = caeVar;
        this.G = j;
        this.H = baeVar;
        this.I = vjdVar;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        this.E.c0(buffer, j);
        cae caeVar = this.F;
        long j2 = caeVar.E + j;
        caeVar.E = j2;
        int iE0 = wd6.e0((int) ((j2 * 100) / this.G), 0, 100);
        bae baeVar = this.H;
        if (iE0 != baeVar.E) {
            baeVar.E = iE0;
            this.I.b.invoke(Float.valueOf(iE0 / 100.0f));
        }
    }
}
