package defpackage;

import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionShown;
import com.anthropic.claude.analytics.events.CodeEvents$DiffCommentRemoved;
import com.anthropic.claude.analytics.events.CodeEvents$EnvironmentSelected;
import com.anthropic.claude.analytics.events.CodeEvents$RepositorySelected;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.code.ui.DiffLineComment;
import com.anthropic.claude.models.organization.configtypes.CCRStarterTask;
import com.anthropic.claude.sessions.types.BridgeEnvironmentInfo;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.GheSource;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cz3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i F;

    public /* synthetic */ cz3(i iVar, int i) {
        this.E = i;
        this.F = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r7v7 */
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
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Object next;
        tp4 tp4Var;
        Object next2;
        String git_repo_url;
        Object next3;
        int i = this.E;
        int i2 = -1;
        int i3 = 2;
        boolean z = true;
        int i4 = 0;
        iei ieiVar = iei.a;
        i iVar = this.F;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                i iVar2 = this.F;
                String strE0 = iVar2.E0();
                if (strE0 != null) {
                    List listA0 = iVar2.A0();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listA0) {
                        if (!x44.r(((DiffLineComment) obj2).getId(), str)) {
                            arrayList.add(obj2);
                        }
                    }
                    iVar2.t1(arrayList);
                    gb9.D(iVar2.a, null, null, new s14(iVar2, strE0, arrayList, false ? 1 : 0, 1), 3);
                    qi3 qi3Var = iVar2.l;
                    String str2 = iVar2.m;
                    String strE02 = iVar2.E0();
                    qi3Var.e(new CodeEvents$DiffCommentRemoved(str2, strE02 != null ? strE02 : null), CodeEvents$DiffCommentRemoved.Companion.serializer());
                }
                break;
            case 1:
                lhf lhfVar = (lhf) obj;
                lhfVar.getClass();
                GitHubRepo gitHubRepo = lhfVar.a;
                Iterator it = iVar.g.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (x44.r(((RepoWithStatus) next).getRepo().getId(), gitHubRepo.getId())) {
                        }
                    } else {
                        next = null;
                    }
                }
                RepoWithStatus repoWithStatus = (RepoWithStatus) next;
                if (repoWithStatus != null) {
                    gitHubRepo.setSourceUrl(repoWithStatus.getSource_url());
                    GheSource ghe = repoWithStatus.getGhe();
                    gitHubRepo.setGheConfigurationId(ghe != null ? Integer.valueOf(ghe.getConfiguration_id()) : 0);
                    z = false;
                }
                break;
            case 2:
                ((w86) obj).getClass();
                c4c c4cVar = iVar.B0;
                if (c4cVar.b() != null && c4cVar.g == null) {
                    c4cVar.g = (Long) c4cVar.e.a();
                    qi3 qi3Var2 = c4cVar.a;
                    String str3 = c4cVar.b;
                    String str4 = (String) c4cVar.c.a();
                    if (str4 == null) {
                        str4 = "";
                    }
                    qi3Var2.e(new CodeEvents$CodePromptSuggestionShown(str3, str4), CodeEvents$CodePromptSuggestionShown.Companion.serializer());
                }
                break;
            case 3:
                UUID uuid = (UUID) obj;
                uuid.getClass();
                b54.w0(new xl(uuid, 1), iVar.W1);
                lf9 lf9Var = (lf9) iVar.X1.remove(uuid);
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                break;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                iVar.W(str5);
                break;
            case 5:
                String str6 = (String) obj;
                str6.getClass();
                i iVar3 = this.F;
                kdg kdgVar = iVar3.S1;
                ListIterator listIterator = kdgVar.listIterator();
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    tp4Var = null;
                    if (c8aVar.hasNext()) {
                        next2 = c8aVar.next();
                        if (x44.r(((lwc) next2).b, str6)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                b54.w0(new w43(str6, 18), kdgVar);
                iVar3.f0();
                gb9.D(iVar3.a, null, null, new t14(iVar3, str6, (lwc) next2, tp4Var, 0), 3);
                break;
            case 6:
                String str7 = (String) obj;
                str7.getClass();
                b54.w0(new w43(str7, 19), iVar.S1);
                iVar.f0();
                gb9.D(iVar.a, null, null, new pb2(iVar, str7, num, 23), 3);
                break;
            case 7:
                r4a r4aVar = (r4a) obj;
                r4aVar.getClass();
                mp4 mp4Var = iVar.a;
                gb9.D(mp4Var, null, null, new o14(iVar, num, 24), 3);
                gb9.D(mp4Var, null, null, new o14(iVar, num, 25), 3);
                if (!iVar.R0() && ((iVar.E0() == null || iVar.D0() != null || ((String) iVar.f1.getValue()) != null) && !iVar.V0())) {
                    iVar.Y0();
                    iVar.C1();
                }
                break;
            case 8:
                EnvironmentResource environmentResource = (EnvironmentResource) obj;
                environmentResource.getClass();
                iVar.w1(new SessionTarget.Environment(environmentResource));
                iVar.h.q(iVar.C0());
                if (gwj.j(environmentResource)) {
                    bx1 bx1Var = iVar.i;
                    kdg kdgVar2 = iVar.T0;
                    BridgeEnvironmentInfo bridge_info = environmentResource.getBridge_info();
                    if (bridge_info != null && (git_repo_url = bridge_info.getGit_repo_url()) != null) {
                        Pattern patternCompile = Pattern.compile("github\\.com[:/]([^/]+)/([^/.]+)");
                        patternCompile.getClass();
                        Matcher matcher = patternCompile.matcher(git_repo_url);
                        matcher.getClass();
                        ova ovaVarL = dgj.l(matcher, 0, git_repo_url);
                        if (ovaVarL != null) {
                            String str8 = (String) ((mva) ovaVarL.a()).get(1);
                            String str9 = (String) ((mva) ovaVarL.a()).get(2);
                            Iterator it2 = iVar.g.c().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next3 = it2.next();
                                    RepoWithStatus repoWithStatus2 = (RepoWithStatus) next3;
                                    if (!isg.j0(repoWithStatus2.getRepo().getOwner().getLogin(), str8) || !isg.j0(repoWithStatus2.getRepo().getName(), str9)) {
                                    }
                                } else {
                                    next3 = null;
                                }
                            }
                            RepoWithStatus repoWithStatus3 = (RepoWithStatus) next3;
                            if (repoWithStatus3 != null) {
                                kdgVar2.clear();
                                kdgVar2.add(new lhf(repoWithStatus3.getRepo(), null));
                                bx1Var.h(new xw1(repoWithStatus3.getRepo().getOwner().getLogin(), repoWithStatus3.getRepo().getName(), repoWithStatus3.getRepo().getGheConfigurationId()));
                            }
                            BridgeEnvironmentInfo bridge_info2 = environmentResource.getBridge_info();
                            String branch = bridge_info2 != null ? bridge_info2.getBranch() : null;
                            if (branch != null) {
                                bx1Var.g(branch);
                            }
                        }
                    }
                }
                iVar.l.e(new CodeEvents$EnvironmentSelected(iVar.m, environmentResource.getEnvironment_id(), (Integer) null, 4, (mq5) null), CodeEvents$EnvironmentSelected.Companion.serializer());
                break;
            case 9:
                GitHubRepo gitHubRepo2 = (GitHubRepo) obj;
                gitHubRepo2.getClass();
                Integer num = (Integer) iVar.U0.getValue();
                if (num != null) {
                    int iIntValue = num.intValue();
                    kdg kdgVar3 = iVar.T0;
                    if (iIntValue >= 0 && iIntValue < kdgVar3.size() && !x44.r(((lhf) kdgVar3.get(iIntValue)).a.getId(), gitHubRepo2.getId())) {
                        ListIterator listIterator2 = kdgVar3.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (c8aVar2.hasNext()) {
                                lhf lhfVar2 = (lhf) c8aVar2.next();
                                if (x44.r(lhfVar2.a.getOwner().getLogin(), gitHubRepo2.getOwner().getLogin()) && x44.r(lhfVar2.a.getName(), gitHubRepo2.getName())) {
                                    i2 = i4;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        kdgVar3.set(iIntValue, new lhf(gitHubRepo2, null));
                        if (i2 >= 0 && i2 != iIntValue) {
                            kdgVar3.remove(i2);
                        }
                        iVar.h1();
                        iVar.l.e(new CodeEvents$RepositorySelected(iVar.m, (Integer) null, 2, (mq5) null), CodeEvents$RepositorySelected.Companion.serializer());
                    }
                } else {
                    iVar.T(gitHubRepo2);
                }
                iVar.v1(null);
                break;
            case 10:
                GitHubRepo gitHubRepo3 = (GitHubRepo) obj;
                gitHubRepo3.getClass();
                kdg kdgVar4 = iVar.T0;
                if (kdgVar4.size() > 1) {
                    ListIterator listIterator3 = kdgVar4.listIterator();
                    while (true) {
                        c8a c8aVar3 = (c8a) listIterator3;
                        if (c8aVar3.hasNext()) {
                            if (x44.r(((lhf) c8aVar3.next()).a.getId(), gitHubRepo3.getId())) {
                                i2 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (i2 >= 0 && i2 >= 0 && i2 < kdgVar4.size()) {
                        kdgVar4.remove(i2);
                        iVar.h1();
                    }
                    iVar.v1(null);
                }
                break;
            case 11:
                SelfHostedRunnerPool selfHostedRunnerPool = (SelfHostedRunnerPool) obj;
                selfHostedRunnerPool.getClass();
                iVar.w1(new SessionTarget.SelfHostedPool(selfHostedRunnerPool));
                iVar.h.q(iVar.C0());
                iVar.l.e(new CodeEvents$EnvironmentSelected(iVar.m, "self_hosted_pool", (Integer) null, 4, (mq5) null), CodeEvents$EnvironmentSelected.Companion.serializer());
                break;
            case 12:
                String str10 = (String) obj;
                str10.getClass();
                int iIntValue2 = ((Number) iVar.V0.getValue()).intValue();
                kdg kdgVar5 = iVar.T0;
                if (iIntValue2 >= 0 && iIntValue2 < kdgVar5.size()) {
                    kdgVar5.set(iIntValue2, lhf.a((lhf) kdgVar5.get(iIntValue2), str10));
                }
                break;
            case 13:
                PermissionMode permissionMode = (PermissionMode) obj;
                permissionMode.getClass();
                iVar.D1(permissionMode);
                break;
            case 14:
                CCRStarterTask cCRStarterTask = (CCRStarterTask) obj;
                cCRStarterTask.getClass();
                if (!iVar.s0()) {
                    iVar.l1(cCRStarterTask.getPrompt(), false);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                rc8 rc8Var = iVar.r;
                List<Uri> list = (List) obj;
                list.getClass();
                for (Uri uri : list) {
                    uri.getClass();
                    kdg kdgVar6 = iVar.W1;
                    if (kdgVar6.size() >= amk.c(rc8Var).getMax_per_message_upload_count()) {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            String strE = iuj.E(iVar);
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj3)).getClass();
                                arrayList2.add(obj3);
                            }
                            if (!arrayList2.isEmpty()) {
                                zfa.a.getClass();
                                String str11 = "addUpload: at maxAttachments=" + amk.c(rc8Var).getMax_per_message_upload_count() + ", dropping " + uri;
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    ((n30) ((zfa) it3.next())).b(sfa.DEBUG, strE, str11);
                                }
                            }
                        }
                    } else {
                        UUID uuidRandomUUID = UUID.randomUUID();
                        uuidRandomUUID.getClass();
                        String lastPathSegment = uri.getLastPathSegment();
                        if (lastPathSegment == null) {
                            lastPathSegment = "file";
                        }
                        o32 o32Var = new o32(uuidRandomUUID, uri, lastPathSegment);
                        kdgVar6.add(o32Var);
                        iVar.X1.put(uuidRandomUUID, gb9.D(iVar.a, null, null, new cm(iVar, uri, o32Var, (tp4) null), 3));
                    }
                }
                break;
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                kdg kdgVar7 = iVar.T0;
                if (iIntValue3 >= 0 && iIntValue3 < kdgVar7.size()) {
                    kdgVar7.remove(iIntValue3);
                    iVar.h1();
                }
                break;
        }
        return ieiVar;
    }
}
