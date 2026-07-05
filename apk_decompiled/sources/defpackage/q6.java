package defpackage;

import android.content.Context;
import android.webkit.WebView;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination;
import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.TextToolResult;
import java.util.UUID;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q6 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ q6(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String uri;
        String str;
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                iqb iqbVar = s6.a;
                return ieiVar;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                return new WebView(context);
            case 2:
                yn6 yn6Var = (yn6) obj;
                yn6Var.getClass();
                return new cpc(Double.valueOf(yn6Var.b()), "kcal");
            case 3:
                f3b f3bVar = (f3b) obj;
                f3bVar.getClass();
                if (f3bVar instanceof d3b) {
                    uri = ((d3b) f3bVar).a.getName();
                    str = "prompt_";
                } else {
                    if (!(f3bVar instanceof e3b)) {
                        wg6.i();
                        return null;
                    }
                    uri = ((e3b) f3bVar).a.getUri();
                    str = "resource_";
                }
                return ij0.i(str, uri);
            case 4:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                og9Var.c = true;
                return ieiVar;
            case 5:
                TextToolResult textToolResult = (TextToolResult) obj;
                textToolResult.getClass();
                return textToolResult.getText();
            case 6:
                g25 g25Var = (g25) obj;
                g25Var.getClass();
                return ij0.C(g25Var.a, "=", g25Var.b);
            case 7:
                return (pgc) pgc.K.get(((Integer) obj).intValue());
            case 8:
                yk ykVar = (yk) obj;
                ykVar.getClass();
                return ykVar.b + ":" + bsg.j1(8, ykVar.a) + ":'" + bsg.j1(20, ykVar.c) + "'";
            case 9:
                yk ykVar2 = (yk) obj;
                ykVar2.getClass();
                if (ykVar2.b == xm.F && ykVar2.g == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                yk ykVar3 = (yk) obj;
                ykVar3.getClass();
                return ykVar3.a;
            case 11:
                yk ykVar4 = (yk) obj;
                ykVar4.getClass();
                return Boolean.valueOf(ykVar4.g != null);
            case 12:
                yk ykVar5 = (yk) obj;
                ykVar5.getClass();
                return ykVar5.a;
            case 13:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case 14:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case g.MAX_FIELD_NUMBER /* 17 */:
                SessionResource sessionResource = (SessionResource) obj;
                sessionResource.getClass();
                return sessionResource.m875getIdOcx55TE();
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((SessionResource) obj).getClass();
                return "task";
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((ekf) obj).getClass();
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((ekf) obj).getClass();
                return ieiVar;
            case 21:
                oe7 oe7Var = (oe7) obj;
                oe7Var.getClass();
                oe7Var.b("can you grab the failing snapshot + the build log?");
                oe7Var.a("Pulling them now…", x44.X(wp.g("/snapshots/login-diff.png", 2, null), wp.f("/ci/build.log", null, 0L, 4)));
                oe7Var.a("Here you go.", x44.X(wp.g("/snapshots/login-diff.png", 4, "04df3ad9-6db3-4f53-9be3-a01d6b0f1295"), wp.f("/tmp/mushroom_wellington.pdf", "fc7c17d2-713e-474e-96be-8c72ac045d55", 2417664L, 8)));
                oe7Var.b("show me all three variants side by side");
                oe7Var.a("", x44.X(wp.g("/snapshots/variant-a.png", 4, "04df3ad9-6db3-4f53-9be3-a01d6b0f1295"), wp.g("/snapshots/variant-b.png", 4, "04df3ad9-6db3-4f53-9be3-a01d6b0f1295"), wp.g("/snapshots/variant-c.png", 4, "04df3ad9-6db3-4f53-9be3-a01d6b0f1295")));
                oe7Var.a("And the full matrix:", x44.X(wp.g("/m/1.png", 4, "04df3ad9-6db3-4f53-9be3-a01d6b0f1295"), wp.g("/m/2.png", 4, "04df3ad9-6db3-4f53-9be3-a01d6b0f1295"), wp.g("/m/3.png", 4, "04df3ad9-6db3-4f53-9be3-a01d6b0f1295"), wp.g("/m/4.png", 4, "04df3ad9-6db3-4f53-9be3-a01d6b0f1295")));
                oe7Var.b("what about the crash dump?");
                oe7Var.a("Upload choked on these — they're on my machine but didn't make it to the file service.", x44.X(wp.g("/core/dump.png", 4, null), wp.f("/core/trace.txt", null, 891203L, 8)));
                oe7Var.a("The rest came through:", x44.X(wp.f("/reports/q4-final-review-with-stakeholder-comments-v3.pdf", "fc7c17d2-713e-474e-96be-8c72ac045d55", 4823112L, 8), wp.f("/src/Example.kt", "fc7c17d2-713e-474e-96be-8c72ac045d55", 3201L, 8), wp.f("/data/events.csv", "fc7c17d2-713e-474e-96be-8c72ac045d55", 12345L, 8)));
                oe7Var.b("ok going to go tweak the component now, thanks");
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((UUID) obj).getClass();
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                CodeAgent codeAgent = (CodeAgent) obj;
                codeAgent.getClass();
                return codeAgent.m833getIdVN9v2L4();
            case 24:
                ArtifactMetadata artifactMetadata = (ArtifactMetadata) obj;
                artifactMetadata.getClass();
                return artifactMetadata.getUuid().getValue();
            case BuildConfig.VERSION_CODE /* 25 */:
                ((ArtifactMetadata) obj).getClass();
                return "artifact";
            case 26:
                ((sx2) obj).getClass();
                return le6.E;
            case 27:
                sx2 sx2Var = (sx2) obj;
                sx2Var.getClass();
                return sx2Var.a.m176getUuidRjYBDck();
            case 28:
                ((AllChatsListBottomSheetDestination) obj).getClass();
                return Boolean.valueOf(!r10.equals(AllChatsListBottomSheetDestination.Closed.INSTANCE));
            default:
                Project project = (Project) obj;
                project.getClass();
                return project.m404getUuid5pmjbU();
        }
    }
}
