package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.chat.parse.MemoryToolSummary;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class stk {
    public static final ta4 a = new ta4(-14295295, false, new wb4(22));
    public static final ta4 b = new ta4(1613918698, false, new wb4(23));
    public static final ta4 c = new ta4(-1638884532, false, new xb4(27));

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final tp0 tp0Var, final yt0 yt0Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, zy7 zy7Var, final bz7 bz7Var, final boolean z6, final zy7 zy7Var2, final zy7 zy7Var3, final bz7 bz7Var2, final bz7 bz7Var3, final bz7 bz7Var4, final bz7 bz7Var5, final bz7 bz7Var6, iqb iqbVar, final String str, final bz7 bz7Var7, ld4 ld4Var, int i) {
        iqb iqbVar2;
        boolean z7;
        yt0Var.getClass();
        zy7Var.getClass();
        bz7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        bz7Var4.getClass();
        bz7Var5.getClass();
        bz7Var6.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-418056641);
        int i2 = i | (e18Var.f(tp0Var) ? 4 : 2) | (e18Var.d(yt0Var.ordinal()) ? 32 : 16) | (e18Var.g(z) ? 256 : 128) | (e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z3) ? 16384 : 8192) | (e18Var.g(z4) ? 131072 : 65536) | (e18Var.g(z5) ? 1048576 : 524288) | (e18Var.h(zy7Var) ? 8388608 : 4194304) | (e18Var.h(bz7Var) ? 67108864 : 33554432) | (e18Var.g(z6) ? 536870912 : 268435456);
        if (e18Var.Q(i2 & 1, ((i2 & 306783379) == 306783378 && (((((((((((e18Var.h(zy7Var2) ? (char) 4 : (char) 2) | (e18Var.h(zy7Var3) ? ' ' : (char) 16)) | (e18Var.h(bz7Var2) ? (char) 256 : (char) 128)) | (e18Var.h(bz7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE)) | (e18Var.h(bz7Var4) ? (char) 16384 : (char) 8192)) | (e18Var.h(bz7Var5) ? (char) 0 : (char) 0)) | (e18Var.h(bz7Var6) ? (char) 0 : (char) 0)) | 12582912) | (e18Var.f(str) ? (char) 0 : (char) 0)) | (e18Var.h(bz7Var7) ? (char) 0 : (char) 0)) & 306783379) == 306783378) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new os0(9);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tqh tqhVar = tqh.T;
            boolean z8 = tp0Var != null;
            boolean zF = ((i2 & 29360128) == 8388608) | e18Var.f(nwbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                z7 = true;
                objN2 = new pn(zy7Var, nwbVar, 1);
                e18Var.k0(objN2);
            } else {
                z7 = true;
            }
            tqhVar.A(null, null, z8, (zy7) objN2, e18Var, 24576, 3);
            if (tp0Var != null) {
                e18Var.a0(1979741949);
                boolean zF2 = e18Var.f(nwbVar);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = new ve(12, nwbVar);
                    e18Var.k0(objN3);
                }
                final zy7 zy7Var4 = (zy7) objN3;
                e18Var = e18Var;
                j8.b(((Boolean) nwbVar.getValue()).booleanValue(), zy7Var4, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1296379835, new rz7() { // from class: it0
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final zy7 zy7Var5;
                        lz1 lz1Var2;
                        qnc qncVar;
                        tp0 tp0Var2;
                        boolean z9;
                        ld4 ld4Var2 = (ld4) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((s64) obj).getClass();
                        final int i3 = 0;
                        e18 e18Var2 = (e18) ld4Var2;
                        if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            fqb fqbVar2 = fqb.E;
                            boolean z10 = z6;
                            zy7 zy7Var6 = zy7Var4;
                            if (z10) {
                                e18Var2.a0(105808512);
                                yt0 yt0Var2 = yt0Var;
                                yt0 yt0Var3 = yt0.E;
                                boolean z11 = yt0Var2 == yt0Var3;
                                bz7 bz7Var8 = bz7Var;
                                stk.e(yt0Var3, z11, bz7Var8, zy7Var6, null, null, e18Var2, 6);
                                yt0 yt0Var4 = yt0.F;
                                stk.e(yt0Var4, yt0Var2 == yt0Var4, bz7Var8, zy7Var6, null, null, e18Var2, 6);
                                zy7Var5 = zy7Var6;
                                e18Var2 = e18Var2;
                                kxk.g(e18Var2, b.e(fqbVar2, 4.0f));
                                iuj.e(null, 2.0f, gm3.a(e18Var2).p, e18Var2, 48, 1);
                                grc.z(fqbVar2, 4.0f, e18Var2, false);
                            } else {
                                zy7Var5 = zy7Var6;
                                e18Var2.a0(106676295);
                                e18Var2.p(false);
                            }
                            qnc qncVarD = z10 ? gb9.d(36.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14) : new qnc(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
                            boolean z12 = z;
                            lz1 lz1Var3 = jd4.a;
                            if (z12) {
                                e18Var2.a0(106914561);
                                String strJ0 = d4c.j0(R.string.artifact_sheet_menu_publish, e18Var2);
                                bpc bpcVarA = a.a(ud0.o1, e18Var2);
                                zy7 zy7Var7 = zy7Var2;
                                boolean zF3 = e18Var2.f(zy7Var7) | e18Var2.f(zy7Var5);
                                Object objN4 = e18Var2.N();
                                if (zF3 || objN4 == lz1Var3) {
                                    objN4 = new kt0(zy7Var7, zy7Var5, 0);
                                    e18Var2.k0(objN4);
                                }
                                e18 e18Var3 = e18Var2;
                                lz1Var2 = lz1Var3;
                                uuj.a(strJ0, bpcVarA, (zy7) objN4, null, null, false, null, null, null, qncVarD, 0, 0, e18Var3, 64, 3576);
                                qncVar = qncVarD;
                                e18Var2 = e18Var3;
                                e18Var2.p(false);
                            } else {
                                lz1Var2 = lz1Var3;
                                qncVar = qncVarD;
                                e18Var2.a0(107320103);
                                e18Var2.p(false);
                            }
                            op3 op3Var = (op3) e18Var2.j(ve4.f);
                            Object objN5 = e18Var2.N();
                            if (objN5 == lz1Var2) {
                                objN5 = fd9.O(im6.E, e18Var2);
                                e18Var2.k0(objN5);
                            }
                            l45 l45Var = (l45) objN5;
                            String strJ02 = d4c.j0(R.string.artifact_sheet_menu_copy, e18Var2);
                            bpc bpcVarA2 = a.a(ud0.Y, e18Var2);
                            boolean zF4 = e18Var2.f(zy7Var5) | e18Var2.h(l45Var) | e18Var2.h(op3Var);
                            tp0 tp0Var3 = tp0Var;
                            boolean zF5 = zF4 | e18Var2.f(tp0Var3);
                            Object objN6 = e18Var2.N();
                            if (zF5 || objN6 == lz1Var2) {
                                tp0Var2 = tp0Var3;
                                he heVar = new he(zy7Var5, l45Var, op3Var, tp0Var2, 2);
                                e18Var2.k0(heVar);
                                objN6 = heVar;
                            } else {
                                tp0Var2 = tp0Var3;
                            }
                            e18 e18Var4 = e18Var2;
                            final tp0 tp0Var4 = tp0Var2;
                            qnc qncVar2 = qncVar;
                            uuj.a(strJ02, bpcVarA2, (zy7) objN6, null, null, false, null, null, null, qncVar2, 0, 0, e18Var4, 64, 3576);
                            e18 e18Var5 = e18Var4;
                            String str2 = str;
                            if (str2 != null) {
                                e18Var5.a0(107910002);
                                bz7 bz7Var9 = bz7Var7;
                                boolean zF6 = e18Var5.f(bz7Var9) | e18Var5.f(str2) | e18Var5.f(zy7Var5);
                                Object objN7 = e18Var5.N();
                                if (zF6 || objN7 == lz1Var2) {
                                    objN7 = new lt0(zy7Var5, bz7Var9, str2);
                                    e18Var5.k0(objN7);
                                }
                                uuj.a(d4c.j0(R.string.generic_download, e18Var5), a.a(ud0.d0, e18Var5), tvj.e((zy7) objN7, e18Var5), null, null, false, null, null, null, qncVar2, 0, 0, e18Var5, 64, 3576);
                                e18Var5 = e18Var5;
                                e18Var5.p(false);
                            } else {
                                e18Var5.a0(108422215);
                                e18Var5.p(false);
                            }
                            if (z2) {
                                e18Var5.a0(108471846);
                                String strJ03 = d4c.j0(R.string.add_to_home, e18Var5);
                                bpc bpcVarA3 = a.a(ud0.A0, e18Var5);
                                zy7 zy7Var8 = zy7Var3;
                                boolean zF7 = e18Var5.f(zy7Var8) | e18Var5.f(zy7Var5);
                                Object objN8 = e18Var5.N();
                                if (zF7 || objN8 == lz1Var2) {
                                    objN8 = new kt0(zy7Var8, zy7Var5, 1);
                                    e18Var5.k0(objN8);
                                }
                                e18 e18Var6 = e18Var5;
                                uuj.a(strJ03, bpcVarA3, (zy7) objN8, null, null, false, null, null, null, qncVar2, 0, 0, e18Var6, 64, 3576);
                                e18Var5 = e18Var6;
                                e18Var5.p(false);
                            } else {
                                e18Var5.a0(108872583);
                                e18Var5.p(false);
                            }
                            String fileExtension = tp0Var4.b.getFileExtension();
                            boolean z13 = z4;
                            boolean z14 = z5;
                            if ((!z13 || fileExtension == null) && !z14) {
                                z9 = z14;
                                e18Var5.a0(109353703);
                                e18Var5.p(false);
                            } else {
                                sq6.A(4.0f, 109085584, e18Var5, e18Var5, fqbVar2);
                                z9 = z14;
                                iuj.e(null, 2.0f, gm3.a(e18Var5).p, e18Var5, 48, 1);
                                grc.z(fqbVar2, 4.0f, e18Var5, false);
                            }
                            if (!z13 || fileExtension == null) {
                                e18Var5.a0(110340743);
                                e18Var5.p(false);
                            } else {
                                e18Var5.a0(109440286);
                                String upperCase = fileExtension.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                String strK0 = d4c.k0(R.string.artifact_sheet_menu_save_as, new Object[]{upperCase}, e18Var5);
                                bpc bpcVarA4 = a.a(ud0.d0, e18Var5);
                                final bz7 bz7Var10 = bz7Var3;
                                boolean zF8 = e18Var5.f(bz7Var10) | e18Var5.f(tp0Var4) | e18Var5.f(zy7Var5);
                                Object objN9 = e18Var5.N();
                                if (zF8 || objN9 == lz1Var2) {
                                    final int i4 = 4;
                                    objN9 = new zy7() { // from class: ft0
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i5 = i4;
                                            iei ieiVar = iei.a;
                                            zy7 zy7Var9 = zy7Var5;
                                            tp0 tp0Var5 = tp0Var4;
                                            bz7 bz7Var11 = bz7Var10;
                                            switch (i5) {
                                                case 0:
                                                    bz7Var11.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 1:
                                                    bz7Var11.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 2:
                                                    bz7Var11.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 3:
                                                    bz7Var11.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                default:
                                                    bz7Var11.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                            }
                                            return ieiVar;
                                        }
                                    };
                                    e18Var5.k0(objN9);
                                }
                                e18 e18Var7 = e18Var5;
                                uuj.a(strK0, bpcVarA4, (zy7) objN9, null, null, false, null, null, null, qncVar2, 0, 0, e18Var7, 64, 3576);
                                String strK02 = d4c.k0(R.string.artifact_sheet_menu_share_as, new Object[]{upperCase}, e18Var7);
                                bpc bpcVarA5 = a.a(ud0.o1, e18Var7);
                                final bz7 bz7Var11 = bz7Var4;
                                boolean zF9 = e18Var7.f(bz7Var11) | e18Var7.f(tp0Var4) | e18Var7.f(zy7Var5);
                                Object objN10 = e18Var7.N();
                                if (zF9 || objN10 == lz1Var2) {
                                    objN10 = new zy7() { // from class: ft0
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i5 = i3;
                                            iei ieiVar = iei.a;
                                            zy7 zy7Var9 = zy7Var5;
                                            tp0 tp0Var5 = tp0Var4;
                                            bz7 bz7Var112 = bz7Var11;
                                            switch (i5) {
                                                case 0:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 1:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 2:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 3:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                default:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                            }
                                            return ieiVar;
                                        }
                                    };
                                    e18Var7.k0(objN10);
                                }
                                uuj.a(strK02, bpcVarA5, (zy7) objN10, null, null, false, null, null, null, qncVar2, 0, 0, e18Var7, 64, 3576);
                                e18Var5 = e18Var7;
                                e18Var5.p(false);
                            }
                            if (z9) {
                                e18Var5.a0(110404293);
                                String strK03 = d4c.k0(R.string.artifact_sheet_menu_save_as, new Object[]{"PDF"}, e18Var5);
                                bpc bpcVarA6 = a.a(ud0.d0, e18Var5);
                                final bz7 bz7Var12 = bz7Var5;
                                boolean zF10 = e18Var5.f(bz7Var12) | e18Var5.f(tp0Var4) | e18Var5.f(zy7Var5);
                                Object objN11 = e18Var5.N();
                                if (zF10 || objN11 == lz1Var2) {
                                    final int i5 = 1;
                                    objN11 = new zy7() { // from class: ft0
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i52 = i5;
                                            iei ieiVar = iei.a;
                                            zy7 zy7Var9 = zy7Var5;
                                            tp0 tp0Var5 = tp0Var4;
                                            bz7 bz7Var112 = bz7Var12;
                                            switch (i52) {
                                                case 0:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 1:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 2:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 3:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                default:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                            }
                                            return ieiVar;
                                        }
                                    };
                                    e18Var5.k0(objN11);
                                }
                                e18 e18Var8 = e18Var5;
                                uuj.a(strK03, bpcVarA6, (zy7) objN11, null, null, false, null, null, null, qncVar2, 0, 0, e18Var8, 64, 3576);
                                String strK04 = d4c.k0(R.string.artifact_sheet_menu_share_as, new Object[]{"PDF"}, e18Var8);
                                bpc bpcVarA7 = a.a(ud0.o1, e18Var8);
                                final bz7 bz7Var13 = bz7Var6;
                                boolean zF11 = e18Var8.f(bz7Var13) | e18Var8.f(tp0Var4) | e18Var8.f(zy7Var5);
                                Object objN12 = e18Var8.N();
                                if (zF11 || objN12 == lz1Var2) {
                                    final int i6 = 2;
                                    objN12 = new zy7() { // from class: ft0
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i52 = i6;
                                            iei ieiVar = iei.a;
                                            zy7 zy7Var9 = zy7Var5;
                                            tp0 tp0Var5 = tp0Var4;
                                            bz7 bz7Var112 = bz7Var13;
                                            switch (i52) {
                                                case 0:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 1:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 2:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 3:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                default:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                            }
                                            return ieiVar;
                                        }
                                    };
                                    e18Var8.k0(objN12);
                                }
                                uuj.a(strK04, bpcVarA7, (zy7) objN12, null, null, false, null, null, null, qncVar2, 0, 0, e18Var8, 64, 3576);
                                e18Var5 = e18Var8;
                                e18Var5.p(false);
                            } else {
                                e18Var5.a0(111236519);
                                e18Var5.p(false);
                            }
                            if (z3) {
                                sq6.A(4.0f, 111291172, e18Var5, e18Var5, fqbVar2);
                                iuj.e(null, 2.0f, gm3.a(e18Var5).p, e18Var5, 48, 1);
                                String strP = gid.p(4.0f, R.string.artifact_sheet_menu_print, e18Var5, e18Var5, fqbVar2);
                                bpc bpcVarD = u00.D(R.drawable.phosphor_printer, 0, e18Var5);
                                final bz7 bz7Var14 = bz7Var2;
                                boolean zF12 = e18Var5.f(bz7Var14) | e18Var5.f(tp0Var4) | e18Var5.f(zy7Var5);
                                Object objN13 = e18Var5.N();
                                if (zF12 || objN13 == lz1Var2) {
                                    final int i7 = 3;
                                    objN13 = new zy7() { // from class: ft0
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i52 = i7;
                                            iei ieiVar = iei.a;
                                            zy7 zy7Var9 = zy7Var5;
                                            tp0 tp0Var5 = tp0Var4;
                                            bz7 bz7Var112 = bz7Var14;
                                            switch (i52) {
                                                case 0:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 1:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 2:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                case 3:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                                default:
                                                    bz7Var112.invoke(tp0Var5);
                                                    zy7Var9.a();
                                                    break;
                                            }
                                            return ieiVar;
                                        }
                                    };
                                    e18Var5.k0(objN13);
                                }
                                e18 e18Var9 = e18Var5;
                                uuj.a(strP, bpcVarD, (zy7) objN13, null, null, false, null, null, null, qncVar2, 0, 0, e18Var9, 64, 3576);
                                e18Var9.p(false);
                            } else {
                                e18Var5.a0(111970599);
                                e18Var5.p(false);
                            }
                        } else {
                            e18Var2.T();
                        }
                        return iei.a;
                    }
                }, e18Var), e18Var, 0, 2044);
                e18Var.p(false);
            } else {
                e18Var = e18Var;
                e18Var.a0(1985996137);
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jt0(tp0Var, yt0Var, z, z2, z3, z4, z5, zy7Var, bz7Var, z6, zy7Var2, zy7Var3, bz7Var2, bz7Var3, bz7Var4, bz7Var5, bz7Var6, iqbVar2, str, bz7Var7, i);
        }
    }

    public static final void b(MemoryToolSummary memoryToolSummary, mnc mncVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        boolean z;
        boolean z2;
        memoryToolSummary.getClass();
        mncVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2008666322);
        int i2 = i | (e18Var2.f(memoryToolSummary) ? 4 : 2) | (e18Var2.f(mncVar) ? 32 : 16) | 384;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            ho0 ho0Var = new ho0(4.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(b.c(fqbVar, 1.0f), mncVar);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarI);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            String breadcrumb = memoryToolSummary.getBreadcrumb();
            if (breadcrumb == null) {
                e18Var2.a0(-1920780019);
                e18Var2.p(false);
                e18Var = e18Var2;
                iqbVar2 = fqbVar;
                z = false;
                z2 = true;
            } else {
                e18Var2.a0(-1920780018);
                tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).i;
                long j = gm3.a(e18Var2).O;
                z = false;
                z2 = true;
                iqbVar2 = fqbVar;
                tjh.b(breadcrumb, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 0, 0, 131066);
                e18Var = e18Var2;
                e18Var.p(false);
            }
            String summary = memoryToolSummary.getSummary();
            if (summary == null) {
                e18Var.a0(-1920567886);
                e18Var.p(z);
            } else {
                e18Var.a0(-1920567885);
                e18 e18Var3 = e18Var;
                tjh.b(summary, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var3, 0, 0, 131066);
                e18Var = e18Var3;
                e18Var.p(z);
            }
            e18Var.p(z2);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(memoryToolSummary, i, mncVar, iqbVar2, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ta4 r19, defpackage.ta4 r20, defpackage.iqb r21, defpackage.zy7 r22, defpackage.zy7 r23, defpackage.pz7 r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stk.c(ta4, ta4, iqb, zy7, zy7, pz7, ld4, int, int):void");
    }

    public static final void d(String str, ToolDisplayContent toolDisplayContent, ToolDisplayContent toolDisplayContent2, String str2, zy7 zy7Var, bz7 bz7Var, bz7 bz7Var2, MemoryToolSummary memoryToolSummary, ld4 ld4Var, int i) {
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1129135551);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(toolDisplayContent) ? 32 : 16) | (e18Var.f(toolDisplayContent2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(bz7Var) ? 131072 : 65536) | (e18Var.h(bz7Var2) ? 1048576 : 524288) | (e18Var.f(memoryToolSummary) ? 8388608 : 4194304);
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            r4g r4gVarS = gb9.S(null, null, null, zy7Var, e18Var, (i2 >> 3) & 7168, 7);
            qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            boolean z = ((29360128 & i2) == 8388608) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                ne neVar = new ne(memoryToolSummary, toolDisplayContent, toolDisplayContent2, str2, bz7Var, bz7Var2, 18);
                e18Var.k0(neVar);
                objN = neVar;
            }
            e18Var = e18Var;
            ovj.a(r4gVarS, str, null, null, false, false, null, null, null, null, null, null, qncVarD, (pz7) objN, e18Var, 8 | ((i2 << 3) & 112), 24576, 16380);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mq0(str, toolDisplayContent, toolDisplayContent2, str2, zy7Var, bz7Var, bz7Var2, memoryToolSummary, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r8v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static final void e(yt0 yt0Var, boolean z, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ycb ycbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        ycb ycbVar2;
        ?? r8;
        ?? r14;
        int i2;
        ycb ycbVarC;
        iqb iqbVar3;
        int i3;
        int i4;
        bpc bpcVarA;
        ?? r82 = (e18) ld4Var;
        r82.c0(204598786);
        int i5 = i | (r82.g(z) ? 32 : 16) | (r82.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (r82.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 90112;
        if (r82.Q(i5 & 1, (74899 & i5) != 74898)) {
            r82.V();
            if ((i & 1) == 0 || r82.A()) {
                float f = wcb.a;
                r14 = 0;
                i2 = i5 & (-458753);
                ycbVarC = wcb.c(0L, ((gwa) r82.j(jwa.a)).a.q, 0L, r82, 61);
                iqbVar3 = fqb.E;
            } else {
                r82.T();
                i2 = i5 & (-458753);
                iqbVar3 = iqbVar;
                ycbVarC = ycbVar;
                r14 = 0;
            }
            int i6 = i2;
            r82.q();
            int iOrdinal = yt0Var.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string.artifact_view_mode_preview;
            } else {
                if (iOrdinal != 1) {
                    wg6.i();
                    return;
                }
                i3 = R.string.artifact_view_mode_code;
            }
            String strJ0 = d4c.j0(i3, r82);
            int iOrdinal2 = yt0Var.ordinal();
            if (iOrdinal2 == 0) {
                ud0 ud0Var = ud0.d;
                i4 = R.drawable.anthropicon_eye;
            } else if (iOrdinal2 != 1) {
                wg6.i();
                return;
            } else {
                ud0 ud0Var2 = ud0.d;
                i4 = R.drawable.anthropicon_code;
            }
            bpc bpcVarD = u00.D(i4, r14, r82);
            if (z) {
                r82.a0(-949046487);
                bpcVarA = a.a(ud0.L, r82);
                r82.p(r14);
            } else {
                r82.a0(644342779);
                r82.p(r14);
                bpcVarA = null;
            }
            bpc bpcVar = bpcVarA;
            int i7 = ((i6 & 896) == 256 ? 1 : r14) | ((i6 & 112) == 32 ? 1 : r14) | ((i6 & 7168) != 2048 ? r14 : 1);
            Object objN = r82.N();
            if (i7 != 0 || objN == jd4.a) {
                gt0 gt0Var = new gt0(z, bz7Var, yt0Var, zy7Var, 0);
                r82.k0(gt0Var);
                objN = gt0Var;
            }
            iqb iqbVar4 = iqbVar3;
            uuj.a(strJ0, bpcVarD, (zy7) objN, iqbVar4, bpcVar, false, Boolean.valueOf(z), ycbVarC, null, null, 0, 0, r82, 35904 | ((i6 << 15) & 3670016), 3872);
            r8 = r82;
            iqbVar2 = iqbVar4;
            ycbVar2 = ycbVarC;
        } else {
            r82.T();
            iqbVar2 = iqbVar;
            ycbVar2 = ycbVar;
            r8 = r82;
        }
        r7e r7eVarS = r8.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ht0(yt0Var, z, bz7Var, zy7Var, iqbVar2, ycbVar2, i);
        }
    }

    public static o92 f(zv5 zv5Var) {
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new dne();
        o92 o92Var = new o92(bVar);
        bVar.b = o92Var;
        bVar.a = sq6.class;
        try {
            zv5Var.D0(new g4(bVar, 5, zv5Var));
            bVar.a = "Deferred.asListenableFuture";
            return o92Var;
        } catch (Exception e) {
            o92Var.F.l(e);
            return o92Var;
        }
    }

    public static uzb g(String str) {
        str.getClass();
        qh9 qh9VarG = v40.J(str).g();
        int iB = qh9VarG.s("signal").b();
        long jK = qh9VarG.s("timestamp").k();
        bh9 bh9VarS = qh9VarG.s("time_since_app_start_ms");
        Long lValueOf = null;
        if (bh9VarS != null && !(bh9VarS instanceof oh9)) {
            lValueOf = Long.valueOf(bh9VarS.k());
        }
        String strM = qh9VarG.s("signal_name").m();
        strM.getClass();
        String strM2 = qh9VarG.s("message").m();
        strM2.getClass();
        String strM3 = qh9VarG.s("stacktrace").m();
        strM3.getClass();
        return new uzb(iB, jK, lValueOf, strM, strM2, strM3);
    }

    public static final void h(Context context, oy7 oy7Var) {
        oy7Var.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            oy7Var.c();
            try {
                oy7Var.j(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                oy7Var.j(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                oy7Var.n();
            } finally {
                oy7Var.f();
            }
        }
    }
}
