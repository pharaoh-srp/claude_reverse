package defpackage;

import android.graphics.BlendMode;
import android.graphics.ComposeShader;
import android.graphics.Shader;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class w5 {
    public static /* synthetic */ ComposeShader c(Shader shader, Shader shader2, BlendMode blendMode) {
        return new ComposeShader(shader, shader2, blendMode);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession f(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
