package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bfe {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public bfe(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = hashSet;
        if (i != 2 || z) {
            return;
        }
        sz6.p("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        throw null;
    }
}
