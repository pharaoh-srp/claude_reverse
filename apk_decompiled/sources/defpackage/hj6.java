package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class hj6 implements br4, v0i, ia4, fri, unc, pcg, up4, j5i, gxg, bof, crc, c22 {
    public static final hj6 F = new hj6(1);
    public static final hj6 G = new hj6(3);
    public static final hj6 H = new hj6(4);
    public static final hj6 I = new hj6(6);
    public static final hj6 J = new hj6(7);
    public static final hj6 K = new hj6(8);
    public static final hj6 L = new hj6(9);
    public static final hj6 M = new hj6(11);
    public static final hj6 N = new hj6(12);
    public static final hj6 O = new hj6(13);
    public static final hj6 P = new hj6(14);
    public static final r8f Q = new r8f();
    public static final poc R = new poc(11);
    public static final hj6 S = new hj6(17);
    public static final poc T = new poc(12);
    public static final poc U = new poc(13);
    public static final hj6 V = new hj6(19);
    public static final /* synthetic */ hj6 W = new hj6(20);
    public static final /* synthetic */ hj6 X = new hj6(21);
    public static final /* synthetic */ hj6 Y = new hj6(22);
    public final /* synthetic */ int E;

    public hj6() {
        this.E = 29;
        lqa lqaVar = new lqa();
        ProtoAdapter<Instant> protoAdapter = ProtoAdapter.INSTANT;
        kce kceVar = jce.a;
        lqaVar.put(kceVar.b(Instant.class), protoAdapter);
        lqaVar.put(kceVar.b(String.class), ProtoAdapter.STRING);
        lqaVar.put(kceVar.b(n38.class), n38.N);
        lqaVar.put(kceVar.b(p38.class), p38.F);
        lqaVar.put(kceVar.b(an0.class), an0.e0);
        lqaVar.put(kceVar.b(cn0.class), cn0.G);
        lqaVar.put(kceVar.b(fqg.class), fqg.G);
        lqaVar.put(kceVar.b(hqg.class), hqg.G);
        lqaVar.c();
    }

    public static AutofillValue A(String str) {
        if (str.length() >= 5000) {
            str = (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? bsg.j1(4999, str) : bsg.j1(5000, str);
        }
        return AutofillValue.forText(str);
    }

    public static AutofillValue B(boolean z) {
        return AutofillValue.forToggle(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r6.W(r6.f0(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qai D(defpackage.wh3 r6, defpackage.cs9 r7, defpackage.cs9 r8) {
        /*
            int r0 = r6.a(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            vai r4 = r6.n0(r7, r2)
            boolean r5 = r6.d0(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            fhi r3 = r6.M(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            j7g r4 = r6.t(r3)
            l7g r4 = r6.m0(r4)
            boolean r4 = r6.R(r4)
            if (r4 == 0) goto L3b
            j7g r4 = r6.t(r8)
            l7g r4 = r6.m0(r4)
            boolean r4 = r6.R(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            u9i r4 = r6.f0(r3)
            u9i r5 = r6.f0(r8)
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            qai r3 = D(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L5a:
            u9i r7 = r6.f0(r7)
            qai r6 = r6.W(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj6.D(wh3, cs9, cs9):qai");
    }

    public static boolean E(wh3 wh3Var, cs9 cs9Var) {
        if (!wh3Var.w(wh3Var.f0(cs9Var))) {
            return false;
        }
        wh3Var.g(cs9Var);
        return (wh3Var.C(cs9Var) || wh3Var.a0(cs9Var) || !x44.r(wh3Var.Q(wh3Var.t(cs9Var)), wh3Var.Q(wh3Var.P(cs9Var)))) ? false : true;
    }

    public static boolean F(t9i t9iVar, q9i q9iVar, l7g l7gVar) {
        boolean zI;
        q9iVar.getClass();
        wh3 wh3Var = t9iVar.c;
        u9i u9iVarQ = wh3Var.Q(l7gVar);
        int iD = wh3Var.d(q9iVar);
        int iN = wh3Var.N(u9iVarQ);
        if (iD == iN && iD == wh3Var.a(l7gVar)) {
            for (int i = 0; i < iN; i++) {
                vai vaiVarN0 = wh3Var.n0(l7gVar, i);
                if (!wh3Var.d0(vaiVarN0)) {
                    fhi fhiVarM = wh3Var.M(vaiVarN0);
                    vai vaiVarK0 = wh3Var.k0(q9iVar, i);
                    wh3Var.G(vaiVarK0);
                    fhi fhiVarM2 = wh3Var.M(vaiVarK0);
                    int iK = wh3Var.k(wh3Var.W(u9iVarQ, i));
                    int iG = wh3Var.G(vaiVarN0);
                    if (iK == 0) {
                        throw null;
                    }
                    if (iG == 0) {
                        throw null;
                    }
                    if (iK == 3) {
                        iK = iG;
                    } else if (iG != 3 && iK != iG) {
                        iK = 0;
                    }
                    if (iK == 0) {
                        return t9iVar.a;
                    }
                    if (iK == 3) {
                        J(wh3Var, fhiVarM2, fhiVarM);
                        J(wh3Var, fhiVarM, fhiVarM2);
                    }
                    int i2 = t9iVar.f;
                    if (i2 > 100) {
                        xh6.d("Arguments depth is too high. Some related argument: ", fhiVarM2);
                        return false;
                    }
                    t9iVar.f = i2 + 1;
                    int iF = sq6.F(iK);
                    hj6 hj6Var = F;
                    if (iF == 0) {
                        zI = I(hj6Var, t9iVar, fhiVarM, fhiVarM2);
                    } else if (iF == 1) {
                        zI = I(hj6Var, t9iVar, fhiVarM2, fhiVarM);
                    } else {
                        if (iF != 2) {
                            wg6.i();
                            return false;
                        }
                        zI = y(t9iVar, fhiVarM2, fhiVarM);
                    }
                    t9iVar.f--;
                    if (!zI) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a7 A[EDGE_INSN: B:350:0x02a7->B:168:0x02a7 BREAK  A[LOOP:11: B:159:0x0288->B:351:0x0288]] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Type inference failed for: r2v0, types: [wh3] */
    /* JADX WARN: Type inference failed for: r9v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
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
    public static boolean I(defpackage.hj6 r23, defpackage.t9i r24, defpackage.cs9 r25, defpackage.cs9 r26) {
        /*
            Method dump skipped, instruction units count: 1371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj6.I(hj6, t9i, cs9, cs9):boolean");
    }

    public static void J(wh3 wh3Var, cs9 cs9Var, cs9 cs9Var2) {
        q9i q9iVarN = wh3Var.n(cs9Var);
        if (q9iVarN instanceof lc2) {
            lc2 lc2Var = (lc2) q9iVarN;
            if (!wh3Var.b(lc2Var) && wh3Var.d0(wh3Var.o(wh3Var.j(lc2Var))) && wh3Var.A(lc2Var) == 1) {
                wh3Var.f0(cs9Var2);
            }
        }
    }

    public static ViewStructure K(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public static tf2 L(int i, int i2) {
        return i2 <= 1 ? tf2.F : i == 0 ? tf2.G : i == i2 - 1 ? tf2.I : tf2.H;
    }

    public static PendingIntent M(Context context, String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        context.getClass();
        intent.setComponent(new ComponentName(context.getPackageName(), "com.anthropic.claude.deeplink.DeepLinkActivity"));
        intent.setFlags(805306368);
        intent.putExtra("com.anthropic.claude.intent.extra.OPEN_CONWAY", true);
        if (str != null) {
            intent.putExtra("com.anthropic.claude.intent.extra.ACCOUNT_ID", str);
        }
        if (str2 != null) {
            intent.putExtra("com.anthropic.claude.intent.extra.ORGANIZATION_ID", str2);
        }
        PendingIntent activity = PendingIntent.getActivity(context, 9200, intent, 201326592);
        activity.getClass();
        return activity;
    }

    public static cpc N(Context context, String str, String str2, String str3, String str4) {
        Object hreVar;
        context.getClass();
        str.getClass();
        str2.getClass();
        if (Build.VERSION.SDK_INT >= 33 && x44.x(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return new cpc(Boolean.FALSE, "POST_NOTIFICATIONS not granted");
        }
        try {
            n8c n8cVar = new n8c(context);
            n8cVar.b.createNotificationChannel(d7c.a(context));
            o7c o7cVar = new o7c(context, "conway_notify_v2");
            o7cVar.z.icon = R.drawable.claude_spark;
            o7cVar.e = o7c.d(str);
            o7cVar.f = o7c.d(str2);
            n7c n7cVar = new n7c(false);
            n7cVar.f = o7c.d(str2);
            o7cVar.o(n7cVar);
            o7cVar.j(16, true);
            o7cVar.j = 1;
            o7cVar.g = M(context, str3, str4);
            Notification notificationC = o7cVar.c();
            notificationC.getClass();
            n8cVar.c(notificationC);
            hreVar = new cpc(Boolean.TRUE, null);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Throwable thA = jre.a(hreVar);
        if (thA != null) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    String strS = sq6.s(zfa.a, thA, "mobile_notify failed: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, "Conway", strS);
                    }
                }
            }
            hreVar = new cpc(Boolean.FALSE, thA.getMessage());
        }
        return (cpc) hreVar;
    }

    public static CharSequence P(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public static String Q(jl9 jl9Var) {
        jl9Var.getClass();
        if (jl9Var instanceof gl9) {
            return "[".concat(Q(((gl9) jl9Var).i));
        }
        if (jl9Var instanceof il9) {
            nk9 nk9Var = ((il9) jl9Var).i;
            return nk9Var != null ? nk9Var.G : "V";
        }
        if (jl9Var instanceof hl9) {
            return vb7.s(new StringBuilder("L"), ((hl9) jl9Var).i, ';');
        }
        wg6.i();
        return null;
    }

    public static int q(ViewStructure viewStructure) {
        return viewStructure.addChildCount(1);
    }

    public static final boolean r(wh3 wh3Var, l7g l7gVar) {
        if (wh3Var.J(l7gVar)) {
            return true;
        }
        if (!(l7gVar instanceof lc2)) {
            return false;
        }
        vai vaiVarO = wh3Var.o(wh3Var.j((lc2) l7gVar));
        return !wh3Var.d0(vaiVarO) && wh3Var.J(wh3Var.P(wh3Var.M(vaiVarO)));
    }

    public static final boolean t(wh3 wh3Var, t9i t9iVar, l7g l7gVar, l7g l7gVar2, boolean z) {
        Collection<cs9> collectionY = wh3Var.y(l7gVar);
        if ((collectionY instanceof Collection) && collectionY.isEmpty()) {
            return false;
        }
        for (cs9 cs9Var : collectionY) {
            if (x44.r(wh3Var.f0(cs9Var), wh3Var.Q(l7gVar2))) {
                return true;
            }
            if (z && I(F, t9iVar, l7gVar2, cs9Var)) {
                return true;
            }
        }
        return false;
    }

    public static List u(t9i t9iVar, l7g l7gVar, v9i v9iVar) {
        uvk uvkVarE;
        s9i s9iVar = s9i.d;
        wh3 wh3Var = t9iVar.c;
        wh3Var.q0(l7gVar, v9iVar);
        if (wh3Var.p(v9iVar) || !wh3Var.l(l7gVar)) {
            if (!wh3Var.l0(v9iVar)) {
                pbg pbgVar = new pbg();
                t9iVar.c();
                ArrayDeque arrayDeque = t9iVar.g;
                arrayDeque.getClass();
                qbg qbgVar = t9iVar.h;
                qbgVar.getClass();
                arrayDeque.push(l7gVar);
                while (!arrayDeque.isEmpty()) {
                    if (qbgVar.F > 1000) {
                        StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                        sb.append(l7gVar);
                        wg6.k(sb, ". Supertypes = ", w44.S0(qbgVar, null, null, null, null, 63));
                        return null;
                    }
                    l7g l7gVar2 = (l7g) arrayDeque.pop();
                    l7gVar2.getClass();
                    if (qbgVar.add(l7gVar2)) {
                        l7g l7gVarL = wh3Var.L(l7gVar2);
                        if (l7gVarL == null) {
                            l7gVarL = l7gVar2;
                        }
                        if (wh3Var.X(wh3Var.Q(l7gVarL), v9iVar)) {
                            pbgVar.add(l7gVarL);
                            uvkVarE = s9iVar;
                        } else {
                            uvkVarE = wh3Var.a(l7gVarL) == 0 ? s9i.c : wh3Var.E(l7gVarL);
                        }
                        uvk uvkVar = uvkVarE.equals(s9iVar) ? null : uvkVarE;
                        if (uvkVar != null) {
                            Iterator it = wh3Var.v(wh3Var.Q(l7gVar2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(uvkVar.i(t9iVar, (cs9) it.next()));
                            }
                        }
                    }
                }
                t9iVar.a();
                return pbgVar;
            }
            if (wh3Var.X(wh3Var.Q(l7gVar), v9iVar)) {
                j7g j7gVarL = wh3Var.L(l7gVar);
                if (j7gVarL != null) {
                    l7gVar = j7gVarL;
                }
                return x44.W(l7gVar);
            }
        }
        return lm6.E;
    }

    public static List v(t9i t9iVar, l7g l7gVar, v9i v9iVar) {
        int i;
        List listU = u(t9iVar, l7gVar, v9iVar);
        wh3 wh3Var = t9iVar.c;
        if (listU.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listU) {
                q9i q9iVarF = wh3Var.f((l7g) obj);
                int iD = wh3Var.d(q9iVarF);
                while (true) {
                    if (i >= iD) {
                        arrayList.add(obj);
                        break;
                    }
                    i = wh3Var.e0(wh3Var.M(wh3Var.k0(q9iVarF, i))) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listU;
    }

    public static jl9 x(String str) {
        nk9 nk9Var;
        char cCharAt = str.charAt(0);
        nk9[] nk9VarArrValues = nk9.values();
        int length = nk9VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                nk9Var = null;
                break;
            }
            nk9Var = nk9VarArrValues[i];
            if (nk9Var.G.charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (nk9Var != null) {
            return new il9(nk9Var);
        }
        if (cCharAt == 'V') {
            return new il9(null);
        }
        if (cCharAt == '[') {
            return new gl9(x(str.substring(1)));
        }
        if (cCharAt == 'L') {
            bsg.z0(str, ';');
        }
        return new hl9(vb7.j(1, 1, str));
    }

    public static boolean y(t9i t9iVar, cs9 cs9Var, cs9 cs9Var2) {
        cs9Var.getClass();
        cs9Var2.getClass();
        wh3 wh3Var = t9iVar.c;
        if (cs9Var == cs9Var2) {
            return true;
        }
        if (E(wh3Var, cs9Var) && E(wh3Var, cs9Var2)) {
            fhi fhiVarD = t9iVar.d(t9iVar.e(cs9Var));
            fhi fhiVarD2 = t9iVar.d(t9iVar.e(cs9Var2));
            j7g j7gVarT = wh3Var.t(fhiVarD);
            if (!wh3Var.X(wh3Var.f0(fhiVarD), wh3Var.f0(fhiVarD2))) {
                return false;
            }
            if (wh3Var.a(j7gVarT) == 0) {
                return wh3Var.q(fhiVarD) || wh3Var.q(fhiVarD2) || wh3Var.b0(j7gVarT) == wh3Var.b0(wh3Var.t(fhiVarD2));
            }
        }
        hj6 hj6Var = F;
        return I(hj6Var, t9iVar, cs9Var, cs9Var2) && I(hj6Var, t9iVar, cs9Var2, cs9Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r1.equals("stopped") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        return defpackage.fc1.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r1.equals("killed") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fc1 z(java.lang.String r1) {
        /*
            if (r1 == 0) goto L37
            int r0 = r1.hashCode()
            switch(r0) {
                case -1884319283: goto L2b;
                case -1402931637: goto L1f;
                case -1281977283: goto L13;
                case -1131353987: goto La;
                default: goto L9;
            }
        L9:
            goto L37
        La:
            java.lang.String r0 = "killed"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L34
            goto L37
        L13:
            java.lang.String r0 = "failed"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            goto L37
        L1c:
            fc1 r1 = defpackage.fc1.H
            return r1
        L1f:
            java.lang.String r0 = "completed"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L28
            goto L37
        L28:
            fc1 r1 = defpackage.fc1.G
            return r1
        L2b:
            java.lang.String r0 = "stopped"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L34
            goto L37
        L34:
            fc1 r1 = defpackage.fc1.I
            return r1
        L37:
            fc1 r1 = defpackage.fc1.F
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj6.z(java.lang.String):fc1");
    }

    public String C(Object... objArr) {
        return mp0.M0(objArr, null, hashCode() + ", ", null, null, 61);
    }

    public boolean G(t9i t9iVar, fhi fhiVar, fhi fhiVar2) {
        fhiVar.getClass();
        fhiVar2.getClass();
        return I(this, t9iVar, fhiVar, fhiVar2);
    }

    @Override // defpackage.v0i
    public String H(Context context, boolean z, boolean z2) {
        int i = this.E;
        context.getClass();
        switch (i) {
            case 7:
                String string = context.getString(z2 ? R.string.create_event_tool_status_creation_failed : z ? R.string.create_event_tool_status_creation_success : R.string.create_event_tool_status_creating);
                string.getClass();
                return string;
            case 11:
                String string2 = context.getString(z2 ? R.string.map_display_tool_status_failed : z ? R.string.map_display_tool_status_success : R.string.map_display_tool_status_loading);
                string2.getClass();
                return string2;
            default:
                String string3 = context.getString(z2 ? R.string.time_retrieval_tool_status_check_failed : z ? R.string.time_retrieval_tool_status_check_success : R.string.time_retrieval_tool_status_checking);
                string3.getClass();
                return string3;
        }
    }

    public boolean O(jw7 jw7Var) {
        String str = jw7Var.o;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.gxg
    public r5l a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = gxe.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? ez1.E(bundle) : ez1.E(null);
    }

    @Override // defpackage.j5i
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.c22
    public byte[] b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public void c(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(503323711);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            uuj.a(d4c.j0(R.string.add_to_home, e18Var), a.a(ud0.A0, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i2 << 6) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qy2(this, zy7Var, i, 3);
        }
    }

    public void d(int i, ld4 ld4Var, zy7 zy7Var, boolean z) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(901479145);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            uuj.a(d4c.j0(z ? R.string.chat_change_project : R.string.chat_add_project, e18Var), a.a(ud0.e1, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i2 << 3) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new py2(this, z, zy7Var, i, 0);
        }
    }

    @Override // defpackage.pcg
    public int e(int i, int i2, int i3, int i4) {
        return (((i - i3) - i4) / 2) - (i2 / 2);
    }

    public void f(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2146673397);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.chat_delete, e18Var);
            bpc bpcVarA = a.a(ud0.C1, e18Var);
            float f = wcb.a;
            uuj.a(strJ0, bpcVarA, zy7Var, null, null, false, null, nrk.e(e18Var), null, null, 0, 0, e18Var, 64 | ((i2 << 6) & 896), 3960);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qy2(this, zy7Var, i, 1);
        }
    }

    @Override // defpackage.up4
    public Object g(d5h d5hVar) throws IOException {
        if (d5hVar.g()) {
            return (Bundle) d5hVar.e();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(d5hVar.d()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", d5hVar.d());
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        return (tie) obj;
    }

    public void i(String str, zy7 zy7Var, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1561587076);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            uuj.a(str, a.a(ud0.e1, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, (i2 & 14) | 64 | ((i2 << 3) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(this, i, str, zy7Var, 26);
        }
    }

    public void j(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(257877295);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            uuj.a(d4c.j0(R.string.chat_remove_from_project, e18Var), a.a(ud0.f1, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i2 << 6) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qy2(this, zy7Var, i, 0);
        }
    }

    public void k(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-699683810);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            uuj.a(d4c.j0(R.string.chat_rename, e18Var), a.a(ud0.e0, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i2 << 6) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qy2(this, zy7Var, i, 2);
        }
    }

    public void l(zy7 zy7Var, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1228913955);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            uuj.a(d4c.j0(R.string.generic_share, e18Var), a.a(ud0.o1, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i2 << 6) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(this, zy7Var, i, 22);
        }
    }

    @Override // defpackage.unc
    public int m(nz9 nz9Var, int i) {
        return i;
    }

    @Override // defpackage.fri
    public Object n(com.airbnb.lottie.parser.moshi.a aVar, float f) {
        switch (this.E) {
            case 9:
                return Integer.valueOf(Math.round(ej9.d(aVar) * f));
            default:
                int iE = aVar.e();
                if (iE != 1 && iE != 3) {
                    if (iE != 7) {
                        sz6.p("Cannot convert json to point. Next token is ".concat(ms6.A(iE)));
                        return null;
                    }
                    PointF pointF = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    while (aVar.hasNext()) {
                        aVar.skipValue();
                    }
                    return pointF;
                }
                return ej9.b(aVar, f);
        }
    }

    @Override // defpackage.bof
    public String o(Object obj) {
        UUID uuid = (UUID) obj;
        uuid.getClass();
        String string = uuid.toString();
        string.getClass();
        return string;
    }

    public void p(int i, ld4 ld4Var, zy7 zy7Var, boolean z) {
        int i2;
        int i3;
        int i4;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(274554126);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                ud0 ud0Var = ud0.d;
                i3 = R.string.chat_unstar;
                i4 = R.drawable.anthropicon_star_slash;
            } else {
                ud0 ud0Var2 = ud0.d;
                i3 = R.string.chat_star;
                i4 = R.drawable.anthropicon_star;
            }
            uuj.a(d4c.j0(i3, e18Var), u00.D(i4, 0, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i2 << 3) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new py2(this, z, zy7Var, i, 1);
        }
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        Object objI = el5Var.i(new qzd(rdi.class, Executor.class));
        objI.getClass();
        return d4c.N((Executor) objI);
    }

    public String toString() {
        switch (this.E) {
            case g.MAX_FIELD_NUMBER /* 17 */:
                return "Center";
            default:
                return super.toString();
        }
    }

    public yuj w(jw7 jw7Var) {
        int i;
        int i2;
        String str = jw7Var.o;
        if (str != null) {
            i = 1;
            i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new ej0(i2);
                case "application/x-icy":
                    return new fv8();
                case "application/id3":
                    return new iv8(null);
                case "application/x-emsg":
                    return new ej0(i);
                case "application/x-scte35":
                    return new oig();
            }
        }
        sz6.p(ij0.i("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public /* synthetic */ hj6(int i) {
        this.E = i;
    }
}
