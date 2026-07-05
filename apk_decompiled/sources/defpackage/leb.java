package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class leb implements zpf {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;
    public final String f;
    public final List g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;

    public /* synthetic */ leb(String str, String str2, String str3, List list, String str4, List list2, boolean z, String str5, String str6, int i) {
        this(str, str2, str3, list, (i & 16) == 0, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? lm6.E : list2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }

    @Override // defpackage.zpf
    public final String a() {
        return this.b;
    }

    public final boolean b() {
        List list = this.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((spf) it.next()) instanceof xdh) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        if (!this.g.isEmpty()) {
            return true;
        }
        List list = this.d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                spf spfVar = (spf) it.next();
                if (spfVar instanceof wlh) {
                    if (!bsg.I0(((wlh) spfVar).a)) {
                        return true;
                    }
                } else if (!(spfVar instanceof mei)) {
                    if ((spfVar instanceof xdh) || (spfVar instanceof dw8)) {
                        return true;
                    }
                    wg6.i();
                }
            }
        }
        return false;
    }

    public final boolean d() {
        if (!this.g.isEmpty()) {
            return true;
        }
        List list = this.d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                spf spfVar = (spf) it.next();
                if (!(spfVar instanceof wlh) && !(spfVar instanceof mei)) {
                    if ((spfVar instanceof xdh) || (spfVar instanceof dw8)) {
                        return true;
                    }
                    wg6.i();
                }
            }
        }
        return false;
    }

    public final boolean e() {
        if (!x44.r(this.c, "assistant") || this.e) {
            return false;
        }
        String str = this.f;
        if (x44.r(str, "end_turn")) {
            return true;
        }
        if (str == null && !this.h) {
            return ((spf) w44.V0(this.d)) instanceof xdh;
        }
        return false;
    }

    @Override // defpackage.zpf
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.zpf
    public final String getType() {
        return this.k;
    }

    public leb(String str, String str2, String str3, List list, boolean z, String str4, List list2, boolean z2, String str5, String str6) {
        str.getClass();
        str3.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
        this.f = str4;
        this.g = list2;
        this.h = z2;
        this.i = str5;
        this.j = str6;
        this.k = "message";
    }
}
