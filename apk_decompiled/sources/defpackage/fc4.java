package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.conway.protocol.ConwayHttpException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonPrimitive;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fc4 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ fc4(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.E;
        fqb fqbVar = fqb.E;
        boolean z = false;
        iei ieiVar = iei.a;
        switch (i2) {
            case 0:
                ((ekf) obj).getClass();
                return ieiVar;
            case 1:
                ((ekf) obj).getClass();
                return ieiVar;
            case 2:
                ((ekf) obj).getClass();
                return ieiVar;
            case 3:
                ((ekf) obj).getClass();
                return ieiVar;
            case 4:
                ((g4j) obj).getClass();
                return ieiVar;
            case 5:
                DirectoryServer.PromptImage promptImage = (DirectoryServer.PromptImage) obj;
                promptImage.getClass();
                String image_url = promptImage.getImage_url();
                if (image_url != null) {
                    if (bsg.I0(image_url)) {
                        image_url = null;
                    }
                    if (image_url != null) {
                        return image_url;
                    }
                }
                String prompt = promptImage.getPrompt();
                return prompt == null ? "" : prompt;
            case 6:
                return Long.valueOf(((b19) obj).a == 0 ? 0L : 300L);
            case 7:
                DirectoryServer directoryServer = (DirectoryServer) obj;
                directoryServer.getClass();
                return directoryServer.m342getIdHdVeoME();
            case 8:
                int iIntValue = ((Integer) obj).intValue();
                qnc qncVar = qf2.a;
                return gb9.N(gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, iIntValue > 0 ? 2.0f : 0.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            case 9:
                McpServer mcpServer = (McpServer) obj;
                mcpServer.getClass();
                return mcpServer.m346getUuidowoRr7k();
            case 10:
                int iIntValue2 = ((Integer) obj).intValue();
                qnc qncVar2 = qf2.a;
                return gb9.N(gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, iIntValue2 > 0 ? 2.0f : 0.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            case 11:
                McpServer mcpServer2 = (McpServer) obj;
                mcpServer2.getClass();
                return ij0.i("addFrom:", mcpServer2.m346getUuidowoRr7k());
            case 12:
                String str = (String) obj;
                str.getClass();
                String strQuote = Pattern.quote(str);
                strQuote.getClass();
                return strQuote;
            case 13:
                Context context = (Context) obj;
                context.getClass();
                WebView webView = new WebView(context);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.setBackgroundColor(0);
                webView.setHorizontalScrollBarEnabled(false);
                webView.setVerticalScrollBarEnabled(false);
                WebSettings settings = webView.getSettings();
                settings.setBuiltInZoomControls(true);
                settings.setDisplayZoomControls(false);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                return webView;
            case 14:
                ((ekf) obj).getClass();
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((ekf) obj).getClass();
                return ieiVar;
            case 16:
                ConwayAppScreen.Extension extension = (ConwayAppScreen.Extension) obj;
                extension.getClass();
                return ij0.C(extension.getExtensionName(), "|", extension.getUrl());
            case g.MAX_FIELD_NUMBER /* 17 */:
                ckg ckgVar = (ckg) obj;
                ckgVar.getClass();
                return ckgVar.c;
            case g.AVG_FIELD_NUMBER /* 18 */:
                rh9 rh9Var = (rh9) obj;
                rh9Var.getClass();
                mpk.U(rh9Var, "type", "object");
                rh9 rh9Var2 = new rh9();
                rh9 rh9Var3 = new rh9();
                mpk.U(rh9Var3, "type", "string");
                mpk.U(rh9Var3, "description", "Optional one-line label rendered above the buttons, e.g. 'Pick one or more:'");
                rh9Var2.b("prompt", rh9Var3.a());
                mpk.W(rh9Var2, "actions", new fc4(19));
                rh9Var.b("properties", rh9Var2.a());
                ArrayList arrayList = new ArrayList();
                JsonPrimitive jsonPrimitiveC = ch9.c("actions");
                jsonPrimitiveC.getClass();
                arrayList.add(jsonPrimitiveC);
                rh9Var.b("required", new JsonArray(arrayList));
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                rh9 rh9Var4 = (rh9) obj;
                rh9Var4.getClass();
                mpk.U(rh9Var4, "type", "array");
                mpk.U(rh9Var4, "description", "1-6 buttons. More than 6 is rejected.");
                mpk.W(rh9Var4, "items", new fc4(20));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                rh9 rh9Var5 = (rh9) obj;
                rh9Var5.getClass();
                mpk.U(rh9Var5, "type", "object");
                rh9 rh9Var6 = new rh9();
                rh9 rh9Var7 = new rh9();
                mpk.U(rh9Var7, "type", "string");
                mpk.U(rh9Var7, "description", "Short button text shown to the user, e.g. 'Merge 4003'. Max ~40 chars.");
                rh9Var6.b("label", rh9Var7.a());
                rh9 rh9Var8 = new rh9();
                mpk.U(rh9Var8, "type", "string");
                mpk.U(rh9Var8, "description", "The exact text appended to the composer when this button is tapped, e.g. 'merge 4003'.");
                rh9Var6.b("message", rh9Var8.a());
                rh9Var5.b("properties", rh9Var6.a());
                ArrayList arrayList2 = new ArrayList();
                JsonPrimitive jsonPrimitiveC2 = ch9.c("label");
                jsonPrimitiveC2.getClass();
                arrayList2.add(jsonPrimitiveC2);
                JsonPrimitive jsonPrimitiveC3 = ch9.c("message");
                jsonPrimitiveC3.getClass();
                arrayList2.add(jsonPrimitiveC3);
                rh9Var5.b("required", new JsonArray(arrayList2));
                return ieiVar;
            case 21:
                op9 op9Var = (op9) obj;
                op9Var.getClass();
                return op9Var.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.p(ekfVar, 0);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                zv4 zv4Var = (zv4) obj;
                zv4Var.getClass();
                return zv4Var.a;
            case 24:
                ((WebView) obj).getClass();
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ova ovaVar = (ova) obj;
                ovaVar.getClass();
                List listX0 = bsg.X0((CharSequence) ((mva) ovaVar.a()).get(2), new char[]{';'}, 6);
                ArrayList arrayList3 = new ArrayList(x44.y(listX0, 10));
                Iterator it = listX0.iterator();
                while (it.hasNext()) {
                    String lowerCase = bsg.k1(bsg.g1((String) it.next(), ':')).toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    arrayList3.add(lowerCase);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (((String) obj2).length() > 0) {
                        arrayList4.add(obj2);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    if (arrayList4.isEmpty()) {
                        return "";
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        if (!ow4.c((String) it2.next())) {
                        }
                    }
                    return "";
                }
                return ovaVar.c();
            case 26:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey() + " (" + entry.getValue() + ")";
            case 27:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                og9Var.c = true;
                og9Var.d = true;
                og9Var.a = true;
                return ieiVar;
            case 28:
                g25 g25Var = (g25) obj;
                g25Var.getClass();
                return ij0.C(g25Var.a, "=", g25Var.b);
            default:
                Exception exc = (Exception) obj;
                exc.getClass();
                if ((exc instanceof ConwayHttpException) && 400 <= (i = ((ConwayHttpException) exc).E) && i < 500 && i != 408 && i != 429) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
