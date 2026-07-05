package defpackage;

import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.models.organization.configtypes.SttVoiceOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w4j {
    public final um1 a;
    public final fk0 b;
    public final ysg c;
    public final f9 d;
    public final l45 e;
    public final wz5 f;
    public final wz5 g;
    public final wz5 h;

    public w4j(um1 um1Var, fk0 fk0Var, ysg ysgVar, f9 f9Var, l45 l45Var) {
        l45Var.getClass();
        this.a = um1Var;
        this.b = fk0Var;
        this.c = ysgVar;
        this.d = f9Var;
        this.e = l45Var;
        a5 a5Var = a5.N;
        this.f = mpk.x(new o4(9, this), a5Var);
        final int i = 0;
        this.g = mpk.x(new zy7(this) { // from class: v4j
            public final /* synthetic */ w4j F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                w4j w4jVar = this.F;
                switch (i2) {
                    case 0:
                        k6d k6dVar = PlaybackPace.Companion;
                        String strA = w4jVar.a.a();
                        k6dVar.getClass();
                        return k6d.a(strA);
                    default:
                        return w4jVar.c.c(w4jVar.b.f());
                }
            }
        }, a5Var);
        final int i2 = 1;
        this.h = mpk.x(new zy7(this) { // from class: v4j
            public final /* synthetic */ w4j F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                w4j w4jVar = this.F;
                switch (i22) {
                    case 0:
                        k6d k6dVar = PlaybackPace.Companion;
                        String strA = w4jVar.a.a();
                        k6dVar.getClass();
                        return k6d.a(strA);
                    default:
                        return w4jVar.c.c(w4jVar.b.f());
                }
            }
        }, a5Var);
    }

    public final PlaybackPace a() {
        return (PlaybackPace) this.g.getValue();
    }

    public final SttSupportedLanguage b() {
        return (SttSupportedLanguage) this.h.getValue();
    }

    public final String c() {
        return ((VoiceSelection) this.f.getValue()).m579unboximpl();
    }

    public final ArrayList d() {
        List<SttVoiceOption> voices = b().getVoices();
        if (!((Boolean) this.c.j.getValue()).booleanValue() || voices.isEmpty()) {
            return dhg.d;
        }
        List<SttVoiceOption> list = voices;
        ArrayList arrayList = dhg.d;
        ArrayList arrayList2 = new ArrayList(x44.y(list, 10));
        for (SttVoiceOption sttVoiceOption : list) {
            sttVoiceOption.getClass();
            arrayList2.add(new dhg(VoiceSelection.m574constructorimpl(sttVoiceOption.getId()), sttVoiceOption.getDisplay_name(), sttVoiceOption.getPreview_url()));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage r7) {
        /*
            r6 = this;
            r7.getClass()
            java.lang.String r0 = r7.getCode()
            com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage r1 = r6.b()
            java.lang.String r1 = r1.getCode()
            boolean r0 = defpackage.x44.r(r0, r1)
            fk0 r1 = r6.b
            r2 = 1
            r1.u(r2)
            java.lang.String r3 = r7.getCode()
            r1.s(r3)
            java.lang.String r3 = defpackage.ysg.a()
            if (r3 != 0) goto L27
            goto L3d
        L27:
            ysg r4 = r6.c
            com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage r5 = r4.b(r3)
            if (r5 != 0) goto L3d
            fk0 r4 = r4.b
            lsc r5 = r4.n
            r5.setValue(r3)
            android.content.SharedPreferences r4 = r4.a
            java.lang.String r5 = "voice_device_locale_seen_unsupported"
            defpackage.kgh.t(r4, r5, r3)
        L3d:
            if (r0 == 0) goto L41
            r6 = 0
            return r6
        L41:
            r1.v(r2)
            lza r0 = new lza
            r1 = 29
            r3 = 0
            r0.<init>(r6, r7, r3, r1)
            r7 = 3
            l45 r1 = r6.e
            defpackage.gb9.D(r1, r3, r3, r0, r7)
            java.util.ArrayList r7 = r6.d()
            if (r7 == 0) goto L5f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L5f
            goto L7c
        L5f:
            java.util.Iterator r0 = r7.iterator()
        L63:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()
            dhg r1 = (defpackage.dhg) r1
            java.lang.String r1 = r1.a
            java.lang.String r3 = r6.c()
            boolean r1 = com.anthropic.claude.bell.api.VoiceSelection.m576equalsimpl0(r1, r3)
            if (r1 == 0) goto L63
            goto L89
        L7c:
            java.lang.Object r7 = defpackage.w44.N0(r7)
            dhg r7 = (defpackage.dhg) r7
            if (r7 == 0) goto L89
            java.lang.String r7 = r7.a
            r6.g(r7)
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4j.e(com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage):boolean");
    }

    public final void f(PlaybackPace playbackPace) {
        playbackPace.getClass();
        String strName = playbackPace.name();
        um1 um1Var = this.a;
        um1Var.d.setValue(strName);
        kgh.t(um1Var.a, "bell_pace", strName);
        gb9.D(this.e, null, null, new k7h(this, playbackPace, (tp4) null, 10), 3);
    }

    public final void g(String str) {
        str.getClass();
        this.a.f(str);
        gb9.D(this.e, null, null, new k7h((Object) this, str, (tp4) null, 11), 3);
    }

    public final void h() {
        ArrayList arrayListD = d();
        if (arrayListD == null || !arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                if (VoiceSelection.m576equalsimpl0(((dhg) it.next()).a, c())) {
                    return;
                }
            }
        }
        dhg dhgVar = (dhg) w44.N0(arrayListD);
        if (dhgVar != null) {
            this.a.f(dhgVar.a);
        }
    }
}
