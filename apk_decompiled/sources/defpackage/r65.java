package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class r65 extends rc {
    public static final r65 r = new r65("*/*", 0);

    @Override // defpackage.rc, defpackage.ez1
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final Intent y(Context context, String str) {
        str.getClass();
        Intent type = super.y(context, str).setType(ikb.c(str, "application/octet-stream"));
        type.getClass();
        return type;
    }
}
