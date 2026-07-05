package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class w31 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ x31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(x31 x31Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = x31Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.c();
    }
}
