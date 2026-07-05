package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$CreateFeedback;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import com.anthropic.claude.analytics.events.SettingsEvents$SettingsSupportLink;
import com.anthropic.claude.api.referral.ReferralEligibility;
import com.anthropic.claude.settings.internal.growthbook.GateKind;
import com.anthropic.claude.tool.model.EventCreateV0Input;
import com.anthropic.claude.ui.demo.app.UiDemoAppDestination;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import kotlinx.serialization.json.JsonElement;
import org.json.JSONException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w95 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ w95(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.zy7
    public final Object a() throws FileNotFoundException {
        List listW;
        String terms_url;
        int i = this.E;
        boolean zEquals = false;
        int iEnd = 0;
        int i2 = 3;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        iei ieiVar = iei.a;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                return CredentialProviderCreatePasswordController.handleResponse$lambda$2((CredentialProviderCreatePasswordController) obj2, (l65) obj);
            case 1:
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0((CredentialProviderCreatePasswordController) obj2, (CreateCredentialException) obj);
            case 2:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$5((CredentialProviderCreatePublicKeyCredentialController) obj2, (JSONException) obj);
            case 3:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$6((CredentialProviderCreatePublicKeyCredentialController) obj2, (Throwable) obj);
            case 4:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$4((CredentialProviderCreatePublicKeyCredentialController) obj2, (l65) obj);
            case 5:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$2((CredentialProviderGetSignInIntentController) obj2, (u38) obj);
            case 6:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$3((CredentialProviderGetSignInIntentController) obj2, (dae) obj);
            case 7:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$5((CredentialProviderGetSignInIntentController) obj2, (GetCredentialUnknownException) obj);
            case 8:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$0((CredentialProviderGetSignInIntentController) obj2, (GetCredentialUnsupportedException) obj);
            case 9:
                return new y69(yfd.a0(((beh) obj2).j((cu9) ((zy7) obj).a())));
            case 10:
                ((heh) obj2).d.invoke((meh) obj);
                return ieiVar;
            case 11:
                zy7 zy7Var = (zy7) obj;
                if (!((by5) obj2).D()) {
                    zy7Var.a();
                }
                return ieiVar;
            case 12:
                ((nwb) obj).setValue(Boolean.FALSE);
                ((s56) obj2).c.a();
                return ieiVar;
            case 13:
                ((bz7) obj2).invoke((jgb) obj);
                return ieiVar;
            case 14:
                ((eli) obj2).a("https://claude.ai/upgrade");
                ((zy7) obj).a();
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((nwb) obj).setValue((m0c) obj2);
                return ieiVar;
            case 16:
                ((bz7) obj2).invoke((EventCreateV0Input) obj);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                String str2 = (String) obj2;
                nwb nwbVar = (nwb) obj;
                String str3 = ((rb7) nwbVar.getValue()).a;
                if (str2.equals("PrimaryNotEditable") || str2.equals("PrimaryEditable")) {
                    zEquals = true;
                } else if (str2.equals("SecondaryEditable")) {
                    zEquals = str3.equals("SecondaryEditable");
                }
                if (zEquals) {
                    nwbVar.setValue(new rb7(str2));
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                wg7 wg7Var = (wg7) obj2;
                zy7 zy7Var2 = (zy7) obj;
                zy7Var2.getClass();
                lsc lscVar = wg7Var.i;
                if (!((Boolean) lscVar.getValue()).booleanValue()) {
                    lscVar.setValue(Boolean.TRUE);
                    wg7Var.j.setValue(Boolean.FALSE);
                    wg7Var.b.e(new MobileAppFeedbackEvents$CreateFeedback((MobileAppFeedbackEvents$FeedbackType) wg7Var.g.getValue(), ((cjh) wg7Var.h.getValue()).a.F), MobileAppFeedbackEvents$CreateFeedback.Companion.serializer());
                    gb9.D(wg7Var.a, null, null, new ix5(wg7Var, zy7Var2, objArr == true ? 1 : 0, 6), 3);
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                gb9.D((l45) obj2, null, null, new ac8((j9f) obj, objArr2 == true ? 1 : 0, zEquals ? 1 : 0), 3);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                qc8 qc8Var = (qc8) obj2;
                String str4 = (String) obj;
                str4.getClass();
                Object objO = qc8Var.O();
                Throwable thA = jre.a(objO);
                if (thA == null) {
                    qc8Var.c.h(qc8Var.b, (JsonElement) objO);
                    qc8Var.e.setValue(Boolean.TRUE);
                } else {
                    String message = thA.getMessage();
                    str = message == null ? str4 : message;
                }
                qc8Var.h.setValue(str);
                return ieiVar;
            case 21:
                ((nwb) obj).setValue((GateKind) obj2);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                id8 id8Var = (id8) obj;
                CharSequence charSequence = ((yih) obj2).d().G;
                ide ideVar = pd8.a;
                ideVar.getClass();
                charSequence.getClass();
                bsg.V0(0);
                Matcher matcher = ideVar.E.matcher(charSequence);
                if (matcher.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    do {
                        arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
                    listW = arrayList;
                } else {
                    listW = x44.W(charSequence.toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listW) {
                    if (((CharSequence) obj3).length() > 0) {
                        arrayList2.add(obj3);
                    }
                }
                zcg zcgVar = id8Var.i.H;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = zcgVar.iterator();
                while (((hmg) it).hasNext()) {
                    Object next = ((hmg) it).next();
                    n18 n18Var = (n18) next;
                    if (!arrayList2.isEmpty() && !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!bsg.u0(n18Var.a, (String) it2.next(), true)) {
                            }
                            break;
                        }
                    }
                    arrayList3.add(next);
                }
                List listI1 = w44.i1(arrayList3, new g67(3));
                d8a d8aVarE = x44.E();
                List list = listI1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    if (((n18) obj4).c) {
                        arrayList4.add(obj4);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    d8aVarE.add(new cpc("Overridden", arrayList4));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Set setKeySet = linkedHashMap.keySet();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : setKeySet) {
                            if (!x44.r((String) obj5, "Other")) {
                                arrayList5.add(obj5);
                            }
                        }
                        for (String str5 : w44.h1(arrayList5)) {
                            d8aVarE.add(new cpc(str5, sta.f0(str5, linkedHashMap)));
                        }
                        List list2 = (List) linkedHashMap.get("Other");
                        if (list2 != null) {
                            d8aVarE.add(new cpc("Other", list2));
                        }
                        return x44.v(d8aVarE);
                    }
                    Object next2 = it3.next();
                    String str6 = ((n18) next2).e;
                    String str7 = str6 != null ? str6 : "Other";
                    Object arrayList6 = linkedHashMap.get(str7);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(str7, arrayList6);
                    }
                    ((List) arrayList6).add(next2);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ReferralEligibility referralEligibility = (ReferralEligibility) obj2;
                eli eliVar = (eli) obj;
                if (referralEligibility != null && (terms_url = referralEligibility.getTerms_url()) != null) {
                    eliVar.a(terms_url);
                }
                return ieiVar;
            case 24:
                ((rwe) obj2).E.m(new jx2(11, (UiDemoAppDestination) obj), new ae5(i2));
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                gb9.D((l45) obj2, null, null, new al8(obj, (tp4) (objArr3 == true ? 1 : 0), 2), 3);
                return ieiVar;
            case 26:
                gkj gkjVar = (gkj) w44.O0(((isc) ((koc) obj).d.G).h(), (List) obj2);
                return Boolean.valueOf(gkjVar == null || gkjVar.c() <= 1.01f);
            case 27:
                ((eli) obj2).a("https://support.anthropic.com/");
                ((qi3) obj).e(new SettingsEvents$SettingsSupportLink(), SettingsEvents$SettingsSupportLink.Companion.serializer());
                return ieiVar;
            case 28:
                fn1 fn1Var = (fn1) obj2;
                um1 um1Var = (um1) obj;
                if (fn1Var != null) {
                    ((tn1) fn1Var).g();
                }
                um1Var.e(true);
                return ieiVar;
            default:
                InputStream inputStreamOpenInputStream = ((ContentResolver) obj2).openInputStream((Uri) obj);
                if (inputStreamOpenInputStream != null) {
                    return inputStreamOpenInputStream;
                }
                sz6.j("ContentResolver.openInputStream returned null");
                return null;
        }
    }
}
