package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z38 extends tc {
    public final List p;

    public z38(List list) {
        list.getClass();
        this.p = list;
    }

    @Override // defpackage.tc, defpackage.ez1
    /* JADX INFO: renamed from: Y */
    public final Intent y(Context context, String str) {
        str.getClass();
        Intent intentPutExtra = super.y(context, str).putExtra("android.intent.extra.MIME_TYPES", (String[]) this.p.toArray(new String[0]));
        intentPutExtra.getClass();
        return intentPutExtra;
    }
}
