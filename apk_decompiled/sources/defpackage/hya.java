package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.health.platform.client.proto.g;
import coil.compose.AsyncImagePainter;
import com.anthropic.claude.analytics.events.McpEvents$McpSuggestionOptInPrompted;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryEditOnWeb;
import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewDismissed;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.anthropic.claude.app.onboarding.a;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.mcpapps.ModelContextTooLargeException;
import com.anthropic.claude.mcpapps.transport.DisplayModeResult;
import com.anthropic.claude.mcpapps.transport.InitializeResult;
import com.anthropic.claude.mcpapps.transport.OpenLinkParams;
import com.anthropic.claude.mcpapps.transport.RequestDisplayModeParams;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInput;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ToolUseId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hya implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ hya(lya lyaVar, Object obj, JsonPrimitive jsonPrimitive, int i) {
        this.E = i;
        this.F = lyaVar;
        this.H = obj;
        this.G = jsonPrimitive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // defpackage.zy7
    public final Object a() {
        String str;
        float fH;
        int i = 0;
        switch (this.E) {
            case 0:
                lya lyaVar = (lya) this.F;
                JsonPrimitive jsonPrimitive = (JsonPrimitive) this.G;
                InitializeResult initializeResult = (InitializeResult) this.H;
                bg9 bg9Var = lyaVar.e;
                bg9Var.getClass();
                lyaVar.e(jsonPrimitive, ch9.i(bg9Var.c(initializeResult, InitializeResult.Companion.serializer())));
                break;
            case 1:
                lya lyaVar2 = (lya) this.F;
                OpenLinkParams openLinkParams = (OpenLinkParams) this.H;
                JsonPrimitive jsonPrimitive2 = (JsonPrimitive) this.G;
                bz7 bz7Var = lyaVar2.b.e;
                if (bz7Var != null) {
                    bz7Var.invoke(openLinkParams);
                }
                if (jsonPrimitive2 != null) {
                    lya.f(lyaVar2, jsonPrimitive2);
                }
                break;
            case 2:
                lya lyaVar3 = (lya) this.F;
                JsonPrimitive jsonPrimitive3 = (JsonPrimitive) this.G;
                String message = ((ModelContextTooLargeException) this.H).getMessage();
                message.getClass();
                lyaVar3.c(jsonPrimitive3, -32603, message);
                break;
            case 3:
                lya lyaVar4 = (lya) this.F;
                RequestDisplayModeParams requestDisplayModeParams = (RequestDisplayModeParams) this.H;
                JsonPrimitive jsonPrimitive4 = (JsonPrimitive) this.G;
                bz7 bz7Var2 = lyaVar4.b.j;
                if (bz7Var2 == null || (str = (String) bz7Var2.invoke(requestDisplayModeParams)) == null) {
                    str = "inline";
                }
                DisplayModeResult displayModeResult = new DisplayModeResult(str);
                bg9 bg9Var2 = lyaVar4.e;
                bg9Var2.getClass();
                lyaVar4.e(jsonPrimitive4, ch9.i(bg9Var2.c(displayModeResult, DisplayModeResult.Companion.serializer())));
                break;
            case 4:
                ((lya) this.F).c((JsonPrimitive) this.G, -32601, "Method not found: " + ((String) this.H));
                break;
            case 5:
                lya lyaVar5 = (lya) this.F;
                JsonPrimitive jsonPrimitive5 = (JsonPrimitive) this.G;
                JsonObject jsonObjectI = ch9.i((JsonElement) this.H);
                JsonObject jsonObject = lya.j;
                lyaVar5.e(jsonPrimitive5, jsonObjectI);
                break;
            case 6:
                qi3 qi3Var = (qi3) this.F;
                eli eliVar = (eli) this.G;
                ze0 ze0Var = (ze0) this.H;
                qi3Var.e(new MemoryEvents$MemoryEditOnWeb(), MemoryEvents$MemoryEditOnWeb.Companion.serializer());
                eliVar.a(ze0Var.a() + "/settings/features?modal=memory");
                break;
            case 7:
                zy7 zy7Var = (zy7) this.F;
                zy7 zy7Var2 = (zy7) this.G;
                nwb nwbVar = (nwb) this.H;
                zvc zvcVar = (zvc) nwbVar.getValue();
                int i2 = zvcVar == null ? -1 : nmb.a[zvcVar.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        zy7Var.a();
                    } else if (i2 != 2) {
                        wg6.i();
                    } else {
                        zy7Var2.a();
                    }
                }
                nwbVar.setValue(null);
                break;
            case 8:
                r4g r4gVar = (r4g) this.F;
                r4g r4gVar2 = (r4g) this.G;
                zy7 zy7Var3 = (zy7) this.H;
                r4gVar.a();
                r4gVar2.a();
                zy7Var3.a();
                break;
            case 9:
                a aVar = (a) this.F;
                rwe rweVar = (rwe) this.G;
                zy7 zy7Var4 = (zy7) this.H;
                List list = aVar.b;
                zy7Var4.getClass();
                OnboardingPage onboardingPage = (OnboardingPage) ((bf3) rweVar.F.getValue()).a.a;
                sfa sfaVar = sfa.DEBUG;
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String strI = ij0.i("next() from ", onboardingPage.getId());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, "Onboarding", strI);
                        }
                    }
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                    } else if (!x44.r(((OnboardingPage) it2.next()).getId(), onboardingPage.getId())) {
                        i++;
                    }
                }
                if (i == -1) {
                    List list2 = xah.a;
                    xah.e(6, ij0.j("OnboardingCoordinator: active page '", onboardingPage.getId(), "' not in resolved steps; completing"), null, null);
                }
                if (i < 0 || i >= list.size() - 1) {
                    tec tecVar = aVar.a;
                    if (!((Boolean) tecVar.w.getValue()).booleanValue()) {
                        gb9.D(tecVar.a, null, null, new w22(tecVar, zy7Var4, (tp4) null), 3);
                    }
                } else {
                    rweVar.E.m(new jx2(19, list.get(i + 1)), new ppa(13));
                }
                break;
            case 10:
                y08 y08Var = (y08) this.F;
                vag vagVar = (vag) this.G;
                fjc fjcVar = (fjc) this.H;
                if (y08Var != null) {
                    vagVar.a(vagVar.c(y08Var) - vagVar.t);
                }
                List listE = jpk.e(vagVar, null, vagVar.t, null);
                bd4 bd4Var = (bd4) w44.V0(listE);
                Integer num = bd4Var != null ? bd4Var.b : null;
                List listA = fjcVar.a(num);
                if (num != null && !listA.isEmpty()) {
                    listA = w44.a1(x44.W(new bd4(((bd4) w44.L0(listA)).a, null, num)), w44.I0(listA, 1));
                }
                break;
            case 11:
                vxc vxcVar = (vxc) this.F;
                zy7 zy7Var5 = (zy7) this.G;
                zy7 zy7Var6 = (zy7) this.H;
                if (vxcVar.f) {
                    zy7Var5.a();
                } else {
                    zy7Var6.a();
                }
                break;
            case 12:
                pl3 pl3Var = (pl3) this.F;
                gf8 gf8Var = (gf8) this.G;
                zy7 zy7Var7 = (zy7) this.H;
                pl3Var.d(gf8Var);
                zy7Var7.a();
                break;
            case 13:
                bz7 bz7Var3 = (bz7) this.F;
                tkd tkdVar = (tkd) this.G;
                zy7 zy7Var8 = (zy7) this.H;
                bz7Var3.invoke(Boolean.valueOf(!tkdVar.f));
                zy7Var8.a();
                break;
            case 14:
                bz7 bz7Var4 = (bz7) this.F;
                Project project = (Project) this.G;
                zy7 zy7Var9 = (zy7) this.H;
                bz7Var4.invoke(Boolean.valueOf(!okk.z(project)));
                zy7Var9.a();
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                bz7 bz7Var5 = (bz7) this.F;
                gnd gndVar = (gnd) this.G;
                nwb nwbVar2 = (nwb) this.H;
                bz7Var5.invoke(gndVar);
                nwbVar2.setValue(Boolean.FALSE);
                break;
            case 16:
                gb9.D((l45) this.F, null, null, new kza((kzd) this.G, (ybg) this.H, k8gVar, 27), 3);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                fqb fqbVar = fqb.E;
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.F;
                qw1 qw1Var = (qw1) this.G;
                cz5 cz5Var = (cz5) this.H;
                bpc bpcVarA = ((u01) asyncImagePainter.U.getValue()).getPainter();
                k8gVar = bpcVarA != null ? new k8g(bpcVarA.getM()) : 0;
                if (k8gVar != 0) {
                    long j = k8gVar.a;
                    if (j != 9205357640488583168L) {
                        int i3 = (int) (j >> 32);
                        if (Float.intBitsToFloat(i3) != Float.POSITIVE_INFINITY) {
                            int i4 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i4) != Float.POSITIVE_INFINITY) {
                                float fIntBitsToFloat = Float.intBitsToFloat(i3);
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i4);
                                fH = fIntBitsToFloat > ((float) rl4.h(qw1Var.b)) ? rl4.h(qw1Var.b) / fIntBitsToFloat : 1.0f;
                            }
                        }
                    }
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                fqb fqbVar2 = fqb.E;
                qw1 qw1Var2 = (qw1) this.F;
                cz5 cz5Var2 = (cz5) this.G;
                bpc bpcVarA2 = ((t01) ((wlg) this.H).getValue()).getPainter();
                k8g k8gVar = bpcVarA2 != null ? new k8g(bpcVarA2.getM()) : null;
                if (k8gVar != null) {
                    long j2 = k8gVar.a;
                    if (j2 != 9205357640488583168L) {
                        int i5 = (int) (j2 >> 32);
                        if (Float.intBitsToFloat(i5) != Float.POSITIVE_INFINITY) {
                            int i6 = (int) (j2 & 4294967295L);
                            if (Float.intBitsToFloat(i6) != Float.POSITIVE_INFINITY) {
                                float fIntBitsToFloat3 = Float.intBitsToFloat(i5);
                                float fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                                fH = fIntBitsToFloat3 > ((float) rl4.h(qw1Var2.b)) ? rl4.h(qw1Var2.b) / fIntBitsToFloat3 : 1.0f;
                            }
                        }
                    }
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                xee xeeVar = (xee) this.F;
                String str2 = (String) this.G;
                nwb nwbVar3 = (nwb) this.H;
                xeeVar.getClass();
                str2.getClass();
                mdg mdgVar = xeeVar.a;
                iei ieiVar = iei.a;
                mdgVar.put(str2, ieiVar);
                nwbVar3.setValue(Boolean.FALSE);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                gb9.D((l45) this.F, null, null, new o6e((uje) this.G, (pz7) this.H, k8gVar, 4), 3);
                break;
            case 21:
                ((e5h) this.F).c.invoke(ToolUseId.m1157boximpl((String) this.G), (RequestFormInputFromUserInput) this.H);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ief iefVar = (ief) this.F;
                iefVar.g.e(new McpEvents$McpSuggestionOptInPrompted((String) this.G, (String) this.H, iefVar.h), McpEvents$McpSuggestionOptInPrompted.Companion.serializer());
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                Project project2 = (Project) this.F;
                String str3 = (String) this.G;
                bz7 bz7Var6 = (bz7) this.H;
                if (str3 != null ? ProjectId.m1082equalsimpl0(project2.m404getUuid5pmjbU(), str3) : false) {
                    bz7Var6.invoke(null);
                } else {
                    bz7Var6.invoke(project2);
                }
                break;
            case 24:
                op3 op3Var = (op3) this.F;
                KnowledgeSource knowledgeSource = (KnowledgeSource) this.G;
                l45 l45Var = (l45) this.H;
                String url = knowledgeSource.getUrl();
                if (url != null) {
                    gb9.D(l45Var, null, null, new l93(knowledgeSource, url, op3Var, null, 1), 3);
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                y4g y4gVar = (y4g) this.F;
                bz7 bz7Var7 = (bz7) this.G;
                if (((isc) this.H).h() > 0 && Float.isNaN(y4gVar.a.j.h())) {
                    bz7Var7.invoke(Float.valueOf(r14.h()));
                }
                break;
            case 26:
                ((m83) this.F).j.invoke((String) this.G, (List) this.H);
                break;
            case 27:
                ief iefVar2 = (ief) this.F;
                iefVar2.g.e(new McpEvents$McpSuggestionOptInPrompted((String) this.G, (String) this.H, iefVar2.h), McpEvents$McpSuggestionOptInPrompted.Companion.serializer());
                break;
            case 28:
                zy7 zy7Var10 = (zy7) this.F;
                ze0 ze0Var2 = (ze0) this.G;
                Context context = (Context) this.H;
                zy7Var10.a();
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ze0Var2.a() + "/settings/devices")));
                } catch (ActivityNotFoundException e) {
                    SilentException.a(new SilentException("No browser available to open trusted devices settings", e), ozf.F, false, 2);
                }
                break;
            default:
                qi3 qi3Var2 = (qi3) this.F;
                bz7 bz7Var8 = (bz7) this.G;
                nwb nwbVar4 = (nwb) this.H;
                if (((aji) nwbVar4.getValue()) == null) {
                    qi3Var2.e(new ProUpsellEvents$StoreViewDismissed(), ProUpsellEvents$StoreViewDismissed.Companion.serializer());
                }
                Object obj2 = (aji) nwbVar4.getValue();
                if (obj2 == null) {
                    obj2 = zii.a;
                }
                bz7Var8.invoke(obj2);
                break;
        }
        return iei.a;
    }

    public /* synthetic */ hya(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }
}
