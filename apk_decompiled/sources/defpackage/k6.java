package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewResult;
import com.anthropic.claude.analytics.events.ChatEvents$RecentPhotosStripOverflowTapped;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseConversion;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.sessions.types.AskUserQuestionQuestion;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k6 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ k6(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.time.LocalDate] */
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
    public final Object a() {
        aba abaVar;
        tp0 tp0VarO;
        ArtifactMetadata artifactMetadata;
        int i = 0;
        switch (this.E) {
            case 0:
                cba cbaVar = (cba) this.F;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.G;
                cbaVar.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(cbaVar);
                bba bbaVar = cbaVar.H;
                if (bbaVar != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(bbaVar);
                }
                if (Build.VERSION.SDK_INT >= 33 && (abaVar = cbaVar.I) != null) {
                    d6.g(accessibilityManager, se0.g(abaVar));
                }
                return iei.a;
            case 1:
                f03 f03Var = (f03) this.F;
                q2d q2dVar = (q2d) this.G;
                f03Var.c.e(new ChatEvents$RecentPhotosStripOverflowTapped(0), ChatEvents$RecentPhotosStripOverflowTapped.Companion.serializer());
                q2dVar.a();
                return iei.a;
            case 2:
                ggc ggcVar = (ggc) this.F;
                nwb nwbVar = (nwb) this.G;
                tec tecVar = ggcVar.a;
                hi hiVar = (hi) nwbVar.getValue();
                fi fiVar = hiVar instanceof fi ? (fi) hiVar : null;
                tecVar.t.setValue(fiVar != null ? fiVar.b : 0);
                ggcVar.b.a();
                return iei.a;
            case 3:
                sl slVar = (sl) this.F;
                nwb nwbVar2 = (nwb) this.G;
                ((vm) slVar).t.f();
                nwbVar2.setValue(Boolean.FALSE);
                return iei.a;
            case 4:
                x0a x0aVar = (x0a) this.F;
                an anVar = (an) this.G;
                p0a p0aVarH = x0aVar.h();
                q0a q0aVar = (q0a) w44.V0(p0aVarH.k);
                return Boolean.valueOf((q0aVar != null ? q0aVar.a : 0) + 1 > p0aVarH.n + (-5) && ((Boolean) ((vm) anVar.b).x.getValue()).booleanValue());
            case 5:
                String str = (String) this.F;
                an anVar2 = (an) this.G;
                if (str != null) {
                    vm vmVar = (vm) anVar2.b;
                    vmVar.getClass();
                    dpf dpfVar = vmVar.v;
                    dpfVar.getClass();
                    gb9.D((mp4) dpfVar.F, null, null, new m0(dpfVar, str, obj, 7), 3);
                }
                return iei.a;
            case 6:
                x0a x0aVar2 = (x0a) this.F;
                List list = (List) this.G;
                Integer numValueOf = Integer.valueOf(x0aVar2.h().n);
                yk ykVar = (yk) w44.V0(list);
                return new cpc(numValueOf, ykVar != null ? ykVar.a : null);
            case 7:
                ((bz7) this.F).invoke((x76) this.G);
                return iei.a;
            case 8:
                ((bz7) this.F).invoke(((ol) this.G).a);
                return iei.a;
            case 9:
                ts tsVar = (ts) this.F;
                lvh lvhVar = (lvh) this.G;
                ie5 ie5Var = tsVar.f;
                String str2 = tsVar.g;
                gh2 gh2Var = lvhVar.b;
                ie5Var.getClass();
                str2.getClass();
                ie5Var.b.e(new MobileAppUseEvents$MobileAppUseConversion(str2), MobileAppUseEvents$MobileAppUseConversion.Companion.serializer());
                Intent intent = new Intent("android.intent.action.SHOW_ALARMS");
                intent.setFlags(268435456);
                try {
                    ie5Var.a.startActivity(intent);
                    break;
                } catch (Exception e) {
                    SilentException.a(new SilentException("Failed to open alarms", e), null, false, 3);
                    if (gh2Var != null) {
                        gh2Var.r(new pt6(R.string.open_all_alarms_failure));
                    }
                }
                return iei.a;
            case 10:
                x0a x0aVar3 = (x0a) this.F;
                p03 p03Var = (p03) this.G;
                p0a p0aVarH2 = x0aVar3.h();
                int i2 = p0aVarH2.n;
                q0a q0aVar2 = (q0a) w44.V0(p0aVarH2.k);
                return Boolean.valueOf((q0aVar2 != null ? q0aVar2.a : 0) + 1 > i2 + (-5) && p03Var.a);
            case 11:
                rwe rweVar = (rwe) this.F;
                lu luVar = (lu) this.G;
                rweVar.E.m(new fv(0, new AllChatsListBottomSheetDestination[]{AllChatsListBottomSheetDestination.Closed.INSTANCE}), new a2g(8));
                luVar.o.setValue(Boolean.FALSE);
                luVar.p.setValue(um6.E);
                return iei.a;
            case 12:
                lu luVar2 = (lu) this.F;
                nwb nwbVar3 = (nwb) this.G;
                Boolean bool = Boolean.FALSE;
                nwbVar3.setValue(bool);
                luVar2.o.setValue(bool);
                luVar2.p.setValue(um6.E);
                return iei.a;
            case 13:
                ((dae) this.F).E = ((zy7) this.G).a();
                return iei.a;
            case 14:
                Activity activity = (Activity) this.F;
                xp0 xp0Var = (xp0) this.G;
                if (activity != null && (tp0VarO = xp0Var.O()) != null && (artifactMetadata = tp0VarO.b) != null) {
                    String strI = ij0.i("artifact_", artifactMetadata.getUuid().getValue());
                    j5g j5gVar = j5g.G;
                    String str3 = (String) xp0Var.l.getValue();
                    Icon iconCreateWithResource = Icon.createWithResource(activity, artifactMetadata.getIcon());
                    iconCreateWithResource.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("com.anthropic.claude.intent.extra.CHAT_ID", xp0Var.c);
                    bundle.putString("com.anthropic.claude.intent.extra.ARTIFACT_IDENTIFIER", artifactMetadata.m537getIdentifiereX_QYXY());
                    mwa.J(activity, strI, j5gVar, str3, iconCreateWithResource, bundle);
                }
                return iei.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                xp0 xp0Var2 = (xp0) this.F;
                zy7 zy7Var = (zy7) this.G;
                zt0 zt0Var = xp0Var2.h;
                zt0Var.getClass();
                zt0Var.a(ArtifactViewerEvents$ArtifactViewResult.ERROR);
                zy7Var.a();
                return iei.a;
            case 16:
                xq0 xq0Var = (xq0) this.F;
                String strM522getUuid2azyQ4 = ((ArtifactFullScreenParams.PublishedArtifactFullScreenParams) ((ArtifactFullScreenParams) this.G)).m522getUuid2azyQ4();
                strM522getUuid2azyQ4.getClass();
                gb9.D(xq0Var.a, null, null, new tm(xq0Var, strM522getUuid2azyQ4, null), 3);
                return iei.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                nwb nwbVar4 = (nwb) this.F;
                hsc hscVar = (hsc) this.G;
                nwbVar4.setValue(null);
                hscVar.i(MTTypesetterKt.kLineSkipLimitMultiplier);
                return iei.a;
            case g.AVG_FIELD_NUMBER /* 18 */:
                AskUserQuestionQuestion askUserQuestionQuestion = (AskUserQuestionQuestion) this.F;
                tw0 tw0Var = (tw0) this.G;
                if (askUserQuestionQuestion.getMultiSelect()) {
                    tw0Var.h("__OTHER__");
                } else {
                    tw0Var.g("__OTHER__");
                }
                return iei.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((bz7) this.F).invoke(((su0) this.G).a);
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((AudioManager) this.F).unregisterAudioPlaybackCallback((c41) this.G);
                return iei.a;
            case 21:
                ((Context) this.F).unregisterReceiver((xg0) this.G);
                return iei.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((AudioManager) this.F).removeOnCommunicationDeviceChangedListener((j41) this.G);
                return iei.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                p41 p41Var = (p41) this.F;
                k41 k41Var = (k41) this.G;
                AudioManager audioManager = p41Var.b;
                if (audioManager != null) {
                    audioManager.unregisterAudioDeviceCallback(k41Var);
                }
                return iei.a;
            case 24:
                p41 p41Var2 = (p41) this.F;
                k41 k41Var2 = (k41) this.G;
                AudioManager audioManager2 = p41Var2.b;
                if (audioManager2 != null) {
                    audioManager2.unregisterAudioDeviceCallback(k41Var2);
                }
                return iei.a;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((AudioManager) this.F).removeOnCommunicationDeviceChangedListener((j41) this.G);
                return iei.a;
            case 26:
                ((AudioManager) this.F).removeOnCommunicationDeviceChangedListener((m41) this.G);
                return iei.a;
            case 27:
                ((Context) this.F).getContentResolver().unregisterContentObserver((n41) this.G);
                return iei.a;
            case 28:
                ud1 ud1Var = (ud1) this.F;
                td1 td1Var = (td1) this.G;
                ml4 ml4Var = ud1Var.a;
                ml4Var.getClass();
                synchronized (ml4Var.c) {
                    if (ml4Var.d.remove(td1Var) && ml4Var.d.isEmpty()) {
                        ml4Var.d();
                    }
                    break;
                }
                return iei.a;
            default:
                gb9.D((l45) this.F, null, null, new qg1((l2i) this.G, obj, i), 3);
                return Boolean.TRUE;
        }
    }
}
