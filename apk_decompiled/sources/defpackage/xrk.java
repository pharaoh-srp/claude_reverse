package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import com.anthropic.claude.chat.MessageSseService;
import com.anthropic.claude.types.strings.ChatId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.Month;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xrk {
    public static final ta4 a = new ta4(-1345685642, false, new vb4(6));
    public static final ta4 b = new ta4(768922953, false, new vb4(7));
    public static final ta4 c = new ta4(1519598322, false, new vb4(8));

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r14, int r15, defpackage.ld4 r16, defpackage.iqb r17, java.lang.String r18, boolean r19) {
        /*
            r4 = r18
            r4.getClass()
            r11 = r16
            e18 r11 = (defpackage.e18) r11
            r0 = 1283738344(0x4c844ae8, float:6.935942E7)
            r11.c0(r0)
            r0 = r14 & 6
            r1 = 4
            if (r0 != 0) goto L1f
            boolean r0 = r11.f(r4)
            if (r0 == 0) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r14
            goto L20
        L1f:
            r0 = r14
        L20:
            r2 = r14 & 48
            r5 = r19
            if (r2 != 0) goto L32
            boolean r2 = r11.g(r5)
            if (r2 == 0) goto L2f
            r2 = 32
            goto L31
        L2f:
            r2 = 16
        L31:
            r0 = r0 | r2
        L32:
            r2 = r15 & 4
            if (r2 == 0) goto L3b
            r0 = r0 | 384(0x180, float:5.38E-43)
        L38:
            r3 = r17
            goto L4d
        L3b:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L38
            r3 = r17
            boolean r6 = r11.f(r3)
            if (r6 == 0) goto L4a
            r6 = 256(0x100, float:3.59E-43)
            goto L4c
        L4a:
            r6 = 128(0x80, float:1.8E-43)
        L4c:
            r0 = r0 | r6
        L4d:
            r6 = r0 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 == r7) goto L55
            r6 = 1
            goto L56
        L55:
            r6 = 0
        L56:
            r7 = r0 & 1
            boolean r6 = r11.Q(r7, r6)
            if (r6 == 0) goto L88
            if (r2 == 0) goto L63
            fqb r2 = defpackage.fqb.E
            goto L64
        L63:
            r2 = r3
        L64:
            r3 = 1065353216(0x3f800000, float:1.0)
            iqb r6 = androidx.compose.foundation.layout.b.c(r2, r3)
            pp r3 = new pp
            r3.<init>(r4, r1)
            r1 = -84784192(0xfffffffffaf24bc0, float:-6.290361E35)
            ta4 r10 = defpackage.fd9.q0(r1, r3, r11)
            int r0 = r0 >> 3
            r0 = r0 & 14
            r1 = 196608(0x30000, float:2.75506E-40)
            r12 = r0 | r1
            r13 = 28
            r7 = 0
            r8 = 0
            r9 = 0
            defpackage.wd6.M(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = r2
            goto L8b
        L88:
            r11.T()
        L8b:
            r7e r6 = r11.s()
            if (r6 == 0) goto L9c
            m90 r0 = new m90
            r1 = r14
            r2 = r15
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xrk.a(int, int, ld4, iqb, java.lang.String, boolean):void");
    }

    public static final void b(hw2 hw2Var, String str, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        int i3;
        str.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-171419162);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(hw2Var) : e18Var2.h(hw2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(bz7Var) : e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(bz7Var2) ? 131072 : 65536;
        }
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var2);
            nwb nwbVarZ2 = mpk.Z(zy7Var, e18Var2);
            nwb nwbVarZ3 = mpk.Z(zy7Var2, e18Var2);
            nwb nwbVarZ4 = mpk.Z(bz7Var2, e18Var2);
            ChatId chatIdM978boximpl = ChatId.m978boximpl(str);
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && e18Var2.h(hw2Var));
            int i5 = i2 & 112;
            boolean zF = z | (i5 == 32) | e18Var2.f(nwbVarZ) | e18Var2.f(nwbVarZ2) | e18Var2.f(nwbVarZ3) | e18Var2.f(nwbVarZ4);
            Object objN = e18Var2.N();
            if (zF || objN == jd4.a) {
                i3 = i5;
                e7 e7Var = new e7(hw2Var, str, nwbVarZ, nwbVarZ2, nwbVarZ3, nwbVarZ4, 5);
                e18Var2.k0(e7Var);
                objN = e7Var;
            } else {
                i3 = i5;
            }
            e18Var = e18Var2;
            mwa.e(hw2Var, chatIdM978boximpl, null, (bz7) objN, e18Var, 8 | i4 | i3);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl((Object) hw2Var, str, (Object) bz7Var, zy7Var, zy7Var2, (Object) bz7Var2, i, 10);
        }
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ij0.C(xmh.p.h(str, "_"), "__", str2);
    }

    public static Intent d(Context context) {
        context.getClass();
        return new Intent(context, (Class<?>) MessageSseService.class);
    }

    public static lpe e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_id").m();
            String strM2 = qh9Var.s("result_id").m();
            bh9 bh9VarS = qh9Var.s("injected");
            Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), lpe.e)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            strM2.getClass();
            return new lpe(strM, strM2, boolValueOf, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Synthetics", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Synthetics", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Synthetics", e3);
            return null;
        }
    }

    public static boolean f(String str) {
        str.getClass();
        return str.length() > 0 && xmh.o.f(str);
    }

    public static final crb g(Month month) {
        return (crb) crb.F.get(month.getValue() - 1);
    }

    public static Object h(tok tokVar) {
        try {
            return tokVar.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return tokVar.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
