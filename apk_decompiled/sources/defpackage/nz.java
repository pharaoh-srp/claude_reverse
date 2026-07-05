package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class nz implements pp3 {
    public final Context a;
    public ClipboardManager b;

    public nz(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.a.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.b = clipboardManager2;
        return clipboardManager2;
    }
}
