package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatEvents$GhostModeToggle;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectChatStarterClicked;
import com.anthropic.claude.api.artifacts.UserArtifact;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.notification.TrackPushOpenRequest;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.project.create.ProjectTemplateId;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.SessionId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ o5(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [mq5, tp4] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        String lowerCase;
        ProjectTemplateId projectTemplateId;
        ProjectSubtype subtype;
        String strName;
        ProjectTemplateId projectTemplateId2;
        ProjectType type;
        String strName2;
        CodeRemoteSessionScreenParams params;
        Object hreVar;
        JSONObject jSONObject;
        int i = this.E;
        int i2 = 11;
        int i3 = 17;
        int i4 = 2;
        int iMax = 0;
        iMax = 0;
        String str = 0;
        strM698getSessionIdUFAIyc8 = null;
        String strM698getSessionIdUFAIyc8 = null;
        previewAttachment = null;
        previewAttachment = null;
        Object previewAttachment = null;
        str = 0;
        str = 0;
        str = 0;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj3;
                final nwb nwbVar = (nwb) obj2;
                ((w86) obj).getClass();
                if (accessibilityManager == null) {
                    return new q5(0);
                }
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: p5
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        nwbVar.setValue(Boolean.valueOf(z));
                    }
                };
                accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                return new r5(accessibilityManager, iMax, touchExplorationStateChangeListener);
            case 1:
                fb1 fb1Var = (fb1) obj3;
                nc4 nc4Var = (nc4) obj2;
                fb1Var.a(nc4Var);
                return new r5(fb1Var, i, nc4Var);
            case 2:
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                ((a21) obj3).invoke(xd6Var, (ja8) obj2);
                return ieiVar;
            case 3:
                cv9 cv9Var = (cv9) obj;
                cv9Var.a();
                xd6.Y0(cv9Var, (c40) obj3, (jy1) obj2, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 60);
                return ieiVar;
            case 4:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                ((w52) obj3).b.g0(lzeVar, (ArrayList) obj2);
                return ieiVar;
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                tze tzeVarL0 = lzeVar2.L0((String) obj3);
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        tzeVarL0.N(i, (String) it.next());
                        i++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList2.add(tzeVarL0.g0(0));
                        break;
                    }
                    tzeVarL0.close();
                    return arrayList2;
                } catch (Throwable th) {
                    tzeVarL0.close();
                    throw th;
                }
            case 6:
                lze lzeVar3 = (lze) obj;
                lzeVar3.getClass();
                ((h62) obj3).b.g0(lzeVar3, (ArrayList) obj2);
                return ieiVar;
            case 7:
                lze lzeVar4 = (lze) obj;
                lzeVar4.getClass();
                ((zs2) obj3).b.g0(lzeVar4, (List) obj2);
                return ieiVar;
            case 8:
                ((w86) obj).getClass();
                return new r5((on8) obj3, i4, obj2);
            case 9:
                aig aigVar = (aig) obj;
                aigVar.getClass();
                ((pz7) obj3).invoke(aigVar, ((sn8) obj2).a());
                return ieiVar;
            case 10:
                ((String) obj).getClass();
                ((zy7) obj3).a();
                ((zy7) obj2).a();
                return ieiVar;
            case 11:
                hw2 hw2Var = (hw2) obj3;
                Context context = (Context) obj2;
                String str2 = (String) obj;
                str2.getClass();
                String strS0 = w44.S0(bsg.N0(str2), "\n", null, null, null, 62);
                if (hw2Var.W()) {
                    gb9.D(hw2Var.a, null, null, new g9(hw2Var, new MessageAttachment((String) null, "excerpt_from_previous_claude_message.txt", strS0.length(), "text/plain", strS0, 1, (mq5) null), str, 23), 3);
                } else {
                    Toast.makeText(context, context.getString(R.string.max_attachments_reached), 0).show();
                }
                return ieiVar;
            case 12:
                rwe rweVar = (rwe) obj3;
                Context context2 = (Context) obj2;
                MessageAttachment messageAttachment = (MessageAttachment) obj;
                messageAttachment.getClass();
                String strM232getId4Lkzfcw = messageAttachment.m232getId4Lkzfcw();
                if (strM232getId4Lkzfcw != null) {
                    String file_name = messageAttachment.getFile_name();
                    if (file_name.length() == 0) {
                        file_name = kgh.o(context2.getString(R.string.chat_pasted_attachment_display_name), ".txt");
                    }
                    rweVar.E.m(new r23(new ChatScreenModalBottomSheetDestination.PreviewBlob(new MessageBlobFile(strM232getId4Lkzfcw, file_name, (Date) null, (String) null, (String) null, (Long) null, 60, (mq5) null)), i), new p23(5));
                }
                return ieiVar;
            case 13:
                t53 t53Var = (t53) obj2;
                int iIntValue = ((Integer) obj).intValue();
                p0a p0aVarH = ((x0a) obj3).h();
                q0a q0aVar = (q0a) w44.V0(p0aVarH.k);
                if (q0aVar != null) {
                    if (q0aVar.a >= ky2.I.a() + t53Var.X0.size()) {
                        iMax = Math.max((p0aVarH.m - iIntValue) - q0aVar.p, 0);
                    }
                }
                return Integer.valueOf(iMax);
            case 14:
                hw2 hw2Var2 = (hw2) obj3;
                String str3 = (String) obj;
                str3.getClass();
                cpk.u(hw2Var2.D, str3);
                hw2Var2.f.a.h();
                lsc lscVar = hw2Var2.K;
                Boolean bool = Boolean.FALSE;
                lscVar.setValue(bool);
                hw2Var2.H.setValue(null);
                hw2Var2.F.setValue(null);
                hw2Var2.G.setValue(null);
                hw2Var2.z.setValue(bool);
                ((zy7) obj2).a();
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                hw2 hw2Var3 = (hw2) obj3;
                t53 t53Var2 = (t53) obj2;
                mc3 mc3Var = (mc3) obj;
                mc3Var.getClass();
                String strB = mc3Var.b();
                String str4 = t53Var2.d.e;
                skd skdVarQ0 = t53Var2.Q0();
                if (skdVarQ0 == null || (projectTemplateId2 = skdVarQ0.c) == null || (type = projectTemplateId2.getType()) == null || (strName2 = type.name()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = strName2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                skd skdVarQ02 = t53Var2.Q0();
                if (skdVarQ02 != null && (projectTemplateId = skdVarQ02.c) != null && (subtype = projectTemplateId.getSubtype()) != null && (strName = subtype.name()) != null) {
                    String lowerCase2 = strName.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str = lowerCase2;
                }
                ProjectsEvents$ProjectChatStarterClicked projectsEvents$ProjectChatStarterClicked = new ProjectsEvents$ProjectChatStarterClicked(str4, mc3Var.a(), lowerCase, str);
                strB.getClass();
                cpk.u(hw2Var3.D, strB);
                hw2Var3.j.e(projectsEvents$ProjectChatStarterClicked, ProjectsEvents$ProjectChatStarterClicked.Companion.serializer());
                return ieiVar;
            case 16:
                t53 t53Var3 = (t53) obj3;
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue = bool2.booleanValue();
                t53Var3.K0.setValue(bool2);
                ((qi3) obj2).e(new ChatEvents$GhostModeToggle(t53Var3.d.e, t53Var3.L0, zBooleanValue), ChatEvents$GhostModeToggle.Companion.serializer());
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                hw2 hw2Var4 = (hw2) obj3;
                rwe rweVar2 = (rwe) obj2;
                gt2 gt2Var = (gt2) obj;
                gt2Var.getClass();
                ww2 ww2VarA = gt2Var.a();
                sw2 sw2Var = ww2VarA instanceof sw2 ? (sw2) ww2VarA : null;
                if (sw2Var == null || !tik.j(sw2Var)) {
                    ww2 ww2VarA2 = gt2Var.a();
                    if (ww2VarA2 instanceof pw2) {
                        Uri uriI = ((pw2) ww2VarA2).i();
                        if (uriI != null) {
                            String string = uriI.toString();
                            string.getClass();
                            previewAttachment = new ChatScreenModalBottomSheetDestination.PreviewLocalImage(string, ww2VarA2.k());
                        }
                    } else if (ww2VarA2 instanceof qw2) {
                        qw2 qw2Var = (qw2) ww2VarA2;
                        MessageImageAsset preview_asset = qw2Var.m().getPreview_asset();
                        if (preview_asset == null) {
                            preview_asset = qw2Var.m().getThumbnail_asset();
                        }
                        previewAttachment = new ChatScreenModalBottomSheetDestination.PreviewImage(preview_asset, false, false, false, 14, (mq5) null);
                    } else if (ww2VarA2 instanceof mw2) {
                        previewAttachment = new ChatScreenModalBottomSheetDestination.PreviewDocument(((mw2) ww2VarA2).m());
                    } else if (ww2VarA2 instanceof lw2) {
                        previewAttachment = new ChatScreenModalBottomSheetDestination.PreviewBlob(((lw2) ww2VarA2).m());
                    } else if ((ww2VarA2 instanceof jw2) && ((jw2) ww2VarA2).m().getExtracted_content().length() > 0) {
                        String string2 = gt2Var.b().toString();
                        string2.getClass();
                        previewAttachment = new ChatScreenModalBottomSheetDestination.PreviewAttachment(string2);
                    }
                    if (previewAttachment != null) {
                        rweVar2.E.m(new cv(14, previewAttachment), new p23(28));
                    }
                } else {
                    gb9.D(hw2Var4.a, null, null, new nn1(hw2Var4, sw2Var, (tp4) str, i3), 3);
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                x0.d((rwe) obj3);
                ((bz7) obj2).invoke(bool3);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str5 = (String) obj2;
                zy7 zy7Var = (zy7) obj;
                zy7Var.getClass();
                kd4 kd4VarB = ((swe) obj3).a.b();
                kd4VarB.getClass();
                y59 y59Var = (y59) ((HashMap) kd4VarB.b).get(str5);
                if (y59Var != null) {
                    return y59Var;
                }
                y59 y59Var2 = (y59) zy7Var.a();
                kd4VarB.k(str5, y59Var2);
                return y59Var2;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                NewCodeSessionPrefill newCodeSessionPrefill = (NewCodeSessionPrefill) obj;
                newCodeSessionPrefill.getClass();
                iv1.F((zqc) obj3, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams((String) null, false, newCodeSessionPrefill, (fwc) null, (CodeSessionListScope) obj2, 10, (mq5) null)));
                return ieiVar;
            case 21:
                UserArtifact userArtifact = (UserArtifact) obj;
                userArtifact.getClass();
                iv1.F((zqc) obj3, new ClaudeAppDestination.Detail.Chat(z93.a((z93) obj2, userArtifact.m152getChat_conversation_uuidRjYBDck(), null, userArtifact.m151getArtifact_identifiereX_QYXY(), 8)));
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                qzb qzbVar = (qzb) obj3;
                zqc zqcVar = (zqc) obj2;
                tk5 tk5Var = zqcVar.E;
                chc chcVar = (chc) obj;
                chcVar.getClass();
                i = (chcVar.d && qzbVar.e()) ? 1 : 0;
                ie3 ie3Var = (ie3) w44.V0(((te3) zqcVar.F.getValue()).b);
                ClaudeAppDestination.Detail detail = ie3Var != null ? (ClaudeAppDestination.Detail) ie3Var.a : null;
                ClaudeAppDestination.Detail.CodeRemoteSession codeRemoteSession = detail instanceof ClaudeAppDestination.Detail.CodeRemoteSession ? (ClaudeAppDestination.Detail.CodeRemoteSession) detail : null;
                if (codeRemoteSession != null && (params = codeRemoteSession.getParams()) != null) {
                    strM698getSessionIdUFAIyc8 = params.m698getSessionIdUFAIyc8();
                }
                if (strM698getSessionIdUFAIyc8 != null ? SessionId.m1117equalsimpl0(strM698getSessionIdUFAIyc8, chcVar.a) : false) {
                    iv1.I(zqcVar, i != 0 ? ClaudeAppDestination.List.CoworkRemote.INSTANCE : ClaudeAppDestination.List.CodeRemote.INSTANCE);
                } else if (i != 0) {
                    tk5Var.m(new qj3(ClaudeAppDestination.List.CoworkRemote.INSTANCE, zqcVar, i2), pj3.X);
                    iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams(chcVar.a, false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) CodeSessionListScope.DramaticShrimp.INSTANCE, 14, (mq5) null)));
                } else {
                    tk5Var.m(new qj3(ClaudeAppDestination.List.CodeRemote.INSTANCE, zqcVar, 12), pj3.Y);
                    iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams(chcVar.a, false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) null, 30, (mq5) null)));
                }
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                nwb nwbVar2 = (nwb) obj2;
                r4a r4aVar = (r4a) obj;
                r4aVar.getClass();
                lsc lscVar2 = ((qhc) obj3).a;
                phc phcVar = (phc) lscVar2.getValue();
                lscVar2.setValue(null);
                if (phcVar != null) {
                    ((bz7) nwbVar2.getValue()).invoke(ProjectId.m1079boximpl(phcVar.a));
                }
                return new le(r4aVar, 15);
            case 24:
                r4a r4aVar2 = (r4a) obj;
                r4aVar2.getClass();
                ((ehc) obj3).a.setValue(Boolean.FALSE);
                ((zy7) ((nwb) obj2).getValue()).a();
                return new le(r4aVar2, 11);
            case BuildConfig.VERSION_CODE /* 25 */:
                nwb nwbVar3 = (nwb) obj2;
                r4a r4aVar3 = (r4a) obj;
                r4aVar3.getClass();
                lsc lscVar3 = ((uhc) obj3).a;
                thc thcVar = (thc) lscVar3.getValue();
                lscVar3.setValue(null);
                if (thcVar != null) {
                    ((bz7) nwbVar3.getValue()).invoke(ChatSnapshotId.m985boximpl(thcVar.a));
                }
                return new le(r4aVar3, 17);
            case 26:
                nwb nwbVar4 = (nwb) obj2;
                r4a r4aVar4 = (r4a) obj;
                r4aVar4.getClass();
                lsc lscVar4 = ((shc) obj3).a;
                rhc rhcVar = (rhc) lscVar4.getValue();
                lscVar4.setValue(null);
                if (rhcVar != null) {
                    ((bz7) nwbVar4.getValue()).invoke(rhcVar.a);
                }
                return new le(r4aVar4, 16);
            case 27:
                r4a r4aVar5 = (r4a) obj;
                r4aVar5.getClass();
                ((hhc) obj3).a.setValue(Boolean.FALSE);
                ((zy7) ((nwb) obj2).getValue()).a();
                return new le(r4aVar5, 13);
            case 28:
                bzd bzdVar = (bzd) obj2;
                r4a r4aVar6 = (r4a) obj;
                r4aVar6.getClass();
                lsc lscVar5 = ((qua) obj3).a;
                String str6 = (String) lscVar5.getValue();
                lscVar5.setValue(null);
                if (str6 != null) {
                    bzdVar.getClass();
                    try {
                        jSONObject = new JSONObject(str6);
                    } catch (Throwable th2) {
                        hreVar = new hre(th2);
                    }
                    if (!jSONObject.optBoolean("isGhostPush", false)) {
                        int iOptInt = jSONObject.optInt("campaignId", 0);
                        Integer numValueOf = Integer.valueOf(iOptInt);
                        if (iOptInt <= 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue2 = numValueOf.intValue();
                            String strOptString = jSONObject.optString("messageId");
                            strOptString.getClass();
                            if (strOptString.length() <= 0) {
                                strOptString = null;
                            }
                            if (strOptString != null) {
                                int iOptInt2 = jSONObject.optInt("templateId", 0);
                                Integer numValueOf2 = Integer.valueOf(iOptInt2);
                                if (iOptInt2 <= 0) {
                                    numValueOf2 = null;
                                }
                                hreVar = new TrackPushOpenRequest(iIntValue2, strOptString, numValueOf2);
                                break;
                            }
                            boolean z = hreVar instanceof hre;
                            Object obj4 = hreVar;
                            if (z) {
                                obj4 = null;
                            }
                            TrackPushOpenRequest trackPushOpenRequest = (TrackPushOpenRequest) obj4;
                            if (trackPushOpenRequest != null) {
                                gb9.D(bzdVar.f, null, null, new kza(bzdVar, trackPushOpenRequest, str, 25), 3);
                            }
                        }
                    }
                }
                return new le(r4aVar6, 7);
            default:
                Project project = (Project) obj;
                project.getClass();
                ((rwe) obj3).E.m(hr0.U, new tj3(10));
                iv1.G((zqc) obj2, new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(project.m404getUuid5pmjbU(), (boolean) iMax, i4, (mq5) str)));
                return ieiVar;
        }
    }
}
