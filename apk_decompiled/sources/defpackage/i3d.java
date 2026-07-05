package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes2.dex */
public final class i3d extends Surface {
    public static int H;
    public static boolean I;
    public final boolean E;
    public final h3d F;
    public boolean G;

    public i3d(h3d h3dVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.F = h3dVar;
        this.E = z;
    }

    public static synchronized boolean a() {
        try {
            if (!I) {
                try {
                } catch (GlUtil$GlException e) {
                    ysj.j("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
                }
                int i = wpk.i("EGL_EXT_protected_content") ? wpk.i("EGL_KHR_surfaceless_context") ? 1 : 2 : 0;
                H = i;
                I = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return H != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.F) {
            try {
                if (!this.G) {
                    h3d h3dVar = this.F;
                    h3dVar.F.getClass();
                    h3dVar.F.sendEmptyMessage(2);
                    this.G = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
