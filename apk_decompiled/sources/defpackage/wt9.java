package defpackage;

import android.media.ImageReader;

/* JADX INFO: loaded from: classes3.dex */
public final class wt9 implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ ua2 a;

    public wt9(ua2 ua2Var) {
        this.a = ua2Var;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        this.a.resumeWith(imageReader.acquireLatestImage());
    }
}
