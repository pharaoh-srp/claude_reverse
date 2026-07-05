package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewResult;
import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroViewed;
import com.anthropic.claude.analytics.events.McpEvents$McpServersListed;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.BellApiClientMessage;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.chat.dialogs.d;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.protocol.ConwayExtensionMeta;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchError;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchErrorErrorType;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class kk0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk0(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                return new kk0((ok0) obj2, tp4Var, 0);
            case 1:
                return new kk0((xp0) obj2, tp4Var, 1);
            case 2:
                return new kk0((tp0) obj2, tp4Var, 2);
            case 3:
                return new kk0((l2i) obj2, tp4Var, 3);
            case 4:
                return new kk0((mj1) obj2, tp4Var, 4);
            case 5:
                return new kk0((wxc) obj2, tp4Var, 5);
            case 6:
                return new kk0((ps7) obj2, tp4Var, 6);
            case 7:
                return new kk0((v72) obj2, tp4Var, 7);
            case 8:
                return new kk0((qb2) obj2, tp4Var, 8);
            case 9:
                return new kk0((pqe) obj2, tp4Var, 9);
            case 10:
                return new kk0((pt2) obj2, tp4Var, 10);
            case 11:
                return new kk0((rwe) obj2, tp4Var, 11);
            case 12:
                return new kk0((whd) obj2, tp4Var, 12);
            case 13:
                return new kk0((kf6) obj2, tp4Var, 13);
            case 14:
                return new kk0((c) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new kk0((el3) obj2, tp4Var, 15);
            case 16:
                return new kk0((b55) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new kk0((i) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new kk0((ubg) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new kk0((kk4) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new kk0((c61) obj2, tp4Var, 20);
            case 21:
                return new kk0((p05) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new kk0((qi3) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new kk0((jx5) obj2, tp4Var, 23);
            case 24:
                return new kk0((u66) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new kk0((v66) obj2, tp4Var, 25);
            case 26:
                return new kk0((rp6) obj2, tp4Var, 26);
            case 27:
                return new kk0((jz6) obj2, tp4Var, 27);
            case 28:
                return new kk0((bz7) obj2, tp4Var, 28);
            default:
                return new kk0((zv5) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                return ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 4:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 5:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 6:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 7:
                return ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 9:
                return ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 10:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 11:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 12:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 13:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 14:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 16:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 24:
                return ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 26:
                ((kk0) create(Integer.valueOf(((Number) obj).intValue()), (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 27:
                return ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 28:
                ((kk0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                ((kk0) create((iei) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = 6;
        tp4 tp4Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.E) {
            case 0:
                sf5.h0(obj);
                try {
                    ok0 ok0Var = (ok0) this.F;
                    FileSystem fileSystem = ok0Var.c;
                    zmf zmfVarV = yb5.v(new f(fileSystem, ok0Var.b.b().e("app_start"), objArr == true ? 1 : 0, i));
                    while (zmfVarV.hasNext()) {
                        fileSystem.j((Path) zmfVarV.next(), false);
                        break;
                    }
                } catch (Exception e) {
                    SilentException.a(new SilentException("Failed to clear app-start caches", e), null, false, 3);
                }
                return iei.a;
            case 1:
                sf5.h0(obj);
                xp0 xp0Var = (xp0) this.F;
                if (xp0Var.R()) {
                    zt0 zt0Var = xp0Var.h;
                    if (((Long) zt0Var.g) == null) {
                        zt0Var.g = Long.valueOf(((mn5) zt0Var.d).a() - zt0Var.a);
                        ArtifactType artifactType = (ArtifactType) ((up0) zt0Var.f).a();
                        if (artifactType == null) {
                            zt0Var.a(ArtifactViewerEvents$ArtifactViewResult.LOADED);
                        } else if (!artifactType.equals(ArtifactType.Mermaid.INSTANCE) && !artifactType.equals(ArtifactType.React.INSTANCE) && !artifactType.equals(ArtifactType.Html.INSTANCE) && !(artifactType instanceof ArtifactType.BinaryDocument)) {
                            if (!artifactType.equals(ArtifactType.Text.INSTANCE) && !artifactType.equals(ArtifactType.Markdown.INSTANCE) && !artifactType.equals(ArtifactType.Svg.INSTANCE) && !artifactType.equals(ArtifactType.Code.INSTANCE) && !artifactType.equals(ArtifactType.Repl.INSTANCE)) {
                                wg6.i();
                                return null;
                            }
                            zt0Var.a(ArtifactViewerEvents$ArtifactViewResult.LOADED);
                        }
                    }
                }
                return iei.a;
            case 2:
                sf5.h0(obj);
                qtc qtcVar = as0.a;
                return as0.a((tp0) this.F);
            case 3:
                sf5.h0(obj);
                ((l2i) this.F).a();
                return iei.a;
            case 4:
                sf5.h0(obj);
                fn1 fn1Var = (fn1) ((mj1) this.F).K.getValue();
                if (fn1Var != null) {
                    xn1 xn1Var = ((tn1) fn1Var).p;
                    zy1 zy1Var = xn1Var.h;
                    z4j z4jVar = VoiceSelection.Companion;
                    um1 um1Var = xn1Var.a;
                    String strB = um1Var.b();
                    z4jVar.getClass();
                    String strA = z4j.a(strB);
                    k6d k6dVar = PlaybackPace.Companion;
                    String strA2 = um1Var.a();
                    k6dVar.getClass();
                    float speedFactor = k6d.a(strA2).getSpeedFactor();
                    String strF = xn1Var.b.f();
                    xn1Var.c.b(new BellApiClientMessage.VoiceSelect(new BellApiClientMessage.VoiceSelect.Data(strA, Float.valueOf(speedFactor), strF, objArr2 == true ? 1 : 0)));
                    if (!VoiceSelection.m576equalsimpl0(strA, xn1Var.d)) {
                        zy1Var.r(new wn1(VoiceEvents$VoiceSettingKind.VOICE, xn1Var.d, strA));
                        xn1Var.d = strA;
                    }
                    if (!x44.r(strF, xn1Var.f)) {
                        VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind = VoiceEvents$VoiceSettingKind.LANGUAGE;
                        String str = xn1Var.f;
                        if (str == null) {
                            str = "";
                        }
                        zy1Var.r(new wn1(voiceEvents$VoiceSettingKind, str, strF != null ? strF : ""));
                        xn1Var.f = strF;
                    }
                }
                return iei.a;
            case 5:
                sf5.h0(obj);
                ((wxc) this.F).f();
                return iei.a;
            case 6:
                sf5.h0(obj);
                ((ps7) this.F).b(false);
                return iei.a;
            case 7:
                sf5.h0(obj);
                CalendarSearchV0OutputCalendarSearchResult calendarSearchV0OutputCalendarSearchResultE = ((v72) this.F).c.e(true);
                return calendarSearchV0OutputCalendarSearchResultE != null ? calendarSearchV0OutputCalendarSearchResultE : new CalendarSearchV0OutputCalendarSearchError(CalendarSearchV0OutputCalendarSearchErrorErrorType.UNKNOWN, "Failed to parse calendar data");
            case 8:
                sf5.h0(obj);
                qb2.O((qb2) this.F);
                return iei.a;
            case 9:
                sf5.h0(obj);
                return ((pqe) this.F).K.f();
            case 10:
                sf5.h0(obj);
                pt2 pt2Var = (pt2) this.F;
                Context context = pt2Var.e;
                Toast.makeText(context, context.getString(R.string.chat_input_attachment_limit_reached_toast, new Integer(amk.c(pt2Var.g).getMax_per_message_upload_count())), 1).show();
                return iei.a;
            case 11:
                sf5.h0(obj);
                List list = xah.a;
                xah.e(6, "ShareArtifact dialog cache miss", null, null);
                d.b((rwe) this.F);
                return iei.a;
            case 12:
                sf5.h0(obj);
                whd whdVar = (whd) this.F;
                if (whdVar != null && whdVar.b()) {
                    ebh.A("Message has unexpected temporary id while giving feedback", null, false, 3);
                }
                return iei.a;
            case 13:
                sf5.h0(obj);
                kf6 kf6Var = (kf6) this.F;
                re6 re6Var = re6.E;
                kf6Var.getClass();
                mdg mdgVar = kf6Var.c;
                if (!((Boolean) sta.f0(re6Var, mdgVar)).booleanValue()) {
                    kf6Var.b.edit().putBoolean("has_seen_cowork_remote_tab", true).apply();
                    mdgVar.put(re6Var, Boolean.TRUE);
                }
                return iei.a;
            case 14:
                sf5.h0(obj);
                c cVar = (c) this.F;
                fkg fkgVar = cVar.W;
                if (fkgVar == null || !fkgVar.c()) {
                    cVar.W = gb9.D(cVar.a, null, null, new xz3(cVar, objArr3 == true ? 1 : 0, i), 3);
                }
                return iei.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                sf5.h0(obj);
                Resources resources = ((el3) this.F).a.getResources();
                resources.getClass();
                int[] iArr = {16, 20, 24};
                while (i < 3) {
                    ae0.a(resources, iArr[i]);
                    i++;
                }
                return iei.a;
            case 16:
                sf5.h0(obj);
                b55 b55Var = (b55) this.F;
                b55Var.h = true;
                koi koiVar = b55Var.b;
                if (koiVar.f().isEmpty() && !koiVar.j()) {
                    gb9.D(b55Var.a, null, null, new cj(b55Var, objArr4 == true ? 1 : 0, 19), 3);
                }
                return iei.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                sf5.h0(obj);
                i iVar = (i) this.F;
                if (((x36) iVar.r1.getValue()) instanceof u36) {
                    iVar.h0();
                }
                return iei.a;
            case g.AVG_FIELD_NUMBER /* 18 */:
                sf5.h0(obj);
                List list2 = xah.a;
                String strF2 = jce.a.b(((ubg) this.F).a.getClass()).f();
                if (strF2 == null) {
                    strF2 = "unknown";
                }
                Map mapSingletonMap = Collections.singletonMap("error_message_type", strF2);
                mapSingletonMap.getClass();
                xah.d("error_snackbar_shown", "error_snackbar", mapSingletonMap);
                return iei.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                sf5.h0(obj);
                kk4 kk4Var = (kk4) this.F;
                koi koiVar2 = kk4Var.c;
                if (!koiVar2.f().isEmpty() && !kk4Var.i) {
                    kk4Var.i = true;
                    kk4Var.e.e(new McpEvents$McpServersListed(koiVar2.e, koiVar2.f().size()), McpEvents$McpServersListed.Companion.serializer());
                }
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                sf5.h0(obj);
                c61 c61Var = (c61) this.F;
                jie jieVarC = c61.c(c61Var, c61.d(c61Var, "sandbox", "plugins", "metadata"));
                jieVarC.c();
                pqe pqeVarF = new f4e((hdc) c61Var.H, new kie(jieVarC), false).f();
                try {
                    if (pqeVarF.U) {
                        List listI1 = w44.i1(((Map) ex4.a.b(pqeVarF.K.f(), d4c.u(srg.a, ConwayExtensionMeta.Companion.serializer()))).values(), new mt7(23));
                        pqeVarF.close();
                        return listI1;
                    }
                    throw new IOException("list plugins: HTTP " + pqeVarF.H);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        wd6.Z(pqeVarF, th);
                        throw th2;
                    }
                }
            case 21:
                sf5.h0(obj);
                p05 p05Var = (p05) this.F;
                p05Var.T();
                gb9.D(p05Var.a, null, null, new m05(p05Var, objArr5 == true ? 1 : 0, i), 3);
                return iei.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                sf5.h0(obj);
                if (!nuk.e) {
                    nuk.e = true;
                    ((qi3) this.F).e(new DispatchEvents$StarterIntroViewed(), DispatchEvents$StarterIntroViewed.Companion.serializer());
                }
                return iei.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                sf5.h0(obj);
                jx5 jx5Var = (jx5) this.F;
                gb9.D(jx5Var.a, null, null, new cj(jx5Var, tp4Var, 21), 3);
                return iei.a;
            case 24:
                sf5.h0(obj);
                u66 u66Var = (u66) this.F;
                synchronized (u66Var.L) {
                    if (!u66Var.Q || u66Var.R) {
                        return iei.a;
                    }
                    try {
                        u66Var.K();
                        break;
                    } catch (IOException unused) {
                        u66Var.S = true;
                    }
                    try {
                        if ((u66Var.N >= 2000 ? 1 : 0) != 0) {
                            u66Var.R();
                        }
                        break;
                    } catch (IOException unused2) {
                        u66Var.T = true;
                        u66Var.O = new RealBufferedSink(Okio.a());
                    }
                    return iei.a;
                }
            case BuildConfig.VERSION_CODE /* 25 */:
                sf5.h0(obj);
                v66 v66Var = (v66) this.F;
                synchronized (v66Var) {
                    if (!v66Var.P || v66Var.Q) {
                        return iei.a;
                    }
                    try {
                        v66Var.K();
                        break;
                    } catch (IOException unused3) {
                        v66Var.R = true;
                    }
                    try {
                        if ((v66Var.M >= 2000 ? 1 : 0) != 0) {
                            v66Var.R();
                        }
                        break;
                    } catch (IOException unused4) {
                        v66Var.S = true;
                        v66Var.N = new RealBufferedSink(Okio.a());
                    }
                    return iei.a;
                }
            case 26:
                sf5.h0(obj);
                ((rp6) this.F).p.setValue(new cjh((String) null, 0L, 7));
                return iei.a;
            case 27:
                sf5.h0(obj);
                final jz6 jz6Var = (jz6) this.F;
                File file = jz6Var.E;
                if (jz6Var.O > 0 || (jz6Var.e().exists() && jz6Var.e().length() > 0)) {
                    jz6Var.d();
                    long jB = jz6Var.I.c().b();
                    jz6Var.e().renameTo(new File(file, jz6Var.L + jB + ".jsonl"));
                }
                File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: iz6
                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        String name = file2.getName();
                        name.getClass();
                        if (isg.q0(name, jz6Var.L, false)) {
                            String name2 = file2.getName();
                            name2.getClass();
                            if (isg.h0(name2, ".jsonl", false)) {
                                return true;
                            }
                        }
                        return false;
                    }
                });
                return fileArrListFiles != null ? mp0.U0(fileArrListFiles, new mt7(29)) : lm6.E;
            case 28:
                sf5.h0(obj);
                ((bz7) this.F).invoke(la7.a);
                return iei.a;
            default:
                sf5.h0(obj);
                ((zv5) this.F).d(null);
                return null;
        }
    }
}
