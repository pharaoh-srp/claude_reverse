package defpackage;

import android.media.audiofx.Visualizer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dmc {
    public volatile Integer b;
    public Visualizer d;
    public final byte[] a = new byte[Visualizer.getCaptureSizeRange()[1]];
    public final lsc c = mpk.P(Boolean.FALSE);

    public final void a(boolean z) {
        try {
            Visualizer visualizer = this.d;
            if (visualizer != null) {
                visualizer.setEnabled(z);
            }
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Bell Viz: setEnabled failed", null, null, 28);
        }
        if (z) {
            return;
        }
        byte[] bArr = this.a;
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
    }
}
