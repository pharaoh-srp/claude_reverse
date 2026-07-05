package defpackage;

import android.os.Build;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class udj implements tdj {
    public final dz5 b;

    public udj() {
        this.b = Build.VERSION.SDK_INT >= 34 ? ez5.E : tqh.K;
        x44.s(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(FreeTypeConstants.FT_LOAD_PEDANTIC));
    }
}
