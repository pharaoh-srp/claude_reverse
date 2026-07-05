package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.TextureView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p61 extends TextureView implements TextureView.SurfaceTextureListener {
    public final k61 E;
    public final l51 F;
    public final lsc G;
    public x08 H;
    public final wz5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(Context context) {
        super(context);
        context.getClass();
        this.E = new k61();
        l51 l51Var = new l51(0);
        this.F = l51Var;
        this.G = mpk.P(Boolean.FALSE);
        this.I = mpk.w(new d7(8, this));
        try {
            setOpaque(false);
            setSurfaceTextureListener(this);
            l51Var.d = new fp(6, this);
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Bell Viz: View Init Failure", null, null, 28);
            this.G.setValue(Boolean.TRUE);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        l51 l51Var = this.F;
        ((Handler) l51Var.i).removeCallbacks((k51) l51Var.j);
        x08 x08Var = this.H;
        if (x08Var != null) {
            x08Var.I = false;
            try {
                x08Var.join(1000L);
            } catch (InterruptedException unused) {
            }
        }
        this.H = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        x08 x08Var = new x08(surfaceTexture, this.E, i, i2);
        x08Var.start();
        this.H = x08Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        x08 x08Var = this.H;
        if (x08Var != null) {
            x08Var.I = false;
            try {
                x08Var.join(1000L);
            } catch (InterruptedException unused) {
            }
        }
        this.H = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        x08 x08Var = this.H;
        if (x08Var != null) {
            x08Var.G = i;
            x08Var.H = i2;
            x08Var.J = true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }
}
