package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppURLActionType;
import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppViaURL;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.types.strings.ChatId;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e7 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ e7(bz7 bz7Var, zy7 zy7Var, bz7 bz7Var2, lfa lfaVar, m8j m8jVar, FrameLayout.LayoutParams layoutParams) {
        this.E = 0;
        this.F = bz7Var;
        this.H = zy7Var;
        this.G = bz7Var2;
        this.I = lfaVar;
        this.J = m8jVar;
        this.K = layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [lsc] */
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
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        WebView webView;
        int i = this.E;
        int i2 = 0;
        sfa sfaVar = sfa.INFO;
        int i3 = 2;
        iei ieiVar = iei.a;
        ?? r10 = 0;
        Object obj2 = this.K;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.H;
        Object obj6 = this.G;
        Object obj7 = this.F;
        switch (i) {
            case 0:
                bz7 bz7Var = (bz7) obj7;
                zy7 zy7Var = (zy7) obj5;
                bz7 bz7Var2 = (bz7) obj6;
                lfa lfaVar = (lfa) obj4;
                m8j m8jVar = (m8j) obj3;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj2;
                Context context = (Context) obj;
                context.getClass();
                try {
                    webView = (WebView) bz7Var.invoke(context);
                    break;
                } catch (Exception e) {
                    List list = xah.a;
                    xah.f(e, "Error creating WebView", null, null, 28);
                    zy7Var.a();
                    webView = null;
                }
                if (webView != null) {
                    bz7Var2.invoke(webView);
                    webView.setWebViewClient(lfaVar);
                    r10 = webView;
                }
                m8jVar.e.setValue(r10);
                View frameLayout = webView;
                if (webView == null) {
                    frameLayout = new FrameLayout(context);
                }
                frameLayout.setLayoutParams(layoutParams);
                return frameLayout;
            case 1:
                lwc lwcVar = (lwc) obj6;
                kdg kdgVar = (kdg) obj5;
                an anVar = (an) obj4;
                Instant instant = (Instant) obj3;
                String str = (String) obj2;
                bz7 bz7Var3 = (bz7) obj7;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                if (lwcVar != null) {
                    j0a.V(j0aVar, ij0.i("tool_approval_", lwcVar.b), null, new ta4(633608053, true, new ii(lwcVar, i3, anVar)), 2);
                }
                j0a.X(j0aVar, kdgVar.size(), new l0(anVar, 7, kdgVar), new ta4(-199202873, true, new mn(kdgVar, instant, anVar, str, bz7Var3, 0)), 4);
                if (kdgVar.isEmpty() && !((Boolean) ((lsc) ((vm) anVar.b).t.c).getValue()).booleanValue()) {
                    j0a.V(j0aVar, "intro_banner", null, new ta4(706473630, true, new nn(i2, anVar)), 2);
                }
                if (anVar.O()) {
                    j0a.V(j0aVar, "history_spinner", null, itj.b, 2);
                }
                return ieiVar;
            case 2:
                h2f h2fVar = (h2f) obj7;
                aae aaeVar = (aae) obj6;
                dae daeVar = (dae) obj5;
                c40 c40Var = (c40) obj4;
                glc glcVar = (glc) obj3;
                eeg eegVar = (eeg) obj2;
                xd6 xd6Var = (xd6) obj;
                zy7 zy7Var2 = (zy7) h2fVar.c;
                zy7Var2.getClass();
                float fCeil = va6.b(((va6) zy7Var2.a()).E, MTTypesetterKt.kLineSkipLimitMultiplier) ? 1.0f : (float) Math.ceil(xd6Var.q0(r3));
                float fD = k8g.d(xd6Var.g());
                ((zy7) h2fVar.d).getClass();
                float fMin = Math.min(fCeil, (float) Math.ceil((fD - (((float) Math.ceil(xd6Var.q0(((va6) r6.a()).E))) * 2.0f)) / 2.0f));
                if (fMin < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    fMin = 0.0f;
                }
                ((zy7) h2fVar.d).getClass();
                float fCeil2 = (float) Math.ceil(xd6Var.q0(((va6) r0.a()).E));
                i = (fCeil2 != MTTypesetterKt.kLineSkipLimitMultiplier || 2.0f * fMin <= k8g.d(xd6Var.g())) ? 0 : 1;
                if (aaeVar.E != fMin) {
                    sve sveVar = glcVar.k;
                    c40Var.i();
                    c40.c(c40Var, rta.k(fCeil2, sveVar));
                    if (i == 0) {
                        c40 c40VarA = f40.a();
                        c40.c(c40VarA, rta.k(fCeil2 + fMin, sveVar));
                        c40Var.h(c40Var, c40VarA, 0);
                    }
                    daeVar.E = c40Var;
                    aaeVar.E = fMin;
                }
                Object obj8 = daeVar.E;
                obj8.getClass();
                xd6.Y0(xd6Var, (c40) obj8, eegVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 60);
                return ieiVar;
            case 3:
                String str2 = (String) obj7;
                l45 l45Var = (l45) obj6;
                nwb nwbVar = (nwb) obj4;
                Context context2 = (Context) obj3;
                h86 h86Var = (h86) obj2;
                zy7 zy7Var3 = (zy7) obj5;
                Uri uri = (Uri) obj;
                String str3 = (String) nwbVar.getValue();
                String str4 = str3 == null ? str2 : str3;
                nwbVar.setValue(null);
                if (uri != null) {
                    gb9.D(l45Var, null, null, new tm(str4, context2, uri, h86Var, zy7Var3, (tp4) null, 28), 3);
                }
                return ieiVar;
            case 4:
                l45 l45Var2 = (l45) obj7;
                jta jtaVar = (jta) obj6;
                c18 c18Var = (c18) obj5;
                pqa pqaVar = (pqa) obj4;
                nwb nwbVar2 = (nwb) obj3;
                nwb nwbVar3 = (nwb) obj2;
                kta ktaVar = (kta) obj;
                ktaVar.getClass();
                if (((lf9) nwbVar2.getValue()) == null) {
                    nwbVar2.setValue(gb9.D(l45Var2, null, o45.H, new b9(ktaVar, pqaVar, c18Var, jtaVar, (pz7) nwbVar3.getValue(), null, 19), 1));
                }
                return ieiVar;
            case 5:
                hw2 hw2Var = (hw2) obj7;
                String str5 = (String) obj6;
                ((r4a) obj).getClass();
                bz7 bz7Var4 = (bz7) ((nwb) obj5).getValue();
                zy7 zy7Var4 = (zy7) ((nwb) obj4).getValue();
                zy7 zy7Var5 = (zy7) ((nwb) obj3).getValue();
                bz7 bz7Var5 = (bz7) ((nwb) obj2).getValue();
                qi3 qi3Var = hw2Var.j;
                str5.getClass();
                bz7Var4.getClass();
                zy7Var4.getClass();
                zy7Var5.getClass();
                bz7Var5.getClass();
                zkg zkgVar = hw2Var.i;
                blg blgVar = (blg) zkgVar.a.getValue();
                zkgVar.a.setValue(null);
                alg algVar = blgVar != null ? blgVar.a : null;
                int i4 = algVar == null ? -1 : tv2.a[algVar.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        qi3Var.e(new WidgetEvents$OpenAppViaURL(WidgetEvents$OpenAppURLActionType.NEW_CHAT, str5), WidgetEvents$OpenAppViaURL.Companion.serializer());
                        String str6 = blgVar.c;
                        if (str6 != null) {
                            cpk.u(hw2Var.D, str6);
                        }
                        gb9.D(hw2Var.a, null, null, new i01(i, r10, bz7Var4), 3);
                    } else if (i4 == 2) {
                        qi3Var.e(new WidgetEvents$OpenAppViaURL(WidgetEvents$OpenAppURLActionType.OPEN_CAMERA, str5), WidgetEvents$OpenAppViaURL.Companion.serializer());
                        zy7Var4.a();
                    } else if (i4 == 3) {
                        qi3Var.e(new WidgetEvents$OpenAppViaURL(WidgetEvents$OpenAppURLActionType.START_DICTATION, str5), WidgetEvents$OpenAppViaURL.Companion.serializer());
                        zy7Var5.a();
                    } else {
                        if (i4 != 4) {
                            wg6.i();
                            return null;
                        }
                        String str7 = blgVar.b;
                        bz7Var5.invoke(str7 != null ? ChatId.m978boximpl(str7) : null);
                    }
                }
                return new le(21);
            case 6:
                vza vzaVar = (vza) obj7;
                fj0 fj0Var = (fj0) obj6;
                String str8 = (String) obj5;
                HostContext hostContext = (HostContext) obj4;
                m4a m4aVar = (m4a) obj3;
                bg9 bg9Var = (bg9) obj2;
                ((w86) obj).getClass();
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj9 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj9)).getClass();
                        arrayList.add(obj9);
                    }
                    if (!arrayList.isEmpty()) {
                        String strM = ebh.m(zfa.a, "Entering fullscreen for ", str8);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, "McpAppViewHost", strM);
                        }
                    }
                }
                vzaVar.g.setValue(Boolean.TRUE);
                vzaVar.a.setFullscreen(true);
                fj0Var.getClass();
                str8.getClass();
                if (((LinkedHashMap) fj0Var.F).get(str8) != null) {
                    ((qo0) fj0Var.G).remove(str8);
                }
                lok.c(vzaVar, bg9Var, hostContext);
                n6 n6Var = new n6(i, vzaVar);
                m4aVar.a().a(n6Var);
                return new iza(m4aVar, n6Var, vzaVar, hostContext, fj0Var, str8, bg9Var);
            case 7:
                vza vzaVar2 = (vza) obj6;
                pz7 pz7Var = (pz7) obj4;
                String str9 = (String) obj3;
                bz7 bz7Var6 = (bz7) obj7;
                fj0 fj0Var2 = (fj0) obj2;
                zy7 zy7Var6 = (zy7) obj5;
                Context context3 = (Context) obj;
                context3.getClass();
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj10 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj10)).getClass();
                        arrayList2.add(obj10);
                    }
                    if (!arrayList2.isEmpty()) {
                        String strM2 = ebh.m(zfa.a, "Attaching WebView to fullscreen host for ", str9);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar, "McpAppViewHost", strM2);
                        }
                    }
                }
                aya ayaVar = vzaVar2.a;
                vzaVar2.b.setBaseContext(context3);
                ayaVar.b();
                ayaVar.onResume();
                rz7 rz7Var = ayaVar.getCallbacks().m;
                kxa callbacks = ayaVar.getCallbacks();
                ayaVar.setCallbacks(new kxa(callbacks.a, callbacks.b, new tl8(12, vzaVar2), callbacks.d, new f7(14, bz7Var6), callbacks.f, callbacks.g, new fe(vzaVar2, fj0Var2, str9, zy7Var6, 27), callbacks.i, callbacks.j, callbacks.k, callbacks.l, new xe(vzaVar2, zy7Var6, rz7Var, fj0Var2, str9, 21), pz7Var));
                return ayaVar.a();
            default:
                m7f m7fVar = (m7f) obj5;
                ((swe) obj).getClass();
                kce kceVar = jce.a;
                return new uje((String) obj7, (List) obj6, (dl2) m7fVar.a(kceVar.b(dl2.class), null, null), (String) obj4, (String) obj3, (String) obj2, (h86) m7fVar.a(kceVar.b(h86.class), null, null));
        }
    }

    public /* synthetic */ e7(vza vzaVar, pz7 pz7Var, String str, bz7 bz7Var, fj0 fj0Var, zy7 zy7Var) {
        this.E = 7;
        this.G = vzaVar;
        this.I = pz7Var;
        this.J = str;
        this.F = bz7Var;
        this.K = fj0Var;
        this.H = zy7Var;
    }

    public /* synthetic */ e7(lwc lwcVar, kdg kdgVar, an anVar, Instant instant, String str, bz7 bz7Var) {
        this.E = 1;
        this.G = lwcVar;
        this.H = kdgVar;
        this.I = anVar;
        this.J = instant;
        this.K = str;
        this.F = bz7Var;
    }

    public /* synthetic */ e7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = obj6;
    }

    public /* synthetic */ e7(String str, l45 l45Var, nwb nwbVar, Context context, h86 h86Var, zy7 zy7Var) {
        this.E = 3;
        this.F = str;
        this.G = l45Var;
        this.I = nwbVar;
        this.J = context;
        this.K = h86Var;
        this.H = zy7Var;
    }
}
