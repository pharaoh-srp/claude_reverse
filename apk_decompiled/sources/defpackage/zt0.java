package defpackage;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactKind;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewResult;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewed;
import com.anthropic.claude.artifact.model.ArtifactType;

/* JADX INFO: loaded from: classes2.dex */
public final class zt0 {
    public final long a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public zt0(RenderScript renderScript, long j) {
        renderScript.getClass();
        this.c = renderScript;
        this.a = j;
        this.h = wd6.P(-1, 6, null);
        int i = (int) (j >> 32);
        int i2 = (i % 4) + i;
        int i3 = (int) (j & 4294967295L);
        int i4 = (i3 % 4) + i3;
        Allocation allocationCreateTyped = Allocation.createTyped(renderScript, new Type.Builder(renderScript, Element.U8_4(renderScript)).setX(i2).setY(i4).create(), 33);
        allocationCreateTyped.getClass();
        this.e = allocationCreateTyped;
        allocationCreateTyped.setOnBufferAvailableListener(new Allocation.OnBufferAvailableListener() { // from class: ege
            @Override // android.renderscript.Allocation.OnBufferAvailableListener
            public final void onBufferAvailable(Allocation allocation) {
                zt0 zt0Var = this.a;
                if (zt0Var.b) {
                    return;
                }
                allocation.ioReceive();
                iik.i((zy1) zt0Var.h, iei.a);
            }
        });
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
        this.g = bitmapCreateBitmap;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmapCreateBitmap);
        allocationCreateFromBitmap.getClass();
        this.f = allocationCreateFromBitmap;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        scriptIntrinsicBlurCreate.getClass();
        this.d = scriptIntrinsicBlurCreate;
        scriptIntrinsicBlurCreate.setInput(allocationCreateTyped);
    }

    public void a(ArtifactViewerEvents$ArtifactViewResult artifactViewerEvents$ArtifactViewResult) {
        String mimeType;
        if (this.b) {
            return;
        }
        this.b = true;
        qi3 qi3Var = (qi3) this.c;
        ArtifactViewerEvents$ArtifactKind artifactViewerEvents$ArtifactKind = (ArtifactViewerEvents$ArtifactKind) this.e;
        ArtifactType artifactType = (ArtifactType) ((up0) this.f).a();
        if (artifactType == null || (mimeType = artifactType.getMimeType()) == null) {
            mimeType = "";
        }
        qi3Var.e(new ArtifactViewerEvents$ArtifactViewed(artifactViewerEvents$ArtifactViewResult, artifactViewerEvents$ArtifactKind, mimeType, (Long) this.g, (Long) this.h, ((mn5) this.d).a() - this.a), ArtifactViewerEvents$ArtifactViewed.Companion.serializer());
    }

    public zt0(qi3 qi3Var, mn5 mn5Var, ArtifactViewerEvents$ArtifactKind artifactViewerEvents$ArtifactKind, up0 up0Var) {
        artifactViewerEvents$ArtifactKind.getClass();
        this.c = qi3Var;
        this.d = mn5Var;
        this.e = artifactViewerEvents$ArtifactKind;
        this.f = up0Var;
        this.a = mn5Var.a();
    }
}
