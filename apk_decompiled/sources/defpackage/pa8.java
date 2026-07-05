package defpackage;

import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pa8 {
    public static /* synthetic */ RenderNode d() {
        return new RenderNode("graphicsLayer");
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder e(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ FontFamily.Builder h(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ WindowInsets.Builder j() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ void l() {
    }
}
