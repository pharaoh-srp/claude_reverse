package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class uq5 implements i29 {
    public final cbf E;
    public final ContentResolver F;
    public volatile k86 G;
    public final tq5 H;

    public uq5(Context context, h99 h99Var) {
        cbf cbfVar = new cbf(context, h99Var);
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        Handler handler = new Handler(Looper.getMainLooper());
        context.getClass();
        h99Var.getClass();
        this.E = cbfVar;
        this.F = contentResolver;
        this.G = new k86(null);
        tq5 tq5Var = new tq5(this, handler, 0);
        this.H = tq5Var;
        Uri uriFor = Settings.System.getUriFor("screen_brightness");
        if (uriFor != null) {
            contentResolver.registerContentObserver(uriFor, false, tq5Var);
        }
        if (cbfVar.h() != Integer.MIN_VALUE) {
            this.G = new k86(Float.valueOf(mwa.L((r5 / 255.0f) * 10.0f) / 10.0f));
        }
    }

    @Override // defpackage.i29
    public final c29 a() {
        return this.G;
    }

    @Override // defpackage.i29
    public final void c() {
        this.F.unregisterContentObserver(this.H);
    }
}
