package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.print.PrintManager;
import android.view.View;
import android.webkit.WebView;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.ConwayHttpException;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.mcpapps.DomainValidationException;
import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;
import com.anthropic.claude.mcpapps.transport.ToolInputParams;
import com.anthropic.claude.mcpapps.transport.UiResourceMeta;
import com.anthropic.claude.sessions.types.ClientEventEnvelope;
import com.anthropic.claude.sessions.types.DeviceAttestation;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.StdinMessage;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonObject;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class qq0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(ned nedVar, String str, MessageBlobFile messageBlobFile, Long l, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 19;
        this.F = nedVar;
        this.H = str;
        this.G = messageBlobFile;
        this.I = l;
    }

    private final Object d(Object obj) {
        String str = (String) this.I;
        mwh mwhVar = (mwh) this.F;
        KSerializer kSerializer = (KSerializer) this.G;
        sf5.h0(obj);
        String str2 = (String) this.H;
        try {
            return mwhVar.a.b(bsg.I0(str2) ? "{}" : str2, kSerializer);
        } catch (Exception e) {
            if (!(e instanceof MissingFieldException)) {
                boolean z = e instanceof SerializationException;
                if (z && !(kSerializer.getDescriptor().getKind() instanceof kfd) && !x44.r(kSerializer.getDescriptor().getKind(), vsg.n) && !x44.r(kSerializer.getDescriptor().getKind(), vsg.m) && mwhVar.a(str2)) {
                    List list = xah.a;
                    cpc cpcVar = new cpc("tool", str);
                    cpc cpcVar2 = new cpc("target_type", kSerializer.getDescriptor().a());
                    cpc cpcVar3 = new cpc("payload_length", new Integer(str2.length()));
                    String strF = jce.a.b(e.getClass()).f();
                    if (strF == null) {
                        strF = "SerializationException";
                    }
                    xah.d("Tool data parse: decode failed", "tool_parse", sta.h0(cpcVar, cpcVar2, cpcVar3, new cpc("error_type", strF)));
                } else if (!(e instanceof IOException) && !z) {
                    List list2 = xah.a;
                    xah.f(e, ij0.j("Failed to parse ", str, " data"), null, null, 28);
                }
            } else if (mwhVar.a(str2)) {
                List list3 = xah.a;
                xah.d("Tool data parse: missing required fields", "tool_parse", sta.h0(new cpc("tool", str), new cpc("target_type", kSerializer.getDescriptor().a()), new cpc("payload_length", new Integer(str2.length())), new cpc("missing_fields", ((MissingFieldException) e).E)));
            }
            return null;
        }
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.I;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                qq0 qq0Var = new qq0(obj4, obj2, obj3, tp4Var, 0);
                qq0Var.F = obj;
                return qq0Var;
            case 1:
                qq0 qq0Var2 = new qq0((Context) obj4, (Uri) obj3, (String) obj2, tp4Var);
                qq0Var2.F = obj;
                return qq0Var2;
            case 2:
                return new qq0((Context) obj4, (tp0) this.F, (dae) obj3, (String) obj2, tp4Var);
            case 3:
                qq0 qq0Var3 = new qq0(obj2, obj4, (Comparable) obj3, tp4Var, 3);
                qq0Var3.F = obj;
                return qq0Var3;
            case 4:
                return new qq0((Activity) this.F, (tp0) obj4, (String) obj2, (PrintManager) obj3, tp4Var, 4);
            case 5:
                qq0 qq0Var4 = new qq0((pt2) obj4, (String) obj2, (sm) obj3, tp4Var, 5);
                qq0Var4.F = obj;
                return qq0Var4;
            case 6:
                qq0 qq0Var5 = new qq0(obj2, obj4, (Comparable) obj3, tp4Var, 6);
                qq0Var5.F = obj;
                return qq0Var5;
            case 7:
                return new qq0((t53) this.F, (McpServer) obj4, (twa) obj2, (ctc) obj3, tp4Var, 7);
            case 8:
                return new qq0((Exception) this.F, (t53) obj4, (ctc) obj2, (JsonRpcRequest) obj3, tp4Var, 8);
            case 9:
                qq0 qq0Var6 = new qq0((t53) obj4, (dae) obj2, (dae) obj3, tp4Var, 9);
                qq0Var6.F = obj;
                return qq0Var6;
            case 10:
                return new qq0((JsonObject) this.F, (so3) obj4, (String) obj2, (StdinMessage) obj3, tp4Var, 10);
            case 11:
                qq0 qq0Var7 = new qq0((z9e) obj4, (cae) obj2, (c) obj3, tp4Var, 11);
                qq0Var7.F = obj;
                return qq0Var7;
            case 12:
                return new qq0(this.F, obj4, obj2, obj3, tp4Var, 12);
            case 13:
                return new qq0((b0) this.F, (String) obj2, (String) obj3, (String) obj4, tp4Var);
            case 14:
                qq0 qq0Var8 = new qq0((e8d) obj4, (zeh) obj2, (zhh) obj3, tp4Var, 14);
                qq0Var8.F = obj;
                return qq0Var8;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                qq0 qq0Var9 = new qq0((pl3) obj4, (gf8) obj2, (pz7) obj3, tp4Var, 15);
                qq0Var9.F = obj;
                return qq0Var9;
            case 16:
                return new qq0((vza) this.F, (vya) obj4, (bg9) obj2, (bz7) obj3, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                qq0 qq0Var10 = new qq0((nwb) obj4, (nwb) obj2, (nwb) obj3, tp4Var, 17);
                qq0Var10.F = obj;
                return qq0Var10;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new qq0((v77) this.F, (View) obj4, (pz7) obj2, (pz7) obj3, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new qq0((ned) this.F, (String) obj2, (MessageBlobFile) obj4, (Long) obj3, tp4Var);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new qq0(this.F, obj4, obj2, obj3, tp4Var, 20);
            case 21:
                return new qq0(obj4, obj3, this.F, (String) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new qq0((String) obj2, (mwh) this.F, (KSerializer) obj4, (String) obj3, tp4Var);
            default:
                return new qq0(obj4, obj3, this.F, (String) obj2, tp4Var, 23);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 4:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 8:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 9:
                ((qq0) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 11:
                ((qq0) create((wvf) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 12:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 14:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((qq0) create((w85) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 16:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((qq0) create((sp6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 21:
                ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((qq0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object hreVar;
        Object hreVar2;
        Object hreVar3;
        Object obj2;
        Object obj3;
        String strN0;
        String strN02;
        int i = this.E;
        ozf ozfVar = ozf.F;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        iei ieiVar = iei.a;
        bqb bqbVar = 0;
        str = null;
        str = null;
        String str = null;
        deviceAttestation = null;
        deviceAttestation = null;
        deviceAttestation = null;
        deviceAttestation = null;
        DeviceAttestation deviceAttestation = null;
        Object obj4 = this.H;
        Object obj5 = this.I;
        Object obj6 = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                String str2 = (String) obj4;
                String str3 = (String) obj5;
                try {
                    File file = new File(oq5.G((Context) obj6), "tmp_artifact_export/" + UUID.randomUUID());
                    file.mkdirs();
                    File file2 = new File(file, str2);
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), dj2.a), FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                    try {
                        bufferedWriter.write(str3);
                        bufferedWriter.close();
                        hreVar = file2;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                Throwable thA = jre.a(hreVar);
                if (thA == null) {
                    return hreVar;
                }
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                List list = xah.a;
                xah.f(thA, "Failed to write exported artifact temp file", ozfVar, null, 24);
                return null;
            case 1:
                sf5.h0(obj);
                String str4 = (String) obj4;
                try {
                    OutputStream outputStreamOpenOutputStream = ((Context) obj6).getContentResolver().openOutputStream((Uri) obj5, "rwt");
                    if (outputStreamOpenOutputStream != null) {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(outputStreamOpenOutputStream, dj2.a), FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                        try {
                            bufferedWriter2.write(str4);
                            bufferedWriter2.close();
                            z = true;
                        } finally {
                        }
                    }
                    hreVar2 = Boolean.valueOf(z);
                } catch (Throwable th2) {
                    hreVar2 = new hre(th2);
                }
                Throwable thA2 = jre.a(hreVar2);
                if (thA2 == null) {
                    return hreVar2;
                }
                if (thA2 instanceof CancellationException) {
                    throw thA2;
                }
                List list2 = xah.a;
                xah.f(thA2, "Failed to write exported artifact to document", ozfVar, null, 24);
                return Boolean.FALSE;
            case 2:
                sf5.h0(obj);
                File file3 = new File(oq5.G((Context) obj6), "tmp_artifact_pdf");
                long jCurrentTimeMillis = System.currentTimeMillis() - 3600000;
                File[] fileArrListFiles = file3.listFiles();
                if (fileArrListFiles != null) {
                    for (File file4 : fileArrListFiles) {
                        if (file4.lastModified() < jCurrentTimeMillis) {
                            nk7.l0(file4);
                        }
                    }
                }
                qtc qtcVar = as0.a;
                String strA = as0.a((tp0) this.F);
                File file5 = new File(file3, UUID.randomUUID().toString());
                file5.mkdirs();
                ((dae) obj5).E = file5;
                return new cpc(new File(file5, (String) obj4), strA);
            case 3:
                File file6 = (File) obj4;
                sf5.h0(obj);
                try {
                    try {
                        OutputStream outputStreamOpenOutputStream2 = ((Context) obj6).getContentResolver().openOutputStream((Uri) obj5, "rwt");
                        if (outputStreamOpenOutputStream2 != null) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file6);
                                try {
                                    zni.o(fileInputStream, outputStreamOpenOutputStream2);
                                    fileInputStream.close();
                                    outputStreamOpenOutputStream2.close();
                                    z2 = true;
                                } finally {
                                }
                            } finally {
                            }
                        }
                        hreVar3 = Boolean.valueOf(z2);
                    } catch (Throwable th3) {
                        hreVar3 = new hre(th3);
                    }
                    Throwable thA3 = jre.a(hreVar3);
                    if (thA3 == null) {
                        obj2 = hreVar3;
                    } else {
                        if (thA3 instanceof CancellationException) {
                            throw thA3;
                        }
                        List list3 = xah.a;
                        xah.f(thA3, "Failed to copy artifact PDF to document", ozfVar, null, 24);
                        obj2 = Boolean.FALSE;
                    }
                    return (Boolean) obj2;
                } finally {
                    File parentFile = file6.getParentFile();
                    if (parentFile != null) {
                        nk7.l0(parentFile);
                    }
                }
            case 4:
                sf5.h0(obj);
                Activity activity = (Activity) this.F;
                WebView webView = new WebView(activity);
                webView.setWebViewClient(new gu0((tp0) obj6, activity, (PrintManager) obj5));
                webView.loadDataWithBaseURL(null, (String) obj4, "text/html", "UTF-8", null);
                return ieiVar;
            case 5:
                l45 l45Var = (l45) this.F;
                sf5.h0(obj);
                List files = ((pt2) obj6).a.getFiles();
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : files) {
                    if (obj7 instanceof sw2) {
                        arrayList.add(obj7);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj8 : arrayList) {
                    if (tik.j((sw2) obj8)) {
                        arrayList2.add(obj8);
                    }
                }
                pt2 pt2Var = (pt2) obj6;
                String str5 = (String) obj4;
                sm smVar = (sm) obj5;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    gb9.D(l45Var, null, null, new cm((sw2) it.next(), pt2Var, str5, smVar, null, 14), 3);
                }
                return ieiVar;
            case 6:
                l45 l45Var2 = (l45) this.F;
                sf5.h0(obj);
                f03 f03Var = (f03) obj6;
                String str6 = (String) obj5;
                gb9.D(l45Var2, null, null, new c03(f03Var, str6, bqbVar, z4 ? 1 : 0), 3);
                String str7 = (String) obj4;
                if (str7 != null) {
                    gb9.D(l45Var2, null, null, new e03(f03Var, str7, str6, (tp4) null), 3);
                }
                return ieiVar;
            case 7:
                ctc ctcVar = (ctc) obj5;
                twa twaVar = (twa) obj4;
                McpServer mcpServer = (McpServer) obj6;
                t53 t53Var = (t53) this.F;
                mdg mdgVar = t53Var.n0;
                sf5.h0(obj);
                try {
                    UiResourceMeta uiResourceMeta = twaVar.d;
                    mdgVar.put(ctcVar.a, new txa(twaVar.a, twaVar.b, twaVar.d, twaVar.c, null, t53.Q(t53Var, mcpServer, uiResourceMeta != null ? uiResourceMeta.getDomain() : null), mcpServer.getAllowed_link_domains(), t53Var.L0, mcpServer.m346getUuidowoRr7k(), mcpServer.getUrl(), 16));
                } catch (DomainValidationException e) {
                    mdgVar.put(ctcVar.a, new txa(null, null, null, null, mxa.a, null, null, null, null, null, 1007));
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Invalid domain";
                    }
                    t53Var.D1(ctcVar, message, aok.i(e), null);
                    List list4 = xah.a;
                    xah.f(e, null, ozf.G, null, 26);
                }
                return ieiVar;
            case 8:
                sf5.h0(obj);
                Exception exc = (Exception) this.F;
                Integer numH = aok.h(exc);
                JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) obj5;
                ((t53) obj6).D1((ctc) obj4, numH != null ? "Proxy forward failed: " + jsonRpcRequest.getMethod() + " (" + numH + ")" : ij0.i("Proxy forward failed: ", jsonRpcRequest.getMethod()), aok.i(exc), numH);
                return ieiVar;
            case 9:
                dae daeVar = (dae) obj4;
                dae daeVar2 = (dae) obj5;
                t53 t53Var2 = (t53) obj6;
                im2 im2Var = (im2) this.F;
                sf5.h0(obj);
                String str8 = im2Var.b;
                if (str8 != null && (strN02 = t53.n0(t53Var2, (String) daeVar.E, str8)) != null) {
                    daeVar.E = strN02;
                }
                kdg kdgVar = t53Var2.X0;
                int size = kdgVar.size() - 1;
                int iE = oq5.E(kdgVar);
                while (true) {
                    if (!(size >= 0)) {
                        obj3 = null;
                    } else {
                        if (oq5.E(kdgVar) != iE) {
                            sz6.c();
                            return null;
                        }
                        oq5.o(size, kdgVar.size());
                        obj3 = kdgVar.get(size);
                        size--;
                        if (MessageId.m1054equalsimpl0(((whd) obj3).c(), (String) daeVar2.E)) {
                        }
                    }
                }
                vhd vhdVar = obj3 instanceof vhd ? (vhd) obj3 : null;
                String str9 = im2Var.c;
                if (vhdVar == null || !vhdVar.d || str9 == null || (strN0 = t53.n0(t53Var2, (String) daeVar2.E, str9)) == null) {
                    return ieiVar;
                }
                efe efeVar = t53Var2.A1;
                String str10 = (String) daeVar2.E;
                efeVar.getClass();
                str10.getClass();
                uw1 uw1Var = (uw1) efeVar.F;
                if (uw1Var != null) {
                    String str11 = uw1Var.c;
                    if (!(str11 != null ? MessageId.m1054equalsimpl0(str11, str10) : false)) {
                        uw1Var = null;
                    }
                    if (uw1Var != null) {
                        efeVar.F = new uw1(uw1Var.a, uw1Var.b, strN0);
                    }
                }
                daeVar2.E = strN0;
                bqb bqbVar2 = (bqb) t53Var2.L1.getValue();
                if (bqbVar2 != null) {
                    ModelSelection modelSelection = bqbVar2.b;
                    String str12 = bqbVar2.c;
                    String str13 = bqbVar2.d;
                    String str14 = bqbVar2.e;
                    String str15 = bqbVar2.f;
                    modelSelection.getClass();
                    str12.getClass();
                    bqbVar = new bqb(strN0, modelSelection, str12, str13, str14, str15);
                }
                t53Var2.x1(bqbVar);
                return ieiVar;
            case 10:
                sf5.h0(obj);
                JsonObject jsonObject = (JsonObject) this.F;
                so3 so3Var = (so3) obj6;
                String str16 = (String) obj4;
                StdinMessage stdinMessage = (StdinMessage) obj5;
                u5e u5eVar = so3Var.a;
                if (!bsg.I0(stdinMessage.getUuid())) {
                    try {
                        SharedPreferences sharedPreferencesD = so3Var.b.d();
                        String string = sharedPreferencesD != null ? sharedPreferencesD.getString("device_binding_kid", null) : null;
                        if (string != null && u5eVar.h()) {
                            byte[] bArrK = u5eVar.k(vo3.d(str16, stdinMessage.getUuid(), stdinMessage.getType(), vo3.a(jsonObject)));
                            if (bArrK == null) {
                                so3Var.a(stdinMessage.getType(), new IllegalStateException("device-binding key present but sign returned null"));
                            } else {
                                String strEncodeToString = vo3.b.encodeToString(vo3.b(bArrK));
                                strEncodeToString.getClass();
                                deviceAttestation = new DeviceAttestation(string, strEncodeToString);
                            }
                        }
                    } catch (Exception e2) {
                        so3Var.a(stdinMessage.getType(), e2);
                    }
                }
                return new ClientEventEnvelope(jsonObject, deviceAttestation);
            case 11:
                wvf wvfVar = (wvf) this.F;
                sf5.h0(obj);
                ((z9e) obj6).E = true;
                lz1 lz1Var = uh6.F;
                ((cae) obj4).E = v40.Q(2, zh6.SECONDS);
                c cVar = (c) obj5;
                cVar.getClass();
                if (wvfVar instanceof vvf) {
                    SessionResource sessionResource = ((vvf) wvfVar).a;
                    if (sessionResource.isAgentOwned() && !cVar.k.a()) {
                        return ieiVar;
                    }
                    if (cVar.a0().e.contains(SessionId.m1114boximpl(sessionResource.m875getIdOcx55TE()))) {
                        cVar.g0(htf.a(cVar.a0(), null, false, false, 0, dxf.n0(cVar.a0().e, SessionId.m1114boximpl(sessionResource.m875getIdOcx55TE())), 15));
                    }
                    d8a d8aVar = new d8a(cVar.X().size() + 1);
                    d8aVar.add(sessionResource);
                    for (Object obj9 : cVar.X()) {
                        if (!SessionId.m1117equalsimpl0(((SessionResource) obj9).m875getIdOcx55TE(), sessionResource.m875getIdOcx55TE())) {
                            d8aVar.add(obj9);
                        }
                    }
                    cVar.f0(x44.v(d8aVar));
                } else {
                    if (!(wvfVar instanceof uvf)) {
                        wg6.i();
                        return null;
                    }
                    List listX = cVar.X();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj10 : listX) {
                        if (!SessionId.m1117equalsimpl0(((SessionResource) obj10).m875getIdOcx55TE(), ((uvf) wvfVar).a)) {
                            arrayList3.add(obj10);
                        }
                    }
                    cVar.f0(arrayList3);
                    cVar.g0(htf.a(cVar.a0(), null, false, false, 0, dxf.q0(cVar.a0().e, SessionId.m1114boximpl(((uvf) wvfVar).a)), 15));
                }
                cVar.C.setValue(d69.a.c());
                u9a u9aVarY = cVar.Y();
                s9a s9aVar = s9a.a;
                if (x44.r(u9aVarY, s9aVar) || cVar.X().isEmpty()) {
                    return ieiVar;
                }
                cVar.J.setValue(s9aVar);
                return ieiVar;
            case 12:
                sf5.h0(obj);
                f fVar = (f) this.F;
                Uri uri = (Uri) obj6;
                Set set = f.j1;
                if (!fVar.t0(uri) || !com.anthropic.claude.conway.g.c(uri.getEncodedPath()) || !f.O(fVar, uri, (String) obj4, (String) obj5)) {
                    fVar.z0(uri);
                }
                return ieiVar;
            case 13:
                sf5.h0(obj);
                b0 b0Var = (b0) this.F;
                jie jieVar = new jie();
                String str17 = (String) obj4;
                jieVar.g(b0Var.a + str17);
                b0Var.f(jieVar);
                sie sieVar = tie.Companion;
                p8b p8bVar = b0.q;
                sieVar.getClass();
                jieVar.e("POST", sie.b((String) obj5, p8bVar));
                String str18 = (String) obj6;
                if (str18 == null) {
                    str18 = (String) b0Var.i.get();
                }
                if (str18 != null) {
                    jieVar.d("X-Client-Id", str18);
                }
                pqe pqeVarF = new f4e(b0Var.c, new kie(jieVar), false).f();
                try {
                    String strF = pqeVarF.K.f();
                    if (!pqeVarF.U) {
                        throw new ConwayHttpException("POST", str17, pqeVarF.H, strF);
                    }
                    pqeVarF.close();
                    return strF;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 14:
                sf5.h0(obj);
                l45 l45Var3 = (l45) this.F;
                e8d e8dVar = (e8d) obj6;
                a35 a35Var = new a35(e8dVar, (zeh) obj4, bqbVar, z ? 1 : 0);
                o45 o45Var = o45.H;
                gb9.D(l45Var3, null, o45Var, a35Var, 1);
                gb9.D(l45Var3, null, o45Var, new ed3(e8dVar, (zhh) obj5, bqbVar, 23), 1);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                w85 w85Var = (w85) this.F;
                sf5.h0(obj);
                if (w85Var == null) {
                    wg6.i();
                    return null;
                }
                ((pl3) obj6).d((gf8) obj4);
                ((pz7) obj5).invoke(w85Var.a, w85Var.b);
                return ieiVar;
            case 16:
                vya vyaVar = (vya) obj6;
                sf5.h0(obj);
                vza vzaVar = (vza) this.F;
                if (vzaVar.a()) {
                    JsonObject jsonObject2 = vyaVar.g;
                    JsonObject jsonObject3 = vyaVar.g;
                    if (jsonObject2 != null && !jsonObject2.equals(vzaVar.r)) {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj11 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj11)).getClass();
                                arrayList4.add(obj11);
                            }
                            if (!arrayList4.isEmpty()) {
                                zfa.a.getClass();
                                Iterator it2 = arrayList4.iterator();
                                while (it2.hasNext()) {
                                    ((n30) ((zfa) it2.next())).b(sfa.INFO, "McpAppViewHost", "Sending deferred tool input");
                                }
                            }
                        }
                        aya ayaVar = vzaVar.a;
                        bg9 bg9Var = (bg9) obj4;
                        ToolInputParams toolInputParams = new ToolInputParams(jsonObject3);
                        bg9Var.getClass();
                        ayaVar.d("ui/notifications/tool-input", ch9.i(bg9Var.c(toolInputParams, ToolInputParams.Companion.serializer())));
                        vzaVar.r = jsonObject3;
                        vzaVar.s = 0;
                        bz7 bz7Var = (bz7) obj5;
                        if (bz7Var != null) {
                            bz7Var.invoke("ui/notifications/tool-input");
                        }
                    }
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                nwb nwbVar = (nwb) obj4;
                sp6 sp6Var = (sp6) this.F;
                sf5.h0(obj);
                if (sp6Var == null) {
                    wg6.i();
                    return null;
                }
                ((nwb) obj6).setValue(sp6Var.a);
                if (!((Boolean) nwbVar.getValue()).booleanValue()) {
                    return ieiVar;
                }
                ((nwb) obj5).setValue(z1d.F);
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                pz7 pz7Var = (pz7) obj5;
                View view = (View) obj6;
                v77 v77Var = (v77) this.F;
                sf5.h0(obj);
                Object tag = view.getTag();
                v77 v77Var2 = tag instanceof v77 ? (v77) tag : null;
                if (v77Var2 != null && !v77Var2.equals(v77Var) && v77Var2.q(27)) {
                    pz7Var.invoke(v77Var2, view);
                }
                if (v77Var.q(27)) {
                    ((pz7) obj4).invoke(v77Var, view);
                    view.setTag(v77Var);
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                sf5.h0(obj);
                hdc hdcVar = ((ned) this.F).a;
                jie jieVar2 = new jie();
                jieVar2.g((String) obj4);
                pqe pqeVarF2 = new f4e(hdcVar, new kie(jieVar2), false).f();
                MessageBlobFile messageBlobFile = (MessageBlobFile) obj6;
                Long l = (Long) obj5;
                try {
                    if (pqeVarF2.U) {
                        BufferedSource bufferedSourceG0 = pqeVarF2.K.G0();
                        ozf ozfVar2 = ozf.E;
                        if (l == null && bufferedSourceG0.j0(2000001L)) {
                            SilentException.a(new SilentException("Preview fetch: file exceeds 2000000B cap, file_uuid=" + messageBlobFile.mo236getFile_uuidExWXDbg()), ozfVar2, false, 2);
                        } else {
                            String strT0 = bufferedSourceG0.t0();
                            if (bsg.v0(strT0, (char) 0)) {
                                SilentException.a(new SilentException("Preview fetch: binary content (NUL byte), file_uuid=" + messageBlobFile.mo236getFile_uuidExWXDbg()), ozfVar2, false, 2);
                            } else {
                                str = strT0;
                            }
                        }
                    } else {
                        int i2 = pqeVarF2.H;
                        String strMo236getFile_uuidExWXDbg = messageBlobFile.mo236getFile_uuidExWXDbg();
                        if (messageBlobFile.getPath() == null) {
                            z3 = false;
                        }
                        SilentException.a(new SilentException("Preview fetch failed: HTTP " + i2 + " file_uuid=" + strMo236getFile_uuidExWXDbg + " is_wiggle=" + z3), ozfVar, false, 2);
                    }
                    pqeVarF2.close();
                    return str;
                } catch (Throwable th4) {
                }
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                sf5.h0(obj);
                for (tt7 tt7Var : ((bna) this.F).f.values()) {
                    Context context = (Context) obj6;
                    tt7Var.getClass();
                    String str19 = tt7Var.b;
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), ij0.C((String) obj4, tt7Var.a, (String) obj5));
                        try {
                            typefaceCreateFromAsset.getClass();
                            str19.getClass();
                            boolean zU0 = bsg.u0(str19, "Italic", false);
                            boolean zU02 = bsg.u0(str19, "Bold", false);
                            int i3 = (zU0 && zU02) ? 3 : zU0 ? 2 : zU02 ? 1 : 0;
                            if (typefaceCreateFromAsset.getStyle() != i3) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                            }
                            tt7Var.c = typefaceCreateFromAsset;
                        } catch (Exception unused) {
                            oga.a.getClass();
                        }
                    } catch (Exception unused2) {
                        oga.a.getClass();
                    }
                }
                return ieiVar;
            case 21:
                sf5.h0(obj);
                ((View) obj6).setKeepScreenOn(true);
                phg phgVar = (phg) obj5;
                gb9.D(phgVar.a, null, null, new mt4(phgVar, this.F, (String) obj4, (tp4) null, 27), 3);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return d(obj);
            default:
                sf5.h0(obj);
                try {
                    return ((mwh) obj6).a.d(this.F, (KSerializer) obj5);
                } catch (Exception e3) {
                    if ((e3 instanceof IOException) || (e3 instanceof SerializationException)) {
                        return null;
                    }
                    List list5 = xah.a;
                    xah.f(e3, ij0.j("Failed to serialize ", (String) obj4, " output"), null, null, 28);
                    return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(Context context, tp0 tp0Var, dae daeVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.G = context;
        this.F = tp0Var;
        this.I = daeVar;
        this.H = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(Context context, Uri uri, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.G = context;
        this.I = uri;
        this.H = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(b0 b0Var, String str, String str2, String str3, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 13;
        this.F = b0Var;
        this.H = str;
        this.I = str2;
        this.G = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq0(Object obj, Object obj2, Comparable comparable, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = obj2;
        this.I = comparable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq0(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq0(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq0(Object obj, Object obj2, Object obj3, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.I = obj2;
        this.F = obj3;
        this.H = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(String str, mwh mwhVar, KSerializer kSerializer, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 22;
        this.H = str;
        this.F = mwhVar;
        this.G = kSerializer;
        this.I = str2;
    }
}
