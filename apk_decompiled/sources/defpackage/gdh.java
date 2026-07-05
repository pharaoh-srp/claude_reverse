package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class gdh {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (x44.r(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (x44.r(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
