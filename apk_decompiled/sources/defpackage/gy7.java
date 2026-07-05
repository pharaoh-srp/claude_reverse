package defpackage;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class gy7 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ o5l a;

    public gy7(o5l o5lVar) {
        this.a = o5lVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        o5l o5lVar = this.a;
        int i2 = o5lVar.F;
        if ((i2 & 1) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[0], frameMetrics.getMetric(8));
        }
        if ((i2 & 2) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[1], frameMetrics.getMetric(1));
        }
        if ((i2 & 4) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[2], frameMetrics.getMetric(3));
        }
        if ((i2 & 8) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[3], frameMetrics.getMetric(4));
        }
        if ((i2 & 16) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[4], frameMetrics.getMetric(5));
        }
        if ((i2 & 64) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[6], frameMetrics.getMetric(7));
        }
        if ((i2 & 32) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[5], frameMetrics.getMetric(6));
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[7], frameMetrics.getMetric(0));
        }
        if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            o5l.b(((SparseIntArray[]) o5lVar.G)[8], frameMetrics.getMetric(2));
        }
    }
}
