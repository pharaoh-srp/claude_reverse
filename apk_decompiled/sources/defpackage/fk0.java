package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import com.anthropic.claude.types.strings.AccountId;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fk0 {
    public static final oqb K;
    public final lsc A;
    public final lsc B;
    public final lsc C;
    public final lsc D;
    public final lsc E;
    public final lsc F;
    public final lsc G;
    public final lsc H;
    public final lsc I;
    public final lsc J;
    public final SharedPreferences a;
    public final lsc b = mpk.P(um6.E);
    public final lsc c;
    public final lsc d;
    public final lsc e;
    public final lsc f;
    public final lsc g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final lsc k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final lsc o;
    public final lsc p;
    public final lsc q;
    public final lsc r;
    public final lsc s;
    public final lsc t;
    public final lsc u;
    public final lsc v;
    public final lsc w;
    public final lsc x;
    public final lsc y;
    public final lsc z;

    static {
        b8 b8Var = new b8(21);
        oqb oqbVar = new oqb();
        b8Var.invoke(oqbVar);
        K = oqbVar;
    }

    public fk0(SharedPreferences sharedPreferences) {
        Object objG;
        ek0 ek0VarM;
        Object next;
        this.a = sharedPreferences;
        this.c = sq6.l(sharedPreferences, "app_magic_link_pending_login", false);
        this.d = sq6.l(sharedPreferences, "is_ant", false);
        String string = sharedPreferences.getString("api_base_url", null);
        if (string != null) {
            kw9 kw9Var = ze0.f;
            objG = ez1.G(string);
        } else {
            kw9 kw9Var2 = ze0.f;
            objG = xe0.g;
        }
        this.e = mpk.P(objG);
        this.f = sq6.l(sharedPreferences, "http_logging_verbose", false);
        this.g = sq6.l(sharedPreferences, "jank_overlay_enabled", false);
        this.h = sq6.l(sharedPreferences, "internal_settings_bubble_enabled", false);
        String string2 = sharedPreferences.getString("http_override_country_code", "US");
        string2.getClass();
        this.i = mpk.P(string2);
        this.j = sq6.l(sharedPreferences, "stt_education_prompt_shown", false);
        this.k = mpk.P(sharedPreferences.getString("stt_language", null));
        this.l = sq6.l(sharedPreferences, "stt_language_explicitly_chosen", false);
        this.m = sq6.l(sharedPreferences, "stt_language_pending_push", false);
        this.n = mpk.P(sharedPreferences.getString("voice_device_locale_seen_unsupported", null));
        this.o = sq6.l(sharedPreferences, "voice_unsupported_language_notice_shown", false);
        this.p = sq6.l(sharedPreferences, "voice_added_support_notice_shown", false);
        if (Build.VERSION.SDK_INT >= 31) {
            String string3 = sharedPreferences.getString("theme_color_mode", "system");
            string3.getClass();
            ek0.F.getClass();
            ek0VarM = zp3.m(string3);
        } else {
            ek0VarM = ek0.G;
        }
        this.q = mpk.P(ek0VarM);
        this.r = sq6.l(sharedPreferences, "haptic_feedback_enabled", true);
        this.s = sq6.l(sharedPreferences, "voice_shortcut_dialog_shown", false);
        this.t = sq6.l(sharedPreferences, "has_logged_in_before", false);
        String string4 = sharedPreferences.getString("font_style", "default");
        string4.getClass();
        dk0.F.getClass();
        Iterator<E> it = dk0.J.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            dk0 dk0Var = (dk0) next;
            if (dk0Var.E.equals(string4) || x44.r(dk0Var.name(), string4)) {
                break;
            }
        }
        dk0 dk0Var2 = (dk0) next;
        this.u = mpk.P(dk0Var2 == null ? dk0.G : dk0Var2);
        this.v = mpk.P(this.a.getString("debug_force_upgrade_version", null));
        this.w = sq6.l(this.a, "slow_network_simulation_enabled", false);
        this.x = mpk.P(Integer.valueOf(this.a.getInt("upload_failure_rate", 0)));
        this.y = mpk.P(Integer.valueOf(this.a.getInt("request_failure_rate", 0)));
        this.z = mpk.P(Integer.valueOf(this.a.getInt("request_latency_ms", 0)));
        this.A = mpk.P(this.a.getString("last_subscription_level", null));
        this.B = sq6.l(this.a, "internal_force_okhttp", false);
        this.C = sq6.l(this.a, "record_sse_transcripts", false);
        this.D = mpk.P(this.a.getString("debug_age_signals_override", null));
        this.E = sq6.l(this.a, "has_logged_install_referrer", false);
        this.F = mpk.P(this.a.getString("conway_base_url_override", null));
        this.G = mpk.P(this.a.getString("conway_shell_origin_override", null));
        this.H = sq6.l(this.a, "conway_show_tool_calls", false);
        this.I = sq6.l(this.a, "debug_force_flexible_update", false);
        this.J = sq6.l(this.a, "debug_force_octopus", false);
    }

    public static String d(ze0 ze0Var, String str) {
        return x44.r(ze0Var, xe0.g) ? str : ij0.C(str, "_", isg.n0(ze0Var.a(), "/", "_", false));
    }

    public final void a(String str, boolean z) {
        str.getClass();
        if (z) {
            w(dxf.q0(h(), AccountId.m943boximpl(str)));
        }
        q(str);
    }

    public final ze0 b() {
        return (ze0) this.e.getValue();
    }

    public final boolean c() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }

    public final String e() {
        String string = this.a.getString(d(b(), "app_last_account_id"), null);
        if (string != null) {
            return AccountId.m944constructorimpl(string);
        }
        return null;
    }

    public final String f() {
        return (String) this.k.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final Set h() {
        return (Set) this.b.getValue();
    }

    public final int i() {
        return ((Number) this.y.getValue()).intValue();
    }

    public final int j() {
        return ((Number) this.z.getValue()).intValue();
    }

    public final int k() {
        return ((Number) this.x.getValue()).intValue();
    }

    public final boolean l(String str) {
        str.getClass();
        return !dxf.n0(h(), AccountId.m943boximpl(str)).isEmpty();
    }

    public final boolean m() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final boolean n() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    public final boolean o() {
        return this.a.getBoolean("third_party_analytics_disabled_for_org", false);
    }

    public final void p(String str) {
        Object next;
        str.getClass();
        LinkedHashSet linkedHashSetN0 = dxf.n0(h(), AccountId.m943boximpl(str));
        w(linkedHashSetN0);
        String strE = e();
        if (strE == null ? false : AccountId.m946equalsimpl0(strE, str)) {
            Iterator it = linkedHashSetN0.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    String strM949unboximpl = ((AccountId) next).m949unboximpl();
                    do {
                        Object next2 = it.next();
                        String strM949unboximpl2 = ((AccountId) next2).m949unboximpl();
                        if (strM949unboximpl.compareTo(strM949unboximpl2) > 0) {
                            next = next2;
                            strM949unboximpl = strM949unboximpl2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            AccountId accountId = (AccountId) next;
            q(accountId != null ? accountId.m949unboximpl() : null);
        }
    }

    public final void q(String str) {
        String strD = d(b(), "app_last_account_id");
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (str == null) {
            str = null;
        }
        editorEdit.putString(strD, str);
        editorEdit.apply();
    }

    public final void r(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
        vb7.B(this.a, "app_magic_link_pending_login", z);
    }

    public final void s(String str) {
        this.k.setValue(str);
        kgh.t(this.a, "stt_language", str);
    }

    public final void t(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
        vb7.B(this.a, "stt_education_prompt_shown", z);
    }

    public final void u(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
        vb7.B(this.a, "stt_language_explicitly_chosen", z);
    }

    public final void v(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
        vb7.B(this.a, "stt_language_pending_push", z);
    }

    public final void w(Set set) {
        String strD = d(b(), "app_known_account_ids");
        SharedPreferences.Editor editorEdit = this.a.edit();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AccountId) it.next()).m949unboximpl());
        }
        editorEdit.putStringSet(strD, linkedHashSet);
        editorEdit.apply();
        this.b.setValue(set);
    }
}
