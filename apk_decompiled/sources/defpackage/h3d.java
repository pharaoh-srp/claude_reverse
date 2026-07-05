package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class h3d extends HandlerThread implements Handler.Callback {
    public ui6 E;
    public Handler F;
    public Error G;
    public RuntimeException H;
    public i3d I;

    public final void a(int i) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.E.getClass();
        ui6 ui6Var = this.E;
        int[] iArr = ui6Var.F;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        wpk.d("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        wpk.d("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        ui6Var.G = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, ui6.K, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = tpi.a;
        wpk.d(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(ui6Var.G, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        wpk.d("eglCreateContext failed", eGLContextEglCreateContext != null);
        ui6Var.H = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = ui6Var.G;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            wpk.d("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        wpk.d("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        ui6Var.I = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb = new StringBuilder();
        fok.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z2) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i3 = i2 + 1;
            int iE = bz8.e(objArrCopyOf.length, i3);
            if (iE > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
            }
            objArrCopyOf[i2] = numValueOf;
            i2 = i3;
            z2 = true;
        }
        if (z2) {
            throw new GlUtil$GlException(sb.toString(), nz8.m(i2, objArrCopyOf));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        ui6Var.J = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(ui6Var);
        SurfaceTexture surfaceTexture2 = this.E.J;
        surfaceTexture2.getClass();
        this.I = new i3d(this, surfaceTexture2, i != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.E.getClass();
        ui6 ui6Var = this.E;
        ui6Var.E.removeCallbacks(ui6Var);
        try {
            SurfaceTexture surfaceTexture = ui6Var.J;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, ui6Var.F, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = ui6Var.G;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = ui6Var.G;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = ui6Var.I;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(ui6Var.G, ui6Var.I);
            }
            EGLContext eGLContext = ui6Var.H;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(ui6Var.G, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = ui6Var.G;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(ui6Var.G);
            }
            ui6Var.G = null;
            ui6Var.H = null;
            ui6Var.I = null;
            ui6Var.J = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (GlUtil$GlException e) {
                    ysj.k("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.H = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    ysj.k("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.G = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    ysj.k("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.H = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th) {
                    try {
                        ysj.k("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
