package defpackage;

import com.anthropic.claude.api.chat.tool.AgentSummary;
import com.anthropic.claude.api.chat.tool.ResearchStatusResponse;
import com.anthropic.claude.core.telemetry.SilentException;
import java.net.URL;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yle {
    public static final long e;
    public static final long f;
    public final bj0 a;
    public final dl2 b;
    public final qi3 c;
    public final LinkedHashMap d = new LinkedHashMap();

    static {
        lz1 lz1Var = uh6.F;
        zh6 zh6Var = zh6.SECONDS;
        e = v40.Q(5, zh6Var);
        f = v40.Q(5, zh6Var);
    }

    public yle(bj0 bj0Var, dl2 dl2Var, qi3 qi3Var) {
        this.a = bj0Var;
        this.b = dl2Var;
        this.c = qi3Var;
    }

    public static final long a(yle yleVar, ResearchStatusResponse researchStatusResponse) {
        Instant instantNow;
        yleVar.getClass();
        try {
            Instant instant = Instant.parse(researchStatusResponse.getStarted_at());
            String finished_at = researchStatusResponse.getFinished_at();
            if (finished_at == null || (instantNow = Instant.parse(finished_at)) == null) {
                instantNow = Instant.now();
            }
            return ChronoUnit.SECONDS.between(instant, instantNow);
        } catch (Exception e2) {
            SilentException.a(new SilentException(ij0.i("Error calculating elapsed time: ", e2.getMessage())), null, false, 3);
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [lm6] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    public static final List b(yle yleVar, ResearchStatusResponse researchStatusResponse) {
        ?? arrayList;
        Object obj;
        Object hreVar;
        Object hreVar2;
        yleVar.getClass();
        List<AgentSummary> agent_summaries = researchStatusResponse.getAgent_summaries();
        if (agent_summaries != null) {
            List<AgentSummary> list = agent_summaries;
            arrayList = new ArrayList(x44.y(list, 10));
            for (AgentSummary agentSummary : list) {
                List<String> top_icon_urls = agentSummary.getTop_icon_urls();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = top_icon_urls.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        hreVar2 = new URL((String) it.next());
                    } catch (Throwable th) {
                        hreVar2 = new hre(th);
                    }
                    URL url = (URL) (hreVar2 instanceof hre ? null : hreVar2);
                    if (url != null) {
                        arrayList2.add(url);
                    }
                }
                String description = agentSummary.getDescription();
                boolean z = agentSummary.getCompleted_at() != null;
                int total_sources = agentSummary.getTotal_sources();
                try {
                    hreVar = Instant.parse(agentSummary.getStarted_at());
                } catch (Throwable th2) {
                    hreVar = new hre(th2);
                }
                if (!(hreVar instanceof hre)) {
                    obj = hreVar;
                }
                arrayList.add(new ar(description, arrayList2, total_sources, z, (Instant) obj));
            }
        } else {
            arrayList = lm6.E;
        }
        return w44.i1((Iterable) arrayList, new pa9(4, new x8e(2)));
    }
}
