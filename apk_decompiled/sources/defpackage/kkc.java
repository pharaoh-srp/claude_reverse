package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kkc {
    public static final qnc a = new qnc(20.0f, 8.0f, 20.0f, 8.0f);
    public static final float b = 48.0f;

    public static final void a(s64 s64Var, jkc jkcVar, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        fqb fqbVar;
        lz1 lz1Var;
        qnc qncVar;
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1173191437);
        int i3 = 32;
        int i4 = (i & 48) == 0 ? (e18Var.f(jkcVar) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i4 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i5 = i & 3072;
        int i6 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        if (i5 == 0) {
            i4 |= e18Var.h(zy7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i7 = i4;
        boolean z2 = true;
        boolean z3 = false;
        if (e18Var.Q(i7 & 1, (i7 & 1169) != 1168)) {
            Context context = (Context) e18Var.j(w00.b);
            fk0 fk0Var = jkcVar.f;
            String strE = fk0Var.e();
            Set setH = fk0Var.h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setH) {
                if (!(strE == null ? false : AccountId.m946equalsimpl0(((AccountId) obj).m949unboximpl(), strE))) {
                    arrayList.add(obj);
                }
            }
            List listI1 = w44.i1(arrayList, new pa9(3, jkcVar));
            d(d4c.j0(R.string.identity_selector_section_accounts, e18Var), e18Var, 0);
            e18Var.a0(-2139417452);
            Iterator it = listI1.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                fqbVar = fqb.E;
                lz1Var = jd4.a;
                qncVar = a;
                if (!zHasNext) {
                    break;
                }
                String strM949unboximpl = ((AccountId) it.next()).m949unboximpl();
                String strO = jkcVar.O(strM949unboximpl);
                boolean z4 = z2;
                iqb iqbVarC = b.c(fqbVar, 1.0f);
                boolean zF = ((i7 & 7168) == i6 ? z4 : z3) | ((i7 & 112) == i3 ? z4 : z3) | e18Var.f(strM949unboximpl) | e18Var.h(context);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    he heVar = new he(zy7Var, jkcVar, strM949unboximpl, context, 20);
                    e18Var.k0(heVar);
                    objN = heVar;
                }
                e18 e18Var2 = e18Var;
                xsc.g(null, strO, (zy7) objN, iqbVarC, null, null, false, null, null, qncVar, b, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, e18Var2, 805309446, 6, 129520);
                z3 = z3;
                i7 = i7;
                i3 = i3;
                e18Var = e18Var2;
                i6 = i6;
                z2 = true;
            }
            boolean z5 = z3;
            int i8 = i7;
            e18Var.p(z5);
            if (z) {
                e18Var.a0(-1896798705);
                if (listI1.isEmpty()) {
                    i2 = i8;
                    e18Var.a0(-1896681835);
                    e18Var.p(z5);
                } else {
                    e18Var.a0(-1896771208);
                    i2 = i8;
                    iuj.e(null, 2.0f, gm3.a(e18Var).o, e18Var, 48, 1);
                    e18Var.p(z5);
                }
                bpc bpcVarA = a.a(ud0.d, e18Var);
                String strJ0 = d4c.j0(R.string.account_selector_add_account, e18Var);
                iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                boolean z6 = ((i2 & 7168) == 2048 ? true : z5) | ((i2 & 112) == 32 ? true : z5);
                Object objN2 = e18Var.N();
                if (z6 || objN2 == lz1Var) {
                    objN2 = new aac(zy7Var, 1, jkcVar);
                    e18Var.k0(objN2);
                }
                e18 e18Var3 = e18Var;
                xsc.g(bpcVarA, strJ0, (zy7) objN2, iqbVarC2, null, null, false, null, null, qncVar, b, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, e18Var3, 805309448, 6, 129520);
                e18Var = e18Var3;
                e18Var.p(z5);
            } else {
                e18Var.a0(-1896270155);
                e18Var.p(z5);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new en3(s64Var, jkcVar, z, zy7Var, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.iqb r21, long r22, defpackage.rc8 r24, defpackage.jkc r25, defpackage.ld4 r26, int r27) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkc.b(iqb, long, rc8, jkc, ld4, int):void");
    }

    public static final void c(s64 s64Var, List list, Organization organization, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-730452499);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(organization) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i & 3072;
        int i4 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        if (i3 == 0) {
            i2 |= e18Var2.h(bz7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 1169) != 1168)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Organization organization2 = (Organization) it.next();
                String name = organization2.getName();
                boolean zM1068equalsimpl0 = OrganizationId.m1068equalsimpl0(organization2.m116getUuidXjkXN6I(), organization.m116getUuidXjkXN6I());
                iqb iqbVarC = b.c(fqb.E, 1.0f);
                boolean zF = ((i2 & 7168) == i4) | e18Var2.f(organization2);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    objN = new aac(bz7Var, 2, organization2);
                    e18Var2.k0(objN);
                }
                e18 e18Var3 = e18Var2;
                rta.e(null, name, zM1068equalsimpl0, iqbVarC, null, null, null, a, b, null, (zy7) objN, e18Var3, 113249286, 0, 624);
                i4 = i4;
                e18Var2 = e18Var3;
            }
            e18Var = e18Var2;
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(i, 11, s64Var, list, organization, bz7Var, false);
        }
    }

    public static final void d(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1965703886);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            tjh.b(str, gb9.K(fqb.E, 20.0f, 8.0f), gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, (i2 & 14) | 48, 0, 131064);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yi7(str, i, 21);
        }
    }
}
