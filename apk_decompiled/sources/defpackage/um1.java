package defpackage;

import android.content.SharedPreferences;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class um1 {
    public final SharedPreferences a;
    public final lsc b;
    public final lsc c;
    public final lsc d;
    public final lsc e;
    public final lsc f;
    public final lsc g;
    public final lsc h = mpk.P(c("bell_gain_max"));
    public final lsc i = mpk.P(c("bell_gain_target_rms"));
    public final lsc j = mpk.P(c("bell_gain_noise_floor_rms"));
    public final lsc k = mpk.P(c("bell_gain_attack"));
    public final lsc l = mpk.P(c("bell_gain_release"));
    public final lsc m;

    public um1(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = sq6.l(sharedPreferences, "bell_server_interrupt", false);
        this.c = mpk.P(sharedPreferences.getString("bell_selection", null));
        this.d = mpk.P(sharedPreferences.getString("bell_pace", null));
        this.e = sq6.l(sharedPreferences, "bell_push_to_talk", false);
        this.f = mpk.P(Boolean.valueOf(sharedPreferences.contains("bell_push_to_talk")));
        this.g = sq6.l(sharedPreferences, "bell_ptt_turn_completed", false);
        this.m = sq6.l(sharedPreferences, "bell_notification_permission_prompt_shown", false);
    }

    public final String a() {
        return (String) this.d.getValue();
    }

    public final String b() {
        return (String) this.c.getValue();
    }

    public final Float c(String str) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences.contains(str)) {
            return Float.valueOf(sharedPreferences.getFloat(str, MTTypesetterKt.kLineSkipLimitMultiplier));
        }
        return null;
    }

    public final void d(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
        this.f.setValue(Boolean.TRUE);
        vb7.B(this.a, "bell_push_to_talk", z);
    }

    public final void e(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
        vb7.B(this.a, "bell_ptt_turn_completed", z);
    }

    public final void f(String str) {
        this.c.setValue(str);
        kgh.t(this.a, "bell_selection", str);
    }

    public final void g(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
        vb7.B(this.a, "bell_notification_permission_prompt_shown", z);
    }

    public final void h(String str, Float f) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (f == null) {
            editorEdit.remove(str);
        } else {
            editorEdit.putFloat(str, f.floatValue());
        }
        editorEdit.apply();
    }
}
