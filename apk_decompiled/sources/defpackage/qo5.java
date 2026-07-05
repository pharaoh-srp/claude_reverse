package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class qo5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = tpi.a;
        Locale locale = Locale.US;
        StringBuilder sbV = vb7.v("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", i, i2, "\n queuedInputBuffers=");
        qy1.k(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbV);
        qy1.k(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbV);
        qy1.k(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbV);
        qy1.k(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbV);
        sbV.append(j);
        sbV.append("\n videoFrameProcessingOffsetCount=");
        sbV.append(i11);
        sbV.append("\n}");
        return sbV.toString();
    }
}
