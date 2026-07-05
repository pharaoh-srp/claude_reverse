package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import androidx.health.platform.client.proto.g;
import androidx.work.impl.WorkDatabase;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseConversion;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.models.organization.configtypes.CCRStarterTask;
import com.anthropic.claude.settings.SettingsAppScreen;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.anthropic.claude.types.strings.MessageId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ytf implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ytf(ovg ovgVar, bz7 bz7Var) {
        this.E = 25;
        this.G = ovgVar;
        this.F = bz7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        le4 le4Var;
        int i;
        long j;
        zjh zjhVarD;
        m2a m2aVar;
        zb0 zb0Var;
        int i2 = 8;
        boolean z = true;
        switch (this.E) {
            case 0:
                ((bz7) this.F).invoke((CCRStarterTask) this.G);
                return iei.a;
            case 1:
                zb0 zb0Var2 = (zb0) this.F;
                eli eliVar = (eli) this.G;
                o6a o6aVar = (o6a) ((yb0) w44.L0(zb0Var2.a(zb0Var2.F.length()))).a;
                if (o6aVar instanceof n6a) {
                    eliVar.a(((n6a) o6aVar).a);
                } else if (o6aVar instanceof m6a) {
                    v6a v6aVar = ((m6a) o6aVar).c;
                    if (v6aVar != null) {
                        v6aVar.a(o6aVar);
                    }
                } else {
                    sfa sfaVar = sfa.WARN;
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
                            String str = "Unsupported link annotation: " + ((Object) zb0Var2);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfaVar, "SettingToggleableRow", str);
                            }
                        }
                    }
                }
                return iei.a;
            case 2:
                rwe rweVar = (rwe) this.F;
                izf izfVar = (izf) this.G;
                rweVar.E.m(new u3a(17, new SettingsAppScreen.BillingScreen((pvg) izfVar.v.getValue(), (RavenType) izfVar.w.getValue())), new hyf(10));
                return iei.a;
            case 3:
                pz7 pz7Var = (pz7) this.F;
                KnowledgeSource knowledgeSource = (KnowledgeSource) this.G;
                pz7Var.invoke(knowledgeSource.getUrl(), Boolean.valueOf(knowledgeSource.isTrusted()));
                return iei.a;
            case 4:
                ((bz7) this.F).invoke(ChatSnapshotId.m985boximpl(((ChatSnapshotSummaryWithChatId) this.G).m434getUuidN1vkeFQ()));
                return iei.a;
            case 5:
                b4b b4bVar = (b4b) this.F;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.G;
                synchronized (v2g.b) {
                    LinkedHashMap linkedHashMap = v2g.c;
                    linkedHashMap.remove(b4bVar);
                    if (linkedHashMap.isEmpty()) {
                        nga ngaVarC = nga.c();
                        int i3 = ofj.a;
                        ngaVarC.getClass();
                        connectivityManager.unregisterNetworkCallback(v2g.a);
                        v2g.f = null;
                        v2g.d = null;
                        v2g.e = false;
                    }
                    break;
                }
                return iei.a;
            case 6:
                return (Integer) ((g93) this.F).C.get(MessageId.m1051boximpl((String) this.G));
            case 7:
                sbg sbgVar = (sbg) this.F;
                je7 je7Var = (je7) this.G;
                if (!x44.r(sbgVar, je7Var.a)) {
                    b54.w0(new d6d(21, sbgVar), je7Var.b);
                    r7e r7eVar = je7Var.c;
                    if (r7eVar != null && (le4Var = r7eVar.a) != null) {
                        le4Var.s(r7eVar, null);
                    }
                }
                return iei.a;
            case 8:
                phg phgVar = (phg) this.F;
                ohg ohgVar = (ohg) this.G;
                String strC = ((whg) phgVar.c).c();
                zy1 zy1Var = phgVar.g;
                switch (ohgVar.ordinal()) {
                    case 0:
                        i = R.string.stt_error_microphone;
                        break;
                    case 1:
                        i = R.string.stt_error_language_not_found;
                        break;
                    case 2:
                        i = R.string.stt_error_recording_time_limit;
                        break;
                    case 3:
                    case 4:
                    case 7:
                    case 9:
                        i = R.string.stt_error_server;
                        break;
                    case 5:
                    case 8:
                        i = R.string.stt_error_transcription_empty;
                        break;
                    case 6:
                        i = R.string.stt_error_network;
                        break;
                    default:
                        wg6.i();
                        return null;
                }
                zy1Var.r(new fhg(new pt6(i), strC));
                phgVar.b.a(ohgVar.toString(), "stream", (int) phgVar.P(), strC.length(), phgVar.p);
                phgVar.R(ohgVar.a());
                return iei.a;
            case 9:
                ((nwb) this.G).setValue(((mlg) this.F).a);
                return iei.a;
            case 10:
                return ((cm5) this.F).invoke((WorkDatabase) this.G);
            case 11:
                ((bz7) this.F).invoke((i4d) this.G);
                return iei.a;
            case 12:
                ((nz) ((pp3) this.F)).a().setPrimaryClip(ClipData.newPlainText("plain text", spk.c(new zb0(w44.S0(((e8h) this.G).c, "\n\n", null, null, new x2h(i2), 30)))));
                return iei.a;
            case 13:
                bz7 bz7Var = (bz7) this.F;
                List list = (List) this.G;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add((String) ((r7i) it2.next()).E);
                }
                bz7Var.invoke(linkedHashSet);
                return iei.a;
            case 14:
                ((bz7) this.F).invoke((TaskStepResponse) this.G);
                return iei.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                t4g t4gVar = (t4g) this.F;
                ((nwb) this.G).setValue(Boolean.FALSE);
                t4gVar.a();
                return iei.a;
            case 16:
                Context context = (Context) this.F;
                TextClassification textClassification = (TextClassification) this.G;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                    break;
                } else {
                    activity.send();
                }
                return iei.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                sih sihVar = (sih) this.F;
                vfh vfhVar = (vfh) this.G;
                if (!sihVar.d) {
                    pt7 pt7Var = vfhVar.c0;
                    if (pt7Var.R) {
                        pt7Var.Z.w1(7);
                    }
                }
                return iei.a;
            case g.AVG_FIELD_NUMBER /* 18 */:
                zhh zhhVar = (zhh) this.F;
                long j2 = ((g79) ((nwb) this.G).getValue()).a;
                fcc fccVarO = zhhVar.o();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (fccVarO != null) {
                    long j3 = fccVarO.a;
                    zb0 zb0VarS = zhhVar.s();
                    if (zb0VarS != null && zb0VarS.F.length() != 0) {
                        te8 te8Var = (te8) zhhVar.s.getValue();
                        int i4 = te8Var == null ? -1 : bih.a[te8Var.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1 || i4 == 2) {
                                long j4 = zhhVar.t().b;
                                int i5 = kkh.c;
                                j = j4 >> 32;
                            } else {
                                if (i4 != 3) {
                                    wg6.i();
                                    return null;
                                }
                                long j5 = zhhVar.t().b;
                                int i6 = kkh.c;
                                j = j5 & 4294967295L;
                            }
                            int i7 = (int) j;
                            m2a m2aVar2 = zhhVar.d;
                            if (m2aVar2 != null && (zjhVarD = m2aVar2.d()) != null && (m2aVar = zhhVar.d) != null && (zb0Var = m2aVar.a.a) != null) {
                                int iE0 = wd6.e0(zhhVar.b.D(i7), 0, zb0Var.F.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (zjhVarD.d(j3) >> 32));
                                yjh yjhVar = zjhVarD.a;
                                qtb qtbVar = yjhVar.b;
                                int iD = qtbVar.d(iE0);
                                float f = yjhVar.f(iD);
                                float fG = yjhVar.g(iD);
                                float fD0 = wd6.d0(fIntBitsToFloat, Math.min(f, fG), Math.max(f, fG));
                                if (g79.b(j2, 0L) || Math.abs(fIntBitsToFloat - fD0) <= ((int) (j2 >> 32)) / 2) {
                                    float f2 = qtbVar.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD0)) << 32) | (((long) Float.floatToRawIntBits(((qtbVar.b(iD) - f2) / 2.0f) + f2)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new fcc(jFloatToRawIntBits);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                crh crhVar = (crh) this.F;
                lvh lvhVar = (lvh) this.G;
                ie5 ie5Var = crhVar.f;
                String str2 = crhVar.g;
                gh2 gh2Var = lvhVar.b;
                ie5Var.getClass();
                str2.getClass();
                ie5Var.b.e(new MobileAppUseEvents$MobileAppUseConversion(str2), MobileAppUseEvents$MobileAppUseConversion.Companion.serializer());
                Intent intent = new Intent("android.intent.action.SHOW_TIMERS");
                intent.setFlags(268435456);
                try {
                    ie5Var.a.startActivity(intent);
                    break;
                } catch (Exception e2) {
                    SilentException.a(new SilentException("Failed to open timers", e2), null, false, 3);
                    if (gh2Var != null) {
                        gh2Var.r(new pt6(R.string.open_all_timers_failure));
                    }
                }
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                rz7 rz7Var = (rz7) this.F;
                rwh rwhVar = (rwh) this.G;
                String str3 = rwhVar.b;
                String str4 = rwhVar.f;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = rwhVar.g;
                rz7Var.invoke(str3, str4, str5 != null ? str5 : "");
                return iei.a;
            case 21:
                ((bz7) this.F).invoke((rvh) this.G);
                return iei.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                bz7 bz7Var2 = (bz7) this.F;
                dc1 dc1Var = (dc1) this.G;
                if (bz7Var2 != null) {
                    bz7Var2.invoke(dc1Var.a);
                }
                return iei.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                Context context2 = (Context) this.F;
                String str6 = ((mr0) this.G).b;
                context2.getClass();
                try {
                    String strD = lvk.d(context2);
                    if (strD != null) {
                        n11 n11Var = new n11();
                        n11Var.D();
                        int color = context2.getColor(R.color.bg100) | (-16777216);
                        Bundle bundle = new Bundle();
                        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color);
                        n11Var.J = bundle;
                        n11Var.C(2);
                        n11Var.F = false;
                        epk epkVarK = n11Var.k();
                        ((Intent) epkVarK.E).setPackage(strD);
                        epkVarK.u(context2, Uri.parse(str6));
                    } else {
                        context2.startActivity(Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER").setData(Uri.parse(str6)).addFlags(268435456));
                    }
                    break;
                } catch (Exception e3) {
                    SilentException.a(new SilentException("ArtifactBrowserLauncher: failed to open browser", e3), ozf.F, false, 2);
                }
                return iei.a;
            case 24:
                ((nwb) this.G).setValue((iyh) this.F);
                return iei.a;
            case BuildConfig.VERSION_CODE /* 25 */:
                ovg ovgVar = (ovg) this.G;
                bz7 bz7Var3 = (bz7) this.F;
                int iOrdinal = ovgVar.ordinal();
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    z = false;
                }
                bz7Var3.invoke(Boolean.valueOf(z));
                return iei.a;
            default:
                return Boolean.valueOf(!((saj) this.F).f.contains((WiggleArtifactIdentifier) this.G));
        }
    }

    public /* synthetic */ ytf(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
