package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public enum ieh {
    Cut(twj.b, R.string.cut, R.attr.actionModeCutDrawable),
    Copy(twj.c, R.string.copy, R.attr.actionModeCopyDrawable),
    Paste(twj.d, R.string.paste, R.attr.actionModePasteDrawable),
    SelectAll(twj.e, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(twj.f, Build.VERSION.SDK_INT <= 26 ? com.anthropic.claude.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);

    public final Object E;
    public final int F;
    public final int G;

    ieh(Object obj, int i, int i2) {
        this.E = obj;
        this.F = i;
        this.G = i2;
    }

    public final int a() {
        return this.G;
    }

    public final Object b() {
        return this.E;
    }

    public final int c() {
        return this.F;
    }
}
