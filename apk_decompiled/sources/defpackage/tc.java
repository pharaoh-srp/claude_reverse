package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class tc extends ez1 {
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
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null || !linkedHashSet.isEmpty()) {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }
        return lm6.E;
    }

    @Override // defpackage.ez1
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Intent y(Context context, String str) {
        str.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intentPutExtra.getClass();
        return intentPutExtra;
    }
}
