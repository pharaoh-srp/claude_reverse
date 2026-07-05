package defpackage;

import android.media.audiofx.Visualizer;

/* JADX INFO: loaded from: classes3.dex */
public final class cmc implements Visualizer.OnDataCaptureListener {
    public final /* synthetic */ dmc a;

    public cmc(dmc dmcVar) {
        this.a = dmcVar;
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public final void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        visualizer.getClass();
        bArr.getClass();
        mp0.w0(bArr, this.a.a, 0, 0, 0, 14);
        this.a.b = Integer.valueOf(i / 1000);
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public final void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        visualizer.getClass();
        bArr.getClass();
    }
}
