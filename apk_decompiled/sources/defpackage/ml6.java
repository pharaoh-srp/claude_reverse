package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes3.dex */
public final class ml6 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ml6 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new igg(cls, charSequence) : super.newEditable(charSequence);
    }
}
