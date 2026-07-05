package defpackage;

import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.chat.input.files.a;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.mcpapps.transport.McpUiContentBlock;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.GitHubBranch;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;
import com.anthropic.claude.sessions.types.SessionResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class it2 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ it2(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Uri) obj).getClass();
                return Boolean.TRUE;
            case 1:
                return "";
            case 2:
                int i2 = a.q;
                return ieiVar;
            case 3:
                ((ww2) obj).getClass();
                return Boolean.valueOf(!(r9 instanceof sw2));
            case 4:
                ((i90) obj).getClass();
                gm3.b.getClass();
                return ul3.b;
            case 5:
                ((Integer) obj).getClass();
                return null;
            case 6:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.s(ekfVar, 0);
                return ieiVar;
            case 7:
                return ((McpUiContentBlock.Text) obj).getText();
            case 8:
                vza vzaVar = (vza) obj;
                vzaVar.getClass();
                aya ayaVar = vzaVar.a;
                lsc lscVar = vzaVar.h;
                if (!((Boolean) lscVar.getValue()).booleanValue()) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        String strE = iuj.E(vzaVar);
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList.add(obj2);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.INFO, strE, "Destroying MCP app WebView holder");
                            }
                        }
                    }
                    lscVar.setValue(Boolean.TRUE);
                    fd9.z(vzaVar.c, null);
                    ayaVar.stopLoading();
                    ayaVar.destroy();
                }
                return ieiVar;
            case 9:
                vsa vsaVar = (vsa) obj;
                vsaVar.getClass();
                return vsaVar.a() + "," + vsaVar.b();
            case 10:
                ((List) obj).getClass();
                return Boolean.TRUE;
            case 11:
                mtc mtcVar = (mtc) obj;
                mtcVar.getClass();
                if (mtcVar instanceof qxh) {
                    qxh qxhVar = (qxh) mtcVar;
                    if (qxhVar.getCanBeCollapsed()) {
                        return new vhb(qxhVar);
                    }
                }
                if (mtcVar instanceof ParsedContentBlock$Thinking) {
                    return new uhb((ParsedContentBlock$Thinking) mtcVar);
                }
                if (mtcVar instanceof htc) {
                    return new thb((htc) mtcVar);
                }
                return null;
            case 12:
                return Boolean.valueOf(((whb) obj) != null);
            case 13:
                ((ekf) obj).getClass();
                return ieiVar;
            case 14:
                ((nf0) obj).getClass();
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                p6i p6iVar = (p6i) obj;
                p6iVar.getClass();
                osc oscVar = (osc) p6iVar;
                oscVar.T = false;
                yfd.W(oscVar).V();
                return Boolean.FALSE;
            case 16:
                ckf.s((ekf) obj, 1);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((ekf) obj).getClass();
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((ekf) obj).getClass();
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((ekf) obj).getClass();
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ox3 ox3Var = (ox3) obj;
                ox3Var.getClass();
                return Boolean.valueOf(ox3Var.e);
            case 21:
                ox3 ox3Var2 = (ox3) obj;
                ox3Var2.getClass();
                return ox3Var2.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.p(ekfVar2, 0);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                RepoWithStatus repoWithStatus = (RepoWithStatus) obj;
                repoWithStatus.getClass();
                return repoWithStatus.getRepo().getId();
            case 24:
                SessionResource sessionResource = (SessionResource) obj;
                sessionResource.getClass();
                return sessionResource.m875getIdOcx55TE();
            case BuildConfig.VERSION_CODE /* 25 */:
                GitHubBranch gitHubBranch = (GitHubBranch) obj;
                gitHubBranch.getClass();
                return gitHubBranch.getName();
            case 26:
                EnvironmentResource environmentResource = (EnvironmentResource) obj;
                environmentResource.getClass();
                return environmentResource.getEnvironment_id();
            case 27:
                SelfHostedRunnerPool selfHostedRunnerPool = (SelfHostedRunnerPool) obj;
                selfHostedRunnerPool.getClass();
                return selfHostedRunnerPool.getPool_id();
            case 28:
                EnvironmentResource environmentResource2 = (EnvironmentResource) obj;
                environmentResource2.getClass();
                return environmentResource2.getEnvironment_id();
            default:
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                ckf.s(ekfVar3, 0);
                return ieiVar;
        }
    }
}
