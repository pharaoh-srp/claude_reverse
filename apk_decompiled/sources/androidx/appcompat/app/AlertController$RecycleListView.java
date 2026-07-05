package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.t0e;

/* JADX INFO: loaded from: classes2.dex */
public class AlertController$RecycleListView extends ListView {
    public final int E;
    public final int F;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0e.t);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
