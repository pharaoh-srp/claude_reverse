package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class obi extends nbi {
    @Override // defpackage.nbi
    public final Font p(jv7 jv7Var) {
        Font fontD;
        Uri uri = jv7Var.a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = jv7Var.e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontD = kbi.d(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontD;
                }
                try {
                    return new Font.Builder(fontD).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
