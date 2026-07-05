package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class sc extends ez1 {
    @Override // defpackage.ez1
    public final g6 L(Context context, Object obj) {
        ((String) obj).getClass();
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
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Intent y(Context context, String str) {
        str.getClass();
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        type.getClass();
        return type;
    }
}
