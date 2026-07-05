package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.bell.api.a1;
import com.anthropic.claude.types.strings.MessageId;
import com.mikepenz.aboutlibraries.entity.Developer;
import com.mikepenz.aboutlibraries.entity.Funding;
import com.mikepenz.aboutlibraries.entity.Library;
import com.mikepenz.aboutlibraries.entity.License;
import com.mikepenz.aboutlibraries.entity.Organization;
import com.mikepenz.aboutlibraries.entity.Scm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ v0(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [lm6] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws JSONException {
        ?? arrayList;
        ?? arrayList2;
        Organization organization;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                return obj == ((w0) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                l2 l2Var = (l2) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == l2Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != l2Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                hcb hcbVar = (hcb) obj2;
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, null, null, Boolean.valueOf(hcbVar.c()), Boolean.valueOf(hcbVar.a()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268434687, null);
            case 3:
                AccountSettings accountSettings2 = (AccountSettings) obj;
                accountSettings2.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj2, null, null, 234881023, null);
            case 4:
                de deVar = (de) obj2;
                deVar.U.invoke((ydh) obj, yb5.o(deVar, w00.b));
                return ieiVar;
            case 5:
                hi hiVar = (hi) obj;
                hiVar.getClass();
                ((ai) obj2).c.setValue(hiVar);
                return ieiVar;
            case 6:
                lwc lwcVar = (lwc) obj;
                lwcVar.getClass();
                return Boolean.valueOf(x44.r(lwcVar.a, ((ro) ((so) obj2)).a));
            case 7:
                ((ekf) obj).a(hif.a, new gif(te8.E, ((qcc) obj2).a(), fif.F, true));
                return ieiVar;
            case 8:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getClass();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("licenses");
                ?? arrayList3 = lm6.E;
                if (jSONArrayOptJSONArray == null) {
                    arrayList = arrayList3;
                } else {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArrayOptJSONArray.getString(i2);
                        string.getClass();
                        arrayList.add((License) linkedHashMap.get(string));
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (License license : (Iterable) arrayList) {
                    if (license != null) {
                        arrayList4.add(license);
                    }
                }
                HashSet hashSet = new HashSet(tta.d0(x44.y(arrayList4, 12)));
                w44.m1(arrayList4, hashSet);
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("developers");
                if (jSONArrayOptJSONArray2 != null) {
                    arrayList2 = new ArrayList();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i3);
                        jSONObject2.getClass();
                        arrayList2.add(new Developer(jSONObject2.optString("name"), jSONObject2.optString("organisationUrl")));
                    }
                } else {
                    arrayList2 = arrayList3;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("organization");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    if (strOptString == null) {
                        strOptString = "";
                    }
                    organization = new Organization(strOptString, jSONObjectOptJSONObject.optString("url"));
                } else {
                    organization = null;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("scm");
                Scm scm = jSONObjectOptJSONObject2 != null ? new Scm(jSONObjectOptJSONObject2.optString("connection"), jSONObjectOptJSONObject2.optString("developerConnection"), jSONObjectOptJSONObject2.optString("url")) : null;
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("funding");
                if (jSONArrayOptJSONArray3 != null) {
                    arrayList3 = new ArrayList();
                    int length3 = jSONArrayOptJSONArray3.length();
                    for (int i4 = 0; i4 < length3; i4++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray3.getJSONObject(i4);
                        jSONObject3.getClass();
                        String string2 = jSONObject3.getString("platform");
                        string2.getClass();
                        String string3 = jSONObject3.getString("url");
                        string3.getClass();
                        arrayList3.add(new Funding(string2, string3));
                    }
                }
                Set setT1 = w44.t1((Iterable) arrayList3);
                String string4 = jSONObject.getString("uniqueId");
                string4.getClass();
                String strOptString2 = jSONObject.optString("artifactVersion");
                String strOptString3 = jSONObject.optString("name", string4);
                strOptString3.getClass();
                return new Library(string4, strOptString2, strOptString3, jSONObject.optString("description"), jSONObject.optString("website"), csg.P((Iterable) arrayList2), organization, scm, csg.Q(hashSet), csg.Q(setT1), jSONObject.optString("tag"));
            case 9:
                ((s2i) obj2).d(((Number) ((lb0) obj).e.getValue()).floatValue());
                return ieiVar;
            case 10:
                AppStartResponse appStartResponse = (AppStartResponse) obj;
                appStartResponse.getClass();
                return AppStartResponse.copy$default(appStartResponse, (Account) obj2, null, null, null, null, null, null, 126, null);
            case 11:
                AccountSettings accountSettings3 = (AccountSettings) obj2;
                AppStartResponse appStartResponse2 = (AppStartResponse) obj;
                appStartResponse2.getClass();
                return AppStartResponse.copy$default(appStartResponse2, Account.m101copyl0kCUe4$default(appStartResponse2.getAccount(), null, null, null, null, null, null, null, accountSettings3, false, 383, null), null, null, null, null, null, null, 126, null);
            case 12:
                p61 p61Var = (p61) obj2;
                ((Context) obj).getClass();
                return p61Var;
            case 13:
                return new o10(3, (hf1) obj2);
            case 14:
                return new o10(4, (l2i) obj2);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((a1) obj2).g.c0(ieiVar);
                return ieiVar;
            case 16:
                no1 no1Var = (no1) obj;
                no1Var.getClass();
                return !((dn1) obj2).a.q().b ? no1.a(no1Var, true, false, false, false, false, false, false, false, false, false, 992) : no1.a(no1Var, false, false, false, false, false, false, false, false, false, false, 1011);
            case g.MAX_FIELD_NUMBER /* 17 */:
                en1 en1Var = (en1) obj2;
                Boolean bool = (Boolean) obj;
                en1Var.s = bool.booleanValue();
                en1Var.p = true;
                en1Var.j.invoke(bool);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                yh1 yh1Var = (yh1) obj2;
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                String str = si1Var.a;
                String str2 = si1Var.b;
                String str3 = si1Var.c;
                String str4 = si1Var.d;
                String str5 = si1Var.e;
                String str6 = si1Var.g;
                s41 s41Var = si1Var.h;
                boolean z = si1Var.i;
                String str7 = si1Var.j;
                float f = si1Var.k;
                str.getClass();
                s41Var.getClass();
                a1 a1Var = new a1(yh1Var.c);
                gdc gdcVarB = ((hdc) yh1Var.a.a()).b();
                lz1 lz1Var = uh6.F;
                gdcVarB.c(0L);
                hdc hdcVar = new hdc(gdcVarB);
                Uri.Builder builderBuildUpon = Uri.parse(String.format(yh1Var.b.concat("ws/voice/organizations/%s/chat_conversations/%s"), Arrays.copyOf(new Object[]{yh1Var.d.e, str}, 2))).buildUpon();
                r41.E.getClass();
                Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("input_encoding", "opus").appendQueryParameter("input_sample_rate", String.valueOf(16000)).appendQueryParameter("input_channels", String.valueOf(1)).appendQueryParameter("timezone", yh1Var.e.g());
                gj1 gj1Var = yh1Var.f;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("output_format", ((Boolean) gj1Var.h.getValue()).booleanValue() ? "opus_48000_32" : "pcm_16000");
                if (str2 != null) {
                    builderAppendQueryParameter2.appendQueryParameter("model", str2);
                }
                if (str3 != null) {
                    builderAppendQueryParameter2.appendQueryParameter("project_uuid", str3);
                }
                if (str4 != null) {
                    builderAppendQueryParameter2.appendQueryParameter("effort", str4);
                }
                if (str5 != null) {
                    builderAppendQueryParameter2.appendQueryParameter("thinking_mode", str5);
                }
                if (str6 != null) {
                    builderAppendQueryParameter2.appendQueryParameter("voice", str6);
                }
                if (str7 != null) {
                    builderAppendQueryParameter2.appendQueryParameter("language", str7);
                }
                if (gj1Var.d()) {
                    builderAppendQueryParameter2.appendQueryParameter("server_interrupt_enabled", "True");
                }
                if (z) {
                    builderAppendQueryParameter2.appendQueryParameter("is_temporary", "True");
                }
                jie jieVar = new jie();
                String string5 = builderAppendQueryParameter2.toString();
                string5.getClass();
                jieVar.g(string5);
                jieVar.a("X-Config-TTS-Speed", String.valueOf(f));
                if (yh1Var.g.a()) {
                    jieVar.a("x-config-include-server-info", "true");
                }
                a1Var.e = hdcVar.c(new kie(jieVar), a1Var);
                return a1Var;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str8 = (String) obj;
                str8.getClass();
                return Boolean.valueOf(((go1) obj2).d.k(str8));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((xd6) obj).getClass();
                ((cv9) obj2).a();
                return ieiVar;
            case 21:
                ja8 ja8Var = (ja8) obj2;
                cv9 cv9Var = (cv9) obj;
                cv9Var.getClass();
                xd6.Q0(cv9Var, ja8Var, new v0(20, cv9Var));
                csg.t(cv9Var, ja8Var);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((sw2) obj2).c((Float) obj);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ww2 ww2Var = (ww2) obj;
                ww2Var.getClass();
                return Boolean.valueOf(x44.r(ww2Var.j(), ((ww2) obj2).j()));
            case 24:
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                c40 c40VarA = f40.a();
                mpk.j(c40VarA, ((e0g) obj2).a(b52Var.E.g(), b52Var.E.getLayoutDirection(), b52Var));
                return b52Var.b(new v0(25, c40VarA));
            case BuildConfig.VERSION_CODE /* 25 */:
                c40 c40Var = (c40) obj2;
                cv9 cv9Var2 = (cv9) obj;
                cv9Var2.getClass();
                fj0 fj0Var = cv9Var2.E.F;
                long jW = fj0Var.w();
                fj0Var.p().g();
                try {
                    ((efe) fj0Var.E).j(c40Var);
                    cv9Var2.a();
                    return ieiVar;
                } finally {
                    grc.y(fj0Var, jW);
                }
            case 26:
                whd whdVar = (whd) obj;
                whdVar.getClass();
                return Boolean.valueOf(((o09) obj2).a.contains(MessageId.m1051boximpl(whdVar.c())));
            case 27:
                return ChatConversation.m167copytBaNr2I$default((ChatConversation) obj, null, null, null, null, null, ((ModelSelection) obj2).m253getModeli4oh0I(), null, false, null, false, null, 2015, null);
            case 28:
                ((Boolean) obj).getClass();
                ((xc3) obj2).a();
                return ieiVar;
            default:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                if (((i9g) obj2).c) {
                    xreVar.l(-1.0f);
                }
                return ieiVar;
        }
    }
}
