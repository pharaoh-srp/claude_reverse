package defpackage;

import android.media.MediaMetadataRetriever;
import android.text.PrecomputedText;
import android.view.textclassifier.TextClassificationContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class tmg {
    public static /* synthetic */ MediaMetadataRetriever.BitmapParams e() {
        return new MediaMetadataRetriever.BitmapParams();
    }

    public static /* synthetic */ TextClassificationContext.Builder f(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ void j() {
    }

    public static /* bridge */ /* synthetic */ boolean q(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
