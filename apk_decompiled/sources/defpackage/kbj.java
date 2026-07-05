package defpackage;

import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kbj {
    public static void a(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }
}
