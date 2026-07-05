package defpackage;

import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.OffsetDateTime;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aw6 {
    static {
        OffsetDateTime.parse("2025-06-15T14:00:00-07:00");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.tool.model.EventCreateV0Input r54, java.lang.String r55, defpackage.bz7 r56, defpackage.qi3 r57, defpackage.ld4 r58, int r59, int r60) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw6.a(com.anthropic.claude.tool.model.EventCreateV0Input, java.lang.String, bz7, qi3, ld4, int, int):void");
    }

    public static final void b(String str, String str2, String str3, String str4, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-339862343);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.f(str4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var2.a0(-190191152);
            xb0 xb0Var = new xb0();
            e18Var2.a0(-190190890);
            dv7 dv7Var = dv7.N;
            int iM = xb0Var.m(new egg(0L, 0L, dv7Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                xb0Var.h(d4c.j0(R.string.event_create_tool_date_label, e18Var2));
                xb0Var.j(iM);
                e18Var2.p(false);
                xb0Var.h("  " + str + "\n");
                e18Var2.a0(-190184426);
                iM = xb0Var.m(new egg(0L, 0L, dv7Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                try {
                    xb0Var.h(d4c.j0(R.string.event_create_tool_time_label, e18Var2));
                    xb0Var.j(iM);
                    e18Var2.p(false);
                    xb0Var.h("  ".concat(str2));
                    if (str3 == null) {
                        e18Var2.a0(-1357161231);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-1357161230);
                        xb0Var.h("\n");
                        e18Var2.a0(-1567798513);
                        iM = xb0Var.m(new egg(0L, 0L, dv7Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                        try {
                            xb0Var.h(d4c.j0(R.string.event_create_tool_location_label, e18Var2));
                            xb0Var.j(iM);
                            e18Var2.p(false);
                            xb0Var.h("  ".concat(str3));
                            e18Var2.p(false);
                        } finally {
                        }
                    }
                    if (str4 == null) {
                        e18Var2.a0(-1356871598);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-1356871597);
                        xb0Var.h("\n");
                        e18Var2.a0(-1567789170);
                        iM = xb0Var.m(new egg(0L, 0L, dv7Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                        try {
                            xb0Var.h(d4c.j0(R.string.event_create_tool_repeats_label, e18Var2));
                            xb0Var.j(iM);
                            e18Var2.p(false);
                            xb0Var.h("  ".concat(str4));
                            e18Var2.p(false);
                        } finally {
                        }
                    }
                    zb0 zb0VarN = xb0Var.n();
                    e18Var2.p(false);
                    e18Var = e18Var2;
                    tjh.c(zb0VarN, iqbVar, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).e, e18Var, 48, 0, 262140);
                } finally {
                }
            } finally {
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zv6(str, str2, str3, str4, iqbVar, i, 0);
        }
    }
}
