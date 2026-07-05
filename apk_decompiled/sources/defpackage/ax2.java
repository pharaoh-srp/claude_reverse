package defpackage;

import android.net.Uri;
import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ScreenSource;
import com.anthropic.claude.chat.input.files.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ax2 extends vp4 {
    public Uri E;
    public String F;
    public ChatEvents$AttachmentSource G;
    public ScreenSource H;
    public pz7 I;
    public String J;
    public zy7 K;
    public si7 L;
    public ChatEvents$AddAttachment M;
    public sw2 N;
    public /* synthetic */ Object O;
    public final /* synthetic */ a P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax2(a aVar, vp4 vp4Var) {
        super(vp4Var);
        this.P = aVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        return this.P.a(null, null, null, null, null, null, null, this);
    }
}
