package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.anthropic.claude.analytics.events.SttEvents$LanguageSelected;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l5j extends iwe implements k5j {
    public final xm1 b;
    public final ysg c;
    public final u4j d;
    public final qi3 e;
    public final koi f;
    public final w4j g;
    public final AudioManager h;
    public final AudioFocusRequest i;
    public boolean j;
    public fkg k;
    public volatile int l;

    public l5j(Context context, xm1 xm1Var, um1 um1Var, ysg ysgVar, f9 f9Var, u4j u4jVar, fk0 fk0Var, qi3 qi3Var, koi koiVar, h86 h86Var) {
        super(h86Var);
        this.b = xm1Var;
        this.c = ysgVar;
        this.d = u4jVar;
        this.e = qi3Var;
        this.f = koiVar;
        w4j w4jVar = new w4j(um1Var, fk0Var, ysgVar, f9Var, this.a);
        this.g = w4jVar;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        this.h = (AudioManager) systemService;
        this.i = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(new t41(2, this)).build();
        xm1Var.e(w4jVar.a());
        w4jVar.h();
        gb9.D(this.a, null, null, new l6b(this, null, 14), 3);
    }

    @Override // defpackage.k5j
    public final void B(SttSupportedLanguage sttSupportedLanguage) {
        sttSupportedLanguage.getClass();
        this.j = true;
        if (this.g.e(sttSupportedLanguage)) {
            O();
            this.e.e(new SttEvents$LanguageSelected(this.f.e, "voice_settings", sttSupportedLanguage.getCode()), SttEvents$LanguageSelected.Companion.serializer());
        }
    }

    @Override // defpackage.k5j
    public final boolean C() {
        return false;
    }

    @Override // defpackage.k5j
    public final void E() {
    }

    @Override // defpackage.k5j
    public final ArrayList F() {
        return this.g.d();
    }

    @Override // defpackage.k5j
    public final void L(String str) {
        this.j = true;
        this.g.g(str);
    }

    public final void O() {
        fkg fkgVar = this.k;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.b.d(new t51(this, this.l, 6));
    }

    @Override // defpackage.k5j
    public final String a() {
        return this.g.c();
    }

    @Override // defpackage.k5j
    public final void j(dhg dhgVar, float f) {
        dhgVar.getClass();
        this.l++;
        if (this.h.requestAudioFocus(this.i) != 1) {
            return;
        }
        fkg fkgVar = this.k;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.k = gb9.D(this.a, null, null, new kj1(this, dhgVar, f, tp4Var, 3), 3);
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        O();
        super.onDestroy();
    }

    @Override // defpackage.k5j
    public final void r(PlaybackPace playbackPace) {
        playbackPace.getClass();
        this.j = true;
        this.g.f(playbackPace);
        this.b.e(playbackPace);
    }

    @Override // defpackage.k5j
    public final PlaybackPace v() {
        return this.g.a();
    }

    @Override // defpackage.k5j
    public final SttSupportedLanguage w() {
        return this.g.b();
    }

    @Override // defpackage.k5j
    public final List x() {
        return (List) this.c.h.getValue();
    }
}
