package defpackage;

import android.net.ConnectivityManager;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyDismissed;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute;
import com.anthropic.claude.settings.internal.growthbook.GateKind;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yg4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ yg4(e18 e18Var, ch2 ch2Var, rag ragVar, ksb ksbVar) {
        this.E = 19;
        this.G = e18Var;
        this.H = ch2Var;
        this.F = ragVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        l9e l9eVar;
        int i = this.E;
        int i2 = 1;
        int i3 = 0;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        Object obj = this.F;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                ((bz7) obj3).invoke((eyh) obj2);
                ((nwb) obj).setValue(Boolean.FALSE);
                return ieiVar;
            case 1:
                x0a x0aVar = (x0a) obj3;
                g56 g56Var = (g56) obj2;
                nwb nwbVar = (nwb) obj;
                g56 g56Var2 = (g56) nwbVar.getValue();
                if (g56Var2 != null && !g56Var2.equals(g56Var)) {
                    y5f y5fVar = x0a.y;
                    x0aVar.j(0, 0);
                }
                nwbVar.setValue(g56Var);
                return ieiVar;
            case 2:
                ((bz7) obj3).invoke((n56) obj2);
                ((nwb) obj).setValue(Boolean.FALSE);
                return ieiVar;
            case 3:
                wn4 wn4Var = (wn4) obj3;
                hhi hhiVar = (hhi) obj2;
                xx1 xx1Var = (xx1) obj;
                gmf gmfVar = wn4Var.X;
                while (true) {
                    wwb wwbVar = (wwb) gmfVar.F;
                    int i4 = wwbVar.G;
                    if (i4 != 0) {
                        if (i4 == 0) {
                            pmf.h("MutableVector is empty.");
                            return null;
                        }
                        l9e l9eVar2 = (l9e) ((tn4) wwbVar.E[i4 - 1]).a.a();
                        if (l9eVar2 == null ? true : wn4.r1(wn4Var, l9eVar2, 0L, 0L, 3)) {
                            wwb wwbVar2 = (wwb) gmfVar.F;
                            ((tn4) wwbVar2.m(wwbVar2.G - 1)).b.resumeWith(ieiVar);
                        }
                    }
                }
                if (wn4Var.Y && (l9eVar = (l9e) wn4Var.W.a()) != null && wn4.r1(wn4Var, l9eVar, 0L, 0L, 3)) {
                    wn4Var.Y = false;
                }
                hhiVar.e = wn4.p1(wn4Var, xx1Var, 0L);
                return ieiVar;
            case 4:
                ((pz7) obj2).invoke((String) obj, new zb2(5, (bz7) obj3));
                return ieiVar;
            case 5:
                p05 p05Var = (p05) obj3;
                String str = (String) obj2;
                nwb nwbVar2 = (nwb) obj;
                hsf hsfVarR = p05Var.R();
                tp4 tp4Var2 = null;
                if (hsfVarR == null) {
                    p05Var.U(p05Var.b.getString(R.string.conway_ext_error_no_session));
                } else {
                    gb9.D(p05Var.a, null, null, new l05(p05Var, hsfVarR, str, tp4Var2, 1), 3);
                }
                nwbVar2.setValue(null);
                return ieiVar;
            case 6:
                b0 b0Var = (b0) obj2;
                aid aidVar = (aid) obj;
                v82 v82Var = (v82) ((AtomicReference) obj3).getAndSet(null);
                if (v82Var != null) {
                    ((f4e) v82Var).cancel();
                }
                b0Var.i.set(null);
                amg amgVar = b0Var.j;
                Boolean bool = Boolean.FALSE;
                amgVar.getClass();
                amgVar.n(null, bool);
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(aidVar);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj4)).getClass();
                        arrayList.add(obj4);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, "Stream collector closed");
                        }
                    }
                }
                return ieiVar;
            case 7:
                ((nwb) obj).setValue((e25) obj3);
                ((nwb) obj2).setValue(null);
                return ieiVar;
            case 8:
                WebhookRecord webhookRecord = (WebhookRecord) obj3;
                ((nwb) obj).setValue(webhookRecord.getToken());
                ((nwb) obj2).setValue(webhookRecord.getLabel());
                return ieiVar;
            case 9:
                ((nwb) obj).setValue(Boolean.TRUE);
                ((bz7) obj3).invoke(Integer.valueOf(((rp6) obj2).Q().E));
                return ieiVar;
            case 10:
                ApiHelpline apiHelpline = (ApiHelpline) obj3;
                pz7 pz7Var = (pz7) obj2;
                String str2 = (String) obj;
                if (apiHelpline != null) {
                    pz7Var.invoke(str2, apiHelpline);
                }
                return ieiVar;
            case 11:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$2((Executor) obj3, (m95) obj2, (x75) obj);
            case 12:
                return CredentialProviderController.maybeReportErrorFromResultReceiver$lambda$0((Executor) obj3, (m95) obj2, obj);
            case 13:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$0((Executor) obj3, (m95) obj2, (l65) obj);
            case 14:
                ((rwe) obj3).E.m(new cv(24, new CustomInstructionsDialogRoute.EditCustomInstructions((String) obj2, (String) obj, null)), new ae5(i3));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return nyj.V((String) ((nyj) obj3).G, (String) obj2, obj);
            case 16:
                ((nwb) obj).setValue(Boolean.FALSE);
                ((bz7) obj3).invoke((pf6) obj2);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                beg begVar = (beg) obj;
                ((gt0) obj3).a();
                if (((String) obj2).equals("PrimaryEditable") && begVar != null) {
                    ((fx5) begVar).b();
                }
                return Boolean.TRUE;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((bz7) obj3).invoke((MobileAppFeedbackEvents$FeedbackType) obj2);
                ((nwb) obj).setValue(Boolean.FALSE);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                e18 e18Var = (e18) obj3;
                ch2 ch2Var = (ch2) obj2;
                rag ragVar = (rag) obj;
                md4 md4Var = e18Var.M;
                ch2 ch2Var2 = md4Var.b;
                try {
                    md4Var.b = ch2Var;
                    rag ragVar2 = e18Var.G;
                    int[] iArr = e18Var.o;
                    xub xubVar = e18Var.v;
                    e18Var.o = null;
                    e18Var.v = null;
                    try {
                        e18Var.G = ragVar;
                        boolean z = md4Var.e;
                        try {
                            md4Var.e = false;
                            throw null;
                        } catch (Throwable th) {
                            md4Var.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        e18Var.G = ragVar2;
                        e18Var.o = iArr;
                        e18Var.v = xubVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    md4Var.b = ch2Var2;
                    throw th3;
                }
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ub8 ub8Var = (ub8) obj3;
                zy7 zy7Var = (zy7) obj2;
                if (!((Boolean) ((nwb) obj).getValue()).booleanValue()) {
                    ub8Var.f.e(new GroveEvents$GrovePolicyDismissed(ub8Var.Q()), GroveEvents$GrovePolicyDismissed.Companion.serializer());
                }
                zy7Var.a();
                return ieiVar;
            case 21:
                pz7 pz7Var2 = (pz7) obj2;
                nwb nwbVar3 = (nwb) obj;
                String string = bsg.k1(((yih) obj3).d().G.toString()).toString();
                if (string.length() > 0) {
                    pz7Var2.invoke(string, (GateKind) nwbVar3.getValue());
                }
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((kl8) obj3).O((eyh) obj2);
                ((zy7) obj).a();
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((pz7) obj3).invoke((List) obj2, ImageGalleryItemId.m304boximpl(((ImageGalleryItem) obj).m303getIdivCCbqw()));
                return ieiVar;
            case 24:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                x19 x19Var = (x19) obj;
                if (((z9e) obj3).E) {
                    nga ngaVarC = nga.c();
                    int i5 = ofj.a;
                    ngaVarC.getClass();
                    connectivityManager.unregisterNetworkCallback(x19Var);
                }
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                gb9.D((l45) obj3, null, null, new no4((op3) obj2, (String) obj, tp4Var, i2), 3);
                return ieiVar;
            case 26:
                fn1 fn1Var = (fn1) obj3;
                nwb nwbVar4 = (nwb) obj;
                nwb nwbVar5 = (nwb) obj2;
                if (((fm1) nwbVar4.getValue()) == fm1.T) {
                    ((tn1) fn1Var).I();
                } else {
                    nwbVar5.setValue((fm1) nwbVar4.getValue());
                }
                return ieiVar;
            case 27:
                fk0 fk0Var = (fk0) obj3;
                String str3 = (String) obj2;
                fk0Var.D.setValue(str3);
                kgh.t(fk0Var.a, "debug_age_signals_override", str3);
                ((nwb) obj).setValue(Boolean.FALSE);
                return ieiVar;
            case 28:
                return new znc(((Number) ((zy7) obj2).a()).intValue(), (bz7) ((nwb) obj3).getValue(), (sz7) ((nwb) obj).getValue());
            default:
                return new oqa(((hqa) obj3).I, (pz7) obj2, obj);
        }
    }

    public /* synthetic */ yg4(pz7 pz7Var, String str, bz7 bz7Var) {
        this.E = 4;
        this.H = pz7Var;
        this.F = str;
        this.G = bz7Var;
    }

    public /* synthetic */ yg4(nwb nwbVar, nwb nwbVar2, zy7 zy7Var) {
        this.E = 28;
        this.F = nwbVar;
        this.G = nwbVar2;
        this.H = zy7Var;
    }

    public /* synthetic */ yg4(Object obj, nwb nwbVar, nwb nwbVar2, int i) {
        this.E = i;
        this.G = obj;
        this.F = nwbVar;
        this.H = nwbVar2;
    }

    public /* synthetic */ yg4(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.F = obj3;
    }
}
