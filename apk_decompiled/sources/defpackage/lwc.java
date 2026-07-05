package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lwc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;
    public final boolean h;
    public final boolean i;

    public lwc(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = map;
        this.h = z;
        this.i = z2;
    }

    public final Map a() {
        return this.g;
    }

    public final String b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r3 = this;
            java.lang.String r0 = r3.c
            java.lang.String r1 = "computer:request"
            r2 = 0
            boolean r0 = defpackage.isg.q0(r0, r1, r2)
            if (r0 != 0) goto Lc
            return r2
        Lc:
            java.lang.String r0 = "featureDisabled"
            java.util.Map r3 = r3.g
            java.lang.Object r0 = r3.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L2d
            ih9 r1 = defpackage.nvh.a
            kotlinx.serialization.json.JsonPrimitive r0 = defpackage.ch9.j(r0)     // Catch: java.lang.Exception -> L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L2d
            java.lang.Boolean r0 = defpackage.ch9.e(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.x44.r(r0, r1)
            goto L2e
        L2d:
            r0 = r2
        L2e:
            java.lang.String r1 = "tccState"
            boolean r3 = r3.containsKey(r1)
            if (r3 != 0) goto L38
            if (r0 == 0) goto L39
        L38:
            r2 = 1
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwc.c():boolean");
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwc)) {
            return false;
        }
        lwc lwcVar = (lwc) obj;
        return x44.r(this.a, lwcVar.a) && x44.r(this.b, lwcVar.b) && x44.r(this.c, lwcVar.c) && x44.r(this.d, lwcVar.d) && x44.r(this.e, lwcVar.e) && x44.r(this.f, lwcVar.f) && x44.r(this.g, lwcVar.g) && this.h == lwcVar.h && this.i == lwcVar.i;
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.i) + fsh.p(ebh.g((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("PendingToolApproval(requestId=", this.a, ", toolUseId=", this.b, ", toolName=");
        kgh.u(sbR, this.c, ", displayName=", this.d, ", title=");
        kgh.u(sbR, this.e, ", description=", this.f, ", input=");
        sbR.append(this.g);
        sbR.append(", hasPermissionSuggestions=");
        sbR.append(this.h);
        sbR.append(", isElicitation=");
        return sq6.v(")", sbR, this.i);
    }

    public /* synthetic */ lwc(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, map, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z, false);
    }
}
