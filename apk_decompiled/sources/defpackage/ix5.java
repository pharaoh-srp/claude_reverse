package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import anthropic.claude.usercontent.mcpapp.McpAppRuntimeHostToSandboxService;
import anthropic.claude.usercontent.mcpapp.RenderMcpAppRequest;
import anthropic.claude.usercontent.sandbox.wire_format.Request;
import com.anthropic.claude.analytics.ads.GooglePlayReferrer;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.login.MagicLinkSentConfig;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.widget.ClaudeAppWidgetReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class ix5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix5(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }

    public static final void d(l45 l45Var, String str) {
        String strConcat = "Google Play Install Referrer: ".concat(str);
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(l45Var);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strConcat);
                }
            }
        }
        List list = xah.a;
        xah.e(6, strConcat, null, null);
    }

    public static final void n(ua2 ua2Var, z9e z9eVar, GooglePlayReferrer googlePlayReferrer) {
        if (!(ua2Var.s() instanceof q6c) || z9eVar.E) {
            return;
        }
        z9eVar.E = true;
        ua2Var.o(googlePlayReferrer, b12.I);
    }

    private final Object p(Object obj) {
        qya qyaVar = (qya) this.G;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            Request requestRenderMcpApp$default = McpAppRuntimeHostToSandboxService.RenderMcpApp$default(McpAppRuntimeHostToSandboxService.INSTANCE, (RenderMcpAppRequest) this.H, null, 2, null);
            this.F = 1;
            obj = qyaVar.h(requestRenderMcpApp$default, this);
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
        if (!((Boolean) obj).booleanValue()) {
            qyaVar.post(new pya(0, qyaVar));
        }
        return iei.a;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new ix5((jx5) obj2, tp4Var, 0);
            case 1:
                return new ix5((pe6) this.G, (uf6) obj2, tp4Var, 1);
            case 2:
                return new ix5((nn6) this.G, (ze0) obj2, tp4Var, 2);
            case 3:
                return new ix5((rp6) obj2, tp4Var, 3);
            case 4:
                return new ix5((b) this.G, (EnvironmentResource) obj2, tp4Var, 4);
            case 5:
                ix5 ix5Var = new ix5((ha7) obj2, tp4Var, 5);
                ix5Var.G = obj;
                return ix5Var;
            case 6:
                return new ix5((wg7) this.G, (zy7) obj2, tp4Var, 6);
            case 7:
                return new ix5((ap7) this.G, (xo7) obj2, tp4Var, 7);
            case 8:
                return new ix5((ap7) this.G, (v79) obj2, tp4Var, 8);
            case 9:
                return new ix5((e58) this.G, (String) obj2, tp4Var, 9);
            case 10:
                ix5 ix5Var2 = new ix5((nm0) obj2, tp4Var, 10);
                ix5Var2.G = obj;
                return ix5Var2;
            case 11:
                return new ix5((Context) this.G, (ClaudeAppWidgetReceiver) obj2, tp4Var, 11);
            case 12:
                return new ix5((t88) this.G, (zo1) obj2, tp4Var, 12);
            case 13:
                ix5 ix5Var3 = new ix5((v88) obj2, tp4Var, 13);
                ix5Var3.G = obj;
                return ix5Var3;
            case 14:
                return new ix5((id8) this.G, (Map) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new ix5((kae) this.G, (koi) obj2, tp4Var, 15);
            case 16:
                return new ix5((yn8) this.G, (ChatConversationWithProjectReference) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new ix5((yn8) this.G, (Project) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new ix5((a80) this.G, (nwb) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new ix5((gw8) this.G, (hsc) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new ix5((e8d) this.G, (koc) obj2, tp4Var, 20);
            case 21:
                return new ix5((e1a) this.G, (String) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new ix5((e2a) this.G, (cm) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ix5 ix5Var4 = new ix5((t3a) obj2, tp4Var, 23);
                ix5Var4.G = obj;
                return ix5Var4;
            case 24:
                return new ix5((MagicLinkSentConfig) this.G, (poa) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new ix5((MagicLinkSentConfig) this.G, (nwb) obj2, tp4Var, 25);
            case 26:
                return new ix5((npa) this.G, (czd) obj2, tp4Var, 26);
            case 27:
                return new ix5((Context) this.G, (jse) obj2, tp4Var, 27);
            case 28:
                return new ix5((qya) this.G, (RenderMcpAppRequest) obj2, tp4Var, 28);
            default:
                return new ix5((qya) this.G, (String) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((ix5) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((ix5) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:401:0x0887, code lost:
    
        if (r2.b(r20, r3) == r11) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x09d1, code lost:
    
        if (r2.a(defpackage.wja.F, false, r20) == r11) goto L457;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:313:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0893 A[Catch: all -> 0x080a, TryCatch #4 {all -> 0x080a, blocks: (B:387:0x0805, B:405:0x088f, B:407:0x0893, B:409:0x0897, B:410:0x08b8, B:411:0x08bd, B:412:0x08be, B:392:0x0814, B:398:0x0834, B:400:0x083a, B:403:0x088b, B:415:0x08cd, B:416:0x08d2, B:395:0x0820), top: B:478:0x07fb }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x09dd  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix5(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
    }
}
