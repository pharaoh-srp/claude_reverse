package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.bottomsheet.x0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u13 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ rwe G;
    public final /* synthetic */ rwe H;

    public /* synthetic */ u13(rwe rweVar, t53 t53Var, rwe rweVar2) {
        this.E = 2;
        this.G = rweVar;
        this.F = t53Var;
        this.H = rweVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        rwe rweVar = this.H;
        rwe rweVar2 = this.G;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (!yc3.c(str, t53Var, rweVar2, rweVar)) {
                    t53Var.B1(MessageFileEvents$DownloadSource.WIGGLE_PRESENT_FILES, str);
                }
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                if (!yc3.c(str2, t53Var, rweVar2, rweVar)) {
                    t53Var.B1(MessageFileEvents$DownloadSource.WIGGLE_PRESENT_FILES, str2);
                }
                break;
            case 2:
                ArtifactMetadata artifactMetadata = (ArtifactMetadata) obj;
                artifactMetadata.getClass();
                rweVar2.E.m(new fv(25, new ChatScreenArtifactSheetDestination[]{ChatScreenArtifactSheetDestination.Closed.INSTANCE, new ChatScreenArtifactSheetDestination.ViewArtifact(t53Var.x0(artifactMetadata))}), new j83(6));
                x0.d(rweVar);
                break;
            default:
                iaj iajVar = (iaj) obj;
                iajVar.getClass();
                if (!yc3.c(iajVar.a(), t53Var, rweVar2, rweVar)) {
                    t53Var.B1(MessageFileEvents$DownloadSource.WIGGLE_ARTIFACTS_SHEET, iajVar.a());
                    x0.d(rweVar2);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ u13(t53 t53Var, rwe rweVar, rwe rweVar2, int i) {
        this.E = i;
        this.F = t53Var;
        this.G = rweVar;
        this.H = rweVar2;
    }
}
