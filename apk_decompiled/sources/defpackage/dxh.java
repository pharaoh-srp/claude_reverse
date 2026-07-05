package defpackage;

import android.content.Context;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseFailed;
import com.anthropic.claude.api.chat.tool.ToolResultText;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxh {
    public final mwh a;
    public final KSerializer b;
    public final KSerializer c;
    public final uwh d;

    public dxh(mwh mwhVar, KSerializer kSerializer, KSerializer kSerializer2) {
        mwhVar.getClass();
        kSerializer.getClass();
        kSerializer2.getClass();
        this.a = mwhVar;
        this.b = kSerializer;
        this.c = kSerializer2;
        this.d = new uwh(true);
    }

    public static axh e(List list, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) bz7Var.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        int size = list.size() - arrayList.size();
        int size2 = arrayList.size();
        if (size2 == 0) {
            return zwh.a;
        }
        if (size != 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) bz7Var2.invoke(it.next());
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            return new ywh(size, size2, dch.r(new dn0(arrayList2)));
        }
        Object objL0 = w44.L0(arrayList);
        String str2 = (String) bz7Var2.invoke(objL0);
        if (str2 == null) {
            str2 = "unknown";
        }
        String str3 = (String) bz7Var3.invoke(objL0);
        if (str3 == null) {
            str3 = "";
        }
        return new xwh(str2, str3);
    }

    public void a(String str, dlb dlbVar, boolean z, e5h e5hVar, iqb iqbVar, ld4 ld4Var, int i) {
        str.getClass();
        iqbVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1295690438);
        e18Var.p(false);
    }

    public final void b(String str, dlb dlbVar, boolean z, e5h e5hVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        str.getClass();
        iqbVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1295690438);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(false) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var.f(e5hVar) : e18Var.h(e5hVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? e18Var.f(this) : e18Var.h(this) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var.a0(1043013738);
            a(str, dlbVar, z, e5hVar, iqbVar, e18Var, (i2 & 8078) | FreeTypeConstants.FT_LOAD_NO_AUTOHINT | (57344 & i2) | (458752 & i2) | (i2 & 3670016));
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(this, str, dlbVar, z, e5hVar, iqbVar, i, 12);
        }
    }

    public abstract void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i);

    public final void d(String str, String str2, boolean z, dlb dlbVar, boolean z2, boolean z3, iqb iqbVar, lvh lvhVar, ld4 ld4Var, int i) {
        String str3;
        int i2;
        String str4;
        boolean z4;
        boolean z5;
        boolean z6;
        iqb iqbVar2;
        e18 e18Var;
        str.getClass();
        str2.getClass();
        dlbVar.getClass();
        iqbVar.getClass();
        lvhVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1669129590);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (e18Var2.f(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= e18Var2.f(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            z4 = z;
            i2 |= e18Var2.g(z4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(dlbVar) : e18Var2.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            z5 = z2;
            i2 |= e18Var2.g(z5) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            z5 = z2;
        }
        if ((196608 & i) == 0) {
            z6 = z3;
            i2 |= e18Var2.g(z6) ? 131072 : 65536;
        } else {
            z6 = z3;
        }
        if ((1572864 & i) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var2.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? e18Var2.f(lvhVar) : e18Var2.h(lvhVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? e18Var2.f(this) : e18Var2.h(this) ? 67108864 : 33554432;
        }
        if (e18Var2.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            e18Var2.a0(2092064140);
            int i3 = i2 << 3;
            e18Var = e18Var2;
            c(str3, str4, z4, dlbVar, lvhVar, z5, z6, iqbVar2, e18Var, (i2 & 234881024) | (i2 & 1022) | ((i2 >> 9) & 57344) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            e18Var.p(false);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, z2, z3, iqbVar, lvhVar, i);
        }
    }

    public String f(Context context, dlb dlbVar, boolean z, boolean z2) {
        return s();
    }

    public Object g() {
        return null;
    }

    public Object h(List list, tp4 tp4Var) {
        String text;
        if (x44.r(this.c, kei.b)) {
            return iei.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ToolResultText) {
                arrayList.add(obj);
            }
        }
        ToolResultText toolResultText = (ToolResultText) w44.N0(arrayList);
        if (toolResultText == null || (text = toolResultText.getText()) == null) {
            return null;
        }
        String strR = r();
        mwh mwhVar = this.a;
        return gb9.c0(mwhVar.b.getDefault(), new qq0(text, mwhVar, this.c, strR, (tp4) null), (vp4) tp4Var);
    }

    public Object i(List list, JsonObject jsonObject, tp4 tp4Var) {
        return h(list, tp4Var);
    }

    public axh j(Object obj) {
        bxh bxhVarK = k(obj);
        if (bxhVarK == null) {
            return zwh.a;
        }
        String strB = bxhVarK.b();
        String strA = bxhVarK.a();
        if (strA == null) {
            strA = "";
        }
        return new xwh(strB, strA);
    }

    public bxh k(Object obj) {
        return null;
    }

    public rok l() {
        return null;
    }

    public Object m(tp4 tp4Var, Context context, String str) {
        return null;
    }

    public abstract fwh n();

    public vwh o() {
        return this.d;
    }

    public abstract int p();

    public d54 q() {
        return null;
    }

    public abstract String r();

    public abstract String s();

    public String t(dlb dlbVar) {
        return null;
    }

    public Object u(String str, vp4 vp4Var) {
        if (x44.r(this.b, kei.b)) {
            return iei.a;
        }
        String strR = r();
        mwh mwhVar = this.a;
        return gb9.c0(mwhVar.b.getDefault(), new qq0(str, mwhVar, this.b, strR, (tp4) null), vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(android.content.Context r19, java.lang.String r20, defpackage.wwh r21, defpackage.qi3 r22, defpackage.vp4 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxh.v(android.content.Context, java.lang.String, wwh, qi3, vp4):java.lang.Object");
    }

    public final void w(qi3 qi3Var, wwh wwhVar, String str, String str2) {
        qi3Var.getClass();
        wwhVar.getClass();
        str.getClass();
        str2.getClass();
        qi3Var.e(new MobileAppUseEvents$MobileAppUseFailed(r(), str, str2, wwhVar.b(), wwhVar.a(), wwhVar.c(), wwhVar.d()), MobileAppUseEvents$MobileAppUseFailed.Companion.serializer());
    }
}
