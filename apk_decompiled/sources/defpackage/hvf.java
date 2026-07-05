package defpackage;

import com.anthropic.claude.analytics.events.SttEvents$CancelRecording;
import com.anthropic.claude.analytics.events.SttEvents$Error;
import com.anthropic.claude.analytics.events.SttEvents$StartRecording;
import com.anthropic.claude.analytics.events.SttEvents$TranscriptionSuccess;

/* JADX INFO: loaded from: classes2.dex */
public final class hvf implements wsg {
    public final String a;
    public final String b;
    public final qi3 c;
    public final koi d;
    public final ysg e;

    public hvf(String str, String str2, qi3 qi3Var, koi koiVar, ysg ysgVar) {
        qi3Var.getClass();
        koiVar.getClass();
        ysgVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = qi3Var;
        this.d = koiVar;
        this.e = ysgVar;
    }

    @Override // defpackage.wsg
    public final void a(String str, String str2, int i, int i2, String str3) {
        String str4 = this.d.e;
        ysg ysgVar = this.e;
        String code = ysgVar.c(ysgVar.b.f()).getCode();
        String str5 = this.b;
        if (str5 == null) {
            str5 = null;
        }
        this.c.e(new SttEvents$Error(str4, "", i, i2, code, str, "remote", str2, this.a, str5, str3), iv1.J(jce.b(SttEvents$Error.class)));
    }

    @Override // defpackage.wsg
    public final void b(int i, int i2, String str) {
        String str2 = this.d.e;
        ysg ysgVar = this.e;
        String code = ysgVar.c(ysgVar.b.f()).getCode();
        String str3 = this.b;
        if (str3 == null) {
            str3 = null;
        }
        this.c.e(new SttEvents$TranscriptionSuccess(str2, "", i, i2, code, "remote", false, this.a, str3, str), iv1.J(jce.b(SttEvents$TranscriptionSuccess.class)));
    }

    @Override // defpackage.wsg
    public final void c(String str) {
        String str2 = this.d.e;
        ysg ysgVar = this.e;
        String code = ysgVar.c(ysgVar.b.f()).getCode();
        String str3 = this.b;
        if (str3 == null) {
            str3 = null;
        }
        this.c.e(new SttEvents$StartRecording(str2, "", code, "remote", this.a, str3, str), iv1.J(jce.b(SttEvents$StartRecording.class)));
    }

    @Override // defpackage.wsg
    public final void d(int i, int i2, String str) {
        String str2 = this.d.e;
        ysg ysgVar = this.e;
        String code = ysgVar.c(ysgVar.b.f()).getCode();
        String str3 = this.b;
        if (str3 == null) {
            str3 = null;
        }
        this.c.e(new SttEvents$CancelRecording(str2, "", i, i2, code, "remote", this.a, str3, str), iv1.J(jce.b(SttEvents$CancelRecording.class)));
    }

    @Override // defpackage.wsg
    public final String getSurface() {
        return this.a;
    }
}
