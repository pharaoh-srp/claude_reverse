package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseChartShared;
import com.anthropic.claude.api.chat.RecordToolResultRequest;
import com.anthropic.claude.api.chat.tool.ToolResultText;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.app.n0;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import com.anthropic.claude.tool.model.ToolInvocationResult$Report;
import com.anthropic.claude.ui.components.snackbar.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class cm extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(o32 o32Var, i iVar, Uri uri, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 27;
        this.I = o32Var;
        this.J = iVar;
        this.H = uri;
    }

    private final Object A(Object obj) throws Throwable {
        o32 o32Var;
        int i = this.F;
        tp4 tp4Var = null;
        if (i == 0) {
            sf5.h0(obj);
            o32 o32Var2 = (o32) this.I;
            oda odaVar = ((i) this.J).n;
            Uri uri = (Uri) this.H;
            this.G = o32Var2;
            this.F = 1;
            Object objC0 = gb9.c0(odaVar.b.b(), new zn(odaVar, uri, tp4Var, 18), this);
            m45 m45Var = m45.E;
            if (objC0 == m45Var) {
                return m45Var;
            }
            obj = objC0;
            o32Var = o32Var2;
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o32Var = (o32) this.G;
            sf5.h0(obj);
        }
        o32Var.f.setValue((Long) obj);
        return iei.a;
    }

    private final Object d(Object obj) {
        Context context = (Context) this.H;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            ja8 ja8Var = (ja8) this.G;
            this.F = 1;
            obj = ja8Var.k(this);
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
        Bitmap bitmapL = yfd.l((r20) obj);
        String title = ((ChartDisplayV0Input) this.I).getTitle();
        context.getClass();
        bitmapL.getClass();
        File fileH = kik.h(context, bitmapL);
        if (fileH == null) {
            Toast.makeText(context, context.getString(R.string.chart_share_failed), 0).show();
        } else {
            try {
                Uri uriD = FileProvider.d(context, context.getPackageName() + ".provider", fileH);
                uriD.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("image/png");
                intent.putExtra("android.intent.extra.STREAM", uriD);
                if (title != null) {
                    if (bsg.I0(title)) {
                        title = null;
                    }
                    if (title != null) {
                        intent.putExtra("android.intent.extra.SUBJECT", title);
                    }
                }
                intent.addFlags(1);
                Intent intentCreateChooser = Intent.createChooser(intent, null);
                intentCreateChooser.addFlags(268435456);
                context.startActivity(intentCreateChooser);
                sfa sfaVar = sfa.DEBUG;
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList.add(obj2);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, "ChartSharingHelper", "Chart share sheet opened");
                        }
                    }
                }
                ((qi3) this.J).e(new MobileAppUseEvents$MobileAppUseChartShared(), MobileAppUseEvents$MobileAppUseChartShared.Companion.serializer());
            } catch (Exception e) {
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj3)).getClass();
                        arrayList2.add(obj3);
                    }
                    if (!arrayList2.isEmpty()) {
                        String strQ = sq6.q(zfa.a, e, "Failed to share chart image: ");
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfa.ERROR, "ChartSharingHelper", strQ);
                        }
                    }
                }
                Toast.makeText(context, context.getString(R.string.chart_share_failed), 0).show();
            }
        }
        return iei.a;
    }

    private final Object n(Object obj) {
        t53 t53Var = (t53) this.J;
        l45 l45Var = (l45) this.G;
        int i = this.F;
        try {
            if (i == 0) {
                sf5.h0(obj);
                pz7 pz7Var = (pz7) this.H;
                iwc iwcVar = (iwc) this.I;
                this.G = l45Var;
                this.F = 1;
                Object objInvoke = pz7Var.invoke(iwcVar, this);
                m45 m45Var = m45.E;
                if (objInvoke == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
        } catch (CancellationException e) {
            t53Var.u1(false);
            throw e;
        } catch (Exception e2) {
            t53Var.u1(false);
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(l45Var);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String strI = ij0.i("MCP completion auth did not complete: ", e2.getMessage());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, strE, strI);
                    }
                }
            }
        }
        return iei.a;
    }

    private final Object p(Object obj) throws Throwable {
        t53 t53Var = (t53) this.H;
        Exception exc = (Exception) this.G;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            e45 e45VarA = t53Var.W.a();
            qq0 qq0Var = new qq0(exc, t53Var, (ctc) this.I, (JsonRpcRequest) this.J, (tp4) null, 8);
            this.G = null;
            this.F = 1;
            Object objC0 = gb9.c0(e45VarA, qq0Var, this);
            m45 m45Var = m45.E;
            if (objC0 == m45Var) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private final Object r(Object obj) {
        uxh uxhVar = (uxh) this.I;
        t53 t53Var = (t53) this.G;
        int i = this.F;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0) {
            sf5.h0(obj);
            dl2 dl2Var = t53Var.i;
            String str2 = t53Var.d.e;
            String str3 = t53Var.L0;
            RecordToolResultRequest recordToolResultRequest = new RecordToolResultRequest((String) this.H, x44.W(new ToolResultText(((ToolInvocationResult$Report) uxhVar).getResponse(), str, 2, (mq5) (objArr2 == true ? 1 : 0))), !r0.getSuccess(), objArr == true ? 1 : 0);
            this.F = 1;
            obj = dl2Var.s(str2, str3, recordToolResultRequest, this);
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
        ApiResult apiResult = (ApiResult) obj;
        String str4 = (String) this.J;
        if (!(apiResult instanceof of0)) {
            if (!(apiResult instanceof nf0)) {
                wg6.i();
                return null;
            }
            nf0 nf0Var = (nf0) apiResult;
            SilentException.a(new SilentException(ij0.i("Failed to send custom tool result for ", str4), hsk.h(nf0Var)), null, false, 3);
            a.a(nf0Var, t53Var.j0);
        }
        return iei.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r8.b(r11, r12) == r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r8.b(r11, r12) == r10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.J
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r11.G
            t53 r0 = (defpackage.t53) r0
            zy1 r8 = r0.j0
            java.lang.String r1 = r0.L0
            int r2 = r11.F
            r9 = 3
            r4 = 1
            r5 = 2
            m45 r10 = defpackage.m45.E
            if (r2 == 0) goto L2c
            if (r2 == r4) goto L28
            if (r2 == r5) goto L24
            if (r2 != r9) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            r11 = 0
            return r11
        L24:
            defpackage.sf5.h0(r12)
            goto L99
        L28:
            defpackage.sf5.h0(r12)
            goto L3e
        L2c:
            defpackage.sf5.h0(r12)
            lgb r12 = r0.O
            java.lang.Object r2 = r11.H
            java.lang.String r2 = (java.lang.String) r2
            r11.F = r4
            java.lang.Object r12 = r12.d(r2, r1, r11)
            if (r12 != r10) goto L3e
            goto L98
        L3e:
            pa6 r12 = (defpackage.pa6) r12
            if (r12 == 0) goto L6b
            sa6 r0 = r0.P
            long r6 = r12.a
            dwc r12 = new dwc
            java.lang.Object r2 = r11.I
            com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource r2 = (com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource) r2
            r12.<init>(r4, r2, r3, r1)
            java.util.concurrent.ConcurrentHashMap r0 = r0.c
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0.put(r1, r12)
            pt6 r12 = new pt6
            r0 = 2131888899(0x7f120b03, float:1.9412446E38)
            st6 r1 = defpackage.st6.G
            r12.<init>(r0, r1)
            r11.F = r5
            java.lang.Object r11 = r8.b(r11, r12)
            if (r11 != r10) goto L99
            goto L98
        L6b:
            qi3 r12 = r0.w
            com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult r1 = new com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult
            java.lang.Object r0 = r11.I
            r2 = r0
            com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource r2 = (com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource) r2
            com.anthropic.claude.analytics.events.MessageFileEvents$DownloadOutcome r4 = com.anthropic.claude.analytics.events.MessageFileEvents$DownloadOutcome.ENQUEUE_FAILED
            r6 = 8
            r7 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            rgb r0 = com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            znf r0 = (defpackage.znf) r0
            r12.e(r1, r0)
            pt6 r12 = new pt6
            r0 = 2131888898(0x7f120b02, float:1.9412444E38)
            r12.<init>(r0)
            r11.F = r9
            java.lang.Object r11 = r8.b(r11, r12)
            if (r11 != r10) goto L99
        L98:
            return r10
        L99:
            iei r11 = defpackage.iei.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005c -> B:14:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.F
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            if (r0 != r2) goto L18
            java.lang.Object r0 = r8.I
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r8.H
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r8.G
            t53 r4 = (defpackage.t53) r4
            defpackage.sf5.h0(r9)
            goto L5f
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r1
        L1e:
            defpackage.sf5.h0(r9)
            java.lang.Object r9 = r8.J
            t53 r9 = (defpackage.t53) r9
            kdg r0 = r9.F1
            java.util.ListIterator r0 = r0.listIterator()
            r4 = r9
            r3 = r0
        L2d:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L98
            java.lang.Object r9 = r3.next()
            com.anthropic.claude.types.strings.ResearchTaskId r9 = (com.anthropic.claude.types.strings.ResearchTaskId) r9
            java.lang.String r0 = r9.m1106unboximpl()
            kdg r9 = r4.G1
            com.anthropic.claude.types.strings.ResearchTaskId r5 = com.anthropic.claude.types.strings.ResearchTaskId.m1100boximpl(r0)
            r9.add(r5)
            dl2 r9 = r4.i
            koi r5 = r4.d
            java.lang.String r5 = r5.e
            java.lang.String r6 = r4.L0
            r8.G = r4
            r8.H = r3
            r8.I = r0
            r8.F = r2
            java.lang.Object r9 = r9.g(r5, r6, r0, r8)
            m45 r5 = defpackage.m45.E
            if (r9 != r5) goto L5f
            return r5
        L5f:
            com.anthropic.claude.api.result.ApiResult r9 = (com.anthropic.claude.api.result.ApiResult) r9
            boolean r5 = r9 instanceof defpackage.of0
            if (r5 == 0) goto L76
            r6 = r9
            of0 r6 = (defpackage.of0) r6
            java.lang.Object r6 = r6.b
            iei r6 = (defpackage.iei) r6
            kdg r6 = r4.F1
            com.anthropic.claude.types.strings.ResearchTaskId r7 = com.anthropic.claude.types.strings.ResearchTaskId.m1100boximpl(r0)
            r6.remove(r7)
            goto L7a
        L76:
            boolean r6 = r9 instanceof defpackage.nf0
            if (r6 == 0) goto L94
        L7a:
            if (r5 != 0) goto L8e
            boolean r5 = r9 instanceof defpackage.nf0
            if (r5 == 0) goto L8a
            kdg r5 = r4.G1
            com.anthropic.claude.types.strings.ResearchTaskId r0 = com.anthropic.claude.types.strings.ResearchTaskId.m1100boximpl(r0)
            r5.remove(r0)
            goto L8e
        L8a:
            defpackage.wg6.i()
            return r1
        L8e:
            zy1 r0 = r4.j0
            com.anthropic.claude.ui.components.snackbar.a.a(r9, r0)
            goto L2d
        L94:
            defpackage.wg6.i()
            return r1
        L98:
            iei r8 = defpackage.iei.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm.t(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj) {
        vhd vhdVar = (vhd) this.H;
        int i = this.F;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (i == 0) {
            sf5.h0(obj);
            String strU0 = ((t53) this.G).u0(vhdVar.a);
            hw2 hw2Var = (hw2) this.I;
            String str = vhdVar.i;
            List list = vhdVar.g;
            List list2 = vhdVar.f;
            if (list2 == null) {
                list2 = lm6.E;
            }
            this.F = 1;
            hw2Var.g0(strU0, str, list, list2);
            if (ieiVar != m45Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        bt7 bt7Var = (bt7) this.J;
        this.F = 2;
        return zh4.z(bt7Var, 100L, this) == m45Var ? m45Var : ieiVar;
    }

    private final Object w(Object obj) {
        nwb nwbVar = (nwb) this.J;
        int i = this.F;
        try {
            if (i == 0) {
                sf5.h0(obj);
                Activity activity = (Activity) this.G;
                j8f j8fVar = (j8f) this.H;
                nwb nwbVar2 = (nwb) this.I;
                this.F = 1;
                Object objP = n0.p(activity, j8fVar, nwbVar2, this);
                m45 m45Var = m45.E;
                if (objP == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
            nwbVar.setValue(Boolean.FALSE);
            return iei.a;
        } catch (Throwable th) {
            nwbVar.setValue(Boolean.FALSE);
            throw th;
        }
    }

    private final Object x(Object obj) throws Throwable {
        Object obj2;
        bz7 bz7Var;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            bz7 bz7Var2 = (bz7) this.H;
            b bVar = (b) this.I;
            String str = (String) this.J;
            this.G = bz7Var2;
            this.F = 1;
            Object objC = bVar.c(str, this);
            m45 m45Var = m45.E;
            if (objC == m45Var) {
                return m45Var;
            }
            obj2 = objC;
            bz7Var = bz7Var2;
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bz7Var = (bz7) this.G;
            sf5.h0(obj);
            obj2 = ((jre) obj).E;
        }
        bz7Var.invoke(new jre(obj2));
        return iei.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object y(Object obj) throws Throwable {
        zv5 zv5VarK;
        Object obj2;
        c cVar = (c) this.J;
        l45 l45Var = (l45) this.I;
        int i = this.F;
        int i2 = 1;
        ApiResult apiResult = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        m45 m45Var = m45.E;
        if (i == 0) {
            sf5.h0(obj);
            zv5 zv5VarK2 = gb9.k(l45Var, null, new xz3(cVar, objArr2 == true ? 1 : 0, 0), 3);
            zv5VarK = ((cVar.q instanceof CodeSessionListScope.Code) && cVar.k.a()) ? gb9.k(l45Var, null, new xz3(cVar, objArr == true ? 1 : 0, i2), 3) : null;
            this.I = null;
            this.G = zv5VarK;
            this.F = 1;
            obj = zv5VarK2.w(this);
            if (obj != m45Var) {
            }
            return m45Var;
        }
        if (i != 1) {
            if (i != 2) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.H;
            sf5.h0(obj);
            apiResult = (ApiResult) obj;
            obj = obj2;
            return new cpc(obj, apiResult);
        }
        zv5VarK = (zv5) this.G;
        sf5.h0(obj);
        if (zv5VarK != null) {
            this.I = null;
            this.G = null;
            this.H = obj;
            this.F = 2;
            Object objB0 = zv5VarK.B0(this);
            if (objB0 != m45Var) {
                Object obj3 = obj;
                obj = objB0;
                obj2 = obj3;
                apiResult = (ApiResult) obj;
                obj = obj2;
            }
            return m45Var;
        }
        return new cpc(obj, apiResult);
    }

    private final Object z(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (i == 0) {
            sf5.h0(obj);
            op3 op3Var = (op3) this.G;
            String str = (String) this.H;
            ClipData clipDataNewPlainText = ClipData.newPlainText(str, str);
            clipDataNewPlainText.getClass();
            this.F = 1;
            ((mz) op3Var).a.a().setPrimaryClip(clipDataNewPlainText);
            if (ieiVar != m45Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        ybg ybgVar = (ybg) this.I;
        String str2 = (String) this.J;
        this.F = 2;
        return ybg.b(ybgVar, str2, null, this, 14) == m45Var ? m45Var : ieiVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                return new cm((vm) this.G, (Uri) this.H, (ol) this.I, (UUID) obj2, tp4Var, 0);
            case 1:
                cm cmVar = new cm((bz7) this.H, (y20) this.I, (e2a) obj2, tp4Var, 1);
                cmVar.G = obj;
                return cmVar;
            case 2:
                cm cmVar2 = new cm((gh2) this.I, (v90) obj2, tp4Var, 2);
                cmVar2.H = obj;
                return cmVar2;
            case 3:
                cm cmVar3 = new cm((gh2) this.I, (k90) obj2, tp4Var, 3);
                cmVar3.H = obj;
                return cmVar3;
            case 4:
                cm cmVar4 = new cm((wm0) this.H, (Context) this.I, (nwb) obj2, tp4Var, 4);
                cmVar4.G = obj;
                return cmVar4;
            case 5:
                cm cmVar5 = new cm((ive) this.H, (Context) this.I, (nm0) obj2, tp4Var, 5);
                cmVar5.G = obj;
                return cmVar5;
            case 6:
                return new cm((Activity) this.G, (tp0) this.H, (xp0) this.I, (zy7) obj2, tp4Var, 6);
            case 7:
                return new cm((xq0) this.G, (t4f) this.H, (zy7) this.I, (nwb) obj2, tp4Var, 7);
            case 8:
                cm cmVar6 = new cm((AudioManager) this.H, (p41) this.I, (Integer) obj2, tp4Var, 8);
                cmVar6.G = obj;
                return cmVar6;
            case 9:
                return new cm((mj1) this.I, (String) obj2, tp4Var, 9);
            case 10:
                return new cm((lgb) this.G, (i) this.H, (String) this.I, (fk) obj2, tp4Var, 10);
            case 11:
                return new cm((gq7) this.G, (zy1) this.H, (AtomicReference) this.I, (dqh) obj2, tp4Var, 11);
            case 12:
                return new cm((ja8) this.G, (Context) this.H, (ChartDisplayV0Input) this.I, (qi3) obj2, tp4Var, 12);
            case 13:
                return new cm((rz7) this.H, this.I, (pt2) obj2, tp4Var, 13);
            case 14:
                return new cm((sw2) this.G, (pt2) this.H, (String) this.I, (sm) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new cm((f03) this.G, (String) this.H, (String) this.I, (z4b) obj2, tp4Var, 15);
            case 16:
                return new cm((f03) this.G, (String) this.H, (McpTool) this.I, (z4b) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                cm cmVar7 = new cm((pz7) this.H, (iwc) this.I, (t53) obj2, tp4Var, 17);
                cmVar7.G = obj;
                return cmVar7;
            case g.AVG_FIELD_NUMBER /* 18 */:
                cm cmVar8 = new cm((t53) this.H, (ctc) this.I, (JsonRpcRequest) obj2, tp4Var, 18);
                cmVar8.G = obj;
                return cmVar8;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new cm((t53) this.G, (String) this.H, (uxh) this.I, (String) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new cm((t53) this.G, (String) this.H, (MessageFileEvents$DownloadSource) this.I, (String) obj2, tp4Var, 20);
            case 21:
                return new cm((t53) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new cm((t53) this.G, (vhd) this.H, (hw2) this.I, (bt7) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new cm((Activity) this.G, (j8f) this.H, (nwb) this.I, (nwb) obj2, tp4Var, 23);
            case 24:
                return new cm((bz7) this.H, (b) this.I, (String) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                cm cmVar9 = new cm((c) obj2, tp4Var, 25);
                cmVar9.I = obj;
                return cmVar9;
            case 26:
                return new cm((op3) this.G, (String) this.H, (ybg) this.I, (String) obj2, tp4Var, 26);
            case 27:
                return new cm((o32) this.I, (i) obj2, (Uri) this.H, tp4Var);
            default:
                cm cmVar10 = new cm((i) this.I, (Uri) this.H, (o32) obj2, tp4Var);
                cmVar10.G = obj;
                return cmVar10;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 1:
                ((cm) create((y5d) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((cm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r0 == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0747, code lost:
    
        if (r0 == r10) goto L359;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x068c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v39, types: [zy7] */
    /* JADX WARN: Type inference failed for: r1v41, types: [zy7] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:295:0x05f0 -> B:297:0x05f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:314:0x065d -> B:316:0x0661). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm(iwe iweVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = iweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(i iVar, Uri uri, o32 o32Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 28;
        this.I = iVar;
        this.H = uri;
        this.J = o32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }
}
