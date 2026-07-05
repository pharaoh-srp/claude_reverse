package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class yc4 implements ScrollCaptureCallback {
    public final wjf a;
    public final c79 b;
    public final tk5 c;
    public final AndroidComposeView d;
    public final mp4 e;
    public final so8 f;

    public yc4(wjf wjfVar, c79 c79Var, mp4 mp4Var, tk5 tk5Var, AndroidComposeView androidComposeView) {
        this.a = wjfVar;
        this.b = c79Var;
        this.c = tk5Var;
        this.d = androidComposeView;
        this.e = new mp4(mp4Var.E.r0(q56.E));
        this.f = new so8(c79Var.c(), new xc4(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.yc4 r11, android.view.ScrollCaptureSession r12, defpackage.c79 r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc4.a(yc4, android.view.ScrollCaptureSession, c79, vp4):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        gb9.D(this.e, b6c.F, null, new ed3(this, runnable, null, 15), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        fkg fkgVarD = gb9.D(this.e, null, null, new w14(this, scrollCaptureSession, rect, consumer, null, 8), 3);
        fkgVarD.D0(new h4(10, cancellationSignal));
        cancellationSignal.setOnCancelListener(new zc4(0, fkgVarD));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(mwa.Q(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        ((lsc) this.c.F).setValue(Boolean.TRUE);
        runnable.run();
    }
}
