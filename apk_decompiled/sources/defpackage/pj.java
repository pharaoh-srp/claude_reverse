package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pj {
    public final List a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final String g;
    public final boolean h;
    public final dk6 i;
    public final String j;
    public final boolean k;

    public pj(List list, String str, List list2, List list3, List list4, String str2, String str3, boolean z, dk6 dk6Var, String str4, boolean z2, int i) {
        z = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? true : z;
        dk6Var = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : dk6Var;
        str4 = (i & 512) != 0 ? null : str4;
        z2 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? false : z2;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = list;
        this.b = str;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = dk6Var;
        this.j = str4;
        this.k = z2;
    }

    public final List a() {
        return this.a;
    }
}
