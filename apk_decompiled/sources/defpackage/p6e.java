package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class p6e {
    public final Context a;
    public final h86 b;

    public p6e(Context context, h86 h86Var) {
        this.a = context;
        this.b = h86Var;
    }

    public static final Cursor a(p6e p6eVar, CancellationSignal cancellationSignal) {
        int i = Build.VERSION.SDK_INT;
        Context context = p6eVar.a;
        if (i < 30) {
            return context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, null, null, "date_added DESC LIMIT 3", cancellationSignal);
        }
        Bundle bundle = new Bundle();
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
        bundle.putInt("android:query-arg-sort-direction", 1);
        bundle.putInt("android:query-arg-limit", 3);
        return context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, bundle, cancellationSignal);
    }
}
