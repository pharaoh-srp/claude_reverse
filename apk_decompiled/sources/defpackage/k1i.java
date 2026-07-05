package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class k1i extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public k1i(k1i k1iVar) {
        super((ViewGroup.MarginLayoutParams) k1iVar);
        this.a = 0;
        this.a = k1iVar.a;
    }

    public k1i(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
