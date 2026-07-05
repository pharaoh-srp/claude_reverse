package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.text.Spanned;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.material3.d;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.chat.menu.b;
import com.google.firebase.components.DependencyCycleException;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonEncodingException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j8 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ta4 b = new ta4(-1169147723, false, new eb4(7));
    public static final ta4 c = new ta4(1638001507, false, new eb4(8));
    public static final ta4 d = new ta4(-141920831, false, new xe3(11));
    public static final u9e e = new u9e(14);
    public static final gg7 f = new gg7(12);
    public static final byte[] g = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static final jf7 h;
    public static final jf7[] i;

    static {
        jf7 jf7Var = new jf7("CLIENT_TELEMETRY", 1L);
        h = jf7Var;
        i = new jf7[]{jf7Var};
    }

    public static final kp7 A(kp7 kp7Var) {
        return kp7Var instanceof ylg ? kp7Var : B(kp7Var, e, f);
    }

    public static final f96 B(kp7 kp7Var, bz7 bz7Var, pz7 pz7Var) {
        if (kp7Var instanceof f96) {
            f96 f96Var = (f96) kp7Var;
            if (f96Var.F == bz7Var && f96Var.G == pz7Var) {
                return f96Var;
            }
        }
        return new f96(kp7Var, bz7Var, pz7Var);
    }

    public static void C(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    public static final Object D(lp7 lp7Var, kp7 kp7Var, xzg xzgVar) throws Throwable {
        if (lp7Var instanceof cph) {
            throw ((cph) lp7Var).E;
        }
        Object objA = kp7Var.a(lp7Var, xzgVar);
        return objA == m45.E ? objA : iei.a;
    }

    public static void E(long j, byte[] bArr, int i2, int i3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) >>> 2;
        Arrays.fill(bArr, i2, (i3 - 16) + i2 + iNumberOfLeadingZeros, (byte) 48);
        for (int i4 = 0; i4 < 16 - iNumberOfLeadingZeros; i4++) {
            bArr[((i2 + i3) - 1) - i4] = g[(int) (15 & j)];
            j >>>= 4;
        }
    }

    public static final p6i F(hqb hqbVar, Object obj) {
        g5c g5cVar;
        if (!hqbVar.E.R) {
            b39.c("visitAncestors called on an unattached node");
        }
        hqb hqbVar2 = hqbVar.E.I;
        av9 av9VarW = yfd.W(hqbVar);
        while (av9VarW != null) {
            if ((((hqb) av9VarW.k0.K).H & 262144) != 0) {
                while (hqbVar2 != null) {
                    if ((hqbVar2.G & 262144) != 0) {
                        hqb hqbVarJ = hqbVar2;
                        wwb wwbVar = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof p6i) {
                                p6i p6iVar = (p6i) hqbVarJ;
                                if (obj.equals(p6iVar.o())) {
                                    return p6iVar;
                                }
                            }
                            if ((hqbVarJ.G & 262144) != 0 && (hqbVarJ instanceof qw5)) {
                                int i2 = 0;
                                for (hqb hqbVar3 = ((qw5) hqbVarJ).T; hqbVar3 != null; hqbVar3 = hqbVar3.J) {
                                    if ((hqbVar3.G & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            hqbVarJ = hqbVar3;
                                        } else {
                                            if (wwbVar == null) {
                                                wwbVar = new wwb(0, new hqb[16]);
                                            }
                                            if (hqbVarJ != null) {
                                                wwbVar.b(hqbVarJ);
                                                hqbVarJ = null;
                                            }
                                            wwbVar.b(hqbVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            hqbVarJ = yfd.j(wwbVar);
                        }
                    }
                    hqbVar2 = hqbVar2.I;
                }
            }
            av9VarW = av9VarW.G();
            hqbVar2 = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(defpackage.kp7 r7, defpackage.vp4 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.wq7
            if (r0 == 0) goto L13
            r0 = r8
            wq7 r0 = (defpackage.wq7) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            wq7 r0 = new wq7
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.H
            r2 = 0
            sqb r3 = defpackage.l9c.a
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            tq7 r7 = r0.F
            dae r1 = r0.E
            defpackage.sf5.h0(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2c
            goto L5e
        L2c:
            r8 = move-exception
            goto L53
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L34:
            dae r1 = defpackage.vb7.h(r8)
            r1.E = r3
            tq7 r8 = new tq7
            r5 = 0
            r8.<init>(r5, r1)
            r0.E = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.F = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.H = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            java.lang.Object r7 = r7.a(r8, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            m45 r8 = defpackage.m45.E
            if (r7 != r8) goto L5e
            return r8
        L4f:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L53:
            java.lang.Object r4 = r8.E
            if (r4 != r7) goto L69
            c45 r7 = r0.getContext()
            defpackage.knk.u(r7)
        L5e:
            java.lang.Object r7 = r1.E
            if (r7 == r3) goto L63
            return r7
        L63:
            java.lang.String r7 = "Expected at least one element"
            defpackage.pmf.h(r7)
            return r2
        L69:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.G(kp7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(defpackage.kp7 r6, defpackage.pz7 r7, defpackage.tp4 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.xq7
            if (r0 == 0) goto L13
            r0 = r8
            xq7 r0 = (defpackage.xq7) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            xq7 r0 = new xq7
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.H
            r2 = 0
            sqb r3 = defpackage.l9c.a
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            vq7 r6 = r0.F
            dae r7 = r0.E
            defpackage.sf5.h0(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2c
            goto L60
        L2c:
            r8 = move-exception
            goto L55
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L34:
            dae r8 = defpackage.vb7.h(r8)
            r8.E = r3
            vq7 r1 = new vq7
            r5 = 0
            r1.<init>(r7, r8, r5)
            r0.E = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.F = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.H = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            java.lang.Object r6 = r6.a(r1, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L4f
            return r7
        L4f:
            r7 = r8
            goto L60
        L51:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r1
        L55:
            java.lang.Object r1 = r8.E
            if (r1 != r6) goto L6b
            c45 r6 = r0.getContext()
            defpackage.knk.u(r6)
        L60:
            java.lang.Object r6 = r7.E
            if (r6 == r3) goto L65
            return r6
        L65:
            java.lang.String r6 = "Expected at least one element matching the predicate"
            defpackage.pmf.h(r6)
            return r2
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.H(kp7, pz7, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(defpackage.v70 r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.zq7
            if (r0 == 0) goto L13
            r0 = r6
            zq7 r0 = (defpackage.zq7) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            zq7 r0 = new zq7
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.G
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            tq7 r5 = r0.F
            dae r1 = r0.E
            defpackage.sf5.h0(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            goto L59
        L29:
            r6 = move-exception
            goto L4e
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L32:
            dae r1 = defpackage.vb7.h(r6)
            tq7 r6 = new tq7
            r6.<init>(r2, r1)
            r0.E = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.F = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.H = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            java.lang.Object r5 = r5.a(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L59
            return r6
        L4a:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L4e:
            java.lang.Object r2 = r6.E
            if (r2 != r5) goto L5c
            c45 r5 = r0.getContext()
            defpackage.knk.u(r5)
        L59:
            java.lang.Object r5 = r1.E
            return r5
        L5c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.I(v70, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(defpackage.kp7 r4, defpackage.pz7 r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ar7
            if (r0 == 0) goto L13
            r0 = r6
            ar7 r0 = (defpackage.ar7) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ar7 r0 = new ar7
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.G
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            vq7 r4 = r0.F
            dae r5 = r0.E
            defpackage.sf5.h0(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            goto L5b
        L29:
            r6 = move-exception
            goto L50
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L32:
            dae r6 = defpackage.vb7.h(r6)
            vq7 r1 = new vq7
            r1.<init>(r5, r6, r2)
            r0.E = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            r0.F = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            r0.H = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r5 = r6
            goto L5b
        L4c:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r1
        L50:
            java.lang.Object r1 = r6.E
            if (r1 != r4) goto L5e
            c45 r4 = r0.getContext()
            defpackage.knk.u(r4)
        L5b:
            java.lang.Object r4 = r5.E
            return r4
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.J(kp7, pz7, vp4):java.lang.Object");
    }

    public static final kp7 K(kp7 kp7Var, e45 e45Var) {
        if (e45Var.x0(dd8.J) == null) {
            return e45Var.equals(im6.E) ? kp7Var : kp7Var instanceof r08 ? r08.c((r08) kp7Var, e45Var, 0, null, 6) : new ph2(kp7Var, e45Var, 0, null, 12);
        }
        mr9.t("Flow context cannot contain job in it. Had ", e45Var);
        return null;
    }

    public static final String L(String str, String str2, int i2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !bsg.I0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !bsg.I0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static va M(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("name").m();
            String strM2 = qh9Var.s("version").m();
            bh9 bh9VarS = qh9Var.s("build");
            String strM3 = bh9VarS != null ? bh9VarS.m() : null;
            String strM4 = qh9Var.s("version_major").m();
            strM.getClass();
            strM2.getClass();
            strM4.getClass();
            return new va(strM, strM2, strM3, strM4);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Os", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Os", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Os", e4);
            return null;
        }
    }

    public static final arb O(c45 c45Var) {
        arb arbVar = (arb) c45Var.x0(lja.Z);
        if (arbVar != null) {
            return arbVar;
        }
        sz6.j("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final boolean P(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean Q(xmi xmiVar) {
        xmiVar.getClass();
        return (xmiVar.b == null && xmiVar.a == null && xmiVar.c == null && xmiVar.d == null && xmiVar.e.isEmpty()) ? false : true;
    }

    public static final void R(y1 y1Var, String str) {
        y1Var.p("Trailing comma before the end of JSON ".concat(str), y1Var.b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final boolean S(zmc zmcVar, ww7 ww7Var) {
        zmcVar.getClass();
        ww7Var.getClass();
        return zmcVar.a(ww7Var);
    }

    public static final void T(gq7 gq7Var, l45 l45Var) {
        gb9.D(l45Var, null, null, new fj(gq7Var, null, 8), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0263  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.qy8 U(android.content.res.Resources.Theme r41, android.content.res.Resources r42, android.content.res.XmlResourceParser r43, int r44) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.U(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):qy8");
    }

    public static final CharSequence V(int i2, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder sbO = ij0.o(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                sbO.append(charSequence.subSequence(i3, i4).toString());
                sbO.append(str2);
                return sbO.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final String W(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return ij0.m(sb, str != null ? ij0.j(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final yp7 X(yp7 yp7Var, j53 j53Var) {
        return new yp7(yp7Var, j53Var, 0);
    }

    public static final gq7 Y(kp7 kp7Var, pz7 pz7Var) {
        return new gq7(kp7Var, pz7Var, 2);
    }

    public static long Z(CharSequence charSequence, int i2, int i3, boolean z) {
        if (i3 <= 0 || i2 < 0 || i2 + i3 > charSequence.length()) {
            throw new NumberFormatException("Empty input string");
        }
        if (i3 > 16) {
            int i4 = i2;
            while (i4 < charSequence.length() && charSequence.charAt(i4) == '0') {
                i4++;
            }
            if (i3 - i4 > 16) {
                throw new NumberFormatException(String.format("String value %s exceeds range of unsigned long.", charSequence));
            }
        }
        int i5 = 0;
        long j = 0;
        int i6 = 0;
        while (i5 < i3 && i6 >= 0) {
            char cCharAt = charSequence.charAt(i2);
            int iDigit = Character.digit(cCharAt, 16);
            if (z && Character.isUpperCase(cCharAt)) {
                i6 = -1;
            }
            i6 |= iDigit;
            j = (j << 4) | ((long) iDigit);
            i5++;
            i2++;
        }
        if (i6 >= 0) {
            return j;
        }
        throw new NumberFormatException("Illegal character in " + ((Object) charSequence.subSequence(i2, i3)));
    }

    public static final iz a(r20 r20Var) {
        Canvas canvas = jz.a;
        iz izVar = new iz();
        izVar.a = new Canvas(yfd.l(r20Var));
        return izVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r31, final defpackage.zy7 r32, defpackage.iqb r33, long r34, defpackage.j9f r36, defpackage.v9d r37, defpackage.e0g r38, long r39, float r41, final defpackage.ta4 r42, defpackage.ld4 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.b(boolean, zy7, iqb, long, j9f, v9d, e0g, long, float, ta4, ld4, int, int):void");
    }

    public static final ih2 b0(zy1 zy1Var) {
        return new ih2(zy1Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hvd r11, defpackage.pz7 r12, defpackage.ld4 r13, int r14) {
        /*
            e18 r13 = (defpackage.e18) r13
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.c0(r0)
            h79 r0 = r13.x
            hyc r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            ugc r3 = defpackage.pd4.c
            r13.W(r2, r3)
            java.lang.Object r2 = r13.N()
            lz1 r3 = defpackage.jd4.a
            boolean r3 = defpackage.x44.r(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            zqi r2 = (defpackage.zqi) r2
        L29:
            java.lang.Object r3 = r11.d
            fvd r3 = (defpackage.fvd) r3
            zqi r5 = r3.d(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3a
            r13.k0(r5)
        L3a:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L52
            boolean r2 = r11.c
            if (r2 != 0) goto L4a
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4e
        L4a:
            hyc r1 = r1.i(r3, r5)
        L4e:
            r13.J = r7
        L50:
            r2 = r8
            goto L8d
        L52:
            rag r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r9, r10)
            r6.getClass()
            hyc r6 = (defpackage.hyc) r6
            boolean r9 = r13.C()
            if (r9 == 0) goto L69
            if (r2 != 0) goto L74
        L69:
            boolean r9 = r11.c
            if (r9 != 0) goto L82
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L74
            goto L82
        L74:
            if (r2 == 0) goto L7b
            boolean r2 = r13.w
            if (r2 != 0) goto L7b
            goto L80
        L7b:
            boolean r2 = r13.w
            if (r2 == 0) goto L80
            goto L86
        L80:
            r1 = r6
            goto L86
        L82:
            hyc r1 = r1.i(r3, r5)
        L86:
            boolean r2 = r13.y
            if (r2 != 0) goto L8c
            if (r6 == r1) goto L50
        L8c:
            r2 = r7
        L8d:
            if (r2 == 0) goto L96
            boolean r3 = r13.S
            if (r3 != 0) goto L96
            r13.L(r1)
        L96:
            boolean r3 = r13.w
            r0.e(r3)
            r13.w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            ugc r3 = defpackage.pd4.d
            r13.U(r2, r3, r1, r8)
            int r1 = r14 >> 3
            r1 = r1 & 14
            defpackage.vb7.z(r1, r12, r13, r8, r8)
            int r0 = r0.d()
            if (r0 == 0) goto Lb4
            goto Lb5
        Lb4:
            r7 = r8
        Lb5:
            r13.w = r7
            r13.K = r4
            r7e r13 = r13.s()
            if (r13 == 0) goto Lc7
            kb2 r0 = new kb2
            r1 = 2
            r0.<init>(r11, r12, r14, r1)
            r13.d = r0
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.c(hvd, pz7, ld4, int):void");
    }

    public static final aq7 c0(yp7 yp7Var, l53 l53Var) {
        return new aq7(yp7Var, l53Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hvd[] r10, defpackage.pz7 r11, defpackage.ld4 r12, int r13) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.d(hvd[], pz7, ld4, int):void");
    }

    public static final iqb d0(iqb iqbVar, boolean z, zub zubVar, d dVar, boolean z2, vue vueVar, zy7 zy7Var) {
        iqb iqbVarB;
        if (dVar != null) {
            iqbVarB = new sgf(z, zubVar, dVar, false, z2, vueVar, zy7Var);
        } else if (dVar == null) {
            iqbVarB = new sgf(z, zubVar, null, false, z2, vueVar, zy7Var);
        } else {
            fqb fqbVar = fqb.E;
            iqbVarB = zubVar != null ? d19.a(fqbVar, zubVar, dVar).B(new sgf(z, zubVar, null, false, z2, vueVar, zy7Var)) : kxk.p(fqbVar, new ugf(dVar, z, z2, vueVar, zy7Var, 0));
        }
        return iqbVar.B(iqbVarB);
    }

    public static final void e(final ChatConversationWithProjectReference chatConversationWithProjectReference, final boolean z, final zy7 zy7Var, final zy7 zy7Var2, final bz7 bz7Var, final zy7 zy7Var3, final zy7 zy7Var4, final zy7 zy7Var5, iqb iqbVar, pl3 pl3Var, vd3 vd3Var, ld4 ld4Var, final int i2) {
        final iqb iqbVar2;
        final pl3 pl3Var2;
        e18 e18Var;
        final vd3 vd3Var2;
        pl3 pl3Var3;
        int i3;
        vd3 vd3Var3;
        int i4;
        iqb iqbVar3;
        b bVar;
        boolean z2;
        long j;
        iqb iqbVar4;
        boolean z3;
        pl3 pl3Var4;
        vd3 vd3Var4;
        chatConversationWithProjectReference.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        zy7Var5.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1529628460);
        int i5 = i2 | (e18Var2.f(chatConversationWithProjectReference) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.h(zy7Var3) ? 131072 : 65536) | (e18Var2.h(zy7Var4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.h(zy7Var5) ? 8388608 : 4194304) | 369098752;
        if (e18Var2.Q(i5 & 1, (306783379 & i5) != 306783378)) {
            e18Var2.V();
            int i6 = i2 & 1;
            fqb fqbVar = fqb.E;
            lz1 lz1Var = jd4.a;
            if (i6 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(pl3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                pl3Var3 = (pl3) objN;
                int i7 = i5 & (-1879048193);
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(vd3.class), null, null);
                    e18Var2.k0(objN2);
                }
                i3 = 0;
                e18Var2.p(false);
                e18Var2.p(false);
                vd3Var3 = (vd3) objN2;
                i4 = i7;
                iqbVar3 = fqbVar;
            } else {
                e18Var2.T();
                pl3Var3 = pl3Var;
                i4 = i5 & (-1879048193);
                i3 = 0;
                iqbVar3 = iqbVar;
                vd3Var3 = vd3Var;
            }
            e18Var2.q();
            Object[] objArr = new Object[i3];
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new rk3(22);
                e18Var2.k0(objN3);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN3, e18Var2, 48);
            boolean zF3 = e18Var2.f(nwbVar);
            Object objN4 = e18Var2.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new fg1(12, nwbVar);
                e18Var2.k0(objN4);
            }
            zy7 zy7Var6 = (zy7) objN4;
            gf8 gf8Var = (gf8) e18Var2.j(ve4.l);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN5);
            }
            l45 l45Var = (l45) objN5;
            int i8 = i4 & 14;
            b bVarD = com.anthropic.claude.chat.menu.d.d(chatConversationWithProjectReference, e18Var2);
            boolean zIs_starred = chatConversationWithProjectReference.is_starred();
            boolean zF4 = e18Var2.f(bVarD);
            Object objN6 = e18Var2.N();
            if (zF4 || objN6 == lz1Var) {
                objN6 = new mx5(0, bVarD, b.class, "showRename", "showRename()V", 0, 3);
                e18Var2.k0(objN6);
            }
            zy7 zy7Var7 = (zy7) ((jm9) objN6);
            boolean zF5 = e18Var2.f(bVarD);
            Object objN7 = e18Var2.N();
            if (zF5 || objN7 == lz1Var) {
                objN7 = new mx5(0, bVarD, b.class, "showDelete", "showDelete()V", 0, 4);
                bVar = bVarD;
                e18Var2.k0(objN7);
            } else {
                bVar = bVarD;
            }
            List listC = com.anthropic.claude.chat.menu.d.c(zIs_starred, zy7Var7, zy7Var2, (zy7) ((jm9) objN7), e18Var2, (i4 >> 3) & 896);
            if (z) {
                e18Var2.a0(-1094102919);
                j = gm3.a(e18Var2).q;
                z2 = false;
                e18Var2.p(false);
            } else {
                z2 = false;
                e18Var2.a0(-1094102369);
                e18Var2.p(false);
                j = d54.g;
            }
            vd3 vd3Var5 = vd3Var3;
            wlg wlgVarA = f8g.a(j, null, "drawer_item_background", e18Var2, 384, 10);
            o5b o5bVarD = dw1.d(lja.G, z2);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            kxk.g(e18Var2, androidx.compose.foundation.layout.b.e(fqbVar, e84.c));
            wo1 wo1Var = lja.Q;
            iqb iqbVar5 = iqbVar3;
            iqb iqbVarP = yfd.p(xn5.V(androidx.compose.foundation.layout.b.c(gb9.I(iqbVar3, e84.a), 1.0f), gm3.b(e18Var2).e), ((d54) wlgVarA.getValue()).a, zni.b);
            String strJ0 = d4c.j0(R.string.nav_drawer_chat_item_click_label, e18Var2);
            String strJ02 = d4c.j0(R.string.nav_drawer_chat_item_long_click_label, e18Var2);
            vue vueVar = new vue(0);
            boolean zF6 = e18Var2.f(nwbVar) | e18Var2.h(pl3Var3) | e18Var2.h(gf8Var);
            Object objN8 = e18Var2.N();
            if (zF6 || objN8 == lz1Var) {
                iqbVar4 = iqbVarP;
                objN8 = new ka1(pl3Var3, gf8Var, nwbVar, 18);
                e18Var2.k0(objN8);
            } else {
                iqbVar4 = iqbVarP;
            }
            iqb iqbVarE2 = androidx.compose.foundation.b.e(iqbVar4, strJ0, vueVar, strJ02, (zy7) objN8, zy7Var, 225);
            boolean zH = ((i4 & 112) == 32) | e18Var2.h(listC);
            Object objN9 = e18Var2.N();
            if (zH || objN9 == lz1Var) {
                objN9 = new hb1(z, listC, 2);
                e18Var2.k0(objN9);
            }
            iqb iqbVarI = gb9.I(tjf.b(iqbVarE2, false, (bz7) objN9), e84.i);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, iqbVarI);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE3);
            String name = chatConversationWithProjectReference.getName();
            String strN = name.length() > 0 ? name : null;
            if (strN == null) {
                z3 = false;
                strN = vb7.n(e18Var2, 703561749, R.string.generic_untitled, e18Var2, false);
            } else {
                z3 = false;
                e18Var2.a0(703559083);
                e18Var2.p(false);
            }
            boolean z4 = z3;
            tjh.b(strN, new hw9(1.0f, true), gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 24960, 110584);
            e18Var2.p(true);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zH2 = e18Var2.h(l45Var) | e18Var2.h(vd3Var5) | (i8 == 4 ? true : z4);
            if ((i4 & 29360128) == 8388608) {
                z4 = true;
            }
            boolean z5 = zH2 | z4;
            Object objN10 = e18Var2.N();
            if (z5 || objN10 == lz1Var) {
                pl3Var4 = pl3Var3;
                r63 r63Var = new r63(l45Var, vd3Var5, chatConversationWithProjectReference, zy7Var5, 3);
                vd3Var4 = vd3Var5;
                e18Var2.k0(r63Var);
                objN10 = r63Var;
            } else {
                pl3Var4 = pl3Var3;
                vd3Var4 = vd3Var5;
            }
            com.anthropic.claude.chat.menu.d.a(chatConversationWithProjectReference, zBooleanValue, zy7Var6, zy7Var2, bz7Var, zy7Var3, zy7Var4, zy7Var5, (zy7) objN10, null, bVar, null, null, e18Var2, i4 & 33553422, 6656);
            e18Var2.p(true);
            e18Var = e18Var2;
            pl3Var2 = pl3Var4;
            vd3Var2 = vd3Var4;
            iqbVar2 = iqbVar5;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
            pl3Var2 = pl3Var;
            e18Var = e18Var2;
            vd3Var2 = vd3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(z, zy7Var, zy7Var2, bz7Var, zy7Var3, zy7Var4, zy7Var5, iqbVar2, pl3Var2, vd3Var2, i2) { // from class: ke6
                public final /* synthetic */ boolean F;
                public final /* synthetic */ zy7 G;
                public final /* synthetic */ zy7 H;
                public final /* synthetic */ bz7 I;
                public final /* synthetic */ zy7 J;
                public final /* synthetic */ zy7 K;
                public final /* synthetic */ zy7 L;
                public final /* synthetic */ iqb M;
                public final /* synthetic */ pl3 N;
                public final /* synthetic */ vd3 O;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    j8.e(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static iqb e0(iqb iqbVar, boolean z, boolean z2, vue vueVar, zy7 zy7Var, int i2) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            vueVar = null;
        }
        return iqbVar.B(new sgf(z, null, null, true, z3, vueVar, zy7Var));
    }

    public static final JsonEncodingException f(Number number, String str) {
        return new JsonEncodingException(W(number, str), null, 2);
    }

    public static final a4e f0(kp7 kp7Var, mp4 mp4Var, w3g w3gVar, Object obj) {
        cbf cbfVar;
        lh2 lh2Var;
        kp7 kp7VarI;
        gh2.c.getClass();
        fh2 fh2Var = fh2.a;
        int i2 = 5;
        if (!(kp7Var instanceof lh2) || (kp7VarI = (lh2Var = (lh2) kp7Var).i()) == null) {
            cbfVar = new cbf(kp7Var, i2, im6.E);
        } else {
            if (lh2Var.F != -3) {
            }
            cbfVar = new cbf(kp7VarI, i2, lh2Var.E);
        }
        amg amgVarA = bmg.a(obj);
        return new a4e(amgVarA, gb9.C(mp4Var, (c45) cbfVar.G, w3gVar.equals(v3g.a) ? o45.E : o45.H, new zw(w3gVar, (kp7) cbfVar.F, amgVarA, obj, null, 14)));
    }

    public static final JsonEncodingException g(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        String str = "Value of type '" + serialDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getKind() + '\'';
        serialDescriptor.a();
        return new JsonEncodingException(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final kq7 g0(kp7 kp7Var, int i2) {
        if (i2 > 0) {
            return new kq7(kp7Var, i2, 0);
        }
        mr9.q(grc.u("Requested element count ", i2, " should be positive"));
        return null;
    }

    public static final rfd h(String str, kfd kfdVar) {
        if (bsg.I0(str)) {
            sz6.p("Blank serial names are prohibited");
            return null;
        }
        Iterator it = ((nqa) xfd.a.values()).iterator();
        while (((jqa) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((jqa) it).next();
            if (str.equals(kSerializer.getDescriptor().a())) {
                StringBuilder sbX = sq6.x("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbX.append(jce.a.b(kSerializer.getClass()).f());
                sbX.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                sz6.p(csg.V(sbX.toString()));
                return null;
            }
        }
        return new rfd(str, kfdVar);
    }

    public static final int h0(wub wubVar) {
        int iC;
        int i2 = wubVar.b;
        int iC2 = wubVar.c(0);
        while (wubVar.b != 0 && wubVar.c(0) == iC2) {
            wubVar.g(0, wubVar.d());
            wubVar.f(wubVar.b - 1);
            int i3 = wubVar.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = wubVar.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = wubVar.c(i7);
                if (i6 >= i3 || (iC = wubVar.c(i6)) <= iC4) {
                    if (iC4 > iC3) {
                        wubVar.g(i5, iC4);
                        wubVar.g(i7, iC3);
                        i5 = i7;
                    }
                } else if (iC > iC3) {
                    wubVar.g(i5, iC);
                    wubVar.g(i6, iC3);
                    i5 = i6;
                }
            }
        }
        return iC2;
    }

    public static final void i(che cheVar, Object obj, iqb iqbVar, boolean z, boolean z2, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        boolean z3;
        cheVar.getClass();
        obj.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1129341741);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(cheVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            z3 = z2;
            i3 |= e18Var.g(z3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            z3 = z2;
        }
        if ((196608 & i2) == 0) {
            i3 |= e18Var.h(ta4Var) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.a0(-1931606931);
            Object objN = e18Var.N();
            Object obj2 = jd4.a;
            if (objN == obj2) {
                objN = mpk.P(new fcc(0L));
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            e18Var.p(false);
            e18Var.a0(-1931604065);
            Object objN2 = e18Var.N();
            if (objN2 == obj2) {
                objN2 = new e0(25, nwbVar);
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            iqb iqbVarP0 = xn5.p0(iqbVar, (bz7) objN2);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP0);
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
            z80 z80Var = cd4.g;
            if (e18Var.S || !x44.r(e18Var.N(), Integer.valueOf(iHashCode))) {
                e18Var.k0(Integer.valueOf(iHashCode));
                e18Var.b(z80Var, Integer.valueOf(iHashCode));
            }
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(872009262);
            int i4 = i3 & 14;
            boolean zF = (i4 == 4) | e18Var.f(obj);
            Object objN3 = e18Var.N();
            if (zF || objN3 == obj2) {
                objN3 = new oge(cheVar, obj, new l4(28, nwbVar));
                e18Var.k0(objN3);
            }
            e18Var.p(false);
            ta4Var.i((oge) objN3, Boolean.valueOf(z3), e18Var, Integer.valueOf((i3 >> 9) & 1008));
            e18Var.p(true);
            HashSet hashSet = cheVar.q;
            Boolean boolValueOf = Boolean.valueOf(z);
            e18Var.a0(-1931590537);
            boolean zH = ((i3 & 7168) == 2048) | (i4 == 4) | e18Var.h(obj);
            Object objN4 = e18Var.N();
            if (zH || objN4 == obj2) {
                objN4 = new pge(z, cheVar, obj, null);
                e18Var.k0(objN4);
            }
            e18Var.p(false);
            fd9.j(hashSet, boolValueOf, (pz7) objN4, e18Var);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qge(cheVar, obj, iqbVar, z, z3, ta4Var, i2);
        }
    }

    public static final BlendMode i0(int i2) {
        return i2 == 0 ? BlendMode.CLEAR : i2 == 27 ? BlendMode.COLOR : i2 == 19 ? BlendMode.COLOR_BURN : i2 == 18 ? BlendMode.COLOR_DODGE : i2 == 16 ? BlendMode.DARKEN : i2 == 22 ? BlendMode.DIFFERENCE : i2 == 2 ? BlendMode.DST : i2 == 10 ? BlendMode.DST_ATOP : i2 == 6 ? BlendMode.DST_IN : i2 == 8 ? BlendMode.DST_OUT : i2 == 4 ? BlendMode.DST_OVER : i2 == 23 ? BlendMode.EXCLUSION : i2 == 20 ? BlendMode.HARD_LIGHT : i2 == 25 ? BlendMode.HUE : i2 == 17 ? BlendMode.LIGHTEN : i2 == 28 ? BlendMode.LUMINOSITY : i2 == 13 ? BlendMode.MODULATE : i2 == 24 ? BlendMode.MULTIPLY : i2 == 15 ? BlendMode.OVERLAY : i2 == 26 ? BlendMode.SATURATION : i2 == 14 ? BlendMode.SCREEN : i2 == 21 ? BlendMode.SOFT_LIGHT : i2 == 1 ? BlendMode.SRC : i2 == 9 ? BlendMode.SRC_ATOP : i2 == 5 ? BlendMode.SRC_IN : i2 == 7 ? BlendMode.SRC_OUT : i2 == 3 ? BlendMode.SRC_OVER : BlendMode.SRC_IN;
    }

    public static final void j(wub wubVar, int i2) {
        if (wubVar.b == 0 || !(wubVar.c(0) == i2 || wubVar.c(wubVar.b - 1) == i2)) {
            int i3 = wubVar.b;
            wubVar.a(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int iC = wubVar.c(i4);
                if (i2 <= iC) {
                    break;
                }
                wubVar.g(i3, iC);
                i3 = i4;
            }
            wubVar.g(i3, i2);
        }
    }

    public static String j0(int i2, long j) {
        if (i2 > 16) {
            i2 = 32;
        } else if (i2 < 16) {
            i2 = 16;
        }
        byte[] bArr = new byte[i2];
        E(j, bArr, 0, i2);
        return new String(bArr, StandardCharsets.US_ASCII);
    }

    public static final a4e k(amg amgVar) {
        return new a4e(amgVar, null);
    }

    public static final kp7 l(kp7 kp7Var, int i2, py1 py1Var) {
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            mr9.q(grc.p(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1 && py1Var != py1.E) {
            sz6.p("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == -1) {
            i2 = 0;
            py1Var = py1.F;
        }
        int i3 = i2;
        py1 py1Var2 = py1Var;
        return kp7Var instanceof r08 ? r08.c((r08) kp7Var, null, i3, py1Var2, 1) : new ph2(kp7Var, null, i3, py1Var2, 2);
    }

    public static final th2 l0(kp7 kp7Var, rz7 rz7Var) {
        int i2 = sq7.a;
        return new th2(rz7Var, kp7Var, im6.E, -2, py1.E);
    }

    public static final jnf m(String str, SerialDescriptor[] serialDescriptorArr, bz7 bz7Var) {
        if (bsg.I0(str)) {
            sz6.p("Blank serial names are prohibited");
            return null;
        }
        oh3 oh3Var = new oh3(str);
        bz7Var.invoke(oh3Var);
        return new jnf(str, vsg.l, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [bz7] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [hqb] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [hqb] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void m0(nw5 nw5Var, Object obj, bz7 bz7Var) {
        g5c g5cVar;
        if (!nw5Var.x0().R) {
            b39.c("visitAncestors called on an unattached node");
        }
        hqb hqbVar = nw5Var.x0().I;
        av9 av9VarW = yfd.W(nw5Var);
        while (av9VarW != null) {
            if ((((hqb) av9VarW.k0.K).H & 262144) != 0) {
                while (hqbVar != null) {
                    if ((hqbVar.G & 262144) != 0) {
                        ?? J = hqbVar;
                        ?? wwbVar = 0;
                        while (J != 0) {
                            if (J instanceof p6i) {
                                p6i p6iVar = (p6i) J;
                                if (!(obj.equals(p6iVar.o()) ? ((Boolean) bz7Var.invoke(p6iVar)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((J.G & 262144) != 0 && (J instanceof qw5)) {
                                hqb hqbVar2 = ((qw5) J).T;
                                int i2 = 0;
                                J = J;
                                wwbVar = wwbVar;
                                while (hqbVar2 != null) {
                                    if ((hqbVar2.G & 262144) != 0) {
                                        i2++;
                                        wwbVar = wwbVar;
                                        if (i2 == 1) {
                                            J = hqbVar2;
                                        } else {
                                            if (wwbVar == 0) {
                                                wwbVar = new wwb(0, new hqb[16]);
                                            }
                                            if (J != 0) {
                                                wwbVar.b(J);
                                                J = 0;
                                            }
                                            wwbVar.b(hqbVar2);
                                        }
                                    }
                                    hqbVar2 = hqbVar2.J;
                                    J = J;
                                    wwbVar = wwbVar;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = yfd.j(wwbVar);
                        }
                    }
                    hqbVar = hqbVar.I;
                }
            }
            av9VarW = av9VarW.G();
            hqbVar = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
        }
    }

    public static final jnf n(String str, u00 u00Var, SerialDescriptor[] serialDescriptorArr, bz7 bz7Var) {
        if (bsg.I0(str)) {
            sz6.p("Blank serial names are prohibited");
            return null;
        }
        if (u00Var.equals(vsg.l)) {
            sz6.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        oh3 oh3Var = new oh3(str);
        bz7Var.invoke(oh3Var);
        return new jnf(str, u00Var, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, nw5, p6i] */
    /* JADX WARN: Type inference failed for: r12v0, types: [bz7] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [hqb] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [hqb] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void n0(p6i p6iVar, bz7 bz7Var) {
        g5c g5cVar;
        hqb hqbVar = (hqb) p6iVar;
        if (!hqbVar.E.R) {
            b39.c("visitAncestors called on an unattached node");
        }
        hqb hqbVar2 = hqbVar.E.I;
        av9 av9VarW = yfd.W(p6iVar);
        while (av9VarW != null) {
            if ((((hqb) av9VarW.k0.K).H & 262144) != 0) {
                while (hqbVar2 != null) {
                    if ((hqbVar2.G & 262144) != 0) {
                        ?? J = hqbVar2;
                        ?? wwbVar = 0;
                        while (J != 0) {
                            boolean zBooleanValue = true;
                            if (J instanceof p6i) {
                                p6i p6iVar2 = (p6i) J;
                                if (x44.r(p6iVar.o(), p6iVar2.o()) && p6iVar.getClass() == p6iVar2.getClass()) {
                                    zBooleanValue = ((Boolean) bz7Var.invoke(p6iVar2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((J.G & 262144) != 0 && (J instanceof qw5)) {
                                hqb hqbVar3 = ((qw5) J).T;
                                int i2 = 0;
                                J = J;
                                wwbVar = wwbVar;
                                while (hqbVar3 != null) {
                                    if ((hqbVar3.G & 262144) != 0) {
                                        i2++;
                                        wwbVar = wwbVar;
                                        if (i2 == 1) {
                                            J = hqbVar3;
                                        } else {
                                            if (wwbVar == 0) {
                                                wwbVar = new wwb(0, new hqb[16]);
                                            }
                                            if (J != 0) {
                                                wwbVar.b(J);
                                                J = 0;
                                            }
                                            wwbVar.b(hqbVar3);
                                        }
                                    }
                                    hqbVar3 = hqbVar3.J;
                                    J = J;
                                    wwbVar = wwbVar;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = yfd.j(wwbVar);
                        }
                    }
                    hqbVar2 = hqbVar2.I;
                }
            }
            av9VarW = av9VarW.G();
            hqbVar2 = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
        }
    }

    public static jnf o(String str, u00 u00Var, SerialDescriptor[] serialDescriptorArr) {
        if (bsg.I0(str)) {
            sz6.p("Blank serial names are prohibited");
            return null;
        }
        if (u00Var.equals(vsg.l)) {
            sz6.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        oh3 oh3Var = new oh3(str);
        return new jnf(str, u00Var, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [bz7] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [hqb] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void o0(hqb hqbVar, String str, bz7 bz7Var) {
        if (!hqbVar.E.R) {
            b39.c("visitSubtreeIf called on an unattached node");
        }
        wwb wwbVar = new wwb(0, new hqb[16]);
        hqb hqbVar2 = hqbVar.E;
        hqb hqbVar3 = hqbVar2.J;
        if (hqbVar3 == null) {
            yfd.i(wwbVar, hqbVar2);
        } else {
            wwbVar.b(hqbVar3);
        }
        while (true) {
            int i2 = wwbVar.G;
            if (i2 == 0) {
                return;
            }
            hqb hqbVar4 = (hqb) wwbVar.m(i2 - 1);
            if ((hqbVar4.H & 262144) != 0) {
                for (hqb hqbVar5 = hqbVar4; hqbVar5 != null && hqbVar5.R; hqbVar5 = hqbVar5.J) {
                    if ((hqbVar5.G & 262144) != 0) {
                        ?? J = hqbVar5;
                        ?? wwbVar2 = 0;
                        while (J != 0) {
                            if (J instanceof p6i) {
                                p6i p6iVar = (p6i) J;
                                o6i o6iVar = str.equals(p6iVar.o()) ? (o6i) bz7Var.invoke(p6iVar) : o6i.E;
                                if (o6iVar == o6i.G) {
                                    return;
                                }
                                if (o6iVar == o6i.F) {
                                    break;
                                }
                            } else if ((J.G & 262144) != 0 && (J instanceof qw5)) {
                                hqb hqbVar6 = ((qw5) J).T;
                                int i3 = 0;
                                J = J;
                                wwbVar2 = wwbVar2;
                                while (hqbVar6 != null) {
                                    if ((hqbVar6.G & 262144) != 0) {
                                        i3++;
                                        wwbVar2 = wwbVar2;
                                        if (i3 == 1) {
                                            J = hqbVar6;
                                        } else {
                                            if (wwbVar2 == 0) {
                                                wwbVar2 = new wwb(0, new hqb[16]);
                                            }
                                            if (J != 0) {
                                                wwbVar2.b(J);
                                                J = 0;
                                            }
                                            wwbVar2.b(hqbVar6);
                                        }
                                    }
                                    hqbVar6 = hqbVar6.J;
                                    J = J;
                                    wwbVar2 = wwbVar2;
                                }
                                if (i3 == 1) {
                                }
                            }
                            J = yfd.j(wwbVar2);
                        }
                    }
                }
            }
            yfd.i(wwbVar, hqbVar4);
        }
    }

    public static final List p(kz9 kz9Var, uz9 uz9Var, n78 n78Var) {
        b79 b79Var;
        wwb wwbVar = (wwb) n78Var.F;
        if (!(wwbVar.G != 0) && uz9Var.E.isEmpty()) {
            return lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        if (((wwb) n78Var.F).G != 0) {
            int i2 = wwbVar.G;
            if (i2 == 0) {
                pmf.h("MutableVector is empty.");
                return null;
            }
            Object[] objArr = wwbVar.E;
            int i3 = ((sy9) objArr[0]).a;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = ((sy9) objArr[i4]).a;
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i3 < 0) {
                e39.a("negative minIndex");
            }
            int i6 = wwbVar.G;
            if (i6 == 0) {
                pmf.h("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = wwbVar.E;
            int i7 = ((sy9) objArr2[0]).b;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = ((sy9) objArr2[i8]).b;
                if (i9 > i7) {
                    i7 = i9;
                }
            }
            b79Var = new b79(i3, Math.min(i7, kz9Var.a() - 1), 1);
        } else {
            b79Var = b79.H;
        }
        int size = uz9Var.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            sz9 sz9Var = (sz9) uz9Var.get(i10);
            int iR = iv1.r(kz9Var, sz9Var.a, sz9Var.c);
            int i11 = b79Var.E;
            if ((iR > b79Var.F || i11 > iR) && iR >= 0 && iR < kz9Var.a()) {
                arrayList.add(Integer.valueOf(iR));
            }
        }
        int i12 = b79Var.E;
        int i13 = b79Var.F;
        if (i12 <= i13) {
            while (true) {
                arrayList.add(Integer.valueOf(i12));
                if (i12 == i13) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, p6i] */
    /* JADX WARN: Type inference failed for: r14v0, types: [bz7] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [hqb] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void p0(p6i p6iVar, bz7 bz7Var) {
        hqb hqbVar = (hqb) p6iVar;
        if (!hqbVar.E.R) {
            b39.c("visitSubtreeIf called on an unattached node");
        }
        wwb wwbVar = new wwb(0, new hqb[16]);
        hqb hqbVar2 = hqbVar.E;
        hqb hqbVar3 = hqbVar2.J;
        if (hqbVar3 == null) {
            yfd.i(wwbVar, hqbVar2);
        } else {
            wwbVar.b(hqbVar3);
        }
        while (true) {
            int i2 = wwbVar.G;
            if (i2 == 0) {
                return;
            }
            hqb hqbVar4 = (hqb) wwbVar.m(i2 - 1);
            if ((hqbVar4.H & 262144) != 0) {
                for (hqb hqbVar5 = hqbVar4; hqbVar5 != null && hqbVar5.R; hqbVar5 = hqbVar5.J) {
                    if ((hqbVar5.G & 262144) != 0) {
                        ?? J = hqbVar5;
                        ?? wwbVar2 = 0;
                        while (J != 0) {
                            if (J instanceof p6i) {
                                p6i p6iVar2 = (p6i) J;
                                o6i o6iVar = (x44.r(p6iVar.o(), p6iVar2.o()) && p6iVar.getClass() == p6iVar2.getClass()) ? (o6i) bz7Var.invoke(p6iVar2) : o6i.E;
                                if (o6iVar == o6i.G) {
                                    return;
                                }
                                if (o6iVar == o6i.F) {
                                    break;
                                }
                            } else if ((J.G & 262144) != 0 && (J instanceof qw5)) {
                                hqb hqbVar6 = ((qw5) J).T;
                                int i3 = 0;
                                J = J;
                                wwbVar2 = wwbVar2;
                                while (hqbVar6 != null) {
                                    if ((hqbVar6.G & 262144) != 0) {
                                        i3++;
                                        wwbVar2 = wwbVar2;
                                        if (i3 == 1) {
                                            J = hqbVar6;
                                        } else {
                                            if (wwbVar2 == 0) {
                                                wwbVar2 = new wwb(0, new hqb[16]);
                                            }
                                            if (J != 0) {
                                                wwbVar2.b(J);
                                                J = 0;
                                            }
                                            wwbVar2.b(hqbVar6);
                                        }
                                    }
                                    hqbVar6 = hqbVar6.J;
                                    J = J;
                                    wwbVar2 = wwbVar2;
                                }
                                if (i3 == 1) {
                                }
                            }
                            J = yfd.j(wwbVar2);
                        }
                    }
                }
            }
            yfd.i(wwbVar, hqbVar4);
        }
    }

    public static final k92 q(pz7 pz7Var) {
        return new k92(pz7Var, im6.E, -2, py1.E);
    }

    public static final void q0(int i2, int i3) {
        if (!(i2 > 0 && i3 > 0)) {
            e39.a("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            return;
        }
        e39.a("minLines " + i2 + " must be less than or equal to maxLines " + i3);
    }

    public static final wa2 r(kp7 kp7Var) {
        if (!(kp7Var instanceof wa2)) {
            kp7Var = new ya2(kp7Var);
        }
        return (wa2) kp7Var;
    }

    public static final py8 r0(int i2, ld4 ld4Var) throws XmlPullParserException, IOException {
        e18 e18Var = (e18) ld4Var;
        Context context = (Context) e18Var.j(w00.b);
        Resources resources = (Resources) e18Var.j(w00.c);
        Resources.Theme theme = context.getTheme();
        Configuration configuration = resources.getConfiguration();
        boolean zF = e18Var.f(configuration) | e18Var.d(i2) | e18Var.f(resources) | e18Var.f(theme);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i2, typedValue, true);
            XmlResourceParser xml = resources.getXml(i2);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            objN = U(theme, resources, xml, typedValue.changingConfigurations).a;
            e18Var.k0(objN);
        }
        return (py8) objN;
    }

    public static final yp7 s(th2 th2Var, i53 i53Var) {
        return new yp7(th2Var, i53Var, 1);
    }

    public static final Object s0(bz7 bz7Var, xzg xzgVar) {
        return O(xzgVar.getContext()).b0(xzgVar, new v78(1, bz7Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable t(defpackage.kp7 r5, defpackage.lp7 r6, defpackage.vp4 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.cq7
            if (r0 == 0) goto L13
            r0 = r7
            cq7 r0 = (defpackage.cq7) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            cq7 r0 = new cq7
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            dae r5 = r0.E
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L28
            return r3
        L28:
            r6 = move-exception
            goto L4a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L30:
            dae r7 = defpackage.vb7.h(r7)
            q73 r1 = new q73     // Catch: java.lang.Throwable -> L48
            r4 = 2
            r1.<init>(r6, r4, r7)     // Catch: java.lang.Throwable -> L48
            r0.E = r7     // Catch: java.lang.Throwable -> L48
            r0.G = r2     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r5.a(r1, r0)     // Catch: java.lang.Throwable -> L48
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L47
            return r6
        L47:
            return r3
        L48:
            r6 = move-exception
            r5 = r7
        L4a:
            java.lang.Object r5 = r5.E
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L56
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L78
        L56:
            c45 r7 = r0.getContext()
            dd8 r0 = defpackage.dd8.J
            a45 r7 = r7.x0(r0)
            lf9 r7 = (defpackage.lf9) r7
            if (r7 == 0) goto L79
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L6b
            goto L79
        L6b:
            java.util.concurrent.CancellationException r7 = r7.H()
            if (r7 == 0) goto L79
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L78
            goto L79
        L78:
            throw r6
        L79:
            if (r5 != 0) goto L7c
            return r6
        L7c:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L84
            defpackage.mwa.p(r5, r6)
            throw r5
        L84:
            defpackage.mwa.p(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.t(kp7, lp7, vp4):java.io.Serializable");
    }

    public static final Object u(kp7 kp7Var, pz7 pz7Var, tp4 tp4Var) {
        int i2 = sq7.a;
        Object objA = l(l0(kp7Var, new rq7(pz7Var, null, 0)), 0, py1.E).a(p6c.E, tp4Var);
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (objA != m45Var) {
            objA = ieiVar;
        }
        return objA == m45Var ? objA : ieiVar;
    }

    public static final void v(zmc zmcVar, ww7 ww7Var, ArrayList arrayList) {
        zmcVar.getClass();
        ww7Var.getClass();
        zmcVar.b(ww7Var, arrayList);
    }

    public static final sb0 w(sb0 sb0Var) {
        sb0 sb0VarC = sb0Var.c();
        int iB = sb0VarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            sb0VarC.e(i2, sb0Var.a(i2));
        }
        return sb0VarC;
    }

    public static void x(Object obj, String str, String str2) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static final kp7 y(kp7 kp7Var, long j) {
        if (j < 0) {
            sz6.p("Debounce timeout should not be negative");
            return null;
        }
        if (j == 0) {
            return kp7Var;
        }
        return new aj0(4, new tp7(new ay1(j, 2), kp7Var, null));
    }

    public static void z(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (pe5 pe5Var : (Set) it2.next()) {
                        for (iz5 iz5Var : pe5Var.a.c) {
                            if (iz5Var.c == 0) {
                                Set<pe5> set = (Set) map.get(new qe5(iz5Var.a, iz5Var.b == 2));
                                if (set != null) {
                                    for (pe5 pe5Var2 : set) {
                                        pe5Var.b.add(pe5Var2);
                                        pe5Var2.c.add(pe5Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<pe5> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (pe5 pe5Var3 : hashSet) {
                    if (pe5Var3.c.isEmpty()) {
                        hashSet2.add(pe5Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    pe5 pe5Var4 = (pe5) hashSet2.iterator().next();
                    hashSet2.remove(pe5Var4);
                    i2++;
                    for (pe5 pe5Var5 : pe5Var4.b) {
                        pe5Var5.c.remove(pe5Var4);
                        if (pe5Var5.c.isEmpty()) {
                            hashSet2.add(pe5Var5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (pe5 pe5Var6 : hashSet) {
                    if (!pe5Var6.c.isEmpty() && !pe5Var6.b.isEmpty()) {
                        arrayList2.add(pe5Var6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            p94 p94Var = (p94) it.next();
            pe5 pe5Var7 = new pe5(p94Var);
            for (qzd qzdVar : p94Var.b) {
                boolean z = p94Var.e == 0;
                qe5 qe5Var = new qe5(qzdVar, !z);
                if (!map.containsKey(qe5Var)) {
                    map.put(qe5Var, new HashSet());
                }
                Set set2 = (Set) map.get(qe5Var);
                if (!set2.isEmpty() && z) {
                    e0.d(qzdVar, ".", "Multiple components provide ");
                    return;
                }
                set2.add(pe5Var7);
            }
        }
    }

    public abstract Object N(pl9 pl9Var);

    public abstract j8 a0(pl9 pl9Var, Object obj);
}
