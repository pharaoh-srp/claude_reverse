package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class sda {
    public final oda a;
    public final h86 b;
    public final ContentResolver c;

    public sda(Context context, oda odaVar, h86 h86Var) {
        this.a = odaVar;
        this.b = h86Var;
        this.c = context.getContentResolver();
    }
}
