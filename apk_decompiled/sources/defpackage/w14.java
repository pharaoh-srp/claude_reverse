package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.sync.FinishAuthRequest;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;
import com.anthropic.claude.widget.ClaudeAppWidgetReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class w14 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w14(kl8 kl8Var, eyh eyhVar, eyh eyhVar2, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 25;
        this.G = kl8Var;
        this.I = eyhVar;
        this.J = eyhVar2;
        this.H = str;
    }

    private final Object d(Object obj) {
        ChatConversationWithProjectReference chatConversationWithProjectReferenceT;
        String str = (String) this.H;
        ft2 ft2Var = (ft2) this.J;
        kq4 kq4Var = (kq4) this.I;
        int i = this.F;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        try {
            if (i == 0) {
                sf5.h0(obj);
                xz8 xz8Var = kq4Var.b;
                this.I = kq4Var;
                this.F = 1;
                xz8Var.f(ft2Var, str, this);
                if (ieiVar != m45Var) {
                }
                return m45Var;
            }
            if (i != 1) {
                if (i != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                return ieiVar;
            }
            sf5.h0(obj);
            if (ft2Var.a() && (chatConversationWithProjectReferenceT = kq4Var.b.t(str)) != null && !chatConversationWithProjectReferenceT.is_temporary()) {
                zs2 zs2VarU = kq4Var.a.u();
                List listW = x44.W(new at2(ft2Var, str));
                this.I = null;
                this.G = ft2Var;
                this.F = 2;
                if (zs2VarU.b(listW, this) == m45Var) {
                    return m45Var;
                }
            }
            return ieiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            List list = xah.a;
            xah.f(e2, "Failed to " + ((Object) ("persist prepend to " + ft2Var)), ozf.F, null, 24);
            return ieiVar;
        }
    }

    private final Object n(Object obj) throws Throwable {
        String str = (String) this.H;
        bt2 bt2Var = (bt2) this.J;
        kq4 kq4Var = (kq4) this.I;
        int i = this.F;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        try {
            if (i == 0) {
                sf5.h0(obj);
                xz8 xz8Var = kq4Var.b;
                this.I = kq4Var;
                this.F = 1;
                xz8Var.q(bt2Var, str, this);
                if (ieiVar != m45Var) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                return ieiVar;
            }
            sf5.h0(obj);
            zs2 zs2VarU = kq4Var.a.u();
            this.I = null;
            this.G = bt2Var;
            this.F = 2;
            Object objG = u00.G(this, zs2VarU.a, false, true, new lj2(zs2VarU, bt2Var, str));
            if (objG != m45Var) {
                objG = ieiVar;
            }
            return objG == m45Var ? m45Var : ieiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            List list = xah.a;
            xah.f(e2, "Failed to " + ((Object) ("remove from " + bt2Var + " list")), ozf.F, null, 24);
            return ieiVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.H
            lp7 r0 = (defpackage.lp7) r0
            int r1 = r6.F
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L16
            java.lang.Object r0 = r6.G
            um r0 = (defpackage.um) r0
            defpackage.sf5.h0(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L14
            goto L4a
        L14:
            r7 = move-exception
            goto L3f
        L16:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L1c:
            defpackage.sf5.h0(r7)
            java.lang.Object r7 = r6.I
            kp7 r7 = (defpackage.kp7) r7
            java.lang.Object r1 = r6.J
            vs4 r1 = (defpackage.vs4) r1
            um r4 = new um
            r5 = 8
            r4.<init>(r1, r5, r0)
            r6.H = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3d
            r6.G = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3d
            r6.F = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3d
            java.lang.Object r6 = r7.a(r4, r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3d
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L4a
            return r7
        L3d:
            r7 = move-exception
            r0 = r4
        L3f:
            java.lang.Object r1 = r7.E
            if (r1 != r0) goto L4d
            c45 r6 = r6.getContext()
            defpackage.knk.u(r6)
        L4a:
            iei r6 = defpackage.iei.a
            return r6
        L4d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w14.p(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        int i = this.F;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        e58 e58Var = (e58) this.G;
        r0h r0hVar = e58Var.a;
        String str = e58Var.b;
        FinishAuthRequest finishAuthRequest = new FinishAuthRequest((String) this.H, (String) this.I, null, (String) this.J);
        this.F = 1;
        Object objC = r0hVar.c(str, finishAuthRequest, this);
        m45 m45Var = m45.E;
        return objC == m45Var ? m45Var : objC;
    }

    private final Object s(Object obj) {
        Context context = (Context) this.I;
        ClaudeAppWidgetReceiver claudeAppWidgetReceiver = (ClaudeAppWidgetReceiver) this.H;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            l45 l45Var = (l45) this.G;
            ClaudeAppWidgetReceiver.a(claudeAppWidgetReceiver, l45Var, context);
            int[] iArr = (int[]) this.J;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(gb9.k(l45Var, null, new o41(claudeAppWidgetReceiver, context, i2, null, 4), 3));
            }
            this.F = 1;
            Object objH = nvk.h(arrayList, this);
            m45 m45Var = m45.E;
            if (objH == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        if (r0 == r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r0 == r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w14.t(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj) throws Throwable {
        rv8 rv8Var;
        Context context = (Context) this.H;
        int i = this.F;
        if (i != 0) {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rv8Var = (rv8) this.G;
            try {
                sf5.h0(obj);
                context.unregisterReceiver(rv8Var);
                return obj;
            } catch (Throwable th) {
                th = th;
                context.unregisterReceiver(rv8Var);
                throw th;
            }
        }
        sf5.h0(obj);
        rv8 rv8Var2 = new rv8(new w95((l45) this.G, 25, (dv) this.J));
        context.registerReceiver(rv8Var2, rv8.c);
        try {
            rv8Var2.a(context);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            py pyVar = (py) this.I;
            this.G = rv8Var2;
            this.F = 1;
            obj = pyVar.invoke(this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
            rv8Var = rv8Var2;
            context.unregisterReceiver(rv8Var);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            rv8Var = rv8Var2;
            context.unregisterReceiver(rv8Var);
            throw th;
        }
    }

    private final Object w(Object obj) {
        Object next;
        xne xneVar = (xne) this.G;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            spe speVarA = aoe.a((he6) this.H, xneVar);
            Iterator it = speVarA.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((szd) next) instanceof gz5) {
                    break;
                }
            }
            gz5 gz5Var = next instanceof gz5 ? (gz5) next : null;
            int i2 = gz5Var != null ? gz5Var.E : 160;
            int i3 = ((xne) this.I).d.E;
            String str = speVarA.b;
            String str2 = str + "-" + i3 + "dpi";
            np5 np5Var = (np5) this.J;
            ox8 ox8Var = new ox8(i2, i3, 0);
            this.G = null;
            this.F = 1;
            epk epkVar = rx8.d;
            px8 px8Var = new px8(ox8Var, np5Var, str, null);
            epkVar.getClass();
            obj = fd9.N(new ky0(epkVar, str2, px8Var, null), this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        obj.getClass();
        return ((bw8) obj).a;
    }

    private final Object x(Object obj) {
        String str;
        vc9 vc9Var;
        Set setT1;
        m45 m45Var = m45.E;
        int i = this.F;
        if (i != 0 && i != 1) {
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        do {
            ConcurrentHashMap concurrentHashMap = ((md9) this.G).c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((vc9) entry.getValue()).b());
            }
            Set setO0 = dxf.o0(((mdg) this.H).G, linkedHashMap.keySet());
            mdg mdgVar = (mdg) this.H;
            Iterator it = setO0.iterator();
            while (it.hasNext()) {
                mdgVar.remove((String) it.next());
            }
            ((mdg) this.H).putAll(linkedHashMap);
            nwb nwbVar = (nwb) this.I;
            md9 md9Var = (md9) this.G;
            synchronized (md9Var.f) {
                str = (String) w44.V0(md9Var.f);
            }
            cpc cpcVar = (str == null || (vc9Var = (vc9) md9Var.c.get(str)) == null) ? null : new cpc(str, vc9Var.b());
            nwbVar.setValue(cpcVar != null ? (zc9) cpcVar.F : null);
            nwb nwbVar2 = (nwb) this.J;
            md9 md9Var2 = (md9) this.G;
            synchronized (md9Var2.f) {
                setT1 = w44.t1(md9Var2.f);
            }
            nwbVar2.setValue(setT1);
            this.F = 1;
        } while (d4c.K(250L, this) != m45Var);
        return m45Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new w14((i) this.G, (String) this.H, (b04) this.I, (kl1) this.J, tp4Var, 0);
            case 1:
                return new w14((i) this.G, (String) this.H, (n58) this.I, (String) this.J, tp4Var, 1);
            case 2:
                return new w14(tp4Var, (i) this.G);
            case 3:
                w14 w14Var = new w14((i) this.G, this.I, this.J, tp4Var, 3);
                w14Var.H = obj;
                return w14Var;
            case 4:
                return new w14((i) this.G, (String) this.H, (b04) this.I, (ei) this.J, tp4Var, 4);
            case 5:
                w14 w14Var2 = new w14((i) this.G, this.I, this.J, tp4Var, 5);
                w14Var2.H = obj;
                return w14Var2;
            case 6:
                return new w14((String) this.H, (op3) this.G, (ybg) this.I, (Context) this.J, tp4Var);
            case 7:
                return new w14(tp4Var, (ybg) this.I, (i) this.G, (String) this.H, (String) this.J);
            case 8:
                return new w14((yc4) this.G, (ScrollCaptureSession) this.H, (Rect) this.I, (Consumer) this.J, tp4Var, 8);
            case 9:
                w14 w14Var3 = new w14((uj4) this.J, tp4Var);
                w14Var3.I = obj;
                return w14Var3;
            case 10:
                return new w14((pz7) this.G, (bz7) this.H, (zy7) this.I, (nwb) this.J, tp4Var, 10);
            case 11:
                w14 w14Var4 = new w14((List) this.H, (jkf) this.I, (oq4) this.J, tp4Var, 11);
                w14Var4.G = obj;
                return w14Var4;
            case 12:
                return new w14((h86) this.G, (p05) this.H, (Context) this.I, (Uri) this.J, tp4Var, 12);
            case 13:
                return new w14((f) this.G, (String) this.H, (ConwaySuggestConnectorsOutputConnectorsItem) this.I, (vi4) this.J, tp4Var, 13);
            case 14:
                w14 w14Var5 = new w14((p05) this.I, (hsf) this.J, tp4Var, 14);
                w14Var5.H = obj;
                return w14Var5;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new w14((ss4) this.G, (String) this.H, (String) this.I, (String) this.J, tp4Var, 15);
            case 16:
                w14 w14Var6 = new w14(tp4Var, (bz7) this.J, (cve) this.I);
                w14Var6.H = obj;
                return w14Var6;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new w14((List) this.I, (kq4) this.J, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                w14 w14Var7 = new w14((ft2) this.J, (String) this.H, tp4Var, 18);
                w14Var7.I = obj;
                return w14Var7;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                w14 w14Var8 = new w14((ft2) this.J, (String) this.H, tp4Var, 19);
                w14Var8.I = obj;
                return w14Var8;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new w14((x0a) this.G, (bz7) this.H, (o72) this.I, (b79) this.J, tp4Var, 20);
            case 21:
                return new w14((ik6) this.G, (bz7) this.H, (zy7) this.I, (zy7) this.J, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                w14 w14Var9 = new w14((kp7) this.I, (vs4) this.J, tp4Var, 22);
                w14Var9.H = obj;
                return w14Var9;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new w14((e58) this.G, (String) this.H, (String) this.I, (String) this.J, tp4Var, 23);
            case 24:
                w14 w14Var10 = new w14((ClaudeAppWidgetReceiver) this.H, (Context) this.I, (int[]) this.J, tp4Var, 24);
                w14Var10.G = obj;
                return w14Var10;
            case BuildConfig.VERSION_CODE /* 25 */:
                return new w14((kl8) this.G, (eyh) this.I, (eyh) this.J, (String) this.H, tp4Var);
            case 26:
                w14 w14Var11 = new w14((Context) this.H, (py) this.I, (dv) this.J, tp4Var, 26);
                w14Var11.G = obj;
                return w14Var11;
            case 27:
                w14 w14Var12 = new w14((he6) this.H, (xne) this.I, (np5) this.J, tp4Var, 27);
                w14Var12.G = obj;
                return w14Var12;
            case 28:
                return new w14((md9) this.G, (mdg) this.H, (nwb) this.I, (nwb) this.J, tp4Var, 28);
            default:
                return new w14((nwb) this.G, (koc) this.H, (mra) this.I, (ka2) this.J, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case 3:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case 8:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                return ((w14) create((g56) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 10:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 16:
                return ((w14) create((y4i) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((w14) create((guc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((w14) create((kq4) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((w14) create((kq4) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((w14) create((lp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 24:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 26:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 27:
                return ((w14) create((xne) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 28:
                ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            default:
                return ((w14) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0224, code lost:
    
        if (r8.a(r22) == r9) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0242, code lost:
    
        if (r2 != r9) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x054d, code lost:
    
        if (r3.b(r22, r2) == r9) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x09da, code lost:
    
        if (r0 == r9) goto L438;
     */
    /* JADX WARN: Path cross not found for [B:474:0x0aa2, B:481:0x0ab6], limit reached: 600 */
    /* JADX WARN: Path cross not found for [B:481:0x0ab6, B:474:0x0aa2], limit reached: 600 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023a A[PHI: r0 r4
      0x023a: PHI (r0v156 java.lang.Object) = (r0v154 java.lang.Object), (r0v160 java.lang.Object) binds: [B:107:0x0237, B:93:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r4v58 y4i) = (r4v57 y4i), (r4v61 y4i) binds: [B:107:0x0237, B:93:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:626:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:627:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:485:0x0ac6 -> B:486:0x0ac8). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w14.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w14(uj4 uj4Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 9;
        this.J = uj4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w14(tp4 tp4Var, bz7 bz7Var, cve cveVar) {
        super(2, tp4Var);
        this.E = 16;
        this.I = cveVar;
        this.J = bz7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w14(tp4 tp4Var, ybg ybgVar, i iVar, String str, String str2) {
        super(2, tp4Var);
        this.E = 7;
        this.G = iVar;
        this.I = ybgVar;
        this.H = str;
        this.J = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w14(tp4 tp4Var, i iVar) {
        super(2, tp4Var);
        this.E = 2;
        this.G = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w14(ft2 ft2Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = ft2Var;
        this.H = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w14(i iVar, Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = iVar;
        this.I = obj;
        this.J = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w14(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w14(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w14(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w14(String str, op3 op3Var, ybg ybgVar, Context context, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.H = str;
        this.G = op3Var;
        this.I = ybgVar;
        this.J = context;
    }
}
