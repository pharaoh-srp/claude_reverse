package defpackage;

import com.anthropic.claude.analytics.events.SttEvents$CancelRecording;
import com.anthropic.claude.analytics.events.SttEvents$Error;
import com.anthropic.claude.analytics.events.SttEvents$StartRecording;
import com.anthropic.claude.analytics.events.SttEvents$TranscriptionSuccess;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class oc3 implements wsg {
    public final String a;
    public final qi3 b;
    public final koi c;
    public final String d;

    public oc3(String str, qi3 qi3Var, koi koiVar, ysg ysgVar) {
        str.getClass();
        qi3Var.getClass();
        koiVar.getClass();
        ysgVar.getClass();
        this.a = str;
        this.b = qi3Var;
        this.c = koiVar;
        this.d = ysgVar.c(ysgVar.b.f()).getCode();
    }

    @Override // defpackage.wsg
    public final void a(String str, String str2, int i, int i2, String str3) {
        this.b.e(new SttEvents$Error(this.c.e, this.a, i, i2, this.d, str, "remote", str2, "chat", (String) null, str3, 512, (mq5) null), iv1.J(jce.b(SttEvents$Error.class)));
    }

    @Override // defpackage.wsg
    public final void b(int i, int i2, String str) {
        this.b.e(new SttEvents$TranscriptionSuccess(this.c.e, this.a, i, i2, this.d, "remote", false, "chat", (String) null, str, FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, (mq5) null), iv1.J(jce.b(SttEvents$TranscriptionSuccess.class)));
    }

    @Override // defpackage.wsg
    public final void c(String str) {
        this.b.e(new SttEvents$StartRecording(this.c.e, this.a, this.d, "remote", "chat", (String) null, str, 32, (mq5) null), iv1.J(jce.b(SttEvents$StartRecording.class)));
    }

    @Override // defpackage.wsg
    public final void d(int i, int i2, String str) {
        this.b.e(new SttEvents$CancelRecording(this.c.e, this.a, i, i2, this.d, "remote", "chat", (String) null, str, FreeTypeConstants.FT_LOAD_PEDANTIC, (mq5) null), iv1.J(jce.b(SttEvents$CancelRecording.class)));
    }

    @Override // defpackage.wsg
    public final String getSurface() {
        return "chat";
    }
}
