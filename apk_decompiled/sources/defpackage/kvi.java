package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kvi {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ao4 b(View view, ao4 ao4Var) {
        ContentInfo contentInfoI = ao4Var.a.i();
        Objects.requireNonNull(contentInfoI);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoI);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoI ? ao4Var : new ao4(new ive(contentInfoPerformReceiveContent));
    }
}
