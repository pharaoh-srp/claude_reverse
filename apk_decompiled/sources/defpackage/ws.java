package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class ws {
    public final ContextThemeWrapper a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public pq1 g;
    public xcb h;
    public ListAdapter i;
    public DialogInterface.OnClickListener j;
    public View k;
    public boolean l;
    public int m = -1;

    public ws(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
