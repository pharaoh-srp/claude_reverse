package defpackage;

import android.view.View;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zk1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pl3 F;
    public final /* synthetic */ View G;
    public final /* synthetic */ k5j H;

    public /* synthetic */ zk1(pl3 pl3Var, View view, k5j k5jVar, int i) {
        this.E = i;
        this.F = pl3Var;
        this.G = view;
        this.H = k5jVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        k5j k5jVar = this.H;
        View view = this.G;
        pl3 pl3Var = this.F;
        switch (i) {
            case 0:
                SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                sttSupportedLanguage.getClass();
                pl3Var.c(view);
                k5jVar.B(sttSupportedLanguage);
                break;
            default:
                PlaybackPace playbackPace = (PlaybackPace) obj;
                playbackPace.getClass();
                pl3Var.c(view);
                k5jVar.r(playbackPace);
                break;
        }
        return ieiVar;
    }
}
