package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontStyle;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hz {
    public static /* synthetic */ BlendModeColorFilter d(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ Font.Builder i(ByteBuffer byteBuffer) {
        return new Font.Builder(byteBuffer);
    }

    public static /* synthetic */ FontStyle j(int i, int i2) {
        return new FontStyle(i, i2);
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void w() {
    }

    public static /* synthetic */ void z() {
    }
}
