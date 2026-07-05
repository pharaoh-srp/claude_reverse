package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class uc extends ez1 {
    @Override // defpackage.ez1
    public final g6 L(Context context, Object obj) {
        ((String[]) obj).getClass();
        return null;
    }

    @Override // defpackage.ez1
    public final Object O(Intent intent, int i) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }

    @Override // defpackage.ez1
    public final Intent y(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        type.getClass();
        return type;
    }
}
