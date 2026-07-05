package defpackage;

import android.content.ClipData;
import android.content.Context;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.file.Path;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tlk {
    public static l51 a;
    public static final ta4 b = new ta4(88484782, false, new rb4(15));
    public static final ta4 c = new ta4(-87227769, false, new pb4(27));

    public static final void a(String str, long j, long j2, String str2, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2;
        str.getClass();
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(734611678);
        int i2 = i | (e18Var3.f(str) ? 4 : 2) | (e18Var3.e(j) ? 32 : 16) | (e18Var3.e(j2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var3.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var3.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var3.V();
            if ((i & 1) != 0 && !e18Var3.A()) {
                e18Var3.T();
            }
            e18Var3.q();
            wk wkVar = (wk) gm3.c(e18Var3).e.F;
            Path path = Paths.get(ij0.j("/home/user/", str2, "/"), new String[0]);
            path.getClass();
            Path pathRelativize = Paths.get(str, new String[0]);
            pathRelativize.getClass();
            if (pathRelativize.startsWith(path)) {
                Path path2 = Paths.get(str, new String[0]);
                path2.getClass();
                pathRelativize = path.relativize(path2);
            }
            Path path3 = pathRelativize;
            t10 t10Var = t10.g;
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, fqb.E);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, t10Var);
            d4c.i0(e18Var3, cd4.e, hycVarL);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE);
            if (path3.getParent() != null) {
                e18Var3.a0(-1885754114);
                tjh.b(path3.getParent() + "/", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 5, false, 1, 0, null, tkh.b((tkh) wkVar.i, j2, 0L, null, null, null, 0L, null, 6, 0L, null, 0, 16744446), e18Var3, 0, 28032, 102398);
                e18Var2 = e18Var3;
                e18Var2.p(false);
            } else {
                e18Var2 = e18Var3;
                e18Var2.a0(-1885422259);
                e18Var2.p(false);
            }
            e18 e18Var4 = e18Var2;
            tjh.b(path3.getFileName().toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 3, false, 1, 0, null, tkh.b((tkh) wkVar.i, j, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var4, 0, 28032, 102398);
            e18Var = e18Var4;
            e18Var.p(true);
        } else {
            e18Var = e18Var3;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qc1(str, j, j2, str2, i, 2);
        }
    }

    public static final void b(iqb iqbVar, e0g e0gVar, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1996783568);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i | 16;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                e0gVar = gm3.b(e18Var).f;
            } else {
                e18Var.T();
            }
            e18Var.q();
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(iqbVar, gm3.a(e18Var).r, e0gVar);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            ta4Var.invoke(nw1.a, e18Var, 54);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        e0g e0gVar2 = e0gVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(iqbVar, i, e0gVar2, ta4Var, 29);
        }
    }

    public static final void c(String str, String str2, iqb iqbVar, e0g e0gVar, yw8 yw8Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        yw8 yw8Var2;
        int i3;
        yw8 yw8Var3;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-416884714);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(ho4.d) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(e0gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                mrg mrgVar = nai.j;
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(mrgVar) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(yw8.class), mrgVar, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-458753);
                yw8Var3 = (yw8) objN;
            } else {
                e18Var2.T();
                i3 = i2 & (-458753);
                yw8Var3 = yw8Var;
            }
            e18Var2.q();
            fx8 fx8Var = new fx8((Context) e18Var2.j(w00.b));
            fx8Var.c = str;
            fx8Var.n = new a5e(j8g.c);
            yw8Var2 = yw8Var3;
            xn5.H(iqbVar, lja.K, false, fd9.q0(-1763017600, new h9a(vuk.l(fx8Var.a(), yw8Var3, null, null, null, e18Var2, 60), (cz5) e18Var2.j(ve4.h), e0gVar, str2), e18Var2), e18Var2, ((i3 >> 9) & 14) | 3120, 4);
            e18Var = e18Var2;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            yw8Var2 = yw8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) str, (Object) str2, iqbVar, (Object) e0gVar, (Object) yw8Var2, i, 27);
        }
    }

    public static wa d(String str) {
        for (wa waVar : wa.values()) {
            if (x44.r(waVar.E.toString(), str)) {
                return waVar;
            }
        }
        pmf.h("Array contains no element matching the predicate.");
        return null;
    }

    public static vbh e(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("build");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("version");
            return new vbh(strM, strM2, bh9VarS3 != null ? bh9VarS3.m() : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Os", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Os", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Os", e3);
            return null;
        }
    }

    public static final /* synthetic */ fva f(double d) {
        xua xuaVar = fva.G;
        return xua.a(d);
    }

    public static final int g(bi0 bi0Var, int i) {
        int iA;
        int iA2;
        if (bi0Var.u(bi0Var.A(i))) {
            bi0Var.j(i);
            iA = i;
            while (iA != -1 && (bi0Var.y(iA) || !bi0Var.u(iA))) {
                iA = bi0Var.A(iA);
            }
        } else {
            bi0Var.j(i);
            if (bi0Var.t(i)) {
                if (!bi0Var.v(i) || bi0Var.x(i)) {
                    iA2 = bi0Var.A(i);
                    iA = iA2;
                } else {
                    iA = i;
                }
            } else if (bi0Var.x(i)) {
                iA2 = bi0Var.A(i);
                iA = iA2;
            } else {
                iA = -1;
            }
        }
        return iA == -1 ? i : iA;
    }

    public static final int h(bi0 bi0Var, int i) {
        int iN;
        int iN2;
        if (bi0Var.y(bi0Var.N(i))) {
            bi0Var.j(i);
            iN = i;
            while (iN != -1 && (!bi0Var.y(iN) || bi0Var.u(iN))) {
                iN = bi0Var.N(iN);
            }
        } else {
            bi0Var.j(i);
            if (bi0Var.x(i)) {
                if (!bi0Var.v(i) || bi0Var.t(i)) {
                    iN2 = bi0Var.N(i);
                    iN = iN2;
                } else {
                    iN = i;
                }
            } else if (bi0Var.t(i)) {
                iN2 = bi0Var.N(i);
                iN = iN2;
            } else {
                iN = -1;
            }
        }
        return iN == -1 ? i : iN;
    }

    public static final String i(mp3 mp3Var) {
        CharSequence text;
        ClipData.Item itemAt = mp3Var.a.getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final defpackage.mp3 j(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
