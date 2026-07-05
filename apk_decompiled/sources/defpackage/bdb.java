package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public enum bdb {
    Copy(R.id.copy, 0),
    Paste(R.id.paste, 1),
    Cut(R.id.cut, 2),
    SelectAll(R.id.selectAll, 3),
    Autofill(R.id.autofill, 4);

    public final int E;
    public final int F;

    bdb(int i, int i2) {
        this.E = i;
        this.F = i2;
    }

    public final int a() {
        return this.E;
    }

    public final int b() {
        return this.F;
    }

    public final int c() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return R.string.copy;
        }
        if (iOrdinal == 1) {
            return R.string.paste;
        }
        if (iOrdinal == 2) {
            return R.string.cut;
        }
        if (iOrdinal == 3) {
            return R.string.selectAll;
        }
        if (iOrdinal == 4) {
            return Build.VERSION.SDK_INT <= 26 ? com.anthropic.claude.R.string.androidx_compose_ui_autofill : R.string.autofill;
        }
        wg6.i();
        return 0;
    }
}
