package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.api.memory.MelangeMeta;
import com.anthropic.claude.conway.protocol.ConwaySearchHit;
import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.sessions.types.GitHubBranch;
import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ p4(eo5 eo5Var, Object obj, int i) {
        this.E = i;
        this.G = eo5Var;
        this.F = obj;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                r9i.F.getClass();
                r9i r9iVar = r9i.G;
                u9i u9iVarP = ((r4) obj2).p();
                List list = Collections.EMPTY_LIST;
                o4 o4Var = new o4(0, this);
                xea xeaVar = gfa.e;
                xeaVar.getClass();
                break;
            case 1:
                ((bz7) obj).invoke(SessionId.m1114boximpl(((SessionResource) obj2).m875getIdOcx55TE()));
                break;
            case 2:
                ((bz7) obj).invoke((CodeAgent) obj2);
                break;
            case 3:
                ((mw) obj).invoke((iaj) obj2);
                break;
            case 4:
                ((l6) obj).invoke((iaj) obj2);
                break;
            case 5:
                break;
            case 6:
                ((bz7) obj).invoke(((dr0) obj2).a);
                break;
            case 7:
                iqb iqbVar = e93.a;
                ((nwb) obj).setValue(Boolean.TRUE);
                ((nwb) obj2).setValue(null);
                break;
            case 8:
                ((m83) obj).a.invoke(((iaj) obj2).b);
                break;
            case 9:
                uhd uhdVar = (uhd) obj;
                ApiHelpline apiHelpline = uhdVar.g;
                if (apiHelpline != null) {
                    ((m83) obj2).s.invoke(uhdVar.a, apiHelpline);
                }
                break;
            case 10:
                ((bz7) obj).invoke(((GitHubBranch) obj2).getName());
                break;
            case 11:
                ((bz7) obj).invoke((SelfHostedRunnerPool) obj2);
                break;
            case 12:
                ((bz7) obj).invoke((srf) obj2);
                break;
            case 13:
                ((zy7) obj).a();
                rrk.i((hp4) obj2);
                break;
            case 14:
                ((bz7) obj).invoke(((ckg) obj2).c);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                tpg tpgVar = (tpg) ((wpg) obj2);
                ((pz7) obj).invoke(tpgVar.a, tpgVar.b);
                break;
            case 16:
                ((bz7) obj).invoke(((opg) ((wpg) obj2)).b);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((bz7) obj).invoke((ConwaySearchHit) obj2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((bz7) obj).invoke((t45) obj2);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m2i m2iVar = ((b9i) obj).n;
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                pbg pbgVar = new pbg();
                Iterator it = ((j08) obj2).i().iterator();
                while (it.hasNext()) {
                    pbgVar.add(((h08) it.next()).e((a) obj));
                }
                break;
            case 21:
                ((py3) obj).invoke((n18) obj2);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((f7) obj).invoke((n18) obj2);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((bz7) obj).invoke(obj2);
                break;
            case 24:
                long jA = ((n36) obj2).a();
                mdg mdgVar = ((ii7) obj).h;
                Long lValueOf = Long.valueOf(jA);
                Object obj3 = mdgVar.get(lValueOf);
                if (obj3 == null) {
                    ArrayList arrayList = new ArrayList();
                    kdg kdgVar = new kdg();
                    kdgVar.addAll(arrayList);
                    mdgVar.put(lValueOf, kdgVar);
                    obj3 = kdgVar;
                }
                ((kdg) obj3).add(new x5a(vb7.i(), ""));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((bz7) obj).invoke((McpTool) obj2);
                break;
            case 26:
                nwb nwbVar = (nwb) obj2;
                String strM352getEnabled_keyA4OzCrU = ((McpTool) obj).m352getEnabled_keyA4OzCrU();
                nwbVar.setValue(strM352getEnabled_keyA4OzCrU != null ? strM352getEnabled_keyA4OzCrU : null);
                break;
            case 27:
                ((bz7) obj).invoke(((MelangeMeta) obj2).getPath());
                break;
            case 28:
                ((bz7) obj).invoke((rd4) obj2);
                break;
            default:
                ((bz7) obj).invoke((fnd) obj2);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ p4(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
